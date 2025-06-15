package Exercise;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

import java.util.LinkedList;

public class DeckPackdownUp extends Deck {
    private Queue<Card> q;

    public DeckPackdownUp() {
        q = new LinkedList<>();
        for (Card c : cards) {
            ((LinkedList<Card>) q).push(c);
        }
    }

    @Override
    public void add(Card c) {
        q.add(c);
        counter++;
    }

    @Override
    public Card remove() {
        if (counter == 0) {
            return null;
        }
        counter--;
        return q.poll();
    }

}
