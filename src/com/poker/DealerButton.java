package com.poker;

public class DealerButton {

    private int playerId, playerNb;
    public DealerButton(int plId, int plNb){
        this.playerId = plId;
        this.playerNb = plNb;
    }
    public void passDealerButton(){
        if(this.playerId == this.playerNb - 1)
            this.playerId = 0;
        else
            this.playerId++;
    }
    public int getBlindId(int blndState)
    {
        int resp = -1;
        switch(blndState){
            case 0:
                if(this.playerId == this.playerNb - 2)
                    resp = 0;
                else
                    resp = this.playerId+1;
                break;
            case 1:
                if(this.playerId == this.playerNb - 3)
                    resp = 0;
                else
                    resp = this.playerId+2;
                break;
            default:
                Logger.Log("Erreur DealerButton.getBlindId : blndState inconnu ");
                break;
        }
        return resp;
    }
}
