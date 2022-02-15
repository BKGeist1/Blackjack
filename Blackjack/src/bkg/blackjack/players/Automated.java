package bkg.blackjack.players;

import java.util.Random;

public class Automated extends Player {

	// Name pool for automated players
	String[] namePool = new String[] { "Bob", "Mary", "Steve", "Jill", "Jim", "Ann", "John", "Elizabeth", "Nixon",
			"Piper", "Elaina", "Jason" };

	// Generate a random number from 0 to 11
	Random rand = new Random();
	int i = rand.nextInt(12);

	public Automated() {
		this.name = namePool[i];
	}
}
