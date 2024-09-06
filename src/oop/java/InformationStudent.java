package oop.java;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class InformationStudent {
    private String name;
    private String fulName;
    private String address;
    private String email;
    private String phone;
    private String ID;

    public InformationStudent(String fulName, String ID) {
        this.fulName = fulName;
        this.ID = ID;
    }

    public InformationStudent(String name, String fulName, String address, String email, String phone, String ID) {
        this.name = name;
        this.fulName = fulName;
        this.address = address;
        this.email = email;
        this.phone = phone;
        this.ID = ID;
    }
    

    public InformationStudent() {
    
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFulName() {
        return fulName;
    }

    public void setFulName(String fulName) {
        this.fulName = fulName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    
    
}
