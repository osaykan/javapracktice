package day09okulprojecttest;

public class Ogrenci {
	// * 3. Adım : Ogrenci adlı bir class oluşturalım. Bu classta pgrencinin adı,
	// * okulnumarası bulunsun. String isim; int ogrenciNo;
	// * içerisine "public String toString()" methodu ekleyerek, istediğimiz zaman
	// * ogrencilerin bilgilerini yazdıralım

	private String ogrenciName;
	private int ogrenciNumber;

	public Ogrenci() {

	}

	@Override
	public String toString() {
		return "\nOgrenci Name : " + ogrenciName + "\n Ogrenci Number : " + ogrenciNumber + "\n";
	}

	public String getOgrenciName() {
		return ogrenciName;
	}

	public void setOgrenciName(String ogrenciName) {
		this.ogrenciName = ogrenciName;
	}

	public int getOgrenciNumber() {
		return ogrenciNumber;
	}

	public void setOgrenciNumber(int ogrenciNumber) {
		this.ogrenciNumber = ogrenciNumber;
	}

}
