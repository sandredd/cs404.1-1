package edu.berkeley.cs.app.scheduling;

import java.util.Objects;
import java.util.Random;

public class Job implements Comparable<Job> {
  private int timeLeft;
  private int processingTime;
  private int waitingTime;

  public Job() {
    Random random = new Random();
    this.timeLeft = random.nextInt(100) + 1;
  }

  public int timeLeft() {
    return timeLeft;
  }

  public boolean isDone() {
    return timeLeft == 0;
  }

  public int turnaroundTime() {
    return processingTime + waitingTime;
  }

  public void addWaitingTime(int time) {
    waitingTime += time;
  }

  public void process(int timeSlot) {
    int timeTaken = Math.min(timeSlot, timeLeft);
    processingTime += timeTaken;
    timeLeft -= timeTaken;
  }

  @Override
  public int compareTo(Job job) {
    return this.timeLeft - job.timeLeft;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof Job)) {
      return false;
    }

    Job job = (Job) o;
    if (this.timeLeft != job.timeLeft) {
      return false;
    }

    if (this.processingTime != job.processingTime) {
      return false;
    }

    if (this.waitingTime != job.waitingTime) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    return Objects.hash(timeLeft, processingTime, waitingTime);
  }
}
