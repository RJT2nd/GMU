/*
 * Class to compute Roman Numerals for a given integer. 
 * 
 * @author
 * @version 
 */ 
public class RomanNumbers
{
  /**
   * Method to convert a positive integer <=3999 to Roman Numeral format
   * 
   * @param number positive integer value to be converted to Roman Numeral
   * @return String the Roman Numeral represented as String
   */ 
  public String computeRomanNumerals(int number)
  {
    String romanNumeral = "";
    
    // For M (1000) and CM (900)
    while(number / 1000 > 0){
      romanNumeral += "M";
      number -= 1000;
    }
    if(number >= 900){
      romanNumeral += "CM";
      number -= 900;
    }
    
    // For D (500) and CD (400)
    while(number / 500 > 0){
      romanNumeral += "D";
      number -= 500;
    }
    if(number >= 400){
      romanNumeral += "CD";
      number -= 400;
    }

    // For C (100) and XC (90)
    while(number / 100 > 0){
      romanNumeral += "C";
      number -= 100;
    }
    if(number >= 90){
      romanNumeral += "XC";
      number -= 90;
    }

    // For L (50) and XL (40)
    while(number / 50 > 0){
      romanNumeral += "L";
      number -= 50;
    }
    if(number >= 40){
      romanNumeral += "XL";
      number -= 40;
    }

    // For X (10) and IX (9)
    while(number / 10 > 0){
      romanNumeral += "X";
      number -= 10;
    }
    if(number >= 9){
      romanNumeral += "IX";
      number -= 9;
    }

    // For V (5) and IV (4)
    while(number / 5 > 0){
      romanNumeral += "V";
      number -= 5;
    }
    if(number >= 4){
      romanNumeral += "IV";
      number -= 4;
    }

    // For I (1)
    while(number >= 1){
      romanNumeral += "I";
      number -= 1;
    }

    return romanNumeral;
  }
}
