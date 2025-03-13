package androidx.appcompat.view;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.MenuInflater;
import androidx.core.view.ActionProvider;
import org.xmlpull.v1.XmlPullParser;

public class SupportMenuInflater
  extends MenuInflater
{
  public static final Class[] OooO0o;
  public static final Class[] OooO0o0;
  public final Object[] OooO00o;
  public final Object[] OooO0O0;
  public Context OooO0OO;
  public Object OooO0Oo;
  
  static
  {
    Class[] arrayOfClass = new Class[1];
    arrayOfClass[0] = Context.class;
    OooO0o0 = arrayOfClass;
    OooO0o = arrayOfClass;
  }
  
  public SupportMenuInflater(Context paramContext)
  {
    super(paramContext);
    this.OooO0OO = paramContext;
    paramContext = new Object[] { paramContext };
    this.OooO00o = paramContext;
    this.OooO0O0 = paramContext;
  }
  
  public final Object OooO00o(Object paramObject)
  {
    boolean bool = paramObject instanceof Activity;
    if (bool) {
      return paramObject;
    }
    bool = paramObject instanceof ContextWrapper;
    if (bool)
    {
      paramObject = ((ContextWrapper)paramObject).getBaseContext();
      paramObject = OooO00o(paramObject);
    }
    return paramObject;
  }
  
  public final void OooO0O0(XmlPullParser paramXmlPullParser, AttributeSet paramAttributeSet, Menu paramMenu)
  {
    SupportMenuInflater.MenuState localMenuState = new androidx/appcompat/view/SupportMenuInflater$MenuState;
    localMenuState.<init>(this, paramMenu);
    int i = paramXmlPullParser.getEventType();
    int k;
    String str1;
    int m;
    do
    {
      k = 2;
      str1 = "menu";
      m = 1;
      if (i == k)
      {
        paramMenu = paramXmlPullParser.getName();
        bool2 = paramMenu.equals(str1);
        if (bool2)
        {
          i = paramXmlPullParser.next();
          break;
        }
        paramXmlPullParser = new java/lang/RuntimeException;
        paramAttributeSet = new java/lang/StringBuilder;
        paramAttributeSet.<init>();
        paramAttributeSet.append("Expecting menu, got ");
        paramAttributeSet.append(paramMenu);
        paramAttributeSet = paramAttributeSet.toString();
        paramXmlPullParser.<init>(paramAttributeSet);
        throw paramXmlPullParser;
      }
      i = paramXmlPullParser.next();
    } while (i != m);
    boolean bool2 = false;
    int n = 0;
    int i1 = 0;
    Object localObject = null;
    while (n == 0) {
      if (i != m)
      {
        String str2 = "item";
        String str3 = "group";
        boolean bool4;
        boolean bool5;
        if (i != k)
        {
          int i2 = 3;
          if (i == i2)
          {
            paramMenu = paramXmlPullParser.getName();
            if (i1 != 0)
            {
              boolean bool3 = paramMenu.equals(localObject);
              if (bool3)
              {
                i1 = 0;
                localObject = null;
                break label405;
              }
            }
            bool4 = paramMenu.equals(str3);
            if (bool4)
            {
              localMenuState.OooO0oo();
            }
            else
            {
              bool5 = paramMenu.equals(str2);
              boolean bool1;
              if (bool5)
              {
                bool1 = localMenuState.OooO0Oo();
                if (!bool1)
                {
                  paramMenu = localMenuState.OooOoOO;
                  if (paramMenu != null)
                  {
                    bool1 = paramMenu.OooO00o();
                    if (bool1)
                    {
                      localMenuState.OooO0O0();
                      break label405;
                    }
                  }
                  localMenuState.OooO00o();
                }
              }
              else
              {
                bool1 = paramMenu.equals(str1);
                if (bool1) {
                  n = m;
                }
              }
            }
          }
        }
        else if (i1 == 0)
        {
          paramMenu = paramXmlPullParser.getName();
          bool4 = paramMenu.equals(str3);
          if (bool4)
          {
            localMenuState.OooO0o(paramAttributeSet);
          }
          else
          {
            bool5 = paramMenu.equals(str2);
            if (bool5)
            {
              localMenuState.OooO0oO(paramAttributeSet);
            }
            else
            {
              bool5 = paramMenu.equals(str1);
              if (bool5)
              {
                paramMenu = localMenuState.OooO0O0();
                OooO0O0(paramXmlPullParser, paramAttributeSet, paramMenu);
              }
              else
              {
                localObject = paramMenu;
                i1 = m;
              }
            }
          }
        }
        label405:
        int j = paramXmlPullParser.next();
      }
      else
      {
        paramXmlPullParser = new java/lang/RuntimeException;
        paramXmlPullParser.<init>("Unexpected end of document");
        throw paramXmlPullParser;
      }
    }
  }
  
  public Object getRealOwner()
  {
    Object localObject = this.OooO0Oo;
    if (localObject == null)
    {
      localObject = this.OooO0OO;
      localObject = OooO00o(localObject);
      this.OooO0Oo = localObject;
    }
    return this.OooO0Oo;
  }
  
  /* Error */
  public void inflate(int paramInt, Menu paramMenu)
  {
    // Byte code:
    //   0: ldc 131
    //   2: astore_3
    //   3: aload_2
    //   4: instanceof 133
    //   7: istore 4
    //   9: iload 4
    //   11: ifne +10 -> 21
    //   14: aload_0
    //   15: iload_1
    //   16: aload_2
    //   17: invokespecial 137	android/view/MenuInflater:inflate	(ILandroid/view/Menu;)V
    //   20: return
    //   21: iconst_0
    //   22: istore 4
    //   24: aconst_null
    //   25: astore 5
    //   27: aload_0
    //   28: getfield 29	androidx/appcompat/view/SupportMenuInflater:OooO0OO	Landroid/content/Context;
    //   31: astore 6
    //   33: aload 6
    //   35: invokevirtual 141	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   38: astore 6
    //   40: aload 6
    //   42: iload_1
    //   43: invokevirtual 147	android/content/res/Resources:getLayout	(I)Landroid/content/res/XmlResourceParser;
    //   46: astore 5
    //   48: aload 5
    //   50: invokestatic 153	android/util/Xml:asAttributeSet	(Lorg/xmlpull/v1/XmlPullParser;)Landroid/util/AttributeSet;
    //   53: astore 7
    //   55: aload_0
    //   56: aload 5
    //   58: aload 7
    //   60: aload_2
    //   61: checkcast 155	android/view/Menu
    //   64: invokevirtual 125	androidx/appcompat/view/SupportMenuInflater:OooO0O0	(Lorg/xmlpull/v1/XmlPullParser;Landroid/util/AttributeSet;Landroid/view/Menu;)V
    //   67: aload 5
    //   69: ifnull +10 -> 79
    //   72: aload 5
    //   74: invokeinterface 160 1 0
    //   79: return
    //   80: astore 7
    //   82: goto +33 -> 115
    //   85: astore 7
    //   87: new 162	android/view/InflateException
    //   90: astore_2
    //   91: aload_2
    //   92: aload_3
    //   93: aload 7
    //   95: invokespecial 165	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   98: aload_2
    //   99: athrow
    //   100: astore 7
    //   102: new 162	android/view/InflateException
    //   105: astore_2
    //   106: aload_2
    //   107: aload_3
    //   108: aload 7
    //   110: invokespecial 165	android/view/InflateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   113: aload_2
    //   114: athrow
    //   115: aload 5
    //   117: ifnull +10 -> 127
    //   120: aload 5
    //   122: invokeinterface 160 1 0
    //   127: aload 7
    //   129: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	this	SupportMenuInflater
    //   0	130	1	paramInt	int
    //   0	130	2	paramMenu	Menu
    //   2	106	3	str	String
    //   7	16	4	bool	boolean
    //   25	96	5	localXmlResourceParser	android.content.res.XmlResourceParser
    //   31	10	6	localObject1	Object
    //   53	6	7	localAttributeSet	AttributeSet
    //   80	1	7	localObject2	Object
    //   85	9	7	localIOException	java.io.IOException
    //   100	28	7	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    // Exception table:
    //   from	to	target	type
    //   27	31	80	finally
    //   33	38	80	finally
    //   42	46	80	finally
    //   48	53	80	finally
    //   60	67	80	finally
    //   87	90	80	finally
    //   93	98	80	finally
    //   98	100	80	finally
    //   102	105	80	finally
    //   108	113	80	finally
    //   113	115	80	finally
    //   27	31	85	java/io/IOException
    //   33	38	85	java/io/IOException
    //   42	46	85	java/io/IOException
    //   48	53	85	java/io/IOException
    //   60	67	85	java/io/IOException
    //   27	31	100	org/xmlpull/v1/XmlPullParserException
    //   33	38	100	org/xmlpull/v1/XmlPullParserException
    //   42	46	100	org/xmlpull/v1/XmlPullParserException
    //   48	53	100	org/xmlpull/v1/XmlPullParserException
    //   60	67	100	org/xmlpull/v1/XmlPullParserException
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.view.SupportMenuInflater
 * JD-Core Version:    0.7.0.1
 */