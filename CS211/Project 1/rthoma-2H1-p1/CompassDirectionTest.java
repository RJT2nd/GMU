/** A JUnit Test Class for CompassDirection class.
  * 
  * @author Shvetha Soundararajan
  * @version 09.08.2017
  */

import org.junit.*;
import static org.junit.Assert.*;

public class CompassDirectionTest
{

  private CompassDirection direction;
  
  @Before
  public void setUp() 
  {
    direction = new CompassDirection();
  }
  
  @Test
  public void testCompassDirection1()
  {
    assertEquals("North", direction.computeCompassDirection(0.0));
  }
  
  @Test
  public void testCompassDirection2()
  {
    assertEquals("North", direction.computeCompassDirection(360.0));
  }
  
  @Test
  public void testCompassDirection3()
  {
    assertEquals("North", direction.computeCompassDirection(22.5));
  }
  
  @Test
  public void testCompassDirection4()
  {
    assertEquals("North East", direction.computeCompassDirection(67.25));
  }
  
  @Test
  public void testCompassDirection5()
  {
    assertEquals("South East", direction.computeCompassDirection(113.0));
  }
  
  @Test
  public void testCompassDirection6()
  {
    assertEquals("South", direction.computeCompassDirection(162.0));
  }
  
  @Test
  public void testCompassDirection7()
  {
    assertEquals("South West", direction.computeCompassDirection(246.0));
  }
  
  @Test
  public void testCompassDirection8()
  {
    assertEquals("South West", direction.computeCompassDirection(247.0));
  }
  
  @Test
  public void testCompassDirection9()
  {
    assertEquals("East", direction.computeCompassDirection(112.5));
  }
  
  @Test
  public void testCompassDirection10()
  {
    assertEquals("West", direction.computeCompassDirection(292.0));
  }
  
  @Test
  public void testCompassDirection11()
  {
    assertEquals("North", direction.computeCompassDirection(338.0));
  }
  
  @Test
  public void testCompassDirection12()
  {
    assertEquals("North West", direction.computeCompassDirection(337.25));
  }
  
   @Test
  public void testCompassDirection13()
  {
    assertEquals("East", direction.computeCompassDirection(67.5));
  }
   
    @Test
  public void testCompassDirection14()
  {
    assertEquals("South", direction.computeCompassDirection(157.5));
  }
    
     @Test
  public void testCompassDirection15()
  {
    assertEquals("South", direction.computeCompassDirection(202.5));
  }
     
      @Test
  public void testCompassDirection16()
  {
    assertEquals("West", direction.computeCompassDirection(247.5));
  }
      
  @Test
  public void testCompassDirection17()
  {
    assertEquals("West", direction.computeCompassDirection(292.5));
  }
  
  @Test
  public void testCompassDirection18()
  {
    assertEquals("North", direction.computeCompassDirection(337.5));
  }
  
}
