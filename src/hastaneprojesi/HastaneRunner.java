package hastaneprojesi;

public class HastaneRunner {
	
	private static Hastane hastane = new Hastane();

	public static void main(String[] args) {
		
		String hastaDurumu = "Kalp hastaliklari";
		String unvan = doktorUnvan(hastaDurumu);
		
	   hastane.setDoktor(doktorBul(unvan));
	   System.out.println("Doktor ismi: "+hastane.getDoktor().getIsim());
	   System.out.println("Doktor soy ismi: "+hastane.getDoktor().getSoyIsim());
	   System.out.println("Doktor unvani: "+hastane.getDoktor().getUnvan());
	

	}
	public static String doktorUnvan(String actuelDurum){
		
		if(actuelDurum.equals("Allerji")){
			return hastane.unvanlar[0];
		}else if(actuelDurum.equals("Basagrisi")){
			return hastane.unvanlar[1];
			
		}else if(actuelDurum.equals("Diabet")){
			return hastane.unvanlar[2];
			
		}else if(actuelDurum.equals("Soguk alginligi")){
			return hastane.unvanlar[3];
		}else if(actuelDurum.equals("Migren")){
			return hastane.unvanlar[4];
		}else if(actuelDurum.equals("Kalp hastaliklari")){
			return hastane.unvanlar[5];
		}
		return "Yanlis Durum";
	
	}
	public static Doktor doktorBul(String unvan){
		
		Doktor doktor = new Doktor();
		for (int i = 0; i < hastane.unvanlar.length; i++) {
			if(unvan.equals(hastane.unvanlar[i])){
				doktor.setIsim(hastane.doctorIsimleri[i]);
				doktor.setSoyIsim(hastane.doctorSoyIsimleri[i]);
				doktor.setUnvan(unvan);
			}
			
		}
		
		return doktor;
		
	}

}
