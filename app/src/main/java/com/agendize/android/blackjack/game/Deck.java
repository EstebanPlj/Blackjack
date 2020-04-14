package com.agendize.android.blackjack.game;

import androidx.annotation.NonNull;

public class Deck {
    public static void main(String [] args){
        Deck deck = new Deck();
        System.out.println(deck);

    }
}
import java.util.Random;
public class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<>(52);
    }
}
    public void shuffleCards() {
        Collections.shuffle(cards, new Random());
        currentCard = 0;

        public Card getNextCard() {
            Card card = cards.get(index);
            currentCard++;

            public Deck() {
                cards = new ArrayList<>(52);
                for (Card.Rank rank : Card.Rank.values()) {
                    for (Card.Suit suit : Card.Suit.values()) {
                        cards.add(new Card(rank, suit));
                    }
                }
                shuffleCards();
            }