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
public class E07_KiemTraSoNgayTrongThang {

    public static boolean kiemTraNamNhuan(int nam) {
//        if (((nam%400==0)||(nam%4==0 && nam%100!=0))==true){
//            return true;
//        }else{
//            return false;
//        }

//        if (((nam%400==0)||(nam%4==0 && nam%100!=0))){
//            return true;
//        }else{
//            return false;
//        }
        return (nam % 400 == 0) || (nam % 4 == 0 && nam % 100 != 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap nam ");
        int nam = sc.nextInt();
        System.out.println("Nhap thang: ");
        int thang = sc.nextInt();
        int result = 0;
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                result = 30;
                break;
            case 2:
                if (kiemTraNamNhuan(nam)){
                    result = 29;
                }else{
                    result = 28;
                }
                break;
            default:
                result = -1;
        }
        System.out.println("Tháng "+ thang +" năm "+ nam +" có "+result +" ngày");
    }
}
