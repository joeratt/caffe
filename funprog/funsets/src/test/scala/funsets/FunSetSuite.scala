package funsets

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 * This class is a test suite for the methods in object FunSets. To run
 * the test suite, you can either:
 *  - run the "test" command in the SBT console
 *  - right-click the file in eclipse and chose "Run As" - "JUnit Test"
 */
@RunWith(classOf[JUnitRunner])
class FunSetSuite extends FunSuite {

  /**
   * Link to the scaladoc - very clear and detailed tutorial of FunSuite
   *
   * http://doc.scalatest.org/1.9.1/index.html#org.scalatest.FunSuite
   *
   * Operators
   *  - test
   *  - ignore
   *  - pending
   */

  /**
   * Tests are written using the "test" operator and the "assert" method.
   */
  test("string take") {
    val message = "hello, world"
    assert(message.take(5) == "hello")
  }

  /**
   * For ScalaTest tests, there exists a special equality operator "===" that
   * can be used inside "assert". If the assertion fails, the two values will
   * be printed in the error message. Otherwise, when using "==", the test
   * error message will only say "assertion failed", without showing the values.
   *
   * Try it out! Change the values so that the assertion fails, and look at the
   * error message.
   */
  test("adding ints") {
    assert(1 + 2 === 3)
  }

  import FunSets._

  test("contains is implemented") {
    assert(contains(x => true, 100))
  }

  /**
   * When writing tests, one would often like to re-use certain values for multiple
   * tests. For instance, we would like to create an Int-set and have multiple test
   * about it.
   *
   * Instead of copy-pasting the code for creating the set into every test, we can
   * store it in the test class using a val:
   *
   *   val s1 = singletonSet(1)
   *
   * However, what happens if the method "singletonSet" has a bug and crashes? Then
   * the test methods are not even executed, because creating an instance of the
   * test class fails!
   *
   * Therefore, we put the shared values into a separate trait (traits are like
   * abstract classes), and create an instance inside each test method.
   *
   */

  trait TestSets {
    val s1 = singletonSet(1)
    val s2 = singletonSet(2)
    val s3 = singletonSet(3)
  }

  /**
   * This test is currently disabled (by using "ignore") because the method
   * "singletonSet" is not yet implemented and the test would fail.
   *
   * Once you finish your implementation of "singletonSet", exchange the
   * function "ignore" by "test".
   */
  test("singletonSet(1) contains 1") {

    /**
     * We create a new instance of the "TestSets" trait, this gives us access
     * to the values "s1" to "s3".
     */
    new TestSets {
      /**
       * The string argument of "assert" is a message that is printed in case
       * the test fails. This helps identifying which assertion failed.
       */
      assert(contains(s1, 1), "Singleton")
    }
  }

  test("union contains all elements") {
    1
    new TestSets {
      val s = union(s1, s2)
      assert(contains(s, 1), "Union 1")
      assert(contains(s, 2), "Union 2")
      assert(!contains(s, 3), "Union 3")
    }
  }

  test("intersect contains overlapping elements") {
    new TestSets {
      val s = intersect(s1, s1)
      val sEmpty = intersect(s1, s2)
      assert(contains(s, 1), "Intersect 1")
      assert(!contains(sEmpty, 1), "Intersect 2")
      assert(!contains(sEmpty, 2), "Intersect 3")
    }
  }

  test("diff contains elements in s not in t") {
    new TestSets {
      val s = diff(s1, s2)
      val sEmpty = diff(s1, s1)
      assert(contains(s, 1), "diff 1")
      assert(!contains(s, 2), "diff 2")
      assert(!contains(sEmpty, 1), "diff 3")
    }
  }

  test("filter should be true only if matches method") {
    new TestSets {
      def p(x: Int): Boolean = x % 2 == 0
      val s = filter(s2, p)
      val sEmpty = diff(s1, s1)
      assert(contains(s, 2), "filter 1")
      assert(!contains(sEmpty, 1), "filter 2")
    }
  }
  
  test("exits"){
    new TestSets {
      def s: Set = x=> (x ==1 || x == 3 || x == 4 || x == 5 || x == 7 || x == 999)
      def p(x: Int): Boolean = x % 2 == 0
      assert(exists(s, p))
    }
  }
  
  test("map thingy") {
    new TestSets {
      def s: Set = x=> (x ==1 || x == 3 || x == 4 || x == 5 || x == 7 || x == 1000)
      def sTest: Set = x=> (x ==0 || x == 2 || x == 3 || x == 4 || x == 6 || x == 999)
      def f(x: Int): Int = x-1 
      val thing = map(s, f)
      printSet(thing)
      printSet(sTest)
//      toString2(s)
      assert(FunSets.toString(sTest)===FunSets.toString(thing))
    }
  }
  
  test("map thingy 2") {
    new TestSets {
      def s: Set = x=> (x ==1 || x == 3 || x == 4 || x == 5 || x == 7 || x == 1000)
      def sTest: Set = x=> (x ==1 || x == 9 || x == 16 || x == 25 || x == 49 || x == (999*999))
      def f(x: Int): Int = x*x 
      val thing = map(s, f)
      printSet(thing)
      printSet(sTest)
//      toString2(s)
      assert(FunSets.toString(sTest)===FunSets.toString(thing))
    }
  }
}
