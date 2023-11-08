import java.util.PrimitiveIterator;

public class Card {

    private Suit suits;
    private SuitValue suitValue;

    public Card(Suit face, SuitValue suitValue){
        this.suits =face;
        this.suitValue = suitValue;
    }

    public Suit getSuits() {
        return suits;
    }

    public void setSuits(Suit suits) {
        this.suits = suits;
    }

    public SuitValue getSuitValue() {
        return suitValue;
    }

    public void setSuitValue(SuitValue suitValue) {
        this.suitValue = suitValue;
    }
}
