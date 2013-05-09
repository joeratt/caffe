package week6

object Maps {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(85); 
  val romanNumerals = Map('I' -> 1, "V" -> 5, "x" -> 10);System.out.println("""romanNumerals  : scala.collection.immutable.Map[Any,Int] = """ + $show(romanNumerals ));$skip(76); 
  val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern");System.out.println("""capitalOfCountry  : scala.collection.immutable.Map[String,String] = """ + $show(capitalOfCountry ));$skip(26); val res$0 = 

  capitalOfCountry("US");System.out.println("""res0: String = """ + $show(res$0));$skip(33); val res$1 = 

  capitalOfCountry get "Andora";System.out.println("""res1: Option[String] = """ + $show(res$1));$skip(29); val res$2 = 

  capitalOfCountry get "US";System.out.println("""res2: Option[String] = """ + $show(res$2));$skip(238); 

  // capitalOfCountry("Andora") // java.util.NoSuchElementException: key not found: Andora

  def showCapital(country: String) = capitalOfCountry.get(country) match {
    case Some(capital) => capital
    case None => "Missing Data"
  };System.out.println("""showCapital: (country: String)String""");$skip(25); val res$3 = 

  showCapital("Andora");System.out.println("""res3: String = """ + $show(res$3));$skip(57); 

  val fruit = List("apple", "banana", "pear", "orange");System.out.println("""fruit  : List[String] = """ + $show(fruit ));$skip(40); val res$4 = 

  fruit sortWith (_.length < _.length);System.out.println("""res4: List[String] = """ + $show(res$4));$skip(16); val res$5 = 

  fruit.sorted;System.out.println("""res5: List[String] = """ + $show(res$5));$skip(26); val res$6 = 

  fruit groupBy (_.head);System.out.println("""res6: scala.collection.immutable.Map[Char,List[String]] = """ + $show(res$6));$skip(32); val res$7 = 

  Map(0 -> 5, 1 -> -2, 3 -> 1)

  class Poly(val terms0: Map[Int, Double]) {
  def this(bindings: (Int, Double)*) = this(bindings.toMap)
  val terms = terms0 withDefaultValue 0.0
    //def +(other: Poly) = new Poly(terms ++ (other.terms map adjust))
    //myFailure! def +(other: Poly) = new Poly(other.terms foldLeft terms.toList.sorted.reverse)(addTerm)
    def +(other: Poly) = new Poly((other.terms foldLeft terms)(addTerm))
    def adjust(term: (Int, Double)): (Int, Double) = {
    		val (exp,coeff) = term
    		//terms get exp match {
    		//	case Some(coeff1) => exp -> (coeff + coeff1)
    		//	case None => exp -> coeff
    		//}
    		exp -> (coeff + terms(exp))
    	}
    	override def toString =
    	(for((exp,coeff) <- terms.toList.sorted.reverse) yield coeff +"x^"+exp) mkString " + "
    	
    	def addTerm(terms: Map[Int,Double], term: (Int,Double)): Map[Int,Double] = {
    		val (exp,coeff) = term
    		terms + (exp -> (coeff + terms(exp)))
    	}
    	
  };System.out.println("""res7: scala.collection.immutable.Map[Int,Int] = """ + $show(res$7));$skip(1007); 

  val p1 = new Poly(Map(1 -> 2.0, 3 -> 4.0, 5 -> 6.2));System.out.println("""p1  : week6.Maps.Poly = """ + $show(p1 ));$skip(45); 
  val p2 = new Poly(Map(0 -> 3.0, 3 -> 7.0));System.out.println("""p2  : week6.Maps.Poly = """ + $show(p2 ));$skip(10); val res$8 = 
  p1 + p2;System.out.println("""res8: week6.Maps.Poly = """ + $show(res$8));$skip(62); 
  
  val cap1 = capitalOfCountry withDefaultValue "<unknown>";System.out.println("""cap1  : scala.collection.immutable.Map[String,String] = """ + $show(cap1 ));$skip(15); val res$9 = 
	cap1("Thing");System.out.println("""res9: String = """ + $show(res$9));$skip(15); val res$10 = 
	
	p1.terms(7);System.out.println("""res10: Double = """ + $show(res$10));$skip(42); 
	
	val p3 = new Poly(1 -> 2.3, 5 -> 10.2);System.out.println("""p3  : week6.Maps.Poly = """ + $show(p3 ))}
  
}
