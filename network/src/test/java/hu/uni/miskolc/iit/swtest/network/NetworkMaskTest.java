package hu.uni.miskolc.iit.swtest.network;

import org.easymock.EasyMock;
import org.easymock.EasyMockRule;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class NetworkMaskTest {

    @Rule
    public EasyMockRule rule = new EasyMockRule(this);

    @Mock
    private IPAddress address;

    @TestSubject
    private NetworkMask mask = new NetworkMask(address, new int[] {255,255,255,0});

    @Test
    public void isInNetwork() throws MalformattedIPAddressException {
        System.out.println(mask);
    }

    @Test
    public void testMocking(){
        EasyMock.expect(address.getAddress()).andReturn(new int[] {192,168,2,1});
        EasyMock.replay(address);
        System.out.println(mask);
        System.out.println(address.getAddress()[0]);
    }

}