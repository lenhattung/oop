/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Book {
    private String title;
    private int publishYear;
    private float price;

    public Book() {
    }

    public Book(String title, int publishYear, float price) {
        this.title = title;
        this.publishYear = publishYear;
        this.price = price;
    }
    
    public String toString(){
        return this.title+","+
                this.publishYear+","+
                this.price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    public float discount(int percent){
//        float newPrice = price-price*percent/100;
//        return newPrice;

            return price*(1-(float)percent/100);
    }
    
    public static void main(String[] args){
        Book b1 = new Book("Lap trinh Java", 2005, 50000);
        System.out.println(b1);
        System.out.println(b1.discount(10));
    }
    
}
