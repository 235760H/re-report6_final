package jp.ac.uryukyu.ie.e235760;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Trump decks = new Trump();
        decks.shuffleDeck();

        Player player = new Player();
        Dealer dealer = new Dealer();

        
        player.addCard(decks);
        dealer.add(decks.get(1));
        player.add(decks.get(2));
        dealer.add(decks.get(3));
        System.out.println("あなたの1枚目は" + toNumber(player[0]));
        System.out.println("ディーラーの1枚目は" + toNumber(dealer.get(0)));
        System.out.println("あなたの2枚目は" + toNumber(player.get(1)));
        System.out.println("ディーラーの2枚目は" + toNumber(dealer.get(1)));
        int playertotal = toNumber(player.get(0)) + toNumber(player.get(1));
        int dealertotal = toNumber(dealer.get(0)) + toNumber(dealer.get(1));
        System.out.println("現在のあなたの合計は" + playertotal + "です");
        System.out.println("現在のディーラーの合計は" + dealertotal + "です");
    }


    public static int toNumber(int cardNumber){
        int number = cardNumber % 13;
        if (number == 0){
            number = 13;
        }
        if(number == 11||number == 12||number == 13){
            number = 10;
        }
        return number;
    }
}