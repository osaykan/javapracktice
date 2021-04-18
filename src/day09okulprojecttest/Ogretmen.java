package day09okulprojecttest;

public class Ogretmen {
	// 2. Adım : Ogretmen adlı bir class oluşturalım. Bu classta öğretmenin adı,
	// * branşı ve telefon numaralarını tutalım. String isim, brans, telefon ;

	private String name, fach, telefonNo;

	public Ogretmen() {

	}

	@Override
	public String toString() {
		return "\n Ogretmen name=" + name + "\n fach=" + fach + "\n telefonNo=" + telefonNo + "\n";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFach() {
		return fach;
	}

	public void setFach(String fach) {
		this.fach = fach;
	}

	public String getTelefonNo() {
		return telefonNo;
	}

	public void setTelefonNo(String telefonNo) {
		this.telefonNo = telefonNo;
	}

}
