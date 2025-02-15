import java.util.Scanner;

public class Flip {
    public static String reverse(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString();
    }

public static void main(String[] args) {
    String oldString = "Hello";
    String mewString = reverse(oldString);
   System.out.println("Here is original String:  " + oldString);
   System.out.println("Here is new string:  " + mewString); 
}
}
