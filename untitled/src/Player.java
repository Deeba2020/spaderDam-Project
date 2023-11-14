import java.util.ArrayList;

public class Player {

    private String name;
    //private int score;
    private ArrayList<Card> cards;
    private ArrayList<Card> trickCards;

    private ArrayList<Integer> scores;
    private Dealer deal;

    //    private ArrayList<Deck>decks;
    public Player(String name) {
        this.name = name;
        scores = null;
        cards = new ArrayList<>();
        trickCards = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }


    public void displayHand() {
        System.out.println(name + " has following cards: ");
        for (Card currentCard : cards) {
            System.out.println(currentCard.getSuitValue() + " of " + currentCard.getSuits().getUnicode());
        }
    }

    public void addCardMiddle(Card card){
        trickCards.add(card);
        System.out.println(card.getSuitValue()+"of"+  card.getSuits()+"added");
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
    public void  startPlay(Player player) {
        //System.out.println("Looking for Two of Club");
        char smileyFace = '\u263A';
        Card startCard = new Card(Suit.CLUB,SuitValue.TWO);

        System.out.println(player.getName()+" current hand size is: " + player.getCards().size());
        System.out.println("Looking for: " + startCard.getSuitValue()+" of "+ startCard.getSuits().getUnicode());

        for (int i = 0; i<13 ; i++) {

            if (player.getCards().isEmpty()) {
                System.out.println("no cards in hand to play with");
            }

            else if (player.getCards().contains(startCard)){

                System.out.println("the player "+player.getName()+" has the card"+" " +startCard.getSuitValue() + " of " + startCard.getSuits().getUnicode()+" and can start the game "+smileyFace);
                player.addCardMiddle(startCard);
                player.getCards().remove(startCard);
                System.out.println("Removed card in player's hand: " + startCard.getSuitValue() + " of " + startCard.getSuits().getUnicode());
                System.out.println(player.getName() + "'s hand after removing TWO of CLUB is: ");
                player.displayHand();
            }

            }
    }

//  List<Card> trickCards = new ArrayList<>();

//public void recieveCard(){
//    for(Card choosenCard: cards){
//    trickCards.add(choosenCard);
//    }
//
//    }
}









