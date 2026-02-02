import java.util.Scanner;

class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter weight:(kg):");
        double weight = sc.nextDouble();
        System.out.print("Enter height:(metr): ");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.printf("BMI: %.1f"  , bmi);
        if (bmi < 18.5) {
            System.out.println("Category:Underweight");
        } else if (bmi < 25.0) {
            System.out.println("Category: normal weight");
        } else if (bmi < 30.0) {
            System.out.println("Category:Overweight");
        } else {
            System.out.println("Category:Obese");
        }
        sc.close();
    }
}
