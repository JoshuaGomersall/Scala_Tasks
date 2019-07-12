package BattleShips
object Boat{
  println("Test")
  class BoatAsset(size: String ,var spacesUsed: Int = 1) {
    size match {
      case "small" => spacesUsed = 1
      case "medium" => spacesUsed = 2
      case "large" => spacesUsed = 3
    }
    println(spacesUsed)
  }
}