package step2_01.array;

import java.util.Scanner;

/* 
 * # 틱택토
 * 
 * 1. 구글에 검색해보면 실제로 게임을 진행해볼 수 있음
 * 2. 미니 오목처럼 1p 혹은 2p가 먼저 가로로 3줄 , 세로로 3줄, 대각선 3줄을 선택한 플레이어가 승리하는 게임
 * 3. 1p가 입력한 부분은 화면에 O표시 , 2p가 입력한 부분은 화면에 X표시
 * 
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [ ][ ][ ]
 * [p1]인덱스 입력 : 6
 * === 틱택토 ===
 * [X][X][O]
 * [ ][O][ ]
 * [O][ ][ ]
 * [p1]승리
 * 
 */

// 2022-01-07 14:26 ~ 14:41

public class ArrayEx17_정답 {

	public static void main(String[] args) {
		
		int[] game = new int[9];
		
		int turn = 1;
		int p1 = 0;
		int p2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("=== 틱택토 ===");
			for (int i = 0; i < 3; i++) {
				if (game[i] == 0) {
					System.out.print("[ ]");
				}
				else if (game[i] == 1) {
					System.out.print("[O]");
				}
				else if (game[i] == 2) {
					System.out.print("[X]");
				}
			}
			System.out.println();

			for (int i = 3; i < 6; i++) {
				if (game[i] == 0) {
					System.out.print("[ ]");
				}
				else if (game[i] == 1) {
					System.out.print("[O]");
				}
				else if (game[i] == 2) {
					System.out.print("[X]");
				}
			}
			System.out.println();
			
			for (int i = 6; i < 9; i++) {
				if (game[i] == 0) {
					System.out.print("[ ]");
				}
				else if (game[i] == 1) {
					System.out.print("[O]");
				}
				else if (game[i] == 2) {
					System.out.print("[X]");
				}
			}
			System.out.println();
			
			if ((game[0] == 1) && (game[1] == 1) && (game[2] == 1)) {
				System.out.println("[p1] 승리");
				break;
			}
			else if ((game[3] == 1) && (game[4] == 1) && (game[5] == 1)) {
				System.out.println("[p1] 승리");
				break;
			}
			else if ((game[6] == 1) && (game[7] == 1) && (game[8] == 1)) {
				System.out.println("[p1] 승리");
				break;
			}
			else if ((game[0] == 1) && (game[3] == 1) && (game[6] == 1)) {
				System.out.println("[p1] 승리");
				break;
			}
			else if ((game[1] == 1) && (game[4] == 1) && (game[7] == 1)) {
				System.out.println("[p1] 승리");
				break;
			}
			else if ((game[2] == 1) && (game[5] == 1) && (game[8] == 1)) {
				System.out.println("[p1] 승리");
				break;
			}
			else if ((game[0] == 1) && (game[4] == 1) && (game[8] == 1)) {
				System.out.println("[p1] 승리");
				break;
			}
			else if ((game[2] == 1) && (game[4] == 1) && (game[6] == 1)) {
				System.out.println("[p1] 승리");
				break;
			}
			else if ((game[0] == 2) && (game[1] == 2) && (game[2] == 2)) {
				System.out.println("[p2] 승리");
				break;
			}
			else if ((game[3] == 2) && (game[4] == 2) && (game[5] == 2)) {
				System.out.println("[p2] 승리");
				break;
			}
			else if ((game[6] == 2) && (game[7] == 2) && (game[8] == 2)) {
				System.out.println("[p2] 승리");
				break;
			}
			else if ((game[0] == 2) && (game[3] == 2) && (game[6] == 2)) {
				System.out.println("[p2] 승리");
				break;
			}
			else if ((game[1] == 2) && (game[4] == 2) && (game[7] == 2)) {
				System.out.println("[p2] 승리");
				break;
			}
			else if ((game[2] == 2) && (game[5] == 2) && (game[8] == 2)) {
				System.out.println("[p2] 승리");
				break;
			}
			else if ((game[0] == 2) && (game[4] == 2) && (game[8] == 2)) {
				System.out.println("[p2] 승리");
				break;
			}
			else if ((game[2] == 2) && (game[4] == 2) && (game[6] == 2)) {
				System.out.println("[p2] 승리");
				break;
			}
			
			if (turn % 2 == 1) {
				System.out.print("[p1]인덱스 입력 : ");
				p1 = sc.nextInt();
				game[p1] = 1;
				turn++;
			}
			else if (turn % 2 == 0) {
				System.out.print("[p2]인덱스 입력 : ");
				p2 = sc.nextInt();
				game[p2] = 2;
				turn++;
			}
			
		}
		
		sc.close();
		
	}
		
}
