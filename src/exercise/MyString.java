package exercise;

public class MyString {
    public String str;

    public MyString(String str) {
        this.str = str;
    }
    public boolean isHexadecimalChar(char ch) {
        // Write your code here

        return ((ch >= 'a' && ch <= 'f') || (ch >= 'A' && ch <= 'F'));
        
    }

    public boolean isHexadecimal() {
        // Write your code here

        if(str == null || str.equals("")) {
            return false;
        }

        for(char ch : str.toCharArray()){
            if (!isHexadecimalChar(ch) && !Character.isDigit(ch)){
                return false;
            }  
        }
        return true;
    }
    
}
/* 
    public boolean isHexadecimalChar(char ch) {
        boolean isValid = false;

    // The length is correct, now check that all characters are legal hexadecimal digits
    for (int i = 0; i < 4; i++) {
      char thisChar = str.charAt(i);

     // Is the character a decimal digit (0..9)? If so, advance to the next character
      if (Character.isDigit(thisChar)) {
        isValid = true;
      }else {
        //Character is not a decimal digit (0..9), is it a valid hexadecimal digit (A..F)?
        if (Character.digit(thisChar, 16) != -1) {
          isValid = true;
        }
        else {
           // Found an invalid digit, no need to check other digits, exit this loop
          isValid = false;
          break;
      }
   }
}    
// Returns true if the string is a valid hexadecimal string, false otherwise
return isValid;
        
    }

    public boolean isHexadecimal() {
        // Write your code here

        if(str != null && !str.isEmpty()) {
            return false;
        }
        
        return true;

    }
*/
