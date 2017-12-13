package eh223im_assign3;

public class PlayCardMain {
    public static void main(String[] args) {
        Deck d = new Deck();
        Card c = new Card();
        System.out.println(d.deck);
        c = d.deal(0);
        d.shuffle();
        System.out.println(d.deck);
        System.out.println(c);
        System.out.println(c.getRank(c));
        System.out.println(c.getSuit(c));
//        d.getRank(d.deal());
    }
}
