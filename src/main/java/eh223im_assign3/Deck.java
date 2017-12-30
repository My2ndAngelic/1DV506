package eh223im_assign3;

import java.util.*;

public class Deck { // A deck
    List<Card> deck;
    Deck() {   // constructor
        deck = new ArrayList<Card>();
        for (CardList.Suit suit : CardList.Suit.values()) {
            for (CardList.Rank rank : CardList.Rank.values()) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    public void deckRebuild () { // rebuild deck
        deck = new ArrayList<Card>();
        for (CardList.Suit suit : CardList.Suit.values()) {
            for (CardList.Rank rank : CardList.Rank.values()) {
                deck.add(new Card(suit, rank));
            }
        }
    }

    public void shuffle () { // shuffle deck
        Collections.shuffle(deck);
    }

    public Card deal() { // deal card, memorize after deal, remove from deck
        Card c = deck.get(new Random().nextInt(deck.size()));
        keep(c);
        removeD(c);
        return c;
    }

    public Card deal(int i) {  // deal card at the position i
        Card c = deck.get(i);
        keep(c);
        removeD(c);
        return c;
    }

    private void keep(Card c) { // safety
    }

    private void removeD(Card c) { // remove card
        deck.remove(c);
    }


}

// Adapted from: https://www.ntu.edu.sg/home/ehchua/programming/java/JavaEnum.html
