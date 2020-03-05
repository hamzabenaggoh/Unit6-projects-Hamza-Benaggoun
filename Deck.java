import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class Deck {
    public ArrayList<Card> deck;

    public Deck(){
        this.deck = new ArrayList<>();
        for (int a = 0 ; a < Card.RANK.length; a++){
            Card temp = new Card();
            temp.setRank(Card.RANK[a]);
            for (int b = 0; b < Card.SUIT.length ; b++){
                temp.setSuit(Card.SUIT[b]);
                deck.add(temp);
            }
        }
    }

    public ArrayList<Card> getDeck() {
        return deck;
    }
    public void shuffleDeck(){
        Collections.shuffle(deck);
    }

    public String toString(){
        String result = "";
        for (Card c : deck){
            result += "|";
            result += c.toString();
        }
        return result;
    }
    public int size(){
        return this.deck.size();
    }
    public static void main(String[] args) {
        Deck d = new Deck();
        System.out.println(d.toString());
        d.shuffleDeck();
        System.out.println(d.toString());

    }
}
