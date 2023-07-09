package poker.logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import poker.classes.Card;
import poker.enums.FiveCardPokerFaceEnum;
import poker.enums.HandTypeEnum;
import poker.enums.SuitEnum;
import poker.interfaces.IHandEvaluator;

public class FiveHandPokerHandEvaluator implements IHandEvaluator {
	
	public FiveHandPokerHandEvaluator() {}

	@Override
	public HandTypeEnum evaluateHand(ArrayList<Card> hand) {

		Collections.sort(hand);
		
		if (isStraightFlush(hand)) return HandTypeEnum.STRAIGHT_FLUSH;

		else if (isFourOfAKind(hand)) return HandTypeEnum.FOUR_OF_A_KIND;

		else if (isFullHouse(hand)) return HandTypeEnum.FULL_HOUSE;

		else if (isFlush(hand)) return HandTypeEnum.FLUSH;

		else if (isStraight(hand)) return HandTypeEnum.STRAIGHT;

		else if (isThreeOfAKind(hand)) return HandTypeEnum.THREE_OF_A_KIND;

		else if (isTwoPair(hand)) return HandTypeEnum.TWO_PAIR;

		else if (isOnePair(hand)) return HandTypeEnum.ONE_PAIR;

		else return HandTypeEnum.HIGH_CARD;
	}

	public static boolean isStraightFlush(List<Card> hand) {
		// Check if the hand is a straight flush
		if (isFlush(hand) && isStraight(hand)) {
			return true;
		}
		return false;
	}

	public static boolean isFourOfAKind(List<Card> hand) {
		// Check if the hand is a four of a kind
		Map<Integer, Integer> rankCount = countRanks(hand);
		for (Map.Entry<Integer, Integer> entry : rankCount.entrySet()) {
			if (entry.getValue() == 4) {
				return true;
			}
		}
		return false;
	}

	public static boolean isFullHouse(List<Card> hand) {
		// Check if the hand is a full house
		Map<Integer, Integer> rankCount = countRanks(hand);
		boolean hasThreeOfAKind = false;
		boolean hasPair = false;
		for (Map.Entry<Integer, Integer> entry : rankCount.entrySet()) {
			if (entry.getValue() == 3) {
				hasThreeOfAKind = true;
			} else if (entry.getValue() == 2) {
				hasPair = true;
			}
		}
		return hasThreeOfAKind && hasPair;
	}

	public static boolean isFlush(List<Card> hand) {
		// Check if the hand is a flush
		SuitEnum suit = hand.get(0).getSuit();
		for (int i = 1; i < hand.size(); i++) {
			if (!hand.get(i).getSuit().equals(suit)) {
				return false;
			}
		}
		return true;
	}

	public static boolean isStraight(List<Card> hand) {
		// Check if the hand is a straight
		for (int i = 0; i < hand.size() - 1; i++) {
			if (hand.get(i).getFace().getRank() != hand.get(i + 1).getFace().getRank() - 1) {

				if (hand.get(i + 1).getFace().equals(FiveCardPokerFaceEnum.ACE)
						&& hand.get(0).getFace().equals(FiveCardPokerFaceEnum.TWO) 
						&& (i + 1) == hand.size() - 1) {
					// if card is an Ace and the first card is a 2 and the Ace is the last card in
					// the hand then dont fail straight check but allow to continue doing other checks
				} else {
					return false;
				}

			}
		}
		return true;
	}

	public static boolean isThreeOfAKind(List<Card> hand) {
		// Check if the hand is a three of a kind
		Map<Integer, Integer> rankCount = countRanks(hand);
		for (Map.Entry<Integer, Integer> entry : rankCount.entrySet()) {
			if (entry.getValue() == 3) {
				return true;
			}
		}
		return false;
	}

	public static boolean isTwoPair(List<Card> hand) {
		// Check if the hand is a two pair
		Map<Integer, Integer> rankCount = countRanks(hand);
		int pairCount = 0;
		for (Map.Entry<Integer, Integer> entry : rankCount.entrySet()) {
			if (entry.getValue() == 2) {
				pairCount++;
			}
		}
		return pairCount == 2;
	}

	public static boolean isOnePair(List<Card> hand) {
		// Check if the hand is a one pair
		Map<Integer, Integer> rankCount = countRanks(hand);
		for (Map.Entry<Integer, Integer> entry : rankCount.entrySet()) {
			if (entry.getValue() == 2) {
				return true;
			}
		}
		return false;
	}

	public static Map<Integer, Integer> countRanks(List<Card> hand) {
        // Count the occurrences of each rank in the hand
		Map<Integer, Integer> rankCount = new HashMap<>();
        for (Card card : hand) {
            int rank = card.getFace().getRank();
			rankCount.put(rank, rankCount.getOrDefault(rank, 0) + 1);
        }
        return rankCount;
    }

}










