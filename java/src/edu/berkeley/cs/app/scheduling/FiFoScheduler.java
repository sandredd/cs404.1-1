package edu.berkeley.cs.app.scheduling;

import edu.berkeley.cs.util.Queue;

public class FiFoScheduler implements Scheduler {
  protected Queue<Job> jobs = new Queue<>();

  public FiFoScheduler(int numJobs) {
    for (int i = 0; i < numJobs; i++) {
      jobs.enqueue(new Job());
    }
  }

  /**
   * Determine the time units required to run the first in, first out scheduling algorithm. In this
   * algorithm, jobs are given an unlimited amount of time to process (e.g. use Integer.MAX_VALUE).
   *
   * <p>Remember to add the time a given job took to those jobs still waiting in the queue in order
   * to simulate them waiting for processor time.
   */
  @Override
  public int simulate() {
    // TODO: complete this function
    return 0;
  }
}
