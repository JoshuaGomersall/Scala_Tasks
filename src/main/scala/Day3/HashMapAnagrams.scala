package Day3
import java.nio.file.{Files, Paths}
import scala.io.Source

object HashMapAnagrams {
  var wordsStored:Array[String] = Array()

  def checkReadFromFileExists(fileLocation: String): Unit = {
    if (!Files.exists(Paths.get(fileLocation))) {
      println("File does not exist")
      readFile("target/scala-2.13/classes/Day3/examplefile.txt")
    }
    else {
      println(s"Using The File Path $fileLocation")
      readFile(fileLocation)
    }
  }

  def orderString(userInput: String): Any = {
    val splitCharacters : List[Char] = userInput.toList.sorted
    println(splitCharacters.toString())
  }

  def readFile(fileLocation: String): Any = {
    for (line <- Source.fromFile(fileLocation).getLines()) {
      println(line)
      wordsStored = wordsStored :+ line
    }
    println(wordsStored.toList.toString)
    println(wordsStored.toList.length.toString)
  }
}