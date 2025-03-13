package androidx.appcompat.widget;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

class ActivityChooserModel
  extends DataSetObservable
{
  public static final Object OooOOO;
  public static final Map OooOOOO;
  public boolean OooO;
  public final Object OooO00o;
  public final List OooO0O0;
  public final List OooO0OO;
  public final Context OooO0Oo;
  public Intent OooO0o;
  public final String OooO0o0;
  public ActivityChooserModel.ActivitySorter OooO0oO;
  public int OooO0oo;
  public boolean OooOO0;
  public boolean OooOO0O;
  public boolean OooOO0o;
  public ActivityChooserModel.OnChooseActivityListener OooOOO0;
  
  static
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    OooOOO = localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    OooOOOO = (Map)localObject;
  }
  
  public ActivityChooserModel(Context paramContext, String paramString)
  {
    Object localObject = new java/lang/Object;
    localObject.<init>();
    this.OooO00o = localObject;
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooO0O0 = ((List)localObject);
    localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooO0OO = ((List)localObject);
    localObject = new androidx/appcompat/widget/ActivityChooserModel$DefaultSorter;
    ((ActivityChooserModel.DefaultSorter)localObject).<init>();
    this.OooO0oO = ((ActivityChooserModel.ActivitySorter)localObject);
    this.OooO0oo = 50;
    boolean bool1 = true;
    this.OooO = bool1;
    this.OooOO0 = false;
    this.OooOO0O = bool1;
    this.OooOO0o = false;
    paramContext = paramContext.getApplicationContext();
    this.OooO0Oo = paramContext;
    boolean bool2 = TextUtils.isEmpty(paramString);
    if (!bool2)
    {
      paramContext = ".xml";
      bool1 = paramString.endsWith(paramContext);
      if (!bool1)
      {
        localObject = new java/lang/StringBuilder;
        ((StringBuilder)localObject).<init>();
        ((StringBuilder)localObject).append(paramString);
        ((StringBuilder)localObject).append(paramContext);
        paramContext = ((StringBuilder)localObject).toString();
        this.OooO0o0 = paramContext;
        return;
      }
    }
    this.OooO0o0 = paramString;
  }
  
  public static ActivityChooserModel OooO0Oo(Context paramContext, String paramString)
  {
    synchronized (OooOOO)
    {
      Map localMap = OooOOOO;
      Object localObject2 = localMap.get(paramString);
      localObject2 = (ActivityChooserModel)localObject2;
      if (localObject2 == null)
      {
        localObject2 = new androidx/appcompat/widget/ActivityChooserModel;
        ((ActivityChooserModel)localObject2).<init>(paramContext, paramString);
        localMap.put(paramString, localObject2);
      }
      return localObject2;
    }
  }
  
  public final boolean OooO()
  {
    boolean bool = this.OooO;
    if (bool)
    {
      bool = this.OooOO0O;
      if (bool)
      {
        String str = this.OooO0o0;
        bool = TextUtils.isEmpty(str);
        if (!bool)
        {
          this.OooO = false;
          bool = true;
          this.OooOO0 = bool;
          OooOO0();
          return bool;
        }
      }
    }
    return false;
  }
  
  public final boolean OooO00o(ActivityChooserModel.HistoricalRecord paramHistoricalRecord)
  {
    List localList = this.OooO0OO;
    boolean bool1 = localList.add(paramHistoricalRecord);
    if (bool1)
    {
      boolean bool2 = true;
      this.OooOO0O = bool2;
      OooO0oo();
      OooO0oO();
      OooOO0O();
      notifyChanged();
    }
    return bool1;
  }
  
  public Intent OooO0O0(int paramInt)
  {
    synchronized (this.OooO00o)
    {
      Object localObject2 = this.OooO0o;
      ActivityChooserModel.HistoricalRecord localHistoricalRecord = null;
      if (localObject2 == null) {
        return null;
      }
      OooO0OO();
      localObject2 = this.OooO0O0;
      Object localObject3 = ((List)localObject2).get(paramInt);
      localObject3 = (ActivityChooserModel.ActivityResolveInfo)localObject3;
      localObject2 = new android/content/ComponentName;
      localObject3 = ((ActivityChooserModel.ActivityResolveInfo)localObject3).o00OoOoo;
      localObject3 = ((ResolveInfo)localObject3).activityInfo;
      Object localObject5 = ((ActivityInfo)localObject3).packageName;
      localObject3 = ((ActivityInfo)localObject3).name;
      ((ComponentName)localObject2).<init>((String)localObject5, (String)localObject3);
      localObject3 = new android/content/Intent;
      localObject5 = this.OooO0o;
      ((Intent)localObject3).<init>((Intent)localObject5);
      ((Intent)localObject3).setComponent((ComponentName)localObject2);
      localObject5 = this.OooOOO0;
      if (localObject5 != null)
      {
        localObject5 = new android/content/Intent;
        ((Intent)localObject5).<init>((Intent)localObject3);
        ActivityChooserModel.OnChooseActivityListener localOnChooseActivityListener = this.OooOOO0;
        boolean bool = localOnChooseActivityListener.OooO00o(this, (Intent)localObject5);
        if (bool) {
          return null;
        }
      }
      localHistoricalRecord = new androidx/appcompat/widget/ActivityChooserModel$HistoricalRecord;
      long l = System.currentTimeMillis();
      float f = 1.0F;
      localHistoricalRecord.<init>((ComponentName)localObject2, l, f);
      OooO00o(localHistoricalRecord);
      return localObject3;
    }
  }
  
  public final void OooO0OO()
  {
    boolean bool1 = OooO0o();
    boolean bool2 = OooO();
    bool1 |= bool2;
    OooO0oo();
    if (bool1)
    {
      OooOO0O();
      notifyChanged();
    }
  }
  
  public final boolean OooO0o()
  {
    boolean bool = this.OooOO0o;
    int i = 0;
    if (bool)
    {
      Object localObject = this.OooO0o;
      if (localObject != null)
      {
        this.OooOO0o = false;
        this.OooO0O0.clear();
        localObject = this.OooO0Oo.getPackageManager();
        Intent localIntent = this.OooO0o;
        localObject = ((PackageManager)localObject).queryIntentActivities(localIntent, 0);
        int j = ((List)localObject).size();
        while (i < j)
        {
          ResolveInfo localResolveInfo = (ResolveInfo)((List)localObject).get(i);
          List localList = this.OooO0O0;
          ActivityChooserModel.ActivityResolveInfo localActivityResolveInfo = new androidx/appcompat/widget/ActivityChooserModel$ActivityResolveInfo;
          localActivityResolveInfo.<init>(localResolveInfo);
          localList.add(localActivityResolveInfo);
          i += 1;
        }
        return true;
      }
    }
    return false;
  }
  
  public int OooO0o0(ResolveInfo paramResolveInfo)
  {
    synchronized (this.OooO00o)
    {
      OooO0OO();
      List localList = this.OooO0O0;
      int i = localList.size();
      int j = 0;
      while (j < i)
      {
        Object localObject2 = localList.get(j);
        localObject2 = (ActivityChooserModel.ActivityResolveInfo)localObject2;
        localObject2 = ((ActivityChooserModel.ActivityResolveInfo)localObject2).o00OoOoo;
        if (localObject2 == paramResolveInfo) {
          return j;
        }
        j += 1;
      }
      return -1;
    }
  }
  
  public final void OooO0oO()
  {
    boolean bool = this.OooOO0;
    if (bool)
    {
      bool = this.OooOO0O;
      if (!bool) {
        return;
      }
      this.OooOO0O = false;
      localObject1 = this.OooO0o0;
      bool = TextUtils.isEmpty((CharSequence)localObject1);
      if (!bool)
      {
        localObject1 = new androidx/appcompat/widget/ActivityChooserModel$PersistHistoryAsyncTask;
        ((ActivityChooserModel.PersistHistoryAsyncTask)localObject1).<init>(this);
        Executor localExecutor = AsyncTask.THREAD_POOL_EXECUTOR;
        Object localObject2 = new java/util/ArrayList;
        Object localObject3 = this.OooO0OO;
        ((ArrayList)localObject2).<init>((Collection)localObject3);
        localObject3 = this.OooO0o0;
        localObject2 = new Object[] { localObject2, localObject3 };
        ((AsyncTask)localObject1).executeOnExecutor(localExecutor, (Object[])localObject2);
      }
      return;
    }
    Object localObject1 = new java/lang/IllegalStateException;
    ((IllegalStateException)localObject1).<init>("No preceding call to #readHistoricalData");
    throw ((Throwable)localObject1);
  }
  
  public final void OooO0oo()
  {
    List localList = this.OooO0OO;
    int i = localList.size();
    int j = this.OooO0oo;
    i -= j;
    if (i <= 0) {
      return;
    }
    this.OooOO0O = true;
    j = 0;
    int k = 0;
    while (k < i)
    {
      ((ActivityChooserModel.HistoricalRecord)this.OooO0OO.remove(0));
      k += 1;
    }
  }
  
  /* Error */
  public final void OooOO0()
  {
    // Byte code:
    //   0: ldc 253
    //   2: astore_1
    //   3: aload_0
    //   4: getfield 77	androidx/appcompat/widget/ActivityChooserModel:OooO0Oo	Landroid/content/Context;
    //   7: astore_2
    //   8: aload_0
    //   9: getfield 104	androidx/appcompat/widget/ActivityChooserModel:OooO0o0	Ljava/lang/String;
    //   12: astore_3
    //   13: aload_2
    //   14: aload_3
    //   15: invokevirtual 257	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   18: astore_2
    //   19: invokestatic 263	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   22: astore_3
    //   23: ldc_w 265
    //   26: astore 4
    //   28: aload_3
    //   29: aload_2
    //   30: aload 4
    //   32: invokeinterface 271 3 0
    //   37: iconst_0
    //   38: istore 5
    //   40: aconst_null
    //   41: astore 4
    //   43: iconst_1
    //   44: istore 6
    //   46: iload 5
    //   48: iload 6
    //   50: if_icmpeq +24 -> 74
    //   53: iconst_2
    //   54: istore 7
    //   56: iload 5
    //   58: iload 7
    //   60: if_icmpeq +14 -> 74
    //   63: aload_3
    //   64: invokeinterface 275 1 0
    //   69: istore 5
    //   71: goto -28 -> 43
    //   74: ldc_w 277
    //   77: astore 4
    //   79: aload_3
    //   80: invokeinterface 280 1 0
    //   85: astore 8
    //   87: aload 4
    //   89: aload 8
    //   91: invokevirtual 283	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   94: istore 5
    //   96: iload 5
    //   98: ifeq +219 -> 317
    //   101: aload_0
    //   102: getfield 52	androidx/appcompat/widget/ActivityChooserModel:OooO0OO	Ljava/util/List;
    //   105: astore 4
    //   107: aload 4
    //   109: invokeinterface 206 1 0
    //   114: aload_3
    //   115: invokeinterface 275 1 0
    //   120: istore 7
    //   122: iload 7
    //   124: iload 6
    //   126: if_icmpne +14 -> 140
    //   129: aload_2
    //   130: ifnull +275 -> 405
    //   133: aload_2
    //   134: invokevirtual 288	java/io/FileInputStream:close	()V
    //   137: goto +268 -> 405
    //   140: iconst_3
    //   141: istore 9
    //   143: ldc_w 289
    //   146: fstore 10
    //   148: iload 7
    //   150: iload 9
    //   152: if_icmpeq -38 -> 114
    //   155: iconst_4
    //   156: istore 9
    //   158: ldc_w 290
    //   161: fstore 10
    //   163: iload 7
    //   165: iload 9
    //   167: if_icmpne +6 -> 173
    //   170: goto -56 -> 114
    //   173: aload_3
    //   174: invokeinterface 280 1 0
    //   179: astore 8
    //   181: ldc_w 292
    //   184: astore 11
    //   186: aload 11
    //   188: aload 8
    //   190: invokevirtual 283	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   193: istore 7
    //   195: iload 7
    //   197: ifeq +103 -> 300
    //   200: ldc_w 294
    //   203: astore 8
    //   205: iconst_0
    //   206: istore 9
    //   208: fconst_0
    //   209: fstore 10
    //   211: aconst_null
    //   212: astore 11
    //   214: aload_3
    //   215: aconst_null
    //   216: aload 8
    //   218: invokeinterface 298 3 0
    //   223: astore 8
    //   225: ldc_w 300
    //   228: astore 12
    //   230: aload_3
    //   231: aconst_null
    //   232: aload 12
    //   234: invokeinterface 298 3 0
    //   239: astore 12
    //   241: aload 12
    //   243: invokestatic 306	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   246: lstore 13
    //   248: ldc_w 308
    //   251: astore 15
    //   253: aload_3
    //   254: aconst_null
    //   255: aload 15
    //   257: invokeinterface 298 3 0
    //   262: astore 11
    //   264: aload 11
    //   266: invokestatic 314	java/lang/Float:parseFloat	(Ljava/lang/String;)F
    //   269: fstore 10
    //   271: new 185	androidx/appcompat/widget/ActivityChooserModel$HistoricalRecord
    //   274: astore 15
    //   276: aload 15
    //   278: aload 8
    //   280: lload 13
    //   282: fload 10
    //   284: invokespecial 317	androidx/appcompat/widget/ActivityChooserModel$HistoricalRecord:<init>	(Ljava/lang/String;JF)V
    //   287: aload 4
    //   289: aload 15
    //   291: invokeinterface 125 2 0
    //   296: pop
    //   297: goto -183 -> 114
    //   300: new 319	org/xmlpull/v1/XmlPullParserException
    //   303: astore_3
    //   304: ldc_w 321
    //   307: astore 4
    //   309: aload_3
    //   310: aload 4
    //   312: invokespecial 322	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   315: aload_3
    //   316: athrow
    //   317: new 319	org/xmlpull/v1/XmlPullParserException
    //   320: astore_3
    //   321: ldc_w 324
    //   324: astore 4
    //   326: aload_3
    //   327: aload 4
    //   329: invokespecial 322	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   332: aload_3
    //   333: athrow
    //   334: astore_1
    //   335: goto +71 -> 406
    //   338: pop
    //   339: new 93	java/lang/StringBuilder
    //   342: astore_3
    //   343: aload_3
    //   344: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   347: aload_3
    //   348: aload_1
    //   349: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   352: pop
    //   353: aload_0
    //   354: getfield 104	androidx/appcompat/widget/ActivityChooserModel:OooO0o0	Ljava/lang/String;
    //   357: astore_1
    //   358: aload_3
    //   359: aload_1
    //   360: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   363: pop
    //   364: aload_2
    //   365: ifnull +40 -> 405
    //   368: goto -235 -> 133
    //   371: pop
    //   372: new 93	java/lang/StringBuilder
    //   375: astore_3
    //   376: aload_3
    //   377: invokespecial 94	java/lang/StringBuilder:<init>	()V
    //   380: aload_3
    //   381: aload_1
    //   382: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   385: pop
    //   386: aload_0
    //   387: getfield 104	androidx/appcompat/widget/ActivityChooserModel:OooO0o0	Ljava/lang/String;
    //   390: astore_1
    //   391: aload_3
    //   392: aload_1
    //   393: invokevirtual 98	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   396: pop
    //   397: aload_2
    //   398: ifnull +7 -> 405
    //   401: goto -268 -> 133
    //   404: pop
    //   405: return
    //   406: aload_2
    //   407: ifnull +7 -> 414
    //   410: aload_2
    //   411: invokevirtual 288	java/io/FileInputStream:close	()V
    //   414: aload_1
    //   415: athrow
    //   416: pop
    //   417: return
    //   418: pop
    //   419: goto -5 -> 414
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	422	0	this	ActivityChooserModel
    //   2	1	1	str1	String
    //   334	15	1	str2	String
    //   357	58	1	str3	String
    //   7	404	2	localObject1	Object
    //   12	380	3	localObject2	Object
    //   26	302	4	localObject3	Object
    //   38	32	5	i	int
    //   94	3	5	bool1	boolean
    //   44	83	6	j	int
    //   54	114	7	k	int
    //   193	3	7	bool2	boolean
    //   85	194	8	str4	String
    //   141	66	9	m	int
    //   146	137	10	f	float
    //   184	81	11	str5	String
    //   228	14	12	str6	String
    //   246	35	13	l	long
    //   251	39	15	localObject4	Object
    //   338	1	19	localIOException1	java.io.IOException
    //   371	1	20	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   404	1	21	localIOException2	java.io.IOException
    //   416	1	22	localFileNotFoundException	java.io.FileNotFoundException
    //   418	1	23	localIOException3	java.io.IOException
    // Exception table:
    //   from	to	target	type
    //   19	22	334	finally
    //   30	37	334	finally
    //   63	69	334	finally
    //   79	85	334	finally
    //   89	94	334	finally
    //   101	105	334	finally
    //   107	114	334	finally
    //   114	120	334	finally
    //   173	179	334	finally
    //   188	193	334	finally
    //   216	223	334	finally
    //   232	239	334	finally
    //   241	246	334	finally
    //   255	262	334	finally
    //   264	269	334	finally
    //   271	274	334	finally
    //   282	287	334	finally
    //   289	297	334	finally
    //   300	303	334	finally
    //   310	315	334	finally
    //   315	317	334	finally
    //   317	320	334	finally
    //   327	332	334	finally
    //   332	334	334	finally
    //   339	342	334	finally
    //   343	347	334	finally
    //   348	353	334	finally
    //   353	357	334	finally
    //   359	364	334	finally
    //   372	375	334	finally
    //   376	380	334	finally
    //   381	386	334	finally
    //   386	390	334	finally
    //   392	397	334	finally
    //   19	22	338	java/io/IOException
    //   30	37	338	java/io/IOException
    //   63	69	338	java/io/IOException
    //   79	85	338	java/io/IOException
    //   89	94	338	java/io/IOException
    //   101	105	338	java/io/IOException
    //   107	114	338	java/io/IOException
    //   114	120	338	java/io/IOException
    //   173	179	338	java/io/IOException
    //   188	193	338	java/io/IOException
    //   216	223	338	java/io/IOException
    //   232	239	338	java/io/IOException
    //   241	246	338	java/io/IOException
    //   255	262	338	java/io/IOException
    //   264	269	338	java/io/IOException
    //   271	274	338	java/io/IOException
    //   282	287	338	java/io/IOException
    //   289	297	338	java/io/IOException
    //   300	303	338	java/io/IOException
    //   310	315	338	java/io/IOException
    //   315	317	338	java/io/IOException
    //   317	320	338	java/io/IOException
    //   327	332	338	java/io/IOException
    //   332	334	338	java/io/IOException
    //   19	22	371	org/xmlpull/v1/XmlPullParserException
    //   30	37	371	org/xmlpull/v1/XmlPullParserException
    //   63	69	371	org/xmlpull/v1/XmlPullParserException
    //   79	85	371	org/xmlpull/v1/XmlPullParserException
    //   89	94	371	org/xmlpull/v1/XmlPullParserException
    //   101	105	371	org/xmlpull/v1/XmlPullParserException
    //   107	114	371	org/xmlpull/v1/XmlPullParserException
    //   114	120	371	org/xmlpull/v1/XmlPullParserException
    //   173	179	371	org/xmlpull/v1/XmlPullParserException
    //   188	193	371	org/xmlpull/v1/XmlPullParserException
    //   216	223	371	org/xmlpull/v1/XmlPullParserException
    //   232	239	371	org/xmlpull/v1/XmlPullParserException
    //   241	246	371	org/xmlpull/v1/XmlPullParserException
    //   255	262	371	org/xmlpull/v1/XmlPullParserException
    //   264	269	371	org/xmlpull/v1/XmlPullParserException
    //   271	274	371	org/xmlpull/v1/XmlPullParserException
    //   282	287	371	org/xmlpull/v1/XmlPullParserException
    //   289	297	371	org/xmlpull/v1/XmlPullParserException
    //   300	303	371	org/xmlpull/v1/XmlPullParserException
    //   310	315	371	org/xmlpull/v1/XmlPullParserException
    //   315	317	371	org/xmlpull/v1/XmlPullParserException
    //   317	320	371	org/xmlpull/v1/XmlPullParserException
    //   327	332	371	org/xmlpull/v1/XmlPullParserException
    //   332	334	371	org/xmlpull/v1/XmlPullParserException
    //   133	137	404	java/io/IOException
    //   3	7	416	java/io/FileNotFoundException
    //   8	12	416	java/io/FileNotFoundException
    //   14	18	416	java/io/FileNotFoundException
    //   410	414	418	java/io/IOException
  }
  
  public final boolean OooOO0O()
  {
    Object localObject = this.OooO0oO;
    if (localObject != null)
    {
      localObject = this.OooO0o;
      if (localObject != null)
      {
        localObject = this.OooO0O0;
        boolean bool = ((List)localObject).isEmpty();
        if (!bool)
        {
          localObject = this.OooO0OO;
          bool = ((List)localObject).isEmpty();
          if (!bool)
          {
            localObject = this.OooO0oO;
            Intent localIntent = this.OooO0o;
            List localList1 = this.OooO0O0;
            List localList2 = Collections.unmodifiableList(this.OooO0OO);
            ((ActivityChooserModel.ActivitySorter)localObject).OooO00o(localIntent, localList1, localList2);
            return true;
          }
        }
      }
    }
    return false;
  }
  
  public ResolveInfo getActivity(int paramInt)
  {
    synchronized (this.OooO00o)
    {
      OooO0OO();
      List localList = this.OooO0O0;
      Object localObject2 = localList.get(paramInt);
      localObject2 = (ActivityChooserModel.ActivityResolveInfo)localObject2;
      localObject2 = ((ActivityChooserModel.ActivityResolveInfo)localObject2).o00OoOoo;
      return localObject2;
    }
  }
  
  public int getActivityCount()
  {
    synchronized (this.OooO00o)
    {
      OooO0OO();
      List localList = this.OooO0O0;
      int i = localList.size();
      return i;
    }
  }
  
  public ResolveInfo getDefaultActivity()
  {
    synchronized (this.OooO00o)
    {
      OooO0OO();
      Object localObject2 = this.OooO0O0;
      boolean bool = ((List)localObject2).isEmpty();
      if (!bool)
      {
        localObject2 = this.OooO0O0;
        localObject2 = ((List)localObject2).get(0);
        localObject2 = (ActivityChooserModel.ActivityResolveInfo)localObject2;
        localObject2 = ((ActivityChooserModel.ActivityResolveInfo)localObject2).o00OoOoo;
        return localObject2;
      }
      return null;
    }
  }
  
  public int getHistoryMaxSize()
  {
    synchronized (this.OooO00o)
    {
      int i = this.OooO0oo;
      return i;
    }
  }
  
  public int getHistorySize()
  {
    synchronized (this.OooO00o)
    {
      OooO0OO();
      List localList = this.OooO0OO;
      int i = localList.size();
      return i;
    }
  }
  
  public Intent getIntent()
  {
    synchronized (this.OooO00o)
    {
      Intent localIntent = this.OooO0o;
      return localIntent;
    }
  }
  
  public void setActivitySorter(ActivityChooserModel.ActivitySorter paramActivitySorter)
  {
    synchronized (this.OooO00o)
    {
      ActivityChooserModel.ActivitySorter localActivitySorter = this.OooO0oO;
      if (localActivitySorter == paramActivitySorter) {
        return;
      }
      this.OooO0oO = paramActivitySorter;
      boolean bool = OooOO0O();
      if (bool) {
        notifyChanged();
      }
      return;
    }
  }
  
  public void setDefaultActivity(int paramInt)
  {
    synchronized (this.OooO00o)
    {
      OooO0OO();
      Object localObject2 = this.OooO0O0;
      Object localObject3 = ((List)localObject2).get(paramInt);
      localObject3 = (ActivityChooserModel.ActivityResolveInfo)localObject3;
      localObject2 = this.OooO0O0;
      float f1 = 0.0F;
      ComponentName localComponentName = null;
      localObject2 = ((List)localObject2).get(0);
      localObject2 = (ActivityChooserModel.ActivityResolveInfo)localObject2;
      float f2;
      if (localObject2 != null)
      {
        f2 = ((ActivityChooserModel.ActivityResolveInfo)localObject2).o00Ooo00;
        f1 = ((ActivityChooserModel.ActivityResolveInfo)localObject3).o00Ooo00;
        f2 -= f1;
        f1 = 5.0F;
        f2 += f1;
      }
      else
      {
        f2 = 1.0F;
      }
      localComponentName = new android/content/ComponentName;
      localObject3 = ((ActivityChooserModel.ActivityResolveInfo)localObject3).o00OoOoo;
      localObject3 = ((ResolveInfo)localObject3).activityInfo;
      String str = ((ActivityInfo)localObject3).packageName;
      localObject3 = ((ActivityInfo)localObject3).name;
      localComponentName.<init>(str, (String)localObject3);
      localObject3 = new androidx/appcompat/widget/ActivityChooserModel$HistoricalRecord;
      long l = System.currentTimeMillis();
      ((ActivityChooserModel.HistoricalRecord)localObject3).<init>(localComponentName, l, f2);
      OooO00o((ActivityChooserModel.HistoricalRecord)localObject3);
      return;
    }
  }
  
  public void setHistoryMaxSize(int paramInt)
  {
    synchronized (this.OooO00o)
    {
      int i = this.OooO0oo;
      if (i == paramInt) {
        return;
      }
      this.OooO0oo = paramInt;
      OooO0oo();
      paramInt = OooOO0O();
      if (paramInt != 0) {
        notifyChanged();
      }
      return;
    }
  }
  
  public void setIntent(Intent paramIntent)
  {
    synchronized (this.OooO00o)
    {
      Intent localIntent = this.OooO0o;
      if (localIntent == paramIntent) {
        return;
      }
      this.OooO0o = paramIntent;
      boolean bool = true;
      this.OooOO0o = bool;
      OooO0OO();
      return;
    }
  }
  
  public void setOnChooseActivityListener(ActivityChooserModel.OnChooseActivityListener paramOnChooseActivityListener)
  {
    synchronized (this.OooO00o)
    {
      this.OooOOO0 = paramOnChooseActivityListener;
      return;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ActivityChooserModel
 * JD-Core Version:    0.7.0.1
 */