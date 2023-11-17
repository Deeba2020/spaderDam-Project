public class ActivePlayer extends Player {


    String name;

    public ActivePlayer(String name){
        super();
        this.name=name;
    }


    public void displayHand() {
        System.out.println( name+ " has following cards: ");
        for (Card currentCard : getCards()) {
            System.out.println(currentCard.getSuitValue().getSuitChar() + " of " + currentCard.getSuits().getUnicode());
        }
    }

    @Override
    public void startPlay(Player player) {
        char smileyFace = '\u263A';
        Card startCard = new Card(Suit.CLUB,SuitValue.TWO);

        System.out.println( name+" current hand size is: " + player.getCards().size());
        System.out.println("Looking for: " + startCard.getSuitValue().getSuitChar()+" of "+ startCard.getSuits().getUnicode());

        for (int i = 0; i<13 ; i++) {

            if (player.getCards().isEmpty()) {
                System.out.println("no cards in hand to play with");
            }

            else if (player.getCards().contains(startCard)){

                System.out.println("the player "+  name + " has the card "+" " +startCard.getSuitValue() + " of " + startCard.getSuits().getUnicode()+" and can start the game "+smileyFace);
                player.addToPile(startCard);
                player.getCards().remove(startCard);
                System.out.println("Removed card in player's hand: " + startCard.getSuitValue().getSuitChar() + " of " + startCard.getSuits().getUnicode());
                System.out.println(  name    + "'s hand after removing TWO of CLUB is: ");
                player.displayHand();

            }

        }
    }







}
