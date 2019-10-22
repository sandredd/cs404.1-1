package edu.berkeley.cs.scheduling;

import edu.berkeley.cs.util.MinHeap;

public class ShortestJobFirstScheduler implements Scheduler {
  protected MinHeap<Job> jobs;

  public ShortestJobFirstScheduler(int numJobs) {
    jobs = new MinHeap<>();

    for (int i = 0; i < numJobs; i++) {
      jobs.insert(new Job());
    }
  }

  public int simulate() {
    // TODO: complete this function
    return 0;
  }
}
