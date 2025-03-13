package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class ConstraintSet$PropertySet
{
  public boolean OooO00o = false;
  public int OooO0O0 = 0;
  public int OooO0OO = 0;
  public float OooO0Oo = 1.0F;
  public float OooO0o0 = 0.0F / 0.0F;
  
  public void OooO00o(PropertySet paramPropertySet)
  {
    boolean bool = paramPropertySet.OooO00o;
    this.OooO00o = bool;
    int i = paramPropertySet.OooO0O0;
    this.OooO0O0 = i;
    float f = paramPropertySet.OooO0Oo;
    this.OooO0Oo = f;
    f = paramPropertySet.OooO0o0;
    this.OooO0o0 = f;
    int j = paramPropertySet.OooO0OO;
    this.OooO0OO = j;
  }
  
  public void OooO0O0(Context paramContext, AttributeSet paramAttributeSet)
  {
    int[] arrayOfInt1 = R.styleable.PropertySet;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt1);
    this.OooO00o = true;
    int i = paramContext.getIndexCount();
    int j = 0;
    arrayOfInt1 = null;
    while (j < i)
    {
      int k = paramContext.getIndex(j);
      int m = R.styleable.PropertySet_android_alpha;
      float f1;
      float f2;
      if (k == m)
      {
        f1 = this.OooO0Oo;
        f2 = paramContext.getFloat(k, f1);
        this.OooO0Oo = f2;
      }
      else
      {
        m = R.styleable.PropertySet_android_visibility;
        if (k == m)
        {
          m = this.OooO0O0;
          k = paramContext.getInt(k, m);
          this.OooO0O0 = k;
          int[] arrayOfInt2 = ConstraintSet.OooO0O0();
          m = this.OooO0O0;
          k = arrayOfInt2[m];
          this.OooO0O0 = k;
        }
        else
        {
          m = R.styleable.PropertySet_visibilityMode;
          if (k == m)
          {
            m = this.OooO0OO;
            k = paramContext.getInt(k, m);
            this.OooO0OO = k;
          }
          else
          {
            m = R.styleable.PropertySet_motionProgress;
            if (k == m)
            {
              f1 = this.OooO0o0;
              f2 = paramContext.getFloat(k, f1);
              this.OooO0o0 = f2;
            }
          }
        }
      }
      j += 1;
    }
    paramContext.recycle();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintSet.PropertySet
 * JD-Core Version:    0.7.0.1
 */