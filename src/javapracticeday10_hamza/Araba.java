package javapracticeday10_hamza;
public class Araba {
	// araba nesnesinin içerisinde yer almasını istediğimiz bilgileri 
	// tutacak değişkenler oluşturalım.
	private int id , maxHiz, yil;
	private String marka, renk, vites;
	public Araba() {
	}
	public Araba(int id, int maxHiz, int yil, String marka, String renk, String vites) {
		super();
		this.id = id;
		this.maxHiz = maxHiz;
		this.yil = yil;
		this.marka = marka;
		this.renk = renk;
		this.vites = vites;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getMaxHiz() {
		return maxHiz;
	}
	public void setMaxHiz(int maxHiz) {
		this.maxHiz = maxHiz;
	}
	public int getYil() {
		return yil;
	}
	public void setYil(int yil) {
		this.yil = yil;
	}
	public String getMarka() {
		return marka;
	}
	public void setMarka(String marka) {
		this.marka = marka;
	}
	public String getRenk() {
		return renk;
	}
	public void setRenk(String renk) {
		this.renk = renk;
	}
	public String getVites() {
		return vites;
	}
	public void setVites(String vites) {
		this.vites = vites;
	}
}