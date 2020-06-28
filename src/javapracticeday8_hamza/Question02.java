package javapracticeday8_hamza;

import java.util.Random;
import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		/*
		 * Whilde döngüsü kullanarak "sayı tahmin oyunu" yazınız. 
		 * 
		 * 1. Adım : Java ile rastgele bir sayı üretelim (new Random() kullanabilrsiniz)
		 * 2. Adım : Kullanıcıdan tahminini alalım.
		 * 3. Adım : Kullanıcının girdiği tahmini, bilgisayarın ürettiği 
		 * 			 rastgele sayı ile karşılaştıralım.
		 * 4. Adım : Cevap doğru olana kadar 2. ve 3. adımı tekrarlayalım, 
		 * 			 bunu da while döngüsü ile yapalım.
		 *
		 * */
		Random random = new Random();
		int rastgeleSayi =random.nextInt(100);
		Scanner scan= new Scanner(System.in);
	
		int tahmin= -1;
		System.out.println("100 e kadar bir sayi tahmin ediniz");
		while(rastgeleSayi!=tahmin){

			tahmin=scan.nextInt();
			
			if(rastgeleSayi<tahmin){
				System.out.println("Azalt");
			}else if(rastgeleSayi>tahmin){
				System.out.println("Artir");
			}else if(rastgeleSayi==tahmin){
				System.out.println("Tebrikler bildiniz");
			}
		}

	}

}
