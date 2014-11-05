package edu.rcc.hand;

import java.util.ArrayList;
import java.util.Collections;

import edu.rcc.deck.Card;
import edu.rcc.main.Main;

public class Hand implements Comparable<Object>
{

	//royalFlush(10), straightFlush, fourKind, fullHouse, flush, straight,threeKind, twoPair, pair, highCard(1)

	//Card[] theCards = new Card[10];
	private ArrayList<Card> theCards = new ArrayList<Card>();

	int h1 = 0;
	int h2 = 0;

	public Hand(ArrayList<Card> theCards)
	{
		this.theCards = theCards;
	}

	public String toString()
	{
		String s = "";
		for(Card c : theCards)
		{
			s += c.toString() + "; ";
		}

		return s;

	}

	@Override
	public int compareTo(Object o)
	{
		int r = 0;
		Hand other = (Hand)o;
		Hand self = this;

		if (!(o instanceof Hand))
		{
			return 0;
		}

		self.changeFace(self.theCards);
		self.sort(self.theCards);

		other.changeFace(other.theCards);
		other.sort(other.theCards);

		if(isStraightFlush(self.theCards) > 0)
		{
			h1 = 9;
			System.out.println("StraightFlush");
		}
		else if(is4OK(self.theCards) > 0)
		{
			h1 = 8;
			System.out.println("Four of a Kind");
		}
		else if(isFullHouse(self.theCards) > 0)
		{
			h1 = 7;
			System.out.println("Full House");
		}
		else if(isFlush(self.theCards) > 0)
		{
			h1 = 6;
			System.out.println("Flush");
		}
		else if(isStraight(self.theCards) > 0)
		{
			h1 = 5;
			System.out.println("Straight");
		}
		else if(is3OK(self.theCards) > 0)
		{
			h1 = 4;
			System.out.println("Three of a Kind");
		}
		else if(is2Pair(self.theCards) > 0)
		{
			h1 = 3;
			System.out.println("Two Pair");
		}
		else if(isPair(self.theCards) > 0)
		{
			h1 = 2;
			System.out.println("Pair");
		}
		else if(isHighCard(other.theCards) == 1)
		{
			h1 = 1;
			System.out.println("Hand 1 has the High Card");
		}
		else
		{
			System.out.println("nothing");
		}
		//------------------------------------------------------------------------------
		if(isStraightFlush(other.theCards) > 0)
		{
			h2 = 9;
			System.out.println("StraightFlush");
		}
		else if(is4OK(other.theCards) > 0)
		{
			h2 = 8;
			System.out.println("Four of a Kind");
		}
		else if(isFullHouse(other.theCards) > 0)
		{
			h2 = 7;
			System.out.println("Full House");
		}
		else if(isFlush(other.theCards) > 0)
		{
			h2 = 6;
			System.out.println("Flush");
		}
		else if(isStraight(other.theCards) > 0)
		{
			h2 = 5;
			System.out.println("Straight");
		}
		else if(is3OK(other.theCards) > 0)
		{
			h2 = 4;
			System.out.println("Three of a Kind");
		}
		else if(is2Pair(other.theCards) > 0)
		{
			h2 = 3;
			System.out.println("Two Pair");
		}
		else if(isPair(other.theCards) > 0)
		{
			h2 = 2;
			System.out.println("Pair");
		}
		else if(isHighCard(other.theCards) == -1 && h1 == 0)
		{
			h2 = 1;
			System.out.println("Hand 2 has the High Card");
		}
		else
			System.out.println("nothing");

		//self is h1, other is h2
		if((h1 == 9 && h2 ==9)||(h1 == 5 && h2 == 5))
		{

			if(getNum(self)>getNum(other))
				return 1;
			else
				return -1;

		}

		if((h1 == 7 && h2 == 7)||(h1 == 8 && h2 == 8)||(h1 == 4 && h2 == 4))
		{
			if(tieBreaker(self)>tieBreaker(other))
				return 1;	
			else
				return -1;
		}

		if(h1 == 6 && h2 == 6)
		{
			if(isHighCard(self.theCards)==1)
				return 1;
			else
				return -1;
		}

		if(h1 == 3 && h2 == 3)
		{
			if(is2PairTie(self.theCards) > is2PairTie(other.theCards))
				return 1;
			else
				return -1;
		}

		if(h1 == 2 && h2 == 2)
		{
			if(isPairTie(self.theCards) > isPairTie(other.theCards))
				return 1;
			else
				return -1;
		}

		self.changeFaceBack(self.theCards);
		other.changeFaceBack(other.theCards);

		System.out.println();
		System.out.println(self);
		System.out.println();
		System.out.println(other);
		System.out.println();

		if(h1>h2)
			return 1;
		else if(h1 < h2)
			return -1;

		return r;
	}	 

