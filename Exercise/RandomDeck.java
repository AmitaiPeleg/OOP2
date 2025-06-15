package Exercise;

import java.util.Random;

public class RandomDeck extends Deck {
    public void add(Card c) {
        if (counter == 52) {
            return;
        }
        Random r = new Random();
        int index = r.nextInt(counter + 1);
        Card[] res = new Card[52];
        for (int i = 0; i < index; i++) {
            res[i] = cards[i];
        }
        res[index] = c;
        for (int j = index + 1; j <= counter; j++) {
            res[j] = cards[j - 1];
        }
        counter++;
        cards = res.clone();
    }

    public Card remove() {
        if (counter == 0) {
            return null;
        }
        Random r = new Random();
        int index = r.nextInt(counter);
        Card c = cards[index];
        for (int i = index; i < counter; i++) {
            cards[i] = cards[i + 1];
        }
        counter--;
        return c;
    }
}
