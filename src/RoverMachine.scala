import DataTypes._

object RoverMachine {

  def initialRoverState(direction: String, position: Position): RoverState = {
    RoverState(direction, position)
  }

  def move(roverState: RoverState): RoverState = {
    roverState.direction match {
      case "N" => RoverState("N", Position(roverState.position.xPos, roverState.position.yPos + 1))
      case "S" => RoverState("S", Position(roverState.position.xPos, roverState.position.yPos - 1))
      case "E" => RoverState("E", Position(roverState.position.xPos + 1, roverState.position.yPos))
      case "W" => RoverState("W", Position(roverState.position.xPos - 1, roverState.position.yPos))
    }
  }

  def leftTurn(roverState: RoverState): RoverState = {
    RoverState((leftRotation.get(roverState.direction)).get, roverState.position)
  }

  def rightTurn(roverState: RoverState): RoverState = {
    RoverState((rightRotation.get(roverState.direction)).get, roverState.position)
  }
}
