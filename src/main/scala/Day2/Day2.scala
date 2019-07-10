package Day2

object Day2 {
  def main(args: Array[String]): Unit = {
    Iteration.LoopText("Joshwa is great" , 3)

    Iteration.LoopTextSquare("H",4)
    Iteration.LoopTextSquare("O",50)

    FizzBuzz.fizzBuzz("BUZZ" , "FIZZ" , 68)

    println(SwapNumberOrder.reverseNumbers(List(1,2,3,4,5)))

    println(SwapNumberOrder.reverseNumbersFirstTwoOnly(List(1,2,3,4,5)))
  }
}
