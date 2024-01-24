package jp.ac.uryukyu.ie.e235760;

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
    }
}

