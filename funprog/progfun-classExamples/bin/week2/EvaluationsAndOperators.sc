package week2

object EvaluationsAndOperators {
  val x2 = new Rational3(1, 3)                    //> x2  : week2.Rational3 = 1/3

  x2.numer                                        //> res0: Int = 1
  x2.denom                                        //> res1: Int = 3

  val y2 = new Rational3(5, 7)                    //> y2  : week2.Rational3 = 5/7

  x2 + y2                                         //> res2: week2.Rational3 = 22/21

  val z2 = new Rational3(3, 2)                    //> z2  : week2.Rational3 = 3/2

  x2 - y2 - z2                                    //> res3: week2.Rational3 = -79/42

  y2 + y2                                         //> res4: week2.Rational3 = 10/7

  x2 < y2                                         //> res5: Boolean = true

  x2 max y2                                       //> res6: week2.Rational3 = 5/7

  new Rational3(2)                                //> res7: week2.Rational3 = 2/1
}
// infix operators

class Rational3(x: Int, y: Int) {
  require(y != 0, "denom must be non-zero")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  def numer = x
  def denom = y

  def +(that: Rational3): Rational3 =
    new Rational3(
      numer * that.denom + that.numer * denom, denom * that.denom)

  def -(that: Rational3): Rational3 = this + -that

  def unary_- : Rational3 = new Rational3(-numer, denom)

  def <(that: Rational3): Boolean = this.numer * that.denom < that.numer * this.denom

  def max(that: Rational3) = if (this < that) that else this

  override def toString =
    {
      val g = gcd(x, y)
      numer / g + "/" + denom / g
    }
}