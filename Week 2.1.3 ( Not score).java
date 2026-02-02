import java.util.Scanner;
public class GradeCalculator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("enter score ");
        int score = sc.nextInt();
        if (score < 0 || score > 100) {
            System.out.println("Invalid score");
        } else if (score >= 86) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else if (score >= 65) {
            System.out.println("Grade: C");
        } else if (score >= 40) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Grade: F");
        }
        sc.close();
    }
}
