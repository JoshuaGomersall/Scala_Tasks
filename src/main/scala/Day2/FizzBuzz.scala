package Day2

object FizzBuzz {
  def fizzBuzz(stringInput: String, stringInput2: String, intInput: Int): Unit = {
    var i: Int = 1
    for (i <- 1 to intInput)
      intInput match {
        case x if (i % 15 == 0) => println(s"$i Is : $stringInput $stringInput2")
        case x if (i % 5 == 0) => println(s"$i Is : $stringInput")
        case x if (i % 3 == 0) => println(s"$i Is : $stringInput2")
        case _ => println(s"$i is not $stringInput or $stringInput2")
      }
  }
}
