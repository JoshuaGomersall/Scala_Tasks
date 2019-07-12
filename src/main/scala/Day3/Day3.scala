package Day3


object Day3 {
  def main(args: Array[String]): Unit = {

    println(TooHotChecker.summerHeatChecker(80,isSummer = false))
    println(TooHotChecker.summerHeatChecker(100,isSummer = false))
    println(TooHotChecker.summerHeatChecker(100,isSummer = true))
    println(TooHotChecker.summerHeatChecker(55,isSummer = true))

    //HashMapAnagrams.checkReadFromFileExists("random file name")
    HashMapAnagrams.checkReadFromFileExists(".gitignore")

    HashMapAnagrams.orderString("frjrdgseh")



  }
}
