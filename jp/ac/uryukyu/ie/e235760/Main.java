package jp.ac.uryukyu.ie.e235760;

public class Main {
    public static void main(String[] args){
        GameMaster gamemaster = new GameMaster();
        Trump decks = new Trump();
        decks.shuffleDeck();

        Player player = new Player("player");
        Player dealer = new Player("dealer");
        player.Draw(decks);
        dealer.Draw(decks);

        System.out.println(dealer.getName() + "のカードは" + dealer.getHand() + "です。");

        gamemaster.scanner(player, dealer);

        System.out.println("あなたのカードは" + player.getHand() + "でした。");
    }
}