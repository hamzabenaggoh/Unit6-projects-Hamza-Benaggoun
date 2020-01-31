import java.util.Scanner;
public class FrequencyChart {
    private int[] list;
    private String c = "";
    public FrequencyChart(int[] list){
        this.list = list;
    }
    public String makeChart(){
        String s1 ,s2, s3, s4, s5, s6, s7, s8, s9, s10;
        s1 = "1 - 10  | ";
        s2 = "11 - 20 | ";
        s3 = "21 - 30 | ";
        s4 = "31 - 40 | ";
        s5 = "41 - 50 | ";
        s6 = "51 - 60 | ";
        s7 = "61 - 70 | ";
        s8 = "71 - 80 | ";
        s9 = "81 - 90 | ";
        s10 ="91 - 100| ";
        for (int num : list){
            if (num >= 1 && num <= 10){
                s1 += "*";
            }
            else if (num >= 11 && num <= 20)
                s2 += "*";
            else if (num >= 21 && num <= 30)
                s3 += "*";
            else if (num >= 31 && num <= 40)
                s4 += "*";
            else if (num >= 41 && num <= 50)
                s5 += "*";
            else if (num >= 51 && num <= 60)
                s6 += "*";
            else if (num >= 61 && num <= 70)
                s7 += "*";
            else if (num >= 71 && num <= 80)
                s8 += "*";
            else if (num >= 81 && num <= 90)
                s9 += "*";
            else
                s10 += "*";
        }
        return s1 + "\n" + s2 + "\n" + s3 + "\n" + s4 + "\n" + s5 + "\n" + s6 + "\n" + s7 + "\n" + s8 + "\n" + s9 + "\n" + s10;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many values in data set?");
        int size = scan.nextInt();

        int[] data = new int[size];

        System.out.println("Enter values one at a time followed by enter");

        int val = 0;
        for(int i = 0 ; i < data.length ; i++){
            val = scan.nextInt();
            data[i] = val;
        }

        FrequencyChart chart = new FrequencyChart(data);

        System.out.println(chart.makeChart());

    }
}