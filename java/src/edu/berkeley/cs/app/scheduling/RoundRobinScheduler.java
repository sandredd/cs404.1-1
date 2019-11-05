package edu.berkeley.cs.app.scheduling;

import edu.berkeley.cs.util.Queue;

public class RoundRobinScheduler implements Scheduler {
  protected Queue<Job> jobs = new Queue<>();
  private int timeSlice = 0;

  public RoundRobinScheduler(int numJobs, int timeSlice) {
    this.timeSlice = timeSlice;

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
