package edu.berkeley.cs.app.finalproject;

import edu.berkeley.cs.util.HashSet;
import edu.berkeley.cs.util.LinkedList;
import edu.berkeley.cs.util.Utilities;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DuplicateUsernames_T {
  DuplicateUsernames duplicateUsernames;

  @Before
  public void setup() {
    duplicateUsernames = new DuplicateUsernames();
  }

  @Test
  public void testEmptyList() {
    LinkedList<HashSet<String>> groups = new LinkedList<>();
    Assert.assertEquals(0, duplicateUsernames.uniqueUsers(groups));
  }

  @Test
  public void testEmptySet() {
    LinkedList<HashSet<String>> groups = new LinkedList<>();
    HashSet<String> a = new HashSet<>();
    Assert.assertEquals(0, duplicateUsernames.uniqueUsers(groups));
  }

  @Test
  public void testSingleUser() {
    LinkedList<HashSet<String>> groups = new LinkedList<>();

    HashSet<String> a = new HashSet<>();
    a.add("poescanger");
    a.add("loundssabbage");
    a.add("fumbcawn");
    groups.insertFront(a);

    Assert.assertEquals(1, duplicateUsernames.uniqueUsers(groups));
  }

  @Test
  public void testNoOverlap() {
    LinkedList<HashSet<String>> groups = new LinkedList<>();

    HashSet<String> a = new HashSet<>();
    a.add("reansfee");
    a.add("groondaily");
    a.add("bapesjump");
    groups.insertFront(a);

    HashSet<String> b = new HashSet<>();
    b.add("spintedhiny");
    b.add("cringlingchingy");
    b.add("soastdrilk");
    groups.insertFront(b);

    Assert.assertEquals(2, duplicateUsernames.uniqueUsers(groups));
  }

  @Test
  public void testOverlap() {
    LinkedList<HashSet<String>> groups = new LinkedList<>();

    HashSet<String> a = new HashSet<>();
    a.add("poescanger");
    a.add("loundssabbage");
    a.add("fumbcawn");
    groups.insertFront(a);

    HashSet<String> b = new HashSet<>();
    b.add("poescanger");
    b.add("stointyfiff");
    b.add("sleaselhumbing");
    groups.insertFront(b);

    HashSet<String> c = new HashSet<>();
    c.add("sleaselhumbing");
    c.add("dondwarkened");
    c.add("trallfoft");
    groups.insertFront(c);

    HashSet<String> d = new HashSet<>();
    d.add("spintedhiny");
    d.add("cringlingchingy");
    d.add("soastdrilk");
    groups.insertFront(d);

    HashSet<String> e = new HashSet<>();
    e.add("crokecrawn");
    e.add("brustygewing");
    e.add("bainedmobal");
    groups.insertFront(e);

    HashSet<String> f = new HashSet<>();
    f.add("brustygewing");
    f.add("flandsmancers");
    f.add("snizzardsmoy");
    groups.insertFront(f);

    Assert.assertEquals(3, duplicateUsernames.uniqueUsers(groups));
  }

  @Test
  public void testPerformance() throws InterruptedException, ExecutionException, TimeoutException {
    String username = "foobar";

    LinkedList<HashSet<String>> groups = new LinkedList<>();
    for (int i = 0; i < 100000; i++) {
      HashSet<String> set = new HashSet<>();
      set.add(Utilities.randomString(10));
      set.add(username);
      groups.insertFront(set);
    }

    Utilities.TimedExecution.getInstance()
        .callWithTimeout(
            3,
            TimeUnit.SECONDS,
            () -> {
              Assert.assertEquals(1, duplicateUsernames.uniqueUsers(groups));
              return null;
            });
  }
}
