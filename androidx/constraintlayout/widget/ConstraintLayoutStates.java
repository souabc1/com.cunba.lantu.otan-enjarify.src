package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ConstraintLayoutStates
{
  public final ConstraintLayout OooO00o;
  public ConstraintSet OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public SparseArray OooO0o;
  public SparseArray OooO0o0;
  public ConstraintsChangedListener OooO0oO;
  
  public ConstraintLayoutStates(Context paramContext, ConstraintLayout paramConstraintLayout, int paramInt)
  {
    int i = -1;
    this.OooO0OO = i;
    this.OooO0Oo = i;
    SparseArray localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    this.OooO0o0 = localSparseArray;
    localSparseArray = new android/util/SparseArray;
    localSparseArray.<init>();
    this.OooO0o = localSparseArray;
    this.OooO0oO = null;
    this.OooO00o = paramConstraintLayout;
    OooO00o(paramContext, paramInt);
  }
  
  public final void OooO00o(Context paramContext, int paramInt)
  {
    Object localObject = paramContext.getResources();
    XmlResourceParser localXmlResourceParser = ((Resources)localObject).getXml(paramInt);
    try
    {
      int i = localXmlResourceParser.getEventType();
      ConstraintLayoutStates.State localState = null;
      for (;;)
      {
        int k = 1;
        if (i == k) {
          break;
        }
        if (i != 0)
        {
          int m = 2;
          if (i == m)
          {
            localObject = localXmlResourceParser.getName();
            int n = ((String)localObject).hashCode();
            int i1 = 4;
            int i2 = 3;
            String str1;
            boolean bool;
            switch (n)
            {
            default: 
              break;
            case 1901439077: 
              str1 = "Variant";
              bool = ((String)localObject).equals(str1);
              if (bool) {
                k = i2;
              }
              break;
            case 1657696882: 
              str1 = "layoutDescription";
              bool = ((String)localObject).equals(str1);
              if (bool)
              {
                k = 0;
                str1 = null;
              }
              break;
            case 1382829617: 
              String str2 = "StateSet";
              bool = ((String)localObject).equals(str2);
              if (!bool) {
                break;
              }
              break;
            case 80204913: 
              str1 = "State";
              bool = ((String)localObject).equals(str1);
              if (bool) {
                k = m;
              }
              break;
            case -1349929691: 
              str1 = "ConstraintSet";
              bool = ((String)localObject).equals(str1);
              if (bool) {
                k = i1;
              }
              break;
            }
            k = -1;
            if (k != m)
            {
              if (k != i2)
              {
                if (k == i1) {
                  OooO0O0(paramContext, localXmlResourceParser);
                }
              }
              else
              {
                localObject = new androidx/constraintlayout/widget/ConstraintLayoutStates$Variant;
                ((ConstraintLayoutStates.Variant)localObject).<init>(paramContext, localXmlResourceParser);
                if (localState != null) {
                  localState.OooO00o((ConstraintLayoutStates.Variant)localObject);
                }
              }
            }
            else
            {
              localState = new androidx/constraintlayout/widget/ConstraintLayoutStates$State;
              localState.<init>(paramContext, localXmlResourceParser);
              localObject = this.OooO0o0;
              k = localState.OooO00o;
              ((SparseArray)localObject).put(k, localState);
            }
          }
        }
        else
        {
          localXmlResourceParser.getName();
        }
        int j = localXmlResourceParser.next();
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
  
  public final void OooO0O0(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    ConstraintSet localConstraintSet = new androidx/constraintlayout/widget/ConstraintSet;
    localConstraintSet.<init>();
    int i = paramXmlPullParser.getAttributeCount();
    int k = 0;
    while (k < i)
    {
      String str1 = paramXmlPullParser.getAttributeName(k);
      String str2 = paramXmlPullParser.getAttributeValue(k);
      if ((str1 != null) && (str2 != null))
      {
        String str3 = "id";
        int m = str3.equals(str1);
        if (m != 0)
        {
          String str4 = "/";
          boolean bool = str2.contains(str4);
          k = -1;
          m = 1;
          int j;
          if (bool)
          {
            j = str2.indexOf('/') + m;
            str4 = str2.substring(j);
            Resources localResources = paramContext.getResources();
            String str5 = paramContext.getPackageName();
            j = localResources.getIdentifier(str4, str3, str5);
          }
          else
          {
            j = k;
          }
          if (j == k)
          {
            k = str2.length();
            if (k > m)
            {
              str4 = str2.substring(m);
              j = Integer.parseInt(str4);
            }
          }
          localConstraintSet.OooOo0O(paramContext, paramXmlPullParser);
          paramContext = this.OooO0o;
          paramContext.put(j, localConstraintSet);
          break;
        }
      }
      k += 1;
    }
  }
  
  public void OooO0OO(int paramInt, float paramFloat1, float paramFloat2)
  {
    int i = this.OooO0OO;
    int k = -1;
    Object localObject2;
    Object localObject3;
    if (i == paramInt)
    {
      if (paramInt == k)
      {
        localObject1 = this.OooO0o0;
        i = 0;
        localObject2 = null;
        localObject1 = ((SparseArray)localObject1).valueAt(0);
      }
      else
      {
        localObject1 = this.OooO0o0.get(i);
      }
      Object localObject1 = (ConstraintLayoutStates.State)localObject1;
      i = this.OooO0Oo;
      if (i != k)
      {
        ArrayList localArrayList = ((ConstraintLayoutStates.State)localObject1).OooO0O0;
        localObject2 = (ConstraintLayoutStates.Variant)localArrayList.get(i);
        boolean bool = ((ConstraintLayoutStates.Variant)localObject2).OooO00o(paramFloat1, paramFloat2);
        if (bool) {
          return;
        }
      }
      int m = ((ConstraintLayoutStates.State)localObject1).OooO0O0(paramFloat1, paramFloat2);
      int n = this.OooO0Oo;
      if (n == m) {
        return;
      }
      ConstraintSet localConstraintSet1;
      if (m == k) {
        localConstraintSet1 = this.OooO0O0;
      } else {
        localConstraintSet1 = ((ConstraintLayoutStates.Variant)((ConstraintLayoutStates.State)localObject1).OooO0O0.get(m)).OooO0o;
      }
      if (m == k)
      {
        paramInt = ((ConstraintLayoutStates.State)localObject1).OooO0OO;
      }
      else
      {
        localObject1 = (ConstraintLayoutStates.Variant)((ConstraintLayoutStates.State)localObject1).OooO0O0.get(m);
        paramInt = ((ConstraintLayoutStates.Variant)localObject1).OooO0o0;
      }
      if (localConstraintSet1 == null) {
        return;
      }
      this.OooO0Oo = m;
      localObject3 = this.OooO0oO;
      if (localObject3 != null) {
        ((ConstraintsChangedListener)localObject3).OooO0O0(k, paramInt);
      }
      localObject3 = this.OooO00o;
      localConstraintSet1.OooO((ConstraintLayout)localObject3);
      localObject3 = this.OooO0oO;
      if (localObject3 != null) {
        ((ConstraintsChangedListener)localObject3).OooO00o(k, paramInt);
      }
    }
    else
    {
      this.OooO0OO = paramInt;
      localObject2 = (ConstraintLayoutStates.State)this.OooO0o0.get(paramInt);
      int i1 = ((ConstraintLayoutStates.State)localObject2).OooO0O0(paramFloat1, paramFloat2);
      ConstraintSet localConstraintSet2;
      if (i1 == k) {
        localConstraintSet2 = ((ConstraintLayoutStates.State)localObject2).OooO0Oo;
      } else {
        localConstraintSet2 = ((ConstraintLayoutStates.Variant)((ConstraintLayoutStates.State)localObject2).OooO0O0.get(i1)).OooO0o;
      }
      int j;
      if (i1 == k)
      {
        j = ((ConstraintLayoutStates.State)localObject2).OooO0OO;
      }
      else
      {
        localObject2 = (ConstraintLayoutStates.Variant)((ConstraintLayoutStates.State)localObject2).OooO0O0.get(i1);
        j = ((ConstraintLayoutStates.Variant)localObject2).OooO0o0;
      }
      if (localConstraintSet2 == null)
      {
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        ((StringBuilder)localObject2).append("NO Constraint set found ! id=");
        ((StringBuilder)localObject2).append(paramInt);
        ((StringBuilder)localObject2).append(", dim =");
        ((StringBuilder)localObject2).append(paramFloat1);
        ((StringBuilder)localObject2).append(", ");
        ((StringBuilder)localObject2).append(paramFloat2);
        return;
      }
      this.OooO0Oo = i1;
      localObject3 = this.OooO0oO;
      if (localObject3 != null) {
        ((ConstraintsChangedListener)localObject3).OooO0O0(paramInt, j);
      }
      localObject3 = this.OooO00o;
      localConstraintSet2.OooO((ConstraintLayout)localObject3);
      localObject3 = this.OooO0oO;
      if (localObject3 != null) {
        ((ConstraintsChangedListener)localObject3).OooO00o(paramInt, j);
      }
    }
  }
  
  public void setOnConstraintsChanged(ConstraintsChangedListener paramConstraintsChangedListener)
  {
    this.OooO0oO = paramConstraintsChangedListener;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintLayoutStates
 * JD-Core Version:    0.7.0.1
 */