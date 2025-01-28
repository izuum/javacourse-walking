package day5.Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = scanner.nextInt();
        }
        scanner.close();

        for (int i = nums.length - 1; i >= 0; i--) {
            if(i == 0){
                System.out.println(nums[0] + nums[nums.length-1]);
            } else {
                System.out.println(nums[i] + nums[i-1]);
            }
        }
    }
}
