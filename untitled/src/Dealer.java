import java.util.ArrayList;
import java.util.Collections;

public class Dealer {

    private ArrayList<Card> cards;
     private ArrayList<Player> players;
    private Deck deck;
    private final int MAX_DEAL = 13;
    private ActivePlayer activePlayer;
    private AIOne aiOne;
    private AITwo aiTwo;
    private AIThree aiThree;
    private Player player;

    Card startCard = new Card(Suit.CLUB,SuitValue.TWO);


    public Dealer() {
        deck = new Deck(Suit.HEART, SuitValue.TWO);
        cards = deck.createDeck();
        players = new ArrayList<>();
        activePlayer=new ActivePlayer("a");
        player=new Player();

    }

//    public void addPlayer(Player player){
//        players.add(player);
//    }


    public void addPlayer(Player player1,Player player2, Player player3, Player player4){
        players.add(0,player1);
        players.add(1,player2);
        players.add(2,player3);
        players.add(3,player4);
    }





        public void dealCards(Player p1, Player p2, Player p3, Player p4) {
        deck.shuffleDeck();

        for (int i = 0; i < MAX_DEAL; i++) {
            for (Player player : players) {
                if (!cards.isEmpty()) {
                    Card currentCard = cards.get(0);
                    ArrayList<Card> playerHand = player.getCards();
                    playerHand.add(currentCard);
                    cards.remove(0);

                }
            }
        }
    }

//to double check players list
//public void checkPlayer() {
//
//    System.out.println("Players in the game:");
//    for (Player player : players) {
//        System.out.println(player.getClass().getSimpleName());
//    }
//
//
//    boolean activePlayerExists = false;
//    for (Player player : players) {
//        if (player instanceof ActivePlayer) {
//            activePlayerExists = true;
//            break;
//        }
//    }
//
//    if (activePlayerExists) {
//        System.out.println("ActivePlayer is part of the game.");
//    } else {
//        System.out.println("ActivePlayer is NOT part of the game.");
//    }
//}









    public boolean isPlayerTurn (){
        boolean isPlayerTurn = true;

        Player playerOne=  players.get(0);


        return isPlayerTurn;
    }



//    public Player nextPlayer (ArrayList<Player> players){
//
//          Player playerOne=  players.get(0);
//        Player playerTwo=  players.get(1);
//
//        for (Card cards : activePlayer.getCards()){
//            if (activePlayer.getCards().equals(player.startCard)){
//
//            }
//        }
//
//
//
//        return ;
//
//    }
//

        public void  startPlay(Player player) {

            char smileyFace = '\u263A';

                        player.addCardMiddle(startCard);
                        player.getCards().remove(startCard);
                        System.out.println("Removed card in player's hand: " + startCard.getSuitValue() + " of " + startCard.getSuits().getUnicode());
                        System.out.println(" player.getName()" + "'s hand after removing TWO of CLUB is: ");
                        player.displayHand();

                    }






//    public boolean  startPlay() {
//
//        boolean hasStartCard = false;
//
//        char smileyFace = '\u263A';
//
//        for (Player player : players) {
//
//
//            for (int i = 0; i < 13; i++) {
//
//                if (player.getCards().isEmpty()) {
//                    System.out.println("no cards in hand to play with");
//                } else if (player.getCards().contains(startCard)) {
//
//                    System.out.println("the player " + "player.getName()" + " has the card " + " " + startCard.getSuitValue() + " of " + startCard.getSuits().getUnicode() + " and can start the game " + smileyFace);
//
//                    hasStartCard = true;
//
//
//                }
//
//            }
//
//        }
//        return hasStartCard;
//    }



//    public Player nextPlayer (){
//
//        for (Player player :players){
//            if (player.getCards().contains(startCard)){
//
//
//            }
//        }
//
//
//
//        return ;
//
//    }
//

    public void nextCard(Player player){
        String hi = "Hiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii";
        System.out.println(hi);

        for (Card cards: player.getCards()){
            System.out.println("Card suit: " + cards.getSuits());
            if (cards.getSuits()==Suit.HEART){
                System.out.println("active player has heart");
                //return Suit.HEART;

            }
            if (cards.getSuits().getUnicode()==(Suit.CLUB.getUnicode())){
                System.out.println("active player has club");
                //return Suit.CLUB;

            }
            if (cards.getSuits().getUnicode()==(Suit.DIAMOND.getUnicode())){
                System.out.println("active player has diamond");
                //return Suit.DIAMOND;

            }
            if (cards.getSuits().getUnicode()==(Suit.SPADE.getUnicode())){
                System.out.println("active player has spade");
                // return Suit.SPADE;

            }
        }


    }


    public void nextPlayer () {
        for (int i = 0; i < players.size(); i++) {
            Player p0 = players.get(0);
            Player p1 = players.get(1);
            Player p2 = players.get(2);
            Player p3 = players.get(3);
            // if (players.get(0).getCards().contains(startCard)){
            if (p0.getCards().contains(startCard)) {
                startPlay(p0);
                nextCard(p3);

            } else if (p1.getCards().contains(startCard)) {
                startPlay(p1);
                nextCard(p0);
            } else if (p2.getCards().contains(startCard)) {
                startPlay(p2);
                nextCard(p1);
            } else if (p3.getCards().contains(startCard)) {
                startPlay(p3);
                nextCard(p2);
            }


        }
    }













}















































