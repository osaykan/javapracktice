package day11javapractice;

import java.util.Scanner;

public class Question06IntervievPolindrom {
	// Girilen sayinin veya metnin polindrom oldugunu gösteren method
	// 12321 gibi

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir ifade giriniz");
		String ifade = scan.nextLine();

		if (getPolindrom(ifade)) {
			System.out.println("Polindrom");

		} else {
			System.out.println("Polindrom Degil");
		}

	}

	private static boolean getPolindrom(String ifade) {

		int i = 0;
		int j = ifade.length() - 1;
		while (i < j) {
			if (ifade.charAt(i) != ifade.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}

		return true;
	}

	// 2.Yol
	private static boolean getPolindromYeni(String word) {
		String wordTers = "";
		boolean ne = false;
		for (int i = word.length() - 1; i >= 0; i--) {
			wordTers = wordTers + word.charAt(i);
		}
		if (wordTers.equalsIgnoreCase(word)) {
			ne = true;
		} else {
			ne = false;
		}
		return ne;
	}

}
