// Q35: TCP Client-Server Chat
// Objective: Use Java sockets for TCP communication.
// Task: Implement a simple TCP chat system.
// Instructions:
// - Create a ServerSocket that listens for connections.
// - Accept client connections and use InputStream and OutputStream for two-way communication.
// - Run server and client in different terminals.

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class Q35_TCPChat {

    public static void main(String[] args) {
        new Thread(Q35_TCPChat::startServer).start();
        new Thread(Q35_TCPChat::startClient).start();
    }

    private static void startServer() {
        try (ServerSocket serverSocket = new ServerSocket(12345)) {
            System.out.println("Server started, waiting for client...");
            Socket clientSocket = serverSocket.accept();
            System.out.println("Client connected.");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);

            Thread readThread = new Thread(() -> {
                try {
                    String line;
                    while ((line = in.readLine()) != null) {
                        System.out.println("Client: " + line);
                    }
                } catch (IOException e) {
                    System.out.println("Server read error: " + e.getMessage());
                }
            });
            readThread.start();

            while (true) {
                String input = scanner.nextLine();
                out.println(input);
                if ("exit".equalsIgnoreCase(input)) break;
            }

            clientSocket.close();
            System.out.println("Server closed.");
        } catch (IOException e) {
            System.out.println("Server error: " + e.getMessage());
        }
    }

    private static void startClient() {
        try (Socket socket = new Socket("localhost", 12345)) {
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
            Scanner scanner = new Scanner(System.in);

            Thread readThread = new Thread(() -> {
                try {
                    String line;
                    while ((line = in.readLine()) != null) {
                        System.out.println("Server: " + line);
                    }
                } catch (IOException e) {
                    System.out.println("Client read error: " + e.getMessage());
                }
            });
            readThread.start();

            while (true) {
                String input = scanner.nextLine();
                out.println(input);
                if ("exit".equalsIgnoreCase(input)) break;
            }
            System.out.println("Client closed.");
        } catch (IOException e) {
            System.out.println("Client error: " + e.getMessage());
        }
    }
}
