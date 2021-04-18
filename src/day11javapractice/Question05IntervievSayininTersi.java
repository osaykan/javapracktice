package day11javapractice;

import java.util.Scanner;

public class Question05IntervievSayininTersi {
	// Girilen sayinin tersini bulan method

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Sayi giriniz : ");
		int sayi = scan.nextInt();

		System.out.println(getSayininTersi(sayi));
		String result = "";

		System.out.println(getStrigMethodu(sayi));

	}

	// 1.Yol
	private static int getStrigMethodu(int sayi) {
		String str = String.valueOf(sayi);
		String yeni = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			yeni = yeni + str.charAt(i);

		}
		int son = Integer.valueOf(yeni);
		return son;
	}

	// 2.Yol
	private static int getSayininTersi(int sayi) {
		int ters = 0;
		while (sayi > 0) {
			ters *= 10;
			ters += sayi % 10;
			sayi = sayi / 10;

		}

		return ters;
	}

}
