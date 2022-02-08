package bkg.blackjack.players;

import bkg.blackjack.game.Hand;

public class Players {
	// class variable to keep track of total number of players in the game
	private static int numOfParticipants;
	private Hand hand;
	private String name;

	public Players(String name) {
		setNumOfParticipants(getNumOfParticipants() + 1);
		this.setHand(new Hand());
		this.setName(name);

	}

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
