
object DataTypes {

  case class Position(xPos: Int, yPos: Int)

  sealed trait Direction

  case object N extends Direction

  case object S extends Direction

  case object E extends Direction

  case object W extends Direction

  //data Direction = North | South | East | West
  //
  //  object Direction extends Enumeration{
  //    type direction = Value
  //    val N, S, E, W
  //  }

  case class RoverState(direction: Direction, position: Position)

  val leftRotation = Map[Direction, Direction](N -> W, W -> S, S -> E, E -> N)
  val rightRotation = Map[Direction, Direction](N -> E, W -> N, S -> W, E -> S)

}

