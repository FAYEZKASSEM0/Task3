package task34;

public class Task34 {

    public static void main(String[] args) {
      /* PRINT
        *****
         ****
          ***
           **
            *
       */
        for (int i = 0; i <= 5; i += 1) {
            for (int j = 0; j < i; j++)
                System.out.print(" ");
            
            for (int k =4-i; k>=0; k--)
                System.out.print("*");
            
            System.out.println();
        }
    }
    
}
