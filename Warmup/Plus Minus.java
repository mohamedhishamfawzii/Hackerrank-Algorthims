
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by mohamedhisham on 2/16/17.
 */
public class problems {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float postiveCount =0 ;
        float negativeCount =0;
        float zeroCount =0;

        int size = scanner.nextInt();
        int[] numbers = new int[size];
        for ( int i = 0 ; i < size ; i++)
        {
            numbers[i]= scanner.nextInt();
        }
        for (int number:numbers
             ) {
        if ( number>0)
        {
            postiveCount++;
        }
        else if(number<0)
        {
            negativeCount++;
        }
        else {
            zeroCount++;
        }


        }
        DecimalFormat pattern = new DecimalFormat("0.000000");
        System.out.println(pattern.format( new Double(postiveCount/size)));
        System.out.println(pattern.format(new Double(negativeCount/size)));
        System.out.println(pattern.format(new Double(zeroCount/size)));

    }

}
