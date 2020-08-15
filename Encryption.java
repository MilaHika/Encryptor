import java.io.*;
import java.util.Scanner; 

/** 
 * @author Karena Kong
 * @since  08-03-2020 
 * 
 * Application encrypts a single line of english text based on the length of
 * the string. Running the script will let the program first prompt the user
 * for a single line of input string s. The input string is then encrypted and 
 * printed in the console.
 * 
 * CONSTRAINT: 1 <= s <= 81 comprised only of characters in the range ascii[a-z]
 * 
 */
class Encryption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Encryptor enc = new Encryptor();

        System.out.println("Please enter input string to be encrypted: ");

        String unencrypted = sc.nextLine(); 
        String encrypted = enc.encrypt(unencrypted);

        sc.close();

        System.out.println();
        System.out.println("Output:");
        System.out.println(encrypted);
    }
}
