/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e12b;

import java.util.Scanner;

/**
 *
 * @author tungi
 */
public class E12b4 {
    public int divide1(int a, int b) throws ArithmeticException{
        return a/b;
    }
    
    public int divide2(int a, int b) {
        if(b==0)
            throw new ArithmeticException("Loi chia cho 0!");
        return a/b;
    }
    public static void main(String[] args) {
        int x = 1;
        int y = 1 ;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter x (int):");
            x = sc.nextInt(); // Co the co Exception
            System.out.println("Enter y (int):");
            y = sc.nextInt(); // Co the co Exception
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        E12b4 obj = new E12b4();
        try {
            System.out.println(obj.divide1(x, y));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        System.out.println(obj.divide2(x, y));
        
        System.out.println("--End--");
    }
}
