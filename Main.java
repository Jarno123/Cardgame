import java.util.Scanner;

public class Main {
    public static Scanner in;

    public static void main(String args[]) {
        in = new Scanner(System.in);

        String guess;

        Deck deck = new Deck();
        System.out.println(deck);
        System.out.println("Groote van het deck is: " + deck.getSizeOfDeck());

        deck.Random();
        System.out.println("Kaart 1 is ACE, Kaart 11 is Boer, Kaart 12 is Vrouw, Kaart 13 is Koning");

        Card c = deck.dealCard();
        System.out.println("De deck groote op dit moment " + deck.getSizeOfDeck());

        System.out.println("Kaart op dit moment is " + c);
        while (true) {
            System.out.println("is de volgende kaart hoger(h) of lager(l)?");

            guess = in.next();

            Card c1 = deck.dealCard();
            System.out.println("de nieuwe kaart " + c1);

            if (guess.equalsIgnoreCase("h") && c1.isHigher(c)) {
                System.out.println("Je hebt goed geantwoord!");
            } else if (guess.equalsIgnoreCase("l") && c.isHigher(c1)) {
                System.out.println("Je hebt het goed");
            } else {
                System.out.println("je hebt het fout");
                break;
            }
        }
    }
}