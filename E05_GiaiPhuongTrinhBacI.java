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
public class E05_GiaiPhuongTrinhBacI {
    public static void main(String[] args) {
        // Phương trình bậc nhất: a*x + b = 0;
        double a = 5;
        double b = 2;
        // (bieu thuc dieu kien)? (tra ve ket qua khi dung): (tra ve ket qua khi sai)
        System.out.println((a!=0)?(-b/a):((b==0)?"Vo so nghiem":"Vo nghiem"));
    }
}
