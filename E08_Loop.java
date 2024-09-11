/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2b;

/**
 *
 * @author tungi
 */
public class E08_Loop {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};
        for(int i=0; i<a.length; i++)
            System.out.print(a[i]+",");
        
        System.out.println();
        for(int i=0; i<a.length; i++){
            System.out.print(a[i]+",");
        }
        
        // Lưu ý lỗi sai
        System.out.println();
        for (int x: a);{ // Thừa ; sau for
            System.out.print("x"+","); // In ra ký tự thay vì giá trị của biến
        }
        
        System.out.println();
        for (int i : a) {
            System.out.print(i+",");
            i+=100;
        }
        
        System.out.println();
        for (int i : a) {
            i+=100;
            System.out.print(i+",");
        }
    }
}
