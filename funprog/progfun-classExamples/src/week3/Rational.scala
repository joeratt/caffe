package week3

class Rational(x: Int, y: Int) {
  require(y != 0, "denom must be non-zero")

  def this(x: Int) = this(x, 1)

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
  def numer = x
  def denom = y

  def +(that: Rational): Rational =
    new Rational(
      numer * that.denom + that.numer * denom, denom * that.denom)

  def -(that: Rational): Rational = this + -that

  def unary_- : Rational = new Rational(-numer, denom)

  def <(that: Rational): Boolean = this.numer * that.denom < that.numer * this.denom

  def max(that: Rational) = if (this < that) that else this

  override def toString =
    {
      val g = gcd(x, y)
      numer / g + "/" + denom / g
    }
}