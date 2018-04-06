package kr.co.blackjack.card;

public class Card extends CardDeck {
	private String shape;
	private String content;
	public static int retIntScore;
	
	public Card(String shape, String content) {
		this.shape = shape;
		this.content = content;
	}

	@Override
	public String toString() {
		return String.format("%s\t%s", shape, content);	// 카드 출력
	}
	
	public int retScore() {
		if (content.equals("A")) {
			retIntScore = 1;
		} else if (content.equals("J") || content.equals("Q") || content.equals("K")) {
			retIntScore = 10;
		} else {
			switch(content) {
			case "2":
				retIntScore = 2;
				break;
			case "3":
				retIntScore = 3;
				break;
			case "4":
				retIntScore = 4;
				break;
			case "5":
				retIntScore = 5;
				break;
			case "6":
				retIntScore = 6;
				break;
			case "7":
				retIntScore = 7;
				break;
			case "8":
				retIntScore = 8;
				break;
			case "9":
				retIntScore = 9;
				break;
			case "10":
				retIntScore = 10;
				break;
			}
		}
		
		return retIntScore;
	}
}