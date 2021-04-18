package javapracticeday10_hamza;
public interface IArabaIslemler {
	 public void arabaKayıt(Araba araba); // Araba classından oluşturulan nesneleri ekleyeceğiz
	 public void arabaSatis(int id);
	 public void arabaGuncelleme(int id , Araba araba);
	 public void arabalariGoruntuleme();
}