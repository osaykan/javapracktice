package day11javapractice;

public class Question04IntervievArrayinbüyükSayisi {
	// Elimizdeki Arrayin en büyük sayisini bulan method yaziniz

	public static void main(String[] args) {

		int[] array = { 12, 56, 788, 4, 1, 0, 999, 38884 };

		int enBüyükSayi = getEnbuyukSayi(array);
		System.out.println("Enbüyük Sayi : " + enBüyükSayi);

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
