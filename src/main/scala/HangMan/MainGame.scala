package HangMan

import BattleShips.MainGame.validateUserInputAgainstGridSize

object MainGame{
  def main(args: Array[String]): Unit = {


    val word = "t e s t".split(" ").toList
    println(word)

    val wordeasy:List[Char] = List('t','e','s')
    val wordmedium:List[Char] = List('s','c','a','l','a')
    val wordhard:List[Char] = List('h','e','l','l','o',' ','w' ,'o' ,'r','l','d')

    print("_ " * word.length + "\n")

    guessingStage(word,5)
  }

  def playerLivesDisplay (lives: Int) : Unit =
  lives match {
    case 5 => println("You Fine")
    case 4 =>
    case 3 =>
    case 2 =>
    case 1 =>
    case 0 => print(" ___________.._______\n| .__________))______|\n| | / /      ||\n| |/ /       ||\n| | /        ||.-''.\n| |/         |/  _  \\\n| |          ||  `/,|\n| |          (\\\\`_.'\n| |         .-`--'.\n| |        /Y . . Y\\\n| |       // |   | \\\\\n| |      //  | . |  \\\\\n| |     ')   |   |   (`\n| |          ||'||\n| |          || ||\n| |          || ||\n| |          || ||\n| |         / | | \\\n\"\"\"\"\"\"\"\"\"\"|_`-' `-' |\"\"\"|\n|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|\n| |        \\ \\        | |\n: :         \\ \\       : : \n. .          `'       . .")
  }


  def guessingStage (correctWord: List[String] ,lives : Int) : Unit = {
    println(s"You Have $lives Lives")
    val playerInput = scala.io.StdIn.readChar()
    println(s"Guess : $playerInput")
    playerInput match {
      case x if correctWord.contains(x) =>
        println("Correct")
        playerLivesDisplay(lives)
        guessingStage(correctWord,lives)
      case x if !correctWord.contains(x) =>
        println("Wrong")
        val livesupdated = lives -1
        playerLivesDisplay(livesupdated)
        guessingStage(correctWord,livesupdated)
    }
  }
}
