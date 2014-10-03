
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
        public int[] digit = new int[100];
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
            
        }
        
        public void print() {
            for (int i = length - 1; i >= 0; i--) {
                System.out.print(digit[i]);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        int n = 1;
        Scanner stdin = new Scanner(System.in);
        while (stdin.hasNextLine()) {
            BigInteger a = new BigInteger(stdin.nextLine());
            BigInteger b = new BigInteger(stdin.nextLine());
            a.add(b);
            a.print();
        }
        System.out.println(n);
    }
    
}
