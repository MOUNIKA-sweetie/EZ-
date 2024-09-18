//Instance variables
public class Javabasics5 {
    // Declared Instance Variable
    //class Javabasics5{
    //int data=15;
    //float pi=3.14
    //}
    public String geek;
    public int i;
    public Integer I;
    public Javabasics5()
    {
        // Default Constructor
        // initializing Instance Variable
        this.geek = "Shubham Jain";
    }

    // Main Method
    public static void main(String[] args)
    {
        // Object Creation
        Javabasics5 name = new Javabasics5();

        // Displaying O/P
        System.out.println("Geek name is: " + name.geek);
        System.out.println("Default value for int is "
                           + name.i);
      
        // toString() called internally
        System.out.println("Default value for Integer is "
                           + name.I);
    }

}
