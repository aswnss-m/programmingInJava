//To check whether a number is prime or not
// Author Aswin Lal

//To get input
import java.util.Scanner;

public class checkPrime {
    // function returns true if prime else false
    static boolean check_Prime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int num;
        Scanner Sr = new Scanner(System.in);
        System.out.print("Enter the number : ");
        num = Sr.nextInt();

        // function call as condition
        if (check_Prime(num)) {
            System.out.println("PRIME !");
        } else {
            System.out.println("NOT PRIME !");
        }
    }
}
