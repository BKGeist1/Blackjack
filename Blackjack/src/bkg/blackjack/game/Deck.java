package bkg.blackjack.game;

public enum Deck {
	ACE_OF_CLUBS("AC", 11, 1), TWO_OF_CLUBS("2C", 2), THREE_OF_CLUBS("3C", 3), FOUR_OF_CLUBS("4C", 4),
	FIVE_OF_CLUBS("5C", 5), SIX_OF_CLUBS("6C", 6), SEVEN_OF_CLUBS("7C", 7), EIGHT_OF_CLUBS("8C", 8),
	NINE_OF_CLUBS("9C", 9), TEN_OF_CLUBS("10C", 10), JACK_OF_CLUBS("JC", 10), QUEEN_OF_CLUBS("QC", 10),
	KING_OF_CLUBS("KC", 10), ACE_OF_HEARTS("AH", 11, 1), TWO_OF_HEARTS("2H", 2), THREE_OF_HEARTS("3H", 3),
	FOUR_OF_HEARTS("4H", 4), FIVE_OF_HEARTS("5H", 5), SIX_OF_HEARTS("6H", 6), SEVEN_OF_HEARTS("7H", 7),
	EIGHT_OF_HEARTS("8H", 8), NINE_OF_HEARTS("9H", 9), TEN_OF_HEARTS("10H", 10), JACK_OF_HEARTS("JH", 10),
	QUEEN_OF_HEARTS("QH", 10), KING_OF_HEARTS("KH", 10), ACE_OF_SPADES("AS", 11, 1), TWO_OF_SPADES("2S", 2),
	THREE_OF_SPADES("3S", 3), FOUR_OF_SPADES("4S", 4), FIVE_OF_SPADES("5S", 5), SIX_OF_SPADES("6S", 6),
	SEVEN_OF_SPADES("7S", 7), EIGHT_OF_SPADES("8S", 8), NINE_OF_SPADES("9S", 9), TEN_OF_SPADES("10S", 10),
	JACK_OF_SPADES("JS", 10), QUEEN_OF_SPADES("QS", 10), KING_OF_SPADES("KS", 10), ACE_OF_DIAMONDS("AD", 11, 1),
	TWO_OF_DIAMONDS("2D", 2), THREE_OF_DIAMONDS("3D", 3), FOUR_OF_DIAMONDS("4D", 4), FIVE_OF_DIAMONDS("5D", 5),
	SIX_OF_DIAMONDS("6D", 6), SEVEN_OF_DIAMONDS("7D", 7), EIGHT_OF_DIAMONDS("8D", 8), NINE_OF_DIAMONDS("9D", 9),
	TEN_OF_DIAMONDS("10D", 10), JACK_OF_DIAMONDS("JD", 10), QUEEN_OF_DIAMONDS("QD", 10), KING_OF_DIAMONDS("KD", 10);

	private final String card;
	private final int amount;
	private final int alternateAmount;

	Deck(String card, int amount, int alternateAmount) {
		this.card = card;
		this.amount = amount;
		this.alternateAmount = alternateAmount;
	}

	Deck(String card, int amount) {
		this.card = card;
		this.amount = amount;
		this.alternateAmount = 0;
	}

	public int getAlternateAmount() {
		return alternateAmount;
	}

	public int getAmount() {
		return amount;
	}

	public String getCard() {
		return card;
	}

}
