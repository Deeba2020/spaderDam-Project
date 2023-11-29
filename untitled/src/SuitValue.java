
//the code of this class is from Samra
public enum SuitValue {
    TWO("2",2),
    THREE("3",3),
    FOUR("4",4),
    FIVE("5",5),
    SIX("6",6),
    SEVEN("7",7),
    EIGHT("8",8),
    NINE("9",9),
    TEN("10",10),
    JACK("J",11),
    QUEEN("Q",12),
    KING("K",13),
    ACES("A",14);

    private final String unicode;
    private final int rankNo;

    SuitValue(String unicode, int rankNo) {
        this.unicode = unicode;
        this.rankNo = rankNo;
    }

    public String getUnicode() {
        return unicode;
    }

    public int getRankNo() {
        return rankNo;
    }

}
