package Exercise;

import java.util.Random;

public class WarGame {
    private RandomDeck firstplayer;
    private RandomDeck secondplayer;

    public WarGame(RandomDeck r1, RandomDeck r2) {
        firstplayer = r1;
        secondplayer = r2;
        Random r = new Random();

        for (int i = 0; i < 26; i++) {
            int index = r.nextInt(13) + 1;
            int suit = r.nextInt(4) + 1;
            int index2 = r.nextInt(13) + 1;
            int suit2 = r.nextInt(4) + 1;
            switch (suit) {
                case 1:
                    firstplayer.add(new Card(index, 'h'));
                    break;

                case 2:
                    firstplayer.add(new Card(index, 's'));
                    break;
                case 3:
                    firstplayer.add(new Card(index, 'd'));
                    break;
                case 4:
                    firstplayer.add(new Card(index, 'c'));
                    break;
            }
            switch (suit2) {
                case 1:
                    secondplayer.add(new Card(index2, 'h'));
                    break;

                case 2:
                    secondplayer.add(new Card(index2, 's'));
                    break;
                case 3:
                    secondplayer.add(new Card(index2, 'd'));
                    break;
                case 4:
                    secondplayer.add(new Card(index2, 'c'));
                    break;
            }

        }
    }

    public void start() {
        while (firstplayer.counter > 0 && secondplayer.counter > 0) {
            Card c1 = firstplayer.remove();
            Card c2 = secondplayer.remove();
            c1.show();
            System.out.println("VS");
            c2.show();
            if (c1.getValue() > c2.getValue()) {
                firstplayer.add(c1);
                firstplayer.add(c2);
                System.out.println("first player win round");
            } else {
                secondplayer.add(c2);
                secondplayer.add(c1);
                System.out.println("second player win round");
            }
        }
        if (firstplayer.counter == 0) {
            System.out.println("second player win game");
        } else {
            System.out.println("first player win game");
        }
    }
}
