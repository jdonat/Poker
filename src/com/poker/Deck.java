package com.poker;
import java.util.ArrayList;
import java.util.Collections;

    
public class Deck {
    private ArrayList<Card> cardsdef, cards;
    private int nextCardId;
    public Deck(){
        
        this.cardsdef= new ArrayList<Card>();
        this.cards= new ArrayList<Card>();
        for(int i=0; i<4; i++){
            for(int j=0; j<13; j++){
                this.cardsdef.add(new Card(i*13+j, i, j));
                this.cards.add(new Card(i*13+j, i, j));
            }
            Collections.shuffle(this.cards);
        }
    }
    public void Shuffle(){
        Collections.shuffle(this.cards);
        this.nextCardId = 0;
    }
    public int getNextCardId(){
        return this.nextCardId;
    }
    public void setNextCardId(){
        this.nextCardId++;
    }
}
