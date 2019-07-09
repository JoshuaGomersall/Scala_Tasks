package Day1

object Day1 {
    def main(args: Array[String]): Unit = {
      var helloWorldString : String = "Hello World"
      println(helloWorldString)


      helloWorldPrint(helloWorldString)
      println(helloWorld("Hello World"))


      varibleTypeCheck(4)


    }




  def helloWorldPrint (input: String) : Unit = {
    println(input)
  }

    def helloWorld (input: String) : String = {
      input
    }

  def varibleTypeCheck (input : String) : String = {
    input
  }
}
