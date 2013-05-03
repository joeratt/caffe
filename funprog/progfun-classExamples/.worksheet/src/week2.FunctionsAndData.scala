package week2

object FunctionsAndData {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(70); 

  val x = new Rational(1, 3);System.out.println("""x  : week2.Rational = """ + $show(x ));$skip(11); val res$0 = 

  x.numer;System.out.println("""res0: Int = """ + $show(res$0));$skip(10); val res$1 = 
  x.denom;System.out.println("""res1: Int = """ + $show(res$1));$skip(30); 

  val y = new Rational(5, 7);System.out.println("""y  : week2.Rational = """ + $show(y ));$skip(12); val res$2 = 

  x.add(y);System.out.println("""res2: week2.Rational = """ + $show(res$2));$skip(30); 

  val z = new Rational(3, 2);System.out.println("""z  : week2.Rational = """ + $show(z ));$skip(19); val res$3 = 

  x.sub(y).sub(z);System.out.println("""res3: week2.Rational = """ + $show(res$3))}
}

class Rational(x: Int, y: Int) {
  def numer = x
  def denom = y

  def add(that: Rational) =
    new Rational(
      numer * that.denom + that.numer * denom, denom * that.denom)

  def sub(that: Rational) = add(that.neg)

  def neg = new Rational(-numer, denom)

  override def toString = numer + "/" + denom
}
