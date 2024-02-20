import java.util.Scanner;

public class BMI {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Type your height: (meters)");
        float height = Float.parseFloat(scan.nextLine());
        System.out.println("Type your weight: (kilograms)");
        int weight = Integer.parseInt(scan.nextLine());
        scan.close();
        int bmi = Math.round(weight / (height*height));
        System.out.println("BMI: " + bmi);



        }
    }