	public ArrayList<Card> changeFace(ArrayList<Card> c)
	{

		for(int i = 0; i < c.size(); i++)
		{

			if(c.get(i).getFace() == "A")
				c.get(i).setFace("1");
			if(c.get(i).getFace() == "J")
				c.get(i).setFace("11");
			if(c.get(i).getFace() == "Q")
				c.get(i).setFace("12");
			if(c.get(i).getFace() == "K")
				c.get(i).setFace("13");

		}

		return c;

	}

	public ArrayList<Card> changeFaceBack(ArrayList<Card> c)
	{

		for(int i = 0; i < c.size(); i++)
		{

			if(c.get(i).getFace() == "1")
				c.get(i).setFace("A");
			if(c.get(i).getFace() == "11")
				c.get(i).setFace("J");
			if(c.get(i).getFace() == "12")
				c.get(i).setFace("Q");
			if(c.get(i).getFace() == "13")
				c.get(i).setFace("K");

		}

		return c;

	}

	public ArrayList<Card> sort(ArrayList<Card> c)
	{
		Card temp;

		for (int i = 0; i < c.size() - 1; i++)
		{
			for (int j = i + 1; j < c.size(); j++)
			{
				if (Integer.parseInt((String)c.get(i).getFace()) > Integer.parseInt((String)c.get(j).getFace()))
				{
					temp = c.get(i);
					c.set(i,c.get(j));
					c.set(j, temp);
				}
			}
		}

		//for(int m = 0; m < c.size(); m++)
		//{

		//	System.out.println(c.get(m).getFace());

		//}

		return c;

	}

	public int tieBreaker(Hand h)
	{
		//		int r=0;

		//		int numbSame = 1;
		//		for (int i = 0; i < h.theCards.size() - 1; ++i ) {
		//			if (h.theCards.get(i).isSameFace(h.theCards.get(i+1)))
		//			{
		//				++numbSame;
		//				if(numbSame == 4)
		//				{
		//					
		//					r = Integer.parseInt((String)h.theCards.get(i).getFace());
		//					
		//				}
		//				else if(numbSame == 3 && h1 != 8)
		//				{
		//					
		//					r = Integer.parseInt((String)h.theCards.get(i).getFace());
		//					
		//				}
		//			} 
		//		}


		return Integer.parseInt((String)h.theCards.get(2).getFace());
	}

	public int is2PairTie(ArrayList<Card> c)
	{
		int count = 0;
		int one = 0;
		int two = 0;

		for (int i = 0; i < c.size()-1; i++)
		{
			for (int j = i + 1; j < c.size(); j++)
			{
				if (Integer.parseInt((String)c.get(i).getFace()) == Integer.parseInt((String)c.get(j).getFace()))
				{
					count++;
					if(count == 1)
						one = Integer.parseInt((String)c.get(i).getFace());
					if(count == 2)
						two = Integer.parseInt((String)c.get(i).getFace());
				}
			}
		}

		if(one > two)
			return one;

		return two;
	}

	public int isPairTie(ArrayList<Card> c)
	{
		int count = 0;
		for (int i = 0; i < c.size()-1; i++)
		{
			if ((c.get(i).getFace().equals(c.get(i+1).getFace())))
			{
				count++;
				if(count == 1)
					return Integer.parseInt((String)c.get(i).getFace());
			}
		}
		return 0;
	}

	public int isStraightFlush(ArrayList<Card> c)
	{
		//		int count = 0;
		//		for (int i = 0; i < c.size()-1; i++)
		//		{
		//			for (int j = i + 1; j < c.size(); j++)
		//			{
		//				if (Integer.parseInt((String)c.get(j).getFace()) - Integer.parseInt((String)c.get(i).getFace()) == 1 && c.get(i).getSuit().equals(c.get(j).getSuit()))
		//				{
		//					count++;
		//					if(count == 4)
		//						return 9;
		//				}
		//			}
		//			count = 0;
		//		}
		//		return 0;
		if(isStraight(c) == 5 && isFlush(c) == 6)
		{
			return 9;

		}
		return 0;
	}

