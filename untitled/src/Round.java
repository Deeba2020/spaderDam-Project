public class Round {
    List<Player> players;

    public Round(List<Player> players) {
        this.players = players;
    }

    public void playTrick() {
        Trick trick;

        if (firstTrick) {
            trick = new FirstTrick();
        } else {
            trick = new Trick();
        }

        trick.play();
    }
}
