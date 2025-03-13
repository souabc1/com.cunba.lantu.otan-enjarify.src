package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

public class ConstraintSet$Transform
{
  public static SparseIntArray OooOOOO;
  public int OooO;
  public boolean OooO00o = false;
  public float OooO0O0 = 0.0F;
  public float OooO0OO = 0.0F;
  public float OooO0Oo = 0.0F;
  public float OooO0o;
  public float OooO0o0;
  public float OooO0oO;
  public float OooO0oo;
  public float OooOO0;
  public float OooOO0O;
  public float OooOO0o;
  public float OooOOO;
  public boolean OooOOO0;
  
  static
  {
    SparseIntArray localSparseIntArray = new android/util/SparseIntArray;
    localSparseIntArray.<init>();
    OooOOOO = localSparseIntArray;
    int i = R.styleable.Transform_android_rotation;
    localSparseIntArray.append(i, 1);
    localSparseIntArray = OooOOOO;
    i = R.styleable.Transform_android_rotationX;
    localSparseIntArray.append(i, 2);
    localSparseIntArray = OooOOOO;
    i = R.styleable.Transform_android_rotationY;
    localSparseIntArray.append(i, 3);
    localSparseIntArray = OooOOOO;
    i = R.styleable.Transform_android_scaleX;
    localSparseIntArray.append(i, 4);
    localSparseIntArray = OooOOOO;
    i = R.styleable.Transform_android_scaleY;
    localSparseIntArray.append(i, 5);
    localSparseIntArray = OooOOOO;
    i = R.styleable.Transform_android_transformPivotX;
    localSparseIntArray.append(i, 6);
    localSparseIntArray = OooOOOO;
    i = R.styleable.Transform_android_transformPivotY;
    localSparseIntArray.append(i, 7);
    localSparseIntArray = OooOOOO;
    i = R.styleable.Transform_android_translationX;
    localSparseIntArray.append(i, 8);
    localSparseIntArray = OooOOOO;
    i = R.styleable.Transform_android_translationY;
    localSparseIntArray.append(i, 9);
    localSparseIntArray = OooOOOO;
    i = R.styleable.Transform_android_translationZ;
    localSparseIntArray.append(i, 10);
    localSparseIntArray = OooOOOO;
    i = R.styleable.Transform_android_elevation;
    localSparseIntArray.append(i, 11);
    localSparseIntArray = OooOOOO;
    i = R.styleable.Transform_transformPivotTarget;
    localSparseIntArray.append(i, 12);
  }
  
  public ConstraintSet$Transform()
  {
    float f = 1.0F;
    this.OooO0o0 = f;
    this.OooO0o = f;
    f = 0.0F / 0.0F;
    this.OooO0oO = f;
    this.OooO0oo = f;
    this.OooO = -1;
    this.OooOO0 = 0.0F;
    this.OooOO0O = 0.0F;
    this.OooOO0o = 0.0F;
    this.OooOOO0 = false;
    this.OooOOO = 0.0F;
  }
  
  public void OooO00o(Transform paramTransform)
  {
    boolean bool1 = paramTransform.OooO00o;
    this.OooO00o = bool1;
    float f1 = paramTransform.OooO0O0;
    this.OooO0O0 = f1;
    f1 = paramTransform.OooO0OO;
    this.OooO0OO = f1;
    f1 = paramTransform.OooO0Oo;
    this.OooO0Oo = f1;
    f1 = paramTransform.OooO0o0;
    this.OooO0o0 = f1;
    f1 = paramTransform.OooO0o;
    this.OooO0o = f1;
    f1 = paramTransform.OooO0oO;
    this.OooO0oO = f1;
    f1 = paramTransform.OooO0oo;
    this.OooO0oo = f1;
    int i = paramTransform.OooO;
    this.OooO = i;
    f1 = paramTransform.OooOO0;
    this.OooOO0 = f1;
    f1 = paramTransform.OooOO0O;
    this.OooOO0O = f1;
    f1 = paramTransform.OooOO0o;
    this.OooOO0o = f1;
    boolean bool2 = paramTransform.OooOOO0;
    this.OooOOO0 = bool2;
    float f2 = paramTransform.OooOOO;
    this.OooOOO = f2;
  }
  
  public void OooO0O0(Context paramContext, AttributeSet paramAttributeSet)
  {
    int[] arrayOfInt = R.styleable.Transform;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    boolean bool = true;
    this.OooO00o = bool;
    int i = paramContext.getIndexCount();
    int j = 0;
    while (j < i)
    {
      int k = paramContext.getIndex(j);
      SparseIntArray localSparseIntArray = OooOOOO;
      int m = localSparseIntArray.get(k);
      float f1;
      float f2;
      switch (m)
      {
      default: 
        break;
      case 12: 
        m = this.OooO;
        k = ConstraintSet.OooO00o(paramContext, k, m);
        this.OooO = k;
        break;
      case 11: 
        this.OooOOO0 = bool;
        f1 = this.OooOOO;
        f2 = paramContext.getDimension(k, f1);
        this.OooOOO = f2;
        break;
      case 10: 
        f1 = this.OooOO0o;
        f2 = paramContext.getDimension(k, f1);
        this.OooOO0o = f2;
        break;
      case 9: 
        f1 = this.OooOO0O;
        f2 = paramContext.getDimension(k, f1);
        this.OooOO0O = f2;
        break;
      case 8: 
        f1 = this.OooOO0;
        f2 = paramContext.getDimension(k, f1);
        this.OooOO0 = f2;
        break;
      case 7: 
        f1 = this.OooO0oo;
        f2 = paramContext.getDimension(k, f1);
        this.OooO0oo = f2;
        break;
      case 6: 
        f1 = this.OooO0oO;
        f2 = paramContext.getDimension(k, f1);
        this.OooO0oO = f2;
        break;
      case 5: 
        f1 = this.OooO0o;
        f2 = paramContext.getFloat(k, f1);
        this.OooO0o = f2;
        break;
      case 4: 
        f1 = this.OooO0o0;
        f2 = paramContext.getFloat(k, f1);
        this.OooO0o0 = f2;
        break;
      case 3: 
        f1 = this.OooO0Oo;
        f2 = paramContext.getFloat(k, f1);
        this.OooO0Oo = f2;
        break;
      case 2: 
        f1 = this.OooO0OO;
        f2 = paramContext.getFloat(k, f1);
        this.OooO0OO = f2;
        break;
      case 1: 
        f1 = this.OooO0O0;
        f2 = paramContext.getFloat(k, f1);
        this.OooO0O0 = f2;
      }
      j += 1;
    }
    paramContext.recycle();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintSet.Transform
 * JD-Core Version:    0.7.0.1
 */