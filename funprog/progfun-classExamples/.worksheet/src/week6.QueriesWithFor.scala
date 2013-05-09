package week6

case class Book(title: String, authors: List[String])

object QueriesWithFor {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(137); 
  println("Welcome to the Scala worksheet");$skip(546); 
  
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
        "Venners, Bill")));System.out.println("""books  : List[week6.Book] = """ + $show(books ));$skip(139); val res$0 = 

  for {
    b1 <- books
    b2 <- books
    if b1.title < b2.title
    a1 <- b1.authors
    a2 <- b2.authors
    if a1 == a2
  } yield a1;System.out.println("""res0: List[String] = """ + $show(res$0));$skip(89); val res$1 = 

  books.flatMap(b => b.authors.withFilter(a => a.startsWith("Bird")).map(a => b.title));System.out.println("""res1: List[String] = """ + $show(res$1))}

}
