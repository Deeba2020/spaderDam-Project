import java.util.ArrayList;
import java.util.List;

public class NextTrick extends Trick{

    List<Player> players = getDealer().getPlayers();

    public NextTrick(Dealer dealer){
        super(dealer);

    }

    //following should be implemented here
    //startGame()
    //nextPlayer()
    //nextCard()


    public void findPreviousWinner() {
        for (Player player : players) {
            if (player.getName().equals(getMaxPlayerName())) player.setLeadingPlayer(true);
        }
    }

    public Player findLeadingPlayer() {
        for (Player player : players) {
            //if (player.isLeadingPlayer()) return player;
            if (player.getName().equals(getMaxPlayerName())) return player;
        }
        return null;
    }




    public void playNextTrick() {
//        findPreviousWinner();
//        isWinner();
//        Player leadingPlayer = findLeadingPlayer();
//        Player trickWinner = TrickWinnerPlayer();
        //String leadingPlayer = getMaxPlayerName();

        //System.out.println(trickWinner.getName() + " is winner of previous trick and can start the game runnnn " );
        System.out.println("play next trick");
//        if (trickWinner instanceof AIPlayer) {
//            trickWinner.findStartCard();
//        }else if(trickWinner instanceof ActivePlayer) {
//            trickWinner.findStartCard();
//        } else if (trickWinner instanceof Player) {
//            System.out.println("winner type is player");
//
//        }

        if (!(aiWinner ==null)) {

            System.out.println("winner is AI in play next trick method");
            aiWinner.findStartCard();
           // aiWinner.addCardPlayerPile();
            nextPlayer();
            aiWinner=null;

        }else if(!(activeWinner ==null)) {
            System.out.println("winner is active in play next trick method");
            activeWinner.findStartCard();

           // activeWinner.addCardPlayerPile();
            nextPlayer();
            activeWinner=null;

        } else  {
            System.out.println("winner type is player in play next trick method");

        }
        //nextPlayer();
    }

//    public void trickWinnerPlayer() {
//        int maxRankNum = 0;
//
//
//        for (Player player : getDealer().getPlayers()) {
//            //String keyName = player.getName();
//            String keyName = player.getName();
//            if (player.cardPlayer.containsKey(keyName)) {
//                String deckInfo = player.cardPlayer.get(keyName);
//                int cardRankInt = extractCardRank(deckInfo);
//                maxSuitDeck = extractCardSuit(deckInfo);
//
//                String pileSuit = player.extractPileSuit();
//
//                if (pileSuit.equals(maxSuitDeck) && cardRankInt > maxRankNum) {
//                    maxRankNum = cardRankInt;
//                    String name =getMaxPlayerName();
//                    name= keyName;
//
//                    maxRankDeck = deckInfo;
//                    if (player instanceof AIPlayer){
//                        System.out.println("winner is AI");
//                        AIPlayer aiWinner = (AIPlayer) player;
//                        aiWinner.addCardPlayerPile();
//                        aiWinner.findStartCard(); // Call AIP
//
//                    } else if (player instanceof ActivePlayer) {
//                        System.out.println("winner is Active");
//                        ActivePlayer activeWinner = (ActivePlayer) player;
//                        activeWinner.addCardPlayerPile();
//                        activeWinner.findStartCard(); // Call ActivePlayer's findStartCard() method
//                    } else if (player instanceof Player) {
//                        System.out.println("winner is player");
//                    }
//                    System.out.println(maxRankNum+"max rank num");
//                    System.out.println(maxPlayerName+"max player name");
//                    System.out.println(maxRankDeck+"max rank deck");

//                }
//            }
//        }
//
//
//
//    }




    public  void nextPlayer() {
        System.out.println("next player method");
        for (int i = 0; i < getDealer().getPlayers().size(); i++) {
            Player p0 = getDealer().getPlayers().get(0);
            Player p1 = getDealer().getPlayers().get(1);
            Player p2 = getDealer().getPlayers().get(2);
            Player p3 = getDealer().getPlayers().get(3);

            if (p0.getName().equals(getMaxPlayerName())) {
                // System.out.println(p0.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
                // p0.findStartCard();
                p1.findSuit();
                p2.findSuit();
                p3.findSuit();
                break;

            } else if (p1.getName().equals(getMaxPlayerName())) {
                // System.out.println(p1.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
                //  p1.findStartCard();
                p2.findSuit();
                p3.findSuit();
                p0.findSuit();
                break;
            } else if (p2.getName().equals(getMaxPlayerName())) {
                // System.out.println(p2.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
                //  p2.findStartCard();
                p3.findSuit();
                p0.findSuit();
                p1.findSuit();
                break;
            } else if (p3.getName().equals(getMaxPlayerName())) {
                //System.out.println(p3.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
                // p3.findStartCard();
                p0.findSuit();
                p1.findSuit();
                p2.findSuit();
                break;
            }
        }
    }





}
