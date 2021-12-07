import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int rem;
        int arm = 0;
        int len = 0;
        System.out.println("Enter any number:");
        int num=scan.nextInt();
        int t1=num;
        while (t1>0)
        {
            t1=t1/10;
            len=len+1;
        }
        int t2=num;
        while(t2!=0)
        {
            rem=t2%10;

            int mul=1;
            mul=mul*rem;
            for(int i=0;i<=len;i++)
            {
                arm=arm+mul;
                t2=t2/10;
            }
        }
        if (arm==num)
        {
            System.out.println("The Number is Armstrong");
        }
        else
        {
            System.out.println("The number is not Armstrong");
        }
    }
}