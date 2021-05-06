package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecryptionTest {

    @Test
    void numbersToStringDecryption() {

        //arrange
        Decryption decryption = new Decryption();

        //act
        String lobster = decryption.numbersToStringDecryption("11-14-1-18-19-4-17");
        String bbbb = decryption.numbersToStringDecryption("1-1-1-1");
        String z = decryption.numbersToStringDecryption("25");

        //assert
        assertEquals("lobster",lobster);
        assertEquals("bbbb",bbbb);
        assertEquals("z",z);

    }
}