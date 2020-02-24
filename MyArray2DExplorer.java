
public class MyArray2DExplorer {

    public static void main(String[] args) {
        int array[][] = {{4, 1, 8, 5},
                {0, 2, 3, 4},
                {6, 6, 2, 2}};
        MyArray2DExplorer exp = new MyArray2DExplorer();

        System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array, 0));
        System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array, 2));

        System.out.println();

        System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array, 1));
        System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array, 0));

        System.out.println();


        System.out.print("Test minRow: \n Expecting: {0 2 3 4} \n Actual: {");
        int[] row = exp.minRow(array);
        for (int i = 0; i < row.length; i++) {
            System.out.print(row[i] + " ");
        }
        System.out.print("]");

        System.out.println();

        System.out.print("Test minRowAssignment: \n Expecting: 2 \n Actual: ");
        System.out.println(exp.minRowAssignment(array, 2));

        System.out.println();

        System.out.print("Test colMax: \n Expecting: {6 6 8 5} \n Actual: {");
        int[] colMaxs = exp.colMaxs(array);
        for (int i = 0; i < colMaxs.length; i++) {
            System.out.print(colMaxs[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test allRowSum: \n Expecting: {18 9 16} \n Actual: {");
        int[] sum = exp.allRowSums(array);
        for (int i = 0; i < sum.length; i++) {
            System.out.print(sum[i] + " ");
        }
        System.out.print("}");

        System.out.println();
        System.out.println();

        System.out.print("Test averageCol: \n Expecting: {3.333333 3.0 4.333333 3.6666667} \n Actual: {");
        double[] avg = exp.averageCol(array);
        for (int i = 0; i < avg.length; i++) {
            System.out.print(avg[i] + " ");
        }
        System.out.print("}");


        System.out.println();
        System.out.println();

        System.out.print("Test smallEven: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.smallEven(array));

        System.out.println();
        System.out.println();

        System.out.print("Test biggestRow: \n Expecting: 0 \n Actual: ");
        System.out.println(exp.biggestRow(array));

        System.out.println();
    }

        //WRITE YOUR METHODS BELOW

        public boolean evenRow ( int[][] mat, int row){
            boolean check = true;
            for (int i = 0; i < mat[row].length; i++) {
                if (mat[row][i] % 2 != 0) {
                    check = false;
                }
            }
            return check;

            //returns true if the sum of the numbers the given col is odd.
        }

    public boolean oddColSum(int [][] nums , int col){
        int sum = 0;
        for (int i = 0 ; i < nums.length; i++){
            sum += nums[i][col];
        }
        return (sum % 2 != 0);

    }

    public int[] minRow(int[][]nums){
        int smallest = 0;
        int[] arr = new int[nums.length];
        for(int i = 0; i < nums.length ; i++){
            for (int c = 0 ; c < nums[i].length ; c++){
                if (nums[i][c] <= smallest){
                    smallest = nums[i][c];
                }
            }
        }
        for (int j = 0 ; j < nums.length ; j++){
            for (int k = 0 ; k < nums[j].length ; k++){
                if (nums[j][k] == smallest){
                    return nums[j];
                }
            }
        }
        return null;
    }
    public int minRowAssignment(int[][] array , int row){
        int smallest = 10;
        for (int i = 0; i < array[row].length ;i++ ){
            if (array[row][i] <= smallest){
                smallest = array[row][i];
            }
        }
        return smallest;
    }

    public static int[] colMaxs(int[][] matrix){ //FIX THIS METHOD
        int[] colsMax = new int[matrix[0].length];
        for (int i = 0; i < matrix.length ; i++){
            int max = matrix[0][i];
            for (int j = 0; j < matrix.length ; j++) {
                if (matrix[j][i] >= max){
                    max = matrix[j][i];
                }
            }
            colsMax[i] = max;
        }
        return colsMax;
    }

    public int[] allRowSums(int[][] data){
        int[] output = new int[3];
        int rowSum = 0;
        for (int r = 0 ; r < data.length ; r++){
            for (int c = 0 ; c < data[r].length ; c++){
                rowSum += data[r][c];
            }
            output[r] = rowSum;
            rowSum = 0;
        }
        return output;
    }

    public double[] averageCol(int[][] nums){ //Fix this method
        int sumC = 0;
        double[] output = new double[3];
        for (int r = 0 ; r < nums.length ; r++){
            for (int c = 0 ; c < nums.length ; c++){
                sumC += nums[r][c];
            }
            output[r] = (double) sumC;
            sumC = 0;
        }
        return output;
    }

    public int smallEven(int[][] matrix) {
        int smallEven = 8;
        for (int r = 0; r < matrix.length; r++) {
            for (int c = 0; c < matrix.length; c++) {
                int x = matrix[r][c] % 2;
                if (x <= smallEven){
                    smallEven = matrix[r][c];
                }
            }
        }
        return smallEven;
    }

    public static int biggestRow(int[][] nums){ //Fix this method
        int b = 0;
        MyArray2DExplorer exp2 = new MyArray2DExplorer();
        int[] test = exp2.allRowSums(nums);
        int bRow = 0;
        for (int n : test){
            bRow = n;
            if (n > bRow){
                bRow = n;
            }
        }
        for (int i = 0 ; i < test.length ; i++){
            if (test[i] == bRow){
                b = i;
            }
        }
        return b;

    }
}

        /*
        int array [][] = {  {4,1,8,5},
                {0,2,3,4},
                {6,6,2,2} };
        MyArray2DExplorer exp = new MyArray2DExplorer();

        System.out.println("Test evenRow: \n Row w/ odd, Expecting: false \n Actual: " + exp.evenRow(array,0));
        System.out.println("Test evenRow: \n Row w/o odd, Expecting: true \n Actual: " + exp.evenRow(array,2));

        System.out.println();

        System.out.println("Test oddColSum: \n Col w/ odd Sum, Expecting: true \n Actual: " + exp.oddColSum(array,1));
        System.out.println("Test oddColSum: \n Col w/ even, Expecting: false \n Actual: " + exp.oddColSum(array,0));

        System.out.println();


        System.out.print("Test minRow: \n Expecting: {0 2 3 4} \n Actual: {");
        int [] row = exp.minRow(array);
        for(int i = 0; i < row.length; i++){
            System.out.print(row[i] + " ");
        }
        System.out.print("]");

        System.out.print("\n Test colMaxs: \n Expecting: {6 6 8 5} \n Actual: {");
        int [] test = exp.colMaxs(array);
        for (int num : test){
            System.out.print(num + " ");
        }
        System.out.print("}");

        System.out.print("\n Test allRowSums: \n Expecting: {18 9 16} \n Actual: {");
        int [] test2 = exp.allRowSums(array);
        for (int num : test2){
            System.out.print(num + " ");
        }
        System.out.print("}");


        System.out.print("\n Test averageCol: \n Expecting: {3.33 3 3.67} \n Actual: {");
        double[] test3 = exp.averageCol(array);
        for (double num : test3){
            System.out.print(num + " ");
        }
        System.out.print("}");


        System.out.print("\n Test smallEven: \n Expecting: 2 \n Actual: " + exp.smallEven(array));

        System.out.print("\n Test biggestRow: \n Expecting: 0 \n Actual: " + exp.biggestRow(array));



    }

*/