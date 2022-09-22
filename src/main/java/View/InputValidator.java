package View;

public class InputValidator {

  public boolean isValid(String inputValue){
    if (inputValue == null){
      return false;
    }
    if(!(inputValue.length()==3)){
      return false;
    }
    return true;
  }
/*
  private boolean isNumber(String stringNumber) {
    try {
      Double.parseDouble(stringNumber);
    } catch (NumberFormatException nfe) {
      return false;
    } catch (NullPointerException npe) {
      return false;
    }
    return true;
  }
 */
}
