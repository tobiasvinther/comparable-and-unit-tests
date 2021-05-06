package com.company;

public class LetterToNumberEncryption {

    public String fromStringToNumber(String stringToEncrypt) {
        StringBuilder encryptedString = new StringBuilder();
        //put it all in lower case since we have not been told to differentiate between upper and lower case
        stringToEncrypt = stringToEncrypt.toLowerCase();
        char[] strAsCharArr = stringToEncrypt.toCharArray();
        //loop through the char array, use compareTo and add result to our encrypted string
        for (char thisChar : strAsCharArr) {
            int charNum = Character.compare(thisChar, 'a');
            encryptedString.append(charNum).append("-");
        }
        //using substring to get rid of the last dash at the end
        return encryptedString.substring(0, encryptedString.length()-1);
    }
}

/*
//my original method before it was optimized
public String fromStringToNumber(String stringToEncrypt) {
        String encryptedString = "";
        //put it all in lower case since we have not been told to differentiate between upper and lower case
        stringToEncrypt = stringToEncrypt.toLowerCase();
        char[] strAsCharArr = stringToEncrypt.toCharArray();
        //loop through the char array, use compareTo and add result to our encrypted string
        for(int i=0; i<strAsCharArr.length; i++) {
            char thisChar = strAsCharArr[i];
            int charNum = Character.compare(thisChar,'a');
            encryptedString = encryptedString + charNum + "-";
        }
        //using substring to get rid of the last dash at the end
        return encryptedString.substring(0, encryptedString.length()-1);
    }
}
 */
