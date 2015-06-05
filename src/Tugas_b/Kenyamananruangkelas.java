/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_b;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
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
        return 1;
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
     String namafile = "kenyamanan.txt";
    void Save(){
      
		try{
                   
    
			ObjectOutputStream a = new ObjectOutputStream(new FileOutputStream(namafile));
			a.writeObject("kenyamanan =  "+Analisis());
                        a.writeObject("Kebisingan =  "+getKebisingan());
                        a.writeObject("Bau =  "+getBau());
                        a.writeObject("Kebocoran =  "+getKebocoran());
                        a.writeObject("Kerusakan =  "+getKerusakan());
                         a.writeObject("Keausan =  "+getKeausan());
			
			a.close();
		}
		catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(Exception e){
			e.printStackTrace();
		}
    }
         void Load(){
        try {
           
			ObjectInputStream b = new ObjectInputStream(new FileInputStream(namafile));
			b.readObject();
			System.out.println("kenyamanan : "+Analisis());
			System.out.println("Kebisingan : "+getKebisingan());
			System.out.println("Bau : "+getBau());
                        System.out.println("Kebocoran ="+getKebocoran());
                        System.out.println("Kerusakan ="+getKerusakan());
                        System.out.println("Keausan="+getKeausan());
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

