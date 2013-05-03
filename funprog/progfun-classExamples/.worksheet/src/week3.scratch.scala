package week3

// import week3.Rational
// import week3.{Rational,Hello}
import week3._

object scratch {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(125); val res$0 = 
  new Rational(1,2);System.out.println("""res0: week3.Rational = """ + $show(res$0));$skip(51); 
  
  def error(msg: String) = throw new Error(msg);System.out.println("""error: (msg: String)Nothing""");$skip(18); 
  
  val x = null;System.out.println("""x  : Null = """ + $show(x ));$skip(23); 
  
  val y: String = x;System.out.println("""y  : String = """ + $show(y ));$skip(29); val res$1 = 
  
  
  if(true)1 else false;System.out.println("""res1: AnyVal = """ + $show(res$1));$skip(56); 
  
  def f(xs: List[NonEmpty], x: Empty) = xs prepend x;System.out.println("""f: (xs: week3.List[<error>], x: <error>)<error>""")}
  
}

trait Planar {
	def height:Int
	def width: Int
	def surface = height * width
}
