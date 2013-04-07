package week2

object Currying {
  def sum(f: Int=>Int): (Int, Int) => Int = {
  	def sumF(a: Int, b: Int): Int =
  	if(a>b)0
  	else f(a) + sumF(a+1,b)
  	
  	sumF
  }                                               //> sum: (f: Int => Int)(Int, Int) => Int
  
  def sumInts = sum(x=>x)                         //> sumInts: => (Int, Int) => Int
  
  sumInts(1,2)                                    //> res0: Int = 3
  
  def cube(x: Int): Int = x*x*x                   //> cube: (x: Int)Int
  
  sum(cube)(1,10)                                 //> res1: Int = 3025
  
  
  def sum2(f: Int=>Int)(a: Int, b:Int): Int =
  if(a>b)0
  	else f(a) + sum(f)(a+1,b)                 //> sum2: (f: Int => Int)(a: Int, b: Int)Int
  	
 
 def product(f: Int => Int)(a:Int, b: Int): Int = {
 	if(a>b)1
 	else	f(a) * product(f)(a+1,b)
 }                                                //> product: (f: Int => Int)(a: Int, b: Int)Int
 
 product(cube)(1,3)                               //> res2: Int = 216
 
 def factorial(x: Int) =
  product(x=>x)(1,x)                              //> factorial: (x: Int)Int
  
  factorial(3)                                    //> res3: Int = 6
  
  
  def mapReduce(f: Int=> Int, combine: (Int, Int) => Int, zero: Int)(a:Int, b: Int): Int = {
  	if(a>b) zero
  	else combine(f(a),mapReduce(f,combine,zero)(a+1,b))
  }                                               //> mapReduce: (f: Int => Int, combine: (Int, Int) => Int, zero: Int)(a: Int, b:
                                                  //|  Int)Int
  
  def productMapRed(f: Int => Int)(a:Int, b: Int): Int = mapReduce(f,(x,y) => x*y,1)(a,b)
                                                  //> productMapRed: (f: Int => Int)(a: Int, b: Int)Int
	
	productMapRed(cube)(1, 3)                 //> res4: Int = 216

}