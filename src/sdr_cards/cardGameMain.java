package src.sdr_cards;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Random;

public class cardGameMain {

    static ArrayList<Cards> decklist = new ArrayList<>();

    public static void main(String[] args) {
        Constants cons = new Constants();
        //generate card for each suit and rank
        for (int suitIndex = 0; suitIndex<cons.SUIT.length; suitIndex++){
            for (int rankIndex = 0; rankIndex<cons.RANK.length; rankIndex++){
                Cards incomingCard = new Cards(cons.RANK[rankIndex],cons.SUIT[suitIndex],cons.VALUE[suitIndex]);
                decklist.add(incomingCard);
            }
        }

        //print decklist
        System.out.println("Printing the unshuffled decklist:\n" + decklist);
        shuffleDeck();
    }

    public static void shuffleDeck(){
        Random random = new SecureRandom();
        //iterate through array and swap current element with a random element in the array
        for (int currIndex = 0; currIndex<decklist.size(); currIndex++){
            Cards currentCard = decklist.get(currIndex);
            int randomIndex = random.nextInt(decklist.size());
            Cards toSwapCard = decklist.get(randomIndex);
            decklist.set(currIndex,toSwapCard);
            decklist.set(randomIndex,currentCard);
        }
        System.out.println("Printing the shuffled decklist:\n" + decklist);
    }
}
