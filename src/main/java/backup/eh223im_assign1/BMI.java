package backup.eh223im_assign1;

import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your weight in kg: ");
        double weight = scan.nextDouble();
        System.out.print("Enter your height in m: ");
        double height = scan.nextDouble();

        int bmi = (int) (weight / (height * height)); //BMI = W/H^2
        System.out.println("Your BMI is: " + bmi);
        scan.close();
    }
}
