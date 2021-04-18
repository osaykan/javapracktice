package day03javapractice;

public class StaticVariable {
	int num1 = 3;
	static int num2= 10;

	public static void main(String[] args) {
		/*
		Iki tane instance int variable olusturunuz ve biri static digeri non-static olsun
		sonra bu class tan iki farkli object olusturunuz
		Her objectle instance variable lara rakam ekleyiniz
		*/

		StaticVariable obj1 = new StaticVariable();
		obj1.num1+=4;
		num2++;
		System.out.println(obj1.num1);
		System.out.println(obj1.num2);
		obj1.num1+=10;
		obj1.num2+=8;
		System.out.println(obj1.num1);
		System.out.println(obj1.num2);
		StaticVariable obj2 = new StaticVariable();
	
		obj2.num1+=2;
		num2+=5;
		
		
		System.out.println(obj2.num1);
		System.out.println(obj2.num2);
	}

}
