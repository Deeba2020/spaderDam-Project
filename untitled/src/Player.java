import java.util.*;

public class Player {
    private String name;
    private ArrayList<Card> cards;

    //first in first out
    static Queue<Card> pileCards;
    private ArrayList<Integer> scores;
    private Random sameSuit;

    private Random randomSuit;

    //to track card shared by player to trick pile
     ArrayList<CardShared> cardToPilepi;
     ArrayList<Card> cardWon ;
    ArrayList<Card> cardList ;
    //private Trick trick;


    public Player(String name) {
        this.name = name;
        scores = null;
        cards = new ArrayList<>();
        pileCards = new LinkedList<>();
        sameSuit = new Random();
        randomSuit = new Random();
        cardToPilepi= new ArrayList<>();
        //trick = new Trick();
        cardWon = new ArrayList<>();
        cardList = new ArrayList<>();
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
        pileCards.add(card);
        CardShared cardShared = new CardShared(this, card);
        cardToPilepi.add(cardShared);
        System.out.println(card.getSuitValue().getUnicode() + " of " + card.getSuits().getUnicode() + " added to the trick pile");
        trickPileHand();
        topTrickPile();
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


    public ArrayList<CardShared> getCardToPile() {
        return cardToPilepi;
    }


    //to find matching and unmatching suit in players hand to the trickPile
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
        }
       // determineHighestSuit(cardList);
    }

    public void winCards() {
        if (cardToPilepi.size() >= 4) {
            Card highestCard = cardToPilepi.get(0).getCard();

            for (int i = 1; i < 4; i++) {
                Card currentCard = cardToPilepi.get(i).getCard();

                // Compare the current card's suit value to the highest card's suit value
                if (currentCard.getSuitValue().compareTo(highestCard.getSuitValue()) > 0) {
                    highestCard = currentCard;
                }
            }

            // Display the player who played the highest card
            for (CardShared cardShared : cardToPilepi) {
                if (cardShared.getCard().equals(highestCard)) {
                    System.out.println(cardShared.getPlayer().getName() + " wins the trick with " +
                            highestCard.getSuitValue().getUnicode() + " of " + highestCard.getSuits().getUnicode());
                    // Add logic to handle winning the trick for this player
                }
            }
        } else {
            System.out.println("Not enough cards in the pile to determine the highest.");
        }
    }


    public void add(Queue<Card>pileCards){

        cardList.addAll(pileCards);
    }

    public int determineHighestSuit(ArrayList<Card>cardList) {
          add(pileCards);

            if (cardList.size() >= 4) {
                int highestSuitValue = cardList.get(0).getSuitValue().getRankNo();
                System.out.println("highest suit value is" + highestSuitValue+getName());

                for (int i = 1; i < cardList.size(); i++) {
                    int currentSuitValue = cardList.get(i).getSuitValue().getRankNo();

                    // Print statements for debugging
                    System.out.println("Comparing: " + highestSuitValue + " with " + currentSuitValue);

                    // Compare the current card's suit value to the highest card's suit value
                    if (currentSuitValue > highestSuitValue) {
                        highestSuitValue = currentSuitValue;
                        // Debugging print statement for tracking changes
                        System.out.println("Updating highestSuitValue to: " + highestSuitValue+name);
                    }
                }

                // Debugging print statement to display final highestSuitValue
                System.out.println("Final highestSuitValue: " + highestSuitValue+name);
                return highestSuitValue;
            } else {
                System.out.println("Not enough cards in the pile to determine the highest.");

            }
        return 0; // Return null or handle the case where there are not enough cards in the pile
        }




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









