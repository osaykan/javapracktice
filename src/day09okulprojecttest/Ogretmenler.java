package day09okulprojecttest;

import java.util.ArrayList;
import java.util.List;

public class Ogretmenler {
	/*
	 * 4. Adım : Ogretmenler adlı class oluşturalım. Bu classta tüm öğretmenleri
	 * tutualım. İçerisine List<Ogretmen> ogrentmenListesi adlı bir ArrayList
	 * oluşturalım ve tüm öğretmenleri içine ekleyelim Bu class'ın içine
	 * "ogretmenEkle(Ogretmen ogretmen)" diye bir method ekleyelim. Bunu kullanarak
	 * yeni öğretmen ekleyebilelim.
	 * 
	 */
	private List<Ogretmen> ogretmenlerListesi = new ArrayList<>();

	@Override
	public String toString() {
		return "\n Ogretmenler : " + ogretmenlerListesi + "\n";
	}

	public Ogretmenler() {

	}

	public void ogretmenEkle(Ogretmen ogretmen) {
		ogretmenlerListesi.add(ogretmen);
	}

	public int ogretmenSayisi() {
		return ogretmenlerListesi.size();
	}

}
