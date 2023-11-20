import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Player {

//    private String name;
//    private int score;
    private ArrayList<Card> cards;
    Queue<Integer> pileCards = new LinkedList<>();
    private ArrayList<Card> trickCards;

    private ArrayList<Integer> scores;
    private Dealer deal;
    Card startCard = new Card(Suit.CLUB,SuitValue.TWO);

    public Card getStartCard() {
        return startCard;

    }

    public void setStartCard(Card startCard) {
        this.startCard = startCard;
    }

    //    private ArrayList<Deck>decks;
    public Player() {
//        this.name = name;

        scores = null;
        cards = new ArrayList<>();
        trickCards = new ArrayList<>();
    }

//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }

    public ArrayList<Card> getCards() {
        return cards;
    }


    public void displayHand() {
        System.out.println( " name   "+ " has following cards: ");
        for (Card currentCard : cards) {
            System.out.println(currentCard.getSuitValue() + " of " + currentCard.getSuits().getUnicode());
        }
    }

    public void addCardMiddle(Card card){
        trickCards.add(card);
        System.out.println(card.getSuitValue()+" of "+  card.getSuits()+" added");
        displayMiddle();
        }

    public void addCardPile(ArrayList<Card>card){
        for (Card cards : cards)
        pileCards.offer(0);
        //System.out.println(card.getSuitValue()+" of "+  card.getSuits()+" added");
        displayMiddle();
    }



    public ArrayList<Card> displayMiddle() {
        System.out.println("discard pile has following cards: ");
        for (Card currentCard : trickCards) {
            System.out.println(currentCard.getSuitValue() + " of " + currentCard.getSuits().getUnicode());
        }
        return trickCards;
    }


    

    //need to remove unnecessary prints in last stage
//    public void  startPlay(Player player) {
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
//
//                player.addCardMiddle(startCard);
//                player.getCards().remove(startCard);
//                System.out.println("Removed card in player's hand: " + startCard.getSuitValue() + " of " + startCard.getSuits().getUnicode());
//                System.out.println(  " player.getName()"     + "'s hand after removing TWO of CLUB is: ");
//                player.displayHand();
//
//            }
//
//            }
//    }


//    public boolean  startPlay() {
//
//        boolean hasStartCard = false;
//
//        char smileyFace = '\u263A';
//
//        for (Player player:pla)
//
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








}









