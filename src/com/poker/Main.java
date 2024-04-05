package com.poker;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;
import java.util.Scanner;
import com.poker.Client;
import com.poker.Server;
public class Main {

    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {
        Server server;
        Client client;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("1 for Host // 2 for Join // 3 for settings");

        String choice = myObj.nextLine();  // Read user input
        System.out.println(choice);
        if(Objects.equals(choice, "1"))
        {
            System.out.println("Server start");
            server = new Server();
            server.main();
        }
        if(Objects.equals(choice, "2")){
            System.out.println("Client start");
            client = new Client();
            client.main();
        }
    }
}
