package jp.ac.uryukyu.ie.e235760;

import java.util.ArrayList;

public class Dealer {
    private ArrayList<Trump> dealerHand = new ArrayList<>();

    public ArrayList<Trump> getHand(){
        return dealerHand;
    }

    public void addCard(Trump decks){
        dealerHand.add(decks);
    }
}
