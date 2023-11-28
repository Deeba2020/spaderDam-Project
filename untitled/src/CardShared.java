import java.security.PrivateKey;

public class CardShared  {

    private Player player;
    private Card card;

    public CardShared(Player player,Card card){
        this.card=card;
        this.player=player;
        System.out.println("The player "+player.getName()+" added "+card.getSuitValue().getUnicode()+" of "+card.getSuits().getUnicode()+" to the trick pile");

    }



    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


    public Card getCard(){
        return card;
    }

    public void setCard(Card card){
       this.card=card;
    }


//    public boolean equals(Object otherObj) {
//        boolean isEqual = false;
//        if (otherObj == this){
//            isEqual= true;
//        } else if (otherObj==null) {
//            isEqual=false;
//        } else if (otherObj instanceof CardShared) {
//            CardShared otherCard = (CardShared) otherObj;
//            isEqual = this.suits.equals(otherCard.suits) && this.suitValue.equals(otherCard.getSuitValue());
//        } else {
//        }
//        return isEqual;
//    }



}
