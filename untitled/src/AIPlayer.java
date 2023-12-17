import java.util.ArrayList;

public class AIPlayer extends Player {
//in this class we will add rule for how AI player should play the game
    AIPlayer(String name){

        super(name);
    }



    //to find matching and  non-matching suit in players hand and add it  to the trickPile
    public void findSuit() {
        // ArrayList<Card>card= getCards();

        Card topCard = topTrickPile();
        ArrayList<Card> matchedSuits = new ArrayList<>();
        ArrayList<Card> differentSuit = new ArrayList<>();
        for (Card checkCard : getCards()) {
            if (checkCard.getSuits().getUnicode().equals(topCard.getSuits().getUnicode())) {
                matchedSuits.add(checkCard);

            } else  {
                differentSuit.add(checkCard);
            }
        }
        int suitIndex;
        Card chosenCard;
        if (!(matchedSuits.isEmpty())) {
            suitIndex = getSameSuit().nextInt(matchedSuits.size());
            chosenCard = matchedSuits.get(suitIndex);
            addCardToPile(chosenCard);
            getCards().remove(chosenCard);
        }
        else if (!(differentSuit.isEmpty())) {
            suitIndex = getRandomSuit().nextInt(differentSuit.size());
            chosenCard = differentSuit.get(suitIndex);
            addCardToPile(chosenCard);
            getCards().remove(chosenCard);
        }

    }

    public void findStartCard() {
        //ArrayList<Card>card= getCards();
        ArrayList<Card> differentSuit = new ArrayList<>();
        for (Card checkCard : getCards()) {

            differentSuit.add(checkCard);
        }

        int suitIndex;
        Card chosenCard;

        if (!(differentSuit.isEmpty())) {
            suitIndex = getRandomSuit().nextInt(differentSuit.size());
            chosenCard = differentSuit.get(suitIndex);
            addCardToPile(chosenCard);
            getCards().remove(chosenCard);
        }

    }






}





