package eh223im_assign3;

public class Card2 {

    // Card2 value: A - K ~ 1 - 13
    private int cardVal = 1;

    private  int cardVal (String str) {
        int pos = 0;
        int val = 0;
        String str2 = "";
        do {
            str2 = str.substring(0,pos+1);
            pos++;
        } while (str.charAt(pos) != 32);

        switch (str2) {
            case "A": val = 1; break;
            case "2": val = 2; break;
            case "3": val = 3; break;
            case "4": val = 4; break;
            case "5": val = 5; break;
            case "6": val = 6; break;
            case "7": val = 7; break;
            case "8": val = 8; break;
            case "9": val = 9; break;
            case "10":val = 10; break;
            case "J": val = 11; break;
            case "K": val = 12; break;
            case "Q": val = 13; break;
            default: break;
        }
        return val;
    }

    // Card2 type: Heart, Diamond, Club, Spade ~ 0, 1, 2, 3
    private int cardType = 0;

    private int cardType (String str) {
        int pos = 0;
        int val = 0;
        String str2 = "";
        do {
            str2 = str.substring(0, pos + 1);
            pos++;
        } while (str.charAt(pos) != 32);

        String str3 = str.substring(str2.length()+1, str2.length()+2);

        switch (str3) {
            case "H":
                val = 0;
                break;
            case "D":
                val = 1;
                break;
            case "C":
                val = 2;
                break;
            case "S":
                val = 3;
                break;
            default:
                val = -1;
                break;
        }
        return val;
    }

    Card2(int cV, int cT) {
        if (checkCard(this)) {
            cardVal = cV;
            cardType = cT;
        }
    }

    // Check validity
    private boolean checkCard (Card2 c) {
        return checkCardType(c) && checkCardVal(c);
    }

    // Check if card within validity
    private boolean checkCardVal (Card2 c) {
        int minCardVal = 1;
        int maxCardVal = 13;
        return c.cardVal <= maxCardVal && c.cardVal >= minCardVal;
    }

    private boolean checkCardType (Card2 c) {
        int minCardType = 0;
        int maxCardType = 3;
        return c.cardType <= maxCardType && c.cardType >= minCardType;
    }
}
