public class Trick {

    private final int MAX_TRICK = 13;
    private int trickNo = 0;

//    public boolean isTrickEnded (Player player) {
//        boolean trickEnded;
//
//        if (trick.getTrickNo() == trick.getMAX_TRICK()) {
//            for ()
//
//        }
//    }




//    public boolean isTrickEnded (Player player){
//        boolean trickEnded ;
//
//        if (trickNo == MAX_TRICK){
//
//
//
//        }
//        if (player.getScore()==MAX_SCORE || player.getScore()>MAX_SCORE){
//            System.out.println("game ended and"+ player+"is the looser");
//            roundEnded = true;
//        }
//        else {
//            roundEnded = false;
//        }
//
//        return trickEnded;
//    }


    public int getMAX_TRICK() {
        return MAX_TRICK;
    }

    public int getTrickNo() {
        return trickNo;
    }
}
