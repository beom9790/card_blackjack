package kr.co.blackjack.rule;

import java.util.Scanner;

import kr.co.blackjack.card.CardDeck;
import kr.co.blackjack.player.Dealer;
import kr.co.blackjack.player.Gamer;

public class Main {
	public static Scanner scan = new Scanner(System.in);
	public static int inpNum;

	public static void main(String[] args) {
		int ornNum = 2;	// 플레이 시작에 필요한 최소 장 수
		
		CardDeck.makeCard();	// 카드 52장 생성
		
		for (int i=0; i<ornNum; i++) {	// 카드 1장씩 게이머와 딜러에게 번갈아 2번 줌
			Gamer.gamerCard.add(CardDeck.extCard());
			Dealer.dealerCard.add(CardDeck.extCard());
		}
		
		Gamer.gamerGame();		// 게이머부터 카드를 뽑는다.
		
		for (Object a : Gamer.gamerCard) {
			System.out.println(a);
		}
		
	}
}
