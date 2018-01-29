import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {

    List<Card> cardDeck;
    
    
//Make cards
    public Deck() {
        this.cardDeck = new ArrayList<Card>();
        for (int value = 1; value <= 13; value++) 
        {
            for (SUITE suite : SUITE.values()) {
                cardDeck.add(new Card(value, suite));
            }
        }
    }

    @Override
    public String toString() {
        return "Deck " + "cardDeck=" + cardDeck;
    }

    //pick random card 1 and 2
    public void Random() {
        Random rand = new Random();
        for (int i = 0; i < 20; i++) {
            int firstCard = rand.nextInt(52);
            int secondCard = rand.nextInt(52);
            Collections.swap(cardDeck, firstCard, secondCard);
        }
    }

    public Card dealCard() {
        Card removedCard = cardDeck.remove(0);
        return removedCard;
    }

    public int getSizeOfDeck() {
        return cardDeck.size();
    }

}