package day05javapractice;

import java.util.Scanner;

public class SubstringOrnek {

	public static void main(String[] args) {
		/*
		Kullanicidan iki isim isteyiniz eger ilk isim uzunlugu cift sayi ise ikinci ismi ilk ismin ortasina ekleyiniz
	
		mehmet ==>  mehahmetmet
		ahmet
		*/

		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen iki isim giriniz");
		String name1 = scan.next();
		String name2=scan.next();
		
		if(name1.length()%2==0){
			String yeni = name1.substring(0, name1.length()/2)+name2+name1.substring(name1.length()/2);
			System.out.println(yeni);
		}
		
	}

}
