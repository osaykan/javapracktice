package javapracticeday8_hamza;

import java.util.Scanner;

public class Question13 {
	/*
	 * Kullanici tarafindan girilen yazi ya da sayinin polindrom olup olmadigini
	 * bulan bir program yaziniz. 12321 gibi sayilar veya anna gibi kelimeler 1.
	 * Adım : Kullanıcıdan veri alalım. 2. Adım : For döngüsü kullanarak aldığımız
	 * ifadenin tersini bulalım. 3. Adım : Tersi ile normal ifadeyi karşılaştıralım.
	 * 
	 * 
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen veri giriniz");

		String kelime = scan.nextLine();
		String result = "";
		for (int i = kelime.length() - 1; i >= 0; i--) {
			result += kelime.charAt(i);

		}
		if (kelime.equals(result)) {
			System.out.println("Polindrom: " + result);
		} else {
			System.out.println("Polindrom degil");
		}
	}

}
