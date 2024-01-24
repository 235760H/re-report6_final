package jp.ac.uryukyu.ie.e235760;

import java.util.Scanner;

public class GameMaster {
    /*public void judge(Player player1,  Player player2){
        Trump trump = new Trump();
        if(player1.getHand() > player2.getHand()){
            System.out.println(player1.getName() + "player1の勝ちです。");
        }else{
            System.out.println(player2.getName() + "player2の勝ちです。");
        }
    }*/

    public boolean scanner(Player player1,  Player player2){
        Scanner scanner = new Scanner(System.in);
        System.out.println("highかlowを選んでください。");
        String input_text = scanner.nextLine();
        System.out.println(input_text + "が入力されました。");
        scanner.close();
        if (input_text.equals("high")) {
            if(player1.getHand() > player2.getHand()){
                System.out.println("あなたの勝ちです。");
            }else{
                System.out.println(player2.getName() + "の勝ちです。");
            }
        }else if (input_text.equals("low")) {
            if (player1.getHand() < player2.getHand()) {
                System.out.println("あなたの勝ちです。");
            }else{
                System.out.println(player2.getName() + "の勝ちです。");
            }
        }else{
            System.out.println("highかlowを選んでください。");
        }
        return true;
    }
}
