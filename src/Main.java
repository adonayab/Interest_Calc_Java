public class Main {

    public static void main(String[] args) {

        Card card1 = new Card("Fav1", "Visa", 100);
        Card card2 = new Card("Fav2", "MC", 50);
        Card card3 = new Card("Fav3", "Disc", 230);

        Card card4 = new Card("Fav4", "Visa", 23.45);
        Card card5 = new Card("Fav5", "MC", 300);
        Card card6 = new Card("Fav6", "Disc", 456.45);

        Wallet wal1 = new Wallet("Fav Wallet");
        wal1.addCard(card1);
        wal1.addCard(card2);

        Wallet wal2 = new Wallet("Another Fav Wallet");
        wal1.addCard(card3);
        wal2.addCard(card5);


        Wallet wal3 = new Wallet("Cat Wallet");
        wal3.addCard(card4);
        wal3.addCard(card6);

        Person p1 = new Person("John");
        p1.addWallet(wal1);
        p1.addWallet(wal2);

        Person p2 = new Person("Mark");
        p2.addWallet(wal3);

        p1.interestView();
        p2.interestView();

    }
}
