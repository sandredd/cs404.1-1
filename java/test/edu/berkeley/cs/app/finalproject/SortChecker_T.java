package edu.berkeley.cs.app.finalproject;

import edu.berkeley.cs.util.Utilities;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortChecker_T {
  private char[] englishAlphabet = new char[26];
  private char[] alienAlphabet =
      new char[] {'*', '#', '!', '@', '%', '~', '&', '-', '^', '+', '$', '/'};

  private SortChecker english;
  private SortChecker alien;

  @Before
  public void setup() {
    for (int i = 0; i < englishAlphabet.length; i++) {
      englishAlphabet[i] = (char) ('a' + i);
    }

    english = new SortChecker(englishAlphabet);
    alien = new SortChecker(alienAlphabet);
  }

  @Test
  public void testSingleElement() {
    Assert.assertTrue(alien.isSorted(new String[] {"*"}));
  }

  @Test
  public void testEnglishSorted() {
    Assert.assertTrue(
        english.isSorted(
            new String[] {
              "apologies",
              "apple",
              "apply",
              "book",
              "cat",
              "chat",
              "churchyards",
              "decentralizing",
              "fearlessness",
              "graphologist",
              "grappling",
              "nethermost",
            }));
  }

  @Test
  public void testEnglishNotSorted() {
    Assert.assertFalse(
        english.isSorted(new String[] {"fearlessness", "apple", "grappling", "churchyards"}));
  }

  @Test
  public void testAlienShorterWordsEarlier() {
    Assert.assertTrue(alien.isSorted(new String[] {"*##", "*##@"}));
    Assert.assertFalse(alien.isSorted(new String[] {"*##@", "*##"}));
  }

  @Test
  public void testAlienSingleCharacter() {
    String[] words = new String[alienAlphabet.length];
    for (int i = 0; i < words.length; i++) {
      words[i] = String.valueOf(alienAlphabet[i]);
    }

    Assert.assertTrue(alien.isSorted(words));
  }

  @Test
  public void testAlienSingleCharacterUnsorted() {
    String[] words = new String[alienAlphabet.length];
    for (int i = 0; i < words.length; i++) {
      words[i] = String.valueOf(alienAlphabet[words.length - 1 - i]);
    }

    Assert.assertFalse(alien.isSorted(words));
  }

  @Test
  public void testAlienDuplicateSorted() {
    Assert.assertTrue(alien.isSorted(new String[] {"*##", "*##", "*##"}));
  }

  @Test
  public void testAlienSubsort() {
    Assert.assertTrue(alien.isSorted(new String[] {"*##", "*#@", "*#~", "*@#", "*&$"}));
    Assert.assertFalse(alien.isSorted(new String[] {"*#@", "*##", "*#~", "*@#", "*&$"}));
  }

  @Test
  public void testPerformance()
      throws IOException, InterruptedException, ExecutionException, TimeoutException {
    Path dictionary = Paths.get(System.getProperty("user.dir"), "resources", "words");

    CharsetEncoder asciiEncoder = StandardCharsets.US_ASCII.newEncoder();
    String[] words = new String[50000];

    int i = 0;
    try (BufferedReader reader = new BufferedReader(new FileReader(dictionary.toFile()))) {
      for (String word = reader.readLine();
          word != null && i < words.length;
          word = reader.readLine()) {
        if (word.contains("'") || !asciiEncoder.canEncode(word)) {
          continue;
        }

        words[i++] = word.toLowerCase();
      }
    }

    Arrays.sort(words, String::compareTo);
    Utilities.TimedExecution.getInstance()
        .callWithTimeout(
            1,
            TimeUnit.SECONDS,
            () -> {
              Assert.assertTrue(english.isSorted(words));
              return null;
            });
  }
}
