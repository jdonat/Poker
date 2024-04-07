package com.poker;

public class Dealer extends Thread {

    private Table table;
    public Dealer(Table tb){
        this.table = tb;
    }


    public void run() {
        Logger.Log("Table "+Integer.toString(this.table.getId())+" is running");
        while(true){

        }
    }
}
