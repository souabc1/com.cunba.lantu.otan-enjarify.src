package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Xml;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

class StateSet$State
{
  public int OooO00o;
  public ArrayList OooO0O0;
  public int OooO0OO;
  public boolean OooO0Oo;
  
  public StateSet$State(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO0O0 = localArrayList;
    this.OooO0OO = -1;
    int i = 0;
    localArrayList = null;
    this.OooO0Oo = false;
    paramXmlPullParser = Xml.asAttributeSet(paramXmlPullParser);
    int[] arrayOfInt = R.styleable.State;
    paramXmlPullParser = paramContext.obtainStyledAttributes(paramXmlPullParser, arrayOfInt);
    int j = paramXmlPullParser.getIndexCount();
    while (i < j)
    {
      int k = paramXmlPullParser.getIndex(i);
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
          Object localObject1 = paramContext.getResources();
          m = this.OooO0OO;
          localObject1 = ((Resources)localObject1).getResourceTypeName(m);
          Object localObject2 = paramContext.getResources();
          int n = this.OooO0OO;
          ((Resources)localObject2).getResourceName(n);
          localObject2 = "layout";
          boolean bool = ((String)localObject2).equals(localObject1);
          if (bool)
          {
            bool = true;
            this.OooO0Oo = bool;
          }
        }
      }
      i += 1;
    }
    paramXmlPullParser.recycle();
  }
  
  public void OooO00o(StateSet.Variant paramVariant)
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
      localObject = (StateSet.Variant)this.OooO0O0.get(i);
      boolean bool = ((StateSet.Variant)localObject).OooO00o(paramFloat1, paramFloat2);
      if (bool) {
        return i;
      }
      i += 1;
    }
    return -1;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.StateSet.State
 * JD-Core Version:    0.7.0.1
 */