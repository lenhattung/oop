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
public class E04_DichChuyenBit {
    public static void main(String[] args) {
        int x = 8;
        int y = x>>1;
        System.out.println(y);
        int z = x<<2;
        System.out.println(z);
        
        int k = -1;
        // Số âm trong hệ nhị phân
        // Ghi con số đó ở dạng nhị phân
        // Đổi 0 <=> 1
        // Công thêm 1 bit
        System.out.println(k<<1);
        System.out.println(k>>1);
        
    }
}
