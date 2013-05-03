package week2

object MoreFunWithRationals {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(76); 

  val x2 = new Rational2(1, 3);System.out.println("""x2  : week2.Rational2 = """ + $show(x2 ));$skip(12); val res$0 = 

  x2.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(11); val res$1 = 
  x2.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(32); 

  val y2 = new Rational2(5, 7);System.out.println("""y2  : week2.Rational2 = """ + $show(y2 ));$skip(14); val res$2 = 

  x2.add(y2);System.out.println("""res2: week2.Rational2 = """ + $show(res$2));$skip(32); 

  val z2 = new Rational2(3, 2);System.out.println("""z2  : week2.Rational2 = """ + $show(z2 ));$skip(22); val res$3 = 

  x2.sub(y2).sub(z2);System.out.println("""res3: week2.Rational2 = """ + $show(res$3));$skip(14); val res$4 = 

  y2.add(y2);System.out.println("""res4: week2.Rational2 = """ + $show(res$4));$skip(15); val res$5 = 

  x2.less(y2);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(14); val res$6 = 

  x2.max(y2);System.out.println("""res6: week2.Rational2 = """ + $show(res$6));$skip(20); val res$7 = 

  new Rational2(2);System.out.println("""res7: week2.Rational2 = """ + $show(res$7))}
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
