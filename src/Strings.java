import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
     char arr[]={'a','b','c','d'};
     // Ways of initialisation of strings is written below
     String str = new String("abcd");
     String str2 = "abcd";

  // Strings are IMMUTABLE

// For taking input from the user we use  the below things
Scanner sc = new Scanner(System.in);
String name ;
//name  = sc.next();

    // For getting the size of the string we need to use this cmd
        String fullname = "shashwat chaturvedi " ;
        System.out.println(fullname.length());


        // CONCATINATION -COMBINING TWO STRINGS TOGETHER

        String firstname= "Shashwat ";
        String Firstname = "chaturvedi";
        String fullname1 = firstname + " " + Firstname;
        System.out.println( fullname1);


        // For accessing elements in the String we use charAt() function

    }
}
