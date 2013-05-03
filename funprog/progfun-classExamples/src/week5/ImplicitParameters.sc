package week5

object ImplicitParameters {

def msortPoly[T](xs: List[T])(implicit ord:Ordering[T]): List[T] = {
    val n = xs.length / 2
    if (n == 0) xs
    else {

      val (fst, snd) = xs splitAt n
      mergePoly(msortPoly(fst), msortPoly(snd))(ord)
    }
  }                                               //> msortPoly: [T](xs: List[T])(implicit ord: Ordering[T])List[T]

def mergePolyOld[T](xs: List[T], ys: List[T])(lt: (T,T) => Boolean): List[T] =
    (xs, ys) match {
      case (Nil, ys) => ys
      case (xs, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (lt(x, y)) x :: mergePolyOld(xs1, ys)(lt)
        else y :: mergePolyOld(xs, ys1)(lt)
    }                                             //> mergePolyOld: [T](xs: List[T], ys: List[T])(lt: (T, T) => Boolean)List[T]
    
    def mergePoly[T](xs: List[T], ys: List[T])(ord: Ordering[T]): List[T] =
    (xs, ys) match {
      case (Nil, ys) => ys
      case (xs, Nil) => xs
      case (x :: xs1, y :: ys1) =>
        if (ord.lt(x, y)) x :: mergePoly(xs1, ys)(ord)
        else y :: mergePoly(xs, ys1)(ord)
    }                                             //> mergePoly: [T](xs: List[T], ys: List[T])(ord: Ordering[T])List[T]
    
    val nums = List(2,-4,5,7,1)                   //> nums  : List[Int] = List(2, -4, 5, 7, 1)
    val fruits = List("apple", "pineapple", "orange", "banana")
                                                  //> fruits  : List[String] = List(apple, pineapple, orange, banana)
    
    msortPoly(nums)                               //> res0: List[Int] = List(-4, 1, 2, 5, 7)
    msortPoly(fruits)                             //> res1: List[String] = List(apple, banana, orange, pineapple)
}