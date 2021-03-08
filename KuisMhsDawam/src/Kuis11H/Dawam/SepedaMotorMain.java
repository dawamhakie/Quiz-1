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
import java.util.Scanner;
public class SepedaMotorMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        SepedaMotor sp = new SepedaMotor();
        System.out.println("merk Yamaha berkontak Y\n" + "merk Honda berkontak H\n" + "merk Ducati berkontak D\n" + "merk Suzuki berkontak Z");
        System.out.print("Masukkan merk sepeda motor : ");
        String n = sc.nextLine();
        sp.merk = n;
        System.out.print("Kontak Sepeda Motor : ");
        String k = sc.nextLine();
        sp.kontakMotor = k;
        System.out.print("Masukkan kecepatan : ");
        int kc = sc.nextInt();
        sp.kecepatanMotor = kc;
        System.out.print("Tambah kecepatan : ");
        int tm = sc.nextInt();
        sp.tambahKecepatanMotor(tm);
        System.out.print("Kurangi kecepata : ");
        int krg = sc.nextInt();
        sp.kurangiKecepatanMotor(krg);
        sp.info();
    }
}
