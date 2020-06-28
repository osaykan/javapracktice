package javapracticeday7;

public class Hasta {
	
	private String isim;
	private String soyisim;
	private Case suankiDurum;     //önceki olusturdugumuz Case objesini variable olarak kullandik bu bir obje
	public String getIsim() {
		return isim;
	}
	public void setIsim(String isim) {
		this.isim = isim;
	}
	public String getSoyisim() {
		return soyisim;
	}
	public void setSoyisim(String soyisim) {
		this.soyisim = soyisim;
	}
	public Case getSuankiDurum() {
		return suankiDurum;
	}
	public void setSuankiDurum(Case suankiDurum) {
		this.suankiDurum = suankiDurum;
	}

}
