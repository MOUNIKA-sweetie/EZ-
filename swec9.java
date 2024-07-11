public  class swec9 {
    public static void printReverse(int num) {
        if(num == 1) {
            System.out.println(1);
            return;
        }
        System.out.println(num);
        printReverse(num-1);
        System.out.println(num);
        
    }
    public static void main(String[] args) {
        int num = 3;
        printReverse(num);// 32123
    }


}
