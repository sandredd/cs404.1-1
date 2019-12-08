package edu.berkeley.cs.app;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PlagiarismDetector_T {
  private PlagiarismDetector pd;

  @Before
  public void setup() {
    pd = new PlagiarismDetector();
    pd.addSearchText(
        "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut "
            + "labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut "
            + "aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum "
            + "dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia "
            + "deserunt mollit anim id est laborum.");
  }

  @Test
  public void testPlagiarized() {
    Assert.assertTrue(pd.isPlagiarized("duis aute irure"));
  }

  @Test
  public void testPlagiarizedAcrossSentences() {
    Assert.assertTrue(pd.isPlagiarized("pariatur. Excepteur sint occaecat"));
    Assert.assertTrue(pd.isPlagiarized("pariatur Excepteur sint occaecat"));
  }

  @Test
  public void testNotPlagiarized() {
    Assert.assertFalse(pd.isPlagiarized("obviously not plagiarized"));
  }
}
