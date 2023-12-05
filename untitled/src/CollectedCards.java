public class CollectedCards {
      private Card card;
      private String name;
      
 public CollectedCards(String name, Card card) {
        this.name=name;
        this.card=card;
        
    }
    public String getName( ){
        return name;
    }
    public Card getCard(){
        return card;
    }
  
    
}
