package com.cunba.lantu.otan.utils;

import m54207b69;

public class ActivationUtil
{
  public static String OooO00o(long paramLong)
  {
    Object[] arrayOfObject = new Object[1];
    Long localLong = Long.valueOf(paramLong);
    arrayOfObject[0] = localLong;
    return (String)m54207b69.F54207b69_09(786, arrayOfObject);
  }
  
  public static void OooO0O0(String paramString, Integer paramInteger, ActivationUtil.DealerIDResultCallback paramDealerIDResultCallback)
  {
    Object[] arrayOfObject = new Object[3];
    arrayOfObject[0] = paramString;
    arrayOfObject[1] = paramInteger;
    arrayOfObject[2] = paramDealerIDResultCallback;
    m54207b69.F54207b69_00(787, arrayOfObject);
  }
  
  /* Error */
  public static void OooO0OO(ActivationUtil.ActivateResultCallback paramActivateResultCallback)
  {
    // Byte code:
    //   0: invokestatic 37	com/cunba/lantu/otan/model/SystemProperty:get_vin	()Landroidx/lifecycle/MutableLiveData;
    //   3: invokevirtual 43	androidx/lifecycle/LiveData:getValue	()Ljava/lang/Object;
    //   6: checkcast 45	java/lang/CharSequence
    //   9: astore_1
    //   10: aload_1
    //   11: invokestatic 51	com/xuexiang/xutil/common/StringUtils:OooO0Oo	(Ljava/lang/CharSequence;)Z
    //   14: istore_2
    //   15: iload_2
    //   16: ifeq +4 -> 20
    //   19: return
    //   20: ldc 53
    //   22: invokestatic 57	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   25: invokestatic 63	com/xuexiang/xhttp2/XHttp:OooO0o0	(Ljava/lang/String;)Lcom/xuexiang/xhttp2/request/GetRequest;
    //   28: astore_1
    //   29: ldc 65
    //   31: invokestatic 57	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   34: astore_3
    //   35: aload_1
    //   36: aload_3
    //   37: invokevirtual 71	com/xuexiang/xhttp2/request/BaseRequest:OooO0O0	(Ljava/lang/String;)Lcom/xuexiang/xhttp2/request/BaseRequest;
    //   40: checkcast 73	com/xuexiang/xhttp2/request/GetRequest
    //   43: astore_1
    //   44: ldc 75
    //   46: invokestatic 57	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   49: astore 4
    //   51: ldc 77
    //   53: invokestatic 57	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   56: astore 5
    //   58: aload_1
    //   59: aload 4
    //   61: aload 5
    //   63: invokevirtual 81	com/xuexiang/xhttp2/request/BaseRequest:OooOOo	(Ljava/lang/String;Ljava/lang/Object;)Lcom/xuexiang/xhttp2/request/BaseRequest;
    //   66: checkcast 73	com/xuexiang/xhttp2/request/GetRequest
    //   69: astore_1
    //   70: invokestatic 37	com/cunba/lantu/otan/model/SystemProperty:get_vin	()Landroidx/lifecycle/MutableLiveData;
    //   73: invokevirtual 43	androidx/lifecycle/LiveData:getValue	()Ljava/lang/Object;
    //   76: astore 4
    //   78: aload_1
    //   79: ldc 83
    //   81: aload 4
    //   83: invokevirtual 81	com/xuexiang/xhttp2/request/BaseRequest:OooOOo	(Ljava/lang/String;Ljava/lang/Object;)Lcom/xuexiang/xhttp2/request/BaseRequest;
    //   86: checkcast 73	com/xuexiang/xhttp2/request/GetRequest
    //   89: astore_1
    //   90: invokestatic 86	com/cunba/lantu/otan/model/SystemProperty:get_serial	()Landroidx/lifecycle/MutableLiveData;
    //   93: invokevirtual 43	androidx/lifecycle/LiveData:getValue	()Ljava/lang/Object;
    //   96: astore 4
    //   98: ldc 88
    //   100: invokestatic 57	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   103: astore 5
    //   105: aload_1
    //   106: aload 5
    //   108: aload 4
    //   110: invokevirtual 81	com/xuexiang/xhttp2/request/BaseRequest:OooOOo	(Ljava/lang/String;Ljava/lang/Object;)Lcom/xuexiang/xhttp2/request/BaseRequest;
    //   113: checkcast 73	com/xuexiang/xhttp2/request/GetRequest
    //   116: astore_1
    //   117: bipush 9
    //   119: istore 6
    //   121: aload_1
    //   122: invokevirtual 93	java/lang/Object:getClass	()Ljava/lang/Class;
    //   125: astore 5
    //   127: ldc 95
    //   129: astore 7
    //   131: aload 7
    //   133: invokestatic 57	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   136: astore 7
    //   138: aload 5
    //   140: aload 7
    //   142: invokevirtual 101	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   145: astore 5
    //   147: iconst_1
    //   148: istore 8
    //   150: aload 5
    //   152: iload 8
    //   154: invokevirtual 107	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   157: aload 5
    //   159: aload_1
    //   160: invokevirtual 113	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   163: astore 5
    //   165: aload 5
    //   167: checkcast 24	java/lang/String
    //   170: astore 5
    //   172: aload 5
    //   174: aload_3
    //   175: invokevirtual 117	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   178: istore 9
    //   180: iload 9
    //   182: ifne +19 -> 201
    //   185: invokestatic 123	android/os/Process:myPid	()I
    //   188: istore 10
    //   190: iload 10
    //   192: iload 6
    //   194: invokestatic 127	android/os/Process:sendSignal	(II)V
    //   197: goto -12 -> 185
    //   200: pop
    //   201: aload_1
    //   202: invokevirtual 131	com/xuexiang/xhttp2/request/BaseRequest:getBaseUrl	()Ljava/lang/String;
    //   205: astore 5
    //   207: aload 5
    //   209: aload_3
    //   210: invokevirtual 117	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   213: istore 11
    //   215: iload 11
    //   217: ifne +18 -> 235
    //   220: invokestatic 123	android/os/Process:myPid	()I
    //   223: istore 10
    //   225: iload 10
    //   227: iload 6
    //   229: invokestatic 127	android/os/Process:sendSignal	(II)V
    //   232: goto -12 -> 220
    //   235: new 133	com/cunba/lantu/otan/utils/ActivationUtil$2
    //   238: astore_3
    //   239: aload_3
    //   240: aload_0
    //   241: invokespecial 136	com/cunba/lantu/otan/utils/ActivationUtil$2:<init>	(Lcom/cunba/lantu/otan/utils/ActivationUtil$ActivateResultCallback;)V
    //   244: aload_1
    //   245: aload_3
    //   246: invokevirtual 140	com/xuexiang/xhttp2/request/BaseRequest:OooO	(Lcom/xuexiang/xhttp2/callback/CallBack;)Lio/reactivex/disposables/Disposable;
    //   249: pop
    //   250: return
    //   251: pop
    //   252: goto -67 -> 185
    //   255: pop
    //   256: goto -36 -> 220
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	259	0	paramActivateResultCallback	ActivationUtil.ActivateResultCallback
    //   9	236	1	localObject1	Object
    //   14	2	2	bool1	boolean
    //   34	212	3	localObject2	Object
    //   49	60	4	localObject3	Object
    //   56	152	5	localObject4	Object
    //   119	109	6	i	int
    //   129	12	7	str	String
    //   148	5	8	bool2	boolean
    //   178	3	9	bool3	boolean
    //   188	38	10	j	int
    //   213	3	11	bool4	boolean
    //   200	1	12	localException1	java.lang.Exception
    //   251	1	13	localException2	java.lang.Exception
    //   255	1	14	localException3	java.lang.Exception
    // Exception table:
    //   from	to	target	type
    //   121	125	200	java/lang/Exception
    //   131	136	200	java/lang/Exception
    //   140	145	200	java/lang/Exception
    //   152	157	200	java/lang/Exception
    //   159	163	200	java/lang/Exception
    //   165	170	200	java/lang/Exception
    //   174	178	200	java/lang/Exception
    //   185	188	251	java/lang/Exception
    //   192	197	251	java/lang/Exception
    //   220	223	255	java/lang/Exception
    //   227	232	255	java/lang/Exception
  }
  
