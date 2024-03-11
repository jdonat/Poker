package com.poker.src.client;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String serverAddress = "127.0.0.1"; // Adresse IP du serveur
        int serverPort = 12345;

        try (Socket socket = new Socket(serverAddress, serverPort)) {
            System.out.println("Connecté au serveur.");

            // Envoi d'un message au serveur
            String messageToServer = "Hello, serveur!";
            OutputStream outputStream = socket.getOutputStream();
            outputStream.write(messageToServer.getBytes());
            System.out.println("Message envoyé au serveur : " + messageToServer);

            // Fermeture des flux et de la socket
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

