/**
Nim				: 13020200287
Nama 			: Putri Jafar
Hari/Tanggal 	: Sabtu, 21 Maret 2022
Waktu			: 10.59 WITA
*/


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import javax.swing.*;
public class BacaString {
	
	/**
	* @param args
	* @throws IOException 
	*/
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/* Kamus */ 
		String str; 
		
		
		BufferedReader datAIn = new BufferedReader(new 
		InputStreamReader(System.in));
		/* Program */
		
		System.out.print ("\nBaca string dan Integer: \n"); 
		System.out.print("masukkan sebuah string: "); 
		str= datAIn.readLine();
		System.out.print ("String yang dibaca : "+ str);
	}
}