import java.util.Scanner;
public class array {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++){
            System.out.println("enter the "+i+"value");
            arr[i]=sc.nextInt();
        }
        System.out.println(arr);
    }
    
}
