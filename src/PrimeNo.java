import java.util.Scanner;
public class PrimeNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter a number");
        num = sc.nextInt();
        prime(num);
    }
    public static void prime(int num) {

        for (int i = 2; i < num; i = i + 1) {
            int counter = 0;
            for (int j = 1; j <= i; j = j + 1) {
                if (i % j == 0)
                    counter = 1;
            }
            if (counter == 1)
                System.out.println(i);
        }
    }
}