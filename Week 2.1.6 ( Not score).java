import java.util.Scanner;
class SumOfSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int n = sc.nextInt();

        int mult = 1;
        for (int i =1;i <= n;i++){
            mult =mult * i;
        }
        System.out.println("Factorial of number is = " + mult);
        sc.close();
    }
        }
