import java.util.*;
public class string01 {
    public static void  main(String args[]){
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter your name :");
        // String name= sc.nextLine();
        // System.out.print("Your Name is : "+name);
        //String name = "Yogesh";
       // String fullName="Yogesh Pandey";


       // Concatenating
    //    String firstName = "Yogesh" ;
    //    String lastName = "Pandey";
    //    String name =firstName +" "+lastName;
    //    //System.out.print(name.length());
    //    for(int i = 0; i < name.length(); i++){
    //     System.out.print(name.charAt(i));
    //    }


    //     String name01 = "Yogesh Pandey";
    //     String name02 = "Manu Pandey";
    //     if(name01.compareTo(name02)==0){
    //         System.out.println("String are equal to each other:");
    //     }else{
    //         System.out.println("String is not equal to each other:");
    //     }


    // substring cutting form sentence
        String sentence = "My name is Yogesh Pandey/";
        String name = sentence.substring(0,sentence.length());// (starting index,ending index)
        System.out.println(name);
     }
    
}
