package src.sdr_cards;

public class Cards {
    public String ranks;
    public String suit;
    public String value;

    public Cards() {
    }

    public void getSuit() {
        return;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    public String getRanks() {
        return ranks;
    }

    public void setRanks(String ranks) {
        this.ranks = ranks;
    }

    public String toString() {
        return ranks + suit;
    }
}
