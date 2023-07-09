package poker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

import poker.classes.Card;
import poker.enums.FiveCardPokerFaceEnum;
import poker.enums.SuitEnum;
import poker.models.FiveHandPokerCard;

public class FiveHandPokerCardTest {

	@Test
	public void testCard1() {
		Card card = new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.HEARTS);
		assertEquals(SuitEnum.HEARTS, card.getSuit());
		assertEquals(FiveCardPokerFaceEnum.FIVE, card.getFace());
	}

	@Test
	public void testCard2() {
		Card card = new FiveHandPokerCard(FiveCardPokerFaceEnum.TEN, SuitEnum.CLUBS);
		assertEquals(SuitEnum.CLUBS, card.getSuit());
		assertEquals(FiveCardPokerFaceEnum.TEN, card.getFace());
	}

	@Test
	public void testCard3() {
		Card card = new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.DIMONDS);
		assertEquals(SuitEnum.DIMONDS, card.getSuit());
		assertEquals(FiveCardPokerFaceEnum.ACE, card.getFace());
	}

	@Test
	public void testCardToString() {
		Card card = new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.HEARTS);
		assertEquals("5♥", card.toStringShort());

		card = new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.DIMONDS);
		assertEquals("5♦", card.toStringShort());

		card = new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.CLUBS);
		assertEquals("5♣", card.toStringShort());

		card = new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.SPADES);
		assertEquals("5♠", card.toStringShort());

		card = new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.HEARTS);
		assertEquals("A♥", card.toStringShort());

		card = new FiveHandPokerCard(FiveCardPokerFaceEnum.KING, SuitEnum.CLUBS);
		assertEquals("K♣", card.toStringShort());
	}

	@Test
	public void testEquals1() {
		Card card1 = new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.HEARTS);
		Card card2 = new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.HEARTS);
		assertNotEquals(card1, card2);
	}

	@Test
	public void testEquals2() {
		Card card1 = new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.HEARTS);
		assertEquals(card1, card1);
	}

	@Test
	public void testEquals3() {
		Card card1 = new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.HEARTS);
		assertNotEquals(card1, null);
	}

	@Test
	public void testEquals4() {
		Card card1 = new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.HEARTS);
		Card card2 = new FiveHandPokerCard(FiveCardPokerFaceEnum.FOUR, SuitEnum.HEARTS);
		assertNotEquals(card1, card2);
	}

	@Test
	public void testEquals5() {
		Card card1 = new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.HEARTS);
		Card card2 = new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.SPADES);
		assertNotEquals(card1, card2);
	}

	@Test
	public void testEquals6() {
		Card card1 = new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.HEARTS);
		assertNotEquals(card1.toStringShort(), "5♠");
	}

}








