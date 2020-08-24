package edu.berkeley.cs.util;

import edu.berkeley.cs.graph.DirectedGraph;
import edu.berkeley.cs.graph.Graph;
import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public class Utilities {
  private static Random random = new Random();

  public static class TimedExecution {
    private ExecutorService executor =
        new ThreadPoolExecutor(5, 32, 1000, TimeUnit.MILLISECONDS, new LinkedBlockingQueue<>());

    private static TimedExecution instance = new TimedExecution();

    private TimedExecution() {}

    public static TimedExecution getInstance() {
      return instance;
    }

    public <T> T callWithTimeout(long timeout, TimeUnit unit, Callable<T> callable)
        throws TimeoutException, InterruptedException, ExecutionException {
      Future<T> future = executor.submit(callable);

      try {
        return future.get(timeout, unit);
      } catch (InterruptedException | TimeoutException | ExecutionException e) {
        future.cancel(true);
        throw e;
      }
    }
  }

  public static String randomString(int length) {
    String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZ" + "abcdefghijklmnopqrstuvxyz" + "0123456789";

    StringBuilder sb = new StringBuilder(length);
    for (int i = 0; i < length; i++) {
      int index = (int) (chars.length() * Math.random());
      sb.append(chars.charAt(index));
    }

    return sb.toString();
  }

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

  private static void addSmallGraphEdges(Graph graph) {
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
  }

  public static Graph smallGraph() {
    Graph graph = new Graph(12);
    addSmallGraphEdges(graph);
    return graph;
  }

  public static DirectedGraph smallDirectedGraph() {
    DirectedGraph graph = new DirectedGraph(12);
    addSmallGraphEdges(graph);
    return graph;
  }

  public static DirectedGraph smallCyclicGraph() {
    DirectedGraph graph = new DirectedGraph(13);

    graph.addEdge(4, 2, 23);
    graph.addEdge(2, 3, 43);
    graph.addEdge(3, 2, 22);
    graph.addEdge(6, 0, 46);
    graph.addEdge(0, 1, 36);
    graph.addEdge(2, 0, 20);
    graph.addEdge(11, 12, 40);
    graph.addEdge(12, 9, 1);
    graph.addEdge(9, 10, 41);
    graph.addEdge(9, 11, 30);
    graph.addEdge(7, 9, 8);
    graph.addEdge(10, 12, 21);
    graph.addEdge(11, 4, 19);
    graph.addEdge(4, 3, 4);
    graph.addEdge(3, 5, 14);
    graph.addEdge(6, 8, 17);
    graph.addEdge(8, 6, 3);
    graph.addEdge(5, 4, 47);
    graph.addEdge(0, 5, 12);
    graph.addEdge(6, 4, 32);
    graph.addEdge(6, 9, 15);
    graph.addEdge(7, 6, 2);

    return graph;
  }

  public static DirectedGraph smallAcyclicGraph() {
    DirectedGraph graph = new DirectedGraph(13);

    graph.addEdge(8, 7, 31);
    graph.addEdge(7, 2, 1);
    graph.addEdge(2, 3, 39);
    graph.addEdge(3, 0, 3);
    graph.addEdge(0, 5, 29);
    graph.addEdge(5, 1, 6);
    graph.addEdge(1, 6, 10);
    graph.addEdge(6, 9, 37);
    graph.addEdge(9, 11, 46);
    graph.addEdge(11, 10, 4);
    graph.addEdge(10, 12, 4);
    graph.addEdge(12, 4, 4);

    graph.addEdge(0, 6, 30);
    graph.addEdge(0, 1, 43);
    graph.addEdge(2, 0, 7);
    graph.addEdge(11, 12, 25);
    graph.addEdge(9, 12, 28);
    graph.addEdge(9, 10, 18);
    graph.addEdge(3, 5, 12);
    graph.addEdge(5, 4, 38);
    graph.addEdge(6, 4, 11);
    graph.addEdge(7, 6, 5);

    return graph;
  }

  public static DirectedGraph smallComponentGraph() {
    DirectedGraph graph = new DirectedGraph(13);

    graph.addEdge(4, 2, 9);
    graph.addEdge(2, 3, 42);
    graph.addEdge(3, 2, 41);
    graph.addEdge(6, 0, 35);
    graph.addEdge(0, 1, 6);
    graph.addEdge(2, 0, 24);
    graph.addEdge(11, 12, 14);
    graph.addEdge(12, 9, 20);
    graph.addEdge(9, 10, 14);
    graph.addEdge(9, 11, 20);
    graph.addEdge(7, 9, 43);
    graph.addEdge(10, 12, 31);
    graph.addEdge(11, 4, 5);
    graph.addEdge(4, 3, 27);
    graph.addEdge(3, 5, 4);
    graph.addEdge(6, 8, 36);
    graph.addEdge(8, 6, 19);
    graph.addEdge(5, 4, 37);
    graph.addEdge(0, 5, 3);
    graph.addEdge(6, 4, 40);
    graph.addEdge(6, 9, 17);
    graph.addEdge(7, 6, 11);

    return graph;
  }

  private static void addLargeGraphEdges(Graph graph) {
    graph.addEdge(0, 1, 149);
    graph.addEdge(0, 2, 186);
    graph.addEdge(0, 6, 116);
    graph.addEdge(0, 9, 11);
    graph.addEdge(1, 4, 110);
    graph.addEdge(1, 5, 124);
    graph.addEdge(1, 6, 1);
    graph.addEdge(2, 9, 115);
    graph.addEdge(2, 3, 165);
    graph.addEdge(2, 12, 153);
    graph.addEdge(2, 10, 130);
    graph.addEdge(3, 9, 148);
    graph.addEdge(3, 12, 150);
    graph.addEdge(3, 14, 114);
    graph.addEdge(3, 21, 40);
    graph.addEdge(3, 8, 5);
    graph.addEdge(4, 5, 26);
    graph.addEdge(4, 7, 13);
    graph.addEdge(4, 16, 79);
    graph.addEdge(5, 6, 183);
    graph.addEdge(5, 8, 163);
    graph.addEdge(5, 7, 55);
    graph.addEdge(6, 8, 173);
    graph.addEdge(6, 9, 21);
    graph.addEdge(10, 12, 181);
    graph.addEdge(10, 13, 19);
    graph.addEdge(11, 47, 132);
    graph.addEdge(11, 43, 48);
    graph.addEdge(11, 45, 44);
    graph.addEdge(11, 48, 185);
    graph.addEdge(12, 14, 164);
    graph.addEdge(12, 15, 89);
    graph.addEdge(13, 15, 80);
    graph.addEdge(13, 20, 86);
    graph.addEdge(14, 15, 112);
    graph.addEdge(14, 20, 109);
    graph.addEdge(14, 19, 143);
    graph.addEdge(14, 21, 178);
    graph.addEdge(15, 20, 168);
    graph.addEdge(16, 17, 93);
    graph.addEdge(16, 22, 158);
    graph.addEdge(16, 27, 65);
    graph.addEdge(17, 32, 166);
    graph.addEdge(17, 23, 17);
    graph.addEdge(17, 28, 53);
    graph.addEdge(17, 22, 193);
    graph.addEdge(18, 32, 45);
    graph.addEdge(18, 21, 146);
    graph.addEdge(18, 24, 123);
    graph.addEdge(18, 29, 189);
    graph.addEdge(18, 23, 49);
    graph.addEdge(19, 20, 41);
    graph.addEdge(19, 26, 180);
    graph.addEdge(19, 25, 22);
    graph.addEdge(19, 24, 37);
    graph.addEdge(19, 21, 25);
    graph.addEdge(20, 26, 141);
    graph.addEdge(21, 24, 179);
    graph.addEdge(21, 32, 81);
    graph.addEdge(22, 28, 128);
    graph.addEdge(22, 27, 199);
    graph.addEdge(23, 32, 127);
    graph.addEdge(23, 29, 38);
    graph.addEdge(23, 28, 144);
    graph.addEdge(24, 25, 30);
    graph.addEdge(24, 29, 71);
    graph.addEdge(25, 26, 33);
    graph.addEdge(25, 31, 133);
    graph.addEdge(25, 37, 108);
    graph.addEdge(25, 30, 151);
    graph.addEdge(26, 31, 175);
    graph.addEdge(26, 38, 36);
    graph.addEdge(27, 28, 32);
    graph.addEdge(27, 34, 87);
    graph.addEdge(27, 42, 46);
    graph.addEdge(28, 29, 152);
    graph.addEdge(28, 34, 70);
    graph.addEdge(28, 35, 125);
    graph.addEdge(29, 30, 124);
    graph.addEdge(29, 36, 182);
    graph.addEdge(29, 35, 101);
    graph.addEdge(30, 37, 140);
    graph.addEdge(30, 36, 84);
    graph.addEdge(31, 38, 3);
    graph.addEdge(31, 37, 27);
    graph.addEdge(33, 37, 134);
    graph.addEdge(33, 38, 120);
    graph.addEdge(33, 49, 42);
    graph.addEdge(33, 46, 188);
    graph.addEdge(33, 39, 92);
    graph.addEdge(34, 35, 20);
    graph.addEdge(34, 41, 113);
    graph.addEdge(34, 43, 129);
    graph.addEdge(34, 42, 62);
    graph.addEdge(35, 36, 190);
    graph.addEdge(35, 40, 57);
    graph.addEdge(35, 41, 138);
    graph.addEdge(36, 37, 16);
    graph.addEdge(36, 39, 4);
    graph.addEdge(36, 40, 192);
    graph.addEdge(37, 38, 10);
    graph.addEdge(37, 39, 12);
    graph.addEdge(38, 49, 184);
    graph.addEdge(39, 46, 102);
    graph.addEdge(39, 40, 14);
    graph.addEdge(40, 46, 169);
    graph.addEdge(40, 45, 50);
    graph.addEdge(40, 41, 18);
    graph.addEdge(41, 45, 159);
    graph.addEdge(41, 43, 43);
    graph.addEdge(42, 43, 82);
    graph.addEdge(42, 44, 161);
    graph.addEdge(42, 47, 98);
    graph.addEdge(43, 45, 91);
    graph.addEdge(43, 47, 24);
    graph.addEdge(44, 47, 8);
    graph.addEdge(45, 46, 64);
    graph.addEdge(45, 48, 198);
    graph.addEdge(46, 49, 68);
    graph.addEdge(46, 48, 58);
    graph.addEdge(48, 49, 61);
  }

  public static Graph largeGraph() {
    Graph graph = new Graph(50);
    addLargeGraphEdges(graph);
    return graph;
  }

  public static DirectedGraph largeDirectedGraph() {
    DirectedGraph graph = new DirectedGraph(50);
    addLargeGraphEdges(graph);
    return graph;
  }

  private static boolean arrayContains(int[] haystack, int needle) {
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
      if (arrayContains(vertices, i)) {
        continue;
      }

      inverse[used] = i;
      used++;
    }

    return inverse;
  }
}
