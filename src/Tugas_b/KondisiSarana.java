/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_b;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
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
    Overloading z = new Overloading();
    @Override
    public int CCTV(){
        input= new Scanner (System.in);
        z.input("kondisi","CCTV");
        System.out.println("Pilih Kondisi CCTV:");
        System.out.println("1.Rusak 2.Baik");
        setCCTV(input.nextInt());
        if(getCCTV()>1){
            System.out.println("Kondisi CCTV Sesuai");
            return 1;
            
        }else{
             System.out.println("Kondisi CCTV Tidak Sesuai");
        }
        return 0;
        
    }
    
    
    @Override
      public int StopKontak(){
        input= new Scanner (System.in);
        z.input("kondisi","stop kontak ");
        System.out.println("1.Rusak 2.Baik");
        setStopKontak(input.nextInt());
        if(getStopKontak()>1){
            System.out.println("Kondisi StopKontak Sesuai");
            return 1;
            
        }else{
             System.out.println("Kondisi StopKontak Tidak Sesuai");
        }
        return 0;
        
    }
      
    @Override
          public int KabelLCD(){
          z.input("kondisi","Kabel LCD");
        input= new Scanner (System.in);
        System.out.println("Pilih Kondisi Kabel LCD:");
        System.out.println("1.Rusak 2.Baik");
        setKabelLCD(input.nextInt());
        if(getKabelLCD()>1){
            System.out.println("Kondisi Kabel LCD Sesuai");
            return 1;
            
        }else{
             System.out.println("Kondisi Kabel LCD Tidak Sesuai");
        }
        return 0;
        
    }
    @Override
            public int KipasAngin(){
            z.input("kondisi","Kipas angin");
        input= new Scanner (System.in);
        System.out.println("Pilih Kondisi KipasAngin:");
        System.out.println("1.Rusak  2.Baik");
        setKipasAngin(input.nextInt());
        if(getKipasAngin()>1){
            System.out.println("Kondisi Kipas Angin Sesuai");
            return 1;
            
        }else{
             System.out.println("Kondisi Kipas Angin Tidak Sesuai");
        }
        return 0;
        
    }
    @Override
          public int AC(){
              input= new Scanner (System.in);
              z.input("kondisi","AC");
        System.out.println("Pilih Kondisi AC:");
        System.out.println("1.Rusak  2.Baikr");
        setAC(input.nextInt());
        if(getAC()>1){
            System.out.println("Kondisi AC Sesuai");
            return 1;
            
        }else{
             System.out.println("Kondisi AC Tidak Sesuai");
        }
        return 0;
              
          }
    
        void Save(){
        
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("StopKontak "+getStopKontak());
                        os.writeObject("Kabel LCD "+getKabelLCD());
                        os.writeObject("Kipas Angin "+getKipasAngin());
                          os.writeObject("CCTV "+getCCTV());
                            os.writeObject("AC "+getAC());
			
			os.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
        String namafile = "KondisiSarana.txt";
      void Load(){
        try {
           
			ObjectInputStream b = new ObjectInputStream(new FileInputStream(namafile));
			b.readObject();
			System.out.println("StopKontak : "+getStopKontak());
			System.out.println("KabelLCD : "+getKabelLCD());
			System.out.println("KipasAngin : "+getKipasAngin());
                                System.out.println("cctv : "+getCCTV());
                                System.out.println("AC : "+getAC());
                       
                        
			b.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
    }
}
