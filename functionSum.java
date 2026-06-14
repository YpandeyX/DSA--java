import java.util.*;
public class functionSum {
    public static int printProduct(int a, int b){
        
     //   System.out.print("Multiply = " +(a * b));
        return a * b; 
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No. a :");
        int a = sc.nextInt();

        System.out.print("Enter No. b :");
        int b = sc.nextInt();

        System.out.print("Product of this number is: "+ printProduct(a,b));
        

    }
}
