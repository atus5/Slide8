/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package slide8main;

/**
 *
 * @author Admin
 */
public class Student {

    int ID;
    String name;

    public Student(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    void displayInformation() {
        System.out.println("ID: " + ID + ", Name: " + name);
    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "Nam");
        Student student2 = new Student(2, "Lan");
        student1.displayInformation();
        student2.displayInformation();
    }

}
