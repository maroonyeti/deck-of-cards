package com.maroonyeti.deckofcards;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import java.util.stream.Stream;
import org.junit.jupiter.api.Test;

public class DeckOfCardsTests {

  @Test
  public void createDeck_WithCards_NewInstanceOfDeckIsCreated() {

    DeckOfCards deckOfCards1 = new DeckOfCards();
    DeckOfCards deckOfCards2 = new DeckOfCards();

    assertNotEquals(deckOfCards1, deckOfCards2);
  }

  @Test
  public void dealOneCard_FromOneDeckOfCardInstance_DeckHasOneLessCard() {

    DeckOfCards fullDeckOfCards = new DeckOfCards();
    dealOneCard(fullDeckOfCards);
    int cardCount = Stream.of(fullDeckOfCards).count();

    // DeckOfCards creates a standard 52-card deck with 2 jokers
    assertEquals(cardCount, 53);
  }
}
