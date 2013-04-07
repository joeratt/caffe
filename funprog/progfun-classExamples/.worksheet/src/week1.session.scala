package week1

object session {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(75); 
  println("Welcome to the Scala worksheet");$skip(8); val res$0 = 
  1 + 3;System.out.println("""res0: Int(4) = """ + $show(res$0));$skip(53); 
  def abs2(x: Double): Double = if (x < 0) -x else x;System.out.println("""abs2: (x: Double)Double""");$skip(375); 

  def sqrt2(x: Double) = {

    def sqrtIter(guess: Double, x: Double): Double =
      if (isGoodEnough(guess, x)) guess
      else sqrtIter(improve(guess, x), x)

    def isGoodEnough(guess: Double, x: Double): Boolean =
      abs2(guess * guess - x) / x < 0.0001

    def improve(guess: Double, x: Double): Double =
      (guess + x / guess) / 2

    sqrtIter(1.0, x)
  };System.out.println("""sqrt2: (x: Double)Double""");$skip(14); val res$1 = 
  
  sqrt2(2);System.out.println("""res1: Double = """ + $show(res$1));$skip(12); val res$2 = 

  sqrt2(4);System.out.println("""res2: Double = """ + $show(res$2));$skip(15); val res$3 = 

  sqrt2(1e-6);System.out.println("""res3: Double = """ + $show(res$3));$skip(15); val res$4 = 

  sqrt2(1e60);System.out.println("""res4: Double = """ + $show(res$4))}
}
