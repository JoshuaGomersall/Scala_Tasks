package Day2

object Functional_1{
  def reverseNumbersWithLimitInput(list: List[Int],takeAmount: Int): List[Int] = {
    list.reverse.take(takeAmount)
  }
}
