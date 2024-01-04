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
        isWinner();
        Player leadingPlayer = findLeadingPlayer();
        Player trickWinner = findTrickWinnerPlayer();
//        String leadingPlayer = getMaxPlayerName();

        System.out.println(leadingPlayer.getName() + " is winner of previous trick and can start the game runnnn " );
        if (trickWinner instanceof AIPlayer) {
            trickWinner.findStartCard();
        }else if(trickWinner instanceof ActivePlayer) {
            trickWinner.findStartCard();
        }
        nextPlayer();
    }



    public void nextPlayer() {
        for (int i = 0; i < getDealer().getPlayers().size(); i++) {
            Player p0 = getDealer().getPlayers().get(0);
            Player p1 = getDealer().getPlayers().get(1);
            Player p2 = getDealer().getPlayers().get(2);
            Player p3 = getDealer().getPlayers().get(3);

            if (p0.getName().equals(getMaxPlayerName())) {
                // System.out.println(p0.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
                p0.findStartCard();
                p1.findSuit();
                p2.findSuit();
                p3.findSuit();
                break;

            } else if (p1.getName().equals(getMaxPlayerName())) {
                // System.out.println(p1.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
                p1.findStartCard();
                p2.findSuit();
                p3.findSuit();
                p0.findSuit();
                break;
            } else if (p2.getName().equals(getMaxPlayerName())) {
                // System.out.println(p2.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
                p2.findStartCard();
                p3.findSuit();
                p0.findSuit();
                p1.findSuit();
                break;
            } else if (p3.getName().equals(getMaxPlayerName())) {
                //System.out.println(p3.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
                p3.findStartCard();
                p0.findSuit();
                p1.findSuit();
                p2.findSuit();
                break;
            }
        }
    }




}
