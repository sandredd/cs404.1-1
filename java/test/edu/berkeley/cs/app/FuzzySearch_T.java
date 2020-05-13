package edu.berkeley.cs.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FuzzySearch_T {
    private FuzzySearch fuzzySearch;

    @Before
    public void setup() {
        fuzzySearch = new FuzzySearch();
    }

    @Test
    public void testLongNeedle() {
        Assert.assertEquals(-1, fuzzySearch.indexOf("A", "AAA"));
    }

    @Test
    public void testNeedleNotFound() {
        Assert.assertEquals(-1, fuzzySearch.indexOf("ACTGGTCA", "TGAT"));
    }

    @Test
    public void testSingleCharacter() {
        Assert.assertEquals(0, fuzzySearch.indexOf("A", "A"));
    }

    @Test
    public void testSingleWildcard() {
        Assert.assertEquals(0, fuzzySearch.indexOf(".", "A"));
        Assert.assertEquals(0, fuzzySearch.indexOf(".", "T"));
        Assert.assertEquals(0, fuzzySearch.indexOf(".", "C"));
        Assert.assertEquals(0, fuzzySearch.indexOf(".", "G"));
    }
}
