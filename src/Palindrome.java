import java.util.Scanner;
public class Palindrome {
    public static void main(String args[]) {
        String x, y = "";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Character:");
        x = sc.nextLine();
        int n = x.length();
        for(int i = n - 1; i >= 0; i--)
        {
            y = y + x.charAt(i);
        }
        if(x.equalsIgnoreCase(y))
        {
            System.out.println("The Character Is Palindrome.");
        }
        else
        {
            System.out.println("The Character Is Not A Palindrome.");
        }
    }
}