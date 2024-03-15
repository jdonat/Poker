package com.poker;


public class CardValue {
    private String title;
    private int id;
    private String letter;
    public CardValue(int i){
        this.id = i;
        switch(this.id){
            case 0:
            this.title ="ACE";
            this.letter = "A";
            break;
            case 1:
            this.title = "TWO";
            this.letter = "2";
            break;
            case 2:
            this.title = "THREE";
            this.letter = "3";
            break;
            case 3:                    
            this.title = "FOUR";
            this.letter = "4";
            break;
            case 4:
            this.title = "FIVE";
            this.letter = "5";
            break;
            case 5:
            this.title = "SIX";
            this.letter = "6";
            break;
            case 6:
            this.title = "SEVEN";
            this.letter = "7";
            break;
            case 7:                    
            this.title = "EIGHT";
            this.letter = "8";
            break;
            case 8:
            this.title = "NINE";
            this.letter = "9";
            break;
            case 9:
            this.title = "TEN";
            this.letter = "10";
            break;
            case 10:
            this.title = "JACK";
            this.letter = "J";
            break;
            case 11:                    
            this.title = "QUEEN";
            this.letter = "Q";
            break;
            case 12:                    
            this.title = "KING";
            this.letter = "K";
            break;
            default:
            this.title = "UNDEFINED";
            this.letter = "UND";
            break;
        }
    }
    public String getTitle(){
        return this.title;
    }
    public int getId(){
        return this.id;
    }
    public String getLetter(){
        return this.letter;
    }
}
