package task.pkg33;

public class Task33 {

    public static void main(String[] args) {
       /* PRINT
          *
         ***
        *****
       *******
      *********
         */
        
        
        for (int spc = 4, ast = 1; spc >= 0; spc--, ast += 2) {
            for (int i = 0; i < spc; i++) {
                System.out.print(" ");
            }

            for (int j = 0; j< ast; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}
