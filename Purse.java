// A Purse holds a collection of Coins
import java.util.ArrayList;
import java.util.Arrays;

public class Purse {
    private ArrayList<Coin> coins;

    public Purse() {
        coins = new ArrayList();
    }

    // adds aCoin to the purse
    public void add(Coin aCoin) {
        coins.add(aCoin);
    }

    // returns total value of all coins in purse
    public double getTotal() {
        double sum =0;
        for (int i = 0; i < this.coins.size(); i++) {
            sum += coins.get(i).getValue();
        }
        return sum;
    }

    // returns the number of coins in the Purse that matches aCoin
// (both myName & myValue)
    public int count(Coin aCoin) {
        int total = 0;
        for (Coin c : this.coins) {
            if (c.equals(aCoin)) {
                total++;
            }
        }
        return total;
    }
    public String findSmallest(){
        double smallest = 0.25;
        String out = "";
        for (Coin x : this.coins){
            if (x.getValue() <= smallest){
                smallest = x.getValue();
                out = x.getName();
            }
        }
        return out;
    }
}
