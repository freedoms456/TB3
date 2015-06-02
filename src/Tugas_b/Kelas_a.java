package Tugas_b;
	import java.util.*;
	public class Kelas_a {
		int panjang ; 
		int lebar ; 
		int jumlahPintu ; 
		int jumlahJendela ; 
		int jumlahKursi ;
                int jumlahstopkontak;
		String namaruangan ; 
                String kondisistopkontak;
                String posisistopkontak;
               int lolo;

 
		
		public void setpanjang(int panjang){
			this.panjang = panjang;

		}
		
		public int getpanjang(int panjang){
			return panjang;
		}
		
		public void setlebar(int lebar){
			this.lebar = lebar;
		}
		
		public int getlebar(int panjang){
			return panjang;
		}
		public void setjumlahPintu(int jumlahPintu){
			this.jumlahPintu = jumlahPintu;
		}
		
		public int getjumlahPintu(int jumlahPintu){
			return jumlahPintu;
		}
		public void setjumlahJendela(int jumlahJendela){
			this.jumlahJendela = jumlahJendela;
		}
		public int getjumlahJendela(int jumlahJendela){
			return jumlahJendela;
		}
		public void setjumlahKursi(int jumlahKursi){
			this.jumlahKursi = jumlahKursi;
		}
		public int getjumlahKursi(){
			return jumlahKursi;
		}
		public void setnamaruangan(String namaruangan){
			this.namaruangan = namaruangan;
		}
		
		public String getnamaruangan(String namaruangan){
			return namaruangan;
		}
                public void setjumlahstopkontak(int jumlahstopkontak){
			this.jumlahstopkontak = jumlahstopkontak;
		}
		public int getjumlahstopkontak(){
			return jumlahstopkontak;
		}
                public void setkondisistopkontak(String kondisistopkontak){
			this.kondisistopkontak = kondisistopkontak;
		}
		public String getkondisistopkontak(){
			return kondisistopkontak;
		}
                
                public void setposisistopkontak(String posisistopkontak){
			this.posisistopkontak = posisistopkontak;
		}
		public String getposisistopkontak(){
			return posisistopkontak;
		}
                
                
             
                
		void input(){
			int a;
			
			Scanner in = new Scanner (System.in);
			System.out.println("panjang : ");
			setpanjang(in.nextInt());
			System.out.println("lebar : ");
			setlebar(in.nextInt()) ;
			System.out.println("jumlah pintu : ");
			setjumlahPintu(in.nextInt())  ;
			System.out.println("jendela : ");
			setjumlahJendela(in.nextInt())  ;
			System.out.println("kursi : ");
			setjumlahKursi(in.nextInt())  ;
			System.out.println("nama ruangan : ");
			setnamaruangan(in.next())  ;
                        
		}	
		
		void tampil(){
		getLuas();
                int a;
                a= getjumlahKursi();
                if(a>5){System.out.println("Sesuai");}
			System.out.println("nama kelas : "+getnamaruangan(namaruangan));
			System.out.println("luas kelasnya : "+getLuas());
			System.out.println("luas rasio kelas : "+getRasioLuas());
		}
		public float getLuas(){
			return getpanjang(panjang)*getlebar(lebar);
		}
		
		float getRasioLuas(){
			return getLuas()/jumlahKursi;
		}

    
                
	}

     



