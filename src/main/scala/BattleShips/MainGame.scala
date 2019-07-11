package BattleShips

import scala.util._

object MainGame{
  def main(args: Array[String]): Unit = {

    val player1 :List[Int] = randomLocation(List())
    val player2 :List[Int] = randomLocation(List())
    
  }


  def randomLocation (inputList: List[Int]) : List[Int] ={
    var inputArrayAdded = inputList :+ Random.nextInt(10)
    inputArrayAdded = inputArrayAdded :+ Random.nextInt(10)
    println(inputArrayAdded)

    inputArrayAdded
  }




  def playerTurn (enemyCords : List[Int] , guessX : Int , guessY: Int): Unit ={

    if (enemyCords.contains(guessX) && enemyCords.contains(guessY))
      {
        println("Done")
      }
  }
}
