package day09okulproject;

public class Ogretmen {
	private String isim, brans, telefon;

	public Ogretmen() {

	}

	@Override
	public String toString() {
		return "\nIsim=" + isim + "\n brans=" + brans + "\n telefon=" + telefon + "\n";
	}

	public String getIsim() {
		return isim;
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public String getBrans() {
		return brans;
	}

	public void setBrans(String brans) {
		this.brans = brans;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

}
