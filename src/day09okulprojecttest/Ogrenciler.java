package day09okulprojecttest;

import java.util.ArrayList;
import java.util.List;

public class Ogrenciler {
	/*
	 * 5. Adım : Ogrenciler adlı class oluşturalım. Bu classta tüm öğrenciler
	 * tutualım. İçerisine List<Ogrenci> ogrenciListesi adlı bir ArrayList
	 * oluşturalım ve tüm öğretmenleri içine ekleyelim Bu class'ın içine
	 * "ogrenciEkle(Ogrenci ogrenci)" diye bir method ekleyelim. Bunu kullanarak
	 * yeni öğrenci ekleyebilelim.
	 */
	private List<Ogrenci> ogrenciListesi = new ArrayList<>();

	@Override
	public String toString() {
		return "Ogrenci Listesi : " + ogrenciListesi + "\n";
	}

	public Ogrenciler() {

	}

	public void ogrenciEkle(Ogrenci ogrenci) {
		ogrenciListesi.add(ogrenci);

	}

}
