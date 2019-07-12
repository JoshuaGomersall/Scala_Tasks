package Day3

object TooHotChecker{
  def summerHeatChecker(temperature: Int , isSummer: Boolean): Boolean = {
    isSummer match {
      case x if x && temperature <= 100 && temperature > 60 => true
      case x if !x && temperature <= 90 && temperature > 60 => true
      case _ => false
    }
  }
}
