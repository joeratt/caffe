package week6

import week6._

object TranslationOfFor {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(68); 
  val n = 7;System.out.println("""n  : Int = """ + $show(n ));$skip(74); 

  def isPrime(n: Int): Boolean =
    (2 until n).forall(d => n % d != 0);System.out.println("""isPrime: (n: Int)Boolean""");$skip(86); val res$0 = 

  for {
    i <- 1 until n
    j <- 1 until i
    if isPrime(i + j)
  } yield (i, j);System.out.println("""res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$0));$skip(101); val res$1 = 

  (1 until n).flatMap(i =>
    (1 until i).withFilter(j => isPrime(i + j))
      .map(j => (i, j)));System.out.println("""res1: scala.collection.immutable.IndexedSeq[(Int, Int)] = """ + $show(res$1));$skip(544); 

  val books: List[Book] = List(
    Book("Structure and Interpretation of Computer Programs", List("Abelson, Harald", "Sussman, Gerald J.")),
    Book("Introduction to Functional Programming", List(
      "Bird, Richard",
      "Wadler, Phil")),
    Book(
      "Effective Java",
      List(
        "Bloch, Joshua")),
    Book(
      "Java Puzzlers",
      List(
        "Bloch, Joshua",
        "Gafter, Neal")),
    Book(
      "Programming in Scala",
      List(
        "Odersky, Martin",
        "Spoon, Lex",
        "Venners, Bill")));System.out.println("""books  : List[week6.Book] = """ + $show(books ));$skip(77); val res$2 = 

  for (b <- books; a <- b.authors if a startsWith "Bird")
    yield b.title;System.out.println("""res2: List[String] = """ + $show(res$2));$skip(173); val res$3 = 

  //	books.flatMap(b => for(a <- b.authors if a startsWith "Bird")) yield b.title

  	books.flatMap(b => b.authors.withFilter(a => a.startsWith("Bird")).map(a => b.title));System.out.println("""res3: List[String] = """ + $show(res$3));$skip(274); val res$4 = 

  //answer
  //books.flatMap(b => for(a <- b.authors if a startsWith "Bird") yield b.title
  //books.flatMap(b => for (a <- b.authors withFilter (a => startsWith "Bird")) yield b.title
  books.flatMap(b => b.authors.withFilter(a => a.startsWith("Bird")).map(a => b.title));System.out.println("""res4: List[String] = """ + $show(res$4))}
}
