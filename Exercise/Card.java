package Exercise;

public class Card implements Cloneable {
    private int value;
    private char suit;

    public Card(int value, char suit) {
        this.value = value;
        this.suit = suit;
    }

    public int getValue() {
        return value;
    }

    public Card clone() throws CloneNotSupportedException {
        return (Card) super.clone();
    }

    public void show() {
        System.out.println(value + ":" + suit);
    }

    public boolean equals(Object o) {
        if (!(o instanceof Card)) {
            return false;
        }
        Card c = (Card) o;
        return value == c.value;
    }
}
