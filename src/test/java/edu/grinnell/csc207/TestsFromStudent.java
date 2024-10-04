package edu.grinnell.csc207;

import edu.grinnell.csc207.util.AssociativeArray;
import edu.grinnell.csc207.util.NullKeyException;
import edu.grinnell.csc207.util.KeyNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

/**
 * A place for you to put your own tests (beyond the shared repo).
 *
 * @author Mina Bakrac
 */
public class TestsFromStudent {
  /**
   * A simple test.
   */
  @Test
  public void alwaysPass() throws Exception {
  } // alwaysPass()

  /**
   * Get the value of a key set once.
   */
  @Test
  public void bakracMinaTest1() throws Exception {
  AssociativeArray<Integer, Integer> square = new AssociativeArray<Integer, Integer>();
  square.set(2, 4);
  square.set(3,8);
  square.set(4,16);
  assertEquals(8, square.get(3), "Value 3 is set to 8");
  } // bakracMinaTest1()

  /**
   * Get the value of a key set and then set again to a new value.
   */
  @Test
  public void bakracMinaTest2() throws Exception {
    AssociativeArray<Integer, Integer> square = new AssociativeArray<Integer, Integer>();
    square.set(2, 4);
    square.set(2,8);
    square.set(4,16);
    assertEquals(8, square.get(2), "Get the most recent value when key set to two values"); 
  } // bakracMinaTest2()

  /**
   * Get the value of a key set to null.
   */
  @Test
  public void bakracMinaEdge1() throws Exception {
    AssociativeArray<Integer, Integer> square = new AssociativeArray<Integer, Integer>();
    square.set(2, null);
    assertEquals(null, square.get(2), "Return null when get value is null");
  } // bakracMinaEdge1()
} // class TestsFromSam
