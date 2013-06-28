
public class KFloat extends Proxy {

    private static final Proxy CONST_1 = new KFloat(1f);
    private static final Proxy CONST_0 = new KFloat(0f);
    private Float value;

    public KFloat (Float val) {
        this.value = val;
    }

    public Proxy smartCopy () {
        return new KFloat(this.value);
    }

    public Proxy isLe (Proxy proxy) {
        return this.value < proxy.floatValue() ? CONST_1 : CONST_0;
    }

    public Proxy isLeOrEq(Proxy proxy) {
        return (this.value <= proxy.floatValue() ? CONST_1 : CONST_0);
    }

    public Proxy isEq(Proxy proxy) {
        return (this.value == proxy.floatValue()? CONST_1 : CONST_0);
    }

    public Proxy isNotEq(Proxy proxy)
    {
        return (this.value != proxy.floatValue() ? CONST_1 : CONST_0);
    }

    public Proxy isGt(Proxy proxy) {
        return (this.value > proxy.floatValue() ? CONST_1 : CONST_0);
    }

    public Proxy isGtOrEq(Proxy proxy)
    {
        return (this.value >= proxy.floatValue() ? CONST_1 : CONST_0);
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
        return Proxy.proxyWithFloat(this.value + proxy.floatValue());
    }

    public Proxy sub(Proxy proxy)
    {
        return Proxy.proxyWithFloat(this.value - proxy.floatValue());
    }

    public Proxy mul(Proxy proxy)
    {
        return Proxy.proxyWithFloat(this.value * proxy.floatValue());
    }

    public Proxy div(Proxy proxy)
    {
        return Proxy.proxyWithFloat(this.value / proxy.floatValue());
    }

    public Proxy add2this(Proxy proxy)
    {
        this.value += proxy.floatValue();
        
        return this;
    }

    public Proxy sub2this(Proxy proxy)
    {
        this.value -= proxy.floatValue();
        
        return this;
    }

    public Proxy mul2this(Proxy proxy)
    {
        this.value *= proxy.floatValue();
        
        return this;
    }

    public Proxy div2this(Proxy proxy)
    {
        this.value /= proxy.floatValue();
        
        return this;
    }

    public Proxy reminder(Proxy proxy)
    {
        return Proxy.proxyWithFloat(this.value % proxy.floatValue());
    }

    public Proxy neg()
    {
        return Proxy.proxyWithFloat(this.value.floatValue() * -1);
    }

    public Float floatValue()
    {
        return this.value;
    }

    public Integer intValue()
    {
        return this.value.intValue();
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
        return Proxy.proxyWithInt(this.value.intValue() | proxy.intValue());
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
