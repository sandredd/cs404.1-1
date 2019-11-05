package edu.berkeley.cs.app.scheduling;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class FiFoScheduler_T {
  @Test
  public void testSimulation() {
    int n = 100;
    FiFoScheduler scheduler = new FiFoScheduler(n);

    int[] timeTaken = new int[n];
    int[] timeLeft = new int[n];

    {
      int i = 0;
      for (Job job : scheduler.jobs) {
        timeLeft[i++] = job.timeLeft();
      }
    }

    for (int i = 0; i < n; i++) {
      timeTaken[i] += timeLeft[i];

      for (int j = i + 1; j < n; j++) {
        timeTaken[j] += timeLeft[i];
      }

      timeLeft[i] = 0;
    }

    Assert.assertEquals(Arrays.stream(timeTaken).sum(), scheduler.simulate());
  }
}
