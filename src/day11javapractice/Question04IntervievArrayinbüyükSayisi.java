package day11javapractice;

public class Question04IntervievArrayinb�y�kSayisi {
	// Elimizdeki Arrayin en b�y�k sayisini bulan method yaziniz

	public static void main(String[] args) {

		int[] array = { 12, 56, 788, 4, 1, 0, 999, 38884 };

		int enB�y�kSayi = getEnbuyukSayi(array);
		System.out.println("Enb�y�k Sayi : " + enB�y�kSayi);

	}

	private static int getEnbuyukSayi(int[] array) {
		int max = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] > max) {
				max = array[i];
			}

		}

		return max;
	}

}
