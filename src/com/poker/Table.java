package com.poker;
import java.util.ArrayList;

public class Table {
    private Deck deck;
    private ArrayList<Player> players;
    public Table(int PlayerNb, ArrayList<String> playersName){
        deck = new Deck();
        players = new ArrayList<Player>();
        int i = 0;
        for(String name : playersName){
            players.add(new Player(i, name, true, 3000));
            i++;
        }
    }
}
