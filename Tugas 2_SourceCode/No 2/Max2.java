/**
Nim				: 13020200287
Nama 			: Putri Jafar
Hari/Tanggal 	: Sabtu, 21 Maret 2022
Waktu			: 23.22 WITA
*/


import java.util.Scanner;

/* Maksimum dua bilangan yang dibaca */
public class Max2 {

	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Kamus */
		int a, b;
		Scanner masukan=new Scanner(System.in);
		/* Program */
		System.out.print ("Maksimum dua bilangan : \n");
		System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN : \n");
		a=masukan.nextInt();
		b=masukan.nextInt();
		System.out.println ("Ke dua bilangan : a = "+ a+" b = "+b); 
		if (a >= b){
			System.out.println ("Nilai a yang maksimum "+ a);
		}else /* a > b */{
			System.out.println ("Nilai b yang maksimum: "+ b);
		}
	}
}