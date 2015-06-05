/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas_b;


/**
 *n
 * @author User
 */
public class Run  {
    
    
		public static void main (String[] args){
		
                Identitasruangkelas a= new Identitasruangkelas();
                Kondisiruangkelas b = new Kondisiruangkelas();
                Jumlahkondisidanposisisarana c = new Jumlahkondisidanposisisarana();
                Lingkunganruangkelas d = new Lingkunganruangkelas();
                Kebersihanruangkelas e = new Kebersihanruangkelas();
                Kenyamananruangkelas f = new Kenyamananruangkelas();
                Keamananruangkelas g = new Keamananruangkelas();
                
               
                 System.out.println("Identitas Ruang kelas  ");
                a.Input();
                a.Output();
                a.Save();
                
                 System.out.println("Kondisi Ruang kelas .");
                b.Input();
                b.Output();
                b.Save();
                
                 System.out.println("Jumlah kondisi dan posisi sarana");
                c.AnalisisSarana();
               
                    System.out.println("Lingkungan Ruang Kelas");
                d.Input();
                d.Output();
                d.Save();
                    System.out.println("Kebersihan Ruang kelas");
                e.Input();
                e.Output();
                e.Save();
                    System.out.println("Kenyamanan Ruang kelas");
                f.Input();
                f.Output();
                f.Save();
                    System.out.println("Keamanan Ruang Kelas");
                g.Input();
                g.Output();
                g.Save();
                
                
             
		
		
		
		
                        
                        
                        
                       
                       
			
                }
        }


		
    

