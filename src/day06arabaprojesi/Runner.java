package day06arabaprojesi;

public class Runner {

	public static void main(String[] args) {
	
	 //             reference type   Obje type              
	//polymorphisme:   Car araba1 = new Toyota();	
		
		Car araba1 = new Honda();
		System.out.println(araba1.arabaMarkasi());
		System.out.println(araba1.arabaModeli());
		System.out.println(araba1.arabaYili());
		
		Car araba2 = new Honda("Jazz",2020);
		System.out.println(araba2.arabaMarkasi());
		System.out.println(araba2.arabaModeli());
		System.out.println(araba2.arabaYili());
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
