
//make this one unicode
public enum SuitValue {
    TWO("2", 2) ,
    THREE("3",3),
    FOUR("4", 4),
    FIVE ("5", 5),
    SIX("6", 6),
    SEVEN("7", 7),
    EIGHT("8", 8),
    NINE("9", 9),
    TEN("10", 10),
    JACK("J", 11),
    QUEEN("Q", 12),
    KING("K", 13),
    ACES("A", 14);
    

private  String rank;
private int rankValue;

private SuitValue(String rank, int rankValue) {
        this.rank = rank;
        this.rankValue= rankValue;
    }

public String getSuitChar() {
            return rank;
          }
public int getRankValue(){
    return rankValue;
}
        }
    