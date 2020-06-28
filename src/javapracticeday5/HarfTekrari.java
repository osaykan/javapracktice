package javapracticeday5;

import java.util.Arrays;

public class HarfTekrari {

	public static void main(String[] args) {
		/*
	
		char ch = 'p';
		String str = “Ingilizce’de purple mor ve people insanlar demektir";
		int count = 0;
		Yukaridaki String te elinizdeki char ne kadar tekrar etmisse o kadar return etsin
		for loop, increment ve if statements kullanabilirsiniz
		
*/
		char ch ='p';
		String str = "Ingilizce'de purple mor ve people insanlar demektir";
		int count=0;
		String arr[]= str.split("");
		System.out.println(Arrays.toString(arr));
for (int i = 0; i < arr.length; i++) {
	if(arr[i].equals("p")){
		count++;
		
	}
	
}
System.out.println(count);
	}

}
