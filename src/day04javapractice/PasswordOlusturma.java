package day04javapractice;

public class PasswordOlusturma {

	public static void main(String[] args) {
//		 bir sifre olusturunuz ozellikleri sirasi ile soyle olmalidir;
//		 1_uzunlugu => en az 10 karakter(chars) olmalidir
//		 2_en az 1 sembol bulundurmali
//		 3_en az 1 numara bulundurmali
//		 4_en az buyuk harf olmalidir
//		 5_en az bir kucuk harf olmalidir
		String sembol = "!@#$%%^&*()_+";
		String password = "Mcab1323kl";
		String rakam ="0123456789";
		int numOfSembol = 0;
		int numOfRakam=0; 
		int numOfBuyukHarf =0;
		int numOfKucukHarf=0;
		
		
		  if(password.length()>9){
			  for(int i =0;i<password.length();i++){
		        
				  if(sembol.contains(password.substring(i,i+1))){
					  numOfSembol++;
				  }
				  if(rakam.contains(password.substring(i, i+1))){
					  numOfRakam++;
					  
				  }
				  if(password.charAt(i) >='a'&& password.charAt(i) <='z'){
					  numOfKucukHarf++;
					  
					  
					  
				  }
				  
				  if(password.charAt(i)>= 'A' && password.charAt(i)<= 'Z' ) {
					  numOfBuyukHarf++;
				  }
			  }
			  
			  
			  if(numOfSembol>0 && numOfRakam > 0 && numOfBuyukHarf > 0 && numOfKucukHarf >0) {
				  System.out.println("Tebrikler!");
				  System.out.println("Passwordunuz basarili bir sekilde olusturulmustur");
			  }else{
				  System.out.println("Sartlariniz maalesef password olusturmaya uymuyor");
			  }
			  
			  
			  
			  
		  }else{
			  System.out.println("length i en az 8 karakter olmali");
		  }
		

	}

}
