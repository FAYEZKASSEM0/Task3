package task37;

import java.util.Scanner;

public class Task37 {

     //write a program take a number from user “ whatever number of digits “ and then display summation of digits and stop where summation is one digit
    public static void main(String[] args) {
        System.out.print("please enter a number: ");
        Scanner t = new Scanner(System.in);
        long num = t.nextLong();
        int nums[] = new int[19];

        int sum = 0;
        for (int j = 0; num > 9; j++) {
            for (int i = 0; i < 19; i++) {
                int dig = (int) (num % 10);
                nums[i] = dig;
                num = num / 10;
                sum = sum + nums[i];
            }
            num = sum;
            sum = 0;
            for (int i = 0; i < 19; i++) {
                nums[i] = 0;
            }

        }
        System.out.println(num);
    }
}
