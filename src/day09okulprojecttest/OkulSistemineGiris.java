package day09okulprojecttest;

import java.util.Scanner;

public class OkulSistemineGiris {
	/*
	 * Ögretmen, ögrenci ve okul genel bilgilerinden olusan JAVA programi yaziniz.
	 * 
	 * 1. Adım : Okulun sabit bilgilerini içerisine ekleyeceğimiz SabitBilgiler adlı
	 * bir class oluşturalım Buradaki verileri public static final olarak tutalım.
	 * MUDUR, OKUL_ISMI, TELEFON_NO, ADRES, WEBSITE, TEKNIK_DESTEK
	 * 
	 * 2. Adım : Ogretmen adlı bir class oluşturalım. Bu classta öğretmenin adı,
	 * branşı ve telefon numaralarını tutalım. String isim, brans, telefon ;
	 * 
	 * içerisine "public String toString()" methodu ekleyerek, istediğimiz zaman
	 * öğretmenlerin bilgilerini yazdıralım
	 * 
	 * 3. Adım : Ogrenci adlı bir class oluşturalım. Bu classta pgrencinin adı,
	 * okulnumarası bulunsun. String isim; int ogrenciNo;
	 * 
	 * içerisine "public String toString()" methodu ekleyerek, istediğimiz zaman
	 * ogrencilerin bilgilerini yazdıralım
	 * 
	 * 4. Adım : Ogretmenler adlı class oluşturalım. Bu classta tüm öğretmenleri
	 * tutualım. İçerisine List<Ogretmen> ogrentmenListesi adlı bir ArrayList
	 * oluşturalım ve tüm öğretmenleri içine ekleyelim Bu class'ın içine
	 * "ogretmenEkle(Ogretmen ogretmen)" diye bir method ekleyelim. Bunu kullanarak
	 * yeni öğretmen ekleyebilelim.
	 * 
	 * 5. Adım : Ogrenciler adlı class oluşturalım. Bu classta tüm öğrenciler
	 * tutualım. İçerisine List<Ogrenci> ogrenciListesi adlı bir ArrayList
	 * oluşturalım ve tüm öğretmenleri içine ekleyelim Bu class'ın içine
	 * "ogrenciEkle(Ogrenci ogrenci)" diye bir method ekleyelim. Bunu kullanarak
	 * yeni öğrenci ekleyebilelim.
	 * 
	 */
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println(SabitBilgiler.DIREKTOR);
		System.out.println(SabitBilgiler.NAME_DER_SCHULE);
		System.out.println(SabitBilgiler.ADRESS);
		System.out.println(SabitBilgiler.TELEFON_NO);
		System.out.println(SabitBilgiler.WEB_ADRESS);
		System.out.println(SabitBilgiler.TECHNIKES_PERSON);

		System.out.println("\n   Ogretmen Olusturalim");

		Ogretmen ogretmen1 = new Ogretmen();
		ogretmen1.setName("Ali Gel");
		ogretmen1.setFach("Mathematik");
		ogretmen1.setTelefonNo("0543000");

		Ogretmen ogretmen2 = new Ogretmen();
		ogretmen2.setName("Ali Disari");
		ogretmen2.setFach("Physic");
		ogretmen2.setTelefonNo("0632001");

		System.out.println(ogretmen1.toString());
		System.out.println(ogretmen2.toString());

		Ogretmenler ogretmenListesi = new Ogretmenler();
		ogretmenListesi.ogretmenEkle(ogretmen1);
		ogretmenListesi.ogretmenEkle(ogretmen2);

		System.out.println("Ogretmen Listesi : " + ogretmenListesi.toString());
		System.out.println("Ogretmen Sayisi : " + ogretmenListesi.ogretmenSayisi());

		System.out.println("\n Ogrenci Olusturalim ");

		Ogrenci ogrenci1 = new Ogrenci();
		ogrenci1.setOgrenciName("Kenan Al");
		ogrenci1.setOgrenciNumber(12);

		Ogrenci ogrenci2 = new Ogrenci();
		ogrenci2.setOgrenciName("Leyan Gül");
		ogrenci2.setOgrenciNumber(22);

		Ogrenciler ogrenciListesi = new Ogrenciler();
		ogrenciListesi.ogrenciEkle(ogrenci1);
		ogrenciListesi.ogrenciEkle(ogrenci2);

		System.out.println(ogrenciListesi.toString());

	}

}
