
public class KInt extends Proxy {
    
    private Integer value;

    public KInt (Integer val) {
        this.value = val;
    }

    public Proxy smartCopy () {
        return new KInt(this.value);
    }

    public Proxy isLe (Proxy proxy) {
        return this.value < proxy.intValue() ? CONST_1 : CONST_0;
    }

    public Proxy isLeOrEq(Proxy proxy) {
        return (this.value <= proxy.intValue() ? CONST_1 : CONST_0);
    }

    public Proxy isEq(Proxy proxy) {
        return (this.value == proxy.intValue()? CONST_1 : CONST_0);
    }

    public Proxy isNotEq(Proxy proxy)
    {
        return (this.value != proxy.intValue() ? CONST_1 : CONST_0);
    }

    public Proxy isGt(Proxy proxy) {
        return (this.value > proxy.intValue() ? CONST_1 : CONST_0);
    }

    public Proxy isGtOrEq(Proxy proxy)
    {
        return (this.value >= proxy.intValue() ? CONST_1 : CONST_0);
    }

    public Proxy inc()
    {
        this.value++;
        
        return this;
    }

    public Proxy dec()
    {
        this.value--;
        
        return this;
    }

    public Proxy add(Proxy proxy)
    {
        return Proxy.proxyWithInt(this.value + proxy.intValue());
    }

    public Proxy sub(Proxy proxy)
    {
        return Proxy.proxyWithInt(this.value - proxy.intValue());
    }

    public Proxy mul(Proxy proxy)
    {
        return Proxy.proxyWithInt(this.value * proxy.intValue());
    }

    public Proxy div(Proxy proxy)
    {
        return Proxy.proxyWithInt(this.value / proxy.intValue());
    }

    public Proxy add2this(Proxy proxy)
    {
        this.value += proxy.intValue();
        
        return this;
    }

    public Proxy sub2this(Proxy proxy)
    {
        this.value -= proxy.intValue();
        
        return this;
    }

    public Proxy mul2this(Proxy proxy)
    {
        this.value *= proxy.intValue();
        
        return this;
    }

    public Proxy div2this(Proxy proxy)
    {
        this.value /= proxy.intValue();
        
        return this;
    }

    public Proxy reminder(Proxy proxy)
    {
        return Proxy.proxyWithInt(this.value % proxy.intValue());
    }

    public Proxy neg()
    {
        return Proxy.proxyWithInt(this.value.intValue() * -1);
    }

    public Integer intValue()
    {
        return this.value;
    }

    public Float floatValue()
    {
        return this.value.floatValue();
    }

    public boolean boolValue()
    {
        return this.value != null;
    }

    public String string()
    {
        return String.format("%d", this.value);
    }

    public Proxy bitwiseOr(Proxy proxy)
    {
        return Proxy.proxyWithInt(this.value | proxy.intValue());
    }

//    - (id)proxyForJson
//    {
//        return [NSNumber numberWithInt:this.value];
//    }

    public String serialized()
    {
        return this.string();
    }
//
//    - (ObjectType)objectType
//    {
//        return typeInt;
//    }

}
