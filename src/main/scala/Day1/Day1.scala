package Day1

object Day1 {
  def main(args: Array[String]): Unit = {
    var helloWorldString: String = "Hello World"
    println(helloWorldString)
    HelloWorld.helloWorldPrint(helloWorldString)
    println(HelloWorld.helloWorld("Hello World"))


    HelloWorld.varibleTypeCheck(input = 4)


    println(ReduceString.reduceString("Test" , 3))
    FizzBuzz.fizzBuzz("Fizz"," Buzz",30)
  }

}
