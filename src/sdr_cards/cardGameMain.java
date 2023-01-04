package src.sdr_cards;

import java.util.ArrayList;

public class cardGameMain {

    public static void main(String[] args) {
        Constants cons = new Constants();
        ArrayList<Cards> decklist = new ArrayList<>();

        //generate card for each suit and rank
        for (int suitIndex = 0; suitIndex<cons.SUIT.length; suitIndex++){
            for (int rankIndex = 0; rankIndex<cons.RANK.length; rankIndex++){
                Cards incomingCard = new Cards(cons.RANK[rankIndex],cons.SUIT[suitIndex],cons.VALUE[suitIndex]);
                decklist.add(incomingCard);
            }
        }

        //print decklist
        System.out.println(decklist);
    }
}
