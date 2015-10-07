object exercise1{

//       1
//      1  1
//     1  2  1
//    1  3  3  1
//   1  4  6  4  1
// 1  5  10 10  5  1
//1  6 15  20 15  6  1

  def pascal(c: Int, r: Int): Int = {

    val list = ((0 until r-1) foldLeft  List(1))((x,y) => {
      nextRow(x)
    })

    list(c-1)

  }

  def nextRow(rowAbove: List[Int]): List[Int] = {

    def takeFrom(i: Int): Int =
      if(i < 0 || i >= rowAbove.size) 0 else rowAbove(i)

      (0 until rowAbove.size+1).foldLeft(List[Int]()) (
        (x, y) => x :+ (takeFrom(y - 1) + takeFrom(y))
      )

  }

  pascal(4,6)


}