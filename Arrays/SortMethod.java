package Arrays;

import java.util.Scanner;

public class SortMethod {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the words in the array:");
        String words[] = new String[10];

        for(int i = 0 ; i < 10; i++ ){
            words[i] = scan.nextLine();

        }
        for(int i = 0 ; i < 10; i++ ){
            java.util.Arrays.sort(words);
            System.out.println(words[i]);

        }
        scan.close();
    }

    
}
