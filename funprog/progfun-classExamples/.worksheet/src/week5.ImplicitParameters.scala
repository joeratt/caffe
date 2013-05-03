package week5

object ImplicitParameters {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(268); 

def msortPoly[T](xs: List[T])(implicit ord:Ordering[T]): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {

      val (fst, snd) = xs splitAt n
      mergePoly(msortPoly(fst), msortPoly(snd))(ord)
    }
  };System.out.println("""msortPoly: [T](xs: List[T])(implicit ord: Ordering[T])List[T]""");$skip(293); 

def mergePolyOld[T](xs: List[T], ys: List[T])(lt: (T,T) => Boolean): List[T] =
    (xs, ys) match {
      case (Nil, ys) => ys
      case (xs, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (lt(x, y)) x :: mergePolyOld(xs1, ys)(lt)
        else y :: mergePolyOld(xs, ys1)(lt)
    };System.out.println("""mergePolyOld: [T](xs: List[T], ys: List[T])(lt: (T, T) => Boolean)List[T]""");$skip(294); 
    
    def mergePoly[T](xs: List[T], ys: List[T])(ord: Ordering[T]): List[T] =
    (xs, ys) match {
      case (Nil, ys) => ys
      case (xs, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (ord.lt(x, y)) x :: mergePoly(xs1, ys)(ord)
        else y :: mergePoly(xs, ys1)(ord)
    };System.out.println("""mergePoly: [T](xs: List[T], ys: List[T])(ord: Ordering[T])List[T]""");$skip(37); 
    
    val nums = List(2,-4,5,7,1);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(64); 
    val fruits = List("apple", "pineapple", "orange", "banana");System.out.println("""fruits  : List[String] = """ + $show(fruits ));$skip(25); val res$0 = 
    
    msortPoly(nums);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(22); val res$1 = 
    msortPoly(fruits);System.out.println("""res1: List[String] = """ + $show(res$1))}
}
