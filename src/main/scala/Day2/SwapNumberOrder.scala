package Day2

//TODO
object SwapNumberOrder {
  def reverseNumbers(list: List[Int]): List[Int] = {
    list.reverse
  }

  def reverseNumbersFirstTwoOnly(list: List[Int]): List[Int] = {
    list.reverse.take(2)
  }
}
