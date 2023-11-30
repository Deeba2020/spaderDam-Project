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
            nextPlayer();

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



//    public void startFirstTrick() {
//        playStarter = null;
//        for (Player player : dealer.getPlayers()) {
//            if (player.getCards().contains(START_CARD)) {
//                System.out.println(player.getName() + " has " + START_CARD.getSuitValue().getUnicode() + " of " + START_CARD.getSuits().getUnicode() + getSMILEY_FACE());
//                player.addCardToPile(START_CARD);
//                player.getCards().remove(START_CARD);
//                player.displayHand();
//                playStarter = player;
//                break;
//            }
//
//        }
//        if(playStarter != null){
//            for (Player player : dealer.getPlayers()) {
//                if(player != playStarter){
//                    player.findSuit();
//                }
//            }
//        }





//    public void startFirstTrick(){
//        for (Player player:dealer.getPlayers()){
//            if (!(hasStartCArd())){
//                player.findSuit();
//            }
//        }
//
//    }

//    public void startFirstTrick() {
//        boolean twoOfClubFound = false;
//        for (Player player : dealer.getPlayers()) {
//            if (player.getCards().contains(START_CARD)) {
//                System.out.println(player.getName() + " has " + START_CARD.getSuitValue().getUnicode() + " of " + START_CARD.getSuits().getUnicode() + getSMILEY_FACE());
//                player.addCardToPile(START_CARD);
//                player.getCards().remove(START_CARD);
//                player.displayHand();
//
//                twoOfClubFound=true;
//
//                continue;
//
//            }
//             else if (player.cardToPile.isEmpty()){
//                player.findSuit();
//
//            }
//        }
//    }




    //
//    //this method is useful only for 1st trick
//    public void startPlay(Player player) {
//        player.addCardToPile(getSTART_CARD());
//        player.getCards().remove(getSTART_CARD());
//        System.out.println("Removed card in " + player.getName() + "'s hand: " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode());
//        player.displayHand();
//
//    }

    //
//
////    public void checkSuit(Player player) {
////        Suit club = Suit.CLUB;
////        Suit heart = Suit.HEART;
////        Suit diamond = Suit.DIAMOND;
////        Suit spade = Suit.SPADE;
////
////        if (player.getCards().equals(club)){
////            player.addCardTrickPile(c);
////        }
////
////
////    }
////
//
//
//
//    //this method is useful only for 1st trick
//    public void nextCard(Player player) {
//        String hi = "here the logic to play card should be implemented (in the 1st trick only when trickPile has only 2 of club) ";
//        System.out.println(hi);
//    }

    //
//
//    //this method is useful only for 1st trick
//    public void nextPlayer() {
//        for (int i = 0; i < dealer.getPlayers().size(); i++) {
//            Player p0 = dealer.getPlayers().get(0);
//            Player p1 = dealer.getPlayers().get(1);
//            Player p2 = dealer.getPlayers().get(2);
//            Player p3 = dealer.getPlayers().get(3);
//
//            if (p0.getCards().contains(getSTART_CARD())) {
//                System.out.println(p0.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
//                startPlay(p0);
//                nextCard(p3);
//            } else if (p1.getCards().contains(getSTART_CARD())) {
//                System.out.println(p1.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
//                startPlay(p1);
//                nextCard(p0);
//            } else if (p2.getCards().contains(getSTART_CARD())) {
//                System.out.println(p2.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
//                startPlay(p2);
//                nextCard(p1);
//            } else if (p3.getCards().contains(getSTART_CARD())) {
//                System.out.println(p3.getName() + " has " + getSTART_CARD().getSuitValue().getUnicode() + " of " + getSTART_CARD().getSuits().getUnicode() + " and can start the game " + getSMILEY_FACE());
//                startPlay(p3);
//                nextCard(p2);
//            }
//        }
//    }


}


