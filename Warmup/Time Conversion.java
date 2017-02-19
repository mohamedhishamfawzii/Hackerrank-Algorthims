
import java.util.Scanner;

/**
 * Created by mohamedhisham on 2/16/17.
 */
public class problems {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String date = scanner.next();
        String[] contents = new String[3];
        if (date.contains("PM")) {
            contents = date.split(":");
            if (Integer.parseInt(contents[0]) == 12) {
                contents[0] = "12";
            } else {
                contents[0] = Integer.parseInt(contents[0]) + 12 + "";

            }
            contents[2] = contents[2].replace("PM", "");
        } else if (date.contains("AM")) {
            contents = date.split(":");
            if (Integer.parseInt(contents[0]) == 12) {
                contents[0] = "00";
            }

            contents[2] = contents[2].replace("AM", "");

        }
        System.out.println(contents[0] + ":" + contents[1] + ":" + contents[2]);

    }
}

