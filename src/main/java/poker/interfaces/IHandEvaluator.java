package poker.interfaces;

import java.util.ArrayList;

import poker.classes.Card;
import poker.enums.HandTypeEnum;

public interface IHandEvaluator {

	public HandTypeEnum evaluateHand(ArrayList<Card> hand);
}
