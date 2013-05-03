package week5

object PairsAndTuples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(220); 
  def msort(xs: List[Int]): List[Int] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {

      val (fst, snd) = xs splitAt n
      merge2(msort(fst), msort(snd))
    }
  };System.out.println("""msort: (xs: List[Int])List[Int]""");$skip(243); 
  def merge(xs: List[Int], ys: List[Int]): List[Int] = xs match {
    case Nil => ys
    case x :: xs1 => ys match {
      case Nil => xs
      case y :: ys1 =>
        if (x < y) x :: merge(xs1, ys)
        else y :: merge(xs, ys1)
    }
  };System.out.println("""merge: (xs: List[Int], ys: List[Int])List[Int]""");$skip(245); 

  def merge2(xs: List[Int], ys: List[Int]): List[Int] =
    (xs, ys) match {
      case (Nil, ys) => ys
      case (xs, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (x < y) x :: merge(xs1, ys)
        else y :: merge(xs, ys1)
    };System.out.println("""merge2: (xs: List[Int], ys: List[Int])List[Int]""");$skip(42); 
    
    
    val nums = List(2,-4,5,7,1);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(21); val res$0 = 
    
    msort(nums);System.out.println("""res0: List[Int] = """ + $show(res$0))}

}
