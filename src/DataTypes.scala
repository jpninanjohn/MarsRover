
object DataTypes {

  case class Position(xPos: Int, yPos: Int)

  case class RoverState(direction: String, position: Position)

  val leftRotation = Map("N" -> "W", "W" -> "S", "S" -> "E", "E" -> "N")
  val rightRotation = Map("N" -> "E", "W" -> "N", "S" -> "W", "E" -> "S")
  
}

