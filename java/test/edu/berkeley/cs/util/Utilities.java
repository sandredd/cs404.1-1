package edu.berkeley.cs.util;

import edu.berkeley.cs.graph.Graph;
import java.util.Random;

public class Utilities {
  private static Random random = new Random();

  public static Integer[] generateRandomArray(int size) {
    Integer[] array = new Integer[size];

    for (int i = 0; i < array.length; i++) {
      array[i] = random.nextInt((int) Math.pow(size, 2));
    }

    return array;
  }

  public static boolean isSorted(Comparable[] input, int low, int high) {
    for (int i = low + 1; i < high; i++) {
      if (input[i - 1].compareTo(input[i]) > 0) {
        return false;
      }
    }

    return true;
  }

  public static Graph smallGraph() {
    Graph graph = new Graph(12);

    graph.addEdge(0, 6, 20);
    graph.addEdge(0, 2, 12);
    graph.addEdge(0, 1, 14);
    graph.addEdge(0, 5, 8);
    graph.addEdge(3, 5, 2);
    graph.addEdge(3, 4, 4);
    graph.addEdge(4, 5, 7);
    graph.addEdge(4, 6, 13);
    graph.addEdge(7, 8, 17);
    graph.addEdge(9, 10, 19);
    graph.addEdge(9, 11, 11);

    return graph;
  }

  private static boolean arrayContains(int needle, int[] haystack) {
    for (int value : haystack) {
      if (value == needle) {
        return true;
      }
    }

    return false;
  }

  public static int[] vertexInverse(Graph graph, int[] vertices) {
    int[] inverse = new int[graph.numVertices() - vertices.length];
    int used = 0;

    for (int i = 0; i < graph.numVertices(); i++) {
      if (arrayContains(i, vertices)) {
        continue;
      }

      inverse[used] = i;
      used++;
    }

    return inverse;
  }
}
