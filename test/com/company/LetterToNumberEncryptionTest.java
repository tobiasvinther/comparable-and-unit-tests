package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LetterToNumberEncryptionTest {

    @Test
    void fromStringToNumber() {
        //arrange
        LetterToNumberEncryption encryption = new LetterToNumberEncryption();

        //act
        String test1 = encryption.fromStringToNumber("abc");
        String test2 = encryption.fromStringToNumber("ayz");
        String test3 = encryption.fromStringToNumber("yvcs");
        String test4 = encryption.fromStringToNumber("aaaa");
        String test5 = encryption.fromStringToNumber("lobster");
        String test6 = encryption.fromStringToNumber("LOBSTER");

        //assert
        assertEquals("0-1-2",test1);
        assertEquals("0-24-25",test2);
        assertEquals("24-21-2-18",test3);
        assertEquals("0-0-0-0",test4);
        assertEquals("11-14-1-18-19-4-17",test5);
        assertEquals("11-14-1-18-19-4-17",test6);
    }
}