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
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class PosisiSarana implements InterfaceSarana{
    String CCTV;
    String KipasAngin;
    String KabelLCD;

    public String getCCTV() {
        return CCTV;
    }

    public void setCCTV(String CCTV) {
        this.CCTV = CCTV;
    }

    public String getKipasAngin() {
        return KipasAngin;
    }

    public void setKipasAngin(String KipasAngin) {
        this.KipasAngin = KipasAngin;
    }

    public String getKabelLCD() {
        return KabelLCD;
    }

    public void setKabelLCD(String KabelLCD) {
        this.KabelLCD = KabelLCD;
    }

    public String getAC() {
        return AC;
    }

    public void setAC(String AC) {
        this.AC = AC;
    }
    String AC;
    String StopKontak;

    public String getStopKontak() {
        return StopKontak;
    }

    public void setStopKontak(String StopKontak) {
        this.StopKontak = StopKontak;
    }
    Scanner input;
    Overloading z = new Overloading();
    @Override
    public int CCTV(){
             
        input= new Scanner (System.in);
        
        z.input("Posisi","CCTV");
        
        System.out.println("Pilih Posisi CCTV:");
        System.out.println("1.Tengah 2.Depan atau Belakang");
        setCCTV(input.next());
       
        return 1;
        
    }
    public void aCCTV(){
         if(getCCTV().equals("Depan")){
           JOptionPane.showMessageDialog(null,"Posisi CCTV Sesuai"); 
            
            
        }else{
            JOptionPane.showMessageDialog(null,"Posisi CCTV tidak Sesuai"); 
        }
    }
    @Override
      public int StopKontak(){
          
        input= new Scanner (System.in);
        
        z.input("Posisi","Stop kontak");
        
        System.out.println("Pilih Posisi StopKontak:");
        System.out.println("1.Belakang 2.DekatDosen");
        setStopKontak(input.next());
       
      return 1;  
    }
      public int aStopKontak(){
          
       
        if(getStopKontak().equals("Dekat Dosen")){
           JOptionPane.showMessageDialog(null,"Posisi Stop Kontak Sesuai"); 
            return 1;
        }else{
            JOptionPane.showMessageDialog(null,"Posisi Stop Kontak tidak Sesuai"); 
        }
        return 0;
        
    }
      
    @Override
        public int KabelLCD(){
        input= new Scanner (System.in);
        
        z.input("posisi","kabel lcd");
        System.out.println("1.Jauh dari Dosen 2.Dekat Dosen");
        setKabelLCD(input.next());
        
        return 1;
    }
        public int aKabelLCD(){
            if(getKabelLCD().equals("Dekat Dosen")){
            JOptionPane.showMessageDialog(null,"Posisi Kabel LCD Sesuai"); 
            return 1;
            
        }else{
             JOptionPane.showMessageDialog(null,"Posisi Kabel LCD tidak Sesuai"); 
        }
        return 0;
        }
    @Override
        public int KipasAngin(){
        input= new Scanner (System.in);
        
        z.input("posisi","kipas angin");
        System.out.println("1.Lantai  2.Atap");
        
        setKipasAngin(input.next());
        return 1;
        
    }
        public int aKipasAngin(){
            if(getKipasAngin().equals("Atap")){
         JOptionPane.showMessageDialog(null,"Posisi Kipas Angin  Sesuai"); 
            return 1;
            
            
        }else{
            JOptionPane.showMessageDialog(null,"Posisi Kipas Angin Sesuai"); 
        }
        return 0;
        }
    @Override
          public int AC(){
              input= new Scanner (System.in);
              
              z.input("posisi","AC");
              
        System.out.println("Pilih Posisi AC:");
        System.out.println("1.Depan  2.Dibelakang/Di pinggir");
        setAC(input.next());
       
        return 0;
              
          }
          
          public void aAC(){
               if(getAC().equals("Pinggir")){
            JOptionPane.showMessageDialog(null,"Posisi AC Sesuai"); 
          
            
            
        }else{
             JOptionPane.showMessageDialog(null,"Posisi AC Tidak Sesuai"); 
        }
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
        String namafile = "PosisiSarana.txt";
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
    void Analisis(){
         aStopKontak();
         aCCTV();
         aKabelLCD();
         aKipasAngin();
         aAC();
    }
}
