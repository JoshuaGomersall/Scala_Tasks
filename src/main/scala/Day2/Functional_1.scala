package Day2

import java.util.TimeZone.getAvailableIDs

//TODO
object Functional_1{
  def reverseNumbers(list: List[Int]): List[Int] = {
    list.reverse
  }

  def reverseNumbersFirstTwoOnly(list: List[Int]): List[Int] = {
    list.reverse.take(2)
  }
}
