package edu.berkeley.cs.app.scheduling;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class ShortestJobFirstScheduler_T {
  @Test
  public void testSimulation() {
    int n = 100;
    ShortestJobFirstScheduler scheduler = new ShortestJobFirstScheduler(n);

    int[] timeTaken = new int[n];
    int[] timeLeft = new int[n];

    {
      int i = 0;
      for (Job job : scheduler.jobs) {
        timeLeft[i++] = job.timeLeft();
      }
    }

    for (int i = 0; i < n; i++) {
      int shortest = 0;
      boolean foundShortest = false;
      for (int j = 0; j < n; j++) {
        if (timeLeft[j] == 0) {
          continue;
        }

        if (!foundShortest || timeLeft[j] < timeLeft[shortest]) {
          shortest = j;
          foundShortest = true;
        }
      }

      timeTaken[shortest] += timeLeft[shortest];
      for (int j = 0; j < n; j++) {
        if (shortest == j || timeLeft[j] == 0) {
          continue;
        }

        timeTaken[j] += timeLeft[shortest];
      }

      timeLeft[shortest] = 0;
    }

    Assert.assertEquals(Arrays.stream(timeTaken).sum(), scheduler.simulate());
  }
}
