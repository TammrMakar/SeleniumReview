package Review5;

public class Task3 {
    public static void main(String[] args) {

        int[][] numbers={{1,2,3},{11,12,13},{20,21,22},{100,101}};

       int sum=0;
        for (int[] nums:numbers) {
            for (int num : nums) {
                sum += sum;

            }

        }
        System.out.println("Total ="+sum);}}

