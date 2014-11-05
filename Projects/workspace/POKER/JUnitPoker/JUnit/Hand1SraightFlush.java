package JUnit;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import edu.rcc.deck.Card;
import edu.rcc.hand.Hand;


public class Hand1SraightFlush {

	@Test
	public void testHand1StraightFlush()
	{
		Card c1 = new Card("Diamonds", "2");
		Card c2 = new Card("Diamonds", "3");
		Card c3 = new Card("Diamonds", "4");
		Card c4 = new Card("Diamonds", "5");
		Card c5 = new Card("Diamonds", "6");

		Card c6 = new Card("Hearts", "2");
		Card c7 = new Card("Clubs", "2");
		Card c8 = new Card("Clubs", "4");
		Card c9 = new Card("Clubs", "7");
		Card c10 = new Card("Clubs", "6");

		ArrayList<Card> Player1 = new ArrayList<Card>();
		Player1.add(c1);
		Player1.add(c2);
		Player1.add(c3);
		Player1.add(c4);
		Player1.add(c5);

		ArrayList<Card> Player2 = new ArrayList<Card>();
		Player2.add(c6);
		Player2.add(c7);
		Player2.add(c8);
		Player2.add(c9);
		Player2.add(c10);

		Hand h1 = new Hand(Player1);
		Hand h2 = new Hand(Player2);

		assertEquals(1, h1.compareTo(h2));

	}
	
	@Test
	public void testStraightFlush()
	{
		Card c1 = new Card("Diamonds", "9");
		Card c2 = new Card("Hearts", "6");
		Card c3 = new Card("Clubs", "7");
		Card c4 = new Card("Diamonds", "4");
		Card c5 = new Card("Hearts", "4");

		Card c6 = new Card("Clubs", "2");
		Card c7 = new Card("Clubs", "3");
		Card c8 = new Card("Clubs", "4");
		Card c9 = new Card("Clubs", "5");
		Card c10 = new Card("Clubs", "6");

		ArrayList<Card> Player1 = new ArrayList<Card>();
		Player1.add(c1);
		Player1.add(c2);
		Player1.add(c3);
		Player1.add(c4);
		Player1.add(c5);

		ArrayList<Card> Player2 = new ArrayList<Card>();
		Player2.add(c6);
		Player2.add(c7);
		Player2.add(c8);
		Player2.add(c9);
		Player2.add(c10);

		Hand h1 = new Hand(Player1);
		Hand h2 = new Hand(Player2);

		assertEquals(-1, h1.compareTo(h2));

	}
	
	@Test
	public void testStraightFlushVSF()
	{
		Card c1 = new Card("Diamonds", "2");
		Card c2 = new Card("Diamonds", "3");
		Card c3 = new Card("Diamonds", "4");
		Card c4 = new Card("Diamonds", "5");
		Card c5 = new Card("Diamonds", "6");

		Card c6 = new Card("Clubs", "3");
		Card c7 = new Card("Clubs", "4");
		Card c8 = new Card("Clubs", "5");
		Card c9 = new Card("Clubs", "6");
		Card c10 = new Card("Clubs", "7");

		ArrayList<Card> Player1 = new ArrayList<Card>();
		Player1.add(c1);
		Player1.add(c2);
		Player1.add(c3);
		Player1.add(c4);
		Player1.add(c5);

		ArrayList<Card> Player2 = new ArrayList<Card>();
		Player2.add(c6);
		Player2.add(c7);
		Player2.add(c8);
		Player2.add(c9);
		Player2.add(c10);

		Hand h1 = new Hand(Player1);
		Hand h2 = new Hand(Player2);

		assertEquals(-1, h1.compareTo(h2));

	}

}
