package step2_01.array;

import java.util.Arrays;

/*
 * # 4의 배수만 저장
 * 
 * - arr 배열에서 4의 배수의 개수를 계산하여 4의 배수만큼 temp 배열을 생성한뒤에 
 *   arr배열의 4의 배수들을  temp로 옮겨닮아보시오.
 * 
 */

// 2022-01-07 13:10 ~ 13:15

public class ArrayEx13_정답 {

	public static void main(String[] args) {
		
		int[] arr = {44, 11, 29, 24, 76};
		int[] temp = null;
		int count = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				count++;
			}
		}
		
		temp = new int[count];
		int idx = 0;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 4 == 0) {
				temp[idx] = arr[i];
				idx++;
			}
		}
		
		System.out.println(Arrays.toString(temp));
		
	}
	
}
