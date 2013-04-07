package week2

object HigherOrderFunctions {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b)                  //> sum: (f: Int => Int, a: Int, b: Int)Int
    
    def id(x: Int): Int = x                       //> id: (x: Int)Int
    
    sum(id,1,2)                                   //> res0: Int = 3
    
    (x: Int) => x*x*x                             //> res1: Int => Int = <function1>
    
    (x: Int, y: Int) => y+y                       //> res2: (Int, Int) => Int = <function2>
    
    def sumInts(a: Int, b: Int) = sum(x=>x, a,b)  //> sumInts: (a: Int, b: Int)Int
    
    def sum1(f: Int => Int,a: Int, b: Int): Int = {
    	def loop(a: Int, acc: Int): Int = {
    		if(a > b) acc
    		else loop(a+1, acc+f(a))
    	}
    	loop(a,0)
    }                                             //> sum1: (f: Int => Int, a: Int, b: Int)Int
    
    sum1(x => x*x,3,5)                            //> res3: Int = 50
}