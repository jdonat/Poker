package com.poker;

import java.lang.reflect.Array;

public class GameMode {
    private String name;
    private String[] names = {"Normal", "KO"};
    // duration is in MINUTES
    private int duration, potLimit, speed, initStack, initBlind;
    public GameMode(int idName, int tim, int potLmt, int spd, int inStack, int inBlind){
        if(idName>-1&&idName<this.names.length){
            this.name = this.names[idName];
        }
        else {
            Logger.Log("id Mode name Range not correct : "+Integer.toString(idName));
        }
        if(tim>-1){
            this.duration = tim;
        }
        else {
            Logger.Log("duration (in minutes) not correct : "+Integer.toString(tim));
        }
        if(potLmt>-1){
            this.potLimit = potLmt;
        }
        else {
            Logger.Log("potLimit (in minutes) not correct : "+Integer.toString(potLmt));
        }
        if(spd>-1){
            this.speed = spd;
        }
        else {
            Logger.Log("speed not correct : "+Integer.toString(spd));
        }
        if(inStack>-1){
            this.initStack = inStack;
        }
        else {
            Logger.Log("initStack (in minutes) not correct : "+Integer.toString(inStack));
        }
        if(inBlind>-1){
            this.initBlind = inBlind;
        }
        else {
            Logger.Log("initBlind not correct : "+Integer.toString(inBlind));
        }
    }
    public int getInitStack(){
        return this.initStack;
    }
}
