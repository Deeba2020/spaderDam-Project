import java.util.ArrayList;

public class AIPlayer extends Player {
//in this class we will add rule for how AI player should play the game


    Card chosenCard;
    ArrayList<Card> matchedSuits;
    ArrayList<Card> differentSuit ;
    AIPlayer(String name){

        super(name);
        matchedSuits = new ArrayList<>();
        differentSuit = new ArrayList<>();
    }
    public boolean kanFollowSuit() {
        boolean hasLeadingSuit = false;
        Card topCard = topTrickPileCard();
        for (Card checkCard : getCards()) {
            if (checkCard.getSuits().getUnicode().equals(topCard.getSuits().getUnicode())) {
                matchedSuits.add(checkCard);
                hasLeadingSuit = true;
            } else  {
                differentSuit.add(checkCard);
                hasLeadingSuit =false;
            }
        }
        return hasLeadingSuit;
    }



    //to find matching and  non-matching suit in players hand and add it  to the trickPile
//    public void findSuit() {
//        // ArrayList<Card>card= getCards();
//
//        Card topCard = topTrickPile();
//        ArrayList<Card> matchedSuits = new ArrayList<>();
//        ArrayList<Card> differentSuit = new ArrayList<>();
//        for (Card checkCard : getCards()) {
//            if (checkCard.getSuits().getUnicode().equals(topCard.getSuits().getUnicode())) {
//                matchedSuits.add(checkCard);
//
//            } else  {
//                differentSuit.add(checkCard);
//            }
//        }
//        int suitIndex;
//        Card chosenCard;
//        if (!(matchedSuits.isEmpty())) {
//            suitIndex = getSameSuit().nextInt(matchedSuits.size());
//            chosenCard = matchedSuits.get(suitIndex);
//            addCardToPile(chosenCard);
//            getCards().remove(chosenCard);
//        }
//        else if (!(differentSuit.isEmpty())) {
//            suitIndex = getRandomSuit().nextInt(differentSuit.size());
//            chosenCard = differentSuit.get(suitIndex);
//            addCardToPile(chosenCard);
//            getCards().remove(chosenCard);
//        }
//
//    }

//    public  void findStartCard() {
//        //ArrayList<Card>card= getCards();
//        ArrayList<Card> differentSuit = new ArrayList<>();
//        for (Card checkCard : getCards()) {
//
//            differentSuit.add(checkCard);
//        }
//
//        int suitIndex;
//        Card chosenCard;
//
//        if (!(differentSuit.isEmpty())) {
//            suitIndex = getRandomSuit().nextInt(differentSuit.size());
//            chosenCard = differentSuit.get(suitIndex);
//            addCardToPile(chosenCard);
//            getCards().remove(chosenCard);
//        }
//
//    }


//    public void findSuit() {
//        // ArrayList<Card>card= getCards();
//
//        Card topCard = topTrickPile();
//
//        int suitIndex;
//        Card chosenCard;
//        if (kanFollowSuit()) {
//            suitIndex = getSameSuit().nextInt(matchedSuits.size());
//            chosenCard = matchedSuits.get(suitIndex);
//            addCardToPile(chosenCard);
//            getCards().remove(chosenCard);
//        }
//        else  {
//            suitIndex = getRandomSuit().nextInt(differentSuit.size());
//            chosenCard = differentSuit.get(suitIndex);
////            addCardToPile(chosenCard);
////            getCards().remove(chosenCard);
//            if(chosenCard.getSuits().getUnicode().equals(Suit.HEART.getUnicode())){
//                addCardToPile(chosenCard);
//                getCards().remove(chosenCard);
//                setIsHeartBroken(true);
//            }else {
//                addCardToPile(chosenCard);
//                getCards().remove(chosenCard);
//            }
//        }
//
//    }

    public void findSuit() {
        Card topCard = topTrickPile();

        // Check if the AI has a matching suit
        boolean hasMatchingSuit = false;
        for (Card checkCard : getCards()) {
            if (checkCard.getSuits().equals(topCard.getSuits())) {
                hasMatchingSuit = true;
                break;
            }
        }

        // Play a matching suit if available, otherwise play a different suit
        if (hasMatchingSuit) {
            for (int i = 0; i < getCards().size(); i++) {
                Card checkCard = getCards().get(i);
                if (checkCard.getSuits().equals(topCard.getSuits())) {
                    addCardToPile(checkCard);
                    getCards().remove(i);
                    return; // Play the first matching suit found
                }
            }
        } else {
            // Play any card (preferably not a Heart if it's not broken)
            for (int i = 0; i < getCards().size(); i++) {
                Card checkCard = getCards().get(i);
                if (!checkCard.getSuits().equals(Suit.HEART) || AIPlayer.getIsIsHeartBroken()) {
                    addCardToPile(checkCard);
                    getCards().remove(i);
                    if (checkCard.getSuits().equals(Suit.HEART)) {
                        setIsHeartBroken(true);
                    }
                    return; // Play a card that's not Hearts or Hearts if they are broken
                }
            }
        }
    }


    public boolean kanUseHeart(){
        if (kanUseHeart){
            useHeart();
        }
        return kanUseHeart;
    }


    public void useHeart() {

        addCardToPile(chosenCard);
        setIsHeartBroken(true);
        System.out.println("you can not use heart suit since heart are not broken yet");

    }

    public  void findStartCard() {
        //ArrayList<Card>card= getCards();
//        ArrayList<Card> differentSuit = new ArrayList<>();
        ArrayList<Card> differentSuit = new ArrayList<>();
        for (Card checkCard : getCards()) {

            differentSuit.add(checkCard);
        }
        int suitIndex;
        if (!(differentSuit.isEmpty())) {
            suitIndex = getRandomSuit().nextInt(differentSuit.size());
            chosenCard = differentSuit.get(suitIndex);
            if (chosenCard.getSuits().getUnicode().equals(Suit.HEART.getUnicode())) {
                if (getIsIsHeartBroken()) {
                    addCardToPile(chosenCard);
                    setIsHeartBroken(true);
                } else {
                    while (chosenCard.getSuits().getUnicode().equals(Suit.HEART.getUnicode())) {
                        suitIndex = getRandomSuit().nextInt(differentSuit.size());
                        chosenCard = differentSuit.get(suitIndex);
                        if (!(chosenCard.getSuits().getUnicode().equals(Suit.HEART.getUnicode()))) {
                            addCardToPile(chosenCard);
                        }
                    }

                }
            }
        }
    }












}





