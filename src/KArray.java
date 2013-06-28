import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KArray extends Proxy {

    private List<Proxy> value;

    public KArray() {
        this.value = new ArrayList<Proxy>();
    }

    public static Proxy initWithArray(List array) {
        KArray newArray = new KArray();
        for (int i = 0; i < array.size(); i++) {
            Object o = array.get(i);
            Proxy ele = null;

            if (o instanceof HashMap) {
                ele = KDict.dictWithDictionary((Map) o);
            } else if (o instanceof ArrayList) {
                ele = KArray.initWithArray((List) o);
            } else if (o instanceof String) {
                ele = Proxy.proxyWithString((String)o);
            } else if (o == null) {
                ele = Proxy.nullProxy();
            } else if (o instanceof Number) {
                Number num = (Number) o;
                if (num.intValue() == Math.round(num.floatValue())) {
                    ele = Proxy.proxyWithInt(num.intValue());
                } else {
                    ele = Proxy.proxyWithFloat(num.floatValue());
                }
            } else {
                ele = (Proxy) o;
            }

            newArray.value.add(ele);
        }
        return newArray;
    }

    //
    // public Proxy initWithArgs:(Proxy*)firstArg, ...
    // {
    // va_list args;
    // va_start(args, firstArg);
    //
    // Proxy *ret = [this _initWithArgs:firstArg args:args];
    //
    // va_end(args);
    //
    // return ret;
    // }
    //
    // public Proxy _initWithArgs:(Proxy*)firstArg args:(va_list)args
    // {
    // this = [this init];
    // if(this) {
    // if(firstArg) {
    // [this.value addObject:firstArg];
    //
    // Proxy *ar = Nil;
    // while((ar = va_arg(args, Proxy*))) {
    // [this.value addObject:ar];
    // }
    // }
    // }
    // return this;
    // }
    //
    public Proxy count() {
        return Proxy.proxyWithInt(this.value.size());
    }

    //
    public Proxy proxyAtIndex(Proxy proxy) {
        int index = proxy.intValue();
        if (index < 0 || index + 1 > this.value.size()) {
            return Proxy.nullProxy();
        }

        Proxy val = (Proxy) this.value.get(index);
        if (val == null) {
            val = Proxy.nullProxy();
        }

        return val;
    }

    public Proxy setProxy(Proxy proxy, Proxy index) {
        int idx = index.intValue();
        this.value.set(idx, proxy);

        return proxy;
    }

    public Proxy append(Proxy eleToAppend) {
        this.value.add(eleToAppend);

        return this;
    }

    public Proxy pop(Proxy val) {
        int index = this.value.size() - 1;
        Proxy poppedProxy = (Proxy) this.value.get(index);
        this.value.remove(index);

        return poppedProxy;
    }

    public Proxy remove(Proxy val) {
        this.value.remove(val);
        return val;
    }

    public String string() {
        StringBuilder sb = new StringBuilder("(");

        for (int i = 0; i < this.value.size(); i++) {
            sb.append(((Proxy) this.value.get(i)).string());
            sb.append(", ");
        }

        sb.append(" )");
        return sb.toString();
    }

    public Proxy clear() {
        this.value.clear();

        return this;
    }

    public Proxy len() {
        return Proxy.proxyWithInt(this.value.size());
    }

    // public Proxy sortArray:(Proxy*)sortMethod, ...
    // {
    // MethodCall method = (MethodCall)sortMethod;
    //
    // [this.value sortUsingComparator:^NSComparisonResult(id obj1, id obj2) {
    // Proxy *ret = method(obj1, obj2, Nil);
    // return [ret boolValue];
    // }];
    //
    // return [Proxy nullProxy];
    // }
    //
    // - (void)defineMethods
    // {
    // }
    //
    // - (id)proxyForJson
    // {
    // return this.value;
    // }
    //
    // - (NSString*)serialized
    // {
    // return [this JSONRepresentation];
    // }
    //
    // - (ObjectType)objectType
    // {
    // return typeArray;
    // }
    //
    // @end

}
