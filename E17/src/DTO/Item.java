/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author tungi
 */
public class Item {
    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public void input(){
        Scanner sc = new Scanner(System.in);
        // Nhap value
        int v = -1;
        do {
            // Doan code lap lai neu v<=0
            System.out.println("Input a value (>0): ");
            v = sc.nextInt();
        }while(v<=0);
        this.value = v;
        
        // Nhap creator
        String c = "";
        do {
            sc = new Scanner(System.in);
            System.out.println("In put a creator: ");
            c = sc.nextLine();
        } while ((c.trim()).isEmpty());
        this.creator = c;
    };
    
    public void output(){
        System.out.println("Value:"+this.getValue());
        System.out.println("Creator:"+this.getCreator());
    };

    @Override
    public String toString() {
        return "Item{" + "value=" + value + ", creator=" + creator + '}';
    }
    
    public static void main(String[] args){
        Item i = new Item();
        i.input();
        i.output();
    }
}
