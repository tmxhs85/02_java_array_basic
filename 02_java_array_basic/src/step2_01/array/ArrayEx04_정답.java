package step2_01.array;

import java.util.Random;

/*
 * # 학생성적관리 프로그램[1단계] : 학생점수
 */

public class ArrayEx04_정답 {

	public static void main(String[] args) {
		
		int[] arr = new int[5];
		Random ran = new Random();

		// 문제1) arr배열에 1~100점 사이의 랜덤 정수를 5개 저장
		// 예   1) 87, 11, 92, 14, 47
		for (int i = 0; i < arr.length; i++) {
			arr[i] = ran.nextInt(100) + 1;
			System.out.print(arr[i] + " ");
		}
		
		System.out.println();
		
		// 문제2) 전교생의 총점과 평균 출력
		// 예   2) 총점(251) 평균(50.2)
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		double avg = sum / (double)arr.length;
		System.out.println("총점(" + sum + ") 평균(" + avg + ")");
		
		// 문제3) 성적이 60점 이상이면 합격. 합격생 수 출력
		// 예   3) 2명
		int num = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] >= 60) {
				num += 1;
			}
		}
		System.out.println(num + "명");

	}
	
}
