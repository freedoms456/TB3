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
public class Keamananruangkelas extends kelasabstrak{
    Scanner input;
  
    String Kekokohan;
    String Kuncipintudanjendela;
    String Bahaya;
    String HasilKeamanan;
    public String getKekokohan() {
        return Kekokohan;
    }

    public void setKekokohan(String Kekokohan) {
        this.Kekokohan = Kekokohan;
    }

    public String getKuncipintudanjendela() {
        return Kuncipintudanjendela;
    }

    public String getHasilKeamanan() {
        return HasilKeamanan;
    }

    public void setHasilKeamanan(String HasilKeamanan) {
        this.HasilKeamanan = HasilKeamanan;
    }

    public void setKuncipintudanjendela(String Kuncipintudanjendela) {
        this.Kuncipintudanjendela = Kuncipintudanjendela;
    }

    public String getBahaya() {
        return Bahaya;
    }

    public void setBahaya(String Bahaya) {
        this.Bahaya = Bahaya;
    }
       
    void Input(){
        input= new Scanner (System.in);
        System.out.println("Input Kekokohan: 1.lapuk 2.Sedang 3.Baik");
        setKekokohan(input.next())  ;
        System.out.println("Input Kunci Pintu dan Jendela: 1.Rusak 2.Baik");
        setKuncipintudanjendela(input.next())  ;
        System.out.println("Input Tingkat Bahaya : 1.Berbahaya 2.Waspada 3.Aman");
        setBahaya(input.next())  ;
    }
    int Analisis(){
          if(getKekokohan().equals("Kokoh")){
             JOptionPane.showMessageDialog(null,"Kekokohan Sesuai");
             
            
        }
        else{
           JOptionPane.showMessageDialog(null,"Kekokohan Tidak Sesuai"); 
        }
          if(getKuncipintudanjendela().equals("Ada")){
             JOptionPane.showMessageDialog(null,"Kunci Sesuai");
             
            
        }
        else{
           JOptionPane.showMessageDialog(null,"Kunci Tidak Sesuai"); 
        }
          if(getBahaya().equals("Aman")){
             JOptionPane.showMessageDialog(null,"Ruang Aman");
             
            
        }
        else{
           JOptionPane.showMessageDialog(null,"Ruang Aman"); 
        }
          return 1;
    }
    void Output(){
      
        Analisis();
    }
    
    void Save(){
        
     
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("Kekokohan "+getKekokohan());
                        os.writeObject("Kuncipintudanjendela "+getKuncipintudanjendela());
                        os.writeObject("Bahaya "+getBahaya());
                        
			
			os.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
    String namafile = "Keamanan.txt";
    void Load(){
        try {
           
			ObjectInputStream b = new ObjectInputStream(new FileInputStream(namafile));
			b.readObject();
			System.out.println("kekokohan : "+getKekokohan());
			System.out.println("KuncipintudanJendela : "+getKuncipintudanjendela());
			System.out.println("Bahaya : "+getBahaya());
                       
                        
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
