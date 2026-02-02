import java.util.Scanner; // Problem.8
class DigitCounter {
     static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter num: ");
        int n = sc.nextInt();
         int rev = 0;

         while (n != 0) {
             int digit = n % 10;
             rev = rev * 10 + digit;
             n = n / 10;}
             System.out.println("reverse  " + rev);
         sc.close();
     }
}
