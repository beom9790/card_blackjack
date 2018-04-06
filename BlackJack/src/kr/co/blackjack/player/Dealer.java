package kr.co.blackjack.player;

import java.util.ArrayList;
import kr.co.blackjack.card.CardDeck;
import kr.co.blackjack.rule.Main;
import kr.co.blackjack.rule.PrintMessage;

public class Dealer {
	public static ArrayList<Object> dealerCard = new ArrayList<Object>();	// dealer가 가지고 있는 카드_배열
	
	public static void dealerGame() {
		System.out.println(PrintMessage.DEALER);
		while(true) {
			System.out.println(PrintMessage.ADDCARD);
			Main.inpNum = Main.scan.nextInt();
			if (Main.inpNum == 1) {
				Dealer.dealerCard.add(CardDeck.extCard());
			} else if (Main.inpNum == 2) {
				break;
			} else { System.out.println(PrintMessage.RIGHTANS); }
		}
	}
}
