package com.poker;

public class Player {
    private int id;
    private String name;
    private boolean isHuman;
    private double stack;
    private int tableId;
    public Player(int i, String n, boolean isH, double m){
        this.id = i;
        this.name = n;
        this.isHuman = isH;
        this.stack = m;
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
