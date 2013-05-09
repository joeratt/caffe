package week6

object Maps {
  val romanNumerals = Map('I' -> 1, "V" -> 5, "x" -> 10)
                                                  //> romanNumerals  : scala.collection.immutable.Map[Any,Int] = Map(I -> 1, V -> 5
                                                  //| , x -> 10)
  val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern")
                                                  //> capitalOfCountry  : scala.collection.immutable.Map[String,String] = Map(US -
                                                  //| > Washington, Switzerland -> Bern)

  capitalOfCountry("US")                          //> res0: String = Washington

  capitalOfCountry get "Andora"                   //> res1: Option[String] = None

  capitalOfCountry get "US"                       //> res2: Option[String] = Some(Washington)

  // capitalOfCountry("Andora") // java.util.NoSuchElementException: key not found: Andora

  def showCapital(country: String) = capitalOfCountry.get(country) match {
    case Some(capital) => capital
    case None => "Missing Data"
  }                                               //> showCapital: (country: String)String

  showCapital("Andora")                           //> res3: String = Missing Data

  val fruit = List("apple", "banana", "pear", "orange")
                                                  //> fruit  : List[String] = List(apple, banana, pear, orange)

  fruit sortWith (_.length < _.length)            //> res4: List[String] = List(pear, apple, banana, orange)

  fruit.sorted                                    //> res5: List[String] = List(apple, banana, orange, pear)

  fruit groupBy (_.head)                          //> res6: scala.collection.immutable.Map[Char,List[String]] = Map(b -> List(bana
                                                  //| na), p -> List(pear), a -> List(apple), o -> List(orange))

  Map(0 -> 5, 1 -> -2, 3 -> 1)                    //> res7: scala.collection.immutable.Map[Int,Int] = Map(0 -> 5, 1 -> -2, 3 -> 1)
                                                  //| 

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
    	
  }

  val p1 = new Poly(Map(1 -> 2.0, 3 -> 4.0, 5 -> 6.2))
                                                  //> p1  : week6.Maps.Poly = 6.2x^5 + 4.0x^3 + 2.0x^1
  val p2 = new Poly(Map(0 -> 3.0, 3 -> 7.0))      //> p2  : week6.Maps.Poly = 7.0x^3 + 3.0x^0
  p1 + p2                                         //> res8: week6.Maps.Poly = 6.2x^5 + 11.0x^3 + 2.0x^1 + 3.0x^0
  
  val cap1 = capitalOfCountry withDefaultValue "<unknown>"
                                                  //> cap1  : scala.collection.immutable.Map[String,String] = Map(US -> Washingto
                                                  //| n, Switzerland -> Bern)
	cap1("Thing")                             //> res9: String = <unknown>
	
	p1.terms(7)                               //> res10: Double = 0.0
	
	val p3 = new Poly(1 -> 2.3, 5 -> 10.2)    //> p3  : week6.Maps.Poly = 10.2x^5 + 2.3x^1
  
}