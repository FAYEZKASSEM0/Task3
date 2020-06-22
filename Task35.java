package task35;

public class Task35 {

    public static void main(String[] args) {
        int row, spc, roundspc, ast, roundast, discound =1 ;
        for (row = 1; row <= 5; row++) {
            roundspc = (row <=3 ) ? 3 - row : row - 3;

            for ( spc = 0; spc < roundspc; spc++) {
                System.out.print(" ");
            }
            if (row <= 3 ) 
                roundast = row * 2 - 1;
            else {
                discound += 4;
                roundast = row*2  - discound;
            }
            
            for (ast = 1; ast <= roundast; ast++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}