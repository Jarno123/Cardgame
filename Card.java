public class Card {
    int value;
    SUITE suite;

    public Card(int value, SUITE suite) {
        this.value = value;
        this.suite = suite;

    }
    
    //Getters and Setters

    public int getValue() {
        return value;
    }

    public SUITE getSuite() {
        return suite;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void setSuite(SUITE suite) {
        this.suite = suite;
    }

    @Override
    public String toString() {
        return "Card " + suite + " " + value;
    }

    public boolean isHigher(Card c) {
        return this.getValue() > c.getValue();
    }
}