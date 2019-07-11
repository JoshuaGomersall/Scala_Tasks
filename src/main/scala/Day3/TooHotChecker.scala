package Day3

object TooHotChecker{
  def summerHeatChecker(temperature: Int , isSummer: Boolean): Boolean = {

    var upperLimit = 90

    isSummer match {
      case true => upperLimit = 100
    }



    true
  }
}
