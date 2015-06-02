package Tugas_b;

import Tugas_b.Kelas_a;
public class Testkelas_a {
	public static void main (String[] args){
		Kelas_a [] kelasA;
		kelasA = new Kelas_a [2]; 
		kelasA[0] = new Kelas_a();
		kelasA[1] = new Kelas_a();
		
		for (int i=0 ; i <= kelasA.length; i++){
			kelasA[i].input();
			kelasA[i].tampil();
                }
        }

}
