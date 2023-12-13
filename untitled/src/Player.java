import java.util.*;

public  abstract class Player {
    private String name;
    private ArrayList<Card> cards;

    //first in first out
    static ArrayList<Card> pileCards;
    private ArrayList<Integer> scores;
    private Random sameSuit;

    private Random randomSuit;

    //to store winning cards in the pile of the won player
    private ArrayList<Card> playerPile;

    private boolean leadingPlayer;



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
        playerPile = new ArrayList<>();

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
    public void trickPileList() {
        if(!(pileCards.isEmpty())) {
            System.out.println("Trick pile has following cards: ");
            for (Card currentCard : pileCards) {
                System.out.println(currentCard.getSuitValue().getUnicode() + " of " +
                        currentCard.getSuits().getUnicode());
                //System.out.println(currentCard.getRank());
            }
        }else {
            System.out.println("trick pile is empty because all cards added to pile of the trick winner");
        }
    }


    public void addCardToPile(Card card) {
         cardPlayer.put(name,card.getSuitValue().getUnicode()+" of "+card.getSuits().getUnicode()
                 +" with rank number "+card.getSuitValue().getRankNo());
        pileCards.add(card);
        System.out.println(card.getSuitValue().getUnicode() + " of " + card.getSuits().getUnicode()
                + " added to the trick pile by "+name);
        trickPileList();

    }


    //to show bottom card on the trick pile
    public Card topTrickPile() {
        if (!(pileCards.isEmpty())) {
            System.out.println("Card on the top of trick pile is "
                    + pileCards.get(0).getSuitValue().getUnicode() + " of " +
                    pileCards.get(0).getSuits().getUnicode());
            return pileCards.get(0);
        } else {
            System.out.println("trick pile has no card");

            return null;
        }
    }

    public Card topTrickPileCard() {
        if (!(pileCards.isEmpty())) {
            return pileCards.get(0);
        } else {
            System.out.println("trick pile has no card");
            return null;
        }
    }


//to get suit of the pile card of the first card
    public String extractPileSuit() {

        if(!pileCards.isEmpty()){
            return pileCards.get(0).getSuits().getUnicode();
        }else {
            return "no card found";
        }
    }



    public ArrayList<CardShared> getCardToPile() {
        return cardToPile;
    }


    //to find matching and  non-matching suit in players hand and add it  to the trickPile
    public abstract void findSuit();

    //to add cards to pile of player hand and also print them out
    public void addCardPlayerPile(){
        playerPile.addAll(pileCards);
        pileCards.clear();
        playerPileHand();
    }

    public ArrayList<Card> getPlayerPile() {
        return playerPile;
    }





    public static ArrayList<Card> getPileCards() {
        return pileCards;
    }

    //to print player pile hand list of cards
    public ArrayList<Card> playerPileHand() {
        System.out.println("Trick winner "+name+" has following cards in the pile hand : ");
        for (Card currentCard : playerPile) {
            System.out.println(currentCard.getSuitValue().getUnicode()  + currentCard.getSuits().getUnicode());
        }
        return playerPile;
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

    public Random getSameSuit() {
        return sameSuit;
    }

    public Random getRandomSuit() {
        return randomSuit;
    }

    public void setLeadingPlayer(boolean leadingPlayer) {
        this.leadingPlayer = leadingPlayer;
    }

    public boolean isLeadingPlayer() {
        return leadingPlayer;
    }

}









