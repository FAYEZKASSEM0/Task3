package test;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        List<String> temp = new ArrayList<>();
        List<Integer> nums = new ArrayList<>();
        int sum = 0;
        nums.add(0);
        nums.add(1);

        System.out.print("please enter a number: ");
        Scanner t = new Scanner(System.in);
        String num = t.nextLine();
        
        for (int j = 0; nums.size() > 1; j++) {
            sum = 0;
            nums.clear();
            
            String strarr[] = num.split("");
            temp = Arrays.asList(strarr);
            for (int i = 0; i < temp.size(); i++) {
                nums.add(Integer.parseInt(temp.get(i)));
                sum = sum + nums.get(i);
            }

            num = String.valueOf(sum);
            
        }
        System.out.println(sum);

    }
}
