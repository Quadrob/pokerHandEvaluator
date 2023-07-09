package poker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import poker.classes.Card;
import poker.classes.Deck;
import poker.enums.FiveCardPokerFaceEnum;
import poker.enums.SuitEnum;
import poker.models.FiveHandPokerCard;
import poker.models.FiveHandPokerDeck;

public class FiveHandPokerDeckTest {
	@Test
	public void testDeckConstructor() {
		Deck deck = new FiveHandPokerDeck();
		assertEquals(52, deck.getDeck().size());
	}

	@Test
	public void testShuffle() {
		Deck deck = new FiveHandPokerDeck();
		deck.shuffelDeck();
		assertEquals(52, deck.getDeck().size());
		assertNotEquals(new FiveHandPokerDeck(), deck);
	}

	@Test
	public void testDealHand() {
		List<Card> expectedCards = new ArrayList<Card>();
		expectedCards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TWO, SuitEnum.HEARTS));
		expectedCards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.THREE, SuitEnum.HEARTS));
		expectedCards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.FOUR, SuitEnum.HEARTS));

		Deck deck = new FiveHandPokerDeck();
		List<Card> dealtCards = deck.dealCards(3);
		assertEquals(expectedCards.get(0).toStringShort(), dealtCards.get(0).toStringShort());
		assertEquals(expectedCards.get(1).toStringShort(), dealtCards.get(1).toStringShort());
		assertEquals(expectedCards.get(2).toStringShort(), dealtCards.get(2).toStringShort());
	}

	@Test
	public void testEquals1() {
		Deck deck1 = new FiveHandPokerDeck();
		assertEquals(deck1, deck1);
	}

	@Test
	public void testEquals2() {
		Deck deck1 = new FiveHandPokerDeck();
		assertNotEquals(deck1, null);
	}

	@Test
	public void testEquals3() {
		Deck deck1 = new FiveHandPokerDeck();
		Deck deck2 = new FiveHandPokerDeck();
		deck1.shuffelDeck();
		assertNotEquals(deck1, deck2);
	}

	@Test
	public void testEquals4() {
		Deck deck1 = new FiveHandPokerDeck();
		Deck deck2 = new FiveHandPokerDeck();
		deck1.dealCards(1);
		assertNotEquals(deck1, deck2);
	}

	@Test
	public void testEquals5() {
		Deck deck1 = new FiveHandPokerDeck();
		assertNotEquals(deck1.toString(), "string");
	}

	@Test
	public void testDeckToString() {
		Deck deck = new FiveHandPokerDeck();
		deck.dealCards(50);
		assertEquals("K♣", deck.getDeck().get(0).toStringShort());
		assertEquals("A♣", deck.getDeck().get(1).toStringShort());
	}
}











