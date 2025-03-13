package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class StateSet
{
  public int OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public SparseArray OooO0Oo;
  public ConstraintsChangedListener OooO0o;
  public SparseArray OooO0o0;
  
  public StateSet(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    int i = -1;
    this.OooO00o = i;
    this.OooO0O0 = i;
    this.OooO0OO = i;
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    this.OooO0Oo = localSparseArray;
    localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    this.OooO0o0 = localSparseArray;
    this.OooO0o = null;
    OooO0O0(paramContext, paramXmlPullParser);
  }
  
  public int OooO00o(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
  {
    StateSet.State localState = (StateSet.State)this.OooO0Oo.get(paramInt2);
    if (localState == null) {
      return paramInt2;
    }
    paramInt2 = -1082130432;
    float f = -1.0F;
    boolean bool1 = paramFloat1 < f;
    if (bool1)
    {
      paramInt2 = paramFloat2 < f;
      if (paramInt2 != 0)
      {
        localIterator = localState.OooO0O0.iterator();
        bool1 = false;
        Object localObject = null;
        for (;;)
        {
          boolean bool2 = localIterator.hasNext();
          if (!bool2) {
            break;
          }
          StateSet.Variant localVariant1 = (StateSet.Variant)localIterator.next();
          boolean bool3 = localVariant1.OooO00o(paramFloat1, paramFloat2);
          if (bool3)
          {
            int i = localVariant1.OooO0o0;
            if (paramInt1 == i) {
              return paramInt1;
            }
            localObject = localVariant1;
          }
        }
        if (localObject != null) {
          return localObject.OooO0o0;
        }
        return localState.OooO0OO;
      }
    }
    paramInt2 = localState.OooO0OO;
    if (paramInt2 == paramInt1) {
      return paramInt1;
    }
    Iterator localIterator = localState.OooO0O0.iterator();
    int j;
    do
    {
      boolean bool4 = localIterator.hasNext();
      if (!bool4) {
        break;
      }
      StateSet.Variant localVariant2 = (StateSet.Variant)localIterator.next();
      j = localVariant2.OooO0o0;
    } while (paramInt1 != j);
    return paramInt1;
    return localState.OooO0OO;
  }
  
  public final void OooO0O0(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    Object localObject1 = Xml.asAttributeSet(paramXmlPullParser);
    Object localObject2 = R.styleable.StateSet;
    localObject1 = paramContext.obtainStyledAttributes((AttributeSet)localObject1, (int[])localObject2);
    int i = ((TypedArray)localObject1).getIndexCount();
    int j = 0;
    String str1 = null;
    int m;
    while (j < i)
    {
      int k = ((TypedArray)localObject1).getIndex(j);
      m = R.styleable.StateSet_defaultState;
      if (k == m)
      {
        m = this.OooO00o;
        k = ((TypedArray)localObject1).getResourceId(k, m);
        this.OooO00o = k;
      }
      j += 1;
    }
    ((TypedArray)localObject1).recycle();
    try
    {
      int n = paramXmlPullParser.getEventType();
      i = 0;
      localObject2 = null;
      for (;;)
      {
        j = 1;
        if (n == j) {
          break;
        }
        if (n != 0)
        {
          String str2 = "StateSet";
          m = 3;
          int i2 = 2;
          boolean bool;
          if (n != i2)
          {
            if (n == m)
            {
              localObject1 = paramXmlPullParser.getName();
              bool = str2.equals(localObject1);
              if (!bool) {}
            }
          }
          else
          {
            localObject1 = paramXmlPullParser.getName();
            int i3 = ((String)localObject1).hashCode();
            switch (i3)
            {
            default: 
              break;
            case 1901439077: 
              str1 = "Variant";
              bool = ((String)localObject1).equals(str1);
              if (bool) {
                j = m;
              }
              break;
            case 1382829617: 
              bool = ((String)localObject1).equals(str2);
              if (!bool) {
                break;
              }
              break;
            case 1301459538: 
              str1 = "LayoutDescription";
              bool = ((String)localObject1).equals(str1);
              if (bool)
              {
                j = 0;
                str1 = null;
              }
              break;
            case 80204913: 
              str1 = "State";
              bool = ((String)localObject1).equals(str1);
              if (bool) {
                j = i2;
              }
              break;
            }
            j = -1;
            if (j != i2)
            {
              if (j == m)
              {
                localObject1 = new androidx/constraintlayout/widget/StateSet$Variant;
                ((StateSet.Variant)localObject1).<init>(paramContext, paramXmlPullParser);
                if (localObject2 != null) {
                  ((StateSet.State)localObject2).OooO00o((StateSet.Variant)localObject1);
                }
              }
            }
            else
            {
              localObject2 = new androidx/constraintlayout/widget/StateSet$State;
              ((StateSet.State)localObject2).<init>(paramContext, paramXmlPullParser);
              localObject1 = this.OooO0Oo;
              j = ((StateSet.State)localObject2).OooO00o;
              ((SparseArray)localObject1).put(j, localObject2);
            }
          }
        }
        else
        {
          paramXmlPullParser.getName();
        }
        int i1 = paramXmlPullParser.next();
      }
      return;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    catch (XmlPullParserException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public int OooO0OO(int paramInt1, int paramInt2, int paramInt3)
  {
    float f1 = paramInt2;
    float f2 = paramInt3;
    return OooO0Oo(-1, paramInt1, f1, f2);
  }
  
  public int OooO0Oo(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2)
  {
    int i = -1;
    if (paramInt1 == paramInt2)
    {
      StateSet.Variant localVariant;
      if (paramInt2 == i)
      {
        localObject1 = this.OooO0Oo;
        j = 0;
        localVariant = null;
        localObject1 = ((SparseArray)localObject1).valueAt(0);
      }
      else
      {
        localObject1 = this.OooO0Oo;
        j = this.OooO0O0;
        localObject1 = ((SparseArray)localObject1).get(j);
      }
      Object localObject1 = (StateSet.State)localObject1;
      if (localObject1 == null) {
        return i;
      }
      int j = this.OooO0OO;
      if (j != i)
      {
        localVariant = (StateSet.Variant)((StateSet.State)localObject1).OooO0O0.get(paramInt1);
        boolean bool = localVariant.OooO00o(paramFloat1, paramFloat2);
        if (bool) {
          return paramInt1;
        }
      }
      int k = ((StateSet.State)localObject1).OooO0O0(paramFloat1, paramFloat2);
      if (paramInt1 == k) {
        return paramInt1;
      }
      if (k == i)
      {
        paramInt1 = ((StateSet.State)localObject1).OooO0OO;
      }
      else
      {
        localObject2 = (StateSet.Variant)((StateSet.State)localObject1).OooO0O0.get(k);
        paramInt1 = ((StateSet.Variant)localObject2).OooO0o0;
      }
      return paramInt1;
    }
    Object localObject2 = (StateSet.State)this.OooO0Oo.get(paramInt2);
    if (localObject2 == null) {
      return i;
    }
    paramInt2 = ((StateSet.State)localObject2).OooO0O0(paramFloat1, paramFloat2);
    if (paramInt2 == i)
    {
      paramInt1 = ((StateSet.State)localObject2).OooO0OO;
    }
    else
    {
      localObject2 = (StateSet.Variant)((StateSet.State)localObject2).OooO0O0.get(paramInt2);
      paramInt1 = ((StateSet.Variant)localObject2).OooO0o0;
    }
    return paramInt1;
  }
  
  public void setOnConstraintsChanged(ConstraintsChangedListener paramConstraintsChangedListener)
  {
    this.OooO0o = paramConstraintsChangedListener;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.StateSet
 * JD-Core Version:    0.7.0.1
 */