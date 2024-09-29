/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2a;

/**
 *
 * @author tungi
 */
public class E08_Loop {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 4, 5};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println("");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ",");
        }
        System.out.println("");
        for (int x : a);
        { // thừa ; sau for
            System.out.print("x"); // Nhầm biến x thành chuỗi x
        }
        System.out.println("");
        for (int x : a) {
            System.out.print(x + ",");
        }
        
        System.out.println("");
        for (int x : a) {
            System.out.print(x+",");
            x+=100; // x = x + 100;
        }
        
        System.out.println("");
        for (int x : a) {
            x+=100; // x = x + 100;
            System.out.print(x+",");
        }
    }
}
