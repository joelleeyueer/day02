package src.sdr_cards;

import java.util.ArrayList;

public class deckOfCards {

    private static ArrayList<Cards> deck;

    public deckOfCards(){
        deck = new ArrayList<>();
    }

    public ArrayList<Cards> getDeck() {
        return deck;
    }

    public static Object get(int index) {
        return deckOfCards.get(index);
    }


    public void addCard(String suit, String rank){
/*        switch (suit){
            case "Spades":
                deck.add(new Spades(rank));
            case "Hearts":
                deck.add(new Hearts(rank));
            case "Clubs":
                deck.add(new Clubs(rank));
            case "Diamonds":
                deck.add(new Diamonds(rank));
            default:
                System.out.println("Card not found!");
        }*/
    }
}
