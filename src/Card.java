public class Card {

    private String name;
    private double amount;
    private String cardType;

    public Card(String name, String cardType, double amount) {
        this.name = name;
        this.cardType = cardType;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double calcInterest() {

        double interest = -1;

        if (cardType.equals("Visa")) {
            interest = amount * 0.1;
        } else if (cardType.equals("MC")) {
            interest = amount * 0.05;
        } else if (cardType.equals("Disc")) {
            interest = amount * 0.01;
        }

        return interest;
    }
}
