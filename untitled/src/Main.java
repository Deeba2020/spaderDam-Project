import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

  public static void main(String[] args) throws InterruptedException {


    Scanner input = new Scanner(System.in);



    Player[] players = new Player[4];
    Dealer dealer = new Dealer();
    Trick trick = new Trick();

    int turn =0;
    System.out.println("Enter the number active players.");
    int aktivplayers = input.nextInt();

    for (int i = 0; i < 4; i++) {
      if (aktivplayers > 0) {
        aktivplayers--;
        System.out.print("Enter your name:" );
                input.nextLine();

        String userName = input.nextLine();

        players[i] = new Player(trick);
        players[i].setName(userName);

        
      } else {
        players[i] = new AIPlayers(trick);

        players[i].setName("Data " + i);
               

      }
    }
  
    dealer.dealCards(players);



    // while(soreOfAnyPlayer !>100)
  

    for (int trickNumber = 0; trickNumber < 13; trickNumber++) {
      
     System.out.println("Trick " + (trickNumber+1));
        while (trick.trickPileCards.size()<4) {
             int playerIndex = turn % players.length;

            
            if( trickNumber==0 && trick.trickPileCards.size()==0){

            players[playerIndex].startPlay();

            }else {
               players[playerIndex].continuePlay();

            }
            turn++;
            
        }
     
    
     
      String winnersName = trick.whoWonTrick();
      

    
      for (int indexOfPlayer = 0; indexOfPlayer < players.length; indexOfPlayer++) {
        if (winnersName == players[indexOfPlayer].getName()) {
          trick.updateScore(players[indexOfPlayer]);
           turn =indexOfPlayer;

          System.out.println(
            players[indexOfPlayer].getName() + " has scored " + players[indexOfPlayer].getScore()
          );
        }
      }
 /*  for( int i=0; i< players.length; i++){
       
        players[i].displayerPlayerHand();
    } */
      trick.leadingSuit = null;
      TimeUnit.SECONDS.sleep(10);
    }
  }
}

   