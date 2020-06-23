package task31;

public class Task31 {

    //write a program take a number from user “ whatever number of digits “ and then display summation of digits and stop where summation is one digit
    public static void main(String[] args) {

        for (int i = 0; i <= 5; i += 1) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
}
