//Program to find the second smallest in an array
// Author Aswin Lal

//To get input
import java.util.Scanner;

public class secondSmallest {
    static int secondsmallest(int[] arr, int size) {
        int temp;

        // Sorting the array in descending order
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] >= arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        // second element
        return arr[1];
    }

    public static void main(String[] args) {
        Scanner Sr = new Scanner(System.in);
        int size;
        // Getting the size of array
        System.out.print("Enter the size of the array : ");
        size = Sr.nextInt();

        // Declaring and Getting the elements in the array
        int[] arr = new int[size];
        System.out.println("Enter the elements");
        for (int i = 0; i < size; i++) {
            arr[i] = Sr.nextInt();
        }

        // function call
        int snd_sml = secondsmallest(arr, size);
        System.out.println("The Second smallest element is : " + snd_sml);
        Sr.close();
    }
}
