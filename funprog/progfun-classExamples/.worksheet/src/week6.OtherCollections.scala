package week6

object OtherCollections {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(84); 
  println("Welcome to the Scala worksheet");$skip(15); 

  val M = 123;System.out.println("""M  : Int = """ + $show(M ));$skip(14); 
  val N = 122;System.out.println("""N  : Int = """ + $show(N ));$skip(120); 

  def scalarProduct(xs: Vector[Double], ys: Vector[Double]): Double =
    (xs zip ys).map { case (x, y) => x * y }.sum;System.out.println("""scalarProduct: (xs: Vector[Double], ys: Vector[Double])Double""");$skip(45); val res$0 = 

  scalarProduct(Vector(1, 2), Vector(1, 2));System.out.println("""res0: Double = """ + $show(res$0));$skip(111); 

  def isPrime(n: Int): Boolean =
    {
      val xyz: Range = (2 to n-1)
      !xyz.exists(p => n%p==0)
    };System.out.println("""isPrime: (n: Int)Boolean""");$skip(84); 
    
    def isPrimeQuizAnswer(n:Int): Boolean =
    	(2 until n).forall(d=>n%d!=0);System.out.println("""isPrimeQuizAnswer: (n: Int)Boolean""");$skip(20); val res$1 = 
    
    isPrime(5);System.out.println("""res1: Boolean = """ + $show(res$1));$skip(15); val res$2 = 
    isPrime(4);System.out.println("""res2: Boolean = """ + $show(res$2));$skip(15); val res$3 = 
    isPrime(1);System.out.println("""res3: Boolean = """ + $show(res$3));$skip(15); val res$4 = 
    isPrime(2);System.out.println("""res4: Boolean = """ + $show(res$4));$skip(15); val res$5 = 
    isPrime(9);System.out.println("""res5: Boolean = """ + $show(res$5));$skip(30); val res$6 = 
    
    isPrimeQuizAnswer(5);System.out.println("""res6: Boolean = """ + $show(res$6));$skip(25); val res$7 = 
    isPrimeQuizAnswer(4);System.out.println("""res7: Boolean = """ + $show(res$7));$skip(25); val res$8 = 
    isPrimeQuizAnswer(1);System.out.println("""res8: Boolean = """ + $show(res$8));$skip(25); val res$9 = 
    isPrimeQuizAnswer(2);System.out.println("""res9: Boolean = """ + $show(res$9));$skip(25); val res$10 = 
    isPrimeQuizAnswer(9);System.out.println("""res10: Boolean = """ + $show(res$10))}
}
