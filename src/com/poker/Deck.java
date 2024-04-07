package com.poker;
import java.util.ArrayList;
import java.util.Collections;

    
public class Deck {
    private ArrayList<Card> cardsdef, cardsIn, cardsOut;
    private int nextCardId;
    public Deck(){
        
        this.cardsdef= new ArrayList<Card>();
        this.cardsIn= new ArrayList<Card>();
        this.cardsOut= new ArrayList<Card>();
        for(int i=0; i<4; i++){
            for(int j=0; j<13; j++){
                this.cardsdef.add(new Card(i*13+j, i, j));
                this.cardsIn.add(new Card(i*13+j, i, j));
            }
        }
        Collections.shuffle(this.cardsIn);
        this.nextCardId = 0;
    }
    public void Shuffle(){
        this.cardsOut = new ArrayList<Card>();
        this.cardsIn = this.cardsdef;
        Collections.shuffle(this.cardsIn);
        this.nextCardId = 0;
    }
    public int getNextCardId(){
        return this.nextCardId;
    }
    public void setNextCardId(){
        this.nextCardId++;
    }
    public Card getNextCard(int place){
        Card c = this.cardsIn.get(this.nextCardId);

        c.setOut(place);
        this.cardsOut.add(c);
        this.cardsIn.remove(this.nextCardId);

        return c;
    }
}
