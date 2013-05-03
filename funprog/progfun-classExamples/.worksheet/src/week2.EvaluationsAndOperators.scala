package week2

object EvaluationsAndOperators {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 
  val x2 = new Rational3(1, 3);System.out.println("""x2  : week2.Rational3 = """ + $show(x2 ));$skip(12); val res$0 = 

  x2.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(11); val res$1 = 
  x2.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(32); 

  val y2 = new Rational3(5, 7);System.out.println("""y2  : week2.Rational3 = """ + $show(y2 ));$skip(11); val res$2 = 

  x2 + y2;System.out.println("""res2: week2.Rational3 = """ + $show(res$2));$skip(32); 

  val z2 = new Rational3(3, 2);System.out.println("""z2  : week2.Rational3 = """ + $show(z2 ));$skip(16); val res$3 = 

  x2 - y2 - z2;System.out.println("""res3: week2.Rational3 = """ + $show(res$3));$skip(11); val res$4 = 

  y2 + y2;System.out.println("""res4: week2.Rational3 = """ + $show(res$4));$skip(11); val res$5 = 

  x2 < y2;System.out.println("""res5: Boolean = """ + $show(res$5));$skip(13); val res$6 = 

  x2 max y2;System.out.println("""res6: week2.Rational3 = """ + $show(res$6));$skip(20); val res$7 = 

  new Rational3(2);System.out.println("""res7: week2.Rational3 = """ + $show(res$7))}
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
