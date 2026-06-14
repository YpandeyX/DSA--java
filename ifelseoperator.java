import java.util.*;
public class ifelseoperator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter No a:");
        int a = sc.nextInt();
        System.out.print("Enter No b:");
        int b = sc.nextInt();
        if(a==b){
            System.out.print("No. is Equal");
        }
        else if(a>b){
            System.out.print("No.a is greater than No.b");
        }
        else{
            System.out.print("No.b is greater than No.a");
        }
        



    }
}