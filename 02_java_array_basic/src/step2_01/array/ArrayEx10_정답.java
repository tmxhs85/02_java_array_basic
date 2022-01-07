package step2_01.array;

import java.util.Scanner;

/*
 * # 즉석복권
 * 
 * 1. 숫자 7이 연속으로 3번 등장하면, 당첨복권이다.
 * 2. 메뉴를 선택해서 1번 2번 3번이 당첨인지 확인한다.
 * 3. 0번은 반복문을 종료한다.
 * 
 */

// 2022-01-07 12:15 ~ 12:23

public class ArrayEx10_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] lotto1 = {0, 0, 7, 7, 7, 0, 0, 0};
		int[] lotto2 = {7, 0, 7, 7, 0, 0, 0, 0};
		int[] lotto3 = {7, 0, 7, 7, 7, 0, 7, 0};
		int sel      = 0;
		int check 	 = 0;
		
		while (true) {
					
			System.out.println("\n[1]번복권 결과확인");
			System.out.println("[2]번복권 결과확인");
			System.out.println("[3]번복권 결과확인");
			System.out.println("[0]종료");
			System.out.print("메뉴 선택 : ");
			sel = scan.nextInt();
								
			if (sel == 0) {
				System.out.println("종료");
				break;
			}
			else if (sel == 1) {
				check = 0;
				for (int i = 0; i < lotto1.length; i++) {
					if (lotto1[i] == 7) {
						if ((i+1 < lotto1.length) && (i+2 < lotto1.length)) {
							if ((lotto1[i+1] == 7) && (lotto1[i+2] == 7)) {
								check = 1;
							}
						}
					}
				}
				if (check == 1) {
					System.out.println("당첨!");
				}
				else {
					System.out.println("꽝!");
				}
			}
			else if (sel == 2) {
				check = 0;
				for (int i = 0; i < lotto2.length; i++) {
					if (lotto2[i] == 7) {
						if ((i+1 < lotto2.length) && (i+2 < lotto2.length)) {
							if ((lotto2[i+1] == 7) && (lotto2[i+2] == 7)) {
								check = 1;
							}
						}
					}
				}
				if (check == 1) {
					System.out.println("당첨!");
				}
				else {
					System.out.println("꽝!");
				}
			}
			else if (sel == 3) {
				check = 0;
				for (int i = 0; i < lotto3.length; i++) {
					if (lotto3[i] == 7) {
						if ((i+1 < lotto3.length) && (i+2 < lotto3.length)) {
							if ((lotto3[i+1] == 7) && (lotto3[i+2] == 7)) {
								check = 1;
							}
						}
					}
				}
				if (check == 1) {
					System.out.println("당첨!");
				}
				else {
					System.out.println("꽝!");
				}
			}
				
		}
		
		scan.close();
		
	}
}
