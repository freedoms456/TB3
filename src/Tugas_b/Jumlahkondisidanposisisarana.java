/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_b;


import java.util.Scanner;

/**
 *
 * @author eL
 */
public class Jumlahkondisidanposisisarana {
    Scanner input;
    JumlahSarana a = new JumlahSarana();
    KondisiSarana b = new KondisiSarana();
    PosisiSarana c = new PosisiSarana();
    int BandWidth;
    int SSID;

    public int getBandWidth() {
        return BandWidth;
    }

    public void setBandWidth(int BandWidth) {
        this.BandWidth = BandWidth;
    }

    public int getSSID() {
        return SSID;
    }

    public void setSSID(int SSID) {
        this.SSID = SSID;
    }
     
    
    
    public int AnalisisSarana(){
        input= new Scanner (System.in);
        
        a.StopKontak();
        a.CCTV();
        a.KabelLCD();
        a.KipasAngin();
        a.AC();
        b.StopKontak();
        b.CCTV();
        b.KabelLCD();
        b.KipasAngin();
        b.AC();
        c.StopKontak();
        c.CCTV();
        c.KabelLCD();
        c.KipasAngin();
        c.AC();
        System.out.println("PilihSSID:");
        System.out.println("1.Bukan UMM Hotspot 2.UMM Hotspot");
        setSSID(input.nextInt());
        if(getSSID()>1){
            System.out.println("SSID sesuai");
                  return 1;  }
        else{
            System.out.println("SSID tidak Sesuai");
        }
        
        System.out.println("Pilih BandWidth:");
        System.out.println("1.tidak Bisa Login 2.Bisa Login");
        setBandWidth(input.nextInt());
        
        if(getBandWidth()>1){
            System.out.println("BandWidth Sesuai");
        return 1;}
        else{
            System.out.println("BandWidth tak Sesuai");
                return 0;
        }
        
    }
    
    void Go(){
         a.aStopKontak();
        a.aCCTV();
        a.aKabelLCD();
        a.aKipasAngin();
        a.aAC();
        
        
    }


    
}