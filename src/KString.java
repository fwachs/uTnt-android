import java.util.Arrays;
import java.util.List;

public class KString extends Proxy {
    private String value;

    public KString(String string) {
        this.value = string;
    }

    public Integer intValue() {
        Integer val = 0;
        try {
            val = Integer.parseInt(this.value);
        } catch (NumberFormatException e) {
            // do nothing, maybe log an error when we have a logger
        }
        return val;
    }

    public Float floatValue() {
        Float val = 0f;
        try {
            val = Float.parseFloat(this.value);
        } catch (NumberFormatException e) {
            // do nothing, maybe log an error when we have a logger
        }
        return val;
    }

    public Proxy add(Proxy proxyToAdd) {
        return Proxy.proxyWithString(this.value.concat(proxyToAdd.string()));
    }

    public Proxy isEq(Proxy proxy) {
        return (this.value.equals(proxy.string()) ? CONST_1 : CONST_0);
    }

    public Proxy isNotEq(Proxy proxy) {
        return (!this.value.equals(proxy.string()) ? CONST_1 : CONST_0);
    }

    public Proxy replace(Proxy search, Proxy replace) {
        Proxy ret = Proxy.proxyWithString(this.value.replaceAll(
                search.string(), replace.string()));
        return ret;
    }

    public Proxy split(Proxy proxy) {
        String splitter = proxy.string();
        List<String> comps = Arrays.asList(this.value.split(splitter));

        return KArray.initWithArray(comps);
    }

    public Proxy substring(Proxy start, Proxy end) {
        if (end == null) {
            end = Proxy.proxyWithInt(this.value.length());
        }

        return Proxy.proxyWithString(this.value.substring(start.intValue(),
                end.intValue()));
    }

    public Proxy lower() {
        return Proxy.proxyWithString(this.value.toLowerCase());
    }

    public Proxy len() {
        return Proxy.proxyWithInt(this.value.length());
    }

    public Proxy smart_copy() {
        return Proxy.proxyWithString(this.value);
    }

    // - (id)proxyForJson
    // {
    // return this.value;
    // }
    //
    public String serialized() {
        return this.value;
    }
    //
    // - (ObjectType)objectType
    // {
    // return typeString;
    // }

}
