import java.util.ArrayList;

import java.util.Scanner;

public class Player {

  protected String name;
  protected int score;
  protected ArrayList<Card> cards = new ArrayList<>();
  
  protected ArrayList<Card> playerHand = new ArrayList<>();
  public String type = "Human";
  public Trick trick;

  public Player(Trick trick) {
    this.trick = trick;
  } 

  
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
    System.out.println(" Cards in your hand: ");
    displayerPlayerHand();

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
      } catch (Exception e) {
        System.out.println("Enter a valid card");
      }
    }

    return myCard;
  }

  

  public void setScore(int scoreValue) {
    score = score + scoreValue;
  }

  public int getScore() {
    return score;
  }

  public void displayerPlayerHand() {
    String currntHand = "[";
    for (Card card : playerHand) {
      currntHand +=
        card.getSuitValue().getSuitChar().toString() +
        " of " +

        card.getSuits() +
        ",";
    }
    System.out.println(currntHand + "]");
  }

  public boolean hasSuit() {
    boolean hasSuit = false;

    for (Card card : getPlayerHand()) {
      if (card.getSuits() == trick.leadingSuit) {
        hasSuit = true;
      }
    }
    return hasSuit;
  }
 
  
 
  private Card START_CARD = new Card(Suit.CLUB, SuitValue.TWO);
  protected Card leadingCard = new Card(Suit.CLUB, SuitValue.TWO);

  public void startPlay() {
   
  

    if (playerHand.contains(START_CARD)) {
      trick.addToPile(name, START_CARD);
      playerHand.remove(START_CARD);
      System.out.println(
        "player  " +
        name +
        " started the game with  " +
        START_CARD.getSuitValue() +
        " of " +
        START_CARD.getSuits()
      );
      System.out.println(
        "The leading card is :" +
        leadingCard.getSuitValue() +
        " of " +
        leadingCard.getSuits()
      );
    }
  }


   public void continuePlay() {
    boolean pickedCardValid = false;
    Card pickedCard;
    while (!pickedCardValid) {
      pickedCard = pickCard();
      if (trick.trickPileCards.size() == 0 && playerHand.contains(pickedCard)) {
             

        if (pickedCard.getSuits() == Suit.HEART ) {
          if (!trick.isHeartBroken) {
            System.out.println("Heart is not broken, use another card!");
            

          }else if(playerHand.contains(pickedCard))
          {
            pickedCardValid = true;
            trick.addToPile(name, pickedCard);
            playerHand.remove(pickedCard);
            leadingCard = pickedCard;
            
            System.out.println(
              "The leading card is :" +
              leadingCard.getSuitValue() +
              " of " +
              leadingCard.getSuits()
            );
          }
        } else if(playerHand.contains(pickedCard)){
          pickedCardValid = true;
          trick.addToPile(name, pickedCard);
          playerHand.remove(pickedCard);
          leadingCard = pickedCard;
          System.out.println(
            "The leading card is :" +
            leadingCard.getSuitValue() +
            " of " +
            leadingCard.getSuits()
          );
        }
      } else if (trick.trickPileCards.size() != 0 && playerHand.contains(pickedCard)) {

        if (pickedCard.getSuits() == trick.leadingSuit) {
          trick.addToPile(name, pickedCard);
          pickedCardValid = true;
          playerHand.remove(pickedCard);
          System.out.println(
            "player " +
            name +
            " added " +
            pickedCard.getSuitValue() +
            " of " +
            pickedCard.getSuits() + ", handsize: " + playerHand.size()
          );
        } else if (pickedCard.getSuits() != trick.leadingSuit) {
        if (hasSuit()) {
          if(type.contains("Human")){
         System.out.println("You have the leading suit, which is " + trick.leadingSuit + ", use it!!" );
        } }else {
          trick.addToPile(name, pickedCard);
          pickedCardValid = true;

          playerHand.remove(pickedCard);
          System.out.println(
            "player " +
            name +
            " added " +
            pickedCard.getSuitValue() +
            " of " +
            pickedCard.getSuits() + ", handsize: " +  playerHand.size()
          );
        }
      }
      } 
    } 
  }
} 
