/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e12;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author tungi
 */
public class E12_c {

    public static void main(String[] args) {
        int x;
        int y;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter x: ");
            x = sc.nextInt();
            System.out.println("Enter y: ");
            y = sc.nextInt();
            System.out.println(x / y);
        } catch (Exception e) {
            // Exception la lop cha tong quat cua tat ca Exception
            System.out.println("Error: "+e.getMessage());
        }
    }
}
