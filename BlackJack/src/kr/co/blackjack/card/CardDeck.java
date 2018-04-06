package kr.co.blackjack.card;

import java.util.ArrayList;
import java.util.Random;

import kr.co.blackjack.player.Dealer;
import kr.co.blackjack.player.Gamer;

public class CardDeck {
	public static ArrayList<Object> cardArray = new ArrayList<Object>();
	public static String[] cardShp = {"Daimond", "Heart", "Spade", "Clover"};
	public static String[] cardCnt = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	public static Object ranCard;
	static int ranNum;
	static Random r = new Random();
		
	public static void makeCard() {
		for (int i=0; i<cardShp.length; i++) {
			for (int j=0; j<cardCnt.length; j++) {
				cardArray.add(new Card(cardShp[i], cardCnt[j]));
			}
		}
	}
	
	public static Object extCard() {
		ranNum = r.nextInt(cardArray.size());
		ranCard = cardArray.get(ranNum);
		cardArray.remove(ranNum);
		
		return ranCard; // 랜덤으로 뽑은 카드 return 해주기 
	}
}