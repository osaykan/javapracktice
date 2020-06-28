package javapracticeday6;

import java.util.Scanner;

public class IfStatamentVeTernary {

	public static void main(String[] args) {
	//Kullanicidan iki sayi aliniz ve Büyük olani büyük sayi
		//Kücük olani da kücük sayi diye yazdiriniz
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen iki sayi giriniz");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
	   
		if(num1>num2){
			System.out.println("Büyük sayi: "+num1);
			System.out.println("Kücük sayi: "+num2);
		}else if(num1<num2){
			System.out.println("Büyük sayi: "+num2);
			System.out.println("Kücük sayi: "+num1);
		}else {
			System.out.println("Sayilar esit");
		}                               //\n yazinca alt satira yazdirir.
		
		String result = num1>=num2?(num1+" enbüyük sayi\n"+ num2+" en kücük sayidir"):(num2+" enbüyük sayi\n" +num1+" en kücük sayidir");
		System.out.println(result);
		scan.close();
	}

}
