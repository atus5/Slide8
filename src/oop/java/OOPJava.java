/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.java;


public class OOPJava {

    
    public static void main(String[] args) {
        System.out.println("============================================");
        InformationStudent infor = new InformationStudent();
        infor.setName("Tu");
        infor.setFulName("Nguyen Anh Tu");
        infor.setAddress("Chu Se");
        infor.setEmail("nat.coppyright@gmail.com");
        infor.setPhone("0987654321");
        infor.setID("ABC-1205");
        System.out.println("============================================");
        informationSubject subject = new informationSubject();
        subject.setSubject("OOP Java");
        subject.setIdSubject("OOP-1");
        subject.setNameTeacher("Mr Anh Tu");
        subject.setNumberTiet(20);
        subject.setNumberTinchi(4);
        System.out.println("============================================");
        StudentAction student = new StudentAction();
        student.goToSchool();
        student.payFee();
        student.doTest();
        student.doHomeWork();
        System.out.println("=============================================");
        showInformation show = new showInformation();
        show.showInfor(infor);
        show.showSubject(subject);
        System.out.println("=============================================");
        resultStudent result = new resultStudent();
        result.setMarkTest1((float) 1.5);
        result.setMarkTest2((float) 5.5);
        result.setMarkTest3((float) 3.0);
        result.payfee(subject);
        result.showResult();
    }
    
}
