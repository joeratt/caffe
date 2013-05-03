package week4

object Lists {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(78); 
  val fruit = List("apples", "oranges", "pears");System.out.println("""fruit  : List[String] = """ + $show(fruit ));$skip(30); 
  val nums = List(1, 2, 3, 4);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(64); 
  val diag3 = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1));System.out.println("""diag3  : List[List[Int]] = """ + $show(diag3 ));$skip(36); 
  val empty: List[Nothing] = List();System.out.println("""empty  : List[Nothing] = """ + $show(empty ));$skip(46); 
  
  val thing = 1 :: (2 :: (3 ::(4 :: Nil)));System.out.println("""thing  : List[Int] = """ + $show(thing ));$skip(46); 
  
  val thing2 = Nil.::(4).::(3).::(2).::(1);System.out.println("""thing2  : List[Int] = """ + $show(thing2 ));$skip(123); 
  
  
  def isort(xs: List[Int]): List[Int] = xs match {
  	case List() => List()
  	case y::ys => insert(y,isort(ys))
  };System.out.println("""isort: (xs: List[Int])List[Int]""");$skip(165); 
  
  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
  	case List() => List(x)
  	case y::ys => {
  		if(x <= y) x :: xs
  		else y::insert(x,ys)
  	}
  };System.out.println("""insert: (x: Int, xs: List[Int])List[Int]""");$skip(31); val res$0 = 
  
  
  isort(List(2,45,12,7));System.out.println("""res0: List[Int] = """ + $show(res$0))}
}
