package week3

import week3._

object Polymorphism {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(112); 
  def singleton[T](elem: T) = new Cons[T](elem, new Nil[T]);System.out.println("""singleton: [T](elem: T)week3.Cons[T]""");$skip(21); val res$0 = 

  singleton[Int](1);System.out.println("""res0: week3.Cons[Int] = """ + $show(res$0));$skip(27); val res$1 = 
  singleton[Boolean](true);System.out.println("""res1: week3.Cons[Boolean] = """ + $show(res$1));$skip(16); val res$2 = 

  singleton(1);System.out.println("""res2: week3.Cons[Int] = """ + $show(res$2));$skip(18); val res$3 = 
  singleton(true);System.out.println("""res3: week3.Cons[Boolean] = """ + $show(res$3));$skip(180); 

  def nth[T](n: Int, list: List[T]): T = {
      if (n == 0) list.head
      else if (list.isEmpty)
        throw new IndexOutOfBoundsException
      else nth(n-1, list.tail)
  };System.out.println("""nth: [T](n: Int, list: week3.List[T])T""");$skip(62); 
  
  val list = new Cons(1,new Cons(2, new Cons(3, new Nil)));System.out.println("""list  : week3.Cons[Int] = """ + $show(list ));$skip(13); val res$4 = 
 nth(2,list);System.out.println("""res4: Int = """ + $show(res$4));$skip(13); val res$5 = 
 nth(4,list);System.out.println("""res5: Int = """ + $show(res$5));$skip(14); val res$6 = 
 nth(-1,list);System.out.println("""res6: Int = """ + $show(res$6))}
}
