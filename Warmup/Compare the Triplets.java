import java.util.Scanner;

/**
 * Created by mohamedhisham on 2/16/17.
 */
 class triplet {
    int a,b,c ;
    int score ;
    public triplet(int a , int b , int c ){
        this.a =a;
        this.b= b;
        this.c =c ;

    }

}
public class problems {


    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
       triplet first = new triplet(a.nextInt(),a.nextInt(),a.nextInt());
       triplet second = new triplet(a.nextInt(),a.nextInt(),a.nextInt());
       if (first.a > second.a)
       {
           first.score ++ ;

       }else if (second.a > first.a)
       {
           second.score++;
       }
        if (first.b > second.b)
        {
            first.score ++ ;

        }else if (second.b > first.b)
        {
            second.score++;
        }
        if (first.c > second.c)
        {
            first.score ++ ;

        }else if (second.c > first.c)
        {
            second.score++;
        }


System.out.println(first.score +" "+ second.score);
    }

}
