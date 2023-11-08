
public enum Suit {
    HEART("\u2764"),
    CLUB("\u2663"),
    DIAMOND("\u2666"),
    SPADE("\u2660");

    private final String unicode;

    Suit(String symbol) {
        this.unicode = symbol;
    }

    public String getUnicode() {
        return unicode;
    }
}



