package week7

object LazyEvaluation {
  //Do things as late as possible and never do them twice
  // Scala uses strict-evaluation by default
  def expr = {
  val x = { print("x "); 1}
  lazy val y = { print("y ");2}
  def z = { print("z ");3}
  
  z+y+x+z+y+x
  }                                               //> expr: => Int
  
  expr                                            //> x z y z res0: Int = 12
  
  
  }