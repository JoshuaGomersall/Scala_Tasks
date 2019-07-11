package BattleShips

import scala.util._

object MainGame{
  def main(args: Array[String]): Unit = {

    val player1 :List[Int] = randomLocation(List())
    val player2 :List[Int] = randomLocation(List())
    
  }


  def randomLocation (inputList: List[Int]) : List[Int] ={
    val inputArrayAdded = inputList :+ Random.nextInt(10)
    val inputArrayAdded2 = inputArrayAdded :+ Random.nextInt(10)
    println(inputArrayAdded2)

    inputArrayAdded2
  }




  def playerTurn (enemyCords : List[Int] , guessX : Int , guessY: Int): Unit ={
    if (enemyCords.contains(guessX) && enemyCords.contains(guessY))
      {
        println("Done")
      }
  }
}
