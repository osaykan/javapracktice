package day11javapractice;

import java.util.Scanner;

public class Question03IntervievRakamlarToplami {
	// Girilen bir sayinin rakamlar toplamini return eden bir method yaziniz

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayi giriniz : ");
		int sayi = scan.nextInt();

		System.out.println(getRakamlarToplami(sayi));

	}

	private static int getRakamlarToplami(int sayi) {
		int toplam = 0;
		while (sayi > 0) {
			toplam = toplam + sayi % 10;
			sayi = sayi / 10;
		}

		return toplam;
	}

}
