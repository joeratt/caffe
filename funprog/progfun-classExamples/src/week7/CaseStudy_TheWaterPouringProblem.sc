package week7

object CaseStudy_TheWaterPouringProblem {
	val problem = new Pouring(Vector(4,9,19)) //> problem  : week7.Pouring = week7.Pouring@5ff3cd32
	
	problem.moves                             //> res0: scala.collection.immutable.IndexedSeq[Product with Serializable with w
                                                  //| eek7.CaseStudy_TheWaterPouringProblem.problem.Move] = Vector(Empty(0), Empty
                                                  //| (1), Empty(2), Fill(0), Fill(1), Fill(2), Pour(0,1), Pour(0,2), Pour(1,0), P
                                                  //| our(1,2), Pour(2,0), Pour(2,1))
	problem.pathSets.take(3).toList           //> res1: List[Set[week7.CaseStudy_TheWaterPouringProblem.problem.Path]] = List(
                                                  //| Set(-->Vector(0, 0, 0)), Set(Fill(0)-->Vector(4, 0, 0), Fill(1)-->Vector(0, 
                                                  //| 9, 0), Fill(2)-->Vector(0, 0, 19)), Set(Fill(2) Pour(2,1)-->Vector(0, 9, 10)
                                                  //| , Fill(1) Fill(2)-->Vector(0, 9, 19), Fill(1) Fill(0)-->Vector(4, 9, 0), Fil
                                                  //| l(0) Pour(0,2)-->Vector(0, 0, 4), Fill(0) Fill(2)-->Vector(4, 0, 19), Fill(2
                                                  //| ) Pour(2,0)-->Vector(4, 0, 15), Fill(1) Pour(1,0)-->Vector(4, 5, 0), Fill(0)
                                                  //|  Pour(0,1)-->Vector(0, 4, 0), Fill(1) Pour(1,2)-->Vector(0, 0, 9), Fill(0) F
                                                  //| ill(1)-->Vector(4, 9, 0), Fill(2) Fill(1)-->Vector(0, 9, 19), Fill(2) Fill(0
                                                  //| )-->Vector(4, 0, 19)))
   problem.solutions(17)                          //> res2: Stream[week7.CaseStudy_TheWaterPouringProblem.problem.Path] = Stream(F
                                                  //| ill(0) Fill(1) Pour(1,2) Pour(0,2) Fill(0) Pour(0,2)-->Vector(0, 0, 17), ?)
}