package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.R.styleable;
import androidx.core.widget.NestedScrollView;
import androidx.core.widget.NestedScrollView.OnScrollChangeListener;
import org.xmlpull.v1.XmlPullParser;

class TouchResponse
{
  public static final float[][] Oooo00O;
  public static final float[][] Oooo00o;
  public float OooO;
  public int OooO00o;
  public int OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public int OooO0o;
  public int OooO0o0;
  public float OooO0oO;
  public float OooO0oo;
  public float OooOO0;
  public int OooOO0O;
  public boolean OooOO0o;
  public float OooOOO;
  public float OooOOO0;
  public boolean OooOOOO;
  public float[] OooOOOo;
  public float OooOOo;
  public int[] OooOOo0;
  public float OooOOoo;
  public float OooOo;
  public float OooOo0;
  public final MotionLayout OooOo00;
  public float OooOo0O;
  public boolean OooOo0o;
  public float OooOoO;
  public int OooOoO0;
  public float OooOoOO;
  public float OooOoo;
  public float OooOoo0;
  public float OooOooO;
  public int OooOooo;
  public int Oooo000;
  
  static
  {
    float[][] arrayOfFloat = new float[7][];
    int i = 2;
    float[] arrayOfFloat1 = new float[i];
    float[] tmp13_12 = arrayOfFloat1;
    tmp13_12[0] = 0.5F;
    tmp13_12[1] = 0.0F;
    arrayOfFloat[0] = arrayOfFloat1;
    arrayOfFloat1 = new float[i];
    float[] tmp30_29 = arrayOfFloat1;
    tmp30_29[0] = 0.0F;
    tmp30_29[1] = 0.5F;
    int j = 1;
    arrayOfFloat[j] = arrayOfFloat1;
    arrayOfFloat1 = new float[i];
    float[] tmp49_48 = arrayOfFloat1;
    tmp49_48[0] = 1.0F;
    tmp49_48[1] = 0.5F;
    arrayOfFloat[i] = arrayOfFloat1;
    arrayOfFloat1 = new float[i];
    float[] tmp67_66 = arrayOfFloat1;
    tmp67_66[0] = 0.5F;
    tmp67_66[1] = 1.0F;
    int k = 3;
    arrayOfFloat[k] = arrayOfFloat1;
    arrayOfFloat1 = new float[i];
    float[] tmp89_88 = arrayOfFloat1;
    tmp89_88[0] = 0.5F;
    tmp89_88[1] = 0.5F;
    int m = 4;
    arrayOfFloat[m] = arrayOfFloat1;
    arrayOfFloat1 = new float[i];
    float[] tmp111_110 = arrayOfFloat1;
    tmp111_110[0] = 0.0F;
    tmp111_110[1] = 0.5F;
    int n = 5;
    arrayOfFloat[n] = arrayOfFloat1;
    arrayOfFloat1 = new float[i];
    float[] tmp132_131 = arrayOfFloat1;
    tmp132_131[0] = 1.0F;
    tmp132_131[1] = 0.5F;
    int i1 = 6;
    arrayOfFloat[i1] = arrayOfFloat1;
    Oooo00O = arrayOfFloat;
    arrayOfFloat = new float[i1][];
    arrayOfFloat1 = new float[i];
    float[] tmp165_164 = arrayOfFloat1;
    tmp165_164[0] = 0.0F;
    tmp165_164[1] = -1.0F;
    arrayOfFloat[0] = arrayOfFloat1;
    arrayOfFloat1 = new float[i];
    float[] tmp182_181 = arrayOfFloat1;
    tmp182_181[0] = 0.0F;
    tmp182_181[1] = 1.0F;
    arrayOfFloat[j] = arrayOfFloat1;
    arrayOfFloat1 = new float[i];
    float[] tmp199_198 = arrayOfFloat1;
    tmp199_198[0] = -1.0F;
    tmp199_198[1] = 0.0F;
    arrayOfFloat[i] = arrayOfFloat1;
    arrayOfFloat1 = new float[i];
    float[] tmp216_215 = arrayOfFloat1;
    tmp216_215[0] = 1.0F;
    tmp216_215[1] = 0.0F;
    arrayOfFloat[k] = arrayOfFloat1;
    arrayOfFloat1 = new float[i];
    float[] tmp234_233 = arrayOfFloat1;
    tmp234_233[0] = -1.0F;
    tmp234_233[1] = 0.0F;
    arrayOfFloat[m] = arrayOfFloat1;
    float[] arrayOfFloat2 = new float[i];
    float[] tmp254_252 = arrayOfFloat2;
    tmp254_252[0] = 1.0F;
    tmp254_252[1] = 0.0F;
    arrayOfFloat[n] = arrayOfFloat2;
    Oooo00o = arrayOfFloat;
  }
  
  public TouchResponse(Context paramContext, MotionLayout paramMotionLayout, XmlPullParser paramXmlPullParser)
  {
    this.OooO00o = 0;
    this.OooO0O0 = 0;
    this.OooO0OO = 0;
    int i = -1;
    this.OooO0Oo = i;
    this.OooO0o0 = i;
    this.OooO0o = i;
    float f1 = 0.5F;
    this.OooO0oO = f1;
    this.OooO0oo = f1;
    this.OooO = f1;
    this.OooOO0 = f1;
    this.OooOO0O = i;
    this.OooOO0o = false;
    this.OooOOO0 = 0.0F;
    float f2 = 1.0F;
    this.OooOOO = f2;
    this.OooOOOO = false;
    int j = 2;
    float[] arrayOfFloat = new float[j];
    this.OooOOOo = arrayOfFloat;
    int[] arrayOfInt = new int[j];
    this.OooOOo0 = arrayOfInt;
    this.OooOo0 = 4.0F;
    this.OooOo0O = 1.2F;
    this.OooOo0o = true;
    this.OooOo = f2;
    this.OooOoO0 = 0;
    f1 = 10.0F;
    this.OooOoO = f1;
    this.OooOoOO = f1;
    this.OooOoo0 = f2;
    f2 = 0.0F / 0.0F;
    this.OooOoo = f2;
    this.OooOooO = f2;
    this.OooOooo = 0;
    this.Oooo000 = 0;
    this.OooOo00 = paramMotionLayout;
    paramMotionLayout = Xml.asAttributeSet(paramXmlPullParser);
    OooO0OO(paramContext, paramMotionLayout);
  }
  
