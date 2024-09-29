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
public class E12_e {
    public static void main(String[] args) {
        boolean cont = true;  
        do {
            try {
                String s = "";  
                // Mẫu kiểm tra chuỗi bắt đầu bằng "SE"
                String pattern = "^SE\\d{3}$";  

                Scanner sc = new Scanner(System.in);  
                System.out.println("Enter the string:");
                s = sc.nextLine();  
                
                // Kiểm tra chuỗi có phù hợp với mẫu hay không
                if (!s.matches(pattern)) {  
                    throw new Exception();
                }
                System.out.println("The string is: " + s);
                // Nếu chuỗi hợp lệ, thoát khỏi vòng lặp
                cont = false;  
            } catch (Exception e) {
                System.out.println("The string is invalid, it must start with 'SE'");  // Báo lỗi nếu chuỗi không hợp lệ
                // Tiếp tục vòng lặp nếu chuỗi không hợp lệ
                cont = true;  
            }
        } while (cont);  // Lặp lại cho đến khi chuỗi hợp lệ
    }
}
