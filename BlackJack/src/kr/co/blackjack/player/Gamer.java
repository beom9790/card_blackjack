package kr.co.blackjack.player;

import java.util.ArrayList;
import kr.co.blackjack.card.Card;
import kr.co.blackjack.card.CardDeck;
import kr.co.blackjack.rule.Main;
import kr.co.blackjack.rule.PrintMessage;

public class Gamer extends Player {
	public static ArrayList<Card> gamerCard = new ArrayList<Card>();	// gamer가 가지고 있는 카드_배열
	public static int gamerScore;
	
	public static void gamerGame() {
		System.out.println(PrintMessage.PLAYER);
		Player.printCard(gamerScore, gamerCard);
		Player.getCard(gamerScore, gamerCard);
	}
}