package com.poker;
import com.poker.GameMode;
import com.poker.DefaultConfig;

import java.util.ArrayList;

public class GameConfig {
    private int playerNb;
    private GameMode mode;
    private ArrayList<Integer> playerIdList;

    public GameConfig(){
        this.playerNb = DefaultConfig.playerNb;
        this.mode = new GameMode(DefaultConfig.playerModeId, DefaultConfig.gameDuration, DefaultConfig.gamePotLimit, DefaultConfig.gameSpeed, DefaultConfig.gameInitStack, DefaultConfig.gameInitBlind);
    }
    public int getPlNb(){
        return this.playerNb;
    }
    public int getInitStack(){
        return this.mode.getInitStack();
    }
}
