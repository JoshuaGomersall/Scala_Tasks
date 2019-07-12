package Day4

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object EventTimeChecker {

  def checkIfEvenHasStarted (eventName: String ,startTime: Double ,endTime: Double) : Boolean = {


    val dtf = DateTimeFormatter.ofPattern("HH.mm")
    val now = LocalDateTime.now()
    val check = dtf.format(now).toDouble
    println(dtf.format(now))
    println(check)

    check match {
      case x if x > startTime =>
        println("The Event Has Started")
        true
      case x if x < startTime =>
        println("The Event Has Started")
        false
    }
  }

}
