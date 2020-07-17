package edu.berkeley.cs.app.scheduling;

import edu.berkeley.cs.util.MinHeap;

public class ShortestJobFirstScheduler implements Scheduler {
  protected MinHeap<Job> jobs;

  public ShortestJobFirstScheduler(int numJobs) {
    jobs = new MinHeap<>();

    for (int i = 0; i < numJobs; i++) {
      jobs.insert(new Job());
    }
  }

  /**
   * Determine the time units required to run the shortest job first scheduling algorithm. In this
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
