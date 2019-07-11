package Day1

object Day1 {
  def main(args: Array[String]): Unit = {
    var helloWorldString: String = "Hello World"
    println(helloWorldString)
    HelloWorld.helloWorldPrint(helloWorldString)
    println(HelloWorld.helloWorld("Hello World"))


    HelloWorld.varibleTypeCheck("TestMessage")


    println(ReduceString.reduceString("Test" , 3))
    println(Sum.add(4,3))

  }
}
