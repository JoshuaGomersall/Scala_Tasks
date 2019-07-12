package Day4

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object Day4 {
  def main(args: Array[String]): Unit = {
    EventTimeChecker.checkIfEvenHasStarted("Beer Fridge" ,16.30,19.00)
  }
}
