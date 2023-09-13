public class StringMethods {

    public static void main(String[] args) {
        
       String str = new String("    Hello World.com   ");
       String str1 = new String("Hello WORLD.com");

       int x = 100;
       System.out.println("This is to display the string:" + str);
       System.out.println("This is to display the length of the string:" + str.length());
       System.out.println("This is to display the string in lower case:" + str.toLowerCase());
       System.out.println("This is to display the string in upper case:" + str.toUpperCase());
       System.out.println("This is to display the string after trimming the white spaces:" + str.trim());
       System.out.println("This is to display the substring of the string:" + str.substring(6));
       System.out.println("This is to display the substring with start and end places given of the string:" + str.substring(3, 8));
       System.out.println("This is to display the string with letters replaced:" + str.replace('l', '@'));

       System.out.println("This is to display if the string starts with the letter 'H': " + str.startsWith("Hello"));
       System.out.println("This is to display if the string ends with the letter 'd': " + str.startsWith("world"));
       System.out.println("This is to display the character at position given : " + str.charAt(6));
       System.out.println("This is to display the index of a specific letter : " + str.indexOf("orld"));
       System.out.println("This is to display the index of a specific letter(This starts checking from the argument given (here it is 8)) : " + str.indexOf(".",8)); // when the string given is not found, it returns -1
       System.out.println("This is to display the Last index of a specific letter in the given word: " + str.lastIndexOf("l")); // when the string given is not found, it returns -1
     
       System.out.println("This is to check if two strings are equal or not" +str.equals(str1));
       System.out.println("This is to check if two strings are equal or not ignoring the cases" +str.equalsIgnoreCase(str1));
       System.out.println("This is to compare two strings" +str.compareTo(str1)); //
       System.out.println("This is to compare the two strings" + str.compareTo(str1)); //checks in dictionary order and gives 1, -1,0 as 1st string > 2nd string ,<,+) - upper case alphabets are smaller in ASCII values compared to small case letters, Ex: JAVA < java
       System.out.println("This is to concatenate Of the two strings" + String.valueOf(x)); 

        
    }
}