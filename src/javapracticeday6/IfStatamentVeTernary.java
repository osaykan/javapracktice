package javapracticeday6;

import java.util.Scanner;

public class IfStatamentVeTernary {

	public static void main(String[] args) {
	//Kullanicidan iki sayi aliniz ve B�y�k olani b�y�k sayi
		//K�c�k olani da k�c�k sayi diye yazdiriniz
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen iki sayi giriniz");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
	   
		if(num1>num2){
			System.out.println("B�y�k sayi: "+num1);
			System.out.println("K�c�k sayi: "+num2);
		}else if(num1<num2){
			System.out.println("B�y�k sayi: "+num2);
			System.out.println("K�c�k sayi: "+num1);
		}else {
			System.out.println("Sayilar esit");
		}                               //\n yazinca alt satira yazdirir.
		
		String result = num1>=num2?(num1+" enb�y�k sayi\n"+ num2+" en k�c�k sayidir"):(num2+" enb�y�k sayi\n" +num1+" en k�c�k sayidir");
		System.out.println(result);
		scan.close();
	}

}
