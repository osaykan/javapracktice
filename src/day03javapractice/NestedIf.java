package day03javapractice;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
	//Kullanicaidan �c sayi aliniz ve en b�y�k ve en k�c�k olanlari yazdiriniz
		Scanner scan = new Scanner(System.in);
		System.out.println("L�tfen �c sayi giriniz");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		
		if(num1>=num2 && num1>=num3){
			if(num2>=num3){
				System.out.println("En b�y�k sayi:"+num1);
				System.out.println("En k�c�k sayi:"+num3);
			}else{
				System.out.println("En b�y�k sayi:"+num1);
				System.out.println("En k�c�k sayi:"+num2);
			}
		}else if(num2>=num1 && num2>=num3){
			if(num1>=num3){
				System.out.println("En b�y�k sayi:"+num2);
				System.out.println("En k�c�k sayi:"+num3);
			}else{
				System.out.println("En b�y�k sayi:"+num2);
				System.out.println("En k�c�k sayi:"+num1);
				
			}
		}else{
			System.out.println("En b�y�k sayi: "+num3);
			if(num2>=num1){
				System.out.println("En k�c�k sayi:"+num1);
			}else{
				System.out.println("En k�c�k sayi:"+num2);
			}
		}
		

	}

}
