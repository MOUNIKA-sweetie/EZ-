import java.util.Scanner;
class swec3 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int greatest=(a>b)?a:b;
    if(a>b)
    {
        System.out.println("a is greater than b");
    }else
    {
        System.out.println("b is greater than a");
    }
}}