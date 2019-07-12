package HangMan

import BattleShips.MainGame.validateUserInputAgainstGridSize

object MainGame{
  def main(args: Array[String]): Unit = {


    val word = "t e s ".split(" ").toList
    println(word)
    val guessedLetters:List[String] = List()

    val wordeasy:List[String] = List("t","s","e")
    val wordmedium:List[Char] = List('s','c','a','l','a')
    val wordhard:List[Char] = List('h','e','l','l','o',' ','w' ,'o' ,'r','l','d')

    print("_ " * word.length + "\n")

    guessingStage(wordeasy ,guessedLetters,5)
  }

  def playerLivesDisplay (lives: Int) : Unit =
  lives match {
    case 5 => println("You Fine")
    case 4 => println(" ___________.._______\n| .__________________|\n| | / /      \n| |/ /       \n| | /        \n| |/         \n| |          \n| |          \n| |          \n| |        \n| |       \n| |      \n| |     \n| |          \n| |          \n| |          \n| |          \n| |         \n\"\"\"\"\"\"\"\"\"\"|\"\"\"|\"\"\"\"|\"\"\"\"\"|\n|\"|\"\"\"\"\"\"\"            |\"|\n| |                   | |\n: :                   : : \n. .                   . .")
    case 3 => println(" ___________.._______\n| .__________))______|\n| | / /      ||\n| |/ /       ||\n| | /        ||.-''.\n| |/         |/  _  \\\n| |          ||  `/,|\n| |          (\\\\`_.'\n| |          -`--'.\n| |        \n| |       \n| |      \n| |     \n| |          \n| |          \n| |          \n| |          \n| |         \n\"\"\"\"\"\"\"\"\"\"|\"\"\"|\"\"\"\"|\"\"\"\"\"|\n|\"|\"\"\"\"\"\"\"          |\"|\n| |                   | |\n: :                   : : \n. .                   . .")
    case 2 => println(" ___________.._______\n| .__________))______|\n| | / /      ||\n| |/ /       ||\n| | /        ||.-''.\n| |/         |/  _  \\\n| |          ||  `/,|\n| |          (\\\\`_.'\n| |         .-`--'.\n| |        /Y . . Y\\\n| |       // |   | \\\\\n| |      //  | . |  \\\\\n| |     ')   |   |   (`\n| |          \n| |          \n| |          \n| |          \n| |         \n\"\"\"\"\"\"\"\"\"\"|\"\"\"|\"\"\"\"|\"\"\"\"\"|\n|\"|\"\"\"\"\"\"\"          |\"|\n| |                   | |\n: :                   : : \n. .                   . .")
    case 1 => println(" ___________.._______\n| .__________))______|\n| | / /      ||\n| |/ /       ||\n| | /        ||.-''.\n| |/         |/  _  \\\n| |          ||  `/,|\n| |          (\\\\`_.'\n| |         .-`--'.\n| |        /Y . . Y\\\n| |       // |   | \\\\\n| |      //  | . |  \\\\\n| |     ')   |   |   (`\n| |          ||'||\n| |          || ||\n| |          || ||\n| |          || ||\n| |         / | | \\\n\"\"\"\"\"\"\"\"\"\"|\"\"\"|\"\"\"\"|\"\"\"\"\"|\n|\"|\"\"\"\"\"\"\"          |\"|\n| |                   | |\n: :                   : : \n. .                   . .")
    case 0 => print(" ___________.._______\n| .__________))______|\n| | / /      ||\n| |/ /       ||\n| | /        ||.-''.\n| |/         |/  _  \\\n| |          ||  `/,|\n| |          (\\\\`_.'\n| |         .-`--'.\n| |        /Y . . Y\\\n| |       // |   | \\\\\n| |      //  | . |  \\\\\n| |     ')   |   |   (`\n| |          ||'||\n| |          || ||\n| |          || ||\n| |          || ||\n| |         / | | \\\n\"\"\"\"\"\"\"\"\"\"|_`-' `-' |\"\"\"|\n|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|\n| |        \\ \\        | |\n: :         \\ \\       : : \n. .          `'       . .")
  }

  def guessingStage (correctWord: List[String] ,guessedLetters: List[String]  ,lives : Int) : Unit = {
    println(s"You Have $lives Lives")

    println(s"You Have Guessed $guessedLetters Before")

    val playerInput = scala.io.StdIn.readLine().charAt(0).toLower.toString
    println(s"Guess : $playerInput")



    if (correctWord.equals(guessedLetters.toString()))
      {
        println("YOU DID IT")
      }

    playerInput match {
      case x if (guessedLetters.contains(x)) => {
        println("You Have Already Tried This Before")
        playerLivesDisplay(lives)
        println(guessedLetters)
        guessingStage(correctWord,guessedLetters,lives)
      }
      case x if correctWord.contains(x) =>
        println("Correct")
        playerLivesDisplay(lives)
        val newGuessedLetters = guessedLetters :+ playerInput
        println(newGuessedLetters)
        guessingStage(correctWord,newGuessedLetters,lives)
      case x if !correctWord.contains(x) =>
        println("Wrong")
        val livesupdated = lives -1
        playerLivesDisplay(livesupdated)
        val newGuessedLetters = guessedLetters :+ playerInput
        println(newGuessedLetters)
        guessingStage(correctWord,newGuessedLetters,livesupdated)
    }
  }
}
