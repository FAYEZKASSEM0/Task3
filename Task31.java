package task31;

public class Task31 {

   
    public static void main(String[] args) {

       /* PRINT 
       1
       12
       123
       1234
       12345
       */
        for (int i = 0; i <= 5; i += 1) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + 1);
            }
            System.out.println();
        }
    }
}
