/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_b;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectOutputStream;
import java.util.Scanner;
/**
 *
 * @author eL
 */
public class Identitasruangkelas extends kelasabstrak{
    Scanner input;
 int NamaRuang;

    public int getNamaRuang() {
        return NamaRuang;
    }

    public void setNamaRuang(int NamaRuang) {
        this.NamaRuang = NamaRuang;
    }

    public int getLokasiRuang() {
        return LokasiRuang;
    }

    public void setLokasiRuang(int LokasiRuang) {
        this.LokasiRuang = LokasiRuang;
    }

    public String getFakultas() {
        return Fakultas;
    }

    public void setFakultas(String Fakultas) {
        this.Fakultas = Fakultas;
    }
       int LokasiRuang;
       String Fakultas;
    
    @Override
    public void Input(){
  
       input = new Scanner (System.in);
     
       System.out.print("Masukkan Nama Ruang:");
        setNamaRuang(input.nextInt());
       System.out.print("Lokasi Ruang Berada di GKB :");
        setLokasiRuang(input.nextInt());
       System.out.print("Input Fakultas :");
        setFakultas(input.next());
    
       }
    @Override
    int Analisis(){
        System.out.println("Nama Ruang :" +  getNamaRuang());
        System.out.println("Lokasi Ruang berada di GKB: " +  getLokasiRuang());
        System.out.println("Ruang berada di Fakultas: " +  getFakultas());
        
        return 1;
    }
    
    
    @Override
    void Output(){
    Analisis();
        
    }
    void Save(){
        String namafile = "Identitas.txt";
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("Nama Ruang "+getNamaRuang());
                        os.writeObject("GKB "+getLokasiRuang());
                        os.writeObject("Fakultas "+getFakultas());
			
			os.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
    }

