import java.util.Scanner;
 class swec4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        for(int i=1;i<=a;i++){
            if(i%2==0)
            System.out.println(i);

        }
    int j=2;
    while(j>=a){
        if(j%2==0){
            System.out.println(j);

        }
        j+=2;
    }
    
}}
