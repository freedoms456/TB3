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
public abstract class Kondisiruangkelas extends kelasabstrak{
    Scanner input;
  
     int JumlahPintu;
       int JumlahJendela;
       int PanjangRuang;
       int LebarRuang;
       int JumlahKursi;
       int HasilKondisi;

    public int getHasilKondisi() {
        return HasilKondisi;
    }

    public void setHasilKondisi(int HasilKondisi) {
        this.HasilKondisi = HasilKondisi;
    }

    public int getJumlahPintu() {
        return JumlahPintu;
    }

    public void setJumlahPintu(int JumlahPintu) {
        this.JumlahPintu = JumlahPintu;
    }

    public int getJumlahJendela() {
        return JumlahJendela;
    }

    public void setJumlahJendela(int JumlahJendela) {
        this.JumlahJendela = JumlahJendela;
    }

    public int getPanjangRuang() {
        return PanjangRuang;
    }

    public void setPanjangRuang(int PanjangRuang) {
        this.PanjangRuang = PanjangRuang;
    }

    public int getLebarRuang() {
        return LebarRuang;
    }

    public void setLebarRuang(int LebarRuang) {
        this.LebarRuang = LebarRuang;
    }

    public int getJumlahKursi() {
        return JumlahKursi;
    }

    public void setJumlahKursi(int JumlahKursi) {
        this.JumlahKursi = JumlahKursi;
    }
       
    public void Input(){
        input = new Scanner (System.in);
       
    System.out.println("Pilih Panjang Ruang :1.0-2m 2.2-3m 3.>3m  ");
     setPanjangRuang(input.nextInt());
    System.out.println("Pilih Lebar Ruang:1.0-1m 2.1-2m 3.>2m  ");
     setLebarRuang(input.nextInt()); 
    System.out.println("Pilih Jumlah Kursi:1.0-10 2.10-25 3.>25  ");
     setJumlahKursi(input.nextInt());
    System.out.println("Pilih Jumlah Pintu : 1.0 2.1 ");
     setJumlahPintu(input.nextInt());
    System.out.println("Pilih Jumlah Jendela : 1.0-1 2.2-3 3.>3 ");
     setJumlahJendela(input.nextInt()); 
    }
    int Analisis(){
         setHasilKondisi(   getJumlahJendela()+  getPanjangRuang()+  getLebarRuang()+  getJumlahKursi()+  getJumlahPintu());
        if(  getHasilKondisi() >8){
        System.out.println("Kondisi kelas yang Baik");
        return 1;
    }else{
        System.out.println("Kondisi kelas yang Buruk");
    }
        return 0;
    }
    void Output(){
        System.out.println("Kondisi kelas: "+ Analisis());
    }
    void Save(){
        try{
            FileWriter a = new FileWriter("Ruangkelas.txt");
             a.write("Kondisi kelas: " + Analisis());
        }catch(Exception a){
             a.printStackTrace();
        }
    }
}
