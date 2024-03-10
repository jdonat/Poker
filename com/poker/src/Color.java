package com.poker;

public class Color {
    private int id;
    private String title;
    private String code;
    private String path;

    public Color(int i){
        this.id = i;
        switch(this.id){
            case 0:
            this.title = "SPADES";
            this.code = "BLACK";
            this.path = "";
            break;
            case 1:
            this.title = "HEARTS";
            this.code = "RED";
            this.path = "";
            break;
            case 2:
            this.title = "CLUBS";
            this.code = "BLACK";
            this.path = "";
            break;
            case 3:
            this.title = "DIAMONDS";
            this.code = "RED";
            this.path = "";
            break;
            default:
            System.out.println("Error in Title enum, Id not in range ! i: "+i);
            break;
        }
    }
    public String getTitle(){
        return this.title;
    }
    public int getId(){
        return this.id;
    }
    public String getCode(){
        return this.code;
    }
    public String getPath(){
        return this.path;
    }
}
