package Methods;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        PrimeNumber pn = new PrimeNumber();
        System.out.println("Enter any number to check if the number is prime number or not :");
        int number = scan.nextInt();

        if (pn.primeNumber(number) == true) {
            System.out.println("The given number is a Prime Number");
        }

        scan.close();
    }

    Boolean primeNumber(int number){
        for(int i = 2; i < number/2 ; i++){
            if(number%i == 0){
                System.out.println("The given number is not a prime number");
                return false;
            }
        }
        return true;
    }
}
