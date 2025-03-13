package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;

class ConstraintLayoutStates$Variant
{
  public float OooO00o;
  public float OooO0O0;
  public float OooO0OO;
  public float OooO0Oo;
  public ConstraintSet OooO0o;
  public int OooO0o0;
  
  public ConstraintLayoutStates$Variant(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    float f1 = 0.0F / 0.0F;
    this.OooO00o = f1;
    this.OooO0O0 = f1;
    this.OooO0OO = f1;
    this.OooO0Oo = f1;
    f1 = 0.0F / 0.0F;
    this.OooO0o0 = -1;
    paramXmlPullParser = Xml.asAttributeSet(paramXmlPullParser);
    int[] arrayOfInt = R.styleable.Variant;
    paramXmlPullParser = paramContext.obtainStyledAttributes(paramXmlPullParser, arrayOfInt);
    int i = paramXmlPullParser.getIndexCount();
    int j = 0;
    while (j < i)
    {
      int k = paramXmlPullParser.getIndex(j);
      int n = R.styleable.Variant_constraints;
      int m;
      if (k == n)
      {
        n = this.OooO0o0;
        k = paramXmlPullParser.getResourceId(k, n);
        this.OooO0o0 = k;
        Object localObject1 = paramContext.getResources();
        n = this.OooO0o0;
        localObject1 = ((Resources)localObject1).getResourceTypeName(n);
        Object localObject2 = paramContext.getResources();
        int i4 = this.OooO0o0;
        ((Resources)localObject2).getResourceName(i4);
        localObject2 = "layout";
        m = ((String)localObject2).equals(localObject1);
        if (m != 0)
        {
          localObject1 = new androidx/constraintlayout/widget/ConstraintSet;
          ((ConstraintSet)localObject1).<init>();
          this.OooO0o = ((ConstraintSet)localObject1);
          n = this.OooO0o0;
          ((ConstraintSet)localObject1).OooOOO(paramContext, n);
        }
      }
      else
      {
        n = R.styleable.Variant_region_heightLessThan;
        float f2;
        float f3;
        if (m == n)
        {
          f2 = this.OooO0Oo;
          f3 = paramXmlPullParser.getDimension(m, f2);
          this.OooO0Oo = f3;
        }
        else
        {
          int i1 = R.styleable.Variant_region_heightMoreThan;
          if (m == i1)
          {
            f2 = this.OooO0O0;
            f3 = paramXmlPullParser.getDimension(m, f2);
            this.OooO0O0 = f3;
          }
          else
          {
            int i2 = R.styleable.Variant_region_widthLessThan;
            if (m == i2)
            {
              f2 = this.OooO0OO;
              f3 = paramXmlPullParser.getDimension(m, f2);
              this.OooO0OO = f3;
            }
            else
            {
              int i3 = R.styleable.Variant_region_widthMoreThan;
              if (m == i3)
              {
                f2 = this.OooO00o;
                f3 = paramXmlPullParser.getDimension(m, f2);
                this.OooO00o = f3;
              }
            }
          }
        }
      }
      j += 1;
    }
    paramXmlPullParser.recycle();
  }
  
  public boolean OooO00o(float paramFloat1, float paramFloat2)
  {
    float f = this.OooO00o;
    boolean bool1 = Float.isNaN(f);
    if (!bool1)
    {
      f = this.OooO00o;
      bool1 = paramFloat1 < f;
      if (bool1) {
        return false;
      }
    }
    f = this.OooO0O0;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      f = this.OooO0O0;
      bool1 = paramFloat2 < f;
      if (bool1) {
        return false;
      }
    }
    f = this.OooO0OO;
    bool1 = Float.isNaN(f);
    if (!bool1)
    {
      f = this.OooO0OO;
      bool2 = paramFloat1 < f;
      if (bool2) {
        return false;
      }
    }
    paramFloat1 = this.OooO0Oo;
    boolean bool2 = Float.isNaN(paramFloat1);
    if (!bool2)
    {
      paramFloat1 = this.OooO0Oo;
      bool2 = paramFloat2 < paramFloat1;
      if (bool2) {
        return false;
      }
    }
    return true;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintLayoutStates.Variant
 * JD-Core Version:    0.7.0.1
 */