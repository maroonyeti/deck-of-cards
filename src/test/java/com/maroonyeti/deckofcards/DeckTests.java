package com.maroonyeti.deckofcards;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DeckTests {

  @Test
  public void createDeck_WithCards_NewInstanceOfDeckIsCreated() {

    Deck deck1 = new Deck();
    Deck deck2 = new Deck();

    assertNotEquals(deck1, deck2);
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
