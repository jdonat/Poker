package com.poker;

import com.poker.DefaultConfig;
import java.util.ArrayList;

public class Tournament extends Thread{
    private ArrayList<Table> tableList;
    private ArrayList<Player> playerList;
    private GameConfig config;
    private int playerPerTable;
    private ArrayList<Thread> dealerList;
    public Tournament(ArrayList<Player> plList, GameConfig gmCfg){
        this.playerList = plList;
        this.config = gmCfg;
        this.playerPerTable = DefaultConfig.playerNb;
        this.tableList = new ArrayList<Table>();
        this.dealerList = new ArrayList<Thread>();
    }
    public void startTournament(){
        int tableNb = 1;
        int playerCnt=-1;
        int tableCnt = 1;
        boolean lastOfTable = false;
        ArrayList<Player> plLst = new ArrayList<Player>();
        for(Player pl : this.playerList){
            playerCnt++;
            if(lastOfTable){
                tableCnt++;
                lastOfTable = !lastOfTable;

            }
            pl.setTableId(tableCnt);
            plLst.add(pl);
            if(playerCnt % this.playerPerTable == (this.playerPerTable-1)){
                this.tableList.add(new Table(tableCnt, plLst));
                plLst = new ArrayList<Player>();
                lastOfTable = true;
            }
        }
        Logger.Log("Tournament start !");
        Logger.Log(Integer.toString(playerCnt)+" players on "+Integer.toString(tableCnt)+" tables : "+Integer.toString(this.playerPerTable)+" players per table");
    }
    public void Play(){
        for(Table tb : this.tableList){
            Dealer deal = new Dealer(tb);
            this.dealerList.add(deal);
            deal.start();
        }
    }
    public void run() {
        this.startTournament();
        this.Play();
    }
}
