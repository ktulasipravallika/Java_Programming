package Methods;

import java.util.Scanner;

public class MaxNumVarArgs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        MaxNumVarArgs mva = new MaxNumVarArgs();

        System.out.println("Enter the number of elements you want to enter :");
        int n = scan.nextInt();

        int A[] = new int[n];
        System.out.println("Enter the elements :");
        for(int i =0 ; i <n ; i++){
            A[i] = scan.nextInt();
        }
        System.out.println("the maximum number is : " +mva.maxNumber(A));
        scan.close();
    }

    int maxNumber (int ...x){
        int maxNumber = x[0];
        if(x.length == 0) return 0;
        else{
            for(int i =0 ; i < x.length ; i++){ 
                if(x[i]>maxNumber){
                    maxNumber = x[i];
                }

            }
        }
        return maxNumber;
    }
    
}
