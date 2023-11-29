import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    //System.out.println("Enter your name using only alphabetic");
    Main main = new Main();
    Scanner input = new Scanner(System.in);

    //System.out.println("name of the active player is " + userName);

    //        System.out.println("round one");

    /*  ActivePlayer a = new ActivePlayer(userName);
        AIThree b = new AIThree();
        AITwo c = new AITwo();
        AIOne d = new AIOne();

        Dealer dealer = new Dealer();
        dealer.addPlayer(a);
        dealer.addPlayer(b);
        dealer.addPlayer(c);
        dealer.addPlayer(d);

        dealer.dealCards(a,b,c,d);

        a.displayHand();
        b.displayHand();
        c.displayHand();
        d.displayHand();

        a.startPlay(a);
        b.startPlay(b);
        c.startPlay(c);
        d.startPlay(d); */
    // Samra change

    Player[] players = new Player[4];
    Dealer dealer = new Dealer();
    Trick trick = new Trick();
    FollowSuit followSuit = new FollowSuit();

    System.out.println("Enter the number active players.");
    int aktivplayers = input.nextInt();

    for (int i = 0; i < 4; i++) {
      if (aktivplayers > 0) {
        aktivplayers--;
        System.out.print("Enter your name:" );
                input.nextLine();

        String userName = input.nextLine();

        players[i] = new Player();
        players[i].setName(userName);

        
      } else {
        players[i] = new AIPlayers();

        players[i].setName("Data " + i);
                System.out.println("Creating AI player "+ players[i].type+" " + players[i].name);

      }
    }
    for( int i=0; i< players.length; i++){
        System.out.println("Player type "+ players[i].type);
    }

    dealer.dealCards(players);


  

    for (int trickNumber = 0; trickNumber < 13; trickNumber++) {
      for (int playerIndex = 0; playerIndex < players.length; playerIndex++) {
        if(trickNumber==0 && trick.trickPileCards.size()==0){
           Card pickeCard= players[playerIndex].startPlay();
           trick.addToPile(players[playerIndex].getName(), pickeCard);
            System.out.println(
            "player  " +
            players[playerIndex].getName() +
            " started the game with  " +
            pickeCard.getSuitValue() +
            " of " +
            pickeCard.getSuits()
          );
        }
        else{
        Card pickeCard = players[playerIndex].continuePlay();
        if (followSuit.isValidSuit(trick.trickPileCards, pickeCard)) {
          trick.addToPile(players[playerIndex].getName(), pickeCard);
          System.out.println(
            "player " +
            players[playerIndex].getName() +
            " added " +
            pickeCard.getSuitValue() +
            " of " +
            pickeCard.getSuits()
          );
        } else {
          pickeCard = players[playerIndex].continuePlay();
          trick.addToPile(players[playerIndex].getName(), pickeCard);
          System.out.println(
            "player " +
            players[playerIndex].getName() +
            " addedededed " +
            pickeCard.getSuitValue() +
            " of " +
            pickeCard.getSuits()
          );
        }
      }
    }
      players[1].displayerPlayerHand();
      String winnersName = trick.whoWonTrick();

      for (int player = 0; player < players.length; player++) {
        if (winnersName == players[player].getName()) {
          trick.updateScore(players[player]);

          System.out.println(
            players[player].getName() + " has scored " + players[player].getScore()
          );
        }
      }

      TimeUnit.SECONDS.sleep(10);
    }
  }
}
