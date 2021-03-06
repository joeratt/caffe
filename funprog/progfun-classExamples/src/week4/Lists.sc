package week4

object Lists {
  val fruit = List("apples", "oranges", "pears")  //> fruit  : List[String] = List(apples, oranges, pears)
  val nums = List(1, 2, 3, 4)                     //> nums  : List[Int] = List(1, 2, 3, 4)
  val diag3 = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
                                                  //> diag3  : List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1))
                                                  //| 
  val empty: List[Nothing] = List()               //> empty  : List[Nothing] = List()
  
  val thing = 1 :: (2 :: (3 ::(4 :: Nil)))        //> thing  : List[Int] = List(1, 2, 3, 4)
  
  val thing2 = Nil.::(4).::(3).::(2).::(1)        //> thing2  : List[Int] = List(1, 2, 3, 4)
  
  
  def isort(xs: List[Int]): List[Int] = xs match {
  	case List() => List()
  	case y::ys => insert(y,isort(ys))
  }                                               //> isort: (xs: List[Int])List[Int]
  
  def insert(x: Int, xs: List[Int]): List[Int] = xs match {
  	case List() => List(x)
  	case y::ys => {
  		if(x <= y) x :: xs
  		else y::insert(x,ys)
  	}
  }                                               //> insert: (x: Int, xs: List[Int])List[Int]
  
  
  isort(List(2,45,12,7))                          //> res0: List[Int] = List(2, 7, 12, 45)
}