package Day4

import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

object EventTimeChecker {

  def checkIfEvenHasStarted (eventName: String ,startTime: Double ,endTime: Double) : Boolean = {

    val dtf = DateTimeFormatter.ofPattern("HH.mm")
    val now = LocalDateTime.now()
    val check = dtf.format(now).toDouble
    println(dtf.format(now))

    check match {
      case x if x > startTime =>
        println(s"The Event $eventName Has Started")
        true
      case x if x < startTime =>
        println(s"The Event $eventName Has Not Started Yet")
        false
    }
    Thread.sleep(6000)
    checkIfEvenHasStarted(eventName,startTime,endTime)
    true
  }
}
