package day11javapractice;

import java.util.Scanner;

public class Question08IntervivEmaildogrulama {
	// Girilen e-mailin dogru olup olmadigini anlayan bir method yazin
	// Method boolean veri tipinde deger döndersin

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen E-Mail adresini giriniz");
		String email = scan.nextLine();

		boolean dogruMu = getEmailDogruMu(email);
		System.out.println("Email : " + dogruMu);

	}

	private static boolean getEmailDogruMu(String email) {

		if (!email.contains("@")) {
			return false;
		}

		if (!email.contains(".")) {
			return false;
		}

		if (email.length() <= 4) {
			return false;
		}

		String[] array = email.split("@");
		if (array[0].length() < 1) {
			return false;
		}
		if (array[1].length() < 3) {
			return false;
		}

		if (array.length > 2) {
			return false;
		}

		return true;
	}

}
