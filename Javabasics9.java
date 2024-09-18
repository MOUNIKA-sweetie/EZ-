//swap two numbers using temporary variable
import java.util.Scanner;
public class Javabasics9 {
    public static void main(String[] args) {
        int num1,num2,temp;
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("enter the num1");
            num1=input.nextInt();
            System.out.println("enter the num2");
            num2=input.nextInt();
        }
        System.out.printf("Before swapping num1=%d and num2=%d\n",num1,num2);
        temp = num1;
        num1= num2;
        num2 = temp;
        System.out.printf("After swapping num1=%d and num2=%d\n",num1,num2);
    }
}
