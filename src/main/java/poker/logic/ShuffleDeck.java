package poker.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import poker.classes.Card;

public class ShuffleDeck {
	
	public ShuffleDeck() {}

	public void shuffle(ArrayList<Card> deck) {
		System.out.println("Shuffling ... Shuffling ... Shuffling ...");
		// General method used so that we can interchange the shuffle algorithm
		// basicShuffle(deck);
		// collectionShuffle(deck);
		randomShuffle(deck);
	}

	private void basicShuffle(ArrayList<Card> deck) {
		Random random = new Random();
		
		for (int i = 0; i < 52; i++) {
			int r = i + random.nextInt(52 - i);

			// swapping the Cards
			Card tempCard = deck.get(r);
			deck.set(r, deck.get(i));
			deck.set(i, tempCard);
		}
	}
	
	private void randomShuffle(ArrayList<Card> deck) {
		Random random = new Random();

		for (int i = 0; i < 100; i++) {
			int randomCardIndex = random.nextInt(52);
			int swapCardIndex = random.nextInt(52);

			// swapping the Cards
			Card tempCard = deck.get(randomCardIndex);
			deck.set(randomCardIndex, deck.get(swapCardIndex));
			deck.set(swapCardIndex, tempCard);
		}
	}

	private void collectionShuffle(ArrayList<Card> deck) {
		Collections.shuffle(deck);
	}
}

