package kr.co.blackjack.player;

import java.util.ArrayList;
import kr.co.blackjack.card.CardDeck;
import kr.co.blackjack.rule.Main;
import kr.co.blackjack.rule.PrintMessage;

public class Gamer {
	public static ArrayList<Object> gamerCard = new ArrayList<Object>();	// gamer가 가지고 있는 카드_배열
	
	public static void gamerGame() {
		System.out.println(PrintMessage.PLAYER);
		while(true) {
			System.out.println(PrintMessage.ADDCARD);
			Main.inpNum = Main.scan.nextInt();
			if (Main.inpNum == 1) {
				Gamer.gamerCard.add(CardDeck.extCard());
			} else if (Main.inpNum == 2) {
				break;
			} else { System.out.println(PrintMessage.RIGHTANS); }
		}
	}
}