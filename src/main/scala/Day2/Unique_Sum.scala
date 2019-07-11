package Day2

//TODO
object Unique_Sum {
  def uniqueSum3Numbers(number1: Int , number2: Int , number3: Int) :Int = {
    val values :List[Int] = List(number1 , number2 , number3)
    val nonUnique: List[Int] = values.distinct
    println(nonUnique)
    if (values.length != nonUnique.length){
      println(s"The difference is ${values.length - nonUnique.length}")
    }
    else {
      println(s"The values are unquie")
      return values.sum
    }
    var unique: List[Int] = List()
    for (i <- 0 to values.length - 1) {
      if (values.contains(values(i))){
        println(s"The Value $i is not unique")
      }
      else {
        unique = unique :+ i
        println(unique.toString())
      }
    }
    unique.sum
  }
}
