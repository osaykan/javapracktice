package day11javapractice;

import java.util.Scanner;

public class Question02InterviveFaktöriyel {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayi giriniz : ");
		long sayi = scan.nextInt();

		long faktoriel = getFoktoriel(sayi);
		System.out.println("Sonuc : " + faktoriel);

		long faktorielYeni = getFaktorielYeni(sayi);
		System.out.println("Sonuc : " + faktorielYeni);

	}

	private static long getFoktoriel(long sayi) {
		if (sayi == 0) {
			return 1;
		}
		long faktoriel = 1;
		for (int i = 1; i <= sayi; i++) {
			faktoriel *= i;

		}
		return faktoriel;
	}

	// Veya baska bir cözüm
	private static long getFaktorielYeni(long sayi) {
		if (sayi == 0) {
			return 1;
		} else {
			return sayi * getFaktorielYeni(sayi - 1);
		}

	}

}
