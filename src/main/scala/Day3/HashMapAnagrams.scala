package Day3
import java.nio.file.{Files, Paths}
import scala.io.Source

object HashMapAnagrams {
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

  def readFile(fileLocation: String): Seq[String] = {
    val bufferedSource = io.Source.fromFile(fileLocation)
    val lines = (for (line <- bufferedSource.getLines()) yield line).toList
    bufferedSource.close
    println(lines.toString())
    lines
    }
}