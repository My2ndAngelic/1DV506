package eh223im_assign3;

import java.util.*;

public class Deck2 {
    // Card2 value: A - K ~ 1 - 13
    private int cardVal = 1;

    // Card2 type: Heart, Diamond, Club, Spade ~ 0, 1, 2, 3
    private int cardType = 0;

    public ArrayList <String> deck2 = new ArrayList <>();

    public void deckBuilder2() {
        deck2 = new ArrayList <>();
        for (int i = 1; i<14; i++) {
            for (int j = 1; j<5; j++) {
                String type = "";
                switch (j) {
                    case 1: type = "Heart"; break;
                    case 2: type = "Spade"; break;
                    case 3: type = "Club"; break;
                    case 4: type = "Diamond"; break;
                    default: break;
                }
                deck2.add(Integer.toString(i)+ " " +type);
            }
        }
    }

    public void shuffle2 () {
        if (deck2.isEmpty()) {
            deckBuilder2();
            Collections.shuffle(deck2);
        } else {
            Collections.shuffle(deck2);
        }
    }


}

