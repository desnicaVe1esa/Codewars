package kyu_7.mew_cipher.java;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CipherTests {
    @Test
    void exampletest() {
        assertEquals("walk your dog at nine", ForemanPig.decipher(new String[]{"u lk zxuq hfk as fouh","y l  zpuv  xe at sicd","welvayfuqbfpeaauaqcrc"}));
    }
    @Test
    void basictests(){
        assertEquals("hello world", ForemanPig.decipher(new String[]{"hello world"}));
        assertEquals("", ForemanPig.decipher(new String[]{"","","","",""}));
        assertEquals("   ", ForemanPig.decipher(new String[]{"a  "," b ","  c","   ","   "}));
    }
    @Test
    void foremanpigtest(){
        assertEquals("foreman pig", ForemanPig.decipher(new String[]{"foreman pig", "foreman pig"}));
    }
}