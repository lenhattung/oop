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
public class E09_String {
     public static void main(String[] args) {
         String s = "Lap trinh Java";
         
         // .length() => xác định độ dài chuỗi
         System.out.println(s.length());
         
         // Lấy từng ký tự trong chuỗi
         for (int i = 0; i < s.length(); i++) {
             char c = s.charAt(i);
             System.out.println(c);
         }
         
         // Chuyển sang chữ thường
         s.toLowerCase();
         System.out.println(s); // Không thay đổi
         
         // Chuyển sang chữ hoa
         s.toUpperCase();
         System.out.println(s); // Không thay đổi
         
         // Chuyển sang chữ thường
         s = s.toLowerCase();
         System.out.println(s); // Có thay đổi
         
         // Chuyển sang chữ hoa
         s = s.toUpperCase();
         System.out.println(s); // Có thay đổi
         
         // Dự đoán kết quả
         System.out.println("Dự đoán kết quả");
         System.out.println(s.toLowerCase());
         System.out.println(s);
         
         // Kiểm tra start/end
         System.out.println(s.startsWith("Lap"));
         System.out.println(s.endsWith("JAVA"));
         
         // replace => thay thế
         s.replace("A", "O");
         System.out.println(s); // Không thay đổi
         
         // replace => thay thế
         s = s.replace("A", "O");
         System.out.println(s); // Có thay đổi
         
         // indexOf => tìm kiếm
         System.out.println(s.indexOf("Trinh")); // -1 khi không tìm thấy
         System.out.println(s.indexOf("TRINH")); // vị trí
     }
}
