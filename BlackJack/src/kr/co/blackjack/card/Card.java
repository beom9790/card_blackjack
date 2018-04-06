package kr.co.blackjack.card;

public class Card extends CardDeck {
	private String shape;
	private Object content;
	
	public Card(String shape, Object content) {
		this.shape = shape;
		this.content = content;
	}

	@Override
	public String toString() {
		return String.format("%s\t%s", shape, content);	// 카드 출력
	}
}