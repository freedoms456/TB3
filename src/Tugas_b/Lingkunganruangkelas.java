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
public abstract class Lingkunganruangkelas extends kelasabstrak{
    Scanner input;
    
    int KondisiLantai;
       int KondisiDinding;
       int KondisiAtap;
       int KondisiPintu;
       int KondisiJendela;
       int HasilLingkungan;

    public int getKondisiLantai() {
        return KondisiLantai;
    }

    public void setKondisiLantai(int KondisiLantai) {
        this.KondisiLantai = KondisiLantai;
    }

    public int getKondisiDinding() {
        return KondisiDinding;
    }

    public void setKondisiDinding(int KondisiDinding) {
        this.KondisiDinding = KondisiDinding;
    }

    public int getKondisiAtap() {
        return KondisiAtap;
    }

    public void setKondisiAtap(int KondisiAtap) {
        this.KondisiAtap = KondisiAtap;
    }

    public int getKondisiPintu() {
        return KondisiPintu;
    }

    public void setKondisiPintu(int KondisiPintu) {
        this.KondisiPintu = KondisiPintu;
    }

    public int getKondisiJendela() {
        return KondisiJendela;
    }

    public void setKondisiJendela(int KondisiJendela) {
        this.KondisiJendela = KondisiJendela;
    }

    public int getHasilLingkungan() {
        return HasilLingkungan;
    }

    public void setHasilLingkungan(int HasilLingkungan) {
        this.HasilLingkungan = HasilLingkungan;
    }
       
       
    
    public void input(){
        
    input = new Scanner (System.in);
    System.out.println("pilih Kondisi Lantai : 1.Rusak 2.Sedang 3.Baik");
     setKondisiLantai(input.nextInt())  ;
    System.out.println("pilih Kondisi Dinding : 1.Rusak 2.Sedang 3.Baik");
     setKondisiDinding(input.nextInt())  ;
    System.out.println("pilih Kondisi Atap : 1.Rusak 2.Sedang 3.Baik");
     setKondisiAtap(input.nextInt())  ;
    System.out.println("pilih Kondisi Pintu : 1.Rusak 2.Sedang 3.Baik");
     setKondisiPintu(input.nextInt())  ;
    System.out.println("pilih Kondisi Jendela : 1.Rusak 2.Sedang 3.Baik");
    }
    int Analisis(){
         setHasilLingkungan(  getKondisiLantai()+  getKondisiDinding()+  getKondisiAtap()+  getKondisiPintu()+  getKondisiJendela());
        if(  getHasilLingkungan()>9){
            System.out.println("Lingkungan kelas yang Baik");
        }
        else{
            System.out.println("Lingkungan kelas yang buruk");
            }
        return 1;
    }
    void Output(){
        System.out.println("Kondisi kelas: "+ Analisis());
    }
    void Save(){
        try{
            FileWriter a = new FileWriter("Lingkungan.txt");
             a.write("Kondisi kelas: " + Analisis());
        }catch(Exception a){
             a.printStackTrace();
        }
    }
}
