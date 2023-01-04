package src.sdr_cards;

public class Cards {
    public String ranks;
    public String suit;
    public Integer value;

    //constructor will alr construct cards, don't need setter
    public Cards(String ranks, String suit, Integer value) {
        this.ranks = ranks;
        this.suit = suit;
        this.value = value;
    }

    public String getRanks() {
        return ranks;
    }

    public String getSuit() {
        return suit;
    }

    public int getValue() {
        return value;
    }

    public String toString() {
        return ranks + " of " + suit;
    }
}
