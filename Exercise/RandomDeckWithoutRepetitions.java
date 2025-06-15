package Exercise;

import java.util.Random;

public class RandomDeckWithoutRepetitions extends RandomDeck {
    private Card lastCard;

    public Card remove() {
        if (counter == 0) {
            return null;
        }
        Random r = new Random();
        int index = r.nextInt(counter);
        Card c = cards[index];
        if (c.equals(lastCard)) {
            return remove();
        }
        for (int i = index; i < counter; i++) {
            cards[i] = cards[i + 1];
        }

        counter--;
        return c;
    }
}
