//Imported Required class from Java Package.
import java.util.Scanner;

class Pattern{
    //Method for pattern Creation.
    void pattern(){
        //Getting input from user
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows ");
        int a = sc.nextInt();
        
        //Pattern Formation
        for (int i = 1; i <= a; i++) {
            //for spaces in the patern
            for (int j = a; j > i; j--) {
                System.out.print(" ");
            }
            
            //forming the pattern
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            // Jumping on the next line.
            System.out.print("\n");
        }
       
        
    }
    public static void main(String[] args){
        //Object Creation to call method.
        Pattern obj = new Pattern();
        obj.pattern();
    }
}
