package com.poker;

public class Player {
    private int id;
    private String name;
    private boolean isHuman;
    private double money;
    public Player(int i, String n, boolean isH, double m){
        this.id = i;
        this.name = n;
        this.isHuman = isH;
        this.money = m;
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
    public double getMoney(){
        return this.money;
    }
}
