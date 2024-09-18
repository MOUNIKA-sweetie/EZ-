//even number
import java.util.Scanner;
public class Javabasics7 {
    public static void main(String[] args) {
        int number,remainder;
        System.out.println("enter the number");
        try (Scanner scan = new Scanner(System.in)) {
            number = scan.nextInt();
        }
        remainder=number%2;
        if(remainder==0)
            System.out.println(number+ "is an even number");
        else
            System.out.println(number+ "is an odd number");
    }


}
