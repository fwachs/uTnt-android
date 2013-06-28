
public class NullProxy extends Proxy{

    public Proxy isEq(Proxy proxy)
    {
        return this == proxy ? Proxy.proxyWithInt(1) : Proxy.proxyWithInt(0);
    }

    public Proxy isNotEq (Proxy proxy )
    {
        return this != proxy ? Proxy.proxyWithInt(0) : Proxy.proxyWithInt(1);
    }

    public boolean boolValue()
    {
        return false;
    }

//    - (id)proxyForJson
//    {
//        return [NSNull null];
//    }

}
