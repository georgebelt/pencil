
import java.util.*;
import java.lang.Math;

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
    public class BigInteger {
        int[] digit = new int[100];
        int length = 0;
        public void add(BigInteger other) {
            int len = max(length, other.length);
        }
        public void multiply(BigInteger other) {
            BigInteger ret = new BigInteger();
        }
    }
    public int multiplication(int a, int b) {
        return a * b;
    }
    
    public static void main(String[] args) {
        int n = 1;
        Scanner stdin = new Scanner(System.in);
        while (stdin.hasNextLine()) {
            int a = stdin.nextInt();
            n *= a;
        }
        System.out.println(n);
    }
    
}
