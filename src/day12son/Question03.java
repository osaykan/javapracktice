package day12son;

import java.util.Scanner;

public class Question03 {

	/*
	 * ackmz==>bdlna
	 */
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir kelime giriniz");
		String kelime = scan.next();
		String yeniKelime = getYeniKelime(kelime);
		System.out.println(yeniKelime);

	}

	private static String getYeniKelime(String kelime) {
		String yeniKelime = "";
		for (int i = 0; i < kelime.length(); i++) {
			char harf = kelime.charAt(i); /// araba charAt(0) > a charAt(1) > b
			if (harf == 'z') {
				harf = 'a';
			} else if (harf == 'Z') {
				harf = 'A';
			} else {
				harf += 1;
			}
			yeniKelime += harf;
		}
		return yeniKelime;
	}

}
