package kyu_6.becoming_a_real_spy;

import org.junit.Assert;
import org.junit.Test;

public class SpyGraduationExampleTests {

    @Test
    public void basicTests() {
        //Lets say that we encrypt with ancestorsBlowfish the plain text "spy kit" with the password "BOOM",
        //so the result of spy.decrypt(ancestorsBlowfishEncrypt("spy kit","BOOM")) should be
        //"spy kit"
        // the result of the encryption is written in the char array
        SpyGraduation spy = new SpyGraduation();
        char[] expected = {17011, 20336, 20345, 19744, 17003, 20329, 20340};
        Assert.assertEquals("spy kit", spy.decrypt(String.valueOf(expected)));

        //the result of ancestorsBlowfishEncrypt("Tandy", "NO MATTER WHAT THE PASSWORD IS")
        expected = new char[]{20052, 20321, 8302, 19812, 16761};
        Assert.assertEquals("Tandy", spy.decrypt(String.valueOf(expected)));

        //the result of ancestorsBlowfishEncrypt("Tandy", "abc")
        expected = new char[]{24916, 25185, 25454, 24932, 25209};
        Assert.assertEquals("Tandy", spy.decrypt(String.valueOf(expected)));
    }
}
