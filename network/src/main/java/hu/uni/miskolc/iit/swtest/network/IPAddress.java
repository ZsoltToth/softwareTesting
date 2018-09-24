package hu.uni.miskolc.iit.swtest.network;

import javax.naming.MalformedLinkException;

/**
 * Represents an IPv4 address.
 * Can be initialized with various constructors which are also liable for validation.
 */
public class IPAddress {

    private int[] address;

    /**
     * Questions
     * <ul>
     *     <li>See the order of the statements. Why were the checking conditions organized this way?</li>
     *     <li>In the second condition why was the disjunction of negates used instead of the conjuctions?</li>
     * </ul>
     *
     * @param address
     * @throws MalformedLinkException if length  isn't 4 or any part is out of the [0,255] range
     */
    public IPAddress(int[] address) throws MalformattedIPAddressException{
        if(address.length != 4){
            throw new MalformattedIPAddressException("IPAddress should consist of 4 integers");
        }
        if(!testIntegerRange(address[0]) || !testIntegerRange(address[1]) || !testIntegerRange(address[2]) || !testIntegerRange(address[3])){
            throw new MalformattedIPAddressException("Each parts has to be in [0,255] interval.");
        }
        this.address = address;
    }

    /**
     * This implementation is wrong in many ways.
     * Think about the refactoring of the class in order to centralize the validation logic.
     *
     * @param address
     * @throws MalformattedIPAddressException
     */
    public IPAddress(String address) throws MalformattedIPAddressException{
        String pattern = "\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}\\.\\d{1,3}";
        if(!address.matches(pattern)){
            throw new MalformattedIPAddressException("IPAddres should consists of four numbers separated with dots.");
        }
        String[] parts = address.split("\\.");
        /*
        Nice try but this() and super() must be in first line! :'(
        this(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Integer.parseInt(parts[3]));
        */
        this.address = (new IPAddress(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]), Integer.parseInt(parts[2]), Integer.parseInt(parts[3]))).address;
    }

    public IPAddress(int p1, int p2, int p3, int p4) throws MalformattedIPAddressException {
        this(new int[] {p1,p2,p3,p4});
    }

    protected boolean testIntegerRange(int num){
        return  0 <= num && num <= 255;
    }

    public int[] getAddress() {
        return address;
    }
}
