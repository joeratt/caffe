package week3

// import week3.Rational
// import week3.{Rational,Hello}
import week3._

object scratch {
  new Rational(1,2)
  
  def error(msg: String) = throw new Error(msg)
  
  val x = null
  
  val y: String = x
  
  
  if(true)1 else false
  
  def f(xs: List[NonEmpty], x: Empty) = xs prepend x
  
}

trait Planar {
	def height:Int
	def width: Int
	def surface = height * width
}