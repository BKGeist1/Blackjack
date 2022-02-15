package bkg.blackjack.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bkg.blackjack.players.Automated;
import bkg.blackjack.players.Dealer;
import bkg.blackjack.players.Human;
import bkg.blackjack.players.Player;

public class Main {

	public static void main(String[] args) {
		List<Player> seats = new ArrayList<Player>();
		Scanner myScanner = new Scanner(System.in);
		Dealer dealer = new Dealer();
		do {
			System.out.println("Welcome! What is your name?");
			String name = myScanner.nextLine();

			if (name == "") {
				Automated automatedPlayer = new Automated();
				seats.add(automatedPlayer);
				automatedPlayer.toString1(automatedPlayer);
			} else {
				Human humanPlayer = new Human(name);
				seats.add(humanPlayer);
			}
		} while (seats.size() < 7);

		System.out.println("seats : " + seats.toString());

		myScanner.close();

	}
}
