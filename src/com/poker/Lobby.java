package com.poker;

public class Lobby {
    private int id;
    private String IpServer;
  private int[] playersIdsList;
  
    
    
    public Lobby(int i, String ipS, int[] players){
        this.id = i;
        this.IpServer = ipS;
        this.playersIdsList = players;
    }
    public int getId(){
        return this.id;
    }
    public String getIpServer(){
        return this.IpServer;
    }
    public int[] getPlayersIdsList(){
        return this.playersIdsList;
    }
}
