/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e12b;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author tungi
 */
public class E12b2 {

    public static void main(String[] args) {
        int x;
        int y;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter x (int):");
            x = sc.nextInt(); // Co the co Exception
            System.out.println("Enter y (int):");
            y = sc.nextInt(); // Co the co Exception
            System.out.println(x / y); // Co the co Exception
        } catch (InputMismatchException e) {
            System.out.println("Error: "+e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("Error: "+e.getMessage());
        }
        System.out.println("--End--");
    }
}
