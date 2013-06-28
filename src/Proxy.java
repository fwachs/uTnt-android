
public class Proxy {

    protected static final Proxy CONST_1 = new KInt(1);
    protected static final Proxy CONST_0 = new KInt(0);

    public Integer intValue() {
        return null;
    }

    public static Proxy proxyWithInt(int integer) {
        return new KInt(integer);
    }

    public static Proxy proxyWithString(String string) {
        return new KString(string);
    }

    public static Proxy nullProxy() {
        return NullProxy.nullProxy();
    }

    public static Proxy proxyWithFloat(float floatValue) {
        return new KFloat(floatValue);
    }

    public String string() {
        return "";
    }

    public Float floatValue() {
        // TODO Auto-generated method stub
        return null;
    }
    
//    public boolean g_is_true(Object objToTest)
//    {
//        if(objToTest == null) {
//            return true;
//        }
//        
//        return false;
//    }
//
//    public Proxy g_is_null(Object objToTest)
//    {
//        if(objToTest == null) {
//            return Proxy.proxyWithInt(0);
//        }
//        
//        return [Proxy proxyWithInt:1];
//    }
//
//    id g_copy_assign(id objToTest)
//    {
//        if([objToTest respondsToSelector:@selector(smart_copy)]) {
//            return [objToTest smart_copy];
//        }
//        
//        return objToTest;
//    }
//
//    id g_bind(Object obj1, Object obj2)
//    {
//        obj1 = obj2;
//        
//        return (__bridge id)obj1;
//    }
//
//    Proxy g_avatar_url(Proxy papayaId, ...)
//    {
//        return [Proxy proxyWithString:@""];
//    }
//
//    Proxy g_start_payment(Proxy product, ...)
//    {
//        [[InAppHelper sharedInstance] purchaseProduct:[product string]];
//        
//        return [Proxy nullProxy];
//    }
//
//    Proxy g_enable_payments(Proxy firstArg, ...)
//    {
//        [[InAppHelper sharedInstance] requestProducts];
//        
//        return [Proxy nullProxy];
//    }
//
//    Proxy g_c_file_exist(Proxy file, ...)
//    {
//        UIImage image = [Sprite loadImage:[file string]];
//        
//        if(image) {
//            return [Proxy proxyWithInt:1];
//        }
//        
//        return [Proxy proxyWithInt:0];
//    }
//
//    Proxy g_save(Proxy firstArg, ...)
//    {
//        AppDelegate appDelegate = [[UIApplication sharedApplication] delegate];
//        
//        [appDelegate saveContext];
//        
//        return [Proxy nullProxy];
//    }
//
//    Proxy g_ppy_userid(Proxy firstArg, ...)
//    {
//        return [Proxy proxyWithInt:0];
//    }
//
//    Proxy g_c_opendb(Proxy firstArg, ...)
//    {
//        return [Database sharedDb];
//    }
//
//    Proxy g_readfile(Proxy firstArg, ...)
//    {
//        NSString fileName = [firstArg string];
//        
//        NSData data = [File dataFromFileInBundle:fileName];
//        NSString dataString = [[NSString alloc] initWithData:data encoding:NSUTF8StringEncoding];
//        
//        return [Proxy proxyWithString:dataString];
//    }
//
//    Proxy g_sin(Proxy firstArg, ...)
//    {
//        float angle = [firstArg floatValue];
//        float rads = angle  3.141592653589793 / 180.0;
//        float sinrads = sin(rads);
//        float sinangl = sinrads  1000;
//        return [Proxy proxyWithInt:sinangl];
//    }
//
//    Proxy g_cos(Proxy firstArg, ...)
//    {
//        float angle = [firstArg floatValue];
//        float rads = angle  3.141592653589793 / 180.0;
//        float cosrads = cos(rads);
//        float cosangl = cosrads  1000;
//        return [Proxy proxyWithInt:cosangl];
//    }
//
//    Proxy g_label(Proxy firstArg, ...)
//    {
//        va_list args;
//        va_start(args, firstArg);
//        
//        Proxy text = firstArg;
//        Proxy fontName = va_arg(args, Proxy);
//        Proxy fontSize = va_arg(args, Proxy);
//        
//        Proxy style = va_arg(args, Proxy);
//        Proxy width = Nil;
//        Proxy height = Nil;
//        Proxy alignment = Nil;
//        
//        if(style) {
//            width = va_arg(args, Proxy);
//        }
//        if(width) {
//            height = va_arg(args, Proxy);
//        }
//        if(height) {
//            alignment = va_arg(args, Proxy);
//        }
//        
//        Sprite label = [[Sprite alloc] initWithText:text fontName:fontName fontSize:fontSize style:style width:width height:height alginment:alignment wrap:[Proxy proxyWithInt:0]];
//        
//        return label;
//    }
//
//    Proxy g_float(Proxy firstArg, ...)
//    {
//        return [Proxy proxyWithFloat:[firstArg floatValue]];
//    }
//
//    Proxy g_round(Proxy firstArg, ...)
//    {
//        return [Proxy proxyWithInt:round([firstArg floatValue])];
//    }
//
//    Proxy g_delaytime(Proxy firstArg, ...)
//    {
//        return Nil;
//    }
//
//    Proxy g_screensize(Proxy firstArg, ...)
//    {
//        return [[Array alloc] initWithArgs:[Proxy proxyWithFloat:1280], [Proxy proxyWithFloat:800], Nil];
////        return [[Scene sharedScene] screenSize];
//    }
//
//    Proxy g_sqrt(Proxy firstArg, ...)
//    {
//        return [Proxy proxyWithFloat:sqrt([firstArg floatValue])];
//    }
//
//    Proxy g_spawn(Proxy firstArg, ...)
//    {
//        return Nil;
//    }
//
//    Proxy g_scaleto(Proxy firstArg, ...)
//    {
//        return Nil;
//    }
//
//    Proxy g_moveto(Proxy firstArg, ...)
//    {
//        va_list args;
//        va_start(args, firstArg);
//        
//        Proxy time = firstArg;
//        Proxy x = va_arg(args, Proxy);
//        Proxy y = va_arg(args, Proxy);
//
//        Animation anim = [Animation moveToAnimationWithX:[x floatValue] y:[y floatValue] time:[time intValue]];
//        
//        va_end(args);
//        
//        return anim;
//    }
//
//    Proxy g_repeat(Proxy firstArg, ...)
//    {
//        va_list args;
//        va_start(args, firstArg);
//        
//        NSMutableArray animations = [NSMutableArray array];
//        [animations addObject:firstArg];
//        Proxy a;
//        while((a = va_arg(args, Proxy))) {
//            [animations addObject:a];
//        }
//        
//        return [Animation repeatAnimation:animations];
//    }
//
//    Proxy g_moveby(Proxy firstArg, ...)
//    {
//        va_list args;
//        va_start(args, firstArg);
//        
//        Proxy time = firstArg;
//        Proxy x = va_arg(args, Proxy);
//        Proxy y = va_arg(args, Proxy);
//        
//        Animation anim = [Animation moveByAnimationWithX:[x floatValue] y:[y floatValue] time:[time intValue]];
//        
//        va_end(args);
//        
//        return anim;
//    }
//
//    Proxy g_sequence(Proxy firstArg, ...)
//    {
//        return [Proxy proxyWithInt:0];
//    }
//
//    Proxy g_animate(Proxy firstArg, ...)
//    {
//        va_list args;
//        va_start(args, firstArg);
//        
//        NSMutableArray images = [NSMutableArray array];
//        
//        Proxy time = firstArg;
//        Proxy imgName = Nil;
//        while((imgName = va_arg(args, Proxy))) {
//            [images addObject:[imgName string]];
//        }
//        
//        Animation anim = [Animation animateAnimationWithImagesArray:images time:[time intValue]];
//        
//        va_end(args);
//        
//        return anim;
//    }
//
//    Proxy g_time(Proxy firstArg, ...)
//    {
//        time_t seconds = time(NULL);
//        
//        return [Proxy proxyWithInt:seconds  1000];
//    }
//
//    Proxy g_trace(Proxy firstArg, ...)
//    {
//        return Nil;
//    }
//
//    Proxy g_log(Proxy firstArg, ...)
//    {
//        va_list args;
//        va_start(args, firstArg);
//        
//        NSMutableString buf = [NSMutableString stringWithString:[firstArg string]];
//        
//        Proxy string = Nil;
//        while((string = va_arg(args, Proxy))) {
//            if ([string respondsToSelector:@selector(string)]) {
//                [buf appendString:@" "];
//                [buf appendString:[string string]];
//            }
//        }
//        
//        NSLog(@"%@", buf);
//        
//        va_end(args);
//        
//        return Nil;
//    }
//
//    Proxy g_sprite(Proxy firstArg, ...)
//    {
//        return [[Sprite alloc] initWithResource:firstArg];
//    }
//
//    Proxy g_abs(Proxy firstArg, ...)
//    {
//        return [Proxy proxyWithInt:abs([firstArg intValue])];
//    }
//
//    Proxy g_http_request(Proxy firstArg, ...)
//    {
//        va_list args;
//        va_start(args, firstArg);
//        
//        MethodCall callback = va_arg(args, MethodCall);
//
//        Proxy postargs = [Proxy nullProxy];
//        if(callback ) {
//            postargs = va_arg(args, Proxy);
//        }
//        
//        Proxy timeout = [Proxy nullProxy];
//        if(![[postargs isNull] boolValue]) {
//            timeout = va_arg(args, Proxy);
//        }
//        
//        Proxy param = [Proxy nullProxy];
//        if(![[timeout isNull] boolValue]) {
//            param = va_arg(args, Proxy);
//        }    
//        
////        NSString baseURL = @"http://50.18.117.242/resources/hww/live/android/";
//        
//        NSURL url = [NSURL URLWithString:[firstArg string]];
//        AFHTTPClient httpClient = [[AFHTTPClient alloc] initWithBaseURL:url];
//        
//        NSMutableDictionary postData = [[NSMutableDictionary alloc] init];
//        NSDictionary pargsdict = ((Dict)postargs).value;
//        for(id key in pargsdict) {
//            [postData setValue:[[pargsdict valueForKey:key] serialized] forKey:key];
//        }
//        
//        [httpClient postPath:@""
//                  parameters:postData
//                     success:^(AFHTTPRequestOperation operation, id responseObject) {
//                            NSString responseStr = [[NSString alloc] initWithData:responseObject encoding:NSUTF8StringEncoding];
////                            NSLog(@"Request Successful, response '%@'", responseStr);
//                         
//                            callback([Proxy proxyWithInt:1], [Proxy proxyWithInt:1], [Proxy proxyWithString:responseStr], param, Nil);
//                     }
//                     failure:^(AFHTTPRequestOperation operation, NSError error) {
//                            NSLog(@"[HTTPClient Error]: %@", error.localizedDescription);
//                         callback([Proxy proxyWithInt:1], [Proxy proxyWithInt:0], [Proxy nullProxy], param, Nil);
//                     }
//         ];
//        
//        va_end(args);
//        
//        return [Proxy proxyWithInt:0];
//    }
//
//    Proxy g_openUrl(Proxy firstArg, ...)
//    {
//        if([[firstArg string] isEqualToString:@"static_achievement"]) {
//        }
//        else if([[firstArg string] isEqualToString:@"static_findfriends"]) {
//        }
//        else {
//            [[UIApplication sharedApplication] openURL:[NSURL URLWithString:[firstArg string]]];
//        }
//
//        return [Proxy nullProxy];
//    }
//
//    Proxy g_ppy_query(Proxy firstArg, ...)
//    {
//        va_list args;
//        va_start(args, firstArg);
//        
//        Proxy queryType = firstArg;
//        Proxy queryArgs = va_arg(args, Proxy);
//        Proxy callBack = va_arg(args, Proxy);
//        Proxy callBackObject = va_arg(args, Proxy);
//        
//        va_end(args);
//        
//        return [Proxy nullProxy];
//    }
//
//    Proxy g_ppy_setscore(Proxy firstArg, ...)
//    {
//        return [Proxy proxyWithInt:0];
//    }
//
//    Proxy g_getmodel(Proxy firstArg, ...)
//    {
//        return [Proxy proxyWithInt:0];
//    }
//
//    Proxy g_callMethod(Proxy firstArg, ...)
//    {
//        MethodCall mcall = (MethodCall)firstArg;
//        
//        return mcall(Nil);
//    }
//
//    Proxy g_c_invoke(MethodCall firstArg, Proxy delay, Proxy object, ...)
//    {
//        va_list v_copy;
//        va_list v_args;
//        va_start(v_args, object);
//        
//        va_copy(v_copy, v_args);
//        
//        double delayInSecs = [delay floatValue] / 1000;
//        
//        dispatch_after(dispatch_time(DISPATCH_TIME_NOW, delayInSecs  NSEC_PER_SEC), dispatch_get_main_queue(), ^{
//            if([[object isNull] intValue] == 0) {
//                firstArg(CONST_1, CONST_1, object, Nil);
//            }
//            else {
//                firstArg(Nil);
//            }
//        });
//        
//        va_end(v_args);
//        
//        return [Proxy proxyWithInt:0];
//    }
//
//    Proxy g_call(MethodCall firstArg, ...)
//    {
//        va_list v_args;
//        va_start(v_args, firstArg);
//        
//        Proxy ret = firstArg(firstArg);
//        
//        va_end(v_args);
//        
//        return ret;
//    }
//
//    Proxy g_createaudio(Proxy firstArg, ...)
//    {
//        return [Sound createSound:[firstArg string]];
//    }
//
//    Proxy g_createsound(Proxy firstArg, ...)
//    {
//        return [Sound createSound:[firstArg string]];
//    }
//
//    Proxy g_json_loads(Proxy firstArg, ...)
//    {
//        return [Proxy proxyWithType:typeDict serializedValue:[firstArg string]];
//    }
//
//    Proxy g_dict(Proxy firstArg, ...)
//    {
//        return [[Dict alloc] initWithArgs:firstArg, Nil];
//    }
//
//    Proxy g_parsexml(Proxy firstArg, ...)
//    {
//        va_list v_args;
//        va_start(v_args, firstArg);
//
//        XMLLoader loader = [[XMLLoader alloc] init];
//        
//        Dict ret;
//        
//        Proxy mode = va_arg(v_args, Proxy);
//        if([mode intValue] == 1) {
//            ret = [loader parseFile:[firstArg string]];
//        }
//        else {
//            ret = [loader parseString:[firstArg string]];
//        }
//        
//        va_end(v_args);
//
//        return ret;
//    }
//
//    Proxy g_ppy_unlockachievement(Proxy firstArg, ...)
//    {
//        return [Proxy nullProxy];
//    }
//
//    Proxy g_ppy_listachievements(Proxy firstArg, ...)
//    {
//        return [Proxy nullProxy];
//    }
//
//    Proxy g_int(Proxy firstArg, ...)
//    {
//        return [Proxy proxyWithInt:[firstArg intValue]];
//    }
//
//    Proxy g_c_addtimer(Proxy firstArg, ...)
//    {
//        va_list args;
//        va_start(args, firstArg);
//        
//        Proxy interval = firstArg;
//        MethodCall callback = va_arg(args, MethodCall);
//        Proxy param = va_arg(args, Proxy);
//        Proxy afterDelay;
//        Proxy repeat;
//        
//        if(param) {
//            afterDelay = va_arg(args, Proxy);
//        }
//        if(afterDelay) {
//            repeat = va_arg(args, Proxy);
//        }
//        
//        TimerHandler timer = [[TimerHandler alloc] initWithInterval:[interval floatValue] / 1000
//                                                            callback:callback
//                                                               param:param
//                                                               delay:[afterDelay floatValue] /1000
//                                                              repeat:[repeat intValue]];
//        
//        return [Proxy nullProxy];
//    }
//
//    Proxy g_str(Proxy firstArg, ...)
//    {
//        return [Proxy proxyWithString:[firstArg string]];
//    }
//
//    Proxy g_v_scale(Proxy firstArg, ...)
//    {
//        va_list v_list;
//        va_start(v_list, firstArg);
//        
//        Proxy secondArg = va_arg(v_list, Proxy );
//        
//        [[Scene sharedScene] defineScaleWidth:[firstArg intValue] height:[secondArg intValue]];
//        
//        va_end(v_list);
//        
//        return [Proxy nullProxy];
//    }
//
//    Proxy g_getscene(Proxy firstArg, ...)
//    {
//        return [Scene sharedScene];
//    }
//
//    Proxy g_len(Proxy firstArg, ...)
//    {
//        return [firstArg len];
//    }
//
//    Proxy g_rand(Proxy firstArg, ...)
//    {
//        return [Proxy proxyWithInt:arc4random() % [firstArg intValue]];
//    }
//
//    Proxy g_quitgame(Proxy firstArg, ...)
//    {
//        NSLog(@"Quit!");
//        
//        return [Proxy nullProxy];
//    }
//
//    @implementation Proxy
//
//    + (Proxy)timerHandler:(MethodCall)method
//    {
//        
//    }
//
//    + (void)defineConstants
//    {
//        CONST_0 = [Proxy proxyWithInt:0];
//        CONST_1 = [Proxy proxyWithInt:1];
//    }
//
//    + (Proxy)proxyWithString:(NSString)str
//    {
//        return [[String alloc] initWithString:str];
//    }
//
//    + (Proxy)proxyWithInt:(int)num
//    {
//        return [[Int alloc] initWithInt:num];
//    }
//
//    + (Proxy)proxyWithFloat:(float)num
//    {
//        return [[Float alloc] initWithFloat:num];
//    }
//
//    + (Proxy)proxyWithSelector:(SEL)sel
//    {
//        return [Proxy nullProxy];
//    }
//
//    + (Proxy)nullProxy
//    {
//        static Proxy nul = Nil;
//        
//        @synchronized(self)
//        {
//            if(nul == Nil) {
//                nul = [[NullProxy alloc] init];
//            }
//        }
//        
//        return nul;
//    }
//
//    + (Proxy)staticCall:(NSString)methodName args:(Proxy)firstArg, ...
//    {
//        return [Proxy nullProxy];
//    }
//
//    - (id)initProxy:(Proxy )firstArg, ...
//    {
//        self = [super init];
//        if(self) {
//            [self defineMethods];
//        }
//        return self;
//    }
//
//    - (Proxy)smart_copy
//    {
//        return self;
//    }
//
//    - (int)intValue
//    {
//        return 1;
//    }
//
//    - (float)floatValue
//    {
//        return 0;
//    }
//
//    - (BOOL)boolValue
//    {
//        return YES;
//    }
//
//    - (NSString)string
//    {
//        return @"";
//    }
//
//    - (Proxy)isEq:(Proxy)proxy
//    {
//        return [Proxy proxyWithInt:self == proxy];
//    }
//
//    - (Proxy)isNotEq:(Proxy)proxy
//    {
//        return [Proxy proxyWithInt:self != proxy];
//    }
//
//    - (Proxy)isGt:(Proxy)proxy
//    {
//        return NO;
//    }
//
//    - (Proxy)isGtOrEq:(Proxy)proxy
//    {
//        return NO;
//    }
//
//    - (Proxy)isLe:(Proxy)proxy
//    {
//        return NO;
//    }
//
//    - (Proxy)isLeOrEq:(Proxy)proxy
//    {
//        return NO;
//    }
//
//    - (Proxy)proxyAtIndex:(Proxy)proxy
//    {
//        return Nil;
//    }
//
//    - (Proxy)isNull
//    {
//        return [[Proxy nullProxy] isEq:self];
//    }
//
//    - (Proxy)proxyForKey:(Proxy)proxy
//    {
//        return Nil;
//    }
//
//    - (Proxy)add:(Proxy)proxy, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)sub:(Proxy)proxy
//    {
//        return Nil;
//    }
//
//    - (Proxy)mul:(Proxy)proxy
//    {
//        return Nil;
//    }
//
//    - (Proxy)div:(Proxy)proxy
//    {
//        return Nil;
//    }
//
//    - (Proxy)add2self:(Proxy)proxy, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)sub2self:(Proxy)proxy
//    {
//        return Nil;
//    }
//
//    - (Proxy)mul2self:(Proxy)proxy
//    {
//        return Nil;
//    }
//
//    - (Proxy)div2self:(Proxy)proxy
//    {
//        return Nil;
//    }
//
//    - (Proxy)reminder:(Proxy)proxy
//    {
//        return Nil;
//    }
//
//    - (Proxy)bitwiseOr:(Proxy)proxy
//    {
//        return Nil;
//    }
//
//    - (Proxy)bitwiseAnd:(Proxy)proxy
//    {
//        return Nil;
//    }
//
//    - (Proxy)logicalOr:(Proxy)val
//    {
//        return [Proxy proxyWithInt:([self boolValue] || [val boolValue])];
//    }
//
//    - (Proxy)logicalAnd:(Proxy)val
//    {
//        BOOL left = [self boolValue];
//        if(left) {
//            BOOL right = [val boolValue];
//            if(right) {
//                return [Proxy proxyWithInt:1];
//            }
//        }
//        
//        return [Proxy proxyWithInt:0];
//    }
//
//    - (Proxy)neg
//    {
//        //return [Proxy proxyWithInt:-[self intValue]];
//        return Nil;
//    }
//
//    - (Proxy)plus
//    {
//        return Nil;
//    }
//
//    - (Proxy)dec
//    {
//        return Nil;
//    }
//
//    - (Proxy)inc
//    {
//        return Nil;
//    }
//
//    - (Proxy)not
//    {
//        return [Proxy proxyWithInt:![self boolValue]];
//    }
//
//    - (Proxy)toInt
//    {
//        return [Proxy proxyWithInt:[self intValue]];
//    }
//
//    - (void)setProxy:(Proxy)val atIndex:(Proxy)index
//    {
//    }
//
//    - (Proxy)pop:(Proxy )val, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)get:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)update:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)put:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)values:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)keys:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)has_key:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)remove:(Proxy )val, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)clear:(Proxy )val, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)size:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)addlabel:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)texture:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)visible:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)color:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)rotate:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)prepare:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)removefromparent:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)subnodes:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)node2world:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)world2node:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)clipping:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)flip:(Proxy)firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)bringtofront:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)bringtoback:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)replace:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)split:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)substring:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)lower:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)preparetoplay:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)play:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)stop:(Proxy )firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)focus:(Proxy)firstArg, ...
//    {
//        return Nil;
//    }
//
//    - (Proxy)len
//    {
//        return CONST_0;
//    }
//
//    - (NSString)serialized
//    {
//        return @"";
//    }
//
//    - (ObjectType)objectType
//    {
//        return typeUndefined;
//    }
//    + (Proxy)restorePurchases:(Proxy)dummy, ...
//    {
//        [[SKPaymentQueue defaultQueue] restoreCompletedTransactions];
//        
//        return [Proxy nullProxy];
//    }
//
//    + (Proxy)proxyWithType:(int)type serializedValue:(NSString)serializedValue
//    {
//        Proxy ret = Nil;
//        
//        switch (type) {
//            case typeInt:
//                ret = [Proxy proxyWithInt:[serializedValue intValue]];
//                break;
//                
//            case typeFloat:
//                ret = [Proxy proxyWithFloat:[serializedValue floatValue]];
//                break;
//                
//            case typeString:
//                ret = [Proxy proxyWithString:serializedValue];
//                break;
//                
//            case typeArray:
//                ret = [[Array alloc] initWithArray:[serializedValue JSONValue]];
//                break;
//                
//            case typeDict:
//                ret = [Dict dictWithDictionary:[serializedValue JSONValue]];
//                break;
//                
//            case typeNull:
//                ret = [Proxy nullProxy];
//                break;
//        };
//        
//        return ret;
//    }
//
//    - (void)defineMethods
//    {
//    }

}
