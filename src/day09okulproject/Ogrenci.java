package day09okulproject;

public class Ogrenci {

	private String isim;

	public Ogrenci() {
		// TODO Auto-generated constructor stub
	}

	public String getIsim() {
		return isim;
	}

	@Override
	public String toString() {
		return "Isim : " + isim + "\n Numara=" + no + "\n";
	}

	public void setIsim(String isim) {
		this.isim = isim;
	}

	public int getNo() {
		return no;
	}

	public void setNo(int no) {
		this.no = no;
	}

	private int no;

}
