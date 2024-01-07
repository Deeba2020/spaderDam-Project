import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public  class Trick {

    ////heartBroken() should be implemented here

    //following should be implemented inorder to make the basic game the place/class of methods needs to be decided
    //countPenaltyScore() which is penalty score per user per trick(1st trick, 2n trick.......)
    //totalPenaltyScore() which is final penalty score per user after 13 tricks
    //winner() per round after 13 tricks
    //winner() final winner when one of players reaches 100 points and also game should end
    //suit() which suit to choose to play with need to be implemented for AI and active
    //winPileCard() method for the players to win the pile card
    //condition in the main to allow user to only use alphabet for the name
    //GameEnd() when total score of one of user reaches 100 points

    AIPlayer aiWinner=null;
    ActivePlayer activeWinner=null;
    private final int MAX_TRICK = 13;

    private ArrayList<Player>players;

    private final Card START_CARD;
    private final char SMILEY_FACE = '\u263A';
   // Queue<Card> pileCards;
    private Dealer dealer;
    private static int trickNo=0;


   private static   String maxPlayerName="";
   String maxRankDeck="" ;
    String maxSuitDeck ="";
   // String keyName ;
   private Suit leadingSuit;






    public Trick (Dealer dealer){
        START_CARD =new Card(Suit.CLUB,SuitValue.TWO);
        players=this.getPlayers();
      //  pileCards = new LinkedList<>();
        this.dealer=dealer;
       // player = dealer.getPlayers().get(0);
//        maxPlayerName = "";
//        maxRankDeck = "";
//        maxSuitDeck = "";
       // keyName="";


    }

    public void isHeartBroken(){
        boolean isHeartBroken = Player.getIsIsHeartBroken();
        System.out.println("is Heart broken? "+isHeartBroken);
    }


    public void updateTrick(){
        trickNo++;
        System.out.println("current trick no is: "+trickNo);
    }


////showing all list of trick pile
//        public Queue<Card> trickPileHand() {
//        System.out.println("Trick pile has following cards: ");
//        for (Card currentCard : pileCards) {
//            System.out.println(currentCard.getSuitValue().getUnicode() + " of " + currentCard.getSuits().getUnicode());
//        }
//        return pileCards;
//    }


//to show top card on the trick pile
//    public void topTrickPile(){
//        System.out.println(pileCards.peek());
//       // return pileCards.peek();
//
//
//    }

    public int getMAX_TRICK() {
        return MAX_TRICK;
    }

    public int getTrickNo() {
        return trickNo;
    }

    public Card getSTART_CARD() {
        return START_CARD;
    }

    public char getSMILEY_FACE() {
        return SMILEY_FACE;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public Dealer getDealer() {
        return dealer;
    }

    public void nextPlayer() {}

    public int extractCardRank(String deckInfo) {

        String[] deck = deckInfo.split(" ");
        String cardRank = deck[deck.length-1];
        return Integer.parseInt(cardRank);
    }


    public String extractCardSuit(String deckInfo) {

        String[] deck = deckInfo.split(" ");
        String cardSuit = deck[2];
        return cardSuit;
    }


    public boolean isWinner(){
        System.out.println("is winner executed");
        //updateTrick();
        boolean isWinner =false;
        for(Player player:dealer.getPlayers()){
            if(player.getName().equals(trickWinner())){
                isWinner=true;
                player.addCardPlayerPile();
                break;
            }
        }
        return isWinner;
    }





    public String trickWinner() {
        int maxRankNum = 0;


        for (Player player : dealer.getPlayers()) {
            //String keyName = player.getName();
            String keyName = player.getName();
            if (player.cardPlayer.containsKey(keyName)) {
                String deckInfo = player.cardPlayer.get(keyName);
                int cardRankInt = extractCardRank(deckInfo);
                maxSuitDeck = extractCardSuit(deckInfo);

                String pileSuit = player.extractPileSuit();

                if (pileSuit.equals(maxSuitDeck) && cardRankInt > maxRankNum) {
                    maxRankNum = cardRankInt;
                    maxPlayerName = keyName;
                    maxRankDeck = deckInfo;

                    if (player instanceof AIPlayer){
                        System.out.println("winner is AI in trick winner method");
                        aiWinner = (AIPlayer) player;
//                        aiWinner.addCardPlayerPile();
//                        aiWinner.findStartCard(); // Call AIP
//                        nextPlayer();

                    } else if (player instanceof ActivePlayer) {
                        System.out.println("winner is Active in trick winner method");
                        activeWinner = (ActivePlayer) player;
//                        activeWinner.addCardPlayerPile();
//                        activeWinner.findStartCard(); // Call ActivePlayer's findStartCard() method
//                        nextPlayer();
                    } else if (player instanceof Player) {
                        System.out.println("winner is player in trick winner method");
                    }
//                    System.out.println(maxRankNum+"max rank num");
//                    System.out.println(maxPlayerName+"max player name");
//                    System.out.println(maxRankDeck+"max rank deck");

                }
            }
        }

        return maxPlayerName;

    }










    //thissss
    public void trickWinnerPlayer() {
        int maxRankNum = 0;


        for (Player player : getDealer().getPlayers()) {
          //  int maxRankNum = 0;
            //String keyName = player.getName();
            String keyName = player.getName();
            if (player.cardPlayer.containsKey(keyName)) {
                String deckInfo = player.cardPlayer.get(keyName);
                int cardRankInt = extractCardRank(deckInfo);
                maxSuitDeck = extractCardSuit(deckInfo);

                String pileSuit = player.extractPileSuit();

                if (pileSuit.equals(maxSuitDeck) && cardRankInt > maxRankNum) {
                    maxRankNum = cardRankInt;
                    maxPlayerName = keyName;

                    maxRankDeck = deckInfo;
                    if (player instanceof AIPlayer){
                        System.out.println("winner is AI");
                        AIPlayer aiWinner = (AIPlayer) player;
                        aiWinner.addCardPlayerPile();
                        aiWinner.findStartCard(); // Call AIP
                        nextPlayer();

                    } else if (player instanceof ActivePlayer) {
                        System.out.println("winner is Active");
                        ActivePlayer activeWinner = (ActivePlayer) player;
                        activeWinner.addCardPlayerPile();
                        activeWinner.findStartCard(); // Call ActivePlayer's findStartCard() method
                        nextPlayer();
                    } else if (player instanceof Player) {
                        System.out.println("winner is player");
                    }
//                    System.out.println(maxRankNum+"max rank num");
//                    System.out.println(maxPlayerName+"max player name");
//                    System.out.println(maxRankDeck+"max rank deck");

                }
            }
        }



    }



    private void setMaxPlayerName(String keyName) {
    }

    public  String getMaxPlayerName() {
        return maxPlayerName;
    }



    public void playerName() {
        System.out.println("The current trick winner is: "+maxPlayerName);
    }
//    public boolean isTrickEnded (Player player) {
//        boolean trickEnded;
//
//        if (trick.getTrickNo() == trick.getMAX_TRICK()) {
//            for ()
//
//        }
//    }


//    public boolean isTrickEnded (Player player){
//        boolean trickEnded ;
//
//        if (trickNo == MAX_TRICK){
//
//
//
//        }
//        if (player.getScore()==MAX_SCORE || player.getScore()>MAX_SCORE){
//            System.out.println("game ended and"+ player+"is the looser");
//            roundEnded = true;
//        }
//        else {
//            roundEnded = false;
//        }
//
//        return trickEnded;
//    }



}
