package week6

case class Book(title: String, authors: List[String])

object QueriesWithFor {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
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

  for {
    b1 <- books
    b2 <- books
    if b1.title < b2.title
    a1 <- b1.authors
    a2 <- b2.authors
    if a1 == a2
  } yield a1                                      //> res0: List[String] = List(Bloch, Joshua)

  books.flatMap(b => b.authors.withFilter(a => a.startsWith("Bird")).map(a => b.title))
                                                  //> res1: List[String] = List(Introduction to Functional Programming)

}