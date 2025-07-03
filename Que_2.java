import java.util.Scanner;

public class Que_2 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);

       System.out.println("enter string to cheak palidrome or not ...");
       String orignal_str = sc.nextLine();

       String str = orignal_str.toLowerCase();

       String reversed = "";
       for(int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
          if(str.equals(reversed)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }
    }
}
