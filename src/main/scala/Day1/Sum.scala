package Day1

object Sum{
  def add(int: Int, int2: Int): Int = {int + int2}

  def addOrMultiply(int: Int, int2: Int , addCheck: Boolean): Int =
    if (int == 0 && int == 0) {
      '0'
    }
    else if (addCheck) {
    int + int2
  }
  else {
    int * int2
  }

}
