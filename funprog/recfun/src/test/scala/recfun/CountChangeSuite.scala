package recfun

import org.scalatest.FunSuite

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CountChangeSuite extends FunSuite {
  import Main.countChange
  test("countChange: example given in instructions") {
    assert(countChange(4,List(1,2)) === 3)
  }

  test("countChange: sorted CHF") {
    assert(countChange(300,List(5,10,20,50,100,200,500)) === 1022)
  }

  test("countChange: no pennies") {
    assert(countChange(301,List(5,10,20,50,100,200,500)) === 0)
  }

  test("countChange: unsorted CHF") {
    assert(countChange(300,List(500,5,50,100,20,200,10)) === 1022)
  }
  
  test("countChange: money=5, coins=[10]") {
    assert(countChange(5,List(10)) === 0)
  }

test("countChange: money=1, coins=[1]") {
    assert(countChange(1,List(1)) === 1)
  }

test("countChange: money=-10, coins=[5]") {
    assert(countChange(-10,List(5)) === 0)
  }

test("countChange: money=0, coins=[0]") {
    assert(countChange(0,List(0)) === 1)
  }
}
