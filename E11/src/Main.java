/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Main {
    public static void main(String[] args){
        Student st1 = new Student();
        Student st2 = new Student("SE01", "Nguyễn Văn A", 2005, "Thu Duc - TP. HCM");
        
        System.out.println(st1);
        System.out.println(st2);
        
        //st2.bYear = -1;
        ///System.out.println(st2);
        
        st2.setbYear(-1);
        System.out.println(st2);
        
        System.out.println(st2.getAddress());
        
        st2.setAddress("Binh Tan - Tp HCM");
        System.out.println(st2);
        
        
        Student st3 = new Student("SE01", "Nguyễn Văn A", -1, "Thu Duc - TP. HCM");
        System.out.println(st3);
    }
}
