import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float timeSeconds;
        float mps,kph, mph;
        System.out.print("Enter distance in meters: ");
        float distance = sc.nextFloat();
        System.out.print("Enter hour: ");
        float hr = sc.nextFloat();
        System.out.print("Enter minutes: ");
        float min = sc.nextFloat();
        System.out.print("Enter seconds: ");
        float sec = sc.nextFloat();
        timeSeconds = (hr*3600) + (min*60) + sec;
        mps = distance / timeSeconds;
        kph = ( distance/1000.0f ) / ( timeSeconds/3600.0f );
        mph = kph / 1.609f;
        System.out.println("Speed in meters/second is "+mps);
        System.out.println("Speed in km/h is "+kph);
        System.out.println("Speed in miles/h is "+mph);
    }
}