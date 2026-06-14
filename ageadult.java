import java.util.*;
 public class practice{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age :");
        int age = sc.nextInt();
        System.out.print("Your age is : "+age);
        if(age>18){
            System.out.print("\nYour are Adult");
    
        }else{
            System.out.print("Your are not Adult");
        }



    }
}
