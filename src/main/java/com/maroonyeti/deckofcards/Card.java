package com.maroonyeti.deckofcards;

/**
 * Defines a playing card.
 * 
 * All cards have a rank and a suit, except for Jokers. The rank and suit are null for Jokers.
 * 
 * @author Haeyoung Lim
 *
 */
public interface Card {

  Rank getRank();

  Suit getSuit();

  boolean isJoker();

}
