package com.aminhjz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static com.aminhjz.one.ChOne.encodeSpaces;
import static com.aminhjz.one.ChOne.permutations;
import static com.aminhjz.one.ChOne.uniqueCharString;
import static com.aminhjz.one.ChOne.uniqueCharString2;
import static com.aminhjz.one.ChOne.compress;

public class ChOne {

    @Test
    public void testUnique(){
        Assertions.assertFalse(uniqueCharString2("ashtashtashtashtashtashtashtashtashtashtashtashtasht".toCharArray()));
        Assertions.assertTrue(uniqueCharString2("qdrwbjfup;ashtgyneoizxmcvkl,./".toCharArray()));
        Assertions.assertFalse(uniqueCharString("ashtashtashtashtashtashtashtashtashtashtashtashtasht".toCharArray()));
        Assertions.assertTrue(uniqueCharString("qdrwbjfup;ashtgyneoizxmcvkl,./".toCharArray()));
    }

    @Test
    public void testPermutations(){
        Assertions.assertTrue(permutations("qdrw".toCharArray(), "wrdq".toCharArray()));
        Assertions.assertFalse(permutations("qdrwq".toCharArray(), "wrdq".toCharArray()));
        Assertions.assertFalse(permutations("qdrw".toCharArray(), "qrdb".toCharArray()));
        Assertions.assertFalse(permutations("qdrwd".toCharArray(), "qrdb".toCharArray()));
    }


    @Test
    public void testCompress(){
        Assertions.assertEquals("a2c6b2",compress("aaccccccbb".toCharArray()));
    }

    @Test
    public void testEncoding(){
        Assertions.assertEquals("Mr%20John%20Smith",String.copyValueOf(encodeSpaces("Mr John Smith    ".toCharArray(), 13)));
    }
}
