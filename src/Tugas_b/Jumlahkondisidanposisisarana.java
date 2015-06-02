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
public class Jumlahkondisidanposisisarana extends kelasabstrak{
    Scanner input;
     String SSID;
       int Bandwidth;
      
       int JumlahSteker;
       int KondisiSteker;
       int PosisiSteker; 
       int JumlahLCD;
       int KondisiLCD;
       int PosisiLCD;
       int JumlahLampu;
       int KondisiLampu;
       int PosisiLampu;
       int JumlahKipasAngin;
       int KondisiKipasAngin;
       int PosisiKipasAngin;
       int JumlahAC;
       int KondisiAC;
       int PosisiAC;
       int JumlahCCTV;
       int KondisiCCTV;

    public String getSSID() {
        return SSID;
    }

    public void setSSID(String SSID) {
        this.SSID = SSID;
    }

    public int getBandwidth() {
        return Bandwidth;
    }

    public void setBandwidth(int Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    public int getJumlahSteker() {
        return JumlahSteker;
    }

    public void setJumlahSteker(int JumlahSteker) {
        this.JumlahSteker = JumlahSteker;
    }

    public int getKondisiSteker() {
        return KondisiSteker;
    }

    public void setKondisiSteker(int KondisiSteker) {
        this.KondisiSteker = KondisiSteker;
    }

    public int getPosisiSteker() {
        return PosisiSteker;
    }

    public void setPosisiSteker(int PosisiSteker) {
        this.PosisiSteker = PosisiSteker;
    }

    public int getJumlahLCD() {
        return JumlahLCD;
    }

    public void setJumlahLCD(int JumlahLCD) {
        this.JumlahLCD = JumlahLCD;
    }

    public int getKondisiLCD() {
        return KondisiLCD;
    }

    public void setKondisiLCD(int KondisiLCD) {
        this.KondisiLCD = KondisiLCD;
    }

    public int getPosisiLCD() {
        return PosisiLCD;
    }

    public void setPosisiLCD(int PosisiLCD) {
        this.PosisiLCD = PosisiLCD;
    }

    public int getJumlahLampu() {
        return JumlahLampu;
    }

    public void setJumlahLampu(int JumlahLampu) {
        this.JumlahLampu = JumlahLampu;
    }

    public int getKondisiLampu() {
        return KondisiLampu;
    }

    public void setKondisiLampu(int KondisiLampu) {
        this.KondisiLampu = KondisiLampu;
    }

    public int getPosisiLampu() {
        return PosisiLampu;
    }

    public void setPosisiLampu(int PosisiLampu) {
        this.PosisiLampu = PosisiLampu;
    }

    public int getJumlahKipasAngin() {
        return JumlahKipasAngin;
    }

    public void setJumlahKipasAngin(int JumlahKipasAngin) {
        this.JumlahKipasAngin = JumlahKipasAngin;
    }

    public int getKondisiKipasAngin() {
        return KondisiKipasAngin;
    }

    public void setKondisiKipasAngin(int KondisiKipasAngin) {
        this.KondisiKipasAngin = KondisiKipasAngin;
    }

    public int getPosisiKipasAngin() {
        return PosisiKipasAngin;
    }

    public void setPosisiKipasAngin(int PosisiKipasAngin) {
        this.PosisiKipasAngin = PosisiKipasAngin;
    }

    public int getJumlahAC() {
        return JumlahAC;
    }

    public void setJumlahAC(int JumlahAC) {
        this.JumlahAC = JumlahAC;
    }

    public int getKondisiAC() {
        return KondisiAC;
    }

    public void setKondisiAC(int KondisiAC) {
        this.KondisiAC = KondisiAC;
    }

    public int getPosisiAC() {
        return PosisiAC;
    }

    public void setPosisiAC(int PosisiAC) {
        this.PosisiAC = PosisiAC;
    }

    public int getJumlahCCTV() {
        return JumlahCCTV;
    }

    public void setJumlahCCTV(int JumlahCCTV) {
        this.JumlahCCTV = JumlahCCTV;
    }

    public int getKondisiCCTV() {
        return KondisiCCTV;
    }

    public void setKondisiCCTV(int KondisiCCTV) {
        this.KondisiCCTV = KondisiCCTV;
    }

    public int getPosisiCCTV() {
        return PosisiCCTV;
    }

    public void setPosisiCCTV(int PosisiCCTV) {
        this.PosisiCCTV = PosisiCCTV;
    }

    public int getHasilKondisi() {
        return HasilKondisi;
    }

    public void setHasilKondisi(int HasilKondisi) {
        this.HasilKondisi = HasilKondisi;
    }
       int PosisiCCTV;
       int HasilKondisi;
   
 
    
    public void Input(){
        input= new Scanner (System.in);
        System.out.println("pilih Jumlah  Stop Kontak/Steker : 1.0 2.1-2 3.>2");
         setJumlahSteker(input.nextInt())  ;
        System.out.println("Pilih Kondisi Stop Kontak/Steker : 1.buruk 2.Bagus");
         setKondisiSteker(input.nextInt());
        System.out.println("pilih Posisi Steker :1.tidak ada yang dekat meja dosen 2.Ada yang Dekat Meja Dosen");
         setPosisiSteker(input.nextInt());
        System.out.println("Pilih Jumlah Kabel LCD: 1.0 2.>=1 ");
         setJumlahLCD(input.nextInt())  ;
        System.out.println("Pilih Kondisi Kabel LCD : 1.buruk 2.Bagus");
         setKondisiLCD(input.nextInt());
        System.out.println("pilih Posisi LCD :1.tidak ada yang dekat meja dosen 2.Ada yang Dekat Meja Dosen");
         setPosisiLCD(input.nextInt());
        System.out.println("pilih Jumlah Lampu : 1.0 2.1-2 3.>2");
         setJumlahLampu(input.nextInt())  ;
        System.out.println("Pilih Kondisi Lampu : 1.buruk 2.Bagus");
         setKondisiLampu(input.nextInt());
        System.out.print("pilih Posisi Lampu :1.pinggir 2.tengah");
    
             
         setPosisiLampu(input.nextInt());
        System.out.println("pilih Jumlah Kipas Angin : 1.0 2.1-2 3.>2");
         setJumlahKipasAngin(input.nextInt())  ;
        System.out.println("Pilih Kondisi Kipas Angin : 1.buruk 2.Bagus");
         setKondisiKipasAngin(input.nextInt());
        System.out.println("pilih Posisi Kipas Angin :1.pinggir 2.tengah");
         setPosisiKipasAngin(input.nextInt());
        System.out.println("pilih Jumlah AC : 1.0 2.1 3.>1");
         setJumlahAC(input.nextInt())  ;
        System.out.println("Pilih Kondisi AC : 1.buruk 2.Bagus");
         setKondisiAC(input.nextInt());
        System.out.println("pilih Posisi AC :1.Belakang 2.Samping");
         setPosisiAC(input.nextInt());
        System.out.println("Input nama SSID");
         setSSID(input.next());
        System.out.println("Input kecepatan Bandwidth :1.<1mb 2 1-5 Mb 3.>5Mb");
         setBandwidth(input.nextInt());
        System.out.println("pilih Jumlah CCTV : 1.tidak ada 2.1 cctv 3.2 cctv");
         setJumlahCCTV(input.nextInt())  ;
        System.out.println("Pilih Kondisi CCTV : 1.buruk 2.Bagus");
         setKondisiCCTV(input.nextInt());
              
        System.out.print("pilih posisi: 1.tengah 2.depan");
      
         setPosisiCCTV(input.nextInt());
    }
    int Analisis(){
         setHasilKondisi(   getJumlahSteker()+  getKondisiSteker()+  getPosisiSteker()+  getJumlahLCD()+  getKondisiLCD()+getPosisiLCD()+getJumlahLampu()+getKondisiLampu()+getPosisiLampu()+getJumlahKipasAngin()+
     getKondisiKipasAngin()+getPosisiKipasAngin()+getJumlahAC()+getKondisiAC()+getPosisiAC()+getJumlahCCTV()+getKondisiCCTV()+getBandwidth()); 
         if(  getHasilKondisi() >37){
    System.out.print("Kondisi kelas yang Baik");
       return 1;
    }
    else{
       System.out.print("Kondisi kelas yang Buruk");
    }
    return 0;
    }
    void Output(){
        System.out.println("Kondisi kelas: "+ Analisis());
    }
    void Save(){
        try{
            FileWriter a = new FileWriter("jumlah.txt");
             a.write("Kondisi kelas: " + Analisis());
        }catch(Exception a){
             a.printStackTrace();
        }
    }
}
