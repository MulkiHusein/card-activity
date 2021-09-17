package carddeck;

import java.util.Objects;

public class Card {

    private Suit suit;
    private FaceValue value;

    public Card(Suit suit, FaceValue value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return suit;
    }

    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    public FaceValue getValue() {
        return value;
    }

    public void setValue(FaceValue value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return Objects.equals(suit, card.suit) && Objects.equals(value, card.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(suit, value);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Card{");
        sb.append("suit=").append(suit);
        sb.append(", value=").append(value);
        sb.append('}');
        return sb.toString();
    }
}
