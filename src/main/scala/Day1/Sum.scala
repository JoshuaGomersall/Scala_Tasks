package Day1

object Sum{
  def add(int: Int, int2: Int): Int = {int + int2}

  def addOrMultiply(int: Int, int2: Int , addCheck: Boolean): Int =
    if (int == 0) {
      return int2
    }
    else if (addCheck) {
    return int + int2
  }
  else {
    return int * int2
  }

}
