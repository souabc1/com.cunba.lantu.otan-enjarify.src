package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

class ConstraintLayoutStates$State
{
  public int OooO00o;
  public ArrayList OooO0O0;
  public int OooO0OO;
  public ConstraintSet OooO0Oo;
  
  public ConstraintLayoutStates$State(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.OooO0O0 = ((ArrayList)localObject1);
    this.OooO0OO = -1;
    paramXmlPullParser = Xml.asAttributeSet(paramXmlPullParser);
    localObject1 = R.styleable.State;
    paramXmlPullParser = paramContext.obtainStyledAttributes(paramXmlPullParser, (int[])localObject1);
    int i = paramXmlPullParser.getIndexCount();
    int j = 0;
    while (j < i)
    {
      int k = paramXmlPullParser.getIndex(j);
      int m = R.styleable.State_android_id;
      if (k == m)
      {
        m = this.OooO00o;
        k = paramXmlPullParser.getResourceId(k, m);
        this.OooO00o = k;
      }
      else
      {
        m = R.styleable.State_constraints;
        if (k == m)
        {
          m = this.OooO0OO;
          k = paramXmlPullParser.getResourceId(k, m);
          this.OooO0OO = k;
          Object localObject2 = paramContext.getResources();
          m = this.OooO0OO;
          localObject2 = ((Resources)localObject2).getResourceTypeName(m);
          Object localObject3 = paramContext.getResources();
          int n = this.OooO0OO;
          ((Resources)localObject3).getResourceName(n);
          localObject3 = "layout";
          boolean bool = ((String)localObject3).equals(localObject2);
          if (bool)
          {
            localObject2 = new androidx/constraintlayout/widget/ConstraintSet;
            ((ConstraintSet)localObject2).<init>();
            this.OooO0Oo = ((ConstraintSet)localObject2);
            m = this.OooO0OO;
            ((ConstraintSet)localObject2).OooOOO(paramContext, m);
          }
        }
      }
      j += 1;
    }
    paramXmlPullParser.recycle();
  }
  
  public void OooO00o(ConstraintLayoutStates.Variant paramVariant)
  {
    this.OooO0O0.add(paramVariant);
  }
  
  public int OooO0O0(float paramFloat1, float paramFloat2)
  {
    int i = 0;
    for (;;)
    {
      Object localObject = this.OooO0O0;
      int j = ((ArrayList)localObject).size();
      if (i >= j) {
        break;
      }
      localObject = (ConstraintLayoutStates.Variant)this.OooO0O0.get(i);
      boolean bool = ((ConstraintLayoutStates.Variant)localObject).OooO00o(paramFloat1, paramFloat2);
      if (bool) {
        return i;
      }
      i += 1;
    }
    return -1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintLayoutStates.State
 * JD-Core Version:    0.7.0.1
 */