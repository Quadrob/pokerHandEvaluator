package poker;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;

import org.junit.Test;

import poker.classes.Card;
import poker.classes.Hand;
import poker.enums.FiveCardPokerFaceEnum;
import poker.enums.HandTypeEnum;
import poker.enums.SuitEnum;
import poker.models.FiveHandPokerCard;
import poker.models.FiveHandPokerHand;

public class FiveHandPokerHandTest {
	@Test
	public void testHighCard1() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.SIX, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.SEVEN, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.EIGHT, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.KING, SuitEnum.DIMONDS));
		Hand hand = new FiveHandPokerHand(cards);
		assertEquals(hand.getHandType(), HandTypeEnum.HIGH_CARD);
	}

	@Test
	public void testHighCard2() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.SIX, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.SIX, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.EIGHT, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.KING, SuitEnum.DIMONDS));
		Hand hand = new FiveHandPokerHand(cards);
		assertNotEquals(hand.getHandType(), HandTypeEnum.HIGH_CARD);
	}

	@Test
	public void testPair1() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.SIX, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.SEVEN, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.SIX, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.KING, SuitEnum.DIMONDS));
		Hand hand = new FiveHandPokerHand(cards);
		assertEquals(hand.getHandType(), HandTypeEnum.ONE_PAIR);
	}

	@Test
	public void testPair2() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.SEVEN, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.SIX, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.DIMONDS));
		Hand hand = new FiveHandPokerHand(cards);
		assertEquals(hand.getHandType(), HandTypeEnum.ONE_PAIR);
	}

	@Test
	public void testPair3() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.SIX, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.SEVEN, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.KING, SuitEnum.DIMONDS));
		Hand hand = new FiveHandPokerHand(cards);
		assertNotEquals(hand.getHandType(), HandTypeEnum.ONE_PAIR);
	}

	@Test
	public void testTwoPair1() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TWO, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TWO, SuitEnum.SPADES));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.KING, SuitEnum.DIMONDS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.SPADES));
		Hand hand = new FiveHandPokerHand(cards);
		assertEquals(hand.getHandType(), HandTypeEnum.TWO_PAIR);
	}

	@Test
	public void testTwoPair2() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.EIGHT, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.KING, SuitEnum.SPADES));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.KING, SuitEnum.DIMONDS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.EIGHT, SuitEnum.SPADES));
		Hand hand = new FiveHandPokerHand(cards);
		assertEquals(hand.getHandType(), HandTypeEnum.TWO_PAIR);
	}

	@Test
	public void testTwoPair3() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TWO, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TEN, SuitEnum.SPADES));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.KING, SuitEnum.DIMONDS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.SPADES));
		Hand hand = new FiveHandPokerHand(cards);
		assertNotEquals(hand.getHandType(), HandTypeEnum.TWO_PAIR);
	}

	@Test
	public void testThreeOfAKind1() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TWO, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.KING, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.DIMONDS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.SPADES));
		Hand hand = new FiveHandPokerHand(cards);
		assertEquals(hand.getHandType(), HandTypeEnum.THREE_OF_A_KIND);
	}

	@Test
	public void testThreeOfAKind2() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TEN, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TWO, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.KING, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TEN, SuitEnum.DIMONDS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TEN, SuitEnum.SPADES));
		Hand hand = new FiveHandPokerHand(cards);
		assertEquals(hand.getHandType(), HandTypeEnum.THREE_OF_A_KIND);
	}

	@Test
	public void testThreeOfAKind3() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TWO, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.KING, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.DIMONDS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TEN, SuitEnum.SPADES));
		Hand hand = new FiveHandPokerHand(cards);
		assertNotEquals(hand.getHandType(), HandTypeEnum.THREE_OF_A_KIND);
	}

	@Test
	public void testIsStright1() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.SIX, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TWO, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.THREE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.FOUR, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.DIMONDS));
		Hand hand = new FiveHandPokerHand(cards);
		assertEquals(hand.getHandType(), HandTypeEnum.STRAIGHT);
	}

	@Test
	public void testIsStright2() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TWO, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.THREE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.FOUR, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.DIMONDS));
		Hand hand = new FiveHandPokerHand(cards);
		assertEquals(hand.getHandType(), HandTypeEnum.STRAIGHT);
	}

	@Test
	public void testIsStright3() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.KING, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.QUEEN, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.JACK, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TEN, SuitEnum.DIMONDS));
		Hand hand = new FiveHandPokerHand(cards);
		assertEquals(hand.getHandType(), HandTypeEnum.STRAIGHT);
	}

	@Test
	public void testIsStright4() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TWO, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.SIX, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.FOUR, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.DIMONDS));
		Hand hand = new FiveHandPokerHand(cards);
		assertNotEquals(hand.getHandType(), HandTypeEnum.STRAIGHT);
	}

	@Test
	public void testIsFlush1() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.SIX, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.SEVEN, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.EIGHT, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.KING, SuitEnum.HEARTS));
		Hand hand = new FiveHandPokerHand(cards);
		assertEquals(hand.getHandType(), HandTypeEnum.FLUSH);
	}

	@Test
	public void testIsFlush2() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.SIX, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.SEVEN, SuitEnum.SPADES));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.EIGHT, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.KING, SuitEnum.CLUBS));
		Hand hand = new FiveHandPokerHand(cards);
		assertNotEquals(hand.getHandType(), HandTypeEnum.FLUSH);
	}

	@Test
	public void testFullHouse1() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TWO, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TWO, SuitEnum.DIMONDS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.DIMONDS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.SPADES));
		Hand hand = new FiveHandPokerHand(cards);
		assertEquals(hand.getHandType(), HandTypeEnum.FULL_HOUSE);
	}

	@Test
	public void testFullHouse2() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TEN, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.DIMONDS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TEN, SuitEnum.DIMONDS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TEN, SuitEnum.SPADES));
		Hand hand = new FiveHandPokerHand(cards);
		assertEquals(hand.getHandType(), HandTypeEnum.FULL_HOUSE);
	}

	@Test
	public void testFullHouse3() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.QUEEN, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TWO, SuitEnum.DIMONDS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.KING, SuitEnum.DIMONDS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.SPADES));
		Hand hand = new FiveHandPokerHand(cards);
		assertNotEquals(hand.getHandType(), HandTypeEnum.FULL_HOUSE);
	}

	@Test
	public void testFourOfAKind1() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TWO, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.DIMONDS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.SPADES));
		Hand hand = new FiveHandPokerHand(cards);
		assertEquals(hand.getHandType(), HandTypeEnum.FOUR_OF_A_KIND);
	}

	@Test
	public void testFourOfAKind2() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TEN, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TWO, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TEN, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TEN, SuitEnum.DIMONDS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TEN, SuitEnum.SPADES));
		Hand hand = new FiveHandPokerHand(cards);
		assertEquals(hand.getHandType(), HandTypeEnum.FOUR_OF_A_KIND);
	}

	@Test
	public void testFourOfAKind3() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TWO, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.CLUBS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TEN, SuitEnum.DIMONDS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.SPADES));
		Hand hand = new FiveHandPokerHand(cards);
		assertNotEquals(hand.getHandType(), HandTypeEnum.FOUR_OF_A_KIND);
	}

	@Test
	public void testIsStraightFlush1() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.SIX, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TWO, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.THREE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.FOUR, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.HEARTS));
		Hand hand = new FiveHandPokerHand(cards);
		assertEquals(hand.getHandType(), HandTypeEnum.STRAIGHT_FLUSH);
	}

	@Test
	public void testIsStraightFlush2() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TWO, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.THREE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.FOUR, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.FIVE, SuitEnum.HEARTS));
		Hand hand = new FiveHandPokerHand(cards);
		assertEquals(hand.getHandType(), HandTypeEnum.STRAIGHT_FLUSH);
	}

	@Test
	public void testIsStraightFlush3() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.KING, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.QUEEN, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.JACK, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TEN, SuitEnum.HEARTS));
		Hand hand = new FiveHandPokerHand(cards);
		assertEquals(hand.getHandType(), HandTypeEnum.STRAIGHT_FLUSH);
	}

	@Test
	public void testIsStraightFlush4() {
		ArrayList<Card> cards = new ArrayList<>();
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.ACE, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.KING, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TWO, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.JACK, SuitEnum.HEARTS));
		cards.add(new FiveHandPokerCard(FiveCardPokerFaceEnum.TEN, SuitEnum.HEARTS));
		Hand hand = new FiveHandPokerHand(cards);
		assertNotEquals(hand.getHandType(), HandTypeEnum.STRAIGHT_FLUSH);
	}
}











