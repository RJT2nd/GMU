/** JUnit Test class for testing the conversion of positive 
  * integers upto 3999 to Roman Numbers.
  *   
  * @author Shvetha Soundararajan
  * @version 09.08.2017
  */

import org.junit.*;
import static org.junit.Assert.*;


public class RomanNumbersTest {
 
  private RomanNumbers romanNumber;
  
  @Before
  public void setUp()
  {
    romanNumber = new RomanNumbers();
  }
  
  @Test
  public void testRomanNumber1() 
  {
    assertEquals("MCMLXXVIII", romanNumber.computeRomanNumerals(1978));
  }
  
  @Test
  public void testRomanNumber2() 
  {
    assertEquals("MMMCMXCIX", romanNumber.computeRomanNumerals(3999));
  }
  
  @Test
  public void testRomanNumber3() 
  {
    assertEquals("DI", romanNumber.computeRomanNumerals(501));
  }
  
  @Test
  public void testRomanNumber4() 
  {
    assertEquals("MMV", romanNumber.computeRomanNumerals(2005));
  }
  
  @Test
  public void testRomanNumber5() 
  {
    assertEquals("CMXCIX", romanNumber.computeRomanNumerals(999));
  }
  
  @Test
  public void testRomanNumber6() 
  {
    assertEquals("XLVI", romanNumber.computeRomanNumerals(46));
  }
  
  @Test
  public void testRomanNumber7() 
  {
    assertEquals("CDXLIV", romanNumber.computeRomanNumerals(444));
  }
  
  @Test
  public void testRomanNumber8() 
  {
    assertEquals("DCCCXI", romanNumber.computeRomanNumerals(811));
  }
  
  @Test
  public void testRomanNumber9() 
  {
    assertEquals("VI", romanNumber.computeRomanNumerals(6));
  }
  
  @Test
  public void testRomanNumber10() 
  {
    assertEquals("XXXII", romanNumber.computeRomanNumerals(32));
  }
  
  @Test
  public void testRomanNumber11() 
  {
    assertEquals("LVII", romanNumber.computeRomanNumerals(57));
  }
}
