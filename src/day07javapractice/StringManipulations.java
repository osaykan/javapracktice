package day07javapractice;

import java.util.Scanner;

public class StringManipulations {

	public static void main(String[] args) {
//		Kullanicidan isim ve soy isim isteyiniz ve bas harfleri buyuk 
//		geri kalan harfleri kucuk yazdiriniz
		Scanner sc = new Scanner(System.in);
		System.out.println("Lütfen adinizi va soyadinizi giriniz:");
		String isimSoyIsim =sc.nextLine().toLowerCase();
		
//		int ikinciBasNok =isimSoyIsim.indexOf(" ");
//	System.out.print(isimSoyIsim.substring(0, 1).toUpperCase());
//		System.out.print(isimSoyIsim.substring(1, ikinciBasNok+1).toLowerCase());
//		System.out.print(isimSoyIsim.substring( ikinciBasNok+1,ikinciBasNok+2).toUpperCase());
//		System.out.print(isimSoyIsim.substring(ikinciBasNok+2).toLowerCase());
		
		String isimler[]= isimSoyIsim.split(" ");
		String son="";
		for (int i = 0; i < isimler.length; i++) {
		son+=	(isimler[i].substring(0, 1).toUpperCase() +isimler[i].substring(1))+" ";
			
		}
		if(isimSoyIsim.length()!=son.length())
		System.out.println(son.substring(0,son.length()-1));//veya
		
    System.out.println(son.trim());
	}

}
