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
public class Kebersihanruangkelas extends kelasabstrak{
    Scanner input;
    int SirkulasiUdara;
       int NilaiPencahayaan;

    public int getSirkulasiUdara() {
        return SirkulasiUdara;
    }

    public void setSirkulasiUdara(int SirkulasiUdara) {
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

    public int getHasilKebersihan() {
        return HasilKebersihan;
    }

    public void setHasilKebersihan(int HasilKebersihan) {
        this.HasilKebersihan = HasilKebersihan;
    }
       int Kelembapan;
       int Suhu;
       int HasilKebersihan;
    
    public void Input(){
        input= new Scanner (System.in);
        System.out.println("pilih Sirkulasi Udara: 1.tersendat 2.Sedang 3.lancar");
         setSirkulasiUdara(input.nextInt())  ;
        System.out.println("pilih Nilai Pencahayaan: 1.<250 2.249<x<351");
         setNilaiPencahayaan(input.nextInt())  ;
        System.out.println("pilih Kelembapan(%) : 1.<70 atau >80 2.69<x<81");
         setKelembapan(input.nextInt())  ;
        System.out.println("pilih Suhu(celcius) : 1.1-19 C 2.>35 C 3.25-35 C");
         setSuhu(input.nextInt())  ;
}
    int Analisis(){
         setHasilKebersihan(  getSirkulasiUdara()+  getNilaiPencahayaan()+  getKelembapan()+  getSuhu());
        if(  getHasilKebersihan()>9){
        System.out.println("Kebersihan kelas yang Baik");
        }
        else{
            System.out.println("Kebersihan kelas yang Buruk");
        }
        return 0;
    }
    void Output(){
        System.out.println("Kebersihan kelas memiliki ");Analisis();
    }
    void Save(){
        String namafile = "kipahsAngin.txt";
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("Nilai Kebersihan (dari 12): "+getHasilKebersihan() );
			
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
