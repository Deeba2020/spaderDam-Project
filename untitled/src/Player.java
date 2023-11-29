import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Player {

  public String name;
  public String trickWinnersName;
  public int score;

  private ArrayList<Card> cards = new ArrayList<>();
  private ArrayList<CollectedCards> winnerCollection = new ArrayList<>();
  private List<CollectedCards> trickPile = new ArrayList<>();
  public Card card;
  public ArrayList<Card> playerHand = new ArrayList<>();
  public String type = "Human";
  private Trick trick;
  // private ArrayList<Integer> scores;

  Random rand = new Random();
  Scanner input = new Scanner(System.in);

  public ArrayList<Card> getPlayerHand() {
    return playerHand;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void displayHand() {
    System.out.println(" name   " + " has following cards: ");
    for (Card currentCard : cards) {
      System.out.println(
        currentCard.getSuitValue().getSuitChar() +
        " of " +
        currentCard.getSuits().getUnicode()
      );
    }
  }

  public Card pickCard() {
    String enteredSuit = "";
    String enteredRank = "";
    boolean ok = false;
    Suit suit;
    SuitValue rank;
    Card myCard = new Card(Suit.CLUB, SuitValue.ACES);
    System.out.println("Enter the card you want to play   ;");

    while (!ok) {
      try {
        System.out.print("Suit: ");
        enteredSuit = input.nextLine();

        System.out.print("Rank: ");

        enteredRank = input.nextLine();
        suit = Suit.valueOf(enteredSuit.toUpperCase());
        rank = SuitValue.valueOf(enteredRank.toUpperCase());

        ok = true;
        myCard = new Card(suit, rank);
        myCard.printCard();
        //playerHand.remove(cardIndex);
      } catch (Exception e) {
        System.out.println("Enter a valid card");
      }
    }

    return myCard;
  }

  public ArrayList<CollectedCards> winnerCollectTrick(CollectedCards trick) {
    winnerCollection.add(new CollectedCards(trick.getName(), trick.getCard()));
    return winnerCollection;
    // trickCards.remove(tricks)

  }

  public void desplayTrickWon() {
    for (CollectedCards card : winnerCollection) {
      System.out.println(
        card.getName() +
        " got " +
        card.getCard().getSuitValue() +
        "  of " +
        card.getCard().getSuits()
      );
    }
  }

  public void setScore(int scoreValue) {
    score = score + scoreValue;
  }

  public int getScore() {
    return score;
  }

  public void displayerPlayerHand() {
    for (Card card : playerHand) {
      System.out.println(
        "Player " +
        name +
        " has " +
        card.getSuitValue().getSuitChar() +
        " of " +
        card.getSuits()
      );
    }
  }

  public boolean hasSuit(Suit suit) {
    for (Card card : playerHand) {
      if (card.getSuits() == suit) {
        return true;
      }
    }
    return false;
  }
public Card startPlay() {
    Card START_CARD = new Card(Suit.CLUB, SuitValue.TWO);
    Card pickedCard= new Card(Suit.CLUB, SuitValue.TWO);

    if (playerHand.contains(START_CARD)) {
        pickedCard=START_CARD;
        playerHand.remove(START_CARD);
     
    }
return pickedCard;
}



  
  public Card continuePlay() {
    return pickCard();
  }
}
