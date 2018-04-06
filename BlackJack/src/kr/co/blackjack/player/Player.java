package kr.co.blackjack.player;

import java.util.ArrayList;
import kr.co.blackjack.card.Card;
import kr.co.blackjack.card.CardDeck;
import kr.co.blackjack.rule.Main;
import kr.co.blackjack.rule.PrintMessage;

public class Player {
	public static void getCard(int playerScore, ArrayList<Card> playerCard) {
		int a = 0;
		do {
			System.out.print(PrintMessage.ADDCARD);
			Main.inpNum = Main.scan.nextInt();
			if (Main.inpNum == PrintMessage.YES) {
				playerCard.add((Card)CardDeck.extCard());
				a = printCard(playerScore, playerCard);
			} else if (Main.inpNum == PrintMessage.NO) {
				break;
			} else { System.out.println(PrintMessage.RIGHTANS); }
		} while (a <= 21);
		System.out.println("풋, 소유하신 점수가 21을 넘으셨습니다ㅋ");
	}
	
	public static int printCard(int playerScore, ArrayList<Card> playerCard) {
		for (Card a : playerCard) {
			playerScore += a.retScore();
			System.out.println(a);
		}
		System.out.println(playerScore);
		
		return playerScore;
	}
}
