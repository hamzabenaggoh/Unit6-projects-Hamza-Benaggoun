import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListAssignment {
    public static void main(String[] args) {
        System.out.println("Test Remove Zeros");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(3,4,0,0,1,4,0,6,0));
        System.out.println("Starting List: " + nums);
        removeZeros(nums);
        System.out.println("Expected: [3, 4, 1, 4, 6] \n Actual: " + nums);

        System.out.println();

        ArrayList<String> words = new ArrayList<>(Arrays.asList("this", "is", "a", "list", "of", "words"));
        System.out.println("Test Letter Counter:");
        System.out.println(words);
        System.out.println("Expected: 18 \n Actual: " + countLetters(words));

        System.out.println();

        System.out.println("Test keyPosition: find a 1");
        System.out.println(nums);
        System.out.println("Expected: 2 \n Actual: " + findPosition(1, nums));

        System.out.println();

        System.out.println("Test parse into array");
        System.out.println("Expected: [W, e, s, t, , L, i, n, n] \n Actual: " + parseIntoArrayList("West Linn"));

        System.out.println();

        System.out.println("Test FindMin for Personobjects");
        ArrayList<Person> people = new ArrayList<>(Arrays.asList(new Person(32, "Abe"),
                new Person(14, "Betty"), new Person(18, "Cris")));
        System.out.println(people);
        System.out.println("Expected: BETTY \n Actual: " + findMin(people));

        System.out.println();

        System.out.println("Purse Test:");
        Purse myPurse = new Purse();
        myPurse.add(new Coin(.25, "quarter"));
        myPurse.add(new Coin(.05, "nickel"));
        myPurse.add(new Coin(.01, "penny"));
        myPurse.add(new Coin(.25, "quarter"));

        System.out.println(myPurse);
        System.out.println("# of Quarters = " + myPurse.count(new Coin(.25, "quarter")));
        System.out.println("Smallest Coin = " + myPurse.findSmallest());
        System.out.println("Total of Purse = $" + myPurse.getTotal());

    }

    public static void removeZeros(ArrayList<Integer> list) {
        for (int i = list.size() - 1; i > 0 ; i--) {
            if (list.get(i) == 0){
                list.remove(i);
            }
        }
    }
    public static int countLetters(ArrayList<String> list){
        int len = 0;
        for (String x : list){
            len += x.length();
        }
        return len;
    }
    public static int findPosition(int keyValue , ArrayList<Integer> list){
        int out = -1;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == keyValue){
                out = i;
            }
        }
        return out;
    }
    public static ArrayList<String> parseIntoArrayList(String input){
        ArrayList<String> list = new ArrayList<String>();
        for (int i = 0; i <input.length() ; i++) {
            list.add(input.substring(i , i + 1));
        }
        return list;
    }
    public static String findMin(ArrayList<Person> list){
        int youngest = 32;
        String out = "";
        for (Person x : list){
            if (x.getAge() <= youngest){
                out = x.getName();
            }
        }
        return out;
    }

}
