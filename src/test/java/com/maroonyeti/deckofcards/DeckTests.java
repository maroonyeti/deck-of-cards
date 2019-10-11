package com.maroonyeti.deckofcards;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DeckTests {

  @Test
  public void create2Decks_2Instances_NotEqualsEquals() {

    Deck deck1 = new Deck();
    Deck deck2 = new Deck();

    assertThat(deck1 == deck2).isFalse();
  }

  /*
   * @Test public void dealOneCard_FromOneDeckOfCardInstance_DeckHasOneLessCard() {
   * 
   * DeckOfCards fullDeckOfCards = new DeckOfCards(); dealOneCard(fullDeckOfCards); int cardCount =
   * Stream.of(fullDeckOfCards).count();
   * 
   * // DeckOfCards creates a standard 52-card deck with 2 jokers assertEquals(cardCount, 53); }
   */
}
