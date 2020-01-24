package com.maroonyeti.deckofcards;

/**
 * Ranked Card implementation of a Card.
 * 
 * @author Haeyoung Lim
 *
 */
public class RankedCard implements Card {

  private final Rank rank;

  private final Suit suit;

  public RankedCard(Rank rank, Suit suit) {

    this.rank = rank;

    this.suit = suit;
  }

  @Override
  public boolean isJoker() {
    throw new UnsupportedOperationException("Not yet implemented");
  }

  @Override
  public Rank getRank() {
    return rank;
  }

  @Override
  public Suit getSuit() {
    return suit;
  }
}
