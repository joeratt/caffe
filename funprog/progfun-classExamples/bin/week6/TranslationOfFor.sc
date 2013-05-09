package week6

import week6._

object TranslationOfFor {
  val n = 7                                       //> n  : Int = 7

  def isPrime(n: Int): Boolean =
    (2 until n).forall(d => n % d != 0)           //> isPrime: (n: Int)Boolean

  for {
    i <- 1 until n
    j <- 1 until i
    if isPrime(i + j)
  } yield (i, j)                                  //> res0: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))

  (1 until n).flatMap(i =>
    (1 until i).withFilter(j => isPrime(i + j))
      .map(j => (i, j)))                          //> res1: scala.collection.immutable.IndexedSeq[(Int, Int)] = Vector((2,1), (3,2
                                                  //| ), (4,1), (4,3), (5,2), (6,1), (6,5))

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
        "Venners, Bill")))                        //> books  : List[week6.Book] = List(Book(Structure and Interpretation of Comput
                                                  //| er Programs,List(Abelson, Harald, Sussman, Gerald J.)), Book(Introduction to
                                                  //|  Functional Programming,List(Bird, Richard, Wadler, Phil)), Book(Effective J
                                                  //| ava,List(Bloch, Joshua)), Book(Java Puzzlers,List(Bloch, Joshua, Gafter, Nea
                                                  //| l)), Book(Programming in Scala,List(Odersky, Martin, Spoon, Lex, Venners, Bi
                                                  //| ll)))

  for (b <- books; a <- b.authors if a startsWith "Bird")
    yield b.title                                 //> res2: List[String] = List(Introduction to Functional Programming)

  //	books.flatMap(b => for(a <- b.authors if a startsWith "Bird")) yield b.title

  	books.flatMap(b => b.authors.withFilter(a => a.startsWith("Bird")).map(a => b.title))
                                                  //> res3: List[String] = List(Introduction to Functional Programming)

  //answer
  //books.flatMap(b => for(a <- b.authors if a startsWith "Bird") yield b.title
  //books.flatMap(b => for (a <- b.authors withFilter (a => startsWith "Bird")) yield b.title
  books.flatMap(b => b.authors.withFilter(a => a.startsWith("Bird")).map(a => b.title))
                                                  //> res4: List[String] = List(Introduction to Functional Programming)
}