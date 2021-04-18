package day09okulproject;

public class SabitBilgiler {
	/*
	 * Programda heryerden erişmek istediğimiz ve değiştirilmesini istemediğimiz
	 * değişkenler için static final kelimelerini kullanırız.
	 * 
	 * Adlandırma yaparken, mümkünse tum karakterleri büyük harf yapar, kelimelerin
	 * arasına da "_" (alt tire) ekleriz.
	 * 
	 * Bu değişkenlere herhangi bir nesne üretmeden ya da extend yapmadan direk
	 * erişebiliyoruz.
	 * 
	 */

	public static final String OKUL_ISMI = "Techproed";
	public static final String MUDUR = "Mesut Bey";
	public static final long TELEFON_NO = 0312222;
	public static final String WEB_ADRES = "http://techproed.com";
	public static final String TEKNIK_DESTEK = "Nazmi Bey";
	public static final String ADRES = "Günes Dogacak Sokak, 2020 / 7";

	/*
	 * Eğer bir class'tan nesne üretilmesini istemiyorsak, constructor'ı private
	 * yaparız (Singleton Class)
	 */

	public SabitBilgiler() {

	}

}
