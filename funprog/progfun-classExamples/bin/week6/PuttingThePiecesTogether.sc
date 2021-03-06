package week6

object PuttingThePiecesTogether {
  val mnemonics =
    Map('2' -> "ABC",
      '3' -> "DEF",
      '4' -> "GHI",
      '5'
        ->
        "JKL",
      '6'
        ->
        "MNO",
      '7'
        ->
        "PQRS",
      '8'
        ->
        "TUV",
      '9'
        ->
        "WXYZ")                                   //> mnemonics  : scala.collection.immutable.Map[Char,String] = Map(8 -> TUV, 4 -
                                                  //| > GHI, 9 -> WXYZ, 5 -> JKL, 6 -> MNO, 2 -> ABC, 7 -> PQRS, 3 -> DEF)

  val charCode: Map[Char, Char] =
    for ((digit, str) <- mnemonics; ltr <- str) yield ltr -> digit
                                                  //> charCode  : Map[Char,Char] = Map(E -> 3, X -> 9, N -> 6, T -> 8, Y -> 9, J -
                                                  //| > 5, U -> 8, F -> 3, A -> 2, M -> 6, I -> 4, G -> 4, V -> 8, Q -> 7, L -> 5,
                                                  //|  B -> 2, P -> 7, C -> 2, H -> 4, W -> 9, K -> 5, R -> 7, O -> 6, D -> 3, Z -
                                                  //| > 9, S -> 7)
}