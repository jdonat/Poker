package com.poker;
import com.poker.DefaultConfig;
import com.poker.Logger;
public class User {
    private String name;
    public User(){
        this.name = DefaultConfig.playerName;
        Logger.Log("User logged as "+this.name);
    }
    public String getName(){
        return this.name;
    }
    public void setName(String nm){
        this.name = nm;
    }
}
