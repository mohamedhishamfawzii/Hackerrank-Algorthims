
import java.util.Scanner;

/**
 * Created by mohamedhisham on 2/16/17.
 */
public class problems {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        for ( int i =0 ; i < size ; i++)
        {
            for ( int j =0 ; j<size ; j++)
            {
                if (i+j > size -2 )
                    System.out.print("#");
                else  System.out.print(" ");

            }
            System.out.print("\n");

        }
    }

}
