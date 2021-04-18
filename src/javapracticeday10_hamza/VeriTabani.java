package javapracticeday10_hamza;
import java.util.ArrayList;
import java.util.List;
public class VeriTabani implements IArabaIslemler {
	List<Araba> arabalar = new ArrayList<>();
	@Override
	public void arabaKayıt(Araba araba) {
		arabalar.add(araba);		
	}
	@Override
	public void arabaSatis(int id) {
		for(int i = 0 ; i < arabalar.size() ; i++) {
			Araba araba = arabalar.get(i);
			if(araba.getId() == id) { 
				arabalar.remove(i);
				break;
			}
		}
	}
	@Override
	public void arabaGuncelleme(int id, Araba araba) {  // 110000 
		for(int i = 0 ; i < arabalar.size() ; i++) {
			Araba suankiBakilanAraba = arabalar.get(i);
			if(suankiBakilanAraba.getId() == id) { 
				arabalar.set(i,araba); // güncelledik.
				break;
			}
		}
	}
	@Override
	public void arabalariGoruntuleme() {
		for(Araba araba : arabalar) {
			System.out.println(araba.getId() + "-" + araba.getMarka() + "-"+ araba.getMaxHiz()
			+ "-" + araba.getRenk() + "-" + araba.getVites() + "-" + araba.getYil());
		}
	}
	// 10 geçe buluşalım.
	// abstract class ve interface'in en büyük farkı
	// abstract class kullanılırsa sadece bir tane miras alınabilir (extends )
	// interface kullanılırsa birden fazla interface miras alınabilir (implements)
	// eğer abstract kullanırsak içerisinde tüm methodları (abstract + diğerleri) override yapmak zorunda değiliz.
	// eğer interface kullanırsak override yapmak zorundayız.
}