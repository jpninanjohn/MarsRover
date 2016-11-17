import DataTypes.Position
import RoverMachine._

object RoverApp extends App {

  var roverState = initialRoverState("N", Position(0, 0))

  roverState = move(roverState)
  roverState = leftTurn(roverState)
  roverState = rightTurn(roverState)
  roverState = rightTurn(roverState)
  roverState = move(roverState)

  println(roverState.direction + " " + roverState.position.xPos + ", " + roverState.position.yPos)

}
