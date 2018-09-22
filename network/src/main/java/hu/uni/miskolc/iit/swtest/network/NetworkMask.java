package hu.uni.miskolc.iit.swtest.network;

public class NetworkMask {

    private IPAddress networkAddress;
    private int[] mask;

    public enum NetworkClass{
        A(new int[] {255,0,0,0}),
        B(new int[] {255,255,0,0}),
        C(new int[] {255,255,255,0});
        private int[] mask;

        NetworkClass(int[] mask){
            this.mask = mask;
        }
    }

    public NetworkMask(IPAddress networkAddress, int[] mask) {
        this.networkAddress = networkAddress;
        this.mask = mask;
    }

    /**
     * Mask is given int ipAddress/length notation;
     * @param mask
     */
    public NetworkMask(String mask){
        //TODO Implement it :)
    }

    public NetworkMask(IPAddress networkAddress, NetworkClass networkClass){
        this(networkAddress, networkClass.mask);
    }

    public boolean isInNetwork(IPAddress address){

        return false;
    }

    public IPAddress getNetworkAddress() {
        return networkAddress;
    }

    public int[] getMask() {
        return mask;
    }
}
