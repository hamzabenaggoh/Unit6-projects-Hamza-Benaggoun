import java.util.ArrayList;
public class Player {
    private ArrayList<Card> hand;
    private String name;
    private Deck deck;

    public Player(String name , Deck d){
        hand = new ArrayList();
        this.name = name;
        this.deck = d;
    }
    public void pickCard(){
        hand.add(deck.getDeck().remove(0));
    }
    public void deal(int numCards){
        for (int i = 0; i < numCards; i++) {
            pickCard();
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Card> getHand() {
        return hand;
    }

    public static void main(String[] args) {
        Deck d = new Deck();
        Player player1 = new Player("Hamza" , d);
        Player player2 = new Player("Bob" , d);

        System.out.println("The full deck of cards:");
        System.out.println(d.toString());
        d.shuffleDeck();
        System.out.println("The full deck of cards now shuffled");
        System.out.println(d.toString());
        player1.deal(3);
        player2.deal(3);
        System.out.println("Player 1 hand");
        System.out.println(player1.getHand());
        System.out.println("Player 2 hand");
        System.out.println(player2.getHand());





    }
}
