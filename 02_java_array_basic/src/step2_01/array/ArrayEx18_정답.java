package step2_01.array;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/*
 * # 미니마블
 * 
 * 1. 플레이어는 p1과 p2 2명이다.
 * 2. 1p는 사용자가 1~3 사이의 숫자를 입력해 이동하고 2p는 랜덤값으로 1~3값으로 이동한다.
 * 3. 이동하다가 다음 플레이어와 같은 위치에 놓이게 되면,
 *    상대 플레이어는 잡히게 되어 원점으로 되돌아간다.
 * 4. 먼저 3바퀴를 돌면 이긴다.
 *    
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p1사용자]1~3 입력 : 3 
 *
 *  1 2 3 4 5 6 7 8  
 *  0 0 0 1 0 0 0 0  [0바퀴]
 *  2 0 0 0 0 0 0 0  [0바퀴]
 *  [p2컴퓨터] : 3
 *  [p2컴퓨터]가 p1을 잡았다! 
 *  
 *  1 2 3 4 5 6 7 8 
 *  1 0 0 0 0 0 0 0  [0바퀴]
 *  0 0 0 2 0 0 0 0  [0바퀴]
 * [p1사용자]1~3 입력 : 
 *
 *
 *
 */

// 2022-01-07 14:44 ~ 15:04

public class ArrayEx18_정답 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		
		int[] game = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] p1   = {0, 0, 0, 0, 0, 0, 0, 0};
		int[] p2   = {0, 0, 0, 0, 0, 0, 0, 0};
		
		int turn = 0;
		
		int idx1 = 0;	int idx2 = 0;
		p1[idx1] = 1;	p2[idx2] = 2;
		
		int win1 = 0;	int win2 = 0;
		
		while (true) {
			System.out.println(Arrays.toString(game));
			System.out.println(Arrays.toString(p1) + " [" + win1 + "바퀴]");
			System.out.println(Arrays.toString(p2) + " [" + win2 + "바퀴]");
			
			if (win1 == 3) {
				System.out.println("[p1사용자] 승리");
				break;
			}
			if (win2 == 3) {
				System.out.println("[p2컴퓨터] 승리");
				break;
			}
			
			if (turn % 2 == 0) {
				System.out.print("[p1사용자]1~3 입력 : ");
				int pl1 = scan.nextInt();
				if (idx1 + pl1 < 8) {
					p1[idx1] = 0;
					p1[idx1 + pl1] = 1;
					idx1 += pl1;
				}
				else if (idx1 + pl1 >= 8) {
					p1[idx1] = 0;
					p1[idx1 + pl1 - 8] = 1;
					idx1 = idx1 + pl1 - 8;
					win1++;
				}
				if (idx1 == idx2) {
					System.out.println("[p1사용자]가 p2를 잡았다!");
					p2[idx2] = 0;
					idx2 = 0;
					p2[idx2] = 2;
				}
				turn++;
			}
			else if (turn % 2 == 1) {
				int pl2 = rand.nextInt(3) + 1;
				System.out.println("[p2컴퓨터] : " + pl2);
				if (idx2 + pl2 < 8) {
					p2[idx2] = 0;
					p2[idx2 + pl2] = 2;
					idx2 += pl2;
				}
				else if (idx2 + pl2 >= 8) {
					p2[idx2] = 0;
					p2[idx2 + pl2 - 8] = 2;
					idx2 = idx2 + pl2 - 8;
					win2++;
				}
				if (idx1 == idx2) {
					System.out.println("[p2컴퓨터]가 p1을 잡았다!");
					p1[idx1] = 0;
					idx1 = 0;
					p1[idx1] = 1;
				}
				turn++;
			}
			
		}
		
		scan.close();
		
	}
	
}
