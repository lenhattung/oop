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
public class E09_String {
    public static void main(String[] args) {
        String s = "Lap trinh Java";
        
        // Length => độ dài
        System.out.println(s.length());
        
        // Lấy từng ký tự trong chuỗi
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            System.out.println(c);
        }
        
        // Chuyển sang viết thường
        s.toLowerCase();
        System.out.println(s);
        
        // Chuyển sang viết hoa
        s.toUpperCase();
        System.out.println(s);
        
        // Chuyển sang viết thường
        s = s.toLowerCase();
        System.out.println(s);
        
        // Chuyển sang viết hoa
        s = s.toUpperCase();
        System.out.println(s);
        
        // start/end
        System.out.println(s.startsWith("Lap"));
        System.out.println(s.endsWith("JAVA"));
        
        // replace
        s.replace("A", "O");
        System.out.println(s);
        
        s = s.replace("A", "O");
        System.out.println(s);
        
        // indexOf => tìm kiếm
        System.out.println(s.indexOf("TRINH"));
    }
}
