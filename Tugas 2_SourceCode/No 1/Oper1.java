/**
Nim				: 13020200287
Nama 			: Putri Jafar
Hari/Tanggal 	: Sabtu, 19 Maret 2022
Waktu			: 16.07 WITA
*/


/* pemakaian beberapa operator terhadap bit */
public class Oper1 {
	
	/**
	* @param args
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* KAMUS */
		
		int n = 10;	/* 1010 */
		int x = 1;	/* 1 */
		int y = 2;	/* 10 */
		
		/* ALGORITMA */
		
		System.out.println ("n = "+ n);
		
		System.out.println ("x = "+ x);
		
		System.out.println ("y = "+ y);
		
		System.out.println ("n & 8 = "+ (n & 8));	/* 1010 NAD 1000 */
		
		System.out.println ("x & ~ 8 = "+ (x & ~8));	/* 1 AND 0111 */
		
		System.out.println ("y << 2 = "+ (y << 2)); /* 10 ==> 1000 = 8 */
		
		System.out.println ("y >> 3 = "+ (y >>3)); /* 10 ==> 0000 = 0 */
		
	}
	
}