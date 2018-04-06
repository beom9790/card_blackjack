package kr.co.blackjack.player;

import java.util.ArrayList;
import kr.co.blackjack.card.Card;
import kr.co.blackjack.card.CardDeck;
import kr.co.blackjack.rule.Main;
import kr.co.blackjack.rule.PrintMessage;

public class Dealer extends Player {
	public static ArrayList<Card> dealerCard = new ArrayList<Card>();	// dealer가 가지고 있는 카드_배열
	public static int dealerScore;
	
	public static void dealerGame() {
		System.out.println(PrintMessage.DEALER);
		Player.printCard(dealerScore, dealerCard);
		Player.getCard(dealerScore, dealerCard);
	}
}
