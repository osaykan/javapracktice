package javapracticeday4;

import java.util.Scanner;

public class LoopIfStatementsAndIncrementDecrement {

	public static void main(String[] args) {
//		Yeni bir class olusturunuz adi
//		 LoopIfStatementsAndIncrementDecrement olsun
//		 bir userName (kullanici adi)olusturunuz ve onun ozellikleri sirasi ile soyle olmalidir;
//		 1_uzunlugu => en az 8 karakter (chars) olmalidir
//		 2_icinde sadece alfabetik karakterler bulunmalidir
		
//		 bir sifre olusturunuz ozellikleri sirasi ile soyle olmalidir;
//		 1_uzunlugu => en az 10 karakter(chars) olmalidir
//		 2_en az 1 sembol bulundurmali
//		 3_en az 1 numara bulundurmali
//		 4_en az buyuk harf olmalidir
//		 5_en az bir kucuk harf olmalidir

        String userName = "SelimTopbas".toLowerCase();// length of the userName => 5
        int count = 0;
        if (userName.length() >= 8) {
            for (int i = 0; i < userName.length(); i++) {
                char temp = userName.charAt(i);
                if (temp < 'a' || temp > 'z') {        //!(temp >= 'a' && temp <= 'z') olabilirdi
                    count++;
                }
            }
            if (count == 0) {
                System.out.println("Olusturdugunuz user name basarili bir sekilde isleme gecmistir");
            } else {
                System.out.println("User name basarili bir sekilde olusturulamamistir");
                System.out.println("Lutfen tekrar deneyiniz");
            }
        } else {
            System.out.println("username length i yetersizdir!");
            System.out.println("Lutfen tekrar deneyiniz");
        }
        
	}
}
