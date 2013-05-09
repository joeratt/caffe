package week6

object Maps2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(86); 
  val romanNumerals = Map('I' -> 1, "V" -> 5, "x" -> 10);System.out.println("""romanNumerals  : scala.collection.immutable.Map[Any,Int] = """ + $show(romanNumerals ));$skip(76); 
  val capitalOfCountry = Map("US" -> "Washington", "Switzerland" -> "Bern");System.out.println("""capitalOfCountry  : scala.collection.immutable.Map[String,String] = """ + $show(capitalOfCountry ));$skip(26); val res$0 = 

  capitalOfCountry("US");System.out.println("""res0: String = """ + $show(res$0));$skip(33); val res$1 = 

  capitalOfCountry get "Andora";System.out.println("""res1: Option[String] = """ + $show(res$1));$skip(29); val res$2 = 

  capitalOfCountry get "US";System.out.println("""res2: Option[String] = """ + $show(res$2));$skip(238); 

  // capitalOfCountry("Andora") // java.util.NoSuchElementException: key not found: Andora

  def showCapital(country: String) = capitalOfCountry.get(country) match {
    case Some(capital) => capital
    case None => "Missing Data"
  };System.out.println("""showCapital: (country: String)String""");$skip(27); val res$3 = 
  
  showCapital("Andora");System.out.println("""res3: String = """ + $show(res$3));$skip(58); 
  
  val fruit = List("apple", "banana", "pear","orange");System.out.println("""fruit  : List[String] = """ + $show(fruit ));$skip(41); val res$4 = 
 
 	fruit sortWith (_.length < _.length);System.out.println("""res4: List[String] = """ + $show(res$4));$skip(18); val res$5 = 
  
  fruit.sorted;System.out.println("""res5: List[String] = """ + $show(res$5));$skip(28); val res$6 = 
  
  fruit groupBy (_.head);System.out.println("""res6: scala.collection.immutable.Map[Char,List[String]] = """ + $show(res$6));$skip(37); val res$7 = 
  
  
  Map(0 -> 5, 1 -> -2, 3 -> 1);System.out.println("""res7: scala.collection.immutable.Map[Int,Int] = """ + $show(res$7))}
  
}

object polynomials {
	class Poly(val terms: Map[Int,Double]) {
		def + (other:Poly) = ???
		}
		
		val p1 = new Poly(Map(1 -> 2.0, 3 -> 4.0, 5 -> 6.2))
		val p2 = new Poly(Map(0 -> 3.0, 3 -> 7.0))
		p1 + p2
}
