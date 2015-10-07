object Lista{

//    def init[T](xs: List[T]): List[T] = xs match {
//        case List() => throw new Error("init of empty list")
//        case List(x) => List()
//        case y :: ys => y :: init(ys)
//    }

    def removeAt[T](n: Int, xs: List[T]) = {

        (xs take n) ::: (xs drop n+1)

//        if(xs.size < n) xs
//        else xs.splitAt(n)._1.dropRight(1) ::: xs.splitAt(n)._2

    }

    val x = List(1,2,3)

    removeAt(2,  x)


}