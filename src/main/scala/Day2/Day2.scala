package Day2

object Day2 {
  def main(args: Array[String]): Unit = {
    Iteration.loopText("Joshwa is great" , 3)

    Iteration.loopTextSquare("H",4)
    Iteration.loopTextSquare("O",50)

    FizzBuzz.fizzBuzz("BUZZ" , "FIZZ" , 68)

    println(SwapNumberOrder.reverseNumbers(List(1,2,3,4,5)))

    println(SwapNumberOrder.reverseNumbersFirstTwoOnly(List(1,2,3,4,5)))


    println(BlackJack.blackJackCompareInts(18,21))
    println(BlackJack.blackJackCompareInts(20,18))
    println(BlackJack.blackJackCompareInts(29,5))
    println(BlackJack.blackJackCompareInts(22,22))
  }
}
