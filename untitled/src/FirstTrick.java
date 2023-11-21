import java.util.ArrayList;

public class FirstTrick extends Trick {


    public FirstTrick(ArrayList<Player> players) {
        super(players);
    }

    //this method is useful only for 1st trick
    public void startPlay(Player player) {
        player.addCardTrickPile(getSTART_CARD());
        player.getCards().remove(getSTART_CARD());
        System.out.println("Removed card in "+player.getName() + "'s hand: " + getSTART_CARD().getSuitValue() + " of " + getSTART_CARD().getSuits().getUnicode());
        player.displayHand();

    }




    //this method is useful only for 1st trick
    public void nextCard(Player player){
        String hi = "here the logic to play card should be implemented (in the 1st trick only when trickPile has only 2 of club) ";
        System.out.println(hi);
    }


    //this method is useful only for 1st trick
    public void nextPlayer() {
        for (int i = 0; i < getPlayers().size(); i++) {
            Player p0 = getPlayers().get(0);
            Player p1 = getPlayers().get(1);
            Player p2 = getPlayers().get(2);
            Player p3 = getPlayers().get(3);

            if (p0.getCards().contains(getSTART_CARD())) {
                System.out.println(p0.getName()+" has "+getSTART_CARD().getSuitValue()+" of "+ getSTART_CARD().getSuits().getUnicode()+" and can start the game "+getSMILEY_FACE());
                startPlay(p0);
                nextCard(p3);
            } else if (p1.getCards().contains(getSTART_CARD())) {
                System.out.println(p1.getName()+" has "+getSTART_CARD().getSuitValue()+" of "+ getSTART_CARD().getSuits().getUnicode()+" and can start the game "+getSMILEY_FACE());
                startPlay(p1);
                nextCard(p0);
            } else if (p2.getCards().contains(getSTART_CARD())) {
                System.out.println(p2.getName()+" has "+getSTART_CARD().getSuitValue()+" of "+ getSTART_CARD().getSuits().getUnicode()+" and can start the game "+getSMILEY_FACE());
                startPlay(p2);
                nextCard(p1);
            } else if (p3.getCards().contains(getSTART_CARD())) {
                System.out.println(p3.getName()+" has "+getSTART_CARD().getSuitValue()+" of "+ getSTART_CARD().getSuits().getUnicode()+" and can start the game "+getSMILEY_FACE());
                startPlay(p3);
                nextCard(p2);
            }
        }
    }




}
