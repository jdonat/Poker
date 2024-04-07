package com.poker;

public class Dealer extends Thread {

    private Table table;
    private int turn;
    public Dealer(Table tb){
        this.table = tb;
        this.turn = 1;
    }

    private void dealCards(){
        for(int i=1; i<3; i++){
            for(Player pl : this.table.getPlayerList()){
                this.table.distributeNextCard(pl.getId());
            }
        }

    }
    private void displayCards(){
        for(Player pl : this.table.getPlayerList())
        {
            Logger.Log("Player #"+Integer.toString(pl.getId())+" has a "+pl.getCardName(0)+" and a "+pl.getCardName(1));
        }
    }
    private int playTurn(int t){

        return 1;
    }
    private void playRound(){
        this.dealCards();
        this.displayCards();
        for(int i=1; i<5; i++)
        {
            int ret = playTurn(i);
            if(ret == 0)
                break;
        }
    }
    public void run() {
        Logger.Log("Table "+Integer.toString(this.table.getId())+" is running");

        playRound();

    }
}
