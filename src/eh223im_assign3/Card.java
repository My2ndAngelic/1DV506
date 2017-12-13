package eh223im_assign3;

public class Card { // Card info, using enum
    private CardList.Suit suit;
    private CardList.Rank rank;

    Card (CardList.Suit suit, CardList.Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    Card () { // nothing if empty

    }

    public CardList.Suit getSuit(Card c) {
        return suit;
    }

    public CardList.Rank getRank(Card c) {
        return rank;
    }

    public String toString () {
        return (rank+ " " + suit);
    }

}

// Adopted from: https://www.ntu.edu.sg/home/ehchua/programming/java/JavaEnum.html