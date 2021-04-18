package day07javapractice;

public class HastaRunner {

	public static void main(String[] args) {
		
		
		Hasta hasta1 =new Hasta();
		Case durum = new Case();
		
		durum.setActualCase("Romatizma");
		durum.setEmergencey("Normal");
		
//		System.out.println("suanki durumu: "+durum.getActualCase());
//		System.out.println("Aciliyet durumu: "+durum.getEmergencey());

		hasta1.setIsim("John");
		hasta1.setSoyisim("Toprak");
		hasta1.setSuankiDurum(durum);
		
		
		System.out.println("Hastanin Ismi: "+hasta1.getIsim());
		System.out.println("Hastanin Soyismi: "+hasta1.getSoyisim());
		System.out.println("Hastanin aktuel durumu: "+hasta1.getSuankiDurum().getActualCase());
		System.out.println("Hastanin aciliyeti:"+hasta1.getSuankiDurum().getEmergencey());
		
     


	}

}
