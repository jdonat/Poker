package com.poker;

import java.util.ArrayList;

public class Player {
    private int id;
    private String name;
    private boolean isHuman;
    private double stack;
    private int tableId;
    private ArrayList<Card> cards;
    public Player(int i, String n, boolean isH, double m){
        this.id = i;
        this.name = n;
        this.isHuman = isH;
        this.stack = m;
        this.cards = new ArrayList<Card>();
    }
    public void takeCard(Card c){
        this.cards.add(c);
    }
    public void fold(){
        this.cards = new ArrayList<Card>();
    }
    public String getCardName(int id){
        return this.cards.get(id).getName();
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public boolean getIsHuman(){
        return this.isHuman;
    }
    public double getStack(){
        return this.stack;
    }
    public void setTableId(int id){
        this.tableId = id;
    }
    public int getTableId(){
        return this.tableId;
    }
}
