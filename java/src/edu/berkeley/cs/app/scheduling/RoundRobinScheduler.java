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

  /**
   * Determine the time units required to run the round robin scheduling algorithm. In this
   * algorithm, jobs are given up to timeSlice time units to process before they are switched out,
   * returned to the end of the jobs queue, and the next job is allowed to run.
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
