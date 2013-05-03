package week5

object HigherOrderListFunctions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(82); 
  val nums = List(2, -4, 5, 7, 1);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(62); 
  val fruits = List("apple", "pineapple", "orange", "banana");System.out.println("""fruits  : List[String] = """ + $show(fruits ));$skip(28); val res$0 = 

  nums filter (x => x > 0);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(30); val res$1 = 
  nums filterNot (x => x > 0);System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(30); val res$2 = 
  nums partition (x => x > 0);System.out.println("""res2: (List[Int], List[Int]) = """ + $show(res$2));$skip(31); val res$3 = 

  nums takeWhile (x => x > 0);System.out.println("""res3: List[Int] = """ + $show(res$3));$skip(30); val res$4 = 
  nums dropWhile (x => x > 0);System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(25); val res$5 = 
  nums span (x => x > 0);System.out.println("""res5: (List[Int], List[Int]) = """ + $show(res$5));$skip(54); 

  val data = List("a", "a", "a", "b", "c", "c", "a");System.out.println("""data  : List[String] = """ + $show(data ));$skip(175); 

  def pack[T](xs: List[T]): List[List[T]] = xs match {
    case Nil => Nil
    case x :: xsl =>
      val (first, rest) = xs span (y => y == x)
      first :: pack(rest)
  };System.out.println("""pack: [T](xs: List[T])List[List[T]]""");$skip(15); val res$6 = 
  
 pack(data);System.out.println("""res6: List[List[String]] = """ + $show(res$6));$skip(95); 
 
 def encode[T](xs: List[T]): List[(T,Int)] = {
 	pack(xs) map (ys => (ys.head,ys.length))
 };System.out.println("""encode: [T](xs: List[T])List[(T, Int)]""");$skip(16); val res$7 = 
 
 encode(data);System.out.println("""res7: List[(String, Int)] = """ + $show(res$7))}
}
