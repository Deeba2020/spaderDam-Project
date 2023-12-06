public class FirstTrick extends Trick {

    private final Card START_CARD;
    static Player playStarter;

    public FirstTrick(Dealer dealer) {
        super(dealer);
        START_CARD = new Card(Suit.CLUB, SuitValue.TWO);
    }

    public void startFirstTrick() {
         playStarter = null;
        for (Player player : dealer.getPlayers()) {
            if (player.getCards().contains(START_CARD)) {
                System.out.println(player.getName() + " has " + START_CARD.getSuitValue().getUnicode() + " of " + START_CARD.getSuits().getUnicode() + getSMILEY_FACE());
                player.addCardToPile(START_CARD);
                player.getCards().remove(START_CARD);
                player.displayHand();
                playStarter = player;
                break;
            }

        }
//        if(playStarter != null){
//            for (Player player : dealer.getPlayers()) {
//                if(player != playStarter){
//                    player.findSuit();
//                }
//            }
//        }
        if (playStarter != null) {
            if (playStarter instanceof ActivePlayer) {
                ActivePlayer humanPlayer = (ActivePlayer) playStarter;
                // Call methods specific to HumanPlayer for user input
                humanPlayer.findSuit();
                // Other methods related to human player actions
            } else if (playStarter instanceof AIPlayer) {
                AIPlayer computerPlayer = (AIPlayer) playStarter;
                // Call methods specific to ComputerPlayer for AI decision-making
                computerPlayer.findSuit();
                // Other methods related to computer player actions
            }

        }
    }




        public void nextPlayer() {
        for (int i = 0; i < dealer.getPlayers().size(); i++) {
            Player p0 = dealer.getPlayers().get(0);
            Player p1 = dealer.getPlayers().get(1);
            Player p2 = dealer.getPlayers().get(2);
            Player p3 = dealer.getPlayers().get(3);

            if (p0.equals(playStarter)) {
               // System.out.println(p0.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
                p1.findSuit();
                p2.findSuit();
                p3.findSuit();
                break;

            } else if (p1.equals(playStarter)) {
               // System.out.println(p1.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
                p2.findSuit();
                p3.findSuit();
                p0.findSuit();
                break;
            } else if (p2.equals(playStarter)) {
               // System.out.println(p2.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
                p3.findSuit();
                p0.findSuit();
                p1.findSuit();
                break;
            } else if (p3.equals(playStarter)) {
                //System.out.println(p3.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
                p0.findSuit();
                p1.findSuit();
                p2.findSuit();
                break;
            }
        }
    }





}


