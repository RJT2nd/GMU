/** A JUnit Test class for testing the Easter class.
  * 
  * @author Shvetha Soundararajan
  * @version 09.08.2017
  */

import org.junit.*;
import static org.junit.Assert.*;


public class EasterTest{
  
  private Easter easterTest; 
  
  @Before
  public void setUp()
  {
    easterTest = new Easter();
  }
  
  @Test
  public void testEasterDate1() 
  {
    easterTest.computeEasterDate(2001);
    assertEquals(4, easterTest.getEasterSundayMonth());
    assertEquals(15, easterTest.getEasterSundayDay());
  }
  
  @Test
  public void testEasterDate2() 
  {
    easterTest.computeEasterDate(2017);
    assertEquals(4, easterTest.getEasterSundayMonth());
    assertEquals(16, easterTest.getEasterSundayDay());
  }
  
   @Test
  public void testEasterDate3() 
  {
    easterTest.computeEasterDate(1818);
    assertEquals(3, easterTest.getEasterSundayMonth());
    assertEquals(22, easterTest.getEasterSundayDay());
  }
   
  @Test
  public void testEasterDate4() 
  {
    easterTest.computeEasterDate(2024);
    assertEquals(3, easterTest.getEasterSundayMonth());
    assertEquals(31, easterTest.getEasterSundayDay());
  }
  
  @Test
  public void testEasterDate5() 
  {
    easterTest.computeEasterDate(2285);
    assertEquals(3, easterTest.getEasterSundayMonth());
    assertEquals(22, easterTest.getEasterSundayDay());
  }
  
  @Test
  public void testEasterDate6() 
  {
    easterTest.computeEasterDate(1943);
    assertEquals(4, easterTest.getEasterSundayMonth());
    assertEquals(25, easterTest.getEasterSundayDay());
  }
  
  @Test
  public void testEasterDate7() 
  {
    easterTest.computeEasterDate(2038);
    assertEquals(4, easterTest.getEasterSundayMonth());
    assertEquals(25, easterTest.getEasterSundayDay());
  }
  
  @Test
  public void testEasterDate8() 
  {
    easterTest.computeEasterDate(2160);
    assertEquals(3, easterTest.getEasterSundayMonth());
    assertEquals(23, easterTest.getEasterSundayDay());
  }
  
  @Test
  public void testEasterDate9() 
  {
    easterTest.computeEasterDate(2011);
    assertEquals(4, easterTest.getEasterSundayMonth());
    assertEquals(24, easterTest.getEasterSundayDay());
  }
  
  @Test
  public void testEasterDate10() 
  {
    easterTest.computeEasterDate(1859);
    assertEquals(4, easterTest.getEasterSundayMonth());
    assertEquals(24, easterTest.getEasterSundayDay());
  }
}
