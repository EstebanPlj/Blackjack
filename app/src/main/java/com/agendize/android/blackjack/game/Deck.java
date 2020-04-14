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
    public void shuffle() {
        for ( int i = 0; i < 52; i ++ ) {
            int rand = r.nextInt(52);
            Card temp = Deck[i];
            Deck[i] = Deck[rand];
            Deck[rand] = temp;
        }
