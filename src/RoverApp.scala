import DataTypes._
import RoverMachine._

import scala.io.StdIn.readLine

object RoverApp extends App {

  println("Enter Direction")

  def parseToDirection(direction: String): Direction = {
    direction match {
      case "N" => N
      case "S" => S
      case "E" => E
      case "W" => W
    }
  }

  val initialDirection: Direction = parseToDirection(readLine())
  println("Enter XPosition")
  val initialXPosition: Int = readLine().toInt
  println("Enter YPosition")
  val initialYPosition: Int = readLine().toInt
  println("Enter Instructions")
  val instructionList: Array[Char] = readLine().toCharArray

  var roverState = initialRoverState(N, Position(initialXPosition, initialYPosition))

  for (instruction <- instructionList) {
    instruction match {
      case 'M' => roverState = move(roverState)
      case 'L' => roverState = leftTurn(roverState)
      case 'R' => roverState = rightTurn(roverState)
    }
  }

  println(roverState.direction + " " + roverState.position.xPos + ", " + roverState.position.yPos)

}
