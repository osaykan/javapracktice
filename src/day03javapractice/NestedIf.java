package day03javapractice;

import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
	//Kullanicaidan üc sayi aliniz ve en büyük ve en kücük olanlari yazdiriniz
		Scanner scan = new Scanner(System.in);
		System.out.println("Lütfen üc sayi giriniz");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		
		if(num1>=num2 && num1>=num3){
			if(num2>=num3){
				System.out.println("En büyük sayi:"+num1);
				System.out.println("En kücük sayi:"+num3);
			}else{
				System.out.println("En büyük sayi:"+num1);
				System.out.println("En kücük sayi:"+num2);
			}
		}else if(num2>=num1 && num2>=num3){
			if(num1>=num3){
				System.out.println("En büyük sayi:"+num2);
				System.out.println("En kücük sayi:"+num3);
			}else{
				System.out.println("En büyük sayi:"+num2);
				System.out.println("En kücük sayi:"+num1);
				
			}
		}else{
			System.out.println("En büyük sayi: "+num3);
			if(num2>=num1){
				System.out.println("En kücük sayi:"+num1);
			}else{
				System.out.println("En kücük sayi:"+num2);
			}
		}
		

	}

}
