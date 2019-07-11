package Day1

object Sum{
  def add(int: Int, int2: Int): Int = {int + int2}

  def addOrMultiply(int: Int, int2: Int , addCheck: Boolean): Int = {
    addCheck match {
      case _ if (int == 0 && int == 0) => 0
      case true => int + int2
      case false => int * int2
    }
  }
}
