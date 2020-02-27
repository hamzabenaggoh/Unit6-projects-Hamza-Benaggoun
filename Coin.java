// A Coin represents a real world coin such as a "quarter" which
// has a value of 0.25, a "half dollar" which has value of 0.50, etc.
// A class invariant holds that 0.00 < all coin values <= 1.00
import java.util.ArrayList;
import java.util.Arrays;
public class Coin {

    private double myValue;
    private String myName;

    public Coin(double value, String name) {
        myValue = value;
        myName = name;
    }

    public double getValue() {
        return myValue;
    }

    public String getName() {
        return myName;
    }

    // returns true if this coin is equal to aCoin,
// which means the name and the value are both equal
    public boolean equals(Coin aCoin) {
        if (this.myName.equals(aCoin.getName()) && this.myValue == aCoin.getValue()){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Coin c = new Coin(0.25 , "Quarter");
        Coin c2 = new Coin(0.5 , "Half-Dollar");
        System.out.println(c.equals(c2));
    }
}
