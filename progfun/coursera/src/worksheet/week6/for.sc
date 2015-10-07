object fors{


  case class Book(title: String, authors: List[String])

  val books: List[Book] =

    List(
      Book(
        title = "Book 1",
        authors = List("Author 1", "Author 2")
      ),
      Book(
        title = "Book 2",
        authors = List("Author 3", "Author 4")
      )
    )

  for (b <- books; a <- b.authors if a startsWith "Bird")
    yield b.title

  //Compiler Translation

  books.flatMap(b => for(a <- b.authors if a startsWith "Bird") yield b.authors)

  //or

  books.flatMap(_.authors.filter(_.startsWith("Bird")))



}