import java.util.Random;

public class Assignment2 {
    public static void main(String[] args){
        Random rand = new Random();
        int[][] arr = new int[10][10];
        for(int i = 0; i < 10; i++){
            for (int j = 0; j < 10; j++){
                arr[i][j] = rand.nextInt(1000);
            }
        }


        int max = 0;
        int iLoc = -1;
        int jLoc = -1;
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr[i].length; j++){
                if (max < arr[i][j]){
                    max = arr[i][j];
                    iLoc = i;
                    jLoc = j;
                }
            }
        }

        Assignment2 asgn2 = new Assignment2();
        asgn2.print2DArray(arr);
        System.out.printf("Max Item in array is %d in location (%d, %d).\n", max, iLoc, jLoc);
    }

    public void print2DArray(int[][] arr){
        System.out.printf("[");
        for (int i = 0; i < arr.length; i++){
            System.out.printf("[");
            for (int j = 0; j < arr[i].length; j++){
                System.out.printf("%d", arr[i][j]);
                if (j != arr[i].length - 1){
                    System.out.printf(",");
                }
            }
            System.out.printf("]");
            if (i != arr.length - 1){
                System.out.printf(",\n");
            }
        }
        System.out.printf("]\n");
    }
}
