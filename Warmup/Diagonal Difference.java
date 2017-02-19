
import java.util.Scanner;

/**
 * Created by mohamedhisham on 2/16/17.
 */
public class problems {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int mainD=0 ;
        int secD =0 ;
       int [][] matrix = new int[size][size];
       for (int i =0 ; i <size; i++ )
        {
            for ( int j =0 ; j<size ; j++)
            {
                matrix[i][j] = scanner.nextInt();
            }
        }
        for (int i =0 ; i <size; i++ )
        {
            for ( int j =0 ; j<size ; j++)
            {
                if (i == j)
                    mainD += matrix[i][j];
                if (i+j == size-1 )
                    secD += matrix[i][j];


            }
        }

        System.out.println(Math.abs(mainD-secD));
    }

}
