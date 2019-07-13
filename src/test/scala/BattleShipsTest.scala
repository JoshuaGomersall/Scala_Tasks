import BattleShips.{Boat, MainGame}
import org.scalatest._

class BattleShipsTest extends FlatSpec with Matchers {

  it should "make a new boat" in{
    val boat = new Boat.BoatAsset("large",1)

    Boat.toString
  }
  it should "show invalid response" in{
    MainGame.validateUserInputAgainstGridSize(8885)
    MainGame.validateUserInputAgainstGridSize(-4)
  }

  it should "show valid guess" in{
    MainGame.playerTurn(List(3,2),3,2)
  }

  it should "show invalid guess" in{
    MainGame.playerTurn(List(3,2),2,2)
  }

}
