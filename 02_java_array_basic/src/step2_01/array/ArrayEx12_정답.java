package step2_01.array;

import java.util.Arrays;
import java.util.Scanner;

/*
 * # 값 교체하기[2단계] 
 */

// 2022-01-07 12:30 ~ 12:40

public class ArrayEx12_정답 {

	public static void main(String[] args) {
	
		Scanner scan = new Scanner(System.in);
		
		int[] arr = {10,20,30,40,50};
		int getIndex1 , getIndex2;
		int getValue1 , getValue2;
		int temp = 0;
		
		// 문제 1) 인덱스 2개를 입력받아 값 교체하기
		// 예    1) 인덱스1 입력 : 1
		//		   인덱스2 입력 : 3
		//		  {10, 40, 30, 20, 50}
		System.out.print("인덱스1 입력 : ");
		getIndex1 = scan.nextInt();

		System.out.print("인덱스2 입력 : ");
		getIndex2 = scan.nextInt();
		
		getValue1 = arr[getIndex1];
		getValue2 = arr[getIndex2];
		
		arr[getIndex1] = getValue2;
		arr[getIndex2] = getValue1;
		
		System.out.println(Arrays.toString(arr));
		
		// 문제 2) 값 2개를 입력받아 값 교체하기
		// 예    2) 값1 입력 : 10
		//        값2 입력 : 50
		//		  {50, 20, 30, 40, 10}
		System.out.print("값1 입력 : ");
		getValue1 = scan.nextInt();
		
		System.out.print("값2 입력 : ");
		getValue2 = scan.nextInt();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == getValue1) {
				getIndex1 = i;
			}
			if (arr[i] == getValue2) {
				getIndex2 = i;
			}
		}
		
		arr[getIndex1] = getValue2;
		arr[getIndex2] = getValue1;
		
		System.out.println(Arrays.toString(arr));
		
		// 문제 3) 학번 2개를 입력받아 성적 교체하기
		// 예    3) 학번1 입력 : 1002
		//        학번2 입력 : 1003
		//		 {87, 45, 11, 98, 23}
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		int idx1 = 0;
		int idx2 = 0;
		
		System.out.print("학번1 입력 : ");
		int hak1 = scan.nextInt();
		
		System.out.print("학번2 입력 : ");
		int hak2 = scan.nextInt();
		
		for (int i = 0; i < hakbuns.length; i++) {
			if (hakbuns[i] == hak1) {
				idx1 = i;
			}
			if (hakbuns[i] == hak2) {
				idx2 = i;
			}
		}
		
		temp = scores[idx1];
		scores[idx1] = scores[idx2];
		scores[idx2] = temp;
		
		System.out.println(Arrays.toString(hakbuns));
		System.out.println(Arrays.toString(scores));
		
		scan.close();
		
	}
	
}
