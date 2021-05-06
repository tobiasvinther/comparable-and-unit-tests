package com.company;

public class Decryption {

    public String numbersToStringDecryption(String encryptedString) {
        StringBuilder decryptedString = new StringBuilder();
        String[] strAsArray = encryptedString.split("-");

        for(String string : strAsArray) {
            int tempInt = Integer.parseInt(string);
            decryptedString.append(getCharFromInt(tempInt));
        }
        return decryptedString.toString();
    }

    private char getCharFromInt (int num) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        if(num > 25) {
            return 'æ';
        }
        return alphabet[num];
    }

}
