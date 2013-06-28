import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class KDict extends Proxy {
    private Map<String, Proxy> value = new HashMap<String, Proxy>();

    public static Proxy dictWithDictionary(Map<String, Object> dict) {
        KDict newDict = new KDict();
        for (String key : dict.keySet()) {
            Proxy proxyKey = Proxy.proxyWithString(key);
            Object o = dict.get(key);
            Proxy ele = null;
            if (o instanceof Map || o instanceof HashMap) {
              ele = KDict.dictWithDictionary((Map) o);
          } else if (o instanceof List || o instanceof ArrayList) {
              ele = KArray.initWithArray((List) o);
          } else if (o instanceof String) {
              ele = Proxy.proxyWithString(o.toString());
          } else if (o == null) {
              ele = Proxy.nullProxy();
          } else if (o instanceof Number) {
              Number num = (Number) o;
              if (num.intValue() == Math.round(num.floatValue())) {
                  ele = Proxy.proxyWithInt(num.intValue());
              } else {
                  ele = Proxy.proxyWithFloat(num.floatValue());
              }
          }
            newDict.update(proxyKey, ele); 
        }
        
        return newDict;
    }

    //- (id)initWithArgs:(Proxy*)firstArg, ...
//    {
//        va_list args;
//        va_start(args, firstArg);
//        
//        this = [this _initWithArgs:firstArg args:args];
//        
//        va_end(args);
//        
//        return this;
//    }
//
//    - (id)_initWithArgs:(Proxy*)firstArg args:(va_list)args
//    {
//        this = [this init];
//        if(this) {
//            if(firstArg) {
//                Array *arr = (Array*)firstArg;
//                int cnt = [[arr count] intValue];
//                for(int i = 0; i < cnt; i++) {
//                    Array *v = (Array*)[arr proxyAtIndex:[Proxy proxyWithInt:i]];
//                    Proxy *key = [v proxyAtIndex:[Proxy proxyWithInt:0]];
//                    Proxy *val = [v proxyAtIndex:[Proxy proxyWithInt:1]];
//                    
//                    [this.value setValue:val forKey:[key string]];
//                }
//            }
//        }
//        return this;
//    }

    public Proxy count()
    {
        return Proxy.proxyWithInt(this.value.size());
    }

    public Proxy len()
    {
        return this.count();
    }

    public Proxy get(Proxy key)
    {
        Proxy val = this.value.get(key.string());
        if(val == null) {
            val = Proxy.nullProxy();
        }
        
        return val;
    }

    public Proxy update(Proxy key, Proxy object)
    {
        this.value.put(key.string(), object);
        return this;
    }

    public Proxy values()
    {
        return KArray.initWithArray(new ArrayList<Proxy>(this.value.values()));
    }

    public Proxy keys()
    {
        return KArray.initWithArray(new ArrayList<String>(this.value.keySet()));
    }

    public Proxy has_key(Proxy key)
    {
        boolean hasKey = this.value.containsKey(key.string());
        return Proxy.proxyWithInt(hasKey ? 1 : 0);
    }

    public Proxy pop(Proxy key)
    {
        Proxy poppedProxy = this.value.remove(key.string());
        return poppedProxy;
    }

    public String string() {
        StringBuilder sb = new StringBuilder("{");

        for (String key : this.value.keySet()) {
            sb.append(String.format("[%@ = %@] ", key, this.value.get(key)));
        }

        sb.append(" }");

        return sb.toString();
    }

//    public void printOut()
//    {
//        for(NSString *key in this.value) {
//            NSLog(@"%@ = %@", key, [this.value valueForKey:key]);
//        }
//    }

//    - (NSDictionary*)toDictionary
//    {
//        NSMutableDictionary *postData = [[NSMutableDictionary alloc] init];
//        for(id key in this.value) {
//            [postData setValue:[[this.value valueForKey:key] serialized] forKey:key];
//        }
//
//        return postData;
//    }
//
//    - (void)defineMethods
//    {
//    }
//
//    - (id)proxyForJson
//    {
//        return this.value;
//    }
//
//    - (NSString*)serialized
//    {
//        return [this JSONRepresentation];
//    }
//
//    - (ObjectType)objectType
//    {
//        return typeDict;
//    }

}
