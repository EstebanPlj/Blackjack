package com.agendize.android.blackjack.game;

public class Hand {
    private Card [] mainJ;
    private int nbCartes;
    public static final int MAXCARTES = 6;
    public Hand() {
        mainJ = new Card[][MAXCARTES];
        nbCartes = 0;
    }
    public void clear() {
        nbCartes = 0;
        for(int i = 0; i < MAXCARTES; i++)
            mainJ[i] = null;
    }
    public void ajouterCarte(Card c) {
        if (nbCartes < MAXCARTES){
            mainJ[nbCartes] = c;
            nbCartes++;
        }
    }
    public void enleverCarte(int position) {
        if (position >= 0 && position < mainJ.length){
            mainJ[position] = null;
            for(int i = position; i < nbCartes; i++)
                mainJ[i] = mainJ[i+1];
            nbCartes--;
        }
    }
    public int getNbCartes() {
        return nbCartes;
    }
    public Card getCarte(int position) {
        if (position >= 0 && position < mainJ.length)
            return mainJ[position];
        else
            return null;
    }
    public void trieParCouleur() {
        Card [] nouvelleMain = new Card[MAXCARTES];
    }
    public int getBlackJackValeur() {
        int val;
        boolean ace;
        int cards;
        val = 0;
        ace = false;
        cards = getNbCartes();
        for ( int i = 0; i < cards; i++ ) {
            Card carte;
            int cardVal;
            carte = getCarte(i);
            //System.out.println(carte);
            cardVal = carte.getImageID();
            if (cardVal > 10) {
                cardVal = 10;
            }
            if (cardVal == 1) {
                ace = true;
            }
            val = val + cardVal;
        }
        if ( ace == true && val + 10 <= 21 )
            val = val + 10;
        return val;
    }
    public void trieParValeur() {
        Card [] nouvelleMain = new Card[][MAXCARTES];
        int nc = 0;
        while (nbCartes > 0){
            int pos = 0;
            Card c = mainJ[0];
            for(int i = 1; i < nbCartes; i++){
                Card c1 = mainJ[i];
                //System.out.println(c1);
                if (c1.getImageID() < c.getImageID() ||
                        (c1.getImageID() == c.getImageID() {
                    pos = i;
                    c = c1;
                }
            }
            enleverCarte(pos);
            nouvelleMain[nc++] = c;
        }
        mainJ = nouvelleMain;
        nbCartes = nc;
    }
    public String toString(){
        String res = "Il y a " + nbCartes + " cartes\n";
        for(int i = 0; i < nbCartes; i++)
            res += mainJ[i].toString() + "\n";
        return res;
    }
}
}
