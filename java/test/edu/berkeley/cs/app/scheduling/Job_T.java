package edu.berkeley.cs.app.scheduling;

import org.junit.Assert;
import org.junit.Test;

public class Job_T {
  @Test
  public void testTurnaroundTime() {
    Job job = new Job();

    int timeLeft = job.timeLeft();
    job.process(timeLeft);
    job.addWaitingTime(30);

    Assert.assertEquals(timeLeft + 30, job.turnaroundTime());
  }

  @Test
  public void testProcess() {
    Job job = new Job();
    int timeLeft = job.timeLeft();

    int timeSlotA = 1;
    job.process(timeSlotA);
    Assert.assertEquals(timeSlotA, job.turnaroundTime());
    Assert.assertEquals(timeLeft - timeSlotA, job.timeLeft());

    int timeSlotB = 180;
    job.process(timeSlotB);
    Assert.assertEquals(timeLeft, job.turnaroundTime());
    Assert.assertTrue(job.isDone());
  }
}
