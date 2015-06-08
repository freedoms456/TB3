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
public class Kebersihanruangkelas extends kelasabstrak{
    Scanner input;
    String SirkulasiUdara;
    int NilaiPencahayaan;
      int  Kelembapan;
       int Suhu;
       

    public String getSirkulasiUdara() {
        return SirkulasiUdara;
    }

    public void setSirkulasiUdara(String SirkulasiUdara) {
        this.SirkulasiUdara = SirkulasiUdara;
    }

    public int getNilaiPencahayaan() {
        return NilaiPencahayaan;
    }

    public void setNilaiPencahayaan(int NilaiPencahayaan) {
        this.NilaiPencahayaan = NilaiPencahayaan;
    }

    public int getKelembapan() {
        return Kelembapan;
    }

    public void setKelembapan(int Kelembapan) {
        this.Kelembapan = Kelembapan;
    }

    public int getSuhu() {
        return Suhu;
    }

    public void setSuhu(int Suhu) {
        this.Suhu = Suhu;
    }


    
    public void Input(){
        input= new Scanner (System.in);
        System.out.println("Input Sirkulasi Udara: 1.tersendat 2.Sedang 3.lancar");
         setSirkulasiUdara(input.next())  ;
        System.out.println("Input Nilai Pencahayaan: 1.<250 2.249<x<351");
         setNilaiPencahayaan(input.nextInt())  ;
        System.out.println("Input Kelembapan(%) : 1.<70 atau >80 2.69<x<81");
         setKelembapan(input.nextInt())  ;
        System.out.println("Input Suhu(celcius) : 1.1-19 C 2.>35 C 3.25-35 C");
         setSuhu(input.nextInt())  ;
}
    int Analisis(){
        if(getSirkulasiUdara().equals("Lancar")){
             JOptionPane.showMessageDialog(null,"Sirkulasi udara Sesuai");
             
            
        }
        else{
           JOptionPane.showMessageDialog(null,"Sirkulasi udara Sesuai"); 
        }
        if(getNilaiPencahayaan()>249 && getNilaiPencahayaan()<351){
             JOptionPane.showMessageDialog(null,"Pencahayaan Baik");
             
            
        }
        else{
           JOptionPane.showMessageDialog(null,"Pencahayaan tidak baik"); 
        }
        if(getKelembapan()>69 && getKelembapan()<81){
             JOptionPane.showMessageDialog(null,"Kelembapan Sesuai");
             
            
        }
        else{
           JOptionPane.showMessageDialog(null,"Kelembapan Tidak Sesuai"); 
        }
         if(getSuhu()>24&& getSuhu()<36){
             JOptionPane.showMessageDialog(null,"Suhu Sesuai");
             
            
        }
        else{
           JOptionPane.showMessageDialog(null,"Suhu Tidak Sesuai"); 
        }
       return 1; 
    }
    void Output(){
        Analisis();
    }
    void Save(){
        
		try{
                  
     
    
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("SirkulasiUdara: "+getSirkulasiUdara() );
                        os.writeObject("NilaiPencahayaan): "+getNilaiPencahayaan() );
                        os.writeObject("Kelembapan: "+getKelembapan() );
                        os.writeObject("Suhu: "+getSuhu() );
                        
			
			os.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
    }
    String namafile = "Kebersihan.txt";
    void Load(){
        try {
           
			ObjectInputStream b = new ObjectInputStream(new FileInputStream(namafile));
			b.readObject();
			System.out.println("kenyamanan : "+Analisis());
			System.out.println("Sirkulasi Udara : "+getSirkulasiUdara());
			System.out.println("Nilai Pencahayaan : "+getNilaiPencahayaan());
                        System.out.println("Kelembapan="+getKelembapan());
                        System.out.println("Suhu ="+getSuhu());
                        
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

