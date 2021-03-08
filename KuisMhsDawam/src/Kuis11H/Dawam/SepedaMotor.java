/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Kuis11H.Dawam;

/**
 *
 * @author USER
 */
public class SepedaMotor {
    String merk;
    String kontakMotor;
    int kecepatanMotor;
    
    SepedaMotor(){
    }
    
    //SepedaMotor(String merk){
        
   // }
    
    void nyalakanMotor(boolean kontak){
        
    }
    
    void matikanMotor(boolean kontak){
        
    }
    
    void tambahKecepatanMotor(int kec){
        kecepatanMotor = kecepatanMotor + kec;
    }
    
    void kurangiKecepatanMotor(int kec){
        kecepatanMotor = kecepatanMotor - kec;
    }
    
    void info(){
        System.out.println("Sepeda Motor Merk : " + merk);
        System.out.println("Kontak Anda : " + kontakMotor);
        if(merk.equalsIgnoreCase("Honda")){
            if(kontakMotor.equalsIgnoreCase("H")){
             System.out.println("Kontak Motor Sesuai");   
            } else {
                System.out.println("Kontak Salah");
            }
        } else if(merk.equalsIgnoreCase("Yamaha")){
            if(kontakMotor.equalsIgnoreCase("Y")){
                System.out.println("Kontak Motor Sesuai");
            } else {
                System.out.println("Kontak Salah");
            }
        } else if(merk.equalsIgnoreCase("Ducati")){
            if(kontakMotor.equalsIgnoreCase("D")){
                System.out.println("Kontak Motor Sesuai");
            } else {
                System.out.println("Kontak Salah");
            }
        } else if(merk.equalsIgnoreCase("Suzuki")){
            if(kontakMotor.equalsIgnoreCase("Z")){
                System.out.println("Kontak Motor Sesuai");
            } else {
                System.out.println("Kontak Salah");
            }
    }
            
        
        System.out.println("Kecepatan : " + kecepatanMotor);
        if(kecepatanMotor > 100 || kecepatanMotor < 0){
            System.out.println("Kecepatan Salah");
        }
        
    }
}
