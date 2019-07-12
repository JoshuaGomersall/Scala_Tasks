import collection.mutable.Stack
import org.scalatest._
import Day2._

class Day2Tests extends FlatSpec with Matchers {
  //BlackJack Tests
  it should "say 21" in{
    BlackJack.blackJackCompareInts(21,5) should be (21)
  }
  it should "say 12" in{
    BlackJack.blackJackCompareInts(29,12) should be (12)
  }
  it should "say 13" in{
    BlackJack.blackJackCompareInts(13,211) should be (13)
  }
  it should "say 0" in{
    BlackJack.blackJackCompareInts(27,22) should be (0)
  }
  it should "unapply and be fine" in{
    val blackJackGameInstance = BlackJack.blackJackCompareInts(12,4)
  }

  it should "say fizz" in{
    FizzBuzz.fizzBuzz("fizz","buzz",3) should be ()
  }

  it should "say buzz" in{
    FizzBuzz.fizzBuzz("fizz","buzz",5) should be ()
  }

  it should "say fizz buzz" in{
    FizzBuzz.fizzBuzz("fizz","buzz",15) should be ()
  }
  
  it should "WORK" in{
    Day2.toString
    FizzBuzz.toString
  }

}
