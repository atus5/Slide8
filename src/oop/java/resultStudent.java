/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.java;

/**
 *
 * @author Admin
 */
public class resultStudent {
    
    private double fee;
    private float markTest1;
    private float markTest2;
    private float markTest3;

    
    
    public void payfee(informationSubject subject){
        int number =  subject.getNumberTinchi();
        this.fee = number * 1000000;
        System.out.println("Hoc phi: " + this.fee);
    }
    
    public void setMarkTest1(float markTest1) {
        this.markTest1 = markTest1;
    }

    public void setMarkTest2(float markTest2) {
        this.markTest2 = markTest2;
    }

    public void setMarkTest3(float markTest3) {
        this.markTest3 = markTest3;
    }

    public float getMarkTest1() {
        return markTest1;
    }

    public float getMarkTest2() {
        return markTest2;
    }

    public float getMarkTest3() {
        return markTest3;
    }
    
    
    
    public void showResult(){
        System.out.println("Diem lan 1: " + markTest1);
        System.out.println("Diem lan 2: " + markTest2);
        System.out.println("Diem lan 3: " + markTest3);
        float result;
        result = (markTest1 + markTest2 + markTest3) / 3;
        if(result>=5){
            System.out.println("Qua mon");
        }else if(result<5){
            System.out.println("Rot mon");
        }
        
    }
}
