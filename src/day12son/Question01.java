package day12son;

import java.util.Arrays;

public class Question01 {

	/*
	 * Iki farklı Array'i birleştiren ve oluşturduğu yeni Array'i return eden bir
	 * method yazınız.
	 * 
	 * getBirlestirilmisArray(int[] array1, int[] array2) return yeniArray;
	 * 
	 * [1,2,3] ve [5,6,7]
	 * 
	 * [1,2,3,5,6,7]
	 * 
	 * 3 dk süre verelim.
	 * 
	 */

	public static void main(String[] args) {
		int[] array1 = { 1, 2, 3 };
		int[] array2 = { 5, 6, 7 };

		System.out.println(Arrays.toString(getBirlestirilmisArray(array1, array2)));

	}

	public static int[] getBirlestirilmisArray(int[] array1, int[] array2) {
		int x = array1.length + array2.length;
		int[] yeniArray = Arrays.copyOf(array1, x);

		for (int i = 0; i < array2.length; i++) {
			yeniArray[array1.length + i] = array2[i];
		}

		return yeniArray;

	}
}