  public TouchResponse(MotionLayout paramMotionLayout, OnSwipe paramOnSwipe)
  {
    float f1 = 0.0F;
    this.OooO00o = 0;
    this.OooO0O0 = 0;
    this.OooO0OO = 0;
    int i = -1;
    float f2 = 0.0F / 0.0F;
    this.OooO0Oo = i;
    this.OooO0o0 = i;
    this.OooO0o = i;
    float f3 = 0.5F;
    this.OooO0oO = f3;
    this.OooO0oo = f3;
    this.OooO = f3;
    this.OooOO0 = f3;
    this.OooOO0O = i;
    this.OooOO0o = false;
    this.OooOOO0 = 0.0F;
    f3 = 1.0F;
    this.OooOOO = f3;
    this.OooOOOO = false;
    int j = 2;
    float[] arrayOfFloat = new float[j];
    this.OooOOOo = arrayOfFloat;
    int[] arrayOfInt = new int[j];
    this.OooOOo0 = arrayOfInt;
    this.OooOo0 = 4.0F;
    this.OooOo0O = 1.2F;
    j = 1;
    this.OooOo0o = j;
    this.OooOo = f3;
    this.OooOoO0 = 0;
    int k = 1092616192;
    float f4 = 10.0F;
    this.OooOoO = f4;
    this.OooOoOO = f4;
    this.OooOoo0 = f3;
    f3 = 0.0F / 0.0F;
    this.OooOoo = f3;
    this.OooOooO = f3;
    this.OooOooo = 0;
    this.Oooo000 = 0;
    this.OooOo00 = paramMotionLayout;
    int m = paramOnSwipe.getTouchAnchorId();
    this.OooO0Oo = m;
    m = paramOnSwipe.getTouchAnchorSide();
    this.OooO00o = m;
    if (m != i)
    {
      arrayOfFloat1 = Oooo00O;
      paramMotionLayout = arrayOfFloat1[m];
      f2 = paramMotionLayout[0];
      this.OooO0oo = f2;
      f5 = paramMotionLayout[j];
      this.OooO0oO = f5;
    }
    m = paramOnSwipe.getDragDirection();
    this.OooO0O0 = m;
    float[][] arrayOfFloat1 = Oooo00o;
    k = arrayOfFloat1.length;
    if (m < k)
    {
      paramMotionLayout = arrayOfFloat1[m];
      f1 = paramMotionLayout[0];
      this.OooOOO0 = f1;
      f5 = paramMotionLayout[j];
      this.OooOOO = f5;
    }
    else
    {
      this.OooOOO = f3;
      this.OooOOO0 = f3;
      this.OooOO0o = j;
    }
    float f5 = paramOnSwipe.getMaxVelocity();
    this.OooOo0 = f5;
    f5 = paramOnSwipe.getMaxAcceleration();
    this.OooOo0O = f5;
    boolean bool = paramOnSwipe.getMoveWhenScrollAtTop();
    this.OooOo0o = bool;
    f5 = paramOnSwipe.getDragScale();
    this.OooOo = f5;
    f5 = paramOnSwipe.getDragThreshold();
    this.OooOoO = f5;
    int n = paramOnSwipe.getTouchRegionId();
    this.OooO0o0 = n;
    n = paramOnSwipe.getOnTouchUp();
    this.OooO0OO = n;
    n = paramOnSwipe.getNestedScrollFlags();
    this.OooOoO0 = n;
    n = paramOnSwipe.getLimitBoundsTo();
    this.OooO0o = n;
    n = paramOnSwipe.getRotationCenterId();
    this.OooOO0O = n;
    n = paramOnSwipe.getSpringBoundary();
    this.OooOooo = n;
    f5 = paramOnSwipe.getSpringDamping();
    this.OooOoOO = f5;
    f5 = paramOnSwipe.getSpringMass();
    this.OooOoo0 = f5;
    f5 = paramOnSwipe.getSpringStiffness();
    this.OooOoo = f5;
    f5 = paramOnSwipe.getSpringStopThreshold();
    this.OooOooO = f5;
    n = paramOnSwipe.getAutoCompleteMode();
    this.Oooo000 = n;
  }
  
  public void OooO(float paramFloat1, float paramFloat2)
  {
    MotionLayout localMotionLayout = this.OooOo00;
    float f1 = localMotionLayout.getProgress();
    boolean bool1 = this.OooOOOO;
    boolean bool2 = true;
    if (!bool1)
    {
      this.OooOOOO = bool2;
      localObject1 = this.OooOo00;
      ((MotionLayout)localObject1).setProgress(f1);
    }
    Object localObject1 = this.OooOo00;
    int i = this.OooO0Oo;
    float f2 = this.OooO0oo;
    float f3 = this.OooO0oO;
    float[] arrayOfFloat1 = this.OooOOOo;
    ((MotionLayout)localObject1).Oooo0oO(i, f1, f2, f3, arrayOfFloat1);
    float f4 = this.OooOOO0;
    float[] arrayOfFloat2 = this.OooOOOo;
    f2 = arrayOfFloat2[0];
    f4 *= f2;
    f2 = this.OooOOO;
    float f5 = arrayOfFloat2[bool2];
    f2 *= f5;
    f4 = Math.abs(f4 + f2);
    double d1 = f4;
    double d2 = 0.01D;
    bool1 = d1 < d2;
    if (bool1)
    {
      localObject1 = this.OooOOOo;
      i = 1008981770;
      f5 = 0.01F;
      localObject1[0] = f5;
      localObject1[bool2] = f5;
    }
    f4 = this.OooOOO0;
    i = 0;
    f5 = 0.0F;
    arrayOfFloat2 = null;
    boolean bool3 = f4 < 0.0F;
    if (bool3)
    {
      paramFloat1 *= f4;
      localObject2 = this.OooOOOo;
      paramFloat2 = localObject2[0];
      paramFloat1 /= paramFloat2;
    }
    else
    {
      paramFloat1 = this.OooOOO;
      paramFloat2 *= paramFloat1;
      float[] arrayOfFloat3 = this.OooOOOo;
      paramFloat1 = arrayOfFloat3[bool2];
      paramFloat1 = paramFloat2 / paramFloat1;
    }
    f1 += paramFloat1;
    paramFloat1 = Math.max(Math.min(f1, 1.0F), 0.0F);
    Object localObject2 = this.OooOo00;
    paramFloat2 = ((MotionLayout)localObject2).getProgress();
    boolean bool4 = paramFloat1 < paramFloat2;
    if (bool4)
    {
      localObject2 = this.OooOo00;
      ((MotionLayout)localObject2).setProgress(paramFloat1);
    }
  }
  
  public float OooO00o(float paramFloat1, float paramFloat2)
  {
    float f = this.OooOOO0;
    paramFloat1 *= f;
    f = this.OooOOO;
    paramFloat2 *= f;
    return paramFloat1 + paramFloat2;
  }
  
