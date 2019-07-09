package Day1

object Day1 {
  def main(args: Array[String]): Unit = {
    var helloWorldString: String = "Hello World"
    println(helloWorldString)


    helloWorldPrint(helloWorldString)
    println(helloWorld("Hello World"))


    varibleTypeCheck(input = 4)


    println(reduceString("Test Word", 3))

    FizzBuzz.fizzBuzz("Fizz"," Buzz",30)
  }


  def helloWorldPrint(input: String): Unit = {
    println(input)
  }

  def helloWorld(input: String): String = {
    input
  }

  //TODO
  def varibleTypeCheck(input: Unit): Unit = {
    println(input)
  }

  def reduceString(string: String, int: Int): String = {
    string.takeRight(3)
  }

}
