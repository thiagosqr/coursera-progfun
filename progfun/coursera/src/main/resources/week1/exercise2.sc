object exercise2{

  def balance(chars: List[Char]): Boolean =
    chars.foldLeft(0)((l,c) => {
      c match {
        case '(' => l+1
        case ')' => l-1
        case _ => l
      }
    }) == 0

  balance("(if (zero? x) max (/ 1 x))".toList)

}