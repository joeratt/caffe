package week2

object Currying {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(168); 
  def sum(f: Int=>Int): (Int, Int) => Int = {
  	def sumF(a: Int, b: Int): Int =
  	if(a>b)0
  	else f(a) + sumF(a+1,b)
  	
  	sumF
  };System.out.println("""sum: (f: Int => Int)(Int, Int) => Int""");$skip(29); 
  
  def sumInts = sum(x=>x);System.out.println("""sumInts: => (Int, Int) => Int""");$skip(18); val res$0 = 
  
  sumInts(1,2);System.out.println("""res0: Int = """ + $show(res$0));$skip(35); 
  
  def cube(x: Int): Int = x*x*x;System.out.println("""cube: (x: Int)Int""");$skip(21); val res$1 = 
  
  sum(cube)(1,10);System.out.println("""res1: Int = """ + $show(res$1));$skip(92); 
  
  
  def sum2(f: Int=>Int)(a: Int, b:Int): Int =
  if(a>b)0
  	else f(a) + sum(f)(a+1,b);System.out.println("""sum2: (f: Int => Int)(a: Int, b: Int)Int""");$skip(104); 
  	
 
 def product(f: Int => Int)(a:Int, b: Int): Int = {
 	if(a>b)1
 	else	f(a) * product(f)(a+1,b)
 };System.out.println("""product: (f: Int => Int)(a: Int, b: Int)Int""");$skip(22); val res$2 = 
 
 product(cube)(1,3);System.out.println("""res2: Int = """ + $show(res$2));$skip(48); 
 
 def factorial(x: Int) =
  product(x=>x)(1,x);System.out.println("""factorial: (x: Int)Int""");$skip(18); val res$3 = 
  
  factorial(3);System.out.println("""res3: Int = """ + $show(res$3));$skip(174); 
  
  
  def mapReduce(f: Int=> Int, combine: (Int, Int) => Int, zero: Int)(a:Int, b: Int): Int = {
  	if(a>b) zero
  	else combine(f(a),mapReduce(f,combine,zero)(a+1,b))
  };System.out.println("""mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b: Int)Int""");$skip(93); 
  
  def productMapRed(f: Int => Int)(a:Int, b: Int): Int = mapReduce(f,(x,y) => x*y,1)(a,b);System.out.println("""productMapRed: (f: Int => Int)(a: Int, b: Int)Int""");$skip(29); val res$4 = 
	
	productMapRed(cube)(1, 3);System.out.println("""res4: Int = """ + $show(res$4))}

}
