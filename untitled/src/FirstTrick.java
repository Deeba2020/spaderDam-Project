import java.util.*;

public class FirstTrick extends Trick {

    private final Card START_CARD;
    static Player playStarter;

    List<Player> players = dealer.getPlayers();

    public FirstTrick(Dealer dealer) {
        super(dealer);
        START_CARD = new Card(Suit.CLUB, SuitValue.TWO);
    }

    public void findTwoOfClubs() {
        for (Player player : players) {
            if (player.getCards().contains(START_CARD)) player.setLeadingPlayer(true);
        }
    }

    public Player findLeadingPlayer() {
        for (Player player : players) {
            if (player.isLeadingPlayer()) return player;
        }
        return null;
    }

    public void playFirstTrick() {
        findTwoOfClubs();
        Player leadingPlayer = findLeadingPlayer();

        System.out.println(leadingPlayer.getName() + " has " + START_CARD.getSuitValue().getUnicode() + " of " + START_CARD.getSuits().getUnicode() + getSMILEY_FACE());
        leadingPlayer.addCardToPile(START_CARD);
        nextPlayer();
    }


        public void nextPlayer() {
        for (int i = 0; i < dealer.getPlayers().size(); i++) {
            Player p0 = dealer.getPlayers().get(0);
            Player p1 = dealer.getPlayers().get(1);
            Player p2 = dealer.getPlayers().get(2);
            Player p3 = dealer.getPlayers().get(3);

            if (p0.isLeadingPlayer()) {
               // System.out.println(p0.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
                p1.findSuit();
                p2.findSuit();
                p3.findSuit();
                break;

            } else if (p1.isLeadingPlayer()) {
               // System.out.println(p1.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
                p2.findSuit();
                p3.findSuit();
                p0.findSuit();
                break;
            } else if (p2.isLeadingPlayer()) {
               // System.out.println(p2.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
                p3.findSuit();
                p0.findSuit();
                p1.findSuit();
                break;
            } else if (p3.isLeadingPlayer()) {
                //System.out.println(p3.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
                p0.findSuit();
                p1.findSuit();
                p2.findSuit();
                break;
            }
        }
    }





}


