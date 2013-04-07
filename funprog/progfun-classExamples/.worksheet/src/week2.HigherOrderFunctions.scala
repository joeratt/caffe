package week2

object HigherOrderFunctions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(88); 
  println("Welcome to the Scala worksheet");$skip(99); 

  def sum(f: Int => Int, a: Int, b: Int): Int =
    if (a > b) 0
    else f(a) + sum(f, a + 1, b);System.out.println("""sum: (f: Int => Int, a: Int, b: Int)Int""");$skip(33); 
    
    def id(x: Int): Int = x;System.out.println("""id: (x: Int)Int""");$skip(21); val res$0 = 
    
    sum(id,1,2);System.out.println("""res0: Int = """ + $show(res$0));$skip(27); val res$1 = 
    
    (x: Int) => x*x*x;System.out.println("""res1: Int => Int = """ + $show(res$1));$skip(33); val res$2 = 
    
    (x: Int, y: Int) => y+y;System.out.println("""res2: (Int, Int) => Int = """ + $show(res$2));$skip(54); 
    
    def sumInts(a: Int, b: Int) = sum(x=>x, a,b);System.out.println("""sumInts: (a: Int, b: Int)Int""");$skip(177); 
    
    def sum1(f: Int => Int,a: Int, b: Int): Int = {
    	def loop(a: Int, acc: Int): Int = {
    		if(a > b) acc
    		else loop(a+1, acc+f(a))
    	}
    	loop(a,0)
    };System.out.println("""sum1: (f: Int => Int, a: Int, b: Int)Int""");$skip(28); val res$3 = 
    
    sum1(x => x*x,3,5);System.out.println("""res3: Int = """ + $show(res$3))}
}
