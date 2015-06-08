/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_b;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JOptionPane;

/**
 *
 * @author eL
 */
public class Kenyamananruangkelas {
    Scanner input;
   
    String Kebisingan;
       String Bau;
       String Kebocoran;
       String Kerusakan;
       String Keausan;

    public String getKebisingan() {
        return Kebisingan;
    }

    public void setKebisingan(String Kebisingan) {
        this.Kebisingan = Kebisingan;
    }

    public String getBau() {
        return Bau;
    }

    public void setBau(String Bau) {
        this.Bau = Bau;
    }

    public String getKebocoran() {
        return Kebocoran;
    }

    public void setKebocoran(String Kebocoran) {
        this.Kebocoran = Kebocoran;
    }

    public String getKerusakan() {
        return Kerusakan;
    }

    public void setKerusakan(String Kerusakan) {
        this.Kerusakan = Kerusakan;
    }

    public String getKeausan() {
        return Keausan;
    }

    public void setKeausan(String Keausan) {
        this.Keausan = Keausan;
    }

    public String getHasilKenyamanan() {
        return HasilKenyamanan;
    }

    public void setHasilKenyamanan(String HasilKenyamanan) {
        this.HasilKenyamanan = HasilKenyamanan;
    }
       String HasilKenyamanan;
       
       
               
    
    void Input(){
        input= new Scanner (System.in);
        System.out.println("Input Kebisingan: 1.Ribut 2.Tenang");
        setKebisingan(input.next())  ;
        System.out.println("Input Tingkat Kebauan: 1.Bau 2.Netral 3.Wangi");
        setBau(input.next())  ;
        System.out.println("Input Kebocoran : 1.parah 2.sedikit 3.tidak bocor");
        setKebocoran(input.next())  ;
        System.out.println("Input Kerusakan : 1.Rusak 2.tidak Rusak");
        setKerusakan(input.next())  ;
        System.out.println("Input Keausan : 1.Aus 2.tidak Aus");
        setKeausan(input.next())  ;
    }
    int Analisis(){
         if(getKebisingan().equals("Sunyi")){
             JOptionPane.showMessageDialog(null,"Kebisingan  Sesuai");
             
            
        }
        else{
           JOptionPane.showMessageDialog(null,"Kebisisngan Tidak Sesuai"); 
        }
          if(getBau().equals("Wangi")){
             JOptionPane.showMessageDialog(null,"Kebauan  Sesuai");
             
            
        }
        else{
           JOptionPane.showMessageDialog(null,"Kebauan Tidak Sesuai"); 
        }
           if(getKebocoran().equals("tidak ada")){
             JOptionPane.showMessageDialog(null,"Kebocoran sesuai");
             
            
        }
        else{
           JOptionPane.showMessageDialog(null,"Kebocoran Tidak Sesuai"); 
        }
            if(getKerusakan().equals("Tidak ada")){
             JOptionPane.showMessageDialog(null,"Kerusakan Sesuai");
             
            
        }
        else{
           JOptionPane.showMessageDialog(null,"Kerusakan Tidak Sesuai"); 
        }
             if(getKeausan().equals("tidak ada")){
             JOptionPane.showMessageDialog(null,"Keausan  Sesuai");
             
            
        }
        else{
           JOptionPane.showMessageDialog(null,"Keausan Tidak Sesuai"); 
        }
             return 1;
    }
  
    public void Output(){
        
     
        Analisis();
        
    }
     String namafile = "kenyamanan.txt";
    void Save(){
      
		try{
                   
    
			ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream(namafile));
			
                        a.writeObject("Kebisingan =  "+getKebisingan());
                        a.writeObject("Bau =  "+getBau());
                        a.writeObject("Kebocoran =  "+getKebocoran());
                        a.writeObject("Kerusakan =  "+getKerusakan());
                         a.writeObject("Keausan =  "+getKeausan());
			
			a.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
    }
         void Load(){
        try {
           
			ObjectInputStream b = new ObjectInputStream(new FileInputStream(namafile));
			b.readObject();
			System.out.println("kenyamanan : "+Analisis());
			System.out.println("Kebisingan : "+getKebisingan());
			System.out.println("Bau : "+getBau());
                        System.out.println("Kebocoran ="+getKebocoran());
                        System.out.println("Kerusakan ="+getKerusakan());
                        System.out.println("Keausan="+getKeausan());
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

