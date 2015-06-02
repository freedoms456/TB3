/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_b;

import java.io.FileWriter;
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
        System.out.println("pilih Nilai Pencahayaan: 1.gelap 2.remang 3.terang");
         setNilaiPencahayaan(input.nextInt())  ;
        System.out.println("pilih Kelembapan(%) : 1.Rusak 2.Sedang 3.Baik");
         setKelembapan(input.nextInt())  ;
        System.out.println("pilih Suhu(celcius) : 1.1-19 C 2.>27 C 3.20-27 C");
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
        return 1;
    }
    void Output(){
        System.out.println("Kondisi kelas: "+ Analisis());
    }
    void Save(){
        try{
            FileWriter a = new FileWriter("Kebersihan.txt");
             a.write("Kondisi kelas: " + Analisis());
        }catch(Exception a){
         a.printStackTrace();

        }
    }
}
