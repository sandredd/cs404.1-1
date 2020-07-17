package edu.berkeley.cs.app;

import edu.berkeley.cs.util.HashSet;

public class SpellChecker {
  protected HashSet<String> words;

  /** @param words the dictionary (all known words) */
  SpellChecker(HashSet<String> words) {
    this.words = words;
  }

  /**
   * @param input the word to check the spelling of
   * @return true if the word is available in the dictionary
   */
  public boolean isCorrectlySpelled(String input) {
    // TODO: complete this function
    return false;
  }

  /**
   * @param input the word to base suggestions on
   * @return the words that are reachable from the input via the defined rules
   */
  public HashSet<String> getSuggestions(String input) {
    // TODO: complete this function
    return null;
  }
}
