package edu.berkeley.cs.app.finalproject;

import edu.berkeley.cs.util.HashMap;
import edu.berkeley.cs.util.LinkedList;
import edu.berkeley.cs.util.Utilities;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class HotKeyGenerator_T {
  private HotKeyGenerator hotKeyGenerator;

  @Before
  public void setup() {
    hotKeyGenerator = new HotKeyGenerator();
  }

  @Test
  public void testEmptyActions() {
    LinkedList<String> actions = new LinkedList<>();
    HashMap<Character, String> result = hotKeyGenerator.generateHotKeys(actions);
    Assert.assertTrue(result.isEmpty());
  }

  @Test
  public void testSingleAction() {
    LinkedList<String> actions = new LinkedList<>();
    actions.insertFront("down");

    HashMap<Character, String> result = hotKeyGenerator.generateHotKeys(actions);
    Assert.assertTrue(result.contains('d'));
    Assert.assertEquals("down", result.get('d'));
  }

  @Test
  public void testMultipleActionsNoConflict() {
    LinkedList<String> actions = new LinkedList<>();
    actions.insertFront("up");
    actions.insertFront("down");

    HashMap<Character, String> result = hotKeyGenerator.generateHotKeys(actions);
    Assert.assertEquals("up", result.get('u'));
    Assert.assertEquals("down", result.get('d'));
  }

  @Test
  public void testConflict() {
    LinkedList<String> actions = new LinkedList<>();
    actions.insertFront("up");
    actions.insertFront("up");

    HashMap<Character, String> result = hotKeyGenerator.generateHotKeys(actions);
    Assert.assertEquals("up", result.get('p'));
    Assert.assertEquals("up", result.get('u'));
  }

  @Test
  public void testNoSolutionSimple() {
    LinkedList<String> actions = new LinkedList<>();
    actions.insertFront("a");
    actions.insertFront("a");

    HashMap<Character, String> result = hotKeyGenerator.generateHotKeys(actions);
    Assert.assertTrue(result.isEmpty());
  }

  @Test
  public void testNoSolutionComplex() {
    LinkedList<String> actions = new LinkedList<>();
    actions.insertFront("a");
    actions.insertFront("b");
    actions.insertFront("ab");
    actions.insertFront("def");

    HashMap<Character, String> result = hotKeyGenerator.generateHotKeys(actions);
    Assert.assertTrue(result.isEmpty());
  }

  @Test
  public void testExhaustive() {
    LinkedList<String> actions = new LinkedList<>();
    actions.insertFront("forward");
    actions.insertFront("backward");
    actions.insertFront("left");
    actions.insertFront("right");
    actions.insertFront("fly");
    actions.insertFront("flyr");

    int size = actions.size();
    HashMap<Character, String> result = hotKeyGenerator.generateHotKeys(actions);
    Assert.assertEquals(size, result.size());
  }

  @Test
  public void testPerformance() throws InterruptedException, ExecutionException, TimeoutException {
    StringBuilder sb = new StringBuilder();
    int numActions = 12;

    LinkedList<String> actions = new LinkedList<>();
    for (int i = 0; i < numActions; i++) {
      sb.append((char) ('a' + i));
      actions.insertFront(sb.toString());
    }

    Utilities.TimedExecution.getInstance()
        .callWithTimeout(
            3,
            TimeUnit.SECONDS,
            () -> {
              HashMap<Character, String> result = hotKeyGenerator.generateHotKeys(actions);
              Assert.assertEquals(numActions, result.size());
              return null;
            });
  }
}
