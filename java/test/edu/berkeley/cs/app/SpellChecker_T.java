package edu.berkeley.cs.app;

import edu.berkeley.cs.util.HashSet;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SpellChecker_T {
  private SpellChecker spellchecker;

  @Before
  public void setup() {
    HashSet<String> words = new HashSet<>();

    words.add("apple");
    words.add("camel");
    words.add("cat");
    words.add("dog");
    words.add("home");
    words.add("quiesce");
    words.add("royal");

    spellchecker = new SpellChecker(words);
  }

  @Test
  public void testCorrectlySpelled() {
    for (String word : spellchecker.words) {
      Assert.assertTrue(spellchecker.isCorrectlySpelled(word));
    }
  }

  @Test
  public void testSuggestionsAddStartCharacter() {
    for (String word : spellchecker.words) {
      String misspelled = word.substring(1);
      Assert.assertTrue(spellchecker.getSuggestions(misspelled).contains(word));
    }
  }

  @Test
  public void testSuggestionsAddEndCharacter() {
    for (String word : spellchecker.words) {
      String misspelled = word.substring(0, word.length() - 1);
      Assert.assertTrue(spellchecker.getSuggestions(misspelled).contains(word));
    }
  }

  @Test
  public void testSuggestionsRemoveStartCharacter() {
    for (String word : spellchecker.words) {
      for (char c = 'a'; c <= 'z'; c++) {
        Assert.assertTrue(spellchecker.getSuggestions(c + word).contains(word));
      }
    }
  }

  @Test
  public void testSuggestionsRemoveEndCharacter() {
    for (String word : spellchecker.words) {
      for (char c = 'a'; c <= 'z'; c++) {
        Assert.assertTrue(spellchecker.getSuggestions(word + c).contains(word));
      }
    }
  }

  private void swap(char[] input, int i, int j) {
    char temp = input[i];
    input[i] = input[j];
    input[j] = temp;
  }

  @Test
  public void testSuggestionsExchangeAdjacentCharacters() {
    for (String word : spellchecker.words) {
      char[] elements = word.toCharArray();
      for (int i = 1; i < elements.length; i++) {
        swap(elements, i, i - 1);

        String candidate = new String(elements);
        Assert.assertTrue(spellchecker.getSuggestions(candidate).contains(word));

        swap(elements, i, i - 1);
      }
    }
  }
}
