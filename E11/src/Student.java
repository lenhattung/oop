/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tungi
 */
public class Student {
    private String code;
    private String name;
    private int bYear = 1;
    private String address;
  
    /*
        Không khai báo constructor, luôn có 1 constructor rỗng.
    */

    public Student() {
    }

    public Student(String code, String name, int bYear, String address) {
        this.code = code;
        this.name = name;
        this.setbYear(bYear);
        this.address = address;
    }
        
    public String toString(){
        return  this.code+"," +
                this.name+","+
                this.bYear+","+
                this.address;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.isEmpty())
            this.name = name;
    }

    public int getbYear() {
        return bYear;
    }

    public void setbYear(int bYear) {
        if(bYear>0)
            this.bYear = bYear;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
}
