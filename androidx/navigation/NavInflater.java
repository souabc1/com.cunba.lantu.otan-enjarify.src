package androidx.navigation;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.BaseBundle;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class NavInflater
{
  public static final NavInflater.Companion OooO0OO;
  public static final ThreadLocal OooO0Oo;
  public final Context OooO00o;
  public final NavigatorProvider OooO0O0;
  
  static
  {
    Object localObject = new androidx/navigation/NavInflater$Companion;
    ((NavInflater.Companion)localObject).<init>(null);
    OooO0OO = (NavInflater.Companion)localObject;
    localObject = new java/lang/ThreadLocal;
    ((ThreadLocal)localObject).<init>();
    OooO0Oo = (ThreadLocal)localObject;
  }
  
  public NavInflater(Context paramContext, NavigatorProvider paramNavigatorProvider)
  {
    this.OooO00o = paramContext;
    this.OooO0O0 = paramNavigatorProvider;
  }
  
  public final NavDestination OooO00o(Resources paramResources, XmlResourceParser paramXmlResourceParser, AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject1 = this.OooO0O0;
    Object localObject2 = paramXmlResourceParser.getName();
    Object localObject3 = "parser.name";
    Intrinsics.OooO0o0(localObject2, (String)localObject3);
    localObject1 = ((NavigatorProvider)localObject1).OooO0Oo((String)localObject2).OooO00o();
    localObject2 = this.OooO00o;
    ((NavDestination)localObject1).OooOO0o((Context)localObject2, paramAttributeSet);
    int i = paramXmlResourceParser.getDepth();
    int j = 1;
    int k = i + 1;
    for (;;)
    {
      i = paramXmlResourceParser.next();
      if (i == j) {
        break;
      }
      int m = paramXmlResourceParser.getDepth();
      if (m < k)
      {
        i1 = 3;
        if (i == i1) {
          break;
        }
      }
      int i1 = 2;
      if ((i == i1) && (m <= k))
      {
        localObject2 = paramXmlResourceParser.getName();
        localObject3 = "argument";
        boolean bool2 = Intrinsics.OooO00o(localObject3, localObject2);
        if (bool2)
        {
          OooO0o(paramResources, (NavDestination)localObject1, paramAttributeSet, paramInt);
        }
        else
        {
          localObject3 = "deepLink";
          bool2 = Intrinsics.OooO00o(localObject3, localObject2);
          if (bool2)
          {
            OooO0oO(paramResources, (NavDestination)localObject1, paramAttributeSet);
          }
          else
          {
            localObject3 = "action";
            bool2 = Intrinsics.OooO00o(localObject3, localObject2);
            Object localObject4;
            if (bool2)
            {
              localObject2 = this;
              localObject3 = paramResources;
              localObject4 = localObject1;
              OooO0OO(paramResources, (NavDestination)localObject1, paramAttributeSet, paramXmlResourceParser, paramInt);
            }
            else
            {
              localObject3 = "include";
              boolean bool1 = Intrinsics.OooO00o(localObject3, localObject2);
              if (bool1)
              {
                bool1 = localObject1 instanceof NavGraph;
                if (bool1)
                {
                  localObject2 = R.styleable.NavInclude;
                  localObject2 = paramResources.obtainAttributes(paramAttributeSet, (int[])localObject2);
                  Intrinsics.OooO0o0(localObject2, "res.obtainAttributes(att…n.R.styleable.NavInclude)");
                  int n = R.styleable.NavInclude_graph;
                  i1 = 0;
                  n = ((TypedArray)localObject2).getResourceId(n, 0);
                  localObject4 = localObject1;
                  localObject4 = (NavGraph)localObject1;
                  localObject3 = OooO0O0(n);
                  ((NavGraph)localObject4).OooOOOO((NavDestination)localObject3);
                  localObject3 = Unit.OooO00o;
                  ((TypedArray)localObject2).recycle();
                  continue;
                }
              }
              bool1 = localObject1 instanceof NavGraph;
              if (bool1)
              {
                localObject2 = localObject1;
                localObject2 = (NavGraph)localObject1;
                localObject3 = OooO00o(paramResources, paramXmlResourceParser, paramAttributeSet, paramInt);
                ((NavGraph)localObject2).OooOOOO((NavDestination)localObject3);
              }
            }
          }
        }
      }
    }
    return (NavDestination)localObject1;
  }
  
  /* Error */
  public final NavGraph OooO0O0(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 40	androidx/navigation/NavInflater:OooO00o	Landroid/content/Context;
    //   4: invokevirtual 150	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   7: astore_2
    //   8: aload_2
    //   9: iload_1
    //   10: invokevirtual 154	android/content/res/Resources:getXml	(I)Landroid/content/res/XmlResourceParser;
    //   13: astore_3
    //   14: aload_3
    //   15: ldc 156
    //   17: invokestatic 53	kotlin/jvm/internal/Intrinsics:OooO0o0	(Ljava/lang/Object;Ljava/lang/String;)V
    //   20: aload_3
    //   21: invokestatic 162	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   24: astore 4
    //   26: aload_3
    //   27: invokeinterface 77 1 0
    //   32: istore 5
    //   34: iconst_2
    //   35: istore 6
    //   37: iload 5
    //   39: iload 6
    //   41: if_icmpeq +13 -> 54
    //   44: iconst_1
    //   45: istore 7
    //   47: iload 5
    //   49: iload 7
    //   51: if_icmpne -25 -> 26
    //   54: iload 5
    //   56: iload 6
    //   58: if_icmpne +142 -> 200
    //   61: aload_3
    //   62: invokeinterface 48 1 0
    //   67: astore 8
    //   69: ldc 164
    //   71: astore 9
    //   73: aload_2
    //   74: aload 9
    //   76: invokestatic 53	kotlin/jvm/internal/Intrinsics:OooO0o0	(Ljava/lang/Object;Ljava/lang/String;)V
    //   79: ldc 166
    //   81: astore 9
    //   83: aload 4
    //   85: aload 9
    //   87: invokestatic 53	kotlin/jvm/internal/Intrinsics:OooO0o0	(Ljava/lang/Object;Ljava/lang/String;)V
    //   90: aload_0
    //   91: aload_2
    //   92: aload_3
    //   93: aload 4
    //   95: iload_1
    //   96: invokevirtual 144	androidx/navigation/NavInflater:OooO00o	(Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;Landroid/util/AttributeSet;I)Landroidx/navigation/NavDestination;
    //   99: astore 4
    //   101: aload 4
    //   103: instanceof 102
    //   106: istore 6
    //   108: iload 6
    //   110: ifeq +19 -> 129
    //   113: aload 4
    //   115: checkcast 102	androidx/navigation/NavGraph
    //   118: astore 4
    //   120: aload_3
    //   121: invokeinterface 171 1 0
    //   126: aload 4
    //   128: areturn
    //   129: new 173	java/lang/StringBuilder
    //   132: astore 4
    //   134: aload 4
    //   136: invokespecial 174	java/lang/StringBuilder:<init>	()V
    //   139: ldc 176
    //   141: astore 9
    //   143: aload 4
    //   145: aload 9
    //   147: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: pop
    //   151: aload 4
    //   153: aload 8
    //   155: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   158: pop
    //   159: ldc 182
    //   161: astore 8
    //   163: aload 4
    //   165: aload 8
    //   167: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   170: pop
    //   171: aload 4
    //   173: invokevirtual 185	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   176: astore 4
    //   178: new 187	java/lang/IllegalArgumentException
    //   181: astore 8
    //   183: aload 4
    //   185: invokevirtual 188	java/lang/Object:toString	()Ljava/lang/String;
    //   188: astore 4
    //   190: aload 8
    //   192: aload 4
    //   194: invokespecial 191	java/lang/IllegalArgumentException:<init>	(Ljava/lang/String;)V
    //   197: aload 8
    //   199: athrow
    //   200: new 193	org/xmlpull/v1/XmlPullParserException
    //   203: astore 4
    //   205: ldc 195
    //   207: astore 8
    //   209: aload 4
    //   211: aload 8
    //   213: invokespecial 196	org/xmlpull/v1/XmlPullParserException:<init>	(Ljava/lang/String;)V
    //   216: aload 4
    //   218: athrow
    //   219: astore 10
    //   221: goto +92 -> 313
    //   224: astore 4
    //   226: new 198	java/lang/RuntimeException
    //   229: astore 8
    //   231: new 173	java/lang/StringBuilder
    //   234: astore 9
    //   236: aload 9
    //   238: invokespecial 174	java/lang/StringBuilder:<init>	()V
    //   241: ldc 200
    //   243: astore 11
    //   245: aload 9
    //   247: aload 11
    //   249: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   252: pop
    //   253: aload_2
    //   254: iload_1
    //   255: invokevirtual 204	android/content/res/Resources:getResourceName	(I)Ljava/lang/String;
    //   258: astore 10
    //   260: aload 9
    //   262: aload 10
    //   264: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   267: pop
    //   268: ldc 206
    //   270: astore 10
    //   272: aload 9
    //   274: aload 10
    //   276: invokevirtual 180	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   279: pop
    //   280: aload_3
    //   281: invokeinterface 209 1 0
    //   286: istore_1
    //   287: aload 9
    //   289: iload_1
    //   290: invokevirtual 212	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   293: pop
    //   294: aload 9
    //   296: invokevirtual 185	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   299: astore 10
    //   301: aload 8
    //   303: aload 10
    //   305: aload 4
    //   307: invokespecial 215	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   310: aload 8
    //   312: athrow
    //   313: aload_3
    //   314: invokeinterface 171 1 0
    //   319: aload 10
    //   321: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	322	0	this	NavInflater
    //   0	322	1	paramInt	int
    //   7	247	2	localResources	Resources
    //   13	301	3	localXmlResourceParser	XmlResourceParser
    //   24	193	4	localObject1	Object
    //   224	82	4	localException	java.lang.Exception
    //   32	27	5	i	int
    //   35	24	6	j	int
    //   106	3	6	bool	boolean
    //   45	7	7	k	int
    //   67	244	8	localObject2	Object
    //   71	224	9	localObject3	Object
    //   219	1	10	localObject4	Object
    //   258	62	10	str1	String
    //   243	5	11	str2	String
    // Exception table:
    //   from	to	target	type
    //   26	32	219	finally
    //   61	67	219	finally
    //   74	79	219	finally
    //   85	90	219	finally
    //   95	99	219	finally
    //   113	118	219	finally
    //   129	132	219	finally
    //   134	139	219	finally
    //   145	151	219	finally
    //   153	159	219	finally
    //   165	171	219	finally
    //   171	176	219	finally
    //   178	181	219	finally
    //   183	188	219	finally
    //   192	197	219	finally
    //   197	200	219	finally
    //   200	203	219	finally
    //   211	216	219	finally
    //   216	219	219	finally
    //   226	229	219	finally
    //   231	234	219	finally
    //   236	241	219	finally
    //   247	253	219	finally
    //   254	258	219	finally
    //   262	268	219	finally
    //   274	280	219	finally
    //   280	286	219	finally
    //   289	294	219	finally
    //   294	299	219	finally
    //   305	310	219	finally
    //   310	313	219	finally
    //   26	32	224	java/lang/Exception
    //   61	67	224	java/lang/Exception
    //   74	79	224	java/lang/Exception
    //   85	90	224	java/lang/Exception
    //   95	99	224	java/lang/Exception
    //   113	118	224	java/lang/Exception
    //   129	132	224	java/lang/Exception
    //   134	139	224	java/lang/Exception
    //   145	151	224	java/lang/Exception
    //   153	159	224	java/lang/Exception
    //   165	171	224	java/lang/Exception
    //   171	176	224	java/lang/Exception
    //   178	181	224	java/lang/Exception
    //   183	188	224	java/lang/Exception
    //   192	197	224	java/lang/Exception
    //   197	200	224	java/lang/Exception
    //   200	203	224	java/lang/Exception
    //   211	216	224	java/lang/Exception
    //   216	219	224	java/lang/Exception
  }
  
  public final void OooO0OO(Resources paramResources, NavDestination paramNavDestination, AttributeSet paramAttributeSet, XmlResourceParser paramXmlResourceParser, int paramInt)
  {
    Object localObject1 = this.OooO00o;
    int[] arrayOfInt = androidx.navigation.common.R.styleable.NavAction;
    Intrinsics.OooO0o0(arrayOfInt, "NavAction");
    localObject1 = ((Context)localObject1).obtainStyledAttributes(paramAttributeSet, arrayOfInt, 0, 0);
    int i = androidx.navigation.common.R.styleable.NavAction_android_id;
    i = ((TypedArray)localObject1).getResourceId(i, 0);
    int j = androidx.navigation.common.R.styleable.NavAction_destination;
    int k = ((TypedArray)localObject1).getResourceId(j, 0);
    NavAction localNavAction = new androidx/navigation/NavAction;
    String str1 = null;
    String str2 = null;
    Object localObject2 = localNavAction;
    localNavAction.<init>(k, null, null, 6, null);
    localObject2 = new androidx/navigation/NavOptions$Builder;
    ((NavOptions.Builder)localObject2).<init>();
    k = androidx.navigation.common.R.styleable.NavAction_launchSingleTop;
    boolean bool1 = ((TypedArray)localObject1).getBoolean(k, false);
    ((NavOptions.Builder)localObject2).OooO0Oo(bool1);
    int m = androidx.navigation.common.R.styleable.NavAction_restoreState;
    boolean bool2 = ((TypedArray)localObject1).getBoolean(m, false);
    ((NavOptions.Builder)localObject2).OooOO0(bool2);
    int n = androidx.navigation.common.R.styleable.NavAction_popUpTo;
    int i1 = -1;
    n = ((TypedArray)localObject1).getResourceId(n, i1);
    int i2 = androidx.navigation.common.R.styleable.NavAction_popUpToInclusive;
    boolean bool4 = ((TypedArray)localObject1).getBoolean(i2, false);
    int i4 = androidx.navigation.common.R.styleable.NavAction_popUpToSaveState;
    boolean bool5 = ((TypedArray)localObject1).getBoolean(i4, false);
    ((NavOptions.Builder)localObject2).OooO0oO(n, bool4, bool5);
    int i5 = androidx.navigation.common.R.styleable.NavAction_enterAnim;
    i5 = ((TypedArray)localObject1).getResourceId(i5, i1);
    ((NavOptions.Builder)localObject2).OooO0O0(i5);
    i5 = androidx.navigation.common.R.styleable.NavAction_exitAnim;
    i5 = ((TypedArray)localObject1).getResourceId(i5, i1);
    ((NavOptions.Builder)localObject2).OooO0OO(i5);
    i5 = androidx.navigation.common.R.styleable.NavAction_popEnterAnim;
    i5 = ((TypedArray)localObject1).getResourceId(i5, i1);
    ((NavOptions.Builder)localObject2).OooO0o0(i5);
    i5 = androidx.navigation.common.R.styleable.NavAction_popExitAnim;
    i5 = ((TypedArray)localObject1).getResourceId(i5, i1);
    ((NavOptions.Builder)localObject2).OooO0o(i5);
    Object localObject3 = ((NavOptions.Builder)localObject2).OooO00o();
    localNavAction.setNavOptions((NavOptions)localObject3);
    localObject3 = new android/os/Bundle;
    ((Bundle)localObject3).<init>();
    int i6 = paramXmlResourceParser.getDepth();
    n = 1;
    i6 += n;
    for (;;)
    {
      i1 = paramXmlResourceParser.next();
      if (i1 == n) {
        break;
      }
      int i3 = paramXmlResourceParser.getDepth();
      if (i3 < i6)
      {
        i4 = 3;
        if (i1 == i4) {
          break;
        }
      }
      i4 = 2;
      if ((i1 == i4) && (i3 <= i6))
      {
        str1 = paramXmlResourceParser.getName();
        str2 = "argument";
        boolean bool3 = Intrinsics.OooO00o(str2, str1);
        if (bool3) {
          OooO0o0(paramResources, (Bundle)localObject3, paramAttributeSet, paramInt);
        }
      }
    }
    boolean bool6 = ((BaseBundle)localObject3).isEmpty();
    if (!bool6) {
      localNavAction.setDefaultArguments((Bundle)localObject3);
    }
    paramNavDestination.OooOOO0(i, localNavAction);
    ((TypedArray)localObject1).recycle();
  }
  
  public final NavArgument OooO0Oo(TypedArray paramTypedArray, Resources paramResources, int paramInt)
  {
    Object localObject1 = new androidx/navigation/NavArgument$Builder;
    ((NavArgument.Builder)localObject1).<init>();
    int i = androidx.navigation.common.R.styleable.NavArgument_nullable;
    int k = 0;
    boolean bool = paramTypedArray.getBoolean(i, false);
    ((NavArgument.Builder)localObject1).OooO0OO(bool);
    Object localObject2 = OooO0Oo;
    TypedValue localTypedValue = (TypedValue)((ThreadLocal)localObject2).get();
    if (localTypedValue == null)
    {
      localTypedValue = new android/util/TypedValue;
      localTypedValue.<init>();
      ((ThreadLocal)localObject2).set(localTypedValue);
    }
    int j = androidx.navigation.common.R.styleable.NavArgument_argType;
    String str1 = paramTypedArray.getString(j);
    j = 0;
    localObject2 = null;
    Object localObject3;
    Object localObject4;
    Object localObject5;
    if (str1 != null)
    {
      localObject3 = NavType.OooO0OO;
      localObject4 = paramResources.getResourcePackageName(paramInt);
      localObject4 = ((NavType.Companion)localObject3).OooO00o(str1, (String)localObject4);
      localObject5 = localObject4;
    }
    else
    {
      localObject5 = null;
    }
    paramInt = androidx.navigation.common.R.styleable.NavArgument_android_defaultValue;
    paramInt = paramTypedArray.getValue(paramInt, localTypedValue);
    if (paramInt != 0)
    {
      localObject4 = NavType.OooO0o0;
      localObject2 = "' for ";
      localObject3 = "unsupported value '";
      int m = 16;
      int n;
      if (localObject5 == localObject4)
      {
        n = localTypedValue.resourceId;
        if (n != 0)
        {
          k = n;
        }
        else
        {
          n = localTypedValue.type;
          if (n != m) {
            break label226;
          }
          n = localTypedValue.data;
          if (n != 0) {
            break label226;
          }
        }
        localObject2 = Integer.valueOf(k);
        break label849;
        label226:
        paramTypedArray = new org/xmlpull/v1/XmlPullParserException;
        paramResources = new java/lang/StringBuilder;
        paramResources.<init>();
        paramResources.append((String)localObject3);
        localObject4 = localTypedValue.string;
        paramResources.append(localObject4);
        paramResources.append((String)localObject2);
        localObject4 = ((NavType)localObject5).getName();
        paramResources.append((String)localObject4);
        paramResources.append(". Must be a reference to a resource.");
        paramResources = paramResources.toString();
        paramTypedArray.<init>(paramResources);
        throw paramTypedArray;
      }
      else
      {
        int i1 = localTypedValue.resourceId;
        if (i1 != 0)
        {
          if (localObject5 == null)
          {
            localObject2 = Integer.valueOf(i1);
            localObject5 = localObject4;
          }
          else
          {
            paramTypedArray = new org/xmlpull/v1/XmlPullParserException;
            paramResources = new java/lang/StringBuilder;
            paramResources.<init>();
            paramResources.append((String)localObject3);
            localObject1 = localTypedValue.string;
            paramResources.append(localObject1);
            paramResources.append((String)localObject2);
            localObject1 = ((NavType)localObject5).getName();
            paramResources.append((String)localObject1);
            paramResources.append(". You must use a \"");
            localObject4 = ((NavType)localObject4).getName();
            paramResources.append((String)localObject4);
            paramResources.append("\" type to reference other resources.");
            paramResources = paramResources.toString();
            paramTypedArray.<init>(paramResources);
            throw paramTypedArray;
          }
        }
        else
        {
          localObject4 = NavType.OooOOO0;
          int i2;
          if (localObject5 == localObject4)
          {
            i2 = androidx.navigation.common.R.styleable.NavArgument_android_defaultValue;
            localObject2 = paramTypedArray.getString(i2);
          }
          else
          {
            n = localTypedValue.type;
            paramInt = 3;
            if (n != paramInt)
            {
              paramInt = 4;
              NavType localNavType;
              String str2;
              float f;
              if (n != paramInt)
              {
                paramInt = 5;
                if (n != paramInt)
                {
                  i2 = 18;
                  if (n != i2)
                  {
                    if (n >= m)
                    {
                      i2 = 31;
                      if (n <= i2)
                      {
                        localNavType = NavType.OooO;
                        localObject3 = OooO0OO;
                        if (localObject5 == localNavType)
                        {
                          str2 = "float";
                          localObject5 = ((NavInflater.Companion)localObject3).OooO00o(localTypedValue, (NavType)localObject5, localNavType, str1, str2);
                          n = localTypedValue.data;
                          f = n;
                          break label806;
                        }
                        localNavType = NavType.OooO0Oo;
                        str2 = "integer";
                        localObject5 = ((NavInflater.Companion)localObject3).OooO00o(localTypedValue, (NavType)localObject5, localNavType, str1, str2);
                        n = localTypedValue.data;
                        break label757;
                      }
                    }
                    paramTypedArray = new org/xmlpull/v1/XmlPullParserException;
                    paramResources = new java/lang/StringBuilder;
                    paramResources.<init>();
                    paramResources.append("unsupported argument type ");
                    paramInt = localTypedValue.type;
                    paramResources.append(paramInt);
                    paramResources = paramResources.toString();
                    paramTypedArray.<init>(paramResources);
                    throw paramTypedArray;
                  }
                  else
                  {
                    localObject3 = OooO0OO;
                    localNavType = NavType.OooOO0O;
                    str2 = "boolean";
                    localObject5 = ((NavInflater.Companion)localObject3).OooO00o(localTypedValue, (NavType)localObject5, localNavType, str1, str2);
                    n = localTypedValue.data;
                    if (n != 0) {
                      k = 1;
                    }
                    localObject2 = Boolean.valueOf(k);
                    break label849;
                  }
                }
                else
                {
                  localObject3 = OooO0OO;
                  localNavType = NavType.OooO0Oo;
                  str2 = "dimension";
                  localObject5 = ((NavInflater.Companion)localObject3).OooO00o(localTypedValue, (NavType)localObject5, localNavType, str1, str2);
                  paramTypedArray = paramResources.getDisplayMetrics();
                  f = localTypedValue.getDimension(paramTypedArray);
                  n = (int)f;
                }
                label757:
                localObject2 = Integer.valueOf(n);
                break label849;
              }
              else
              {
                localObject3 = OooO0OO;
                localNavType = NavType.OooO;
                str2 = "float";
                localObject5 = ((NavInflater.Companion)localObject3).OooO00o(localTypedValue, (NavType)localObject5, localNavType, str1, str2);
                f = localTypedValue.getFloat();
              }
              label806:
              localObject2 = Float.valueOf(f);
            }
            else
            {
              paramTypedArray = localTypedValue.string.toString();
              if (localObject5 == null)
              {
                paramResources = NavType.OooO0OO.OooO0O0(paramTypedArray);
                localObject5 = paramResources;
              }
              localObject2 = ((NavType)localObject5).OooO0Oo(paramTypedArray);
            }
          }
        }
      }
    }
    label849:
    if (localObject2 != null) {
      ((NavArgument.Builder)localObject1).OooO0O0(localObject2);
    }
    if (localObject5 != null) {
      ((NavArgument.Builder)localObject1).OooO0Oo((NavType)localObject5);
    }
    return ((NavArgument.Builder)localObject1).OooO00o();
  }
  
  public final void OooO0o(Resources paramResources, NavDestination paramNavDestination, AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject = androidx.navigation.common.R.styleable.NavArgument;
    paramAttributeSet = paramResources.obtainAttributes(paramAttributeSet, (int[])localObject);
    Intrinsics.OooO0o0(paramAttributeSet, "res.obtainAttributes(att… R.styleable.NavArgument)");
    int i = androidx.navigation.common.R.styleable.NavArgument_android_name;
    localObject = paramAttributeSet.getString(i);
    if (localObject != null)
    {
      Intrinsics.OooO0o0(localObject, "array.getString(R.stylea…uments must have a name\")");
      paramResources = OooO0Oo(paramAttributeSet, paramResources, paramInt);
      paramNavDestination.OooO00o((String)localObject, paramResources);
      paramResources = Unit.OooO00o;
      paramAttributeSet.recycle();
      return;
    }
    paramResources = new org/xmlpull/v1/XmlPullParserException;
    paramResources.<init>("Arguments must have a name");
    throw paramResources;
  }
  
  public final void OooO0o0(Resources paramResources, Bundle paramBundle, AttributeSet paramAttributeSet, int paramInt)
  {
    Object localObject = androidx.navigation.common.R.styleable.NavArgument;
    paramAttributeSet = paramResources.obtainAttributes(paramAttributeSet, (int[])localObject);
    Intrinsics.OooO0o0(paramAttributeSet, "res.obtainAttributes(att… R.styleable.NavArgument)");
    int i = androidx.navigation.common.R.styleable.NavArgument_android_name;
    localObject = paramAttributeSet.getString(i);
    if (localObject != null)
    {
      String str = "array.getString(R.stylea…uments must have a name\")";
      Intrinsics.OooO0o0(localObject, str);
      paramResources = OooO0Oo(paramAttributeSet, paramResources, paramInt);
      paramInt = paramResources.isDefaultValuePresent();
      if (paramInt != 0) {
        paramResources.OooO00o((String)localObject, paramBundle);
      }
      paramResources = Unit.OooO00o;
      paramAttributeSet.recycle();
      return;
    }
    paramResources = new org/xmlpull/v1/XmlPullParserException;
    paramResources.<init>("Arguments must have a name");
    throw paramResources;
  }
  
  public final void OooO0oO(Resources paramResources, NavDestination paramNavDestination, AttributeSet paramAttributeSet)
  {
    Object localObject1 = androidx.navigation.common.R.styleable.NavDeepLink;
    paramResources = paramResources.obtainAttributes(paramAttributeSet, (int[])localObject1);
    Intrinsics.OooO0o0(paramResources, "res.obtainAttributes(att… R.styleable.NavDeepLink)");
    int i = androidx.navigation.common.R.styleable.NavDeepLink_uri;
    localObject1 = paramResources.getString(i);
    i = androidx.navigation.common.R.styleable.NavDeepLink_action;
    paramAttributeSet = paramResources.getString(i);
    int j = androidx.navigation.common.R.styleable.NavDeepLink_mimeType;
    String str1 = paramResources.getString(j);
    int k = 0;
    int m = 1;
    Object localObject2;
    if (localObject1 != null)
    {
      j = ((CharSequence)localObject1).length();
      if (j != 0)
      {
        j = 0;
        localObject2 = null;
        break label99;
      }
    }
    j = m;
    label99:
    if (j != 0)
    {
      if (paramAttributeSet != null)
      {
        j = paramAttributeSet.length();
        if (j != 0)
        {
          j = 0;
          localObject2 = null;
          break label137;
        }
      }
      j = m;
      if (j != 0)
      {
        if (str1 != null)
        {
          j = str1.length();
          if (j != 0)
          {
            j = 0;
            localObject2 = null;
            break label177;
          }
        }
        j = m;
        if (j != 0)
        {
          paramResources = new org/xmlpull/v1/XmlPullParserException;
          paramResources.<init>("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
          throw paramResources;
        }
      }
    }
    label137:
    label177:
    NavDeepLink.Builder localBuilder = new androidx/navigation/NavDeepLink$Builder;
    localBuilder.<init>();
    String str2 = "context.packageName";
    String str3;
    String str4;
    int n;
    int i1;
    if (localObject1 != null)
    {
      localObject2 = "${applicationId}";
      str3 = this.OooO00o.getPackageName();
      Intrinsics.OooO0o0(str3, str2);
      str4 = null;
      n = 4;
      i1 = 0;
      localObject1 = StringsKt.OooOOOO((String)localObject1, (String)localObject2, str3, false, n, null);
      localBuilder.OooO0Oo((String)localObject1);
    }
    if (paramAttributeSet != null)
    {
      int i2 = paramAttributeSet.length();
      if (i2 != 0) {}
    }
    else
    {
      k = m;
    }
    String str5;
    if (k == 0)
    {
      str3 = "${applicationId}";
      localObject1 = this.OooO00o;
      str4 = ((Context)localObject1).getPackageName();
      Intrinsics.OooO0o0(str4, str2);
      n = 0;
      str5 = null;
      i1 = 4;
      k = 0;
      localObject2 = paramAttributeSet;
      paramAttributeSet = StringsKt.OooOOOO(paramAttributeSet, str3, str4, false, i1, null);
      localBuilder.OooO0O0(paramAttributeSet);
    }
    if (str1 != null)
    {
      str4 = "${applicationId}";
      str5 = this.OooO00o.getPackageName();
      Intrinsics.OooO0o0(str5, str2);
      i1 = 0;
      k = 4;
      i = 0;
      str3 = str1;
      str1 = null;
      paramAttributeSet = StringsKt.OooOOOO(str3, str4, str5, false, k, null);
      localBuilder.OooO0OO(paramAttributeSet);
    }
    paramAttributeSet = localBuilder.OooO00o();
    paramNavDestination.OooO0O0(paramAttributeSet);
    paramNavDestination = Unit.OooO00o;
    paramResources.recycle();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.navigation.NavInflater
 * JD-Core Version:    0.7.0.1
 */