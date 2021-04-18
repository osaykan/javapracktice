package genelTekrar;

public class Vararg {

	public static void main(String[] args) {
		/*
		 Birden fazla tamsayıyı input olarak alıp toplamlarını veren bir METHOD yazınız
Method adı = toplama
toplama(1,2,3) yazarsak output =6
toplama(1,2,3,4,5) yazarsak output =15
toplama(1,2) yazarsak output =3
		 */
		toplama(1,2,10,4,5);

	}

	private static void toplama(int ...i) {
		int sonuc=0;
		for(int w:i) {
			sonuc+=w;
		}
		System.out.println(sonuc);
	}

}
