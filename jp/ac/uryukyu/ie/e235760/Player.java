package jp.ac.uryukyu.ie.e235760;

import java.util.ArrayList;

public class Player {
    private int hand;
    private String name;

    public Player(String name){
        this.name = name;
    }

    public int getHand(){
        return hand;
    }

    public String getName(){
        return name;
    }

    public void Draw(Trump decks){
        Trump trump = new Trump();
        hand = trump.shuffleDeck();
        System.out.println("あなたの手札は" + hand);
    }
}

