package edu.berkeley.cs.app.scheduling;

import edu.berkeley.cs.util.Queue;

public class FiFoScheduler implements Scheduler {
  protected Queue<Job> jobs = new Queue<>();

  public FiFoScheduler(int numJobs) {
    for (int i = 0; i < numJobs; i++) {
      jobs.enqueue(new Job());
    }
  }

  @Override
  public int simulate() {
    // TODO: complete this function
    return 0;
  }
}
