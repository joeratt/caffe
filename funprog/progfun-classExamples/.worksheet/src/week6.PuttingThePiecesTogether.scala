package week6

object PuttingThePiecesTogether {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(310); 
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
        "WXYZ");System.out.println("""mnemonics  : scala.collection.immutable.Map[Char,String] = """ + $show(mnemonics ));$skip(102); 

  val charCode: Map[Char, Char] =
    for ((digit, str) <- mnemonics; ltr <- str) yield ltr -> digit;System.out.println("""charCode  : Map[Char,Char] = """ + $show(charCode ))}
}
