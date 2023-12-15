import java.util.ArrayList;

public class NextTrick extends Trick{

    public NextTrick(Dealer dealer){
        super(dealer);

    }

    //following should be implemented here
    //startGame()
    //nextPlayer()
    //nextCard()



    public void nextPlayer() {
        for (int i = 0; i < getDealer().getPlayers().size(); i++) {
            Player p0 = getDealer().getPlayers().get(0);
            Player p1 = getDealer().getPlayers().get(1);
            Player p2 = getDealer().getPlayers().get(2);
            Player p3 = getDealer().getPlayers().get(3);

            if (p0.getName().equals(getMaxPlayerName())) {
                // System.out.println(p0.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
                p1.findSuit();
                p2.findSuit();
                p3.findSuit();
                break;

            } else if (p1.getName().equals(getMaxPlayerName())) {
                // System.out.println(p1.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
                p2.findSuit();
                p3.findSuit();
                p0.findSuit();
                break;
            } else if (p2.getName().equals(getMaxPlayerName())) {
                // System.out.println(p2.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
                p3.findSuit();
                p0.findSuit();
                p1.findSuit();
                break;
            } else if (p3.getName().equals(getMaxPlayerName())) {
                //System.out.println(p3.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
                p0.findSuit();
                p1.findSuit();
                p2.findSuit();
                break;
            }
        }
    }




}
