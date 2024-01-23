package jp.ac.uryukyu.ie.e235760;

import java.util.ArrayList;
import java.util.Collections;

public class Trump {
    private int number;

    ArrayList<Integer> deck = new ArrayList<>(52);


    public void shuffleDeck(){
        for(int i = 1;i <= 52; i++){
            deck.add(i);
        }

        Collections.shuffle(deck);
        /*for (int i = 0;i<deck.size();i++){
            System.out.println(deck.get(i));
        }*/
    }


    public int getNumber(){
        return number;
    }
}
