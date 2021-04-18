package day08javapractice;

import java.util.Scanner;

public class Question01 {

	public static void main(String[] args) {
		/* Santimetreyi, metreye ve kilometreye çeviren bir program yazınız.
		 Çıktı : 
		 Lütfen santimetre değerini giriniz:
		 	212
		 212 santimetre 2.12 metre ve 0.00212 kilometreye eşittir.
		İpucu : 100 cm = 1 mt = 0.001 kilometre
		*/
		Scanner scan =new Scanner(System.in);
		System.out.println("Lütfen uzunlugu santimetre olarak giriniz");
		double uzunluk=scan.nextDouble();
		double metre=uzunluk/100;
		double kilometre=uzunluk/100000;
		System.out.println(uzunluk+" santimetre "+ metre+" metre ve "+kilometre+" kilometreye esittir");
		
		//////////////////////////////////////////////////
		
		System.out.println("\ngetMetre"+getMetre(uzunluk));
		System.out.println("\ngetKilometre"+getKilometre(uzunluk));
		
scan.close();		

	}
   private static double getMetre(double uzunluk){
	   return uzunluk/100;
   }
   private static double getKilometre(double uzunluk){
	   return uzunluk/100000;
   }
}
