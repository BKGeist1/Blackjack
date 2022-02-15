package bkg.blackjack.players;

import bkg.blackjack.currency.Bet;
import bkg.blackjack.currency.Chips;
import bkg.blackjack.game.Hand;

public abstract class Player {

	protected String name;
	protected Bet bet;
	protected Chips chips;
	protected Hand hand;

	public Hand getHand() {
		return hand;
	}

	public void setHand(Hand hand) {
		this.hand = hand;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Chips getChips() {
		return chips;
	}

	public void setChips(Chips chips) {
		this.chips = chips;
	}

	public Bet getBet() {
		return bet;
	}

	public void setBet(Bet bet) {
		this.bet = bet;
	}

	@Override
	public String toString() {
		return name;
	}
}
