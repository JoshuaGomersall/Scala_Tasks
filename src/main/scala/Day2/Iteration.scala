package Day2

//TODO
object Iteration {
  def loopText(stringInput: String , repeatTimes: Int): Unit = {
    var i :Int = 0
    while(i < repeatTimes) {
     println(stringInput)
      i += 1
    }
  }


  def loopTextSquare(stringInput: String , repeatTimes: Int): Unit = {
    var loopDown: Int = 0
    var loopLeft: Int = 0
    while (loopDown < repeatTimes) {
        print(stringInput * repeatTimes)
      print("\n")
      loopDown += 1
      loopLeft = 0
    }
  }
}