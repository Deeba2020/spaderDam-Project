import java.util.*;

public class Player {
    private String name;
    private ArrayList<Card> cards;

    //first in first out
    static Queue<Card> pileCards;
    private ArrayList<Integer> scores;
    private Random sameSuit;

    private Random randomSuit;
    String n;

    //to track card shared by player to trick pile
     ArrayList<CardShared> cardToPile;
     ArrayList<Card> cardWon ;
    ArrayList<Card> cardList ;
    Map<String,String> cardPlayer;
    //private Trick trick;


    public Player(String name) {
        this.name = name;
        scores = null;
        cards = new ArrayList<>();
        pileCards = new LinkedList<>();
        sameSuit = new Random();
        randomSuit = new Random();
        cardToPile = new ArrayList<>();
        //trick = new Trick();
        cardWon = new ArrayList<>();
        cardList = new ArrayList<>();
        cardPlayer=new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }


    public void displayHand() {
        System.out.println(name + " player has following cards: ");
        for (Card currentCard : cards) {
            System.out.println(currentCard.getSuitValue().getUnicode() + " of " + currentCard.getSuits().getUnicode());
        }
    }


    //showing all list of trick pile
    public Queue<Card> trickPileHand() {
        System.out.println("Trick pile has following cards: ");
        for (Card currentCard : pileCards) {
            System.out.println(currentCard.getSuitValue().getUnicode() + " of " + currentCard.getSuits().getUnicode());
            System.out.println(currentCard.getRank());
        }
        return pileCards;
    }


    public void addCardToPile(Card card) {
         //n = name+card.getSuitValue().getUnicode();
         cardPlayer.put(name,card.getSuitValue().getUnicode()+" of "+card.getSuits().getUnicode()+" with rank number "+card.getSuitValue().getRankNo());
       // System.out.println(n);
        pileCards.add(card);
//        CardShared cardShared = new CardShared(this, card);
//        cardToPile.add(cardShared);
        System.out.println(card.getSuitValue().getUnicode() + " of " + card.getSuits().getUnicode() + " added to the trick pile by "+name);
        trickPileHand();
        //topTrickPile();
    }


    //to show bottom card on the trick pile
    public Card topTrickPile() {
        if (!(pileCards.isEmpty())) {
            System.out.println("Card on the top of trick pile is " + pileCards.peek().getSuitValue().getUnicode() + " of " + pileCards.peek().getSuits().getUnicode());
            return pileCards.peek();
        } else {
            System.out.println("trick pile has no card");

            return null;
        }
    }


//to get suit of the pile card
    public String extractPileSuit() {

        String suit = pileCards.peek().getSuits().getUnicode();
        return suit;
    }



    public ArrayList<CardShared> getCardToPile() {
        return cardToPile;
    }


    //to find matching and  non-matching suit in players hand and add it  to the trickPile
    public void findSuit() {
        // ArrayList<Card>card= getCards();

        Card topCard = topTrickPile();
        ArrayList<Card> matchedSuits = new ArrayList<>();
        ArrayList<Card> differentSuit = new ArrayList<>();
        for (Card checkCard : cards) {
            if (checkCard.getSuits().getUnicode().equals(topCard.getSuits().getUnicode())) {
                matchedSuits.add(checkCard);

            } else  {
                differentSuit.add(checkCard);
            }
        }
        int suitIndex;
        Card chosenCard;
        if (!(matchedSuits.isEmpty())) {
            suitIndex = sameSuit.nextInt(matchedSuits.size());
            chosenCard = matchedSuits.get(suitIndex);
            addCardToPile(chosenCard);
            cards.remove(chosenCard);
        }
        else if (!(differentSuit.isEmpty())) {
            suitIndex = randomSuit.nextInt(differentSuit.size());
            chosenCard = differentSuit.get(suitIndex);
            addCardToPile(chosenCard);
            cards.remove(chosenCard);
        }
       // determineHighestSuit(cardList);
    }

    public void cardPlayer(){
       // cardPlayer.get(name);
        System.out.println(cardPlayer.get(name));
        System.out.println(cardPlayer.values());
    }

    public Map<String, String> getCardPlayer() {
        return cardPlayer;
    }



