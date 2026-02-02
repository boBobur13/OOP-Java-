import java.util.Scanner;
class DigitCounter {
     static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("enter num: ");
        int n = sc.nextInt();

        int count = 0;

        if (n == 0) {
            count = 1;
        }else {
            while (n!=0){
                n= n/10;
                count++;

            }
        }
         System.out.println("enter num: " + count);
         sc.close();
     }
}
