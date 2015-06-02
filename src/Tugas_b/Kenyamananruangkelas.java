/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_b;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author eL
 */
public class Kenyamananruangkelas {
    Scanner input;
   
    int Kebisingan;
       int Bau;
       int Kebocoran;
       int Kerusakan;
       int Keausan;

    public int getKebisingan() {
        return Kebisingan;
    }

    public void setKebisingan(int Kebisingan) {
        this.Kebisingan = Kebisingan;
    }

    public int getBau() {
        return Bau;
    }

    public void setBau(int Bau) {
        this.Bau = Bau;
    }

    public int getKebocoran() {
        return Kebocoran;
    }

    public void setKebocoran(int Kebocoran) {
        this.Kebocoran = Kebocoran;
    }

    public int getKerusakan() {
        return Kerusakan;
    }

    public void setKerusakan(int Kerusakan) {
        this.Kerusakan = Kerusakan;
    }

    public int getKeausan() {
        return Keausan;
    }

    public void setKeausan(int Keausan) {
        this.Keausan = Keausan;
    }

    public int getHasilKenyamanan() {
        return HasilKenyamanan;
    }

    public void setHasilKenyamanan(int HasilKenyamanan) {
        this.HasilKenyamanan = HasilKenyamanan;
    }
       int HasilKenyamanan;
       
       
               
    
    void Input(){
        input= new Scanner (System.in);
        System.out.println("pilih Kebisingan: 1.Rusak 2.Sedang 3.Baik");
        setKebisingan(input.nextInt())  ;
        System.out.println("pilih Tingkat Kebauan: 1.Rusak 2.Sedang 3.Baik");
        setBau(input.nextInt())  ;
        System.out.println("pilih Kebocoran : 1.Rusak 2.Sedang 3.Baik");
        setKebocoran(input.nextInt())  ;
        System.out.println("pilih Kerusakan : 1.Rusak 2.Sedang 3.Baik");
        setKerusakan(input.nextInt())  ;
        System.out.println("pilih Keausan : 1.Rusak 2.Sedang 3.Baik");
        setKeausan(input.nextInt())  ;
    }
    int Analisis(){
        setHasilKenyamanan( getKebisingan()+ getBau()+ getKebocoran()+ getKerusakan() +  getKeausan());
        if( getHasilKenyamanan()>9){
        System.out.println("Kenyamanan kelas yang Baik");
        }
        else{
        System.out.println("Kenyamanankelas yang Buruk");
        }
        return 1;
    }
  
    public void Output(){
        Input();
        System.out.println("Memiliki : ");
        Analisis();
        
    }
   
    void Save(){
        try{
            FileWriter a = new FileWriter("Kenyamanan.txt");
            a.write("Kondisi kelas: " + Analisis());
        }catch(Exception a){
            a.printStackTrace();
        }
    }
}
