import java.util.Scanner;
public class swec6 {
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int factors=0;
    if(n<=1){
        System.out.println("Neither prime nor composite");

    }
    else{
        for (int i=1;i<=n;i++){
        if(n%i==0){
            factors++;
        }
    }
        if(factors==2){
            System.out.println("prime number");
        }
        else{
            System.out.println("composite number");
        }
    }
}
}    

