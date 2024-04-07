package com.poker;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.ClassNotFoundException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Objects;
import java.util.Scanner;

import com.poker.User;

import com.poker.Game;
public class Main {

    private void startGame(){

    }
    public static void main(String[] args) throws IOException, ClassNotFoundException, InterruptedException {

        User user;
        Game game;
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("1 for Solo Mode // 2 for Host // 3 for Join // 4 for settings");

        String choice = myObj.nextLine();  // Read user input
        System.out.println(choice);
        if(Objects.equals(choice, "1")) {
            System.out.println("Solo mode");
            game = new Game(new User());
            game.launchSolo();
        }
        if(Objects.equals(choice, "2"))
        {
            System.out.println("Server start");

        }
        if(Objects.equals(choice, "3")){
            System.out.println("Client start");

        }
        if(Objects.equals(choice, "4")){
            System.out.println("Settings menu");

        }
    }
}
