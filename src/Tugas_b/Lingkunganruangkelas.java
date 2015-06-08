/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_b;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author eL
 */
public class Lingkunganruangkelas extends kelasabstrak{
    Scanner input;
    
    String KondisiLantai;
     String KondisiDinding;
      String KondisiAtap;
      String KondisiPintu;
      String KondisiJendela;
       String HasilLingkungan;

    public String getKondisiLantai() {
        return KondisiLantai;
    }

    public void setKondisiLantai(String KondisiLantai) {
        this.KondisiLantai = KondisiLantai;
    }

    public String getKondisiDinding() {
        return KondisiDinding;
    }

    public void setKondisiDinding(String KondisiDinding) {
        this.KondisiDinding = KondisiDinding;
    }

    public String getKondisiAtap() {
        return KondisiAtap;
    }

    public void setKondisiAtap(String KondisiAtap) {
        this.KondisiAtap = KondisiAtap;
    }

    public String getKondisiPintu() {
        return KondisiPintu;
    }

    public void setKondisiPintu(String KondisiPintu) {
        this.KondisiPintu = KondisiPintu;
    }

    public String getKondisiJendela() {
        return KondisiJendela;
    }

    public void setKondisiJendela(String KondisiJendela) {
        this.KondisiJendela = KondisiJendela;
    }

    public String getHasilLingkungan() {
        return HasilLingkungan;
    }

    public void setHasilLingkungan(String HasilLingkungan) {
        this.HasilLingkungan = HasilLingkungan;
    }
       
       
    
    public void Input(){
        
    input = new Scanner (System.in);
    System.out.println("Input Kondisi Lantai");
     setKondisiLantai(input.next())  ;
    System.out.println("Input Kondisi Dinding : 1.Kotor 2.Sedang 3.Bersih");
     setKondisiDinding(input.next())  ;
    System.out.println("Input Kondisi Atap : 1.Kotor 2.Sedang 3.Bersih");
     setKondisiAtap(input.next())  ;
    System.out.println("Input Kondisi Pintu : 1.Kotor 2.Sedang 3.Bersih");
     setKondisiPintu(input.next())  ;
    System.out.println("Input Kondisi Jendela : 1.Kotor 2.Sedang 3.Bersih");
    }
    @Override
    int Analisis(){
        if(getKondisiLantai().equals("Bersih")){
             JOptionPane.showMessageDialog(null,"Kondisi Lantai Sesuai");
             
            
        }
        else{
           JOptionPane.showMessageDialog(null,"Kondisi Lantai Tidak Sesuai"); 
        }
        if(getKondisiDinding().equals("Bersih")){
            JOptionPane.showMessageDialog(null,"Kondisi Dinding Sesuai");
        }
        else{
            JOptionPane.showMessageDialog(null,"Kondisi Dinding tidak Sesuai");
        }
        if(getKondisiAtap().equals("Bersih")){
            JOptionPane.showMessageDialog(null,"Kondisi Atap Sesuai");
        }
        else{
            JOptionPane.showMessageDialog(null,"Kondisi Atap tidak Sesuai");
        }
        if(getKondisiPintu().equals("Bersih")){
            JOptionPane.showMessageDialog(null,"Kondisi Pintu Sesuai");
        }
        else{
            JOptionPane.showMessageDialog(null,"Kondisi Pintu tidak Sesuai");
        }
    return 1;}
    
    @Override
    void Output(){
       Analisis();
    }
    void Save(){
        
      
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("KondisiAtap : "+getKondisiAtap());
                        os.writeObject("KondisiDinding : "+getKondisiDinding());
                        os.writeObject("KondisiPintu : "+getKondisiPintu());
                        os.writeObject("KondisiJendela : "+getKondisiJendela());
                        os.writeObject("kondisi Lantai : "+getKondisiLantai());
                       
			
			os.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
	
                }}
    String namafile = "Lingkungan.txt";
     void Load(){
        try {
           
			ObjectInputStream b = new ObjectInputStream(new FileInputStream(namafile));
			b.readObject();
			System.out.println("KondisiAtap: "+getKondisiAtap());
			System.out.println("Kondisi Dinding : "+getKondisiDinding());
			System.out.println("Kondisi Pintu: "+getKondisiPintu());
                                System.out.println("KondisiJendela : "+getKondisiJendela());
                                System.out.println("Kondisi Lantai : "+getKondisiLantai());
                       
                        
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
