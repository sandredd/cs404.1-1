package edu.berkeley.cs.app.scheduling;

import java.util.Arrays;
import org.junit.Assert;
import org.junit.Test;

public class RoundRobinScheduler_T {
  private boolean allDone(int[] timeLeft) {
    for (int value : timeLeft) {
      if (value != 0) {
        return false;
      }
    }

    return true;
  }

  @Test
  public void testSimulation() {
    int n = 100;
    int timeSlice = 20;
    RoundRobinScheduler scheduler = new RoundRobinScheduler(n, timeSlice);

    int[] timeTaken = new int[n];
    int[] timeLeft = new int[n];

    {
      int i = 0;
      for (Job job : scheduler.jobs) {
        timeLeft[i++] = job.timeLeft();
      }
    }

    while (!allDone(timeLeft)) {
      int i = 0;

      for (Job job : scheduler.jobs) {
        if (timeLeft[i] == 0) {
          i++;
          continue;
        }

        int time = Math.min(timeLeft[i], timeSlice);
        timeLeft[i] -= time;
        timeTaken[i] += time;

        for (int j = 0; j < n; j++) {
          if (i == j) {
            continue;
          }

          if (timeLeft[j] == 0) {
            continue;
          }

          timeTaken[j] += time;
        }

        i++;
      }
    }

    Assert.assertEquals(Arrays.stream(timeTaken).sum(), scheduler.simulate());
  }
}
