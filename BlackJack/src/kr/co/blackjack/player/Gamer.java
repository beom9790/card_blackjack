package kr.co.blackjack.player;

import java.util.ArrayList;
import java.util.Scanner;

public class Gamer {
	public static ArrayList gamerCard = new ArrayList();	// gamer가 가지고 있는 카드_배열
	static Scanner scan = new Scanner(System.in);
	
	public static void startGame() {
		int inpNum;
	
		do {
			System.out.println("카드를 더 뽑으시겠습니까?");
			inpNum = scan.nextInt();
		
		} while(inpNum != 2);
	}
}