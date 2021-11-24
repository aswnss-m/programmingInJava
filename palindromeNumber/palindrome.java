//To get input
import java.util.Scanner;

public class palindrome{
    //function to reverse the number
    static int reverse(int num){
        int rev=0;
        while(num != 0){
            rev = (rev*10) + (num%10);
            num = num/10;
        }
        //returning the reversed number
        return rev;
    }
    public static void main(String args[]){
        int num,revnum;
        Scanner Sr = new Scanner(System.in);
        System.out.print("Enter a number : ");
        
        //getting the input
        num = Sr.nextInt();
        revnum = reverse(num); //function call
        
        System.out.println("Reversed : "+ revnum);
        
        //checking whether palindrome or not
        if(revnum == num)
            System.out.println("Palindrome!");
        else
            System.out.println("Not Palindrome!");
    }
}