package day09okulproject;

import java.util.ArrayList;
import java.util.List;

public class Ogrenciler {

	private List<Ogrenci> ogrenciler = new ArrayList<>();

	public Ogrenciler() {

	}

	public void ogreciEkle(Ogrenci ogrenci) {
		ogrenciler.add(ogrenci);

	}

	public int ogrenciSayisi() {
		return ogrenciler.size();

	}

	@Override
	public String toString() {
		return "\n Ogrenciler : " + ogrenciler + "\n";
	}

}