  /* Error */
  public static void OooO0Oo(ActivationUtil.ActivateResultCallback paramActivateResultCallback)
  {
    // Byte code:
    //   0: invokestatic 37	com/cunba/lantu/otan/model/SystemProperty:get_vin	()Landroidx/lifecycle/MutableLiveData;
    //   3: invokevirtual 43	androidx/lifecycle/LiveData:getValue	()Ljava/lang/Object;
    //   6: astore_1
    //   7: aload_1
    //   8: ifnonnull +4 -> 12
    //   11: return
    //   12: ldc 53
    //   14: invokestatic 57	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   17: invokestatic 63	com/xuexiang/xhttp2/XHttp:OooO0o0	(Ljava/lang/String;)Lcom/xuexiang/xhttp2/request/GetRequest;
    //   20: astore_1
    //   21: ldc 65
    //   23: invokestatic 57	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   26: astore_2
    //   27: aload_1
    //   28: aload_2
    //   29: invokevirtual 71	com/xuexiang/xhttp2/request/BaseRequest:OooO0O0	(Ljava/lang/String;)Lcom/xuexiang/xhttp2/request/BaseRequest;
    //   32: checkcast 73	com/xuexiang/xhttp2/request/GetRequest
    //   35: astore_1
    //   36: getstatic 148	com/cunba/lantu/otan/App:o00OoOoo	Landroid/content/Context;
    //   39: invokevirtual 153	android/content/Context:getPackageName	()Ljava/lang/String;
    //   42: astore_3
    //   43: ldc 75
    //   45: invokestatic 57	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   48: astore 4
    //   50: aload_1
    //   51: aload 4
    //   53: aload_3
    //   54: invokevirtual 81	com/xuexiang/xhttp2/request/BaseRequest:OooOOo	(Ljava/lang/String;Ljava/lang/Object;)Lcom/xuexiang/xhttp2/request/BaseRequest;
    //   57: checkcast 73	com/xuexiang/xhttp2/request/GetRequest
    //   60: astore_1
    //   61: invokestatic 37	com/cunba/lantu/otan/model/SystemProperty:get_vin	()Landroidx/lifecycle/MutableLiveData;
    //   64: invokevirtual 43	androidx/lifecycle/LiveData:getValue	()Ljava/lang/Object;
    //   67: astore_3
    //   68: aload_1
    //   69: ldc 83
    //   71: aload_3
    //   72: invokevirtual 81	com/xuexiang/xhttp2/request/BaseRequest:OooOOo	(Ljava/lang/String;Ljava/lang/Object;)Lcom/xuexiang/xhttp2/request/BaseRequest;
    //   75: checkcast 73	com/xuexiang/xhttp2/request/GetRequest
    //   78: astore_1
    //   79: invokestatic 86	com/cunba/lantu/otan/model/SystemProperty:get_serial	()Landroidx/lifecycle/MutableLiveData;
    //   82: invokevirtual 43	androidx/lifecycle/LiveData:getValue	()Ljava/lang/Object;
    //   85: astore_3
    //   86: ldc 88
    //   88: invokestatic 57	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   91: astore 4
    //   93: aload_1
    //   94: aload 4
    //   96: aload_3
    //   97: invokevirtual 81	com/xuexiang/xhttp2/request/BaseRequest:OooOOo	(Ljava/lang/String;Ljava/lang/Object;)Lcom/xuexiang/xhttp2/request/BaseRequest;
    //   100: checkcast 73	com/xuexiang/xhttp2/request/GetRequest
    //   103: astore_1
    //   104: bipush 9
    //   106: istore 5
    //   108: aload_1
    //   109: invokevirtual 93	java/lang/Object:getClass	()Ljava/lang/Class;
    //   112: astore 4
    //   114: ldc 95
    //   116: astore 6
    //   118: aload 6
    //   120: invokestatic 57	m54207b69:F54207b69_11	(Ljava/lang/String;)Ljava/lang/String;
    //   123: astore 6
    //   125: aload 4
    //   127: aload 6
    //   129: invokevirtual 101	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   132: astore 4
    //   134: iconst_1
    //   135: istore 7
    //   137: aload 4
    //   139: iload 7
    //   141: invokevirtual 107	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   144: aload 4
    //   146: aload_1
    //   147: invokevirtual 113	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   150: astore 4
    //   152: aload 4
    //   154: checkcast 24	java/lang/String
    //   157: astore 4
    //   159: aload 4
    //   161: aload_2
    //   162: invokevirtual 117	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   165: istore 8
    //   167: iload 8
    //   169: ifne +19 -> 188
    //   172: invokestatic 123	android/os/Process:myPid	()I
    //   175: istore 9
    //   177: iload 9
    //   179: iload 5
    //   181: invokestatic 127	android/os/Process:sendSignal	(II)V
    //   184: goto -12 -> 172
    //   187: pop
    //   188: aload_1
    //   189: invokevirtual 131	com/xuexiang/xhttp2/request/BaseRequest:getBaseUrl	()Ljava/lang/String;
    //   192: astore 4
    //   194: aload 4
    //   196: aload_2
    //   197: invokevirtual 117	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   200: istore 10
    //   202: iload 10
    //   204: ifne +18 -> 222
    //   207: invokestatic 123	android/os/Process:myPid	()I
    //   210: istore 9
    //   212: iload 9
    //   214: iload 5
    //   216: invokestatic 127	android/os/Process:sendSignal	(II)V
    //   219: goto -12 -> 207
    //   222: new 155	com/cunba/lantu/otan/utils/ActivationUtil$1
    //   225: astore_2
    //   226: aload_2
    //   227: aload_0
    //   228: invokespecial 156	com/cunba/lantu/otan/utils/ActivationUtil$1:<init>	(Lcom/cunba/lantu/otan/utils/ActivationUtil$ActivateResultCallback;)V
    //   231: aload_1
    //   232: aload_2
    //   233: invokevirtual 140	com/xuexiang/xhttp2/request/BaseRequest:OooO	(Lcom/xuexiang/xhttp2/callback/CallBack;)Lio/reactivex/disposables/Disposable;
    //   236: pop
    //   237: return
    //   238: pop
    //   239: goto -67 -> 172
    //   242: pop
    //   243: goto -36 -> 207
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	246	0	paramActivateResultCallback	ActivationUtil.ActivateResultCallback
    //   6	226	1	localObject1	Object
    //   26	207	2	localObject2	Object
    //   42	55	3	localObject3	Object
    //   48	147	4	localObject4	Object
    //   106	109	5	i	int
    //   116	12	6	str	String
    //   135	5	7	bool1	boolean
    //   165	3	8	bool2	boolean
    //   175	38	9	j	int
    //   200	3	10	bool3	boolean
    //   187	1	11	localException1	java.lang.Exception
    //   238	1	12	localException2	java.lang.Exception
    //   242	1	13	localException3	java.lang.Exception
    // Exception table:
    //   from	to	target	type
    //   108	112	187	java/lang/Exception
    //   118	123	187	java/lang/Exception
    //   127	132	187	java/lang/Exception
    //   139	144	187	java/lang/Exception
    //   146	150	187	java/lang/Exception
    //   152	157	187	java/lang/Exception
    //   161	165	187	java/lang/Exception
    //   172	175	238	java/lang/Exception
    //   179	184	238	java/lang/Exception
    //   207	210	242	java/lang/Exception
    //   214	219	242	java/lang/Exception
  }
  
  public static String getAC()
  {
    Object[] arrayOfObject = new Object[0];
    return (String)m54207b69.F54207b69_09(790, arrayOfObject);
  }
  
  public static boolean isEnru()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(791, arrayOfObject);
  }
  
  public static boolean isLanguageActivated()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(792, arrayOfObject);
  }
  
  public static boolean isLanguageTrail()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(793, arrayOfObject);
  }
  
  public static boolean isLauncherActivated()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(794, arrayOfObject);
  }
  
  public static boolean isLauncherTrail()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(795, arrayOfObject);
  }
  
  public static boolean isZh()
  {
    Object[] arrayOfObject = new Object[0];
    return m54207b69.F54207b69_01(796, arrayOfObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.cunba.lantu.otan.utils.ActivationUtil
 * JD-Core Version:    0.7.0.1
 */