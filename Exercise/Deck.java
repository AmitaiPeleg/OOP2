package Exercise;

public abstract class Deck {
    protected Card[] cards;
    protected int counter;

    public Deck() {
        cards = new Card[52];
        counter = 0;
    }

    public abstract void add(Card c);

    public Deck clone() throws CloneNotSupportedException {
        Deck cloned = (Deck) super.clone();
        cloned.cards = new Card[cards.length];
        for (int i = 0; i < cards.length; i++) {
            cloned.cards[i] = cards[i].clone();
        }
        return cloned;
    }

    public void show() {
        for (int i = 0; i < counter; i++) {
            cards[i].show();
        }
    }

    public abstract Card remove();
}
