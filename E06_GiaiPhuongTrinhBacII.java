/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2b;

import java.util.Scanner;

/**
 *
 * @author tungi
 */
public class E06_GiaiPhuongTrinhBacII {
    public static void main(String[] args) {
        // a*x^2 + b*x + c = 0
        double a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap a b c: ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        // double delta = b*b - 4*a*c;
        double delta = Math.pow(b, 2)-4*a*c;
        
        if(delta<0){
            System.out.println("PT vô nghiệm");
        }else if (delta==0){
            double x = -b/(2*a);
            System.out.println("x1=x2= " +x);
        }else{
            double x1 = (-b+Math.sqrt(delta))/(2*a);
            double x2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.println("x1 = "+x1);
            System.out.println("x2 = "+x2);
        }
    }
}
