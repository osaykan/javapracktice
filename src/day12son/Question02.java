package day12son;

import java.util.Scanner;

public class Question02 {
	/*
	 * merhaba java nasilsin merhabaJavaNasilsin
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen method ismi giriniz");
		String isim = scan.nextLine();

		String methodIsmi = getFormataUygunIsim(isim);
		System.out.println("Normal Isim : " + methodIsmi);
		System.out.println("Gherkin Isim : " + getGherkinLanguageMethodIsmi(isim));

	}

	private static String getFormataUygunIsim(String isim) {
		String yeniMethodIsmi = "";
		String[] kelimeler = isim.split(" ");

		for (int i = 0; i < kelimeler.length; i++) {
			String kelime = kelimeler[i].replace(" ", "");
			if (kelime.length() > 0) {
				if (i == 0) {
					yeniMethodIsmi += kelime.toLowerCase(); // "merhaba"
				} else {
					String ilkHarf = kelime.substring(0, 1).toUpperCase(); // j J
					String kalanHarfler = kelime.substring(1, kelime.length()).toLowerCase(); // ava ava
					yeniMethodIsmi += ilkHarf;
					yeniMethodIsmi += kalanHarfler;
				}
			}

		}

		return yeniMethodIsmi;
	}

	// Kullanici elma kelimesini arar -> kullanici_elma_kelimesini_arar
	private static String getGherkinLanguageMethodIsmi(String isim) {
		return isim.toLowerCase().replace(" ", "_");
	}

}
