import java.util.*;
public class swec8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int factors=0;
        if(n<=1){
            System.out.println("Neither primt nor composite");
        }
        else{
            boolean factorfound=false;
            for(int i=2;i<=(int)Math.sqrt(n);i++){
                if(n%i==0){
                   factorfound=true;
                   break;

                }
            }
            if(factors==false){
                System.out.println("prime number");
            }else{
                System.out.println("composite number");
            }
        }{
            
        }
    }
    
}

