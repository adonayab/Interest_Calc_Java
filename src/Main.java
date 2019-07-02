public class Main {

    public static void main(String[] args) {

        /*
        * 1 person has 1 wallet and 3 cards (1 Visa, 1 MC 1 Discover) –
        * Each Card has a balance of $100 –
        * calculate the total interest (simple interest) for this person and per card.
        * */

        Card card1 = new Card("Fav Visa", "Visa", 100);
        Card card2 = new Card("Fav MC", "MC", 100);
        Card card3 = new Card("Fav Disc", "Disc", 100);

        Wallet wal1 = new Wallet("Fav Wallet");
        wal1.addCard(card1);
        wal1.addCard(card2);
        wal1.addCard(card3);

        Person p1 = new Person("John");
        p1.addWallet(wal1);
        p1.interestView();


        /*
        * 1 person has 2 wallets  Wallet 1 has a Visa and Discover , wallet 2 a MC - 
        * each card has $100 balance -
        * calculate the total interest(simple interest) for this person and interest per wallet
        * */

        Card card4 = new Card("Fav Visa", "Visa", 100);
        Card card5 = new Card("Fav MC", "MC", 100);
        Card card6 = new Card("Fav Disc", "Disc", 100);

        Wallet wal2 = new Wallet("Fav Wallet");
        wal1.addCard(card4);
        wal2.addCard(card6);

        Wallet wal3 = new Wallet("Another Fav Wallet");
        wal3.addCard(card5);

        Person p2 = new Person("Mark");
        p2.addWallet(wal2);
        p2.addWallet(wal3);
        p2.interestView();


        /*
        * 2 people have 1 wallet each,  person 1 has 1 wallet ,
        * with 2 cards MC and visa person 2 has 1 wallet – 1 visa and 1 MC - 
        * each card has $100 balance - calculate the total interest(simple interest)
        * for each person and interest per wallet
        * */

        Card card7 = new Card("Fav Visa", "Visa", 100);
        Card card8 = new Card("Fav MC", "MC", 100);
        Card card9 = new Card("Fav Visa", "Visa", 100);
        Card card10 = new Card("Fav MC", "MC", 100);

        Wallet wal4 = new Wallet("Fav Wallet");
        wal4.addCard(card7);
        wal4.addCard(card8);

        Wallet wal5 = new Wallet("Fav Wallet");
        wal5.addCard(card9);
        wal5.addCard(card10);

        Person p3 = new Person("Mercy");
        p3.addWallet(wal4);
        p3.interestView();

        Person p4 = new Person("Hanna");
        p4.addWallet(wal5);
        p4.interestView();



    }
}
