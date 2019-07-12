package HangMan

import BattleShips.MainGame.validateUserInputAgainstGridSize

object MainGame{
  def main(args: Array[String]): Unit = {

    val guessedLetters:List[String] = List()
    val word = selectDifficulty(scala.io.StdIn.readLine())
    print("_ " * word.length + "\n")

    guessingStage(word ,guessedLetters,List(),5)
  }

  def selectDifficulty(difficultyChoice: String) : List[String] = {
    difficultyChoice match {
      case "easy" | "e" => List("t","s","e")
      case "medium" | "m" => List("s","c","a","l","a")
      case "hard" | "h" => List("h","e","l","l","o"," ","w","o","r","l","d")
      case _ => println(s"Not A Valid Input \n Try easy ,medium or hard")
        selectDifficulty(scala.io.StdIn.readLine())
    }
  }

  def playerLivesDisplay (lives: Int) : Unit =
    lives match {
      case 5 => println("You Fine")
      case 4 => println(" ___________.._______\n| .__________________|\n| | / /      \n| |/ /       \n| | /        \n| |/         \n| |          \n| |          \n| |          \n| |        \n| |       \n| |      \n| |     \n| |          \n| |          \n| |          \n| |          \n| |         \n\"\"\"\"\"\"\"\"\"\"|\"\"\"|\"\"\"\"|\"\"\"\"\"|\n|\"|\"\"\"\"\"\"\"            |\"|\n| |                   | |\n: :                   : : \n. .                   . .")
      case 3 => println(" ___________.._______\n| .__________))______|\n| | / /      ||\n| |/ /       ||\n| | /        ||.-''.\n| |/         |/  _  \\\n| |          ||  `/,|\n| |          (\\\\`_.'\n| |          -`--'.\n| |        \n| |       \n| |      \n| |     \n| |          \n| |          \n| |          \n| |          \n| |         \n\"\"\"\"\"\"\"\"\"\"|\"\"\"|\"\"\"\"|\"\"\"\"\"|\n|\"|\"\"\"\"\"\"\"          |\"|\n| |                   | |\n: :                   : : \n. .                   . .")
      case 2 => println(" ___________.._______\n| .__________))______|\n| | / /      ||\n| |/ /       ||\n| | /        ||.-''.\n| |/         |/  _  \\\n| |          ||  `/,|\n| |          (\\\\`_.'\n| |         .-`--'.\n| |        /Y . . Y\\\n| |       // |   | \\\\\n| |      //  | . |  \\\\\n| |     ')   |   |   (`\n| |          \n| |          \n| |          \n| |          \n| |         \n\"\"\"\"\"\"\"\"\"\"|\"\"\"|\"\"\"\"|\"\"\"\"\"|\n|\"|\"\"\"\"\"\"\"          |\"|\n| |                   | |\n: :                   : : \n. .                   . .")
      case 1 => println(" ___________.._______\n| .__________))______|\n| | / /      ||\n| |/ /       ||\n| | /        ||.-''.\n| |/         |/  _  \\\n| |          ||  `/,|\n| |          (\\\\`_.'\n| |         .-`--'.\n| |        /Y . . Y\\\n| |       // |   | \\\\\n| |      //  | . |  \\\\\n| |     ')   |   |   (`\n| |          ||'||\n| |          || ||\n| |          || ||\n| |          || ||\n| |         / | | \\\n\"\"\"\"\"\"\"\"\"\"|\"\"\"|\"\"\"\"|\"\"\"\"\"|\n|\"|\"\"\"\"\"\"\"          |\"|\n| |                   | |\n: :                   : : \n. .                   . .")
      case 0 => print(" ___________.._______\n| .__________))______|\n| | / /      ||\n| |/ /       ||\n| | /        ||.-''.\n| |/         |/  _  \\\n| |          ||  `/,|\n| |          (\\\\`_.'\n| |         .-`--'.\n| |        /Y . . Y\\\n| |       // |   | \\\\\n| |      //  | . |  \\\\\n| |     ')   |   |   (`\n| |          ||'||\n| |          || ||\n| |          || ||\n| |          || ||\n| |         / | | \\\n\"\"\"\"\"\"\"\"\"\"|_`-' `-' |\"\"\"|\n|\"|\"\"\"\"\"\"\"\\ \\       '\"|\"|\n| |        \\ \\        | |\n: :         \\ \\       : : \n. .          `'       . .")
        println("\nYou Are Dead")
        sys.exit(1)
    }

  def guessingStage (correctWord: List[String] ,guessedLetters: List[String]  ,correctLetters: List[String], lives : Int) : Unit = {
    println(s"You Have $lives Lives")

    println(s"You Have Guessed $guessedLetters Before")

    val playerInput = scala.io.StdIn.readLine().charAt(0).toLower.toString
    println(s"Guess : $playerInput")


    List(1, 2, 2, 1, 1).distinct.length == 1 // returns false
    List(1, 1, 1, 1, 1).distinct.length == 1 // returns true
    println(List().distinct.length == 1)

    println(s"You Have Guessed $guessedLetters")

    if(correctLetters.sorted == correctWord.sorted)
      {
        println("YOU DID IT")
        sys.exit()
      }

    playerInput match {
      case x if guessedLetters.contains(x) =>
        println("You Have Already Tried This Before")
        playerLivesDisplay(lives)
        println(guessedLetters)
        guessingStage(correctWord,guessedLetters,correctLetters,lives)
      case x if correctWord.contains(x) =>
        println("Correct")
        playerLivesDisplay(lives)
        val newGuessedLetters = guessedLetters :+ playerInput
        println(newGuessedLetters)
        val newCorrectLetters = correctLetters :+ playerInput
        guessingStage(correctWord,newGuessedLetters,newCorrectLetters,lives)
      case x if !correctWord.contains(x) =>
        println("Wrong")
        val livesUpdated = lives -1
        playerLivesDisplay(livesUpdated)
        val newGuessedLetters = guessedLetters :+ playerInput
        println(newGuessedLetters)
        guessingStage(correctWord,newGuessedLetters,correctLetters,livesUpdated)
    }
  }
}
