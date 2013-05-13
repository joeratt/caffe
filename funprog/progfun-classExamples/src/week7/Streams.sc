package week7

object Streams {
val xs = Stream.cons(1,Stream.cons(2,Stream.empty))
                                                  //> xs  : Stream.Cons[Int] = Stream(1, ?)

Stream(1,2,3)                                     //> res0: scala.collection.immutable.Stream[Int] = Stream(1, ?)

(1 to 1000).toStream                              //> res1: scala.collection.immutable.Stream[Int] = Stream(1, ?)

def streamRange(lo: Int, hi: Int): Stream[Int] =
	if(lo >= hi) Stream.empty
	else Stream.cons(lo,streamRange(lo +1,hi))//> streamRange: (lo: Int, hi: Int)Stream[Int]
	
def listRange(lo: Int, hi: Int): List[Int] =
if (lo >= hi) Nil
else lo::listRange(lo+1,hi)                       //> listRange: (lo: Int, hi: Int)List[Int]
}