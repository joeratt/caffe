package week3

import week3._

object Polymorphism {
  def singleton[T](elem: T) = new Cons[T](elem, new Nil[T])
                                                  //> singleton: [T](elem: T)week3.Cons[T]

  singleton[Int](1)                               //> res0: week3.Cons[Int] = week3.Cons@444c742
  singleton[Boolean](true)                        //> res1: week3.Cons[Boolean] = week3.Cons@3f75c03e

  singleton(1)                                    //> res2: week3.Cons[Int] = week3.Cons@4ba046fe
  singleton(true)                                 //> res3: week3.Cons[Boolean] = week3.Cons@794f47c

  def nth[T](n: Int, list: List[T]): T = {
      if (n == 0) list.head
      else if (list.isEmpty)
        throw new IndexOutOfBoundsException
      else nth(n-1, list.tail)
  }                                               //> nth: [T](n: Int, list: week3.List[T])T
  
  val list = new Cons(1,new Cons(2, new Cons(3, new Nil)))
                                                  //> list  : week3.Cons[Int] = week3.Cons@443efcc7
 nth(2,list)                                      //> res4: Int = 3
 nth(4,list)                                      //> java.lang.IndexOutOfBoundsException
                                                  //| 	at week3.Polymorphism$$anonfun$main$1.nth$1(week3.Polymorphism.scala:17)
                                                  //| 
                                                  //| 	at week3.Polymorphism$$anonfun$main$1.apply$mcV$sp(week3.Polymorphism.sc
                                                  //| ala:23)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$$anonfun$$exe
                                                  //| cute$1.apply$mcV$sp(WorksheetSupport.scala:76)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.redirected(W
                                                  //| orksheetSupport.scala:65)
                                                  //| 	at org.scalaide.worksheet.runtime.library.WorksheetSupport$.$execute(Wor
                                                  //| ksheetSupport.scala:75)
                                                  //| 	at week3.Polymorphism$.main(week3.Polymorphism.scala:5)
                                                  //| 	at week3.Polymorphism.main(week3.Polymorphism.scala)
 nth(-1,list)
}