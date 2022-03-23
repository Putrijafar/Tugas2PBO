/**
Nim				: 13020200287
Nama 			: Putri Jafar
Hari/Tanggal 	: Selasa, 23 Maret 2022
Waktu			: 00.30 WITA
*/


import java.util.Scanner;
  
public class Putrijafar{
	public static void main(String [] args){
		Scanner masukan = new Scanner(System.in);
		
		int jam, menit, detik, konversi;

		System.out.print("Masukkan Detik yang ingin Dikonversi : ");
		konversi = masukan.nextInt();

		jam = konversi/3600;
		menit = (konversi%3600)/60;
		detik = (konversi%3600)%60;

		System.out.println("konversi dari : "+ konversi + "detik, adalah : ");
		System.out.println(jam+" jam : "+menit+"menit : "+detik+"detik");	
	}
}