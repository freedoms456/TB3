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
public class JumlahSarana implements InterfaceSarana{
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
        System.out.println("Input Jumlah CCTV:");
       
        setCCTV(input.nextInt());
        if(getCCTV()==2){
            System.out.println("Jumlah CCTV Sesuai");
            
        }else{
             System.out.println("Jumlah CCTV Tidak Sesuai");
        }
        return 0;
        
    }
    @Override
      public int StopKontak(){
        input= new Scanner (System.in);
        System.out.println("Input Jumlah StopKontak:");
       
        setStopKontak(input.nextInt());
        if(getStopKontak()>4){
            System.out.println("Jumlah StopKontak Sesuai");
            
        }else{
             System.out.println("Jumlah StopKontak Tidak Sesuai");
        }
        return 0;
        
    }
      
    @Override
          public int KabelLCD(){
        input= new Scanner (System.in);
        System.out.println("Input Jumlah Kabel LCD:");
        setKabelLCD(input.nextInt());
        if(getKabelLCD()>=1){
            System.out.println("Jumlah Kabel LCD Sesuai");
            
        }else{
             System.out.println("Jumlah Kabel LCD Tidak Sesuai");
        }
        return 0;
        
    }
    @Override
            public int KipasAngin(){
        input= new Scanner (System.in);
        System.out.println("Input Jumlah KipasAngin:");
      
        setKipasAngin(input.nextInt());
        if(getKipasAngin()>=2){
            System.out.println("Jumlah Kipas Angin Sesuai");
            
            
        }else{
             System.out.println("Jumlah Kipas Angin Tidak Sesuai");
        }
        return 0;
        
    }
    @Override
          public int AC(){
              input= new Scanner (System.in);
        System.out.println("Input Jumlah AC:");
        setAC(input.nextInt());
        if(getAC()==1){
            System.out.println("Jumlah AC Sesuai");
            
            
        }else{
             System.out.println("Jumlah AC Tidak Sesuai");
        }
        return 0;
              
          }
    
    
    
}
