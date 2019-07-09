package Day1

object FizzBuzz {
  def fizzBuzz(stringInput: String, stringInput2: String, intInput: Int): String = {
    var i: Int = 1
    while (i < intInput) {
      if (i % 15 == 0){println(stringInput + stringInput2)}
      if (i % 5 == 0){println(stringInput)}
      else if (i % 3 == 0){println(stringInput2)}
      else {println(i)}
      i += 1
    }
    "Done"
  }
}