	public int is4OK(ArrayList<Card> c)
	{
		int count = 0;
		for (int i = 0; i < c.size()-1; i++)
		{
			for (int j = i + 1; j < c.size(); j++)
			{

				if (Integer.parseInt((String)c.get(i).getFace()) == Integer.parseInt((String)c.get(j).getFace()))
				{
					count++;
					if(count == 3)
						return 8;

				}
			}
			count = 0;
		}
		return 0;
	}

	public int isFullHouse(ArrayList<Card> c)
	{
		int count = 0;
		int temp = 0;

		outLoop:{
			for (int i = 0; i < c.size()-1; i++)
			{
				for (int j = i + 1; j < c.size(); j++)
				{
					if (Integer.parseInt((String)c.get(i).getFace()) == Integer.parseInt((String)c.get(j).getFace()))
					{
						count++;
						if(count == 2)
						{
							temp = j;
							break outLoop;
						}
						else if(count == 1)
						{
							temp = j;
							break outLoop;
						}

					}
				}
				count = 0;
			}
		}

		if(count == 2)
		{
			count = 0;
			for (int i = temp; i < c.size()-1; i++)
			{
				for (int j = i + 1; j < c.size(); j++)
				{
					if (Integer.parseInt((String)c.get(i).getFace()) == Integer.parseInt((String)c.get(j).getFace()))
					{
						count++;
						if(count == 1)
						{
							return 7;
						}

					}
				}
			}
		}
		else if(count == 1)
		{
			count = 0;
			for (int i = temp; i < c.size()-1; i++)
			{
				for (int j = i + 1; j < c.size(); j++)
				{
					if (Integer.parseInt((String)c.get(i).getFace()) == Integer.parseInt((String)c.get(j).getFace()))
					{
						count++;
						if(count == 2)
							return 7;

					}
				}
			}

		}

		return 0;
	}

	public int isFlush(ArrayList<Card> c)
	{
		int count = 0;
		for (int i = 0; i < c.size()-1; i++)
		{
			for (int j = i + 1; j < c.size(); j++)
			{
				if (c.get(i).getSuit().equals(c.get(j).getSuit()))
				{
					count++;
					if(count == 4)
						return 6;
				}
			}
			count = 0;
		}
		return 0;
	}

	public int isStraight(ArrayList<Card> c)
	{
		int count = 0;
		for (int i = 0; i < c.size()-1; i++)
		{
			if (Integer.parseInt((String)c.get(i+1).getFace()) - Integer.parseInt((String)c.get(i).getFace()) == 1)
			{
				count++;
				if(count == 4)
					return 5;
			}

		}
		return 0;
	}

	public int is3OK(ArrayList<Card> c)
	{
		int count = 0;
		for (int i = 0; i < c.size()-1; i++)
		{
			for (int j = i+1; j < c.size(); j++)
			{
				if (Integer.parseInt((String)c.get(i).getFace()) == Integer.parseInt((String)c.get(j).getFace()))
				{
					count++;
					if(count==2)
						return 2;
				}
			}
			count = 0;
		}

		return 0;
	}

	public int is2Pair(ArrayList<Card> c)
	{
		int count = 0;

		for (int i = 0; i < c.size()-1; i++)
		{
			for (int j = i + 1; j < c.size(); j++)
			{
				if (Integer.parseInt((String)c.get(i).getFace()) == Integer.parseInt((String)c.get(j).getFace()))
					count++;
			}
		}

		if(count == 2)
			return 3;
		return 0;
	}

	public int isPair(ArrayList<Card> c)
	{
		int count = 0;
		for (int i = 0; i < c.size()-1; i++)
		{
			if (Integer.parseInt((String)c.get(i).getFace()) == Integer.parseInt((String)c.get(i+1).getFace()))
			{
				count++;
				if(count==1)
					return 2;
			}
		}

		return 0;
	}

	public int isHighCard(ArrayList<Card> c)
	{

		int r = -1;

		if (Integer.parseInt((String)this.theCards.get(4).getFace()) > Integer.parseInt((String)c.get(4).getFace()))
		{
			r = 1;
		}
		else if(Integer.parseInt((String)this.theCards.get(4).getFace()) == Integer.parseInt((String)c.get(4).getFace()))
		{
			r = 0;	
		}

		return r;

	}

	public int getNum(Hand h) {
		int sum = 0;
		for (int i=0; i < h.theCards.size(); i++)
		{
			sum += Integer.parseInt((String)this.theCards.get(i).getFace());
		}
		return sum;
	}


}

