package poker.models;

import java.util.ArrayList;

import poker.classes.Card;
import poker.classes.Hand;
import poker.interfaces.IHandEvaluator;
import poker.logic.FiveHandPokerHandEvaluator;

public class FiveHandPokerHand extends Hand {

	public FiveHandPokerHand(ArrayList<Card> newHand) {
		hand = newHand;
		calculateHandType();
	}

	@Override
	public void calculateHandType() {
		IHandEvaluator handEvaluator = new FiveHandPokerHandEvaluator();
		handType = handEvaluator.evaluateHand(hand);
	}

}












