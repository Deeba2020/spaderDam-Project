import java.util.ArrayList;

public class AIOne extends AIPlayers{
    String name;
    private ArrayList<Card> cards;

    public AIOne(){
        super();
        this.name = "AI-One";
        cards =new ArrayList<>();
    }



    @Override
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
