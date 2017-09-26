/** 
 * A JUnit Test class for checking the tax computations based on income.
 * 
 * @author Shvetha Soundararajan
 * @version 09.08.2017
 */

import org.junit.*;
import static org.junit.Assert.*;


public class TaxReturnTest 
{ 
  
  private TaxReturn tax;
  
  @Before
  public void setUp()
  {
    tax = new TaxReturn();
  }
  
  @Test
  public void testTaxAmount1() 
  {
    assertEquals(tax.computeTax(600000), 26250.0, 0.0001);
  }
  
  @Test
  public void testTaxAmount2() 
  {
    assertEquals(tax.computeTax(1000), 10.0, 0.0001);
  }
  
  @Test
  public void testTaxAmount3() 
  {
    assertEquals(tax.computeTax(117000), 2430.0, 0.0001);
  }
  
  @Test
  public void testTaxAmount4() 
  {
    assertEquals(tax.computeTax(60000), 700.0, 0.0001);
  }
  
  @Test
  public void testTaxAmount5() 
  {
    assertEquals(tax.computeTax(85000), 1300.0, 0.0001);
  }
  
  @Test
  public void testTaxAmount6() 
  {
    assertEquals(tax.computeTax(110000), 2150.0, 0.0001);
  }
  
  @Test
  public void testTaxAmount7() 
  {
    assertEquals(tax.computeTax(260000), 8250.0, 0.0001);
  }
  
  @Test
  public void testTaxAmount8() 
  {
    assertEquals(tax.computeTax(510000), 20850.0, 0.0001);
  }
  
}
