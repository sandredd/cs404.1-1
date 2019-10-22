package edu.berkeley.cs.scheduling;

import edu.berkeley.cs.util.LinkedList;

public class FiFoScheduler implements Scheduler {
  protected LinkedList<Job> jobs = new LinkedList<>();

  public FiFoScheduler(int numJobs) {
    for (int i = 0; i < numJobs; i++) {
      jobs.insertEnd(new Job());
    }
  }

  @Override
  public int simulate() {
    // TODO: complete this function
    return 0;
  }
}
