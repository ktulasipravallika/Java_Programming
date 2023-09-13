package Methods;

import java.util.Scanner;

public class MaxElementArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        MaxElementArray mea = new MaxElementArray();
       
        System.out.println("Enter the number of elements in array : ");
        int n = scan.nextInt();
        int A[] = new int[n];


        System.out.println("Enter the elements in array : ");
        for(int i =0 ; i < n ; i ++){
            A[i] = scan.nextInt();
        } 
        System.out.println("The elements in array before the ordering are  : ");
        for(int i =0 ; i < n ; i ++){
            System.out.print(A[i] + " ");
        } 
        System.out.println(" ");

        mea.maxNumber(A);;
        scan.close();
    }

    void maxNumber(int A[]){

        int maxNumber = A[0];

        for(int i = 0 ; i< A.length-1 ; i++ ){
            if(A[i] > maxNumber){
                maxNumber =A[i];
            }
        }
        System.out.println("The max numbe in the array is :" +maxNumber);
    }
    
}
