package step2_01.array;

/*
 * # 학생성적관리 프로그램[4단계] : 1등학생
 */

// 2022-01-06 14:06 ~ 14:10

public class ArrayEx07_정답 {

	public static void main(String[] args) {
		
		int[] hakbuns = {1001, 1002, 1003, 1004, 1005};
		int[] scores  = {  87,   11,   45,   98,   23};
		
		int save = 0;
		
		// 문제) 1등학생의 학번과 성적 출력
		// 정답) 1004번(98점)
		
		for (int i = 0; i < scores.length; i++) {
			if (scores[save] <= scores[i]) {
				save = i;
			}
		}
		System.out.println(hakbuns[save] + "번(" + scores[save] + "점)");
		
	}
	
}
