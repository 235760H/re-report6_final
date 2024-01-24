package jp.ac.uryukyu.ie.e235760;

public class Main {
    public static void main(String[] args){
        //Player player1 = new Player(decks)
        GameMaster gamemaster = new GameMaster();
        Trump decks = new Trump();
        decks.shuffleDeck();

        //Dealer parent = new Dealer();
        //parent.addCard(decks);

        Player child = new Player("child");
        Player dealer = new Player("dealer");
        child.Draw(decks);
        dealer.Draw(decks);

        gamemaster.scanner(child, dealer);
    }
}