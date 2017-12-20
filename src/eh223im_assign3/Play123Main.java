package eh223im_assign3;

public class Play123Main {
    public static void main(String[] args) {
        Card c = new Card();
        Deck d = new Deck();

        boolean status = true;
        int w = 0;
        int counter = 1;

        do { // Repeat this
            for (int k = 0; k < 4; k++) { // 4 different suit
                for (int i = 0; i < 3; i++) { // every 3 different ranks
                    if (status) { // if still win, continue
                        c = d.deal();
                        System.out.println("Deal: " + c);
                        switch (i) {
                            case 0:
                                if (c.getRank(c).equals(CardList.Rank.ACE)) { // first deal, ace
                                    break;
                                } else { // lose if condition is not satisfied
                                    status = false;
                                    break;
                                }
                            case 1:
                                if (c.getRank(c).equals(CardList.Rank.TWO)) { // second deal, two
                                    break;
                                } else {
                                    status = false;
                                    break;
                                }
                            case 2:
                                if (c.getRank(c).equals(CardList.Rank.THREE)) { // third deal, three
                                    break;
                                } else {
                                    status = false;
                                    break;
                                }
                        }
                    } else { // if lose, break
                        break;
                    }
                }
                if (!status) break; // second for loop break
            }

            if (status) { // if survived, record win ratio
                System.out.println("You WIN");
                w++;
            } else {
                System.out.println("You LOSE");
            }

            System.out.println("Wins so far: "+w);
            System.out.println("Games so far: "+counter);
            d.deckRebuild(); // rebuild the deck
            d.shuffle(); // shuffle
            status = true; // reset
            counter++; // count playtime
        } while (counter < 10000000);

        System.out.println("\nWon: "+w+"\nTotal plays: "+counter); // export afterward
    }
}
