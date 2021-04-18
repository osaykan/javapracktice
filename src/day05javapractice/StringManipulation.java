package day05javapractice;

import java.util.Scanner;

public class StringManipulation {

	public static void main(String[] args) {
		
		/*
		Kullanicidan bir e-mail addressi  isteyiniz eger email id de "hotmail" varsa  "gmail" ile degistiriniz
		e.g: mesutyaman@hotmail.com  ==> mesutyaman@gmail.com
		*/

    Scanner scan = new Scanner(System.in);
    System.out.println("Email adresinizi giriniz");
    String str = scan.nextLine();
 
    if(str.contains("hotmail")){
    	str=str.replace("hotmail","gmail");
    }
    System.out.println(str);

	}

}
