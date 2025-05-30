package SimpleCardGame;
import java.util.Random;
import java.util.Arrays;

public class Cards {
    private String[][] cardDeck = new String[4][4];
    private String output;
    private String[] baseArray = new String[16];
    private String base =    "------------\n"+
                             "[%s][%s][%s][%s]\n"+
                             "[%s][%s][%s][%s]\n"+
                             "[%s][%s][%s][%s]\n"+
                             "[%s][%s][%s][%s]\n"+
                             "------------"; 

    public void startDeck() {
        Arrays.fill(baseArray,"*");
        String[] cards = {"A","B","C","D","E","F","G","H","A","B","C","D","E","F","G","H"};
        String[] places = {
            "00","01","02","03",
            "10","11","12","13",
            "20","21","22","23",
            "30","31","32","33"};
        for (String a : cards) {
            while(true) {
                Random rand = new Random();
                int placeRand = rand.nextInt(16);
                if (places[placeRand].equals("0")) {
                    continue;
                }
                else {
                    String placeHold = places[placeRand];
                    int firstHold = Character.getNumericValue(placeHold.charAt(0));
                    int secondHold = Character.getNumericValue(placeHold.charAt(1));
                    cardDeck[firstHold][secondHold] = a;
                    places[placeRand] = "0";
                    break;
                }
            }
        }
}

    // This should be used for just test.
    public void printFully() {
        System.out.printf(base,getCard00(),getCard01(),getCard02(),getCard03(),
getCard10(),getCard11(),getCard12(),getCard13(),
getCard20(),getCard21(),getCard22(),getCard23(),
getCard30(),getCard31(),getCard32(),getCard33());
}

    public boolean isRevealed(int a1,int a2) {
        int cardPlace = (a1*4)+a2;
        if (baseArray[cardPlace].equals("*")) {
            return false;
        }
        else {
            return true;
        }
    }

    public void reveal(int a1,int a2) {
        int cardPlace = (a1*4)+a2;
        baseArray[cardPlace] = cardDeck[a1][a2];
    }

    public void unreveal(int a1,int a2) {
        int cardPlace = (a1*4)+a2;
        baseArray[cardPlace] = "*";
    }

    public boolean isMatching(int a11,int a12,int a21,int a22) {
        if (cardDeck[a11][a12].equals(cardDeck[a21][a22])) {
            return true;
        }
        else {
            return false;
        }
    }

    public boolean isAllRevealed() {
        for (String item : baseArray) {
            if (item.equals("*")) {
                return false;
        }
    }
        return true;
}

    public void updateOutput() {
        output = String.format(base,(Object[])baseArray);
        System.out.println(output);
    }

    public String getCard00() {
        return cardDeck[0][0];
    }
    public String getCard01() {
        return cardDeck[0][1];
    }
    public String getCard02() {
        return cardDeck[0][2];
    }
    public String getCard03() {
        return cardDeck[0][3];
    }
    public String getCard10() {
        return cardDeck[1][0];
    }
    public String getCard11() {
        return cardDeck[1][1];
    }
    public String getCard12() {
        return cardDeck[1][2];
    }
    public String getCard13() {
        return cardDeck[1][3];
    }
    public String getCard20() {
        return cardDeck[2][0];
    }
    public String getCard21() {
        return cardDeck[2][1];
    }
    public String getCard22() {
        return cardDeck[2][2];
    }
    public String getCard23() {
        return cardDeck[2][3];
    }
    public String getCard30() {
        return cardDeck[3][0];
    }
    public String getCard31() {
        return cardDeck[3][1];
    }
    public String getCard32() {
        return cardDeck[3][2];
    }
    public String getCard33() {
        return cardDeck[3][3];
    }
}
