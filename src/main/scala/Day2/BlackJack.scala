package Day2

object BlackJack{
  def blackJackCompareInts(player1: Int, player2: Int): Int = {
    player1 match {
      case x if (x > 21 && player2 > 21) => 0
      case x if (x > 21) => player2
      case x if (player2 > 21) => player1
      case _ => math.max(player1,player2)
    }
  }
}
