package week1

object session2 {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  1 + 3                                           //> res0: Int(4) = 4
  def abs2(x: Double): Double = if (x < 0) -x else x
                                                  //> abs2: (x: Double)Double

  def sqrt2(x: Double) = {

    def sqrtIter(guess: Double): Double =
      if (isGoodEnough(guess)) guess
      else sqrtIter(improve(guess))

    def isGoodEnough(guess: Double): Boolean =
      abs2(guess * guess - x) / x < 0.0001

    def improve(guess: Double): Double =
      (guess + x / guess) / 2

    sqrtIter(1.0)
  }                                               //> sqrt2: (x: Double)Double
  
  sqrt2(2)                                        //> res1: Double = 1.4142156862745097

  sqrt2(4)                                        //> res2: Double = 2.0000000929222947

  sqrt2(1e-6)                                     //> res3: Double = 0.0010000001533016628

  sqrt2(1e60)                                     //> res4: Double = 1.0000000031080746E30
}