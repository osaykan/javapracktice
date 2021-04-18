package day12son;

import java.util.Arrays;
import java.util.Scanner;

public class Question04 {
	/*
	 * araba==>a bebek==>b e tekrarlilari aliyoruz
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String kelime = scan.next();
		String kopyaHarfler = getKopyaHarflerBrinciYol(kelime);
		System.out.println(kopyaHarfler);

		String kopyaHarfler2 = getKopyaHarflerIkinciYol(kelime);
		System.out.println(kopyaHarfler2);

	}

	private static String getKopyaHarflerIkinciYol(String kelime) {
		String kopyaHarfler = "";
		char[] charArray = kelime.toCharArray();
		Arrays.sort(charArray);
		System.out.println(Arrays.toString(charArray));

		for (int i = 0; i < charArray.length - 1; i++) {
			if (charArray[i] == charArray[i + 1]) {
				if (!kopyaHarfler.contains("" + charArray[i])) {
					kopyaHarfler += charArray[i];
				}
			}

		}

		return kopyaHarfler;
	}

	private static String getKopyaHarflerBrinciYol(String kelime) {
		// iki tane bos String olusturalim.
		String bosString = "";
		String kopyaHarfler = "";
		for (int i = 0; i < kelime.length(); i++) { // araba
			String harf = "" + kelime.charAt(i);
			if (!bosString.contains(harf)) { // false
				bosString += harf; // arb
			} else {
				if (!kopyaHarfler.contains(harf)) {
					kopyaHarfler += harf;
				}
			}
		}
		return kopyaHarfler;
	}
}