  public final void OooO0O0(TypedArray paramTypedArray)
  {
    int i = paramTypedArray.getIndexCount();
    int j = 0;
    while (j < i)
    {
      int k = paramTypedArray.getIndex(j);
      int i1 = R.styleable.OnSwipe_touchAnchorId;
      if (k == i1)
      {
        i1 = this.OooO0Oo;
        k = paramTypedArray.getResourceId(k, i1);
        this.OooO0Oo = k;
      }
      else
      {
        i1 = R.styleable.OnSwipe_touchAnchorSide;
        boolean bool2 = true;
        float[][] arrayOfFloat;
        float[] arrayOfFloat1;
        float f1;
        float f2;
        if (k == i1)
        {
          i1 = this.OooO00o;
          k = paramTypedArray.getInt(k, i1);
          this.OooO00o = k;
          arrayOfFloat = Oooo00O;
          arrayOfFloat1 = arrayOfFloat[k];
          f1 = arrayOfFloat1[0];
          this.OooO0oo = f1;
          f2 = arrayOfFloat1[bool2];
          this.OooO0oO = f2;
        }
        else
        {
          i1 = R.styleable.OnSwipe_dragDirection;
          if (k == i1)
          {
            i1 = this.OooO0O0;
            k = paramTypedArray.getInt(k, i1);
            this.OooO0O0 = k;
            arrayOfFloat = Oooo00o;
            int i6 = arrayOfFloat.length;
            if (k < i6)
            {
              arrayOfFloat1 = arrayOfFloat[k];
              f1 = arrayOfFloat1[0];
              this.OooOOO0 = f1;
              f2 = arrayOfFloat1[bool2];
              this.OooOOO = f2;
            }
            else
            {
              k = 2143289344;
              f2 = 0.0F / 0.0F;
              this.OooOOO = f2;
              this.OooOOO0 = f2;
              this.OooOO0o = bool2;
            }
          }
          else
          {
            i1 = R.styleable.OnSwipe_maxVelocity;
            if (k == i1)
            {
              f1 = this.OooOo0;
              f2 = paramTypedArray.getFloat(k, f1);
              this.OooOo0 = f2;
            }
            else
            {
              i1 = R.styleable.OnSwipe_maxAcceleration;
              if (k == i1)
              {
                f1 = this.OooOo0O;
                f2 = paramTypedArray.getFloat(k, f1);
                this.OooOo0O = f2;
              }
              else
              {
                i1 = R.styleable.OnSwipe_moveWhenScrollAtTop;
                int m;
                if (k == i1)
                {
                  boolean bool1 = this.OooOo0o;
                  m = paramTypedArray.getBoolean(k, bool1);
                  this.OooOo0o = m;
                }
                else
                {
                  int i2 = R.styleable.OnSwipe_dragScale;
                  if (m == i2)
                  {
                    f1 = this.OooOo;
                    f2 = paramTypedArray.getFloat(m, f1);
                    this.OooOo = f2;
                  }
                  else
                  {
                    int i3 = R.styleable.OnSwipe_dragThreshold;
                    if (m == i3)
                    {
                      f1 = this.OooOoO;
                      f2 = paramTypedArray.getFloat(m, f1);
                      this.OooOoO = f2;
                    }
                    else
                    {
                      int i4 = R.styleable.OnSwipe_touchRegionId;
                      int i5;
                      int n;
                      if (m == i4)
                      {
                        i5 = this.OooO0o0;
                        n = paramTypedArray.getResourceId(m, i5);
                        this.OooO0o0 = n;
                      }
                      else
                      {
                        i5 = R.styleable.OnSwipe_onTouchUp;
                        if (n == i5)
                        {
                          i5 = this.OooO0OO;
                          n = paramTypedArray.getInt(n, i5);
                          this.OooO0OO = n;
                        }
                        else
                        {
                          i5 = R.styleable.OnSwipe_nestedScrollFlags;
                          if (n == i5)
                          {
                            n = paramTypedArray.getInteger(n, 0);
                            this.OooOoO0 = n;
                          }
                          else
                          {
                            i5 = R.styleable.OnSwipe_limitBoundsTo;
                            if (n == i5)
                            {
                              n = paramTypedArray.getResourceId(n, 0);
                              this.OooO0o = n;
                            }
                            else
                            {
                              i5 = R.styleable.OnSwipe_rotationCenterId;
                              if (n == i5)
                              {
                                i5 = this.OooOO0O;
                                n = paramTypedArray.getResourceId(n, i5);
                                this.OooOO0O = n;
                              }
                              else
                              {
                                i5 = R.styleable.OnSwipe_springDamping;
                                if (n == i5)
                                {
                                  f1 = this.OooOoOO;
                                  f2 = paramTypedArray.getFloat(n, f1);
                                  this.OooOoOO = f2;
                                }
                                else
                                {
                                  i5 = R.styleable.OnSwipe_springMass;
                                  if (n == i5)
                                  {
                                    f1 = this.OooOoo0;
                                    f2 = paramTypedArray.getFloat(n, f1);
                                    this.OooOoo0 = f2;
                                  }
                                  else
                                  {
                                    i5 = R.styleable.OnSwipe_springStiffness;
                                    if (n == i5)
                                    {
                                      f1 = this.OooOoo;
                                      f2 = paramTypedArray.getFloat(n, f1);
                                      this.OooOoo = f2;
                                    }
                                    else
                                    {
                                      i5 = R.styleable.OnSwipe_springStopThreshold;
                                      if (n == i5)
                                      {
                                        f1 = this.OooOooO;
                                        f2 = paramTypedArray.getFloat(n, f1);
                                        this.OooOooO = f2;
                                      }
                                      else
                                      {
                                        i5 = R.styleable.OnSwipe_springBoundary;
                                        if (n == i5)
                                        {
                                          i5 = this.OooOooo;
                                          n = paramTypedArray.getInt(n, i5);
                                          this.OooOooo = n;
                                        }
                                        else
                                        {
                                          i5 = R.styleable.OnSwipe_autoCompleteMode;
                                          if (n == i5)
                                          {
                                            i5 = this.Oooo000;
                                            n = paramTypedArray.getInt(n, i5);
                                            this.Oooo000 = n;
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
                  }
                }
              }
            }
          }
        }
      }
      j += 1;
    }
  }
  
  public final void OooO0OO(Context paramContext, AttributeSet paramAttributeSet)
  {
    int[] arrayOfInt = R.styleable.OnSwipe;
    paramContext = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    OooO0O0(paramContext);
    paramContext.recycle();
  }
  
  public RectF OooO0Oo(ViewGroup paramViewGroup, RectF paramRectF)
  {
    int i = this.OooO0o;
    int j = -1;
    float f1 = 0.0F / 0.0F;
    float f2 = 0.0F;
    if (i == j) {
      return null;
    }
    paramViewGroup = paramViewGroup.findViewById(i);
    if (paramViewGroup == null) {
      return null;
    }
    float f3 = paramViewGroup.getLeft();
    f1 = paramViewGroup.getTop();
    f2 = paramViewGroup.getRight();
    float f4 = paramViewGroup.getBottom();
    paramRectF.set(f3, f1, f2, f4);
    return paramRectF;
  }
  
  public RectF OooO0o(ViewGroup paramViewGroup, RectF paramRectF)
  {
    int i = this.OooO0o0;
    int j = -1;
    float f1 = 0.0F / 0.0F;
    float f2 = 0.0F;
    if (i == j) {
      return null;
    }
    paramViewGroup = paramViewGroup.findViewById(i);
    if (paramViewGroup == null) {
      return null;
    }
    float f3 = paramViewGroup.getLeft();
    f1 = paramViewGroup.getTop();
    f2 = paramViewGroup.getRight();
    float f4 = paramViewGroup.getBottom();
    paramRectF.set(f3, f1, f2, f4);
    return paramRectF;
  }
  
  public float OooO0o0(float paramFloat1, float paramFloat2)
  {
    MotionLayout localMotionLayout1 = this.OooOo00;
    float f1 = localMotionLayout1.getProgress();
    MotionLayout localMotionLayout2 = this.OooOo00;
    int i = this.OooO0Oo;
    float f2 = this.OooO0oo;
    float f3 = this.OooO0oO;
    float[] arrayOfFloat1 = this.OooOOOo;
    localMotionLayout2.Oooo0oO(i, f1, f2, f3, arrayOfFloat1);
    float f4 = this.OooOOO0;
    boolean bool2 = false;
    float f5 = 0.0F;
    localMotionLayout2 = null;
    boolean bool1 = f4 < 0.0F;
    f1 = 1.0E-007F;
    float f6;
    if (bool1)
    {
      float[] arrayOfFloat2 = this.OooOOOo;
      bool1 = false;
      f6 = 0.0F;
      f2 = arrayOfFloat2[0];
      bool2 = f2 < 0.0F;
      if (!bool2) {
        arrayOfFloat2[0] = f1;
      }
      paramFloat1 *= f4;
      paramFloat2 = arrayOfFloat2[0];
      paramFloat1 /= paramFloat2;
    }
    else
    {
      float[] arrayOfFloat3 = this.OooOOOo;
      int j = 1;
      f4 = 1.4E-45F;
      f6 = arrayOfFloat3[j];
      bool2 = f6 < 0.0F;
      if (!bool2) {
        arrayOfFloat3[j] = f1;
      }
      f5 = this.OooOOO;
      paramFloat2 *= f5;
      paramFloat1 = arrayOfFloat3[j];
      paramFloat1 = paramFloat2 / paramFloat1;
    }
    return paramFloat1;
  }
  
  public void OooO0oO(MotionEvent paramMotionEvent, MotionLayout.MotionTracker paramMotionTracker, int paramInt, MotionScene paramMotionScene)
  {
    TouchResponse localTouchResponse = this;
    Object localObject1 = paramMotionTracker;
    boolean bool1 = this.OooOO0o;
    if (bool1)
    {
      OooO0oo(paramMotionEvent, paramMotionTracker, paramInt, paramMotionScene);
      return;
    }
    Object localObject2 = paramMotionEvent;
    paramMotionTracker.OooO00o(paramMotionEvent);
    int j = paramMotionEvent.getAction();
    boolean bool3 = false;
    float f1 = 0.0F;
    MotionLayout localMotionLayout1 = null;
    float f10;
    if (j != 0)
    {
      int m = 6;
      int i1 = -1;
      float f2 = 0.0F / 0.0F;
      int i2 = 1065353216;
      float f3 = 1.0F;
      int i3 = 1;
      float f5;
      float f7;
      float f8;
      Object localObject3;
      float f9;
      float[] arrayOfFloat;
      double d1;
      Object localObject4;
      int n;
      if (j != i3)
      {
        int i4 = 2;
        float f4 = 2.802597E-045F;
        if (j == i4)
        {
          f5 = paramMotionEvent.getRawY();
          f4 = this.OooOOoo;
          f5 -= f4;
          f4 = paramMotionEvent.getRawX();
          float f6 = this.OooOOo;
          f4 -= f6;
          f6 = this.OooOOO0 * f4;
          f7 = this.OooOOO * f5;
          f6 = Math.abs(f6 + f7);
          f7 = this.OooOoO;
          boolean bool4 = f6 < f7;
          if (!bool4)
          {
            bool4 = this.OooOOOO;
            if (!bool4) {}
          }
          else
          {
            MotionLayout localMotionLayout2 = localTouchResponse.OooOo00;
            f6 = localMotionLayout2.getProgress();
            boolean bool5 = localTouchResponse.OooOOOO;
            MotionLayout localMotionLayout3;
            if (!bool5)
            {
              localTouchResponse.OooOOOO = i3;
              localMotionLayout3 = localTouchResponse.OooOo00;
              localMotionLayout3.setProgress(f6);
            }
            int i6 = localTouchResponse.OooO0Oo;
            if (i6 != i1)
            {
              localMotionLayout3 = localTouchResponse.OooOo00;
              f2 = localTouchResponse.OooO0oo;
              f8 = localTouchResponse.OooO0oO;
              localObject3 = localTouchResponse.OooOOOo;
              localMotionLayout3.Oooo0oO(i6, f6, f2, f8, (float[])localObject3);
            }
            else
            {
              localObject3 = localTouchResponse.OooOo00;
              int i7 = ((View)localObject3).getWidth();
              i1 = localTouchResponse.OooOo00.getHeight();
              i7 = Math.min(i7, i1);
              f9 = i7;
              arrayOfFloat = localTouchResponse.OooOOOo;
              f8 = localTouchResponse.OooOOO * f9;
              arrayOfFloat[i3] = f8;
              f8 = localTouchResponse.OooOOO0;
              f9 *= f8;
              arrayOfFloat[0] = f9;
            }
            f9 = localTouchResponse.OooOOO0;
            arrayOfFloat = localTouchResponse.OooOOOo;
            f8 = arrayOfFloat[0];
            f9 *= f8;
            f8 = localTouchResponse.OooOOO;
            f2 = arrayOfFloat[i3];
            f8 *= f2;
            f9 += f8;
            f2 = localTouchResponse.OooOo;
            f9 = Math.abs(f9 * f2);
            d1 = f9;
            double d2 = 0.01D;
            boolean bool6 = d1 < d2;
            i1 = 1008981770;
            f2 = 0.01F;
            if (bool6)
            {
              localObject3 = localTouchResponse.OooOOOo;
              localObject3[0] = f2;
              localObject3[i3] = f2;
            }
            f9 = localTouchResponse.OooOOO0;
            bool6 = f9 < 0.0F;
            if (bool6)
            {
              localObject4 = localTouchResponse.OooOOOo;
              f5 = localObject4[0];
              f4 /= f5;
            }
            else
            {
              localObject3 = localTouchResponse.OooOOOo;
              f9 = localObject3[i3];
              f4 = f5 / f9;
            }
            f6 += f4;
            f5 = Math.max(Math.min(f6, f3), 0.0F);
            int i8 = localTouchResponse.OooO0OO;
            if (i8 == m) {
              f5 = Math.max(f5, f2);
            }
            i8 = localTouchResponse.OooO0OO;
            m = 7;
            if (i8 == m)
            {
              i8 = 1065185444;
              f9 = 0.99F;
              f5 = Math.min(f5, f9);
            }
            localObject3 = localTouchResponse.OooOo00;
            f9 = ((MotionLayout)localObject3).getProgress();
            n = f5 < f9;
            if (n != 0)
            {
              n = f9 < 0.0F;
              if (n != 0)
              {
                bool7 = f9 < f3;
                if (bool7) {}
              }
              else
              {
                localObject3 = localTouchResponse.OooOo00;
                if (n == 0) {
                  n = i3;
                } else {
                  n = 0;
                }
                ((MotionLayout)localObject3).Oooo00o(n);
              }
              localObject3 = localTouchResponse.OooOo00;
              ((MotionLayout)localObject3).setProgress(f5);
              j = 1000;
              ((MotionLayout.MotionTracker)localObject1).OooO0O0(j);
              f5 = paramMotionTracker.getXVelocity();
              f10 = paramMotionTracker.getYVelocity();
              f9 = localTouchResponse.OooOOO0;
              boolean bool7 = f9 < 0.0F;
              if (bool7)
              {
                localObject1 = localTouchResponse.OooOOOo;
                f10 = localObject1[0];
                f5 /= f10;
              }
              else
              {
                localObject4 = localTouchResponse.OooOOOo;
                f5 = localObject4[i3];
                f5 = f10 / f5;
              }
              localObject1 = localTouchResponse.OooOo00;
              ((MotionLayout)localObject1).o00Ooo0O = f5;
            }
            else
            {
              localObject1 = localTouchResponse.OooOo00;
              ((MotionLayout)localObject1).o00Ooo0O = 0.0F;
            }
            f10 = paramMotionEvent.getRawX();
            localTouchResponse.OooOOo = f10;
            f10 = paramMotionEvent.getRawY();
            localTouchResponse.OooOOoo = f10;
          }
        }
      }
      else
      {
        this.OooOOOO = false;
        int i = 1000;
        paramMotionTracker.OooO0O0(i);
        float f11 = paramMotionTracker.getXVelocity();
        f10 = paramMotionTracker.getYVelocity();
        localObject4 = this.OooOo00;
        f5 = ((MotionLayout)localObject4).getProgress();
        int i5 = this.OooO0Oo;
        if (i5 != i1)
        {
          MotionLayout localMotionLayout4 = this.OooOo00;
          float f12 = this.OooO0oo;
          f9 = this.OooO0oO;
          arrayOfFloat = this.OooOOOo;
          f7 = f5;
          localMotionLayout4.Oooo0oO(i5, f5, f12, f9, arrayOfFloat);
        }
        else
        {
          localObject3 = this.OooOo00;
          int i9 = ((View)localObject3).getWidth();
          i1 = this.OooOo00.getHeight();
          i9 = Math.min(i9, i1);
          f9 = i9;
          arrayOfFloat = this.OooOOOo;
          f8 = this.OooOOO * f9;
          arrayOfFloat[i3] = f8;
          f8 = this.OooOOO0;
          f9 *= f8;
          arrayOfFloat[0] = f9;
        }
        f9 = localTouchResponse.OooOOO0;
        arrayOfFloat = localTouchResponse.OooOOOo;
        f1 = arrayOfFloat[0];
        f2 = arrayOfFloat[i3];
        boolean bool8 = f9 < 0.0F;
        if (bool8) {
          f11 /= f1;
        } else {
          f11 = f10 / f2;
        }
        boolean bool9 = Float.isNaN(f11);
        if (!bool9)
        {
          int i13 = 1077936128;
          f10 = f11 / 3.0F + f5;
        }
        else
        {
          f10 = f5;
        }
        bool3 = f10 < 0.0F;
        boolean bool10;
        if (bool3)
        {
          bool3 = f10 < f3;
          if (bool3)
          {
            int k = localTouchResponse.OooO0OO;
            int i10 = 3;
            f9 = 4.203895E-045F;
            if (k != i10)
            {
              d1 = f10;
              double d3 = 0.5D;
              bool10 = d1 < d3;
              if (bool10)
              {
                bool10 = false;
                localObject1 = null;
                f10 = 0.0F;
              }
              else
              {
                bool10 = i2;
                f10 = f3;
              }
              if (k == n)
              {
                f10 = f5 + f11;
                bool10 = f10 < 0.0F;
                if (bool10)
                {
                  f10 = Math.abs(f11);
                  f11 = f10;
                }
                bool10 = i2;
                f10 = f3;
              }
              k = localTouchResponse.OooO0OO;
              int i11 = 7;
              f9 = 9.809089E-045F;
              if (k == i11)
              {
                f10 = f5 + f11;
                bool10 = f10 < f3;
                if (bool10)
                {
                  f10 = -Math.abs(f11);
                  f11 = f10;
                }
                bool10 = false;
                localObject1 = null;
                f10 = 0.0F;
              }
              localMotionLayout1 = localTouchResponse.OooOo00;
              int i12 = localTouchResponse.OooO0OO;
              localMotionLayout1.OoooOo0(i12, f10, f11);
              bool10 = 0.0F < f5;
              if (!bool10) {
                break label1434;
              }
              bool10 = f3 < f5;
              if (bool10) {
                return;
              }
              break label1434;
            }
          }
        }
        boolean bool2 = 0.0F < f10;
        if (bool2)
        {
          bool10 = f3 < f10;
          if (bool10) {}
        }
        else
        {
          label1434:
          localObject1 = localTouchResponse.OooOo00;
          localObject2 = MotionLayout.TransitionState.o00Ooo0O;
          ((MotionLayout)localObject1).setState((MotionLayout.TransitionState)localObject2);
        }
      }
    }
    else
    {
      f10 = paramMotionEvent.getRawX();
      this.OooOOo = f10;
      f10 = paramMotionEvent.getRawY();
      this.OooOOoo = f10;
      this.OooOOOO = false;
    }
  }
  
  public void OooO0oo(MotionEvent paramMotionEvent, MotionLayout.MotionTracker paramMotionTracker, int paramInt, MotionScene paramMotionScene)
  {
    TouchResponse localTouchResponse = this;
    Object localObject1 = paramMotionTracker;
    Object localObject2 = paramMotionEvent;
    paramMotionTracker.OooO00o(paramMotionEvent);
    int i = paramMotionEvent.getAction();
    boolean bool2 = false;
    float f1 = 0.0F;
    Object localObject3 = null;
    float f14;
    if (i != 0)
    {
      int m = 1135869952;
      float f2 = 360.0F;
      int i1 = -1;
      float f3 = 0.0F / 0.0F;
      float f4 = 2.0F;
      int i3 = 1;
      float f5 = 1.4E-45F;
      float f6;
      Object localObject4;
      float f7;
      Object localObject5;
      int i7;
      Object localObject6;
      float f8;
      Object localObject7;
      double d2;
      float f13;
      MotionLayout localMotionLayout;
      int j;
      double d7;
      double d8;
      if (i != i3)
      {
        int i4 = 2;
        f6 = 2.802597E-045F;
        if (i == i4)
        {
          paramMotionEvent.getRawY();
          paramMotionEvent.getRawX();
          localObject4 = this.OooOo00;
          i = ((View)localObject4).getWidth();
          f7 = i / f4;
          localObject5 = this.OooOo00;
          i4 = ((View)localObject5).getHeight();
          f6 = i4 / f4;
          i7 = this.OooOO0O;
          int i8;
          if (i7 != i1)
          {
            localObject4 = this.OooOo00.findViewById(i7);
            localObject5 = this.OooOo00;
            localObject6 = this.OooOOo0;
            ((View)localObject5).getLocationOnScreen((int[])localObject6);
            localObject5 = this.OooOOo0;
            i4 = localObject5[0];
            f6 = i4;
            i7 = ((View)localObject4).getLeft();
            i8 = ((View)localObject4).getRight();
            f8 = (i7 + i8) / f4;
            f6 += f8;
            localObject6 = this.OooOOo0;
            i7 = localObject6[i3];
            f8 = i7;
            i8 = ((View)localObject4).getTop();
            i = ((View)localObject4).getBottom();
            i8 += i;
            f7 = i8 / f4 + f8;
            float f9 = f6;
            f6 = f7;
            f7 = f9;
          }
          else
          {
            i7 = this.OooO0Oo;
            if (i7 != i1)
            {
              localObject6 = this.OooOo00.getMotionController(i7);
              localObject7 = this.OooOo00;
              i7 = ((MotionController)localObject6).getAnimateRelativeTo();
              localObject6 = ((View)localObject7).findViewById(i7);
              if (localObject6 != null)
              {
                localObject4 = this.OooOo00;
                localObject5 = this.OooOOo0;
                ((View)localObject4).getLocationOnScreen((int[])localObject5);
                localObject4 = this.OooOOo0;
                i = localObject4[0];
                f7 = i;
                i4 = ((View)localObject6).getLeft();
                i8 = ((View)localObject6).getRight();
                f6 = (i4 + i8) / f4;
                f7 += f6;
                localObject5 = this.OooOOo0;
                i4 = localObject5[i3];
                f6 = i4;
                i8 = ((View)localObject6).getTop();
                i7 = ((View)localObject6).getBottom();
                i8 += i7;
                f8 = i8 / f4;
                f6 += f8;
              }
            }
          }
          f4 = paramMotionEvent.getRawX() - f7;
          f8 = paramMotionEvent.getRawY() - f6;
          double d1 = paramMotionEvent.getRawY() - f6;
          float f10 = paramMotionEvent.getRawX() - f7;
          float f11 = f4;
          d2 = f10;
          d2 = Math.atan2(d1, d2);
          float f12 = localTouchResponse.OooOOoo - f6;
          d1 = f12;
          f6 = localTouchResponse.OooOOo - f7;
          double d3 = f6;
          d3 = Math.atan2(d1, d3);
          d3 = (d2 - d3) * 180.0D;
          d1 = 3.141592653589793D;
          d3 /= d1;
          f3 = (float)d3;
          f13 = 330.0F;
          boolean bool7 = f3 < f13;
          if (bool7)
          {
            f3 -= f2;
          }
          else
          {
            f13 = -330.0F;
            bool7 = f3 < f13;
            if (bool7) {
              f3 += f2;
            }
          }
          f13 = Math.abs(f3);
          d1 = f13;
          double d4 = 0.01D;
          bool7 = d1 < d4;
          if (!bool7)
          {
            bool7 = localTouchResponse.OooOOOO;
            if (!bool7) {}
          }
          else
          {
            localMotionLayout = localTouchResponse.OooOo00;
            f13 = localMotionLayout.getProgress();
            boolean bool5 = localTouchResponse.OooOOOO;
            if (!bool5)
            {
              localTouchResponse.OooOOOO = i3;
              localObject5 = localTouchResponse.OooOo00;
              ((MotionLayout)localObject5).setProgress(f13);
            }
            int i5 = localTouchResponse.OooO0Oo;
            i = -1;
            f7 = 0.0F / 0.0F;
            if (i5 != i)
            {
              localObject4 = localTouchResponse.OooOo00;
              f2 = localTouchResponse.OooO0oo;
              f12 = localTouchResponse.OooO0oO;
              float[] arrayOfFloat1 = localTouchResponse.OooOOOo;
              ((MotionLayout)localObject4).Oooo0oO(i5, f13, f2, f12, arrayOfFloat1);
              localObject4 = localTouchResponse.OooOOOo;
              d1 = Math.toDegrees(localObject4[i3]);
              f2 = (float)d1;
              localObject4[i3] = f2;
            }
            else
            {
              localObject4 = localTouchResponse.OooOOOo;
              localObject4[i3] = f2;
            }
            f7 = localTouchResponse.OooOo;
            f3 *= f7;
            localObject4 = localTouchResponse.OooOOOo;
            f7 = localObject4[i3];
            f3 /= f7;
            f13 += f3;
            i = 1065353216;
            f7 = 1.0F;
            f2 = Math.min(f13, f7);
            i1 = 0;
            f3 = 0.0F;
            f2 = Math.max(f2, 0.0F);
            localMotionLayout = localTouchResponse.OooOo00;
            f13 = localMotionLayout.getProgress();
            boolean bool6 = f2 < f13;
            if (bool6)
            {
              boolean bool4 = f13 < 0.0F;
              if (bool4)
              {
                boolean bool1 = f13 < f7;
                if (bool1) {}
              }
              else
              {
                localObject4 = localTouchResponse.OooOo00;
                if (!bool4)
                {
                  bool2 = i3;
                  f1 = f5;
                }
                ((MotionLayout)localObject4).Oooo00o(bool2);
              }
              localTouchResponse.OooOo00.setProgress(f2);
              j = 1000;
              ((MotionLayout.MotionTracker)localObject1).OooO0O0(j);
              f7 = paramMotionTracker.getXVelocity();
              double d5 = paramMotionTracker.getYVelocity();
              d3 = f7;
              double d6 = Math.hypot(d5, d3);
              d7 = Math.sin(Math.atan2(d5, d3) - d2);
              d6 *= d7;
              f4 = f11;
              d7 = f11;
              d8 = f8;
              d7 = Math.hypot(d7, d8);
              d6 /= d7;
              f14 = (float)d6;
              localObject4 = localTouchResponse.OooOo00;
              d5 = Math.toDegrees(f14);
              f14 = (float)d5;
              ((MotionLayout)localObject4).o00Ooo0O = f14;
            }
            else
            {
              localObject1 = localTouchResponse.OooOo00;
              j = 0;
              f7 = 0.0F;
              localObject4 = null;
              ((MotionLayout)localObject1).o00Ooo0O = 0.0F;
            }
            f14 = paramMotionEvent.getRawX();
            localTouchResponse.OooOOo = f14;
            f14 = paramMotionEvent.getRawY();
            localTouchResponse.OooOOoo = f14;
          }
        }
      }
      else
      {
        this.OooOOOO = false;
        int i2 = 16;
        paramMotionTracker.OooO0O0(i2);
        f3 = paramMotionTracker.getXVelocity();
        f14 = paramMotionTracker.getYVelocity();
        localMotionLayout = this.OooOo00;
        f13 = localMotionLayout.getProgress();
        Object localObject8 = this.OooOo00;
        int i9 = ((View)localObject8).getWidth();
        float f15 = i9 / f4;
        localObject5 = this.OooOo00;
        int i6 = ((View)localObject5).getHeight();
        f6 = i6 / f4;
        i7 = this.OooOO0O;
        j = -1;
        f7 = 0.0F / 0.0F;
        if (i7 != j)
        {
          localObject8 = this.OooOo00.findViewById(i7);
          localObject5 = this.OooOo00;
          localObject6 = this.OooOOo0;
          ((View)localObject5).getLocationOnScreen((int[])localObject6);
          k = this.OooOOo0[0];
          f1 = k;
          i6 = ((View)localObject8).getLeft();
          i7 = ((View)localObject8).getRight();
          f6 = (i6 + i7) / f4;
          f1 += f6;
          localObject5 = this.OooOOo0;
        }
        for (i6 = localObject5[i3];; i6 = localObject5[i3])
        {
          f6 = i6;
          i7 = ((View)localObject8).getTop();
          i9 = ((View)localObject8).getBottom();
          i7 += i9;
          f15 = i7 / f4;
          f6 += f15;
          f15 = f1;
          break;
          i7 = this.OooO0Oo;
          j = -1;
          f7 = 0.0F / 0.0F;
          if (i7 == j) {
            break;
          }
          localObject8 = this.OooOo00.getMotionController(i7);
          localObject5 = this.OooOo00;
          i9 = ((MotionController)localObject8).getAnimateRelativeTo();
          localObject8 = ((View)localObject5).findViewById(i9);
          localObject5 = this.OooOo00;
          localObject6 = this.OooOOo0;
          ((View)localObject5).getLocationOnScreen((int[])localObject6);
          k = this.OooOOo0[0];
          f1 = k;
          i6 = ((View)localObject8).getLeft();
          i7 = ((View)localObject8).getRight();
          f6 = (i6 + i7) / f4;
          f1 += f6;
          localObject5 = this.OooOOo0;
        }
        f1 = paramMotionEvent.getRawX() - f15;
        float f16 = paramMotionEvent.getRawY() - f6;
        d2 = f16;
        double d9 = f1;
        d2 = Math.toDegrees(Math.atan2(d2, d9));
        i6 = localTouchResponse.OooO0Oo;
        j = -1;
        f7 = 0.0F / 0.0F;
        if (i6 != j)
        {
          localObject4 = localTouchResponse.OooOo00;
          f2 = localTouchResponse.OooO0oo;
          f8 = localTouchResponse.OooO0oO;
          localObject7 = localTouchResponse.OooOOOo;
          ((MotionLayout)localObject4).Oooo0oO(i6, f13, f2, f8, (float[])localObject7);
          localObject4 = localTouchResponse.OooOOOo;
          d9 = Math.toDegrees(localObject4[i3]);
          f2 = (float)d9;
          localObject4[i3] = f2;
        }
        else
        {
          localObject4 = localTouchResponse.OooOOOo;
          localObject4[i3] = f2;
        }
        double d10 = f14 + f16;
        f3 += f1;
        d7 = f3;
        d10 = Math.toDegrees(Math.atan2(d10, d7)) - d2;
        f14 = (float)d10;
        f16 = 62.5F;
        f14 *= f16;
        boolean bool8 = Float.isNaN(f14);
        j = 1077936128;
        f7 = 3.0F;
        if (!bool8)
        {
          f16 = f14 * f7;
          f1 = localTouchResponse.OooOo;
          f16 *= f1;
          localObject3 = localTouchResponse.OooOOOo;
          f1 = localObject3[i3];
          f16 = f16 / f1 + f13;
        }
        else
        {
          f16 = f13;
        }
        int k = 0;
        f1 = 0.0F;
        localObject3 = null;
        boolean bool3 = f16 < 0.0F;
        if (bool3)
        {
          k = 1065353216;
          f1 = 1.0F;
          bool3 = f16 < f1;
          if (bool3)
          {
            k = localTouchResponse.OooO0OO;
            int n = 3;
            f2 = 4.203895E-045F;
            if (k != n)
            {
              f2 = localTouchResponse.OooOo;
              f14 *= f2;
              float[] arrayOfFloat2 = localTouchResponse.OooOOOo;
              f2 = arrayOfFloat2[i3];
              f14 /= f2;
              d8 = f16;
              d2 = 0.5D;
              bool8 = d8 < d2;
              if (bool8)
              {
                bool8 = false;
                f16 = 0.0F;
                localObject2 = null;
              }
              else
              {
                int i10 = 1065353216;
                f16 = 1.0F;
              }
              n = 6;
              f2 = 8.407791E-045F;
              if (k == n)
              {
                f16 = f13 + f14;
                k = 0;
                f1 = 0.0F;
                localObject3 = null;
                boolean bool9 = f16 < 0.0F;
                if (bool9) {
                  f14 = Math.abs(f14);
                }
                int i11 = 1065353216;
                f16 = 1.0F;
              }
              k = localTouchResponse.OooO0OO;
              n = 7;
              f2 = 9.809089E-045F;
              if (k == n)
              {
                f16 = f13 + f14;
                k = 1065353216;
                f1 = 1.0F;
                boolean bool10 = f16 < f1;
                if (bool10) {
                  f14 = -Math.abs(f14);
                }
                bool10 = false;
                f16 = 0.0F;
                localObject2 = null;
              }
              localObject3 = localTouchResponse.OooOo00;
              n = localTouchResponse.OooO0OO;
              f14 *= f7;
              ((MotionLayout)localObject3).OoooOo0(n, f16, f14);
              f14 = 0.0F;
              localObject1 = null;
              bool11 = 0.0F < f13;
              if (!bool11) {
                break label2209;
              }
              f14 = 1.0F;
              bool11 = f14 < f13;
              if (bool11) {
                return;
              }
              break label2209;
            }
          }
        }
        f14 = 0.0F;
        localObject1 = null;
        boolean bool11 = 0.0F < f16;
        if (bool11)
        {
          f14 = 1.0F;
          bool11 = f14 < f16;
          if (bool11) {}
        }
        else
        {
          label2209:
          localObject1 = localTouchResponse.OooOo00;
          localObject2 = MotionLayout.TransitionState.o00Ooo0O;
          ((MotionLayout)localObject1).setState((MotionLayout.TransitionState)localObject2);
        }
      }
    }
    else
    {
      f14 = paramMotionEvent.getRawX();
      this.OooOOo = f14;
      f14 = paramMotionEvent.getRawY();
      this.OooOOoo = f14;
      this.OooOOOO = false;
    }
  }
  
  public void OooOO0(float paramFloat1, float paramFloat2)
  {
    boolean bool1 = false;
    MotionLayout localMotionLayout1 = null;
    this.OooOOOO = false;
    MotionLayout localMotionLayout2 = this.OooOo00;
    float f1 = localMotionLayout2.getProgress();
    MotionLayout localMotionLayout3 = this.OooOo00;
    int i = this.OooO0Oo;
    float f2 = this.OooO0oo;
    float f3 = this.OooO0oO;
    float[] arrayOfFloat1 = this.OooOOOo;
    float f4 = f1;
    localMotionLayout3.Oooo0oO(i, f1, f2, f3, arrayOfFloat1);
    float f5 = this.OooOOO0;
    float[] arrayOfFloat2 = this.OooOOOo;
    f4 = arrayOfFloat2[0];
    f2 = this.OooOOO;
    boolean bool2 = true;
    f3 = 1.4E-45F;
    float f6 = arrayOfFloat2[bool2];
    float f7 = 0.0F;
    arrayOfFloat1 = null;
    boolean bool3 = f5 < 0.0F;
    if (bool3)
    {
      paramFloat1 = paramFloat1 * f5 / f4;
    }
    else
    {
      paramFloat2 *= f2;
      paramFloat1 = paramFloat2 / f6;
    }
    boolean bool4 = Float.isNaN(paramFloat1);
    if (!bool4)
    {
      int j = 1077936128;
      paramFloat2 = paramFloat1 / 3.0F;
      f1 += paramFloat2;
    }
    boolean bool5 = f1 < 0.0F;
    if (bool5)
    {
      int k = 1065353216;
      paramFloat2 = 1.0F;
      boolean bool6 = f1 < paramFloat2;
      if (bool6)
      {
        bool6 = bool2;
        f5 = f3;
      }
      else
      {
        bool6 = false;
        localMotionLayout3 = null;
        f5 = 0.0F;
      }
      i = this.OooO0OO;
      int m = 3;
      f4 = 4.203895E-045F;
      if (i != m) {
        bool1 = bool2;
      }
      bool1 &= bool6;
      if (bool1)
      {
        localMotionLayout1 = this.OooOo00;
        double d1 = f1;
        double d2 = 0.5D;
        boolean bool7 = d1 < d2;
        if (!bool7) {
          f7 = paramFloat2;
        }
        localMotionLayout1.OoooOo0(i, f7, paramFloat1);
      }
    }
  }
  
  public void OooOO0O(float paramFloat1, float paramFloat2)
  {
    this.OooOOo = paramFloat1;
    this.OooOOoo = paramFloat2;
  }
  
  public void OooOO0o(float paramFloat1, float paramFloat2)
  {
    this.OooOOo = paramFloat1;
    this.OooOOoo = paramFloat2;
    this.OooOOOO = false;
  }
  
  public void OooOOO0()
  {
    int i = this.OooO0Oo;
    int j = -1;
    Object localObject1;
    Object localObject2;
    if (i != j)
    {
      localObject1 = this.OooOo00;
      localObject2 = ((View)localObject1).findViewById(i);
      if (localObject2 == null)
      {
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        ((StringBuilder)localObject1).append("cannot find TouchAnchorId @id/");
        Object localObject3 = this.OooOo00.getContext();
        int k = this.OooO0Oo;
        localObject3 = Debug.OooO00o((Context)localObject3, k);
        ((StringBuilder)localObject1).append((String)localObject3);
      }
    }
    else
    {
      i = 0;
      localObject2 = null;
    }
    boolean bool = localObject2 instanceof NestedScrollView;
    if (bool)
    {
      localObject2 = (NestedScrollView)localObject2;
      localObject1 = new androidx/constraintlayout/motion/widget/TouchResponse$1;
      ((TouchResponse.1)localObject1).<init>(this);
      ((View)localObject2).setOnTouchListener((View.OnTouchListener)localObject1);
      localObject1 = new androidx/constraintlayout/motion/widget/TouchResponse$2;
      ((TouchResponse.2)localObject1).<init>(this);
      ((NestedScrollView)localObject2).setOnScrollChangeListener((NestedScrollView.OnScrollChangeListener)localObject1);
    }
  }
  
  public int getAnchorId()
  {
    return this.OooO0Oo;
  }
  
  public int getAutoCompleteMode()
  {
    return this.Oooo000;
  }
  
  public int getFlags()
  {
    return this.OooOoO0;
  }
  
  public int getLimitBoundsToId()
  {
    return this.OooO0o;
  }
  
  public float getMaxAcceleration()
  {
    return this.OooOo0O;
  }
  
  public float getMaxVelocity()
  {
    return this.OooOo0;
  }
  
  public boolean getMoveWhenScrollAtTop()
  {
    return this.OooOo0o;
  }
  
  public int getSpringBoundary()
  {
    return this.OooOooo;
  }
  
  public float getSpringDamping()
  {
    return this.OooOoOO;
  }
  
  public float getSpringMass()
  {
    return this.OooOoo0;
  }
  
  public float getSpringStiffness()
  {
    return this.OooOoo;
  }
  
  public float getSpringStopThreshold()
  {
    return this.OooOooO;
  }
  
  public int getTouchRegionId()
  {
    return this.OooO0o0;
  }
  
  public boolean isDragStarted()
  {
    return this.OooOOOO;
  }
  
  public void setAnchorId(int paramInt)
  {
    this.OooO0Oo = paramInt;
  }
  
  public void setAutoCompleteMode(int paramInt)
  {
    this.Oooo000 = paramInt;
  }
  
  public void setMaxAcceleration(float paramFloat)
  {
    this.OooOo0O = paramFloat;
  }
  
  public void setMaxVelocity(float paramFloat)
  {
    this.OooOo0 = paramFloat;
  }
  
  public void setRTL(boolean paramBoolean)
  {
    int i = 6;
    float f1 = 8.407791E-045F;
    int j = 3;
    float f2 = 4.203895E-045F;
    boolean bool = true;
    int k = 1;
    int m = 5;
    int n = 2;
    if (paramBoolean)
    {
      localObject1 = Oooo00o;
      arrayOfFloat = localObject1[j];
      localObject1[bool] = arrayOfFloat;
      arrayOfFloat = localObject1[n];
      localObject1[m] = arrayOfFloat;
      localObject1 = Oooo00O;
      arrayOfFloat = localObject1[n];
      localObject1[m] = arrayOfFloat;
      arrayOfFloat = localObject1[k];
      localObject1[i] = arrayOfFloat;
    }
    else
    {
      localObject1 = Oooo00o;
      Object localObject2 = localObject1[n];
      localObject1[bool] = localObject2;
      arrayOfFloat = localObject1[j];
      localObject1[m] = arrayOfFloat;
      localObject1 = Oooo00O;
      arrayOfFloat = localObject1[k];
      localObject1[m] = arrayOfFloat;
      arrayOfFloat = localObject1[n];
      localObject1[i] = arrayOfFloat;
    }
    Object localObject1 = Oooo00O;
    i = this.OooO00o;
    localObject1 = localObject1[i];
    i = 0;
    f1 = 0.0F;
    f2 = localObject1[0];
    this.OooO0oo = f2;
    float f3 = localObject1[k];
    this.OooO0oO = f3;
    paramBoolean = this.OooO0O0;
    float[][] arrayOfFloat = Oooo00o;
    bool = arrayOfFloat.length;
    if (paramBoolean >= bool) {
      return;
    }
    localObject1 = arrayOfFloat[paramBoolean];
    f1 = localObject1[0];
    this.OooOOO0 = f1;
    f3 = localObject1[k];
    this.OooOOO = f3;
  }
  
  public void setTouchUpMode(int paramInt)
  {
    this.OooO0OO = paramInt;
  }
  
  public String toString()
  {
    float f1 = this.OooOOO0;
    boolean bool = Float.isNaN(f1);
    Object localObject;
    if (bool)
    {
      localObject = "rotation";
    }
    else
    {
      localObject = new java/lang/StringBuilder;
      ((StringBuilder)localObject).<init>();
      float f2 = this.OooOOO0;
      ((StringBuilder)localObject).append(f2);
      String str = " , ";
      ((StringBuilder)localObject).append(str);
      f2 = this.OooOOO;
      ((StringBuilder)localObject).append(f2);
      localObject = ((StringBuilder)localObject).toString();
    }
    return localObject;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.TouchResponse
 * JD-Core Version:    0.7.0.1
 */