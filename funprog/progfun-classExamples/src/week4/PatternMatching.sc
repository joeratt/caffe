package week4

object PatternMatching {

  def eval(e: Expr): Int = e match {
    case Number(n) => n
    case Sum(e1, e2) => eval(e1) + eval(e2)
  }                                               //> eval: (e: week4.Expr)Int
  
  def show(e: Expr): String = e match {
  	case Number(n) => n.toString
  	case Sum(e1,e2) => show(e1) + " + " + show(e2)
  	case Var(x) => x
  	case Prod(e1,e2) => figureParen(e1) + " * " + figureParen(e2)
  }                                               //> show: (e: week4.Expr)String
  
  def figureParen(e:Expr): String = e match {
  		case Sum(e1,e2) => "(" + show(e) + ")"
  		case default => show(e)
  	}                                         //> figureParen: (e: week4.Expr)String
  
  eval(Number(1))                                 //> res0: Int = 1
  eval(Sum(Number(1),Number(2)))                  //> res1: Int = 3
  
  show(Number(1))                                 //> res2: String = 1
  show(Sum(Number(1),Number(2)))                  //> res3: String = 1 + 2
  
  show(Sum(Number(33),Sum(Number(55),Number(-33))))
                                                  //> res4: String = 33 + 55 + -33
  
  show(Sum(Prod(Number(2),Var("x")),Var("y")))    //> res5: String = 2 * x + y
  
  show(Prod(Sum(Number(2),Var("x")),Sum(Number(3),Var("y"))))
                                                  //> res6: String = (2 + x) * (3 + y)
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