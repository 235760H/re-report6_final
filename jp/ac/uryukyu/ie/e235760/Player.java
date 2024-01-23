package jp.ac.uryukyu.ie.e235760;

import java.util.ArrayList;

public class Player {
    private ArrayList<Trump> playerHand;

    public Player(){
        this.playerHand = new ArrayList<>();
    }

    public ArrayList<Trump> getHand(){
        return playerHand;
    }

    public void addCard(Trump trump){
        playerHand.add(new Trump());
    } 
}
