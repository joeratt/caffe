package week6

object CombinatorialSearchExample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(94); 
  val fruit = ("apple", "banana", "orange");System.out.println("""fruit  : (String, String, String) = """ + $show(fruit ));$skip(25); 
  val s = (1 to 6).toSet;System.out.println("""s  : scala.collection.immutable.Set[Int] = """ + $show(s ));$skip(16); val res$0 = 
  s map (_ + 2);System.out.println("""res0: scala.collection.immutable.Set[Int] = """ + $show(res$0));$skip(17); val res$1 = 

  s map (_ / 2);System.out.println("""res1: scala.collection.immutable.Set[Int] = """ + $show(res$1));$skip(16); val res$2 = 

  s contains 5;System.out.println("""res2: Boolean = """ + $show(res$2));$skip(295); 

  def queens(n: Int): Set[List[Int]] = {
    def placeQueens(k: Int): Set[List[Int]] =
      if (k == 0) Set(List())
      else
        for {
          queens <- placeQueens(k - 1)
          col <- 0 until n
          if isSafe(col, queens)
        } yield col :: queens
    placeQueens(n)
  };System.out.println("""queens: (n: Int)Set[List[Int]]""");$skip(239); 

  def isSafe(col: Int, queens: List[Int]): Boolean = {
    val row = queens.length
    val queensWithRow = (row - 1 to 0 by -1) zip queens
    queensWithRow forall {
      case (r, c) => col != c && math.abs(col - c) != row - r
    }
  };System.out.println("""isSafe: (col: Int, queens: List[Int])Boolean""");$skip(197); 

  def show(queens: List[Int]) = {
    val lines =
      for (col <- queens.reverse)
        yield Vector.fill(queens.length)("* ").updated(col, "X ").mkString
    "\n" + (lines mkString "\n")
  };System.out.println("""show: (queens: List[Int])String""");$skip(22); val res$3 = 

  queens(4) map show;System.out.println("""res3: scala.collection.immutable.Set[String] = """ + $show(res$3));$skip(38); val res$4 = 

  (queens(4) map show) mkString "\n";System.out.println("""res4: String = """ + $show(res$4));$skip(45); val res$5 = 

  (queens(8) take 3 map show) mkString "\n";System.out.println("""res5: String = """ + $show(res$5))}
}
