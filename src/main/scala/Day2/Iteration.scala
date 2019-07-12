package Day2

object Iteration {
  def loopText(stringInput: String , repeatTimes: Int): Unit = {
    for (i <- 1 to repeatTimes) {
      println(stringInput)
    }
  }


  def loopTextSquare(stringInput: String , repeatTimes: Int): Unit = {
    for (i <- 1 to repeatTimes) {
      println(stringInput * repeatTimes)
    }
  }
}
