/*
 * Class to compute compass direction N,NE,E,SE,S,SW,W,NW
 * given an angle as input.
 * 
 * @author
 * @version 
 */ 

public class CompassDirection
{
  /*
   * Method to compute Compass direction
   * 
   * @param degree the angle given as input
   * @return String the compass direction
   */ 
  public String computeCompassDirection(double degree)
  {
    String direction;
    degree = degree % 360; // For degree amounts over 360, each 360 degrees is treated as a loop, i.e. modulus

    if(degree >= 337.5 || degree <= 22.5) // Degree range of North
      direction = "North";
    else if(degree < 67.5) // Degree range of North East
      direction = "North East";
    else if(degree <= 112.5) // Degree range of East
      direction = "East";
    else if(degree < 157.5) // Degree range of South East
      direction = "South East";
    else if(degree <= 202.5) // Degree range of South
      direction = "South";
    else if(degree < 247.5) // Degree range of South West
      direction = "South West";
    else if(degree <= 292.5) // Degree range of West
      direction = "West";
    else
      direction = "North West"; // Last possible direction is North West
    
    return direction;
  }
}
