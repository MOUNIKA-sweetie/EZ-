import java.util.Scanner;
class swec2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number a");
        int a=sc.nextInt();
        System.out.println("Enter a number b");
        int b=sc.nextInt();
        int greatest=(a>b)?a:b;
        System.out.println("The biggest number is "+ greatest);
    }
    
}
