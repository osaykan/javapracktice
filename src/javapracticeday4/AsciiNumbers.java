package javapracticeday4;

public class AsciiNumbers {

	public static void main(String[] args) {
//	
//		Bir class olusturun ve adi AsciiNumbers olsun
//		Bir loop (dongu) olusturun ve orada sirasiyla alfabedeki harfleri 
//		kucuk harf olarak konsola yazdiriniz ve her harfin karsisina ascii numaralarini yazdiriniz
//		a => 97

		
		for (int i = 'a';i<='z';i++) {
			System.out.println((char)i +" =>"+i);  //�n�ne char yazarak narrowing yapmis olduk
			
		}
		
	}

}
