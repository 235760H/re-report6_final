package jp.ac.uryukyu.ie.e235760;

import java.util.ArrayList;
import java.util.Collections;

public class Trump {
    private int number;
    private int card_index = 0;

    ArrayList<Integer> deck = new ArrayList<>(52);


    public int shuffleDeck(){
        for(int i = 1;i <= 52; i++){
            deck.add(i);
        }

        Collections.shuffle(deck);
        number = deck.get(0) % 13;
        if (number == 0){
            number = 13;
        }
        //System.out.println("あなたが引いたのは" + number);
        //System.out.println(number);
        /*for (int i = 0;i<deck.size();i++){
            System.out.println(deck.get(i));
        }*/
        return number;
    }

    public Card getNumber(){
        Card card_num = new Card();
        int card_no = 0;

        card_no = deck.get(card_index);
        card_index++;
        return card_num;
    }
}
