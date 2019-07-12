package BattleShips

object MainGame{

  def takeUserInput(playerName: String , xOrYCords: String) : Int = {
    println(s"Player $playerName Its Your Turn To Choose Your $xOrYCords Coordinates")
    val playerInput = scala.io.StdIn.readInt()

    val playerInputChecked = validateUserInputAgainstGridSize(playerInput)
    playerInputChecked
  }

  def main(args: Array[String]): Unit = {

    val player1 :List[Int] = List(takeUserInput("1","x"), takeUserInput("1","y"))
    val player2 :List[Int] = List(takeUserInput("2","x"),takeUserInput("2","y"))
    println(s"Player 1:${player1.toString()} \nPlayer 2:${player2.toString()}")
  }

  def validateUserInputAgainstGridSize(int: Int , gridMax: Int = 3) : Int = {
    int match {
      case x if x > gridMax =>
        println("The Input Is Larger Than The Grid , Setting Position On Edge Of Grid")
        gridMax
      case x if x < 0 =>
        println("The Input Is Smaller Than The Grid , Setting Position On Edge Of Grid")
        0
      case _ => int
    }
  }

  def playerTurn (enemyCords : List[Int] , guessX : Int , guessY: Int): Unit ={
    if (enemyCords.contains(guessX) && enemyCords.contains(guessY))
      println("Done")
  }
}
