import java.util.ArrayList;

public class Person {

    private String name;
    private ArrayList<Wallet> wallets = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Wallet> getWallets() {
        return wallets;
    }

    public void addWallet(Wallet wallet) {
        wallets.add(wallet);
    }


    public void interestView() {

        for (Wallet wallet: wallets) {
            for (Card card: wallet.getCards()) {
                System.out.println(name + ", For your " + card.getName() + " of Type " + card.getCardType() + " card, in your " + wallet.getName() + ", You have " + card.calcInterest() + "$ interest.");
            }
        }

    }
}
