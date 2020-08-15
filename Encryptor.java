import java.io.*;
import java.lang.Math; 

/** 
 * @author Karena Kong
 * @since  08-03-2020 
 * 
 */ 
public class Encryptor {

    /**
     * 
     * Takes in input string s and encrypts it based on its length L. Uses the
     * sqrt(L) rounded down to determine the number of rows and sqrt(L) rounded
     * up to determine the number of cols in a 2D array. Each character of is
     * placed into the 2D array by row major order. The encryption is created
     * by reading the 2D array by column major order. The encrypted string is
     * then returned.
     * 
     * @param str   1 <= s <= 81 characters and consists of char in ascii[a-z]
     * @return      string that is encrypted
     * 
     */
    public String encrypt(String str) {

        str = str.replaceAll("\\s+", "");
        double len = str.length();
        int row = (int) Math.floor(Math.sqrt(len));
        int col = (int) Math.ceil(Math.sqrt(len));

        /*
         * EDGE CASE: matrix size is smaller than the length of the string.
         * Then both values are rounded up.
         */
        if (row * col < len) 
            row++;

        String[][] myStringMatrix = new String [row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int strInd = i * col + j;
                if (strInd < len) {
                    char curr = str.charAt(i * col + j);
                    myStringMatrix[i][j] = String.valueOf(curr);
                }
            }
        }

        String encrypted = "";
        for (int j = 0; j < col; j++) {
            for (int i = 0; i < row; i++) {
                String letter = myStringMatrix[i][j];
                if (letter != null)
                    encrypted = encrypted + letter;
            }
            encrypted = encrypted + " ";
        }

        return encrypted;
    }
    
}

