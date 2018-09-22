package hu.uni.miskolc.iit.swtest.network;

import org.junit.Test;

import static org.junit.Assert.*;

public class IPAddressTest {

    @Test(expected = MalformattedIPAddressException.class)
    public void testArrayConstructorWithShorterParameter() throws MalformattedIPAddressException {
        new IPAddress(new int[] {1,2,3});
    }

    @Test(expected = MalformattedIPAddressException.class)
    public void testArrayConstructorWithLongerParameter() throws MalformattedIPAddressException {
        new IPAddress(new int[] {1,2,3,4,5});
    }

    @Test(expected = MalformattedIPAddressException.class)
    public void testArrayConstructorWithLowerValueatPart1() throws MalformattedIPAddressException {
        new IPAddress(new int[] {-1,1,1,1});
    }

    @Test(expected = MalformattedIPAddressException.class)
    public void testArrayConstructorWithLowerValueatPart2() throws MalformattedIPAddressException {
        new IPAddress(new int[] {1,-1,1,1});
    }

    @Test(expected = MalformattedIPAddressException.class)
    public void testArrayConstructorWithLowerValueatPart3() throws MalformattedIPAddressException {
        new IPAddress(new int[] {1,1,-1,1});
    }

    @Test(expected = MalformattedIPAddressException.class)
    public void testArrayConstructorWithLowerValueatPart4() throws MalformattedIPAddressException {
        new IPAddress(new int[] {1,1,1,-1});
    }

    @Test(expected = MalformattedIPAddressException.class)
    public void testArrayConstructorWithHigherValueatPart1() throws MalformattedIPAddressException {
        new IPAddress(new int[] {256,1,1,1});
    }

    @Test(expected = MalformattedIPAddressException.class)
    public void testArrayConstructorWithHigherValueatPart2() throws MalformattedIPAddressException {
        new IPAddress(new int[] {1,256,1,1});
    }

    @Test(expected = MalformattedIPAddressException.class)
    public void testArrayConstructorWithHigherValueatPart3() throws MalformattedIPAddressException {
        new IPAddress(new int[] {1,1,256,1});
    }

    @Test(expected = MalformattedIPAddressException.class)
    public void testArrayConstructorWithHigherValueatPart4() throws MalformattedIPAddressException {
        new IPAddress(new int[] {1,1,1,256});
    }

    @Test
    public void testArrayConstructorWithValidParameters() throws MalformattedIPAddressException {
        new IPAddress(new int[] {255,255,255,255});
    }
}