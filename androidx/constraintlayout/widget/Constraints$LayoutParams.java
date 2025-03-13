package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

public class Constraints$LayoutParams
  extends ConstraintLayout.LayoutParams
{
  public float o00000;
  public float o000000;
  public float o000000O;
  public float o000000o;
  public float o00000O;
  public float o00000O0;
  public float o00000OO;
  public float o000OOo;
  public float o0O0O00;
  public float o0OO00O;
  public float o0OOO0o;
  public boolean o0Oo0oo;
  public float oo0o0Oo;
  
  public Constraints$LayoutParams(int paramInt1, int paramInt2)
  {
    super(paramInt1, paramInt2);
    float f = 1.0F;
    this.o0OOO0o = f;
    this.o0Oo0oo = false;
    this.o0OO00O = 0.0F;
    this.oo0o0Oo = 0.0F;
    this.o0O0O00 = 0.0F;
    this.o000OOo = 0.0F;
    this.o000000 = f;
    this.o000000O = f;
    this.o000000o = 0.0F;
    this.o00000 = 0.0F;
    this.o00000O0 = 0.0F;
    this.o00000O = 0.0F;
    this.o00000OO = 0.0F;
  }
  
  public Constraints$LayoutParams(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int i = 1065353216;
    float f1 = 1.0F;
    this.o0OOO0o = f1;
    int j = 0;
    this.o0Oo0oo = false;
    int k = 0;
    float f2 = 0.0F;
    this.o0OO00O = 0.0F;
    this.oo0o0Oo = 0.0F;
    this.o0O0O00 = 0.0F;
    this.o000OOo = 0.0F;
    this.o000000 = f1;
    this.o000000O = f1;
    this.o000000o = 0.0F;
    this.o00000 = 0.0F;
    this.o00000O0 = 0.0F;
    this.o00000O = 0.0F;
    this.o00000OO = 0.0F;
    int[] arrayOfInt = R.styleable.ConstraintSet;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    int m = paramContext.getIndexCount();
    while (j < m)
    {
      i = paramContext.getIndex(j);
      k = R.styleable.ConstraintSet_android_alpha;
      if (i == k)
      {
        f2 = this.o0OOO0o;
        f1 = paramContext.getFloat(i, f2);
        this.o0OOO0o = f1;
      }
      else
      {
        k = R.styleable.ConstraintSet_android_elevation;
        if (i == k)
        {
          f2 = this.o0OO00O;
          f1 = paramContext.getFloat(i, f2);
          this.o0OO00O = f1;
          i = 1;
          f1 = 1.4E-45F;
          this.o0Oo0oo = i;
        }
        else
        {
          k = R.styleable.ConstraintSet_android_rotationX;
          if (i == k)
          {
            f2 = this.o0O0O00;
            f1 = paramContext.getFloat(i, f2);
            this.o0O0O00 = f1;
          }
          else
          {
            k = R.styleable.ConstraintSet_android_rotationY;
            if (i == k)
            {
              f2 = this.o000OOo;
              f1 = paramContext.getFloat(i, f2);
              this.o000OOo = f1;
            }
            else
            {
              k = R.styleable.ConstraintSet_android_rotation;
              if (i == k)
              {
                f2 = this.oo0o0Oo;
                f1 = paramContext.getFloat(i, f2);
                this.oo0o0Oo = f1;
              }
              else
              {
                k = R.styleable.ConstraintSet_android_scaleX;
                if (i == k)
                {
                  f2 = this.o000000;
                  f1 = paramContext.getFloat(i, f2);
                  this.o000000 = f1;
                }
                else
                {
                  k = R.styleable.ConstraintSet_android_scaleY;
                  if (i == k)
                  {
                    f2 = this.o000000O;
                    f1 = paramContext.getFloat(i, f2);
                    this.o000000O = f1;
                  }
                  else
                  {
                    k = R.styleable.ConstraintSet_android_transformPivotX;
                    if (i == k)
                    {
                      f2 = this.o000000o;
                      f1 = paramContext.getFloat(i, f2);
                      this.o000000o = f1;
                    }
                    else
                    {
                      k = R.styleable.ConstraintSet_android_transformPivotY;
                      if (i == k)
                      {
                        f2 = this.o00000;
                        f1 = paramContext.getFloat(i, f2);
                        this.o00000 = f1;
                      }
                      else
                      {
                        k = R.styleable.ConstraintSet_android_translationX;
                        if (i == k)
                        {
                          f2 = this.o00000O0;
                          f1 = paramContext.getFloat(i, f2);
                          this.o00000O0 = f1;
                        }
                        else
                        {
                          k = R.styleable.ConstraintSet_android_translationY;
                          if (i == k)
                          {
                            f2 = this.o00000O;
                            f1 = paramContext.getFloat(i, f2);
                            this.o00000O = f1;
                          }
                          else
                          {
                            k = R.styleable.ConstraintSet_android_translationZ;
                            if (i == k)
                            {
                              f2 = this.o00000OO;
                              f1 = paramContext.getFloat(i, f2);
                              this.o00000OO = f1;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
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
 * Qualified Name:     androidx.constraintlayout.widget.Constraints.LayoutParams
 * JD-Core Version:    0.7.0.1
 */