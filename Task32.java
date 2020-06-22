package task32;

public class Task32 {

    public static void main(String[] args) {
        for (int i = 0; i <= 5; i += 1) {
            for (int k =4-i; k>=0; k--)
                System.out.print(" ");
            
            for (int j = 0; j < i; j++)
                System.out.print(j + 1);
            
            System.out.println();
        }
    }
    
}
