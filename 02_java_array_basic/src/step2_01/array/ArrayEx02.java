package step2_01.array;

import java.util.Arrays;

public class ArrayEx02 {

	public static void main(String[] args) {
		
		// 배열 사용 예시 1
		String[] test1 = new String[3];
		double[] test2 = new double[5];
		char[] test3 = new char[1];
		boolean[] test4 = new boolean[10];
		
		int[] arr1 = new int[3];
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;
		
		// 배열 사용 예시 2 : 축약형 (배열을 처음 생성할 때만 가능)
		int[] arr2 = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		String[] arr3 = {"한놈", "두시기", "석삼", "너구리", "오징어"};
		char[] arr4 = {'O', 'X', 'O', 'X', 'X'};
		
		// 배열 사용 예시 3 : 다른 문법과의 조합
		int[] arr5 = new int[100];
		for (int i = 0; i < arr5.length; i++) {
			arr5[i] = i + 1;
		}
		
		// (참고) 배열이 익숙해진 후에 사용
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
		System.out.println(Arrays.toString(arr4));
		System.out.println(Arrays.toString(arr5));
		
	}
	
}
