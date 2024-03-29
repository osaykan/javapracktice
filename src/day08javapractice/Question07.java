package day08javapractice;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Question07 {
	/*  Rastgele kullanıcı adı oluşturan JAVA kodu yazınız.
	 *  1. Adım : Kullanıcıdan ismini isteyelim
	 *  2. Adım : Kullanıcı adındaki boşlukları silelim.
	 *  3. Adım : Kullanıcı adının alınabilir olup olmadığına bakalım.
	 *  4. Adım : Eğer bizim listemizde öyle bir kullanıcı adı yoksa kullanıcı adı, kullanıcının girdiği isim olsun.
	 *  5. Adım : Eğer bu kullanıcı adı zaten varsa, sonuna rastgele sayı oluşturup ekleyelim, ve gösterelim.
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>(); 
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ayşe");
		veritabanindakiKullaniciListesi.add("Süleyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
	 */

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<String> veritabanindakiKullaniciListesi = new ArrayList<>(); 
		veritabanindakiKullaniciListesi.add("Ahmet");
		veritabanindakiKullaniciListesi.add("Ayşe");
		veritabanindakiKullaniciListesi.add("Süleyman");
		veritabanindakiKullaniciListesi.add("Nazmi");
		System.out.println("Lütfen Ad Soyad giriniz : ");
		String adSoyad = scan.nextLine().replace(" ", "");
		/*if(veritabanindakiKullaniciListesi.contains(adSoyad)) {
			System.out.println("Bu kullanıcı alınmış.");
		}else {
			System.out.println("Bu kullanıcı adı UYGUN !");
			veritabanindakiKullaniciListesi.add(adSoyad);
		}*/
		System.out.println(veritabanindakiKullaniciListesi.contains(adSoyad) ? "Bu kullanici alinmis." : "Bu kullanici adi UYGUN !" );
		if(veritabanindakiKullaniciListesi.contains(adSoyad)) {
			int rastgeleSayi = new Random().nextInt(100000);
			String yeniKullaniciAdi = adSoyad + rastgeleSayi;
			System.out.println("YENİ KULLANICI ADINIZ : " + yeniKullaniciAdi);
		}else {
			System.out.println("YENİ KULLANICI ADINIZ : " + adSoyad);
			veritabanindakiKullaniciListesi.add(adSoyad);
			
		}
		
		scan.close();
	}

}
