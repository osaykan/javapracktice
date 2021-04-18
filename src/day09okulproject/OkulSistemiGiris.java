package day09okulproject;

public class OkulSistemiGiris {
	/*
	 * Öğretmen, öğrenci ve okul genel bilgilerinden oluşan JAVA programı yazınız.
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
	/*
	 * Eğer nesne üreterek başka bir class'tan bilgi almak istiyorsak ya da
	 * methodlara, değişkenlere erişmek istiyorsak, verilerimizi private yapabilir,
	 * onlara public methodlardan erişebiliriz. buna Encapsolution deniliyor.
	 * (getter ve setter methodları)
	 */
	public static void main(String[] args) {
		System.out.println("**OKUL SISTEMINE HOS GELDINIZ***");

		System.out.println("Okul Ismi : " + SabitBilgiler.OKUL_ISMI);
		System.out.println("Müdür Bey : " + SabitBilgiler.MUDUR);
		System.out.println("Telefon No : " + SabitBilgiler.TELEFON_NO);
		System.out.println("Website: " + SabitBilgiler.WEB_ADRES);
		System.out.println("Teknik Destek :" + SabitBilgiler.TEKNIK_DESTEK);
		System.out.println("Adres : " + SabitBilgiler.ADRES);

		System.out.println("\n  Ogretmen Olusturalim");

		Ogretmen ogretmenSuleymanBey = new Ogretmen();
		ogretmenSuleymanBey.setIsim("Süleyman Alptekin");
		ogretmenSuleymanBey.setBrans("Java");
		ogretmenSuleymanBey.setTelefon("05399999");

		System.out.println("Ogretmen Süleyman : " + ogretmenSuleymanBey.toString());

		Ogretmen ogretmenHamza = new Ogretmen();
		ogretmenHamza.setIsim("Hamza Yilmaz");
		ogretmenHamza.setBrans("Practice");
		ogretmenHamza.setTelefon("05366666");

		System.out.println("Ogretmen Hamza : " + ogretmenHamza.toString());// ogretmen classinda toString overriding
																			// yapildi

		Ogretmen1 ogretmenAyseHanim = new Ogretmen1("Ayse Hanim", "Selenium", "0500000");

		System.out.println("\nIsim : " + ogretmenAyseHanim.getIsim());
		System.out.println("Brans : " + ogretmenAyseHanim.getBrans());
		System.out.println("Tel : " + ogretmenAyseHanim.getTelefon());

		System.out.println("\n  Ogrenci Olusturalim");

		Ogrenci ogrenci1 = new Ogrenci();
		ogrenci1.setIsim("Osman Aykan");
		ogrenci1.setNo(1);

		System.out.println(ogrenci1.toString());

		Ogrenci ogrenci2 = new Ogrenci();
		ogrenci2.setIsim("Numan Aykan");
		ogrenci2.setNo(2);
		System.out.println(ogrenci2.toString());

		Ogrenci ogrenci3 = new Ogrenci();
		ogrenci3.setIsim("Zehra Aykan");
		ogrenci3.setNo(3);
		System.out.println(ogrenci3.toString());

		System.out.println("\n OGRETMENLER CLASS   \n");

		Ogretmenler ogretmenler = new Ogretmenler();
		ogretmenler.ogretmenEkle(ogretmenSuleymanBey);
		ogretmenler.ogretmenEkle(ogretmenHamza);

		System.out.println(ogretmenler.ogretmenSayisi());
		System.out.println(ogretmenler.toString());

		System.out.println("\n OGRENCILER CLASS   \n");
		Ogrenciler ogrenciler = new Ogrenciler();
		ogrenciler.ogreciEkle(ogrenci1);
		ogrenciler.ogreciEkle(ogrenci2);
		ogrenciler.ogreciEkle(ogrenci3);

		System.out.println(ogrenciler.ogrenciSayisi());
		System.out.println(ogrenciler.toString());

	}

}
