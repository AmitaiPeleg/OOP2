package Exercise;

public class Program {
    public static void main(String[] args) {
        WarGame w = new WarGame(new RandomDeck(), new RandomDeck());
        w.start();
    }
}
