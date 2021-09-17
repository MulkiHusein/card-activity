package carddeck;


import java.util.ArrayList;
import java.util.List;

public class StandardDeck extends AbstractDeck{


    public StandardDeck(){
        this.cards = newDeck();
    }

   public List<Card> newDeck(){

        List<Card> newDeck = new ArrayList<>();

        for (Suit suit : Suit.values())
        {
            for (FaceValue faceValue: StandardFaceValue.values()){
                newDeck.add(new Card(suit, faceValue));
            }
        }
        return newDeck;
   }



    @Override
    public void cut(int index) {

    }

    @Override
    public Card deal() {
        return null;
    }

    @Override
    public void newOrder(Deck deck) {

    }

    @Override
    public int search(Card card) {
        return 0;
    }

    @Override
    public void shuffle() {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public Card turnOver() {
        return null;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("StandardDeck{");
        sb.append("cards=").append(cards);
        sb.append('}');
        return sb.toString();
    }
}
