import java.util.ArrayList;

public class Wallet {

    private String name;
    private ArrayList<Card> cards = new ArrayList<>();

    public Wallet(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Card> getCards() {
        return cards;
    }

    public void addCard(Card aCard) {
        cards.add(aCard);
    }

}
