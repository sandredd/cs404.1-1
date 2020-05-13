package edu.berkeley.cs.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SortChecker_T {
    private char[] englishAlphabet = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'x', 'y', 'z'};
    private char[] alienAlphabet = new char[] {'*', '#', '!', '@', '%', '~', '&', '-', '^', '+', '$', '/'};

    private SortChecker english;
    private SortChecker alien;

    @Before
    public void setup() {
        english = new SortChecker(englishAlphabet);
        alien = new SortChecker(alienAlphabet);
    }

    @Test
    public void testSingleElement() {
        Assert.assertTrue(alien.isSorted(new String[] {"*"}));
    }

    @Test
    public void testEnglishSorted() {
        Assert.assertTrue(english.isSorted(new String[] {
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
        Assert.assertFalse(english.isSorted(new String[] {"fearlessness", "apple", "grappling", "churchyards"}));
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
    public void testAlienSubsort() {
        Assert.assertTrue(alien.isSorted(new String[] {"*##", "*#@", "*#~", "*@#", "*&$"}));
        Assert.assertFalse(alien.isSorted(new String[] {"*#@", "*##", "*#~", "*@#", "*&$"}));
    }
}
