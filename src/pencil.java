
import java.util.*;
import java.lang.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author GEORGE
 */
public class pencil {

    /**
     * @param args the command line arguments
     */
    public static class BigInteger {
        public int[] digit = new int[20000];
        public int length = 0;
        
        public BigInteger() {
            Arrays.fill(digit, 0);
            length = 0;
        }
        
        public BigInteger(String s) {
            Arrays.fill(digit, 0);
            length = s.length();
            for (int i = 0; i < s.length(); i++) {
                digit[length - i - 1] = s.charAt(i) - '0';
            }
        }
        
        public void add(BigInteger other) {
            length = Math.max(length, other.length);
            for (int i = 0; i < length; i++) {
                digit[i] += other.digit[i];
                if (digit[i] >= 10) {
                    digit[i + 1] += digit[i] / 10;
                    digit[i] = digit[i] % 10;
                }
            }
            if (digit[length] > 0) {
                length++;
            }
        }
        
        public void multiply(BigInteger other) {
            BigInteger[] multiplies = new BigInteger[10];
            multiplies[0] = new BigInteger();
            for (int i = 1; i <= 9; i++) {
                multiplies[i] = new BigInteger();
                multiplies[i].add(multiplies[i-1]);
                multiplies[i].add(this);
            }
            Arrays.fill(this.digit, 0);
            this.length = 0;
            for (int i = 0; i < other.length; i++) {
                BigInteger addition = new BigInteger();
                addition.length = i + multiplies[other.digit[i]].length;
                for (int j = i; j < addition.length; j++) {
                    addition.digit[j] = multiplies[other.digit[i]].digit[j - i];
                }
                this.add(addition);
            }
        }
        
        public void print() {
            for (int i = length - 1; i >= 0; i--) {
                System.out.print(digit[i]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        BigInteger bi = new BigInteger("1");
        Scanner stdin = new Scanner(System.in);
        while (stdin.hasNextLine()) {
            bi.multiply(new BigInteger(stdin.nextLine()));
        }
        bi.print();
    }
}
