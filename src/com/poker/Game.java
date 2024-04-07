package com.poker;

import java.util.ArrayList;
public class Game {
    private Server server;
    private Client client;
    private GameConfig gameCfg;
    private User user;
    private ArrayList<Player> playerList;
    private ArrayList<Table> tableList;
    private Tournament tournament;

    public Game(User user){
        this.user = user;
        this.gameCfg = new GameConfig();
        this.playerList = new ArrayList<>();
    }
    public int launchServer(){
        this.server = new Server();
        return 0;
    }
    public int launchClient(){
        this.client = new Client();
        return 0;
    }
    private void createPlayerList(){
        for(int i=0; i<this.gameCfg.getPlNb(); i++){
            if(i==0)
                this.playerList.add(new Player(0, this.user.getName(), true, this.gameCfg.getInitStack()));
            else
                this.playerList.add(new Player(i, DefaultConfig.playerName, false, this.gameCfg.getInitStack()));
        }
    }
    public int launchSolo(){
        this.createPlayerList();
        this.tournament = new Tournament(this.playerList, this.gameCfg);
        this.tournament.start();
        return 0;
    }

}
