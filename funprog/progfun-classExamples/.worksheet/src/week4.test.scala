package week4

trait List[T] {
	def isEmpty: Boolean
	def head: T
	def tail: List[T]
}

class Cons[T](val head: T, val tail: List[T]) extends List[T] {
  def isEmpty = false
}

class Nil extends List[Nothing] {
  def isEmpty: Boolean = true
  def head:Nothing = throw new NoSuchElementException("Nil.head")
  def tail:Nothing = throw new NoSuchElementException("Nil.tail")
}

object test {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(416); 
	val x: List[String] = Nil;System.out.println("""x  : week4.List[String] = """ + $show(x ))}
}
