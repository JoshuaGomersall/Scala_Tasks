package Day1

object ReduceString{
  def reduceString(string: String, int: Int): String = {
    string.takeRight(int)
  }

}
