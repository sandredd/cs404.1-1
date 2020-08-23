package edu.berkeley.cs.graph;

import java.util.Objects;

public class Edge implements Comparable<Edge> {
  private final int from;
  private final int to;
  private final float weight;

  public Edge(int from, int to, float weight) {
    if (from < 0 || to < 0) {
      throw new IllegalArgumentException("Vertex names must be nonnegative integers");
    }

    if (Double.isNaN(weight)) {
      throw new IllegalArgumentException("Weight is NaN");
    }

    this.from = from;
    this.to = to;
    this.weight = weight;
  }

  public int from() {
    return from;
  }

  public int to() {
    return to;
  }

  public float weight() {
    return weight;
  }

  public Edge reverse() {
    return new Edge(to, from, weight);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, to);
  }

  @Override
  public boolean equals(Object obj) {
    if (!(obj instanceof Edge)) {
      return false;
    }

    Edge other = (Edge) obj;
    if (this.from != other.from) {
      return false;
    }

    if (this.to != other.to) {
      return false;
    }

    if (Math.abs(this.weight - other.weight) > 0.0001) {
      return false;
    }

    return true;
  }

  @Override
  public int compareTo(Edge edge) {
    return Float.compare(this.weight(), edge.weight());
  }

  @Override
  public String toString() {
    return String.format("%d -- %d", from, to);
  }
}
