package Day2

object BlackJack{
  def blackJackCompareInts(player1: Int, player2: Int): Int = {
    if (player1 > 21 && player2 > 21){
      0
    }
    else if (player1 > 21) {
      player2
    }
    else if (player2 > 21){
      player1
    }
    else {
      math.max(player1,player2)
    }
  }
}
