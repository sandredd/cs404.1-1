package edu.berkeley.cs.app;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorExtraCredit_T {
  private float epsilon = 0.01f;

  @Test
  public void testParenthesis() {
    Assert.assertEquals(-4, Calculator.evaluate("( 2 - 3 ) * 4"), epsilon);
    Assert.assertEquals(-4, Calculator.evaluate("( ( 2 - 3 ) ) * 4"), epsilon);
    Assert.assertEquals(4, Calculator.evaluate("2 * ( 3 - 1 )"), epsilon);
  }

  @Test(expected = RuntimeException.class)
  public void testMismatchedParenthesisLeft() {
    Calculator.evaluate("( ( 3 - 2 ) * 4");
  }

  @Test(expected = RuntimeException.class)
  public void testMismatchedParenthesisRight() {
    Calculator.evaluate("( 3 - 2 ) * 4)");
  }
}
