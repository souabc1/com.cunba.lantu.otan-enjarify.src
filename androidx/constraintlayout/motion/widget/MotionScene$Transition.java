package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.util.Xml;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R.styleable;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;

public class MotionScene$Transition
{
  public float OooO;
  public int OooO00o;
  public boolean OooO0O0;
  public int OooO0OO;
  public int OooO0Oo;
  public String OooO0o;
  public int OooO0o0;
  public int OooO0oO;
  public int OooO0oo;
  public final MotionScene OooOO0;
  public ArrayList OooOO0O;
  public TouchResponse OooOO0o;
  public int OooOOO;
  public ArrayList OooOOO0;
  public boolean OooOOOO;
  public int OooOOOo;
  public int OooOOo;
  public int OooOOo0;
  
  public MotionScene$Transition(int paramInt1, MotionScene paramMotionScene, int paramInt2, int paramInt3)
  {
    int i = -1;
    this.OooO00o = i;
    this.OooO0O0 = false;
    this.OooO0OO = i;
    this.OooO0Oo = i;
    this.OooO0o0 = 0;
    this.OooO0o = null;
    this.OooO0oO = i;
    this.OooO0oo = 400;
    this.OooO = 0.0F;
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    this.OooOO0O = localArrayList1;
    this.OooOO0o = null;
    ArrayList localArrayList2 = new java/util/ArrayList;
    localArrayList2.<init>();
    this.OooOOO0 = localArrayList2;
    this.OooOOO = 0;
    this.OooOOOO = false;
    this.OooOOOo = i;
    this.OooOOo0 = 0;
    this.OooOOo = 0;
    this.OooO00o = paramInt1;
    this.OooOO0 = paramMotionScene;
    this.OooO0Oo = paramInt2;
    this.OooO0OO = paramInt3;
    paramInt1 = MotionScene.OooO0o0(paramMotionScene);
    this.OooO0oo = paramInt1;
    paramInt1 = MotionScene.OooO00o(paramMotionScene);
    this.OooOOo0 = paramInt1;
  }
  
  public MotionScene$Transition(MotionScene paramMotionScene, Context paramContext, XmlPullParser paramXmlPullParser)
  {
    int i = -1;
    this.OooO00o = i;
    this.OooO0O0 = false;
    this.OooO0OO = i;
    this.OooO0Oo = i;
    this.OooO0o0 = 0;
    this.OooO0o = null;
    this.OooO0oO = i;
    this.OooO0oo = 400;
    this.OooO = 0.0F;
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    this.OooOO0O = localArrayList1;
    this.OooOO0o = null;
    ArrayList localArrayList2 = new java/util/ArrayList;
    localArrayList2.<init>();
    this.OooOOO0 = localArrayList2;
    this.OooOOO = 0;
    this.OooOOOO = false;
    this.OooOOOo = i;
    this.OooOOo0 = 0;
    this.OooOOo = 0;
    i = MotionScene.OooO0o0(paramMotionScene);
    this.OooO0oo = i;
    i = MotionScene.OooO00o(paramMotionScene);
    this.OooOOo0 = i;
    this.OooOO0 = paramMotionScene;
    paramXmlPullParser = Xml.asAttributeSet(paramXmlPullParser);
    OooOo0o(paramMotionScene, paramContext, paramXmlPullParser);
  }
  
  public MotionScene$Transition(MotionScene paramMotionScene, Transition paramTransition)
  {
    int i = -1;
    this.OooO00o = i;
    this.OooO0O0 = false;
    this.OooO0OO = i;
    this.OooO0Oo = i;
    this.OooO0o0 = 0;
    this.OooO0o = null;
    this.OooO0oO = i;
    this.OooO0oo = 400;
    this.OooO = 0.0F;
    ArrayList localArrayList1 = new java/util/ArrayList;
    localArrayList1.<init>();
    this.OooOO0O = localArrayList1;
    this.OooOO0o = null;
    ArrayList localArrayList2 = new java/util/ArrayList;
    localArrayList2.<init>();
    this.OooOOO0 = localArrayList2;
    this.OooOOO = 0;
    this.OooOOOO = false;
    this.OooOOOo = i;
    this.OooOOo0 = 0;
    this.OooOOo = 0;
    this.OooOO0 = paramMotionScene;
    int j = MotionScene.OooO0o0(paramMotionScene);
    this.OooO0oo = j;
    if (paramTransition != null)
    {
      j = paramTransition.OooOOOo;
      this.OooOOOo = j;
      j = paramTransition.OooO0o0;
      this.OooO0o0 = j;
      paramMotionScene = paramTransition.OooO0o;
      this.OooO0o = paramMotionScene;
      j = paramTransition.OooO0oO;
      this.OooO0oO = j;
      j = paramTransition.OooO0oo;
      this.OooO0oo = j;
      paramMotionScene = paramTransition.OooOO0O;
      this.OooOO0O = paramMotionScene;
      float f = paramTransition.OooO;
      this.OooO = f;
      j = paramTransition.OooOOo0;
      this.OooOOo0 = j;
    }
  }
  
