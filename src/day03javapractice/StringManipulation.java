package day03javapractice;

import java.util.Arrays;
import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		/*
		 * kullanicidan bir cumle isteyiniz ve cumlenin kelimelerini tersten yazdiriniz 
		 * e.g: I love java ==> java love I 
		 * String reverse = ""; 
		 * 
		 * substring method ile yapiniz veya array ile yapiniz
		 * 
		 */
       Scanner scan = new Scanner(System.in);
       System.out.println("Lütfen bir cümle giriniz");
       String str = scan.nextLine();
       String arr[]=str.split(" ");
       System.out.println(Arrays.toString(arr));
       System.out.println(arr.length);
       int length = arr.length;
       String yeni ="";
       for (int i = length-1; i >=0; i--) {
		yeni+=arr[i]+" ";
	}
System.out.println(yeni);










	}

}
