/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.java;

/**
 *
 * @author Admin
 */
public class showInformation {
    public void showInfor(InformationStudent show){
        System.out.println("=============================================");
        System.out.println("Ten: " + show.getName());
        System.out.println("Ten day du: " + show.getFulName());
        System.out.println("Dia chi: " + show.getAddress());
        System.out.println("Email: " + show.getEmail());
        System.out.println("Sdt: " + show.getPhone());
        System.out.println("ID: " + show.getID());
    }
    public void showSubject(informationSubject subject){
        
        System.out.println("==============================================");
        
        
        System.out.println("Ten mon hoc: " + subject.getSubject());
        System.out.println("ID mon hoc: " + subject.getIdSubject());
        System.out.println("Ten giang vien: " + subject.getNameTeacher());
        System.out.println("So tiet: " + subject.getNumberTiet());
        System.out.println("So tin chi mon hoc: " + subject.getNumberTinchi());
        
    }
    
    
    
}
