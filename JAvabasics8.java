//add two numbers
import java.util.Scanner;
public class JAvabasics8 {
    public static void main(String[] args) {
        int num1,num2,num3;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter the number 1");
            num1=input.nextInt();
            System.out.println("Enter the number 2");
            num2=input.nextInt();
            //it closes the input
        }
        num3=num1+num2;
        System.out.printf("%d + %d = %d",num1,num2,num3);
    }
}
