package bkg.blackjack.players;

import bkg.blackjack.currency.Bet;
import bkg.blackjack.currency.Chips;
import bkg.blackjack.game.Hand;

public abstract class Players {
	// class variable to keep track of total number of players in the game
	private static int numOfParticipants;
	private String name;
	private Bet bet;
	private Chips chips;
	private Hand hand;

	public static int getNumOfParticipants() {
		return numOfParticipants;
	}

	public static void setNumOfParticipants(int numOfParticipants) {
		Players.numOfParticipants = numOfParticipants;
	}

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
}
