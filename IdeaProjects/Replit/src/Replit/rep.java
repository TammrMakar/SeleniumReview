package Replit;

public class rep {
    public static int[][] reduce10(int[][] nums) {
        int[][] newArray = new int[nums.length][nums[0].length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                newArray[i][j] = nums[i][j] - 10;
            }
        }
        return newArray;
    }

    public static void main(String[] args) {
        int[][] nums = {{1, 2, 3, 4}, {4, 5, 6, 7}, {1, 3, 5, 7}};
        int[][] newArray = reduce10(nums);
        for (int i = 0; i < newArray.length; i++) {
            for (int j = 0; j < newArray[i].length; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }}

















