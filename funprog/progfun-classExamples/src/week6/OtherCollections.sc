package week6

object OtherCollections {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  val M = 123                                     //> M  : Int = 123
  val N = 122                                     //> N  : Int = 122

  def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
    (xs zip ys).map { case (x, y) => x * y }.sum  //> scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double

  scalarProduct(Vector(1, 2), Vector(1, 2))       //> res0: Double = 5.0

  def isPrime(n: Int): Boolean =
    {
      val xyz: Range = (2 to n-1)
      !xyz.exists(p => n%p==0)
    }                                             //> isPrime: (n: Int)Boolean
    
    def isPrimeQuizAnswer(n:Int): Boolean =
    	(2 until n).forall(d=>n%d!=0)             //> isPrimeQuizAnswer: (n: Int)Boolean
    
    isPrime(5)                                    //> res1: Boolean = true
    isPrime(4)                                    //> res2: Boolean = false
    isPrime(1)                                    //> res3: Boolean = true
    isPrime(2)                                    //> res4: Boolean = true
    isPrime(9)                                    //> res5: Boolean = false
    
    isPrimeQuizAnswer(5)                          //> res6: Boolean = true
    isPrimeQuizAnswer(4)                          //> res7: Boolean = false
    isPrimeQuizAnswer(1)                          //> res8: Boolean = true
    isPrimeQuizAnswer(2)                          //> res9: Boolean = true
    isPrimeQuizAnswer(9)                          //> res10: Boolean = false
}