import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter weight: ");
        float weight = sc.nextFloat();
        System.out.println(" Enter height: ");
        float height = sc.nextFloat();
        float ans=order(weight, height);
        System.out.println("BMI ; " + ans);
    }
    public static float order(float weight, float height) {
        return weight/(height*height);
    }
}