  public void OooOo(int paramInt1, String paramString, int paramInt2)
  {
    this.OooO0o0 = paramInt1;
    this.OooO0o = paramString;
    this.OooO0oO = paramInt2;
  }
  
  public void OooOo0(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    ArrayList localArrayList = this.OooOOO0;
    MotionScene.Transition.TransitionOnClick localTransitionOnClick = new androidx/constraintlayout/motion/widget/MotionScene$Transition$TransitionOnClick;
    localTransitionOnClick.<init>(paramContext, this, paramXmlPullParser);
    localArrayList.add(localTransitionOnClick);
  }
  
  public void OooOo00(KeyFrames paramKeyFrames)
  {
    this.OooOO0O.add(paramKeyFrames);
  }
  
  public final void OooOo0O(MotionScene paramMotionScene, Context paramContext, TypedArray paramTypedArray)
  {
    int i = paramTypedArray.getIndexCount();
    int j = 0;
    int i4;
    label337:
    label486:
    int i1;
    for (;;)
    {
      int k = 1;
      float f = 1.4E-45F;
      int i2 = -1;
      if (j >= i) {
        break;
      }
      int i5 = paramTypedArray.getIndex(j);
      int i6 = R.styleable.Transition_constraintSetEnd;
      String str1 = "xml";
      String str2 = "layout";
      Object localObject1;
      int i3;
      SparseArray localSparseArray;
      if (i5 == i6)
      {
        k = paramTypedArray.getResourceId(i5, i2);
        this.OooO0OO = k;
        localObject1 = paramContext.getResources();
        i2 = this.OooO0OO;
        localObject1 = ((Resources)localObject1).getResourceTypeName(i2);
        boolean bool4 = str2.equals(localObject1);
        if (bool4)
        {
          localObject1 = new androidx/constraintlayout/widget/ConstraintSet;
          ((ConstraintSet)localObject1).<init>();
          i3 = this.OooO0OO;
          ((ConstraintSet)localObject1).OooOo0(paramContext, i3);
          localSparseArray = MotionScene.OooO0O0(paramMotionScene);
        }
      }
      for (i5 = this.OooO0OO;; i5 = this.OooO0Oo)
      {
        localSparseArray.append(i5, localObject1);
        break label801;
        boolean bool1 = str1.equals(localObject1);
        if (!bool1) {
          break label801;
        }
        int m = this.OooO0OO;
        m = MotionScene.OooO0OO(paramMotionScene, paramContext, m);
        this.OooO0OO = m;
        break label801;
        i6 = R.styleable.Transition_constraintSetStart;
        if (i5 != i6) {
          break label337;
        }
        m = this.OooO0Oo;
        m = paramTypedArray.getResourceId(i5, m);
        this.OooO0Oo = m;
        localObject1 = paramContext.getResources();
        i3 = this.OooO0Oo;
        localObject1 = ((Resources)localObject1).getResourceTypeName(i3);
        boolean bool5 = str2.equals(localObject1);
        if (!bool5) {
          break;
        }
        localObject1 = new androidx/constraintlayout/widget/ConstraintSet;
        ((ConstraintSet)localObject1).<init>();
        i4 = this.OooO0Oo;
        ((ConstraintSet)localObject1).OooOo0(paramContext, i4);
        localSparseArray = MotionScene.OooO0O0(paramMotionScene);
      }
      boolean bool2 = str1.equals(localObject1);
      if (bool2)
      {
        int n = this.OooO0Oo;
        n = MotionScene.OooO0OO(paramMotionScene, paramContext, n);
        this.OooO0Oo = n;
        break label801;
        i6 = R.styleable.Transition_motionInterpolator;
        if (i5 == i6)
        {
          Object localObject2 = paramTypedArray.peekValue(i5);
          i6 = ((TypedValue)localObject2).type;
          int i7 = -2;
          if (i6 == n)
          {
            n = paramTypedArray.getResourceId(i5, i4);
            this.OooO0oO = n;
            if (n == i4) {}
          }
          else
          {
            for (;;)
            {
              this.OooO0o0 = i7;
              break label801;
              n = 3;
              f = 4.203895E-045F;
              if (i6 != n) {
                break label486;
              }
              localObject1 = paramTypedArray.getString(i5);
              this.OooO0o = ((String)localObject1);
              if (localObject1 == null) {
                break label801;
              }
              localObject2 = "/";
              n = ((String)localObject1).indexOf((String)localObject2);
              if (n <= 0) {
                break;
              }
              n = paramTypedArray.getResourceId(i5, i4);
              this.OooO0oO = n;
            }
            this.OooO0o0 = i4;
            break label801;
            n = this.OooO0o0;
            n = paramTypedArray.getInteger(i5, n);
            this.OooO0o0 = n;
          }
        }
        else
        {
          n = R.styleable.Transition_duration;
          if (i5 == n)
          {
            n = this.OooO0oo;
            n = paramTypedArray.getInt(i5, n);
            this.OooO0oo = n;
            i4 = 8;
            if (n < i4) {
              this.OooO0oo = i4;
            }
          }
          else
          {
            n = R.styleable.Transition_staggered;
            if (i5 == n)
            {
              f = this.OooO;
              f = paramTypedArray.getFloat(i5, f);
              this.OooO = f;
            }
            else
            {
              n = R.styleable.Transition_autoTransition;
              if (i5 == n)
              {
                n = this.OooOOO;
                n = paramTypedArray.getInteger(i5, n);
                this.OooOOO = n;
              }
              else
              {
                n = R.styleable.Transition_android_id;
                if (i5 == n)
                {
                  n = this.OooO00o;
                  n = paramTypedArray.getResourceId(i5, n);
                  this.OooO00o = n;
                }
                else
                {
                  n = R.styleable.Transition_transitionDisable;
                  if (i5 == n)
                  {
                    boolean bool3 = this.OooOOOO;
                    bool3 = paramTypedArray.getBoolean(i5, bool3);
                    this.OooOOOO = bool3;
                  }
                  else
                  {
                    i1 = R.styleable.Transition_pathMotionArc;
                    if (i5 == i1)
                    {
                      i1 = paramTypedArray.getInteger(i5, i4);
                      this.OooOOOo = i1;
                    }
                    else
                    {
                      i1 = R.styleable.Transition_layoutDuringTransition;
                      if (i5 == i1)
                      {
                        i1 = paramTypedArray.getInteger(i5, 0);
                        this.OooOOo0 = i1;
                      }
                      else
                      {
                        i1 = R.styleable.Transition_transitionFlags;
                        if (i5 == i1)
                        {
                          i1 = paramTypedArray.getInteger(i5, 0);
                          this.OooOOo = i1;
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
      label801:
      j += 1;
    }
    int i8 = this.OooO0Oo;
    if (i8 == i4) {
      this.OooO0O0 = i1;
    }
  }
  
  public final void OooOo0o(MotionScene paramMotionScene, Context paramContext, AttributeSet paramAttributeSet)
  {
    int[] arrayOfInt = R.styleable.Transition;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    OooOo0O(paramMotionScene, paramContext, paramAttributeSet);
    paramAttributeSet.recycle();
  }
  
  public int getAutoTransition()
  {
    return this.OooOOO;
  }
  
  public int getDuration()
  {
    return this.OooO0oo;
  }
  
  public int getEndConstraintSetId()
  {
    return this.OooO0OO;
  }
  
  public int getId()
  {
    return this.OooO00o;
  }
  
  public List getKeyFrameList()
  {
    return this.OooOO0O;
  }
  
  public int getLayoutDuringTransition()
  {
    return this.OooOOo0;
  }
  
  public List getOnClickList()
  {
    return this.OooOOO0;
  }
  
  public int getPathMotionArc()
  {
    return this.OooOOOo;
  }
  
  public float getStagger()
  {
    return this.OooO;
  }
  
  public int getStartConstraintSetId()
  {
    return this.OooO0Oo;
  }
  
  public TouchResponse getTouchResponse()
  {
    return this.OooOO0o;
  }
  
  public boolean isEnabled()
  {
    return this.OooOOOO ^ true;
  }
  
  public boolean isTransitionFlag(int paramInt)
  {
    int i = this.OooOOo;
    paramInt &= i;
    if (paramInt != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    return paramInt;
  }
  
  public void setAutoTransition(int paramInt)
  {
    this.OooOOO = paramInt;
  }
  
  public void setDuration(int paramInt)
  {
    paramInt = Math.max(paramInt, 8);
    this.OooO0oo = paramInt;
  }
  
  public void setEnable(boolean paramBoolean)
  {
    setEnabled(paramBoolean);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    paramBoolean ^= true;
    this.OooOOOO = paramBoolean;
  }
  
  public void setLayoutDuringTransition(int paramInt)
  {
    this.OooOOo0 = paramInt;
  }
  
  public void setOnSwipe(OnSwipe paramOnSwipe)
  {
    if (paramOnSwipe == null)
    {
      paramOnSwipe = null;
    }
    else
    {
      TouchResponse localTouchResponse = new androidx/constraintlayout/motion/widget/TouchResponse;
      MotionLayout localMotionLayout = MotionScene.OooO0Oo(this.OooOO0);
      localTouchResponse.<init>(localMotionLayout, paramOnSwipe);
      paramOnSwipe = localTouchResponse;
    }
    this.OooOO0o = paramOnSwipe;
  }
  
  public void setOnTouchUp(int paramInt)
  {
    TouchResponse localTouchResponse = getTouchResponse();
    if (localTouchResponse != null) {
      localTouchResponse.setTouchUpMode(paramInt);
    }
  }
  
  public void setPathMotionArc(int paramInt)
  {
    this.OooOOOo = paramInt;
  }
  
  public void setStagger(float paramFloat)
  {
    this.OooO = paramFloat;
  }
  
  public void setTransitionFlag(int paramInt)
  {
    this.OooOOo = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionScene.Transition
 * JD-Core Version:    0.7.0.1
 */