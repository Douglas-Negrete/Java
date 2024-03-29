package JUnit;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

import edu.rcc.deck.Card;
import edu.rcc.hand.Hand;


public class Hand1HighCard {

	@Test
	public void testHand1HighCard()
	{
		Card c1 = new Card("Diamonds", "2");
		Card c2 = new Card("Diamonds", "4");
		Card c3 = new Card("Diamonds", "K");
		Card c4 = new Card("Clubs", "3");
		Card c5 = new Card("Diamonds", "6");

		Card c6 = new Card("Hearts", "2");
		Card c7 = new Card("Clubs", "Q");
		Card c8 = new Card("Clubs", "J");
		Card c9 = new Card("Clubs", "4");
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

		assertEquals(1, h1.compareTo(h2));

	}
	
	@Test
	public void testHighCard()
	{
		Card c1 = new Card("Diamonds", "2");
		Card c2 = new Card("Diamonds", "4");
		Card c3 = new Card("Diamonds", "Q");
		Card c4 = new Card("Clubs", "3");
		Card c5 = new Card("Diamonds", "6");

		Card c6 = new Card("Hearts", "2");
		Card c7 = new Card("Clubs", "K");
		Card c8 = new Card("Clubs", "J");
		Card c9 = new Card("Clubs", "4");
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
	
	@Test
	public void testHighCardVHC()
	{
		Card c1 = new Card("Diamonds", "2");
		Card c2 = new Card("Diamonds", "4");
		Card c3 = new Card("Diamonds", "K");
		Card c4 = new Card("Clubs", "3");
		Card c5 = new Card("Diamonds", "6");

		Card c6 = new Card("Hearts", "2");
		Card c7 = new Card("Clubs", "K");
		Card c8 = new Card("Clubs", "J");
		Card c9 = new Card("Clubs", "4");
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

		assertEquals(0, h1.compareTo(h2));

	}

}
