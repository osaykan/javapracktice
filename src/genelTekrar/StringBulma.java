package genelTekrar;

import java.util.Scanner;

public class StringBulma {

	public static void main(String[] args) {
		/*
		 Kullanıcıdan bir cümle ve bir String isteyin
Stringin cümlede kaç defa kullanıldığını bulan ve örnekteki gibi sonuç yazdıran bir program yazın
(Büyük harf küçük harf olması önemli degil)
Cümle =“Hasan sanayiye gitti” String=“san”
output = cümlede 2 tane “san” var.
		 */

		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		String input=scan.nextLine();
		System.out.println("Lütfen bulmak istediginiz Stringi yaziniz");
		String arananStr=scan.next();
		
		int count =0;
		
		for(int i=0;i<input.length()-arananStr.length();i++) {
			if(input.substring(i, i+arananStr.length()).equalsIgnoreCase(arananStr)) {
				count++;
			}
		}
		System.out.println("Cümlede "+count+" tane "+arananStr+ " vardir");
		
	}

}
