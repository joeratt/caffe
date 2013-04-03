package recfun
import common._
import scala.math._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int =
    {

      def choose(c: Int, r: Int): Int = factorial(r) / (factorial(c) * factorial(r - c))

      def factorial(n: Int): Int =
        if (n == 0) 1 else n * factorial(n - 1)

      choose(c, r)
    }
  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean =
    {
      def iterate(score: Int, chars: List[Char]): Boolean =
        {
          if (score < 0)
            false
          else if (chars.isEmpty)
            score == 0
          else if (chars.head == '(') iterate(score + 1, chars.tail)
          else if (chars.head == ')') iterate(score - 1, chars.tail)
          else iterate(score, chars.tail)

        }

      iterate(0, chars)
    }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = 0
}
