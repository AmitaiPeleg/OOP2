package Exercise;

import java.util.Stack;

public class DeckUpAndDown extends Deck {
    private Stack<Card> s;

    public DeckUpAndDown() {
        s = new Stack   <>();
        for (Card c : cards) {
            s.push(c);
        }
    }

    @Override
    public void add(Card c) {
        s.push(c);
        counter++;
    }

    @Override
    public Card remove() {
        if (counter == 0) {
            return null;
        }
        counter--;
        return s.pop();
    }

}
