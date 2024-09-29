/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package e12;

import java.util.Scanner;

/**
 *
 * @author tungi
 */
public class E12_d {

    public int divide1(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public int divide2(int a, int b) {
        if (b==0)
            throw new ArithmeticException("Loi chia cho 0");
        return a / b;
    }

    public static void main(String[] args) {
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        x = sc.nextInt();
        System.out.println("Enter y: ");
        y = sc.nextInt();

        E12_d obj = new E12_d();
//        try {
//            System.out.println(obj.divide1(x, y));
//        } catch (Exception e) {
//            System.out.println("Error: " + e.getMessage());
//        }
        try {
            System.out.println(obj.divide2(x, y));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

    }
}
