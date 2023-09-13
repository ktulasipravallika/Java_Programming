package Arrays;

public class BasicArray {
    public static void main(String[] args) {
        /*Ways to declare the arrays
        int A[] = new int[10];

       

        int C[];

        C = new int[10];

        int []D = new int[5];*/

        int B[] = {1,2,3,4,5};
        B[2] = 15;// Changing one element in the array

        System.out.println("Demo to display the elements in the array B using for loop :");

        for(int i =0; i<B.length; i++){

            System.out.println(B[i]);
        }

        System.out.println("Demo to display the elements in the array B using for each loop ");

        for(int x : B){
            System.out.println(x);
        }

        System.out.println("Demo to display the elements in the array B by incrementing the numbers by 1 using for each loop ");

        for(int x : B){
            System.out.println(x++);
        }

        System.out.println("Demo to display the elements in the array B by incrementing the numbers by 1 using for each loop ");

        for(int x : B){
            System.out.println(x);
        }
        System.out.println("Demo to display the elements in the array B by incrementing the numbers by 1 using for loop ");

        for(int x = 0; x< B.length; x++){
            System.out.println(B[x]++);
        }

        System.out.println("Demo to display the elements in the array B by incrementing the numbers by 1 using for  loop ");

        for(int x = 0; x< B.length; x++){
            System.out.println(B[x]);
        }
        System.out.println("Demo to display the length of array B is : " + B.length);
    }
    
}
