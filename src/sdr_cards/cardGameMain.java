package src.sdr_cards;

public class cardGameMain {

    public static void main(String[] args) {
        deckOfCards d = new deckOfCards();
        //generate 52 cards and store in arraylist
        //generate spades
        for (int i = 2; i<15; i++){
            if (i < 11) {
                d.addCard("Spades", Integer.toString(i));
            }

            else if (i >= 11) {
                d.addCard("Spades", "J");
                d.addCard("Spades", "Q");
                d.addCard("Spades", "K");
                d.addCard("Spades", "A");
            }
        }

        for (int i = 2; i<15; i++){
            if (i < 11) {
                d.addCard("Hearts", Integer.toString(i));
            }

            else if (i >= 11) {
                d.addCard("Hearts", "J");
                d.addCard("Hearts", "Q");
                d.addCard("Hearts", "K");
                d.addCard("Hearts", "A");
            }
        }

        for (int i = 2; i<15; i++){
            if (i < 11) {
                d.addCard("Clubs", Integer.toString(i));
            }

            else if (i >= 11) {
                d.addCard("Clubs", "J");
                d.addCard("Clubs", "Q");
                d.addCard("Clubs", "K");
                d.addCard("Clubs", "A");
            }
        }

        for (int i = 2; i<15; i++) {
            if (i < 11) {
                d.addCard("Diamonds", Integer.toString(i));
            } else if (i >= 11) {
                d.addCard("Diamonds", "J");
                d.addCard("Diamonds", "Q");
                d.addCard("Diamonds", "K");
                d.addCard("Diamonds", "A");
            }
        }

        //2-10,J,Q,K,A = 13 cards
        for (int i = 0; i < d.getDeck().size(); i++){
            System.out.println(d.getDeck().get(i));
        }


    }
}
