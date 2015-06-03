/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_b;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

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
        System.out.println("pilih Kebisingan: 1.Ribut 2.Tenang");
        setKebisingan(input.nextInt())  ;
        System.out.println("pilih Tingkat Kebauan: 1.Bau 2.Netral 3.Wangi");
        setBau(input.nextInt())  ;
        System.out.println("pilih Kebocoran : 1.parah 2.sedikit 3.tidak bocor");
        setKebocoran(input.nextInt())  ;
        System.out.println("pilih Kerusakan : 1.Rusak 2.tidak Rusak");
        setKerusakan(input.nextInt())  ;
        System.out.println("pilih Keausan : 1.Aus 2.tidak Aus");
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
        return 0;
    }
  
    public void Output(){
        
        System.out.println("Memiliki : ");
        Analisis();
        
    }
   
    void Save(){
        String namafile = "kipasAngin.txt";
		try{
			ObjectOutputStream os = new ObjectOutputStream(new FileOutputStream(namafile));
			os.writeObject("kenyamanan =  "+Analisis());
			
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
