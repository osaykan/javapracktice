package day11javapractice;

import java.util.Scanner;

public class Question01IntervivFibonacci {
	/*
	 * Kullanicidan sayi alin ve o sayi kadar ard arda gelen fibonacci sayi dizisini
	 * ekrana yazdirin ornek : Kullanici 10 sayisini girdi, 10 tane sayiyi ekrana
	 * yazdiracagiz. 0 1 1 2 3 5 8 13 21 34
	 * 
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayi giriniz : ");
		int sayi = scan.nextInt();
		int sayi1 = 0;
		int sayi2 = 1;
		int ilkIkiSayininToplami = 0;
		System.out.print(sayi1 + " " + sayi2);
		for (int i = 2; i < sayi; ++i) {
			ilkIkiSayininToplami = sayi1 + sayi2; // 0 + 1 1 + 1 1 + 2 2 + 3
			sayi1 = sayi2; // sayi1 = 1; sayi1 = 1 2 3
			sayi2 = ilkIkiSayininToplami; // sayi2 = 1; sayi2 = 2 3 5
			System.out.print(" " + ilkIkiSayininToplami);

		}

	}

}
