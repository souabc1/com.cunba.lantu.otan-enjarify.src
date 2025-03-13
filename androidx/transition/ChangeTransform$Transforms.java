package androidx.transition;

import android.view.View;
import androidx.core.view.ViewCompat;

class ChangeTransform$Transforms
{
  public final float OooO00o;
  public final float OooO0O0;
  public final float OooO0OO;
  public final float OooO0Oo;
  public final float OooO0o;
  public final float OooO0o0;
  public final float OooO0oO;
  public final float OooO0oo;
  
  public ChangeTransform$Transforms(View paramView)
  {
    float f1 = paramView.getTranslationX();
    this.OooO00o = f1;
    f1 = paramView.getTranslationY();
    this.OooO0O0 = f1;
    f1 = ViewCompat.Oooo0o(paramView);
    this.OooO0OO = f1;
    f1 = paramView.getScaleX();
    this.OooO0Oo = f1;
    f1 = paramView.getScaleY();
    this.OooO0o0 = f1;
    f1 = paramView.getRotationX();
    this.OooO0o = f1;
    f1 = paramView.getRotationY();
    this.OooO0oO = f1;
    float f2 = paramView.getRotation();
    this.OooO0oo = f2;
  }
  
  public void OooO00o(View paramView)
  {
    float f1 = this.OooO00o;
    float f2 = this.OooO0O0;
    float f3 = this.OooO0OO;
    float f4 = this.OooO0Oo;
    float f5 = this.OooO0o0;
    float f6 = this.OooO0o;
    float f7 = this.OooO0oO;
    float f8 = this.OooO0oo;
    ChangeTransform.OooOo0O(paramView, f1, f2, f3, f4, f5, f6, f7, f8);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = paramObject instanceof Transforms;
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    paramObject = (Transforms)paramObject;
    float f1 = paramObject.OooO00o;
    float f2 = this.OooO00o;
    bool1 = f1 < f2;
    if (!bool1)
    {
      f1 = paramObject.OooO0O0;
      f2 = this.OooO0O0;
      bool1 = f1 < f2;
      if (!bool1)
      {
        f1 = paramObject.OooO0OO;
        f2 = this.OooO0OO;
        bool1 = f1 < f2;
        if (!bool1)
        {
          f1 = paramObject.OooO0Oo;
          f2 = this.OooO0Oo;
          bool1 = f1 < f2;
          if (!bool1)
          {
            f1 = paramObject.OooO0o0;
            f2 = this.OooO0o0;
            bool1 = f1 < f2;
            if (!bool1)
            {
              f1 = paramObject.OooO0o;
              f2 = this.OooO0o;
              bool1 = f1 < f2;
              if (!bool1)
              {
                f1 = paramObject.OooO0oO;
                f2 = this.OooO0oO;
                bool1 = f1 < f2;
                if (!bool1)
                {
                  float f3 = paramObject.OooO0oo;
                  f1 = this.OooO0oo;
                  boolean bool3 = f3 < f1;
                  if (!bool3) {
                    bool2 = true;
                  }
                }
              }
            }
          }
        }
      }
    }
    return bool2;
  }
  
  public int hashCode()
  {
    float f1 = this.OooO00o;
    boolean bool1 = false;
    boolean bool2 = f1 < 0.0F;
    int j = 0;
    if (bool2)
    {
      k = Float.floatToIntBits(f1);
    }
    else
    {
      k = 0;
      f1 = 0.0F;
    }
    k *= 31;
    float f2 = this.OooO0O0;
    boolean bool3 = f2 < 0.0F;
    int i;
    if (bool3)
    {
      i = Float.floatToIntBits(f2);
    }
    else
    {
      i = 0;
      f2 = 0.0F;
    }
    int k = (k + i) * 31;
    f2 = this.OooO0OO;
    bool3 = f2 < 0.0F;
    if (bool3)
    {
      i = Float.floatToIntBits(f2);
    }
    else
    {
      i = 0;
      f2 = 0.0F;
    }
    k = (k + i) * 31;
    f2 = this.OooO0Oo;
    bool3 = f2 < 0.0F;
    if (bool3)
    {
      i = Float.floatToIntBits(f2);
    }
    else
    {
      i = 0;
      f2 = 0.0F;
    }
    k = (k + i) * 31;
    f2 = this.OooO0o0;
    bool3 = f2 < 0.0F;
    if (bool3)
    {
      i = Float.floatToIntBits(f2);
    }
    else
    {
      i = 0;
      f2 = 0.0F;
    }
    k = (k + i) * 31;
    f2 = this.OooO0o;
    bool3 = f2 < 0.0F;
    if (bool3)
    {
      i = Float.floatToIntBits(f2);
    }
    else
    {
      i = 0;
      f2 = 0.0F;
    }
    k = (k + i) * 31;
    f2 = this.OooO0oO;
    bool3 = f2 < 0.0F;
    if (bool3)
    {
      i = Float.floatToIntBits(f2);
    }
    else
    {
      i = 0;
      f2 = 0.0F;
    }
    k = (k + i) * 31;
    f2 = this.OooO0oo;
    bool1 = f2 < 0.0F;
    if (bool1) {
      j = Float.floatToIntBits(f2);
    }
    return k + j;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.ChangeTransform.Transforms
 * JD-Core Version:    0.7.0.1
 */