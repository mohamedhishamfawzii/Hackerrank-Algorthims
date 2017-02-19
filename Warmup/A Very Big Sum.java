import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by mohamedhisham on 2/16/17.
 */

public class problems {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigInteger sum = BigInteger.ZERO ;
        int limit = scanner.nextInt();
       for ( int i =0 ; i<limit; i++)
       {
           sum = sum.add( scanner.nextBigInteger());
       }
System.out.println(sum);
    }

}
