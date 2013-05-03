package week4

trait List2[+T] {
	def isEmpty: Boolean
	def head: T
	def tail: List2[T]
}

class Cons2[T](val head: T, val tail: List2[T]) extends List2[T] {
  def isEmpty = false
}

object Nil2 extends List2[Nothing] {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(249); 
  def isEmpty: Boolean = true;System.out.println("""isEmpty: => Boolean""");$skip(66); 
  def head:Nothing = throw new NoSuchElementException("Nil.head");System.out.println("""head: => Nothing""");$skip(66); 
  def tail:Nothing = throw new NoSuchElementException("Nil.tail");System.out.println("""tail: => Nothing""")}
}

object test {
	val x: List2[String] = Nil2
}
