package Methods;

import java.util.Scanner;

public class ArrayPassingVsDTPassing {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        ArrayPassingVsDTPassing apdp= new ArrayPassingVsDTPassing();
       
        System.out.println("Enter the number of elements in array : ");
        int n = scan.nextInt();
        int A[] = new int[n];


        System.out.println("Enter the elements in array : ");
        for(int i =0 ; i < n ; i ++){
            A[i] = scan.nextInt();
        } 
        System.out.println("The elements in array before the function call : ");
        for(int i =0 ; i < n ; i ++){
            System.out.print(A[i] + " ");
        } 
        System.out.println(" ");

        System.out.println("Enter the index to change the value :");
        int index = scan.nextInt();

        System.out.println("Enter the vnew value to update at the mentioned index :");
        int newValue = scan.nextInt();

        apdp.arrayPass(A, index, newValue);

        System.out.println("The elements in array after the function call : ");
        for(int i =0 ; i < n ; i ++){
            System.out.print(A[i] + " ");
        } 

        System.out.println(" ");

        System.out.println("Enter any number to check if the formal parameter changes the actual parameter :");
        int number = scan.nextInt();

        apdp.numberPass(number);

        System.out.println("The number after the method call is : " + number);

        scan.close();   
    }

    void arrayPass(int X[], int index , int value){
        X[index] = value;

    }

    void numberPass(int x){

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter any other number to check :");
        x = scan.nextInt();
        scan.close();
    }
    
}
