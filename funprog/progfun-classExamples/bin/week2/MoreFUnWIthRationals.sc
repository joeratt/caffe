package week2

object MoreFunWithRationals {

  val x2 = new Rational2(1, 3)                    //> x2  : week2.Rational2 = 1/3

  x2.numer                                        //> res0: Int = 1
  x2.denom                                        //> res1: Int = 3

  val y2 = new Rational2(5, 7)                    //> y2  : week2.Rational2 = 5/7

  x2.add(y2)                                      //> res2: week2.Rational2 = 22/21

  val z2 = new Rational2(3, 2)                    //> z2  : week2.Rational2 = 3/2

  x2.sub(y2).sub(z2)                              //> res3: week2.Rational2 = -79/42

  y2.add(y2)                                      //> res4: week2.Rational2 = 10/7

  x2.less(y2)                                     //> res5: Boolean = true

  x2.max(y2)                                      //> res6: week2.Rational2 = 5/7

  new Rational2(2)                                //> res7: week2.Rational2 = 2/1
}

class Rational2(x: Int, y: Int) {
  require(y != 0, "denom must be non-zero")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  def numer = x
  def denom = y

  def add(that: Rational2): Rational2 =
    new Rational2(
      numer * that.denom + that.numer * denom, denom * that.denom)

  def sub(that: Rational2): Rational2 = add(that.neg)

  def neg: Rational2 = new Rational2(-numer, denom)

  def less(that: Rational2): Boolean = this.numer * that.denom < that.numer * this.denom

  def max(that: Rational2) = if (this.less(that)) that else this

  override def toString =
    {
      val g = gcd(x, y)
      numer / g + "/" + denom / g
    }
}