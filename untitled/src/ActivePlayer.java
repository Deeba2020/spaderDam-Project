import java.util.ArrayList;

public class ActivePlayer extends Player {


    String name;
    private ArrayList<Card> cards;

    public ActivePlayer(String name){
        super();
        this.name=name;
        cards = new ArrayList<>();
    }

    public void add(Card card){
        cards.add(card);
    }


    public void displayHand() {
        System.out.println( name+ " has following cards: ");
        for (Card currentCard : getCards()) {
            System.out.println(currentCard.getSuitValue() + " of " + currentCard.getSuits().getUnicode());
        }
    }


   // @Override
//    public void startPlay(Player player) {
//        char smileyFace = '\u263A';
//        Card startCard = new Card(Suit.CLUB,SuitValue.TWO);
//
//        System.out.println( name+" current hand size is: " + player.getCards().size());
//        System.out.println("Looking for: " + startCard.getSuitValue()+" of "+ startCard.getSuits().getUnicode());
//
//        for (int i = 0; i<13 ; i++) {
//
//            if (player.getCards().isEmpty()) {
//                System.out.println("no cards in hand to play with");
//            }
//
//            else if (player.getCards().contains(startCard)){
//
//                System.out.println("the player "+  name + " has the card "+" " +startCard.getSuitValue() + " of " + startCard.getSuits().getUnicode()+" and can start the game "+smileyFace);
//                player.addCardMiddle(startCard);
//                player.getCards().remove(startCard);
//                System.out.println("Removed card in player's hand: " + startCard.getSuitValue() + " of " + startCard.getSuits().getUnicode());
//                System.out.println(  name    + "'s hand after removing TWO of CLUB is: ");
//                player.displayHand();
//
//            }
//
//        }
//    }


//    public boolean  startPlay(Player player) {
//
//        boolean hasStartCard = false;
//
//        char smileyFace = '\u263A';
//
//        System.out.println( "  player.getName() "+" current hand size is: " + player.getCards().size());
//        System.out.println("Looking for: " + startCard.getSuitValue()+" of "+ startCard.getSuits().getUnicode());
//
//        for (int i = 0; i<13 ; i++) {
//
//            if (player.getCards().isEmpty()) {
//                System.out.println("no cards in hand to play with");
//            }
//
//            else if (player.getCards().contains(startCard)){
//
//                System.out.println("the player "+  "player.getName()" + " has the card "+" " +startCard.getSuitValue() + " of " + startCard.getSuits().getUnicode()+" and can start the game "+smileyFace);
//
//                hasStartCard =true;
//
//
//            }
//
//        }
//        return hasStartCard;
//    }



    //@Override
//    public void addCardPile(ArrayList<Card> activeCard) {
//        for (Card cards : activeCard) {
//            if (cards.equals(startCard)){
//
//            }
//        }
//            pileCards.offer(0);
//        //System.out.println(card.getSuitValue()+" of "+  card.getSuits()+" added");
//        displayMiddle();
//    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }






     public void getCardSuit(ArrayList<Card>activeCard){
        String hi = "Hi";

        for (Card cards: activeCard){
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










}
