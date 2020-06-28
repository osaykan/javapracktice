package javapracticeday8_hamza;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class Question04 {

	public static void main(String[] args) {
		/* 1. Kullanıcının girdiği sayının, for döngüsü kullanarak rakamları toplamını bulan method yazınız.
		 * 
		 * 1. Adım : Kullanıcıdan sayı al.
		 * 2. Adım : Sayıyı String'e çevirin.
		 * 3. Adım : String'in her elemanını sayıya çevir ve toplama ekle
		 * 
		 * Bunu method kullanarak yapalım methodumuz toplamı return etsin.
		 * Method ismi : public static int getRakamlarToplami(int sayi)
		 * 
		*/
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen bir sayi giriniz");
		int num =scan.nextInt();
		System.out.println(rakamlarToplami(num));
		System.out.println(rakamlarToplamiWhileDongusu(num));
/*		int sum=0;
		while(num>0){
			sum+=num%10;
			num/=10;
		}
	
	    System.out.println(sum);
	    */	
	}
	//2.Yol method olusturup String ile cözüm
	
	 	
	public static int rakamlarToplami(int num){
		String sayininStringi=String.valueOf(num);
		int toplam=0;
		for(int i=0;i<sayininStringi.length();i++){
		
			int sayiyaCevir=Integer.parseInt(sayininStringi.substring(i,i+1));
			toplam+=sayiyaCevir;
		}
		
		return toplam;
	}
	public static int rakamlarToplamiWhileDongusu(int num){
	
		int sum=0;
		while(num>0){
			sum+=num%10;
			num/=10;
		}
	

		return sum;
	}

}
