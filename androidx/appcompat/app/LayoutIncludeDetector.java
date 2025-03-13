package androidx.appcompat.app;

import android.util.AttributeSet;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Deque;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class LayoutIncludeDetector
{
  public final Deque OooO00o;
  
  public LayoutIncludeDetector()
  {
    ArrayDeque localArrayDeque = new java/util/ArrayDeque;
    localArrayDeque.<init>();
    this.OooO00o = localArrayDeque;
  }
  
  public static boolean OooO0O0(XmlPullParser paramXmlPullParser)
  {
    int i = 1;
    if (paramXmlPullParser != null) {}
    try
    {
      int j = paramXmlPullParser.getEventType();
      int k = 3;
      if (j != k)
      {
        int m = paramXmlPullParser.getEventType();
        if (m != i) {
          i = 0;
        }
      }
    }
    catch (XmlPullParserException localXmlPullParserException)
    {
      label39:
      break label39;
    }
    return i;
  }
  
  public static XmlPullParser OooO0OO(Deque paramDeque)
  {
    XmlPullParser localXmlPullParser;
    for (;;)
    {
      boolean bool1 = paramDeque.isEmpty();
      if (bool1) {
        break label48;
      }
      localXmlPullParser = (XmlPullParser)((WeakReference)paramDeque.peek()).get();
      boolean bool2 = OooO0O0(localXmlPullParser);
      if (!bool2) {
        break;
      }
      paramDeque.pop();
    }
    return localXmlPullParser;
    label48:
    return null;
  }
  
  public static boolean OooO0Oo(XmlPullParser paramXmlPullParser1, XmlPullParser paramXmlPullParser2)
  {
    if ((paramXmlPullParser2 != null) && (paramXmlPullParser1 != paramXmlPullParser2)) {
      try
      {
        int i = paramXmlPullParser2.getEventType();
        int j = 2;
        if (i == j)
        {
          paramXmlPullParser1 = "include";
          paramXmlPullParser2 = paramXmlPullParser2.getName();
          return paramXmlPullParser1.equals(paramXmlPullParser2);
        }
      }
      catch (XmlPullParserException localXmlPullParserException) {}
    }
    return false;
  }
  
  public boolean OooO00o(AttributeSet paramAttributeSet)
  {
    boolean bool1 = paramAttributeSet instanceof XmlPullParser;
    if (bool1)
    {
      paramAttributeSet = (XmlPullParser)paramAttributeSet;
      int i = paramAttributeSet.getDepth();
      int j = 1;
      if (i == j)
      {
        XmlPullParser localXmlPullParser = OooO0OO(this.OooO00o);
        Deque localDeque = this.OooO00o;
        WeakReference localWeakReference = new java/lang/ref/WeakReference;
        localWeakReference.<init>(paramAttributeSet);
        localDeque.push(localWeakReference);
        boolean bool2 = OooO0Oo(paramAttributeSet, localXmlPullParser);
        if (bool2) {
          return j;
        }
      }
    }
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.app.LayoutIncludeDetector
 * JD-Core Version:    0.7.0.1
 */