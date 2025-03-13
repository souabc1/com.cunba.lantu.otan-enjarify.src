package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.util.TypedValue;
import androidx.constraintlayout.core.motion.utils.Easing;

public class ConstraintSet$Motion
{
  public static SparseIntArray OooOOOO;
  public float OooO;
  public boolean OooO00o = false;
  public int OooO0O0;
  public int OooO0OO;
  public String OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  public float OooO0oO;
  public int OooO0oo;
  public float OooOO0;
  public int OooOO0O;
  public String OooOO0o;
  public int OooOOO;
  public int OooOOO0;
  
  static
  {
    SparseIntArray localSparseIntArray = new android/util/SparseIntArray;
    localSparseIntArray.<init>();
    OooOOOO = localSparseIntArray;
    int i = R.styleable.Motion_motionPathRotate;
    localSparseIntArray.append(i, 1);
    localSparseIntArray = OooOOOO;
    i = R.styleable.Motion_pathMotionArc;
    localSparseIntArray.append(i, 2);
    localSparseIntArray = OooOOOO;
    i = R.styleable.Motion_transitionEasing;
    localSparseIntArray.append(i, 3);
    localSparseIntArray = OooOOOO;
    i = R.styleable.Motion_drawPath;
    localSparseIntArray.append(i, 4);
    localSparseIntArray = OooOOOO;
    i = R.styleable.Motion_animateRelativeTo;
    localSparseIntArray.append(i, 5);
    localSparseIntArray = OooOOOO;
    i = R.styleable.Motion_animateCircleAngleTo;
    localSparseIntArray.append(i, 6);
    localSparseIntArray = OooOOOO;
    i = R.styleable.Motion_motionStagger;
    localSparseIntArray.append(i, 7);
    localSparseIntArray = OooOOOO;
    i = R.styleable.Motion_quantizeMotionSteps;
    localSparseIntArray.append(i, 8);
    localSparseIntArray = OooOOOO;
    i = R.styleable.Motion_quantizeMotionPhase;
    localSparseIntArray.append(i, 9);
    localSparseIntArray = OooOOOO;
    i = R.styleable.Motion_quantizeMotionInterpolator;
    localSparseIntArray.append(i, 10);
  }
  
  public ConstraintSet$Motion()
  {
    int i = -1;
    this.OooO0O0 = i;
    this.OooO0OO = 0;
    this.OooO0Oo = null;
    this.OooO0o0 = i;
    this.OooO0o = 0;
    float f = 0.0F / 0.0F;
    this.OooO0oO = f;
    this.OooO0oo = i;
    this.OooO = f;
    this.OooOO0 = f;
    this.OooOO0O = i;
    this.OooOO0o = null;
    this.OooOOO0 = -3;
    this.OooOOO = i;
  }
  
  public void OooO00o(Motion paramMotion)
  {
    boolean bool = paramMotion.OooO00o;
    this.OooO00o = bool;
    int i = paramMotion.OooO0O0;
    this.OooO0O0 = i;
    String str = paramMotion.OooO0Oo;
    this.OooO0Oo = str;
    i = paramMotion.OooO0o0;
    this.OooO0o0 = i;
    i = paramMotion.OooO0o;
    this.OooO0o = i;
    float f = paramMotion.OooO;
    this.OooO = f;
    f = paramMotion.OooO0oO;
    this.OooO0oO = f;
    int j = paramMotion.OooO0oo;
    this.OooO0oo = j;
  }
  
  public void OooO0O0(Context paramContext, AttributeSet paramAttributeSet)
  {
    int[] arrayOfInt = R.styleable.Motion;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    int i = 1;
    this.OooO00o = i;
    int j = paramContext.getIndexCount();
    int k = 0;
    while (k < j)
    {
      int m = paramContext.getIndex(k);
      Object localObject = OooOOOO;
      int n = ((SparseIntArray)localObject).get(m);
      int i1 = 3;
      label247:
      float f1;
      float f2;
      switch (n)
      {
      default: 
        break;
      case 10: 
        localObject = paramContext.peekValue(m);
        n = ((TypedValue)localObject).type;
        int i2 = -2;
        int i3 = -1;
        if (n == i)
        {
          m = paramContext.getResourceId(m, i3);
          this.OooOOO = m;
          if (m == i3) {
            break;
          }
        }
        else
        {
          for (;;)
          {
            this.OooOOO0 = i2;
            break label525;
            if (n != i1) {
              break label247;
            }
            localObject = paramContext.getString(m);
            this.OooOO0o = ((String)localObject);
            String str1 = "/";
            n = ((String)localObject).indexOf(str1);
            if (n <= 0) {
              break;
            }
            m = paramContext.getResourceId(m, i3);
            this.OooOOO = m;
          }
          this.OooOOO0 = i3;
          break;
          n = this.OooOOO;
          m = paramContext.getInteger(m, n);
          this.OooOOO0 = m;
        }
        break;
      case 9: 
        f1 = this.OooOO0;
        f2 = paramContext.getFloat(m, f1);
        this.OooOO0 = f2;
        break;
      case 8: 
        n = this.OooOO0O;
        m = paramContext.getInteger(m, n);
        this.OooOO0O = m;
        break;
      case 7: 
        f1 = this.OooO0oO;
        f2 = paramContext.getFloat(m, f1);
        this.OooO0oO = f2;
        break;
      case 6: 
        n = this.OooO0OO;
        m = paramContext.getInteger(m, n);
        this.OooO0OO = m;
        break;
      case 5: 
        n = this.OooO0O0;
        m = ConstraintSet.OooO00o(paramContext, m, n);
        this.OooO0O0 = m;
        break;
      case 4: 
        m = paramContext.getInt(m, 0);
        this.OooO0o = m;
        break;
      case 3: 
        localObject = paramContext.peekValue(m);
        n = ((TypedValue)localObject).type;
        String str2;
        if (n == i1)
        {
          str2 = paramContext.getString(m);
        }
        else
        {
          localObject = Easing.OooO0OO;
          m = paramContext.getInteger(m, 0);
          str2 = localObject[m];
        }
        this.OooO0Oo = str2;
        break;
      case 2: 
        n = this.OooO0o0;
        m = paramContext.getInt(m, n);
        this.OooO0o0 = m;
        break;
      case 1: 
        f1 = this.OooO;
        f2 = paramContext.getFloat(m, f1);
        this.OooO = f2;
      }
      label525:
      k += 1;
    }
    paramContext.recycle();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintSet.Motion
 * JD-Core Version:    0.7.0.1
 */