    //    public void checkCardShared(){
//        for(Card card: pileCards){
//            System.out.println(  "name of the card matched to the owner is " +name+card.getSuitValue().getUnicode());
//        }
//    }

//    public void winCards() {
//        if (cardToPile.size() >= 4) {
//            Card highestCard = cardToPile.get(0).getCard();
//
//            for (int i = 1; i < 4; i++) {
//                Card currentCard = cardToPile.get(i).getCard();
//
//                // Compare the current card's suit value to the highest card's suit value
//                if (currentCard.getSuitValue().compareTo(highestCard.getSuitValue()) > 0) {
//                    highestCard = currentCard;
//                }
//            }
//
//            // Display the player who played the highest card
//            for (CardShared cardShared : cardToPile) {
//                if (cardShared.getCard().equals(highestCard)) {
//                    System.out.println(cardShared.getPlayer().getName() + " wins the trick with " +
//                            highestCard.getSuitValue().getUnicode() + " of " + highestCard.getSuits().getUnicode());
//                    // Add logic to handle winning the trick for this player
//                }
//            }
//        } else {
//            System.out.println("Not enough cards in the pile to determine the highest.");
//        }
//    }


    public void add(Queue<Card>pileCards){

        cardList.addAll(pileCards);
    }

//    public int determineHighestSuit(ArrayList<Card>cardList) {
//          add(pileCards);
//
//            if (cardList.size() >= 4) {
//                int highestSuitValue = cardList.get(0).getSuitValue().getRankNo();
//                System.out.println("highest suit value is" + highestSuitValue+getName());
//
//                for (int i = 1; i < cardList.size(); i++) {
//                    int currentSuitValue = cardList.get(i).getSuitValue().getRankNo();
//
//                    // Print statements for debugging
//                    System.out.println("Comparing: " + highestSuitValue + " with " + currentSuitValue);
//
//                    // Compare the current card's suit value to the highest card's suit value
//                    if (currentSuitValue > highestSuitValue) {
//                        highestSuitValue = currentSuitValue;
//                        // Debugging print statement for tracking changes
//                        System.out.println("Updating highestSuitValue to: " + highestSuitValue+name);
//                    }
//                }
//
//                // Debugging print statement to display final highestSuitValue
//                System.out.println("Final highestSuitValue: " + highestSuitValue+name);
//                return highestSuitValue;
//            } else {
//                System.out.println("Not enough cards in the pile to determine the highest.");
//
//            }
//        return 0; // Return null or handle the case where there are not enough cards in the pile
//        }




    // Function to determine the highest suit value among the cards in the trick pile
//    public int determineHighestSuit(ArrayList<CardShared> trickPile) {
//        if (trickPile.size() >= 4) {
//            int highestSuitValue = trickPile.get(0).getSuitValue().getRankNo();
//
//            for (int i = 1; i < trickPile.size(); i++) {
//                int currentSuitValue = trickPile.get(i).getSuitValue().getRankNo();
//
//                // Compare the current card's suit value to the highest card's suit value
//                if (currentSuitValue > highestSuitValue) {
//                    highestSuitValue = currentSuitValue;
//                }
//            }
//
//            return highestSuitValue;
//        } else {
//            System.out.println("ZEROOOO");
//            return 0; // Return null or handle the case where there are not enough cards in the pile
//        }
//    }


//    public void winCards(){
//
//            if (cardToPile.get(0)>cardToPile.get(1)){
//
//            }
//
//
//    }






//    public Queue<Card> getPileCards() {
//        return pileCards;
//    }
//
//    public  Queue<CardShared> getCardToPile() {
//        return cardToPile;
//    }


//
//    public void addCardTrickPile(Card card){
//        pileCards.add(card);
//        System.out.println(card.getSuitValue().getUnicode()+" of "+  card.getSuits().getUnicode()+" added to the trick pile");
//        displayTrickPile();
//        }


//    public Queue<Card> displayTrickPile() {
//        System.out.println("Trick pile has following cards: ");
//        for (Card currentCard : pileCards) {
//            System.out.println(currentCard.getSuitValue().getUnicode() + " of " + currentCard.getSuits().getUnicode());
//        }
//        return pileCards;
//    }


//    public Card chooseCard(){
//
//
//
//    }



}









