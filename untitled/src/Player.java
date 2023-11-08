import java.util.ArrayList;

public class Player {

    private String name;
    private double score;
    private ArrayList<Card>cards;

    public Player(String name){
        this.name=name;
        this.score=0.0;
        this.cards=null;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }

//    public int shuffleCards (ArrayList<Card>cards){
//        cards.
//        return;
//    }

}
