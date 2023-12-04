import java.util.*;

public class Player {
    private String name;
    private ArrayList<Card> cards;

    //first in first out
    static ArrayList<Card> pileCards;
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
        pileCards = new ArrayList<>();
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
            System.out.println(currentCard.getSuitValue().getUnicode() + " of " +
                    currentCard.getSuits().getUnicode());
        }
    }


    //showing all list of trick pile
    public ArrayList<Card> trickPileHand() {
        System.out.println("Trick pile has following cards: ");
        for (Card currentCard : pileCards) {
            System.out.println(currentCard.getSuitValue().getUnicode() + " of " + currentCard.getSuits().getUnicode());
            //System.out.println(currentCard.getRank());
        }
        return pileCards;
    }


    public void addCardToPile(Card card) {
         cardPlayer.put(name,card.getSuitValue().getUnicode()+" of "+card.getSuits().getUnicode()
                 +" with rank number "+card.getSuitValue().getRankNo());
        pileCards.add(card);
        System.out.println(card.getSuitValue().getUnicode() + " of " + card.getSuits().getUnicode()
                + " added to the trick pile by "+name);
        trickPileHand();

    }


    //to show bottom card on the trick pile
    public Card topTrickPile() {
        if (!(pileCards.isEmpty())) {
            System.out.println("Card on the top of trick pile is "
                    + pileCards.get(0).getSuitValue().getUnicode() + " of " + pileCards.get(0).getSuits().getUnicode());
            return pileCards.get(0);
        } else {
            System.out.println("trick pile has no card");

            return null;
        }
    }


//to get suit of the pile card of the first card
    public String extractPileSuit() {

        return pileCards.get(0).getSuits().getUnicode();
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

    }



    public void cardPlayer(){
       // cardPlayer.get(name);
        System.out.println(cardPlayer.get(name));
        System.out.println(cardPlayer.values());
    }


    public Map<String, String> getCardPlayer() {
        return cardPlayer;
    }




    public void add(ArrayList<Card>pileCards){

        cardList.addAll(pileCards);
    }



}









