package BattleShips

import scala.util._


object MainGame{

  def randomInt(limit: Int) : Int = {
    val randomSeed = Random.nextInt(50000)
    val r = new Random(randomSeed)
    r.nextInt(limit)
  }

  def main(args: Array[String]): Unit = {
    val player1 :List[Int] = randomLocation(List())
    val player2 :List[Int] = randomLocation(List())
  }


  def randomLocation (inputList: List[Int]) : List[Int] ={
    val inputArrayAdded = inputList :+ randomInt(10)
    val inputArrayAdded2 = inputArrayAdded :+ randomInt(10)
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
