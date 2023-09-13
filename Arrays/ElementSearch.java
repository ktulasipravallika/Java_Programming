package Arrays;

import java.util.Scanner;

public class ElementSearch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the number of elements in the array : ");
        int n = scan.nextInt();

        System.out.println("Enter the elements in the array");
        int A[] = new int[n];

        for(int i = 0 ; i < A.length ; i ++){

            A[i] = scan.nextInt();
         
        }

        System.out.println("The given elements are : ");

        for(int i = 0 ; i < A.length ; i ++){

            System.out.println(A[i]);
        }
     
        System.out.println("Enter the element to search : ");
        int number = scan.nextInt();
        int position = -1 ;

        for(int i = 0 ; i < A.length ; i ++){

            if(A[i] ==  number){

                System.out.println("The position of the given element is :" + i);
                position = i;  
                System.exit(0);
        
            }     
        }
        if(position==-1){

            System.out.println("The given element is not present");

        }

        scan.close();
    }
    
}
