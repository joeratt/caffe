package week4

object PatternMatching {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(149); 

  def eval(e: Expr): Int = e match {
    case Number(n) => n
    case Sum(e1, e2) => eval(e1) + eval(e2)
  };System.out.println("""eval: (e: week4.Expr)Int""");$skip(214); 
  
  def show(e: Expr): String = e match {
  	case Number(n) => n.toString
  	case Sum(e1,e2) => show(e1) + " + " + show(e2)
  	case Var(x) => x
  	case Prod(e1,e2) => figureParen(e1) + " * " + figureParen(e2)
  };System.out.println("""show: (e: week4.Expr)String""");$skip(125); 
  
  def figureParen(e:Expr): String = e match {
  		case Sum(e1,e2) => "(" + show(e) + ")"
  		case default => show(e)
  	};System.out.println("""figureParen: (e: week4.Expr)String""");$skip(21); val res$0 = 
  
  eval(Number(1));System.out.println("""res0: Int = """ + $show(res$0));$skip(33); val res$1 = 
  eval(Sum(Number(1),Number(2)));System.out.println("""res1: Int = """ + $show(res$1));$skip(21); val res$2 = 
  
  show(Number(1));System.out.println("""res2: String = """ + $show(res$2));$skip(33); val res$3 = 
  show(Sum(Number(1),Number(2)));System.out.println("""res3: String = """ + $show(res$3));$skip(55); val res$4 = 
  
  show(Sum(Number(33),Sum(Number(55),Number(-33))));System.out.println("""res4: String = """ + $show(res$4));$skip(50); val res$5 = 
  
  show(Sum(Prod(Number(2),Var("x")),Var("y")));System.out.println("""res5: String = """ + $show(res$5));$skip(65); val res$6 = 
  
  show(Prod(Sum(Number(2),Var("x")),Sum(Number(3),Var("y"))));System.out.println("""res6: String = """ + $show(res$6))}
}

trait Expr {
	def eval(e: Expr): Int = e match {
    case Number(n) => n
    case Sum(e1, e2) => eval(e1) + eval(e2)
  }
}
case class Number(n: Int) extends Expr
case class Sum(e1: Expr, e2: Expr) extends Expr
case class Var(name: String) extends Expr
case class Prod(e1: Expr, e2: Expr) extends Expr
