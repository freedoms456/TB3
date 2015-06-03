/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_b;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class KondisiSarana implements InterfaceSarana{
    int CCTV;
    int KipasAngin;
    int KabelLCD;

    public int getCCTV() {
        return CCTV;
    }

    public void setCCTV(int CCTV) {
        this.CCTV = CCTV;
    }

    public int getKipasAngin() {
        return KipasAngin;
    }

    public void setKipasAngin(int KipasAngin) {
        this.KipasAngin = KipasAngin;
    }

    public int getKabelLCD() {
        return KabelLCD;
    }

    public void setKabelLCD(int KabelLCD) {
        this.KabelLCD = KabelLCD;
    }

    public int getAC() {
        return AC;
    }

    public void setAC(int AC) {
        this.AC = AC;
    }
    int AC;
    int StopKontak;

    public int getStopKontak() {
        return StopKontak;
    }

    public void setStopKontak(int StopKontak) {
        this.StopKontak = StopKontak;
    }
    Scanner input;
    
    @Override
    public int CCTV(){
        input= new Scanner (System.in);
        System.out.println("Pilih Kondisi CCTV:");
        System.out.println("1.Rusak 2.Baik");
        setCCTV(input.nextInt());
        if(getCCTV()>1){
            System.out.println("Kondisi CCTV Sesuai");
            
        }else{
             System.out.println("Kondisi CCTV Tidak Sesuai");
        }
        return 0;
        
    }
    @Override
      public int StopKontak(){
        input= new Scanner (System.in);
        System.out.println("Pilih Kondisi StopKontak:");
        System.out.println("1.Rusak 2.Baik");
        setStopKontak(input.nextInt());
        if(getStopKontak()>1){
            System.out.println("Kondisi StopKontak Sesuai");
            
        }else{
             System.out.println("Kondisi StopKontak Tidak Sesuai");
        }
        return 0;
        
    }
      
    @Override
          public int KabelLCD(){
        input= new Scanner (System.in);
        System.out.println("Pilih Kondisi Kabel LCD:");
        System.out.println("1.Rusak 2.Baik");
        setKabelLCD(input.nextInt());
        if(getKabelLCD()>1){
            System.out.println("Kondisi Kabel LCD Sesuai");
            
        }else{
             System.out.println("Kondisi Kabel LCD Tidak Sesuai");
        }
        return 0;
        
    }
    @Override
            public int KipasAngin(){
        input= new Scanner (System.in);
        System.out.println("Pilih Kondisi KipasAngin:");
        System.out.println("1.Rusak  2.Baik");
        setKipasAngin(input.nextInt());
        if(getKipasAngin()>1){
            System.out.println("Kondisi Kipas Angin Sesuai");
            
            
        }else{
             System.out.println("Kondisi Kipas Angin Tidak Sesuai");
        }
        return 0;
        
    }
    @Override
          public int AC(){
              input= new Scanner (System.in);
        System.out.println("Pilih Kondisi AC:");
        System.out.println("1.Rusak  2.Baikr");
        setAC(input.nextInt());
        if(getAC()>1){
            System.out.println("Kondisi AC Sesuai");
            
            
        }else{
             System.out.println("Kondisi AC Tidak Sesuai");
        }
        return 0;
              
          }
    
    
    
}
