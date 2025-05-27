// Question 1: Portal Initialization
console.log("Launching the Community Events Platform");
document.addEventListener("DOMContentLoaded", () => {
  console.log("DOM content fully parsed");
  alert("Greetings! Explore exciting events around you.");
});

// Question 2 & 6: Event Object & Array Initialization
function CommunityEvent(title, schedule, availableSeats, type, identifier) {
  this.title = title;
  this.schedule = new Date(schedule);
  this.availableSeats = availableSeats;
  this.type = type;
  this.identifier = identifier;
}
CommunityEvent.prototype.isBookable = function () {
  return this.availableSeats > 0 && this.schedule > new Date();
};

const eventList = [
  new CommunityEvent("Jazz Concert", "2025-06-15", 50, "Concert", 1),
  new CommunityEvent("Cupcake Class", "2025-07-10", 20, "Workshop", 2),
  new CommunityEvent("Gallery Expo", "2025-05-20", 0, "Exhibition", 3),
  new CommunityEvent("AI Seminar", "2025-04-10", 30, "Seminar", 4),
];

// Question 5: Log Object Structure
console.log("Sample Event Details:", Object.entries(eventList[0]));

// Question 9 & 12: Mocked Backend Simulation
const apiSimulator = {
  retrieveEvents: () => new Promise((resolve, reject) => {
    console.log("Initiating mock API event fetch...");
    setTimeout(() => {
      eventList.length ? resolve([...eventList]) : reject("No events found");
    }, 1000);
  }),
  submitFormData: (user) => new Promise((resolve, reject) => {
    console.log("Sending user data:", user);
    setTimeout(() => {
      user.name && user.email
        ? resolve({ status: "ok", info: "Registration successful" })
        : reject("User data incomplete");
    }, 1000);
  }),
};

// Question 4: Closure for Counting
const createCounter = () => {
  let count = 0;
  return () => {
    count++;
    console.log(`Registrations so far: ${count}`);
    return count;
  };
};
const registrationTracker = createCounter();

// Question 4 & 10: Utility Functions with Defaults
const addNewEvent = (title, schedule, availableSeats = 30, type, identifier) => {
  eventList.push(new CommunityEvent(title, schedule, availableSeats, type, identifier));
  displayEvents();
};

const enrollUser = (eventId, user) => {
  try {
    console.log(`User enrolling for event ID: ${eventId}`, user);
    const event = eventList.find(e => e.identifier === eventId);
    if (!event) throw new Error("Event does not exist");
    if (!event.isBookable()) throw new Error("Event is unavailable");

    event.availableSeats--;
    const total = registrationTracker();
    console.log(`Enrolled in ${event.title}. Total so far: ${total}`);
    return true;
  } catch (err) {
    console.error("Enrollment Failed:", err.message);
    return false;
  }
};

const filterByType = (type, formatter) => {
  return eventList
    .filter(ev => ev.type.toLowerCase() === type.toLowerCase() && ev.isBookable())
    .map(formatter);
};

// Question 7: DOM UI Update
const displayEvents = () => {
  const eventTable = document.querySelector("table");
  eventTable.innerHTML = "<caption>Active Community Programs</caption>";

  eventList.forEach(ev => {
    if (ev.isBookable()) {
      const tr = document.createElement("tr");
      tr.innerHTML = `
        <td>
          <img src="https://via.placeholder.com/100" alt="${ev.title}" class="event-thumbnail">
          ${ev.title} - ${ev.schedule.toDateString()} (${ev.availableSeats} left)
          <button class="join-button" data-id="${ev.identifier}">Join Now</button>
        </td>`;
      eventTable.appendChild(tr);
    }
  });

  // Question 14: Register Button with jQuery Effects
  $(".join-button").off("click").on("click", function () {
    const selectedId = parseInt($(this).data("id"));
    const success = enrollUser(selectedId, {});
    if (success) {
      $(this).closest("tr").fadeOut(500, displayEvents);
    }
  });
};

// Question 9: Spinner Loader and Event Fetching
const loadEvents = () => {
  $("#spinner").fadeIn(300);
  apiSimulator
    .retrieveEvents()
    .then(fetched => {
      console.log("Loaded Events:", fetched);
      eventList.length = 0;
      eventList.push(...fetched);
      displayEvents();
    })
    .catch(err => {
      console.error("API Error:", err);
      $("#status").text("Could not retrieve events.").css("color", "red");
    })
    .finally(() => {
      $("#spinner").fadeOut(300);
    });
};

// Question 11: Registration Form Logic
const handleSubmission = (e) => {
  e.preventDefault();
  console.log("Processing form...");
  const form = e.target;
  const { name, email, eventType } = form.elements;

  if (!name.value || !email.value || !eventType.value) {
    $("#status").text("All fields must be filled.").css("color", "red");
    return;
  }

  const targetEvent = eventList.find(
    ev => ev.type === eventType.value && ev.isBookable()
  );
  if (!targetEvent) {
    $("#status").text("No suitable events in selected category.").css("color", "red");
    return;
  }

  $("#spinner").fadeIn(300);
  apiSimulator
    .submitFormData({ name: name.value, email: email.value })
    .then(res => {
      console.log("API Response:", res);
      const result = enrollUser(targetEvent.identifier, { name: name.value, email: email.value });
      $("#status").text(
        result ? `Enrolled in ${targetEvent.title}` : "Try enrolling in another event."
      ).css("color", result ? "green" : "red");
    })
    .catch(err => {
      console.error("Form submission error:", err);
      $("#status").text("Form submission failed.").css("color", "red");
    })
    .finally(() => {
      $("#spinner").fadeOut(300);
    });
};

// Question 11: Reset Form and Preferences
const resetForm = () => {
  console.log("Resetting form state");
  document.querySelector("form").reset();
  $("#charCounter").text("Characters: 0");
  $("#status").text("");
};

// Question 8: Real-time Input Handlers
document.querySelector("form").addEventListener("submit", handleSubmission);
document.getElementById("message").addEventListener("input", (e) => {
  $("#charCounter").text(`Characters: ${e.target.value.length}`);
});

// Question 8: Instant Name-Based Search
document.getElementById("name").addEventListener("keydown", (e) => {
  if (e.key === "Enter") {
    const query = e.target.value.toLowerCase();
    const matches = eventList.filter(ev =>
      ev.title.toLowerCase().includes(query) && ev.isBookable()
    );
    console.log("Search Matches:", matches);
    $("#status").text(`Found ${matches.length} events.`).css("color", "blue");
  }
});

// Question 10: Dropdown Filter by Type
document.getElementById("eventType").addEventListener("change", (e) => {
  const selectedType = e.target.value;
  const formatEvent = ({ title, schedule, availableSeats }) =>
    `${title} on ${schedule.toDateString()} (Available: ${availableSeats})`;
  const filtered = filterByType(selectedType, formatEvent);
  console.log("Filtered Events:", ...filtered);
});

// Question 14: React Benefit
console.log("Why React? Its modular components simplify UI updates and maintainable code.");

// Initial Rendering
loadEvents();
