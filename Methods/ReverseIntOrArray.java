package Methods;

import java.util.Scanner;

public class ReverseIntOrArray {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        ReverseIntOrArray ria = new ReverseIntOrArray();

        System.out.println("Enter the number of elements in array : ");
        int n = scan.nextInt();
        int A[] = new int[n];

        System.out.println("Enter the elements in array : ");
        for (int i = 0; i < n; i++) {
            A[i] = scan.nextInt();
        }

        A = ria.reverse(A);
        for (int i = 0; i < n; i++) {
           System.out.println(A[i]);
        }

        System.out.println("Enter a number to reverse and display : ");
        int number = scan.nextInt();

        System.out.println(ria.reverse(number));
        scan.close();
    }

    int [] reverse(int A[]) {

        int B[] = new int[A.length];

        for(int i = 0,j = A.length-1; i < A.length ;i++, j--){
            B[i] = A[j];
        }

        System.out.println("The elements in array after reversing  : ");
        return B;
       

    }

    int reverse(int x) {

        int reverse = 0;
        int mod;
        while (x > 0) {
            mod = x % 10;
            reverse = reverse * 10 + mod;
            x = x / 10;
        }
        return reverse;
    }

}
