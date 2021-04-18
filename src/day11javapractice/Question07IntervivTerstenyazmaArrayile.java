package day11javapractice;

import java.util.Scanner;

public class Question07IntervivTerstenyazmaArrayile {
	// Girilen ifadenin Array kullanarak tersini alalim

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir ifade giriniz");
		String ifade = scan.nextLine();

		char[] array = ifade.toCharArray();

		String ters = getTersi(array);
		System.out.println(ters);

	}

	private static String getTersi(char[] array) {
		String ters = "";
		for (int i = array.length - 1; i >= 0; i--) {
			ters += array[i];
		}

		return ters;
	}

}
