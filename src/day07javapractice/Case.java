package day07javapractice;

public class Case {

	//Durum
	/*
    Case sinifi olusturunuz ve icin de 2 String variable olsun ve private olsunlar
    sonra getter ve setterlar kullaniniz
    String actualCase;//suan durumu
    String emergencey; // acil durum
*/
	
	private String actualCase;
	 private String emergencey;
	
	public static void main(String[] args) {
		
	}

	public String getActualCase() {
		return actualCase;
	}

	public void setActualCase(String actualCase) {
		this.actualCase = actualCase;
	}

	public String getEmergencey() {
		return emergencey;
	}

	public void setEmergencey(String emergencey) {
		this.emergencey = emergencey;
	}

}
