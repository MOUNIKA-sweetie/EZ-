public class swec5 {
    public static void main(String[] args) {
        int a=6;
        int b=8;
        int c=7;
        if(a>b){
            if(a>c){
                System.out.println(a);

            }
            else{
                System.out.println(c);

            }
        }
        else{
            if(b>c){
                System.out.println("b");
                
        }else{
            System.out.println(c);
        }
    }
    int greatest=(a>b) ? (a>c)?a:c : (b>c)?b:c;
    System.out.println(greatest);
    }
    
}
