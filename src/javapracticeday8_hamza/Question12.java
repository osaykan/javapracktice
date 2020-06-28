package javapracticeday8_hamza;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question12 {
	/*
	 * ATM uygulaması yapınız.
	 * 
	 * 1. Adım : Bankamızdaki müşterilerin musteriNumarasi ve 4 haneli şifresini
	 * tutan bir HashMap oluşturalım. Ve şu müşterileri biz ekleyelim. Integer,
	 * Integer
	 * 
	 * Müşteri No -- Şifre 12345678 1876 22222222 1234 98765432 1453 55554444 2020
	 * 
	 * 2. Adım : Bankamızdaki müşterilerin hesaplarındaki para miktarini tutan bir
	 * tane HashMap oluşturalım. Ve şu miktarları müşteri numarasıyla birlikte
	 * ekleyelim Integer,Float
	 * 
	 * Müşteri No -- Para 12345678 120.0 22222222 3000.0 98765432 7000.0 55554444
	 * 50.0
	 * 
	 * 3. Adım : Giriş ekranı oluşturalım. Müşteri buradan giriş yapsın. Kullanıcı
	 * adı ve şifre isteyelim, doğru ise giriş yapsın.
	 * 
	 * 4. Adım : Doğru müşteri numarası ve şifre kontrol eden methodlar yazalım.
	 * musteriNumarasiDogruMu(int no) Hashmap listemizde varsa, doğru müşteri
	 * numarasıdır.
	 * 
	 * sifreDogruMu (int no, int sifre) HashMap'teki şifre ile uyuşuyorsa doğru
	 * şifredir.
	 * 
	 * 5. Adım : Girş yaptıktan sonra karşısına 3 tane seçenek çıksın : Bunları da
	 * menuGoster() methodu ile yapalım. 1- Para Çek 2- Para Yükle 3- Toplam Paramı
	 * Gör 3- Çıkış Yap
	 * 
	 * 6. Adım : Çıkış methodu oluşturalım. Giriş yapan müşteri çıkış yapmak
	 * isterse, toplamPara ve girisYapanMusteriNo'yu sıfırlayalım. Tekrar giriş
	 * ekranına yöndendirelim.
	 * 
	 * 6. Adım : Toplam parami gor methodu oluşturalım. toplamParamiGor()
	 * 
	 * 7. Adım : 1- Para Çekme Methodu Oluşturalım Hesaba giriş yapan müşteriye
	 * hesabındaki toplam parayı gösterelim. Kullanıcıdan çekmek istediği tutarı
	 * öğrenelim. Hesabında yeterli para varsa, para çeksin yoksa uyarı verelim.
	 * Çektiği tutarı, toplam parasından düşelim ve kaydedelim. Başka işlem yapmak
	 * isteyip istemediğini soralım, isterse yaptıralım, yoksa çıkış işlemi
	 * gerçekleştirelim.
	 * 
	 * 8. Adım : 1- Para Yükleme Methodu Oluşturalım Hesaba giriş yapan müşteriye
	 * hesabındaki toplam parayı gösterelim. Kullanıcıdan yüklemek istediği tutarı
	 * öğrenelim. Yüklediği tutarı, toplam parasına ekleyelim ve gösterelim. Başka
	 * işlem yapmak isteyip istemediğini soralım, isterse yaptıralım, yoksa çıkış
	 * işlemi gerçekleştirelim.
	 * 
	 */
	static Map<Integer, Integer> müsteriBilgileri = new HashMap<>();// Müsteri no ve sifre icin
	static Map<Integer, Float> toplamParaMiktarlari = new HashMap<>();
	static Scanner scan = new Scanner(System.in);
	static int girisYapanKullanicininMüsteriNumarasi = 0;
	static float girisYapanKullanicininHesabindakiPara = 0;

	public static void main(String[] args) {
		// Key Value
		müsteriBilgileri.put(12345678, 1876);
		müsteriBilgileri.put(22222222, 1234);
		müsteriBilgileri.put(98765432, 1453);
		müsteriBilgileri.put(55554444, 2020);

		toplamParaMiktarlari.put(12345678, 120.0f);
		toplamParaMiktarlari.put(22222222, 1000.0f);
		toplamParaMiktarlari.put(98765432, 5.0f);
		toplamParaMiktarlari.put(55554444, 255.0f);
		// müsteriBilgileri.get(12345678)==>1876 sifreyi verir tersi yok
		girisEkrani();

	}

	private static void girisEkrani() {

		System.out.println("Müsteri numaranizi giriniz : ");
		int müsteriNo = scan.nextInt();

		if (müsteriBilgileri.get(müsteriNo) == null) {
			System.out.println("Böyle bir müsteri yok.");
			girisEkrani();
			return; // break gibi ama methodlarda return yazilir.

		} else {
			System.out.println("Müsteri numaraniz: " + müsteriNo);
			System.out.println("Lütfen sifrenizi giriniz");
			int sifre = scan.nextInt();

			// müsteriBilgileri.get(12345678)
			if (müsteriBilgileri.get(müsteriNo) == sifre) {
				System.out.println("Hosgeldiniz");
				girisYapanKullanicininMüsteriNumarasi = müsteriNo;
				girisYapanKullanicininHesabindakiPara = toplamParaMiktarlari.get(müsteriNo);

				menüGöster();

			} else {
				System.out.println("Sifreniz yanlis");
				girisEkrani();
				return;
			}
		}

	}

	private static void menüGöster() {
		System.out.println("Secim yapiniz");
		System.out.println(" 1-PARA CEK\n 2-PARA YÜKLE\n 3-TOPLAM PARAMI GÖR\n 4-CIKIS YAP");

		int secim = scan.nextInt();

		switch (secim) { // swi den sonra ctrl+space bas prtk
		case 1:
			paraCek();

			break;
		case 2:
			System.out.println("Ne kadar para yatirmak istersiniz?");
			float miktar = scan.nextFloat();
			girisYapanKullanicininHesabindakiPara = girisYapanKullanicininHesabindakiPara + miktar;

			System.out.println("Para hesaba yatırıldı.");
			System.out.println("Toplam paranız : " + girisYapanKullanicininHesabindakiPara);

			toplamParaMiktarlari.put(girisYapanKullanicininMüsteriNumarasi, girisYapanKullanicininHesabindakiPara);// son
																													// durumu
																													// depoladi

			menüGöster();

			break;
		case 3:
			System.out.println("Hesabinizdaki Toplam Para: " + girisYapanKullanicininHesabindakiPara);
			menüGöster();
			break;
		case 4:
			System.out.println(" CIKIS YAPILDI");
			girisEkrani();

			break;

		default:
			System.out.println("Yanlis secim yapildi");
			menüGöster();
			break;
		}

	}

	private static void paraCek() {
		System.out.println(" Hesabinizdan ne kadar para cekmek istiyorsunuz: ");
		float miktar = scan.nextFloat();
		if (miktar > girisYapanKullanicininHesabindakiPara) {
			System.out.println("Hesabinizda sadece " + girisYapanKullanicininHesabindakiPara + " lira var");
			paraCek();
		} else {
			girisYapanKullanicininHesabindakiPara = girisYapanKullanicininHesabindakiPara - miktar;
			toplamParaMiktarlari.put(girisYapanKullanicininMüsteriNumarasi, girisYapanKullanicininHesabindakiPara);// son
																													// durumu
																													// depoladi
			System.out.println("Para cekildi");
			System.out.println("Kalan Tutar : " + girisYapanKullanicininHesabindakiPara);
			menüGöster();
		}

	}

}
