package com.poker;
import java.util.ArrayList;

public class Table{
    private int id;
    private Deck deck;
    private ArrayList<Player> players;
    private int plNb;
    private int status;
    public Table(int ind, ArrayList<Player> players){
        this.id = ind;
        this.deck = new Deck();
        this.players = players;
        this.plNb = players.size();
        this.status = 1;
    }
    public int getId(){
        return this.id;
    }

}
