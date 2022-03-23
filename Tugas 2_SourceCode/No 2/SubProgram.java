/**
Nim				: 13020200287
Nama 			: Putri Jafar
Hari/Tanggal 	: Selasa, 22 Maret 2022
Waktu			: 10.30 WITA
*/


import java.util.Scanner;

/* Contoh program yang mengandung prosedur dan fungsi */
/* prosedur/fungsi */

public class SubProgram {

	/**
	* @param args
	*/
	public static int maxab (int a, int b){
		/* mencari maksimum dua bilangan bulat */
		return ((a >= b) ? a : b);
	}
	public static void tukar (int a, int b)
	{ /* menukar dua bilangan bulat */
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println ("Ke dua bilangan setelah tukar: a = "+ a +" b = "+ b);
	}
	/*** Program Utama ***/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Membaca dua bilangan integer */
		/* Menuliskan maksimum dua bilangan yang dibacadg memanggil fungsi */
		/* Menukar kedua bilangan dengan 'prosedur' */
		int a, b;
		Scanner masukan=new Scanner(System.in);
		System.out.print ("Maksimum dua bilangan \n");
		System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN : \n");
		a = masukan.nextInt();
		b = masukan.nextInt();
		System.out.println ("Ke dua bilangan : a = "+ a +" b = "+ b);
		System.out.println ("Maksimum = " + (maxab(a, b)));
		System.out.print("Tukar kedua bilangan... \n");
		tukar (a, b);
	}
}