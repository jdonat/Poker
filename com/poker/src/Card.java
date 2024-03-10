package com.poker;

public class Card {
    private CardValue value;
    private Color color;
    private int id;
    private String visibility;
    public Card(int i, int c, int v){
        this.id =i;
        this.color = new Color(c);
        this.value = new CardValue(v);
        this.visibility = "false";
    }
    public int getId(){
        return this.id;
    }
    public Color getColor(){
        return this.color;
    }
    public CardValue getValue(){
        return this.value;
    }
    public String getVisibility(){
        return this.visibility;
    }
    public void setVisibility(String str){
        this.visibility = str;
    }
}
