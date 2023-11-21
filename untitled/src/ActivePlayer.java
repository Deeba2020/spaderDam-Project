import java.util.ArrayList;

public class ActivePlayer extends Player {

    private String name;
    private ArrayList<Card> cards;

    public ActivePlayer(String name){
        super();
        this.name=name;
        cards = new ArrayList<>();
    }



    public void displayHand() {
        System.out.println( name+ " has following cards: ");
        for (Card currentCard : getCards()) {
            System.out.println(currentCard.getSuitValue() + " of " + currentCard.getSuits().getUnicode());
        }
    }



    public ArrayList<Card> getCards() {
        return cards;
    }


    public String getName() {
        return name;
    }


}
