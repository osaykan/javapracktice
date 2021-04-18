package day08javapractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question11 {
	/*
	 * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program
	 * yazınız. Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir
	 * method yazınız. Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını
	 * gösteren bir method yazınız. Ayrıca bakkalın hangi günler ortalamanın altında
	 * kazandığını gösteren bir method yazınız.
	 * 
	 * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler) 2. Adım :
	 * Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun.
	 * (gunlukKazanclar) 3. Adım : While döngüsü ile kullanıcıdan 7 günlük
	 * kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle. 4. Adım :
	 * getOrtalamaKazanc() adlı method ile ortlama kazancı alın. 5. Adım :
	 * getOrtalamaninUstundeKazancGünleri() adlı method oluşturun. for döngüsü ile
	 * tüm günleri ortalama kazanç ile karşılaştır ortalama kazançtan yüksekse o
	 * günleri return yap. 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı
	 * method oluşturun. for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
	 * ortalama kazançtan aşağıysa o günleri return yap.
	 */

	static List<String> gunler = new ArrayList<>();
	static List<Float> gunlukKazanclar = new ArrayList<>();
	static float toplamKazanc = 0;

	public static void main(String[] args) {

		gunler.add("Pazar");
		gunler.add("Pazartesi");
		gunler.add("Sali");
		gunler.add("Carsamba");
		gunler.add("Persembe");
		gunler.add("Cuma");
		gunler.add("Cumartesi");

		Scanner scan = new Scanner(System.in);
		int gun = 0;
		while (gun < 7) {
			System.out.println("Lütfen " + gunler.get(gun) + " gününün kazancini giriniz : ");
			float gunlukKazanc = scan.nextFloat();
			gunlukKazanclar.add(gunlukKazanc);
			toplamKazanc += gunlukKazanc;

			gun++;

		}

		System.out.println("Günlük kazanclar: " + gunlukKazanclar);// günlük kazanclari liste ekledik
		System.out.println("Toplam Kazanc: " + toplamKazanc);
		System.out.println("Ortalama Kazanc: " + ortalamaKazanc());
		System.out.println("Ortalamanin Ustunde Kazanilan Gunler: " + ortalamaninUstundeKazanilanGunler());
		System.out.println("Ortalamanin Altinda Kazanilan Gunler: " + ortalamaninAltindaKazanilanGunler());

		scan.close();

	}

	private static float ortalamaKazanc() {

		return toplamKazanc / 7;
	}

	private static String ortalamaninUstundeKazanilanGunler() {
		String gun = "";
		for (int i = 0; i < gunlukKazanclar.size(); i++) {

			if (gunlukKazanclar.get(i) > ortalamaKazanc()) {
				gun += " " + gunler.get(i);
			}

		}
		return gun;
	}

	private static String ortalamaninAltindaKazanilanGunler() {
		String gun = "";
		for (int i = 0; i < gunlukKazanclar.size(); i++) {

			if (gunlukKazanclar.get(i) < ortalamaKazanc()) {
				gun += " " + gunler.get(i);
			}

		}
		return gun;
	}

}
