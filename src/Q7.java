import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter first number:");
        float first_num=scan.nextFloat();
        System.out.println("Enter second number");
        float second_num=scan.nextFloat();
        deci(first_num,second_num);
    }
    public static void deci (float first_num, float second_num) {
        if (Math.abs(first_num-second_num)<=0) {
            System.out.println("Same number");
        }
        else {
            System.out.println("Different Number");
        }
    }
}