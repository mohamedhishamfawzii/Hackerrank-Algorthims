
import java.util.Scanner;

/**
 * Created by mohamedhisham on 2/16/17.
 */
public class problems {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        int k = scanner.nextInt();
        int q = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        /*  correct but for optimization one kan git rid of the outer loop and instead of (i+1)%n , becomes (i+k)%n
        so instead o(n^2) becomes o(n)
        for (int j = 0; j < k % n; j++) {
            int[] theRotated = new int[n];
            for (int i = 0; i < n; i++) {
                theRotated[(i + 1) % n] = a[i];
            }
            a = theRotated;
        }*/
        int[] theRotated = new int[n];
        for (int i = 0; i < n; i++) {
            theRotated[ (i + k) % n] = a[i];
        }

        for (int i = 0; i < q; i++
                ) {
            System.out.println(theRotated[scanner.nextInt()]);
        }


    }
}

