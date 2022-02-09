package bkg.blackjack.players;

public class Human extends Players {
	public Human(String name) {
		super.setName(name);
		setNumOfParticipants(getNumOfParticipants() + 1);
	}

}
