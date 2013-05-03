package week4

trait List[T] {
	def isEmpty: Boolean
	def head: T
	def tail: List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}

object Nil extends List[Nothing] {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(241); 
  def isEmpty: Boolean = true;System.out.println("""isEmpty: => Boolean""");$skip(66); 
  def head:Nothing = throw new NoSuchElementException("Nil.head");System.out.println("""head: => Nothing""");$skip(66); 
  def tail:Nothing = throw new NoSuchElementException("Nil.tail");System.out.println("""tail: => Nothing""")}
}

object test {
	val x: List[String] = Nil
}
