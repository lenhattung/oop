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
public class E10_SumArguments {
    public static void main(String[] args) {
        // 15.123 45.78 9.01
        double sum = 0;
        for (int i = 0; i < args.length; i++) {
            double x = Double.parseDouble(args[i]);
            // Double.parseDouble(args[i]); =>
            // Chuyển đổi chuỗi args[i] về số double
            sum+=x; // sum = sum + x
        }
        // Xuất kết quả với 2 số sau dấu phẩy
        System.out.format("%.2f", sum);
    }
}
