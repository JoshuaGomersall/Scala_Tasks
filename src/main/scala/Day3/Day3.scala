package Day3


object Day3 {
  def main(args: Array[String]): Unit = {

    println(TooHotChecker.summerHeatChecker(80,false))
    println(TooHotChecker.summerHeatChecker(100,false))
    println(TooHotChecker.summerHeatChecker(100,true))

    HashMapAnagrams.checkReadFromFileExists("random file name")
    HashMapAnagrams.checkReadFromFileExists("target/scala-2.13/classes/Day3/examplefile.txt")


    HashMapAnagrams.orderString("frjrdgseh")



  }
}
