package Exercise;

public class Program {
    public static void main(String[] args) {
        Deck d = new RandomDeckWithoutRepetitions();
        d.add(new Card(1, 'h'));
        d.show();
        System.out.println();
        d.add(new Card(2, 's'));
        d.add(new Card(2, 's'));

        d.show();
        System.out.println();

        d.remove();
        d.show();
        d.remove();
        System.out.println();
        d.show();
    }
}
