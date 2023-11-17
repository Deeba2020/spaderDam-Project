import java.util.ArrayList;

public class Dealer {

    private ArrayList<Card> cards;
     private ArrayList<Player> players;
    private Deck deck;
    private final int MAX_DEAL = 13;
    private ActivePlayer activePlayer;
    private AIOne aiOne;
    private AITwo aiTwo;
    private AIThree aiThree;


    public Dealer() {
        deck = new Deck(Suit.HEART, SuitValue.TWO);
        cards = deck.createDeck();
        players = new ArrayList<>();

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

    public boolean isPlayerTurn (){
        boolean isPlayerTurn = true;

        Player playerOne=  players.get(0);


        return isPlayerTurn;
    }

    public Player nextPlayer (ArrayList<Player> players){

          Player playerOne=  players.get(0);
        Player playerTwo=  players.get(1);


          if(playerOne.getCards().equals(playerOne.startCard)){
              playerTwo.addCardMiddle();
          }

          int a;


    }







}















































