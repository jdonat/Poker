package com.poker.src.server;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        int port = 12345;

        try (ServerSocket serverSocket = new ServerSocket(port)) {
            System.out.println("Serveur en attente de connexions sur le port " + port);

            // Attente d'une connexion
            Socket clientSocket = serverSocket.accept();
            System.out.println("Connexion établie avec le client.");

            // Lecture du message du client
            InputStream inputStream = clientSocket.getInputStream();
            byte[] buffer = new byte[1024];
            int bytesRead = inputStream.read(buffer);

            String messageFromClient = new String(buffer, 0, bytesRead);
            System.out.println("Message reçu du client : " + messageFromClient);

            // Fermeture des flux et sockets
            inputStream.close();
            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

