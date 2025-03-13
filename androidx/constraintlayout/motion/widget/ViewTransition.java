package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.ConstraintSet.Constraint;
import androidx.constraintlayout.widget.R.id;
import androidx.constraintlayout.widget.R.styleable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class ViewTransition
{
  public int OooO;
  public int OooO00o;
  public int OooO0O0;
  public boolean OooO0OO;
  public int OooO0Oo;
  public KeyFrames OooO0o;
  public int OooO0o0;
  public ConstraintSet.Constraint OooO0oO;
  public int OooO0oo;
  public int OooOO0;
  public String OooOO0O;
  public int OooOO0o;
  public int OooOOO;
  public String OooOOO0;
  public Context OooOOOO;
  public int OooOOOo;
  public int OooOOo;
  public int OooOOo0;
  public int OooOOoo;
  public int OooOo0;
  public int OooOo00;
  public int OooOo0O;
  
  public ViewTransition(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    int i = -1;
    this.OooO0O0 = i;
    this.OooO0OO = false;
    this.OooO0Oo = 0;
    this.OooO0oo = i;
    this.OooO = i;
    this.OooOO0o = 0;
    int j = 0;
    Object localObject1 = null;
    this.OooOOO0 = null;
    this.OooOOO = i;
    this.OooOOOo = i;
    this.OooOOo0 = i;
    this.OooOOo = i;
    this.OooOOoo = i;
    this.OooOo00 = i;
    this.OooOo0 = i;
    this.OooOo0O = i;
    this.OooOOOO = paramContext;
    try
    {
      int k;
      for (j = paramXmlPullParser.getEventType();; k = paramXmlPullParser.next())
      {
        int m = 1;
        if (j == m) {
          break;
        }
        String str = "ViewTransition";
        int n = 3;
        int i1 = 2;
        if (j != i1)
        {
          if (j == n)
          {
            localObject1 = paramXmlPullParser.getName();
            boolean bool = str.equals(localObject1);
            if (!bool) {}
          }
        }
        else
        {
          localObject1 = paramXmlPullParser.getName();
          int i2 = ((String)localObject1).hashCode();
          int i3 = 4;
          switch (i2)
          {
          default: 
            break;
          case 1791837707: 
            str = "CustomAttribute";
            i4 = ((String)localObject1).equals(str);
            if (i4 != 0) {
              i4 = n;
            }
            break;
          case 366511058: 
            str = "CustomMethod";
            i4 = ((String)localObject1).equals(str);
            if (i4 != 0) {
              i4 = i3;
            }
            break;
          case 61998586: 
            i4 = ((String)localObject1).equals(str);
            if (i4 != 0)
            {
              i4 = 0;
              str = null;
            }
            break;
          case -1239391468: 
            str = "KeyFrameSet";
            i4 = ((String)localObject1).equals(str);
            if (i4 != 0) {
              i4 = m;
            }
            break;
          case -1962203927: 
            str = "ConstraintOverride";
            i4 = ((String)localObject1).equals(str);
            if (i4 != 0) {
              i4 = i1;
            }
            break;
          }
          int i4 = i;
          if (i4 != 0)
          {
            if (i4 != m)
            {
              if (i4 != i1)
              {
                if ((i4 != n) && (i4 != i3))
                {
                  Object localObject2 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject2).<init>();
                  str = Debug.getLoc();
                  ((StringBuilder)localObject2).append(str);
                  str = " unknown tag ";
                  ((StringBuilder)localObject2).append(str);
                  ((StringBuilder)localObject2).append((String)localObject1);
                  localObject1 = new java/lang/StringBuilder;
                  ((StringBuilder)localObject1).<init>();
                  localObject2 = ".xml:";
                  ((StringBuilder)localObject1).append((String)localObject2);
                  m = paramXmlPullParser.getLineNumber();
                  ((StringBuilder)localObject1).append(m);
                }
                else
                {
                  localObject1 = this.OooO0oO;
                  localObject1 = ((ConstraintSet.Constraint)localObject1).OooO0oO;
                  ConstraintAttribute.OooO0o(paramContext, paramXmlPullParser, (HashMap)localObject1);
                }
              }
              else
              {
                localObject1 = ConstraintSet.OooOOO0(paramContext, paramXmlPullParser);
                this.OooO0oO = ((ConstraintSet.Constraint)localObject1);
              }
            }
            else
            {
              localObject1 = new androidx/constraintlayout/motion/widget/KeyFrames;
              ((KeyFrames)localObject1).<init>(paramContext, paramXmlPullParser);
              this.OooO0o = ((KeyFrames)localObject1);
            }
          }
          else {
            OooO0oo(paramContext, paramXmlPullParser);
          }
        }
      }
      return;
    }
    catch (IOException paramContext)
    {
      paramContext.printStackTrace();
    }
    catch (XmlPullParserException paramContext)
    {
      paramContext.printStackTrace();
    }
  }
  
  public boolean OooO(int paramInt)
  {
    int i = this.OooO0O0;
    boolean bool = false;
    int j = 1;
    if (i == j)
    {
      if (paramInt == 0) {
        bool = j;
      }
      return bool;
    }
    int k = 2;
    if (i == k)
    {
      if (paramInt == j) {
        bool = j;
      }
      return bool;
    }
    k = 3;
    if ((i == k) && (paramInt == 0)) {
      bool = j;
    }
    return bool;
  }
  
  public void OooO0O0(ViewTransitionController paramViewTransitionController, MotionLayout paramMotionLayout, View paramView)
  {
    Object localObject1 = new androidx/constraintlayout/motion/widget/MotionController;
    ((MotionController)localObject1).<init>(paramView);
    ((MotionController)localObject1).setBothStates(paramView);
    this.OooO0o.OooO00o((MotionController)localObject1);
    int i = paramMotionLayout.getWidth();
    int j = paramMotionLayout.getHeight();
    float f = this.OooO0oo;
    long l = System.nanoTime();
    Object localObject2 = localObject1;
    ((MotionController)localObject1).OooOo00(i, j, f, l);
    localObject2 = new androidx/constraintlayout/motion/widget/ViewTransition$Animate;
    int k = this.OooO0oo;
    int m = this.OooO;
    int n = this.OooO0O0;
    paramMotionLayout = paramMotionLayout.getContext();
    paramMotionLayout = OooO0o0(paramMotionLayout);
    int i1 = this.OooOOOo;
    int i2 = this.OooOOo0;
    Object localObject3 = localObject1;
    localObject1 = paramMotionLayout;
    ((ViewTransition.Animate)localObject2).<init>(paramViewTransitionController, localObject3, k, m, n, paramMotionLayout, i1, i2);
  }
  
  public void OooO0OO(ViewTransitionController paramViewTransitionController, MotionLayout paramMotionLayout, int paramInt, ConstraintSet paramConstraintSet, View... paramVarArgs)
  {
    boolean bool = this.OooO0OO;
    if (bool) {
      return;
    }
    int i = this.OooO0o0;
    int j = 2;
    int k = 0;
    if (i == j)
    {
      View localView = paramVarArgs[0];
      OooO0O0(paramViewTransitionController, paramMotionLayout, localView);
      return;
    }
    int m = 1;
    int n;
    Object localObject1;
    if (i == m)
    {
      paramViewTransitionController = paramMotionLayout.getConstraintSetIds();
      i = 0;
      localMotionScene = null;
      for (;;)
      {
        j = paramViewTransitionController.length;
        if (i >= j) {
          break;
        }
        j = paramViewTransitionController[i];
        if (j != paramInt)
        {
          localConstraintSet = paramMotionLayout.getConstraintSet(j);
          n = paramVarArgs.length;
          int i1 = 0;
          localObject1 = null;
          while (i1 < n)
          {
            int i2 = paramVarArgs[i1].getId();
            Object localObject2 = localConstraintSet.getConstraint(i2);
            Object localObject3 = this.OooO0oO;
            if (localObject3 != null)
            {
              ((ConstraintSet.Constraint)localObject3).OooO0Oo((ConstraintSet.Constraint)localObject2);
              localObject2 = ((ConstraintSet.Constraint)localObject2).OooO0oO;
              localObject3 = this.OooO0oO.OooO0oO;
              ((HashMap)localObject2).putAll((Map)localObject3);
            }
            i1 += 1;
          }
        }
        i += 1;
      }
    }
    paramViewTransitionController = new androidx/constraintlayout/widget/ConstraintSet;
    paramViewTransitionController.<init>();
    paramViewTransitionController.OooOOOo(paramConstraintSet);
    i = paramVarArgs.length;
    j = 0;
    ConstraintSet localConstraintSet = null;
    while (j < i)
    {
      n = paramVarArgs[j].getId();
      Object localObject4 = paramViewTransitionController.getConstraint(n);
      localObject1 = this.OooO0oO;
      if (localObject1 != null)
      {
        ((ConstraintSet.Constraint)localObject1).OooO0Oo((ConstraintSet.Constraint)localObject4);
        localObject4 = ((ConstraintSet.Constraint)localObject4).OooO0oO;
        localObject1 = this.OooO0oO.OooO0oO;
        ((HashMap)localObject4).putAll((Map)localObject1);
      }
      j += 1;
    }
    paramMotionLayout.Oooooo(paramInt, paramViewTransitionController);
    m = R.id.view_transition;
    paramMotionLayout.Oooooo(m, paramConstraintSet);
    m = R.id.view_transition;
    int i3 = -1;
    paramMotionLayout.setState(m, i3, i3);
    paramViewTransitionController = new androidx/constraintlayout/motion/widget/MotionScene$Transition;
    MotionScene localMotionScene = paramMotionLayout.o00OoOoo;
    j = R.id.view_transition;
    paramViewTransitionController.<init>(i3, localMotionScene, j, paramInt);
    paramInt = paramVarArgs.length;
    while (k < paramInt)
    {
      paramConstraintSet = paramVarArgs[k];
      OooOO0(paramViewTransitionController, paramConstraintSet);
      k += 1;
    }
    paramMotionLayout.setTransition(paramViewTransitionController);
    paramViewTransitionController = new androidx/constraintlayout/motion/widget/OooO00o;
    paramViewTransitionController.<init>(this, paramVarArgs);
    paramMotionLayout.OoooOoo(paramViewTransitionController);
  }
  
  public boolean OooO0Oo(View paramView)
  {
    int i = this.OooOOo;
    boolean bool = false;
    int j = 1;
    int k = -1;
    if (i == k) {}
    do
    {
      i = j;
      break;
      localObject = paramView.getTag(i);
    } while (localObject != null);
    i = 0;
    Object localObject = null;
    int m = this.OooOOoo;
    if (m == k) {}
    do
    {
      n = j;
      break;
      paramView = paramView.getTag(m);
    } while (paramView == null);
    int n = 0;
    paramView = null;
    if ((i != 0) && (n != 0)) {
      bool = j;
    }
    return bool;
  }
  
  public Interpolator OooO0o0(Context paramContext)
  {
    int i = this.OooOO0o;
    int j = -2;
    if (i != j)
    {
      int k = -1;
      if (i != k)
      {
        if (i != 0)
        {
          k = 1;
          if (i != k)
          {
            k = 2;
            if (i != k)
            {
              k = 4;
              if (i != k)
              {
                k = 5;
                if (i != k)
                {
                  k = 6;
                  if (i != k) {
                    return null;
                  }
                  paramContext = new android/view/animation/AnticipateInterpolator;
                  paramContext.<init>();
                  return paramContext;
                }
                paramContext = new android/view/animation/OvershootInterpolator;
                paramContext.<init>();
                return paramContext;
              }
              paramContext = new android/view/animation/BounceInterpolator;
              paramContext.<init>();
              return paramContext;
            }
            paramContext = new android/view/animation/DecelerateInterpolator;
            paramContext.<init>();
            return paramContext;
          }
          paramContext = new android/view/animation/AccelerateInterpolator;
          paramContext.<init>();
          return paramContext;
        }
        paramContext = new android/view/animation/AccelerateDecelerateInterpolator;
        paramContext.<init>();
        return paramContext;
      }
      paramContext = Easing.OooO0OO(this.OooOOO0);
      ViewTransition.1 local1 = new androidx/constraintlayout/motion/widget/ViewTransition$1;
      local1.<init>(this, paramContext);
      return local1;
    }
    i = this.OooOOO;
    return AnimationUtils.loadInterpolator(paramContext, i);
  }
  
  public boolean OooO0oO(View paramView)
  {
    if (paramView == null) {
      return false;
    }
    int i = this.OooOO0;
    int k = -1;
    if (i == k)
    {
      localObject = this.OooOO0O;
      if (localObject == null) {
        return false;
      }
    }
    boolean bool1 = OooO0Oo(paramView);
    if (!bool1) {
      return false;
    }
    int j = paramView.getId();
    k = this.OooOO0;
    boolean bool3 = true;
    if (j == k) {
      return bool3;
    }
    Object localObject = this.OooOO0O;
    if (localObject == null) {
      return false;
    }
    localObject = paramView.getLayoutParams();
    boolean bool2 = localObject instanceof ConstraintLayout.LayoutParams;
    if (bool2)
    {
      paramView = ((ConstraintLayout.LayoutParams)paramView.getLayoutParams()).Ooooo0o;
      if (paramView != null)
      {
        localObject = this.OooOO0O;
        boolean bool4 = paramView.matches((String)localObject);
        if (bool4) {
          return bool3;
        }
      }
    }
    return false;
  }
  
  public final void OooO0oo(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    paramXmlPullParser = Xml.asAttributeSet(paramXmlPullParser);
    int[] arrayOfInt = R.styleable.ViewTransition;
    paramContext = paramContext.obtainStyledAttributes(paramXmlPullParser, arrayOfInt);
    int i = paramContext.getIndexCount();
    int j = 0;
    arrayOfInt = null;
    while (j < i)
    {
      int k = paramContext.getIndex(j);
      int i1 = R.styleable.ViewTransition_android_id;
      if (k == i1)
      {
        i1 = this.OooO00o;
        k = paramContext.getResourceId(k, i1);
        this.OooO00o = k;
      }
      else
      {
        i1 = R.styleable.ViewTransition_motionTarget;
        int i5 = 3;
        int i6 = -1;
        int i2;
        Object localObject;
        if (k == i1)
        {
          boolean bool1 = MotionLayout.o00oo0O;
          if (bool1)
          {
            i2 = this.OooOO0;
            i2 = paramContext.getResourceId(k, i2);
            this.OooOO0 = i2;
            if (i2 != i6) {
              break label815;
            }
          }
          else
          {
            localObject = paramContext.peekValue(k);
            i2 = ((TypedValue)localObject).type;
            if (i2 != i5) {
              break label178;
            }
          }
          String str1 = paramContext.getString(k);
          this.OooOO0O = str1;
          break label815;
          label178:
          i2 = this.OooOO0;
          k = paramContext.getResourceId(k, i2);
          this.OooOO0 = k;
        }
        else
        {
          i2 = R.styleable.ViewTransition_onStateTransition;
          if (k == i2)
          {
            i2 = this.OooO0O0;
            k = paramContext.getInt(k, i2);
            this.OooO0O0 = k;
          }
          else
          {
            i2 = R.styleable.ViewTransition_transitionDisable;
            int m;
            if (k == i2)
            {
              boolean bool2 = this.OooO0OO;
              m = paramContext.getBoolean(k, bool2);
              this.OooO0OO = m;
            }
            else
            {
              int i3 = R.styleable.ViewTransition_pathMotionArc;
              int i4;
              int n;
              if (m == i3)
              {
                i4 = this.OooO0Oo;
                n = paramContext.getInt(m, i4);
                this.OooO0Oo = n;
              }
              else
              {
                i4 = R.styleable.ViewTransition_duration;
                if (n == i4)
                {
                  i4 = this.OooO0oo;
                  n = paramContext.getInt(n, i4);
                  this.OooO0oo = n;
                }
                else
                {
                  i4 = R.styleable.ViewTransition_upDuration;
                  if (n == i4)
                  {
                    i4 = this.OooO;
                    n = paramContext.getInt(n, i4);
                    this.OooO = n;
                  }
                  else
                  {
                    i4 = R.styleable.ViewTransition_viewTransitionMode;
                    if (n == i4)
                    {
                      i4 = this.OooO0o0;
                      n = paramContext.getInt(n, i4);
                      this.OooO0o0 = n;
                    }
                    else
                    {
                      i4 = R.styleable.ViewTransition_motionInterpolator;
                      if (n == i4)
                      {
                        localObject = paramContext.peekValue(n);
                        i4 = ((TypedValue)localObject).type;
                        int i7 = -2;
                        int i8 = 1;
                        if (i4 == i8)
                        {
                          n = paramContext.getResourceId(n, i6);
                          this.OooOOO = n;
                          if (n == i6) {}
                        }
                        else
                        {
                          for (;;)
                          {
                            this.OooOO0o = i7;
                            break label815;
                            if (i4 != i5) {
                              break label571;
                            }
                            localObject = paramContext.getString(n);
                            this.OooOOO0 = ((String)localObject);
                            if (localObject == null) {
                              break;
                            }
                            String str2 = "/";
                            i4 = ((String)localObject).indexOf(str2);
                            if (i4 <= 0) {
                              break;
                            }
                            n = paramContext.getResourceId(n, i6);
                            this.OooOOO = n;
                          }
                          this.OooOO0o = i6;
                          break label815;
                          label571:
                          i4 = this.OooOO0o;
                          n = paramContext.getInteger(n, i4);
                          this.OooOO0o = n;
                        }
                      }
                      else
                      {
                        i4 = R.styleable.ViewTransition_setsTag;
                        if (n == i4)
                        {
                          i4 = this.OooOOOo;
                          n = paramContext.getResourceId(n, i4);
                          this.OooOOOo = n;
                        }
                        else
                        {
                          i4 = R.styleable.ViewTransition_clearsTag;
                          if (n == i4)
                          {
                            i4 = this.OooOOo0;
                            n = paramContext.getResourceId(n, i4);
                            this.OooOOo0 = n;
                          }
                          else
                          {
                            i4 = R.styleable.ViewTransition_ifTagSet;
                            if (n == i4)
                            {
                              i4 = this.OooOOo;
                              n = paramContext.getResourceId(n, i4);
                              this.OooOOo = n;
                            }
                            else
                            {
                              i4 = R.styleable.ViewTransition_ifTagNotSet;
                              if (n == i4)
                              {
                                i4 = this.OooOOoo;
                                n = paramContext.getResourceId(n, i4);
                                this.OooOOoo = n;
                              }
                              else
                              {
                                i4 = R.styleable.ViewTransition_SharedValueId;
                                if (n == i4)
                                {
                                  i4 = this.OooOo0;
                                  n = paramContext.getResourceId(n, i4);
                                  this.OooOo0 = n;
                                }
                                else
                                {
                                  i4 = R.styleable.ViewTransition_SharedValue;
                                  if (n == i4)
                                  {
                                    i4 = this.OooOo00;
                                    n = paramContext.getInteger(n, i4);
                                    this.OooOo00 = n;
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
      label815:
      j += 1;
    }
    paramContext.recycle();
  }
  
  public final void OooOO0(MotionScene.Transition paramTransition, View paramView)
  {
    int i = this.OooO0oo;
    int j = -1;
    if (i != j) {
      paramTransition.setDuration(i);
    }
    i = this.OooO0Oo;
    paramTransition.setPathMotionArc(i);
    i = this.OooOO0o;
    Object localObject1 = this.OooOOO0;
    int k = this.OooOOO;
    paramTransition.OooOo(i, (String)localObject1, k);
    int m = paramView.getId();
    Object localObject2 = this.OooO0o;
    if (localObject2 != null)
    {
      localObject2 = ((KeyFrames)localObject2).getKeyFramesForView(j);
      KeyFrames localKeyFrames = new androidx/constraintlayout/motion/widget/KeyFrames;
      localKeyFrames.<init>();
      localObject2 = ((ArrayList)localObject2).iterator();
      for (;;)
      {
        boolean bool = ((Iterator)localObject2).hasNext();
        if (!bool) {
          break;
        }
        localObject1 = ((Key)((Iterator)localObject2).next()).OooO0O0().OooO0oO(m);
        localKeyFrames.OooO0OO((Key)localObject1);
      }
      paramTransition.OooOo00(localKeyFrames);
    }
  }
  
  public int getId()
  {
    return this.OooO00o;
  }
  
  public int getSharedValue()
  {
    return this.OooOo00;
  }
  
  public int getSharedValueCurrent()
  {
    return this.OooOo0O;
  }
  
  public int getSharedValueID()
  {
    return this.OooOo0;
  }
  
  public int getStateTransition()
  {
    return this.OooO0O0;
  }
  
  public boolean isEnabled()
  {
    return this.OooO0OO ^ true;
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    paramBoolean ^= true;
    this.OooO0OO = paramBoolean;
  }
  
  public void setId(int paramInt)
  {
    this.OooO00o = paramInt;
  }
  
  public void setSharedValue(int paramInt)
  {
    this.OooOo00 = paramInt;
  }
  
  public void setSharedValueCurrent(int paramInt)
  {
    this.OooOo0O = paramInt;
  }
  
  public void setSharedValueID(int paramInt)
  {
    this.OooOo0 = paramInt;
  }
  
  public void setStateTransition(int paramInt)
  {
    this.OooO0O0 = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    localStringBuilder.append("ViewTransition(");
    Object localObject = this.OooOOOO;
    int i = this.OooO00o;
    localObject = Debug.OooO00o((Context)localObject, i);
    localStringBuilder.append((String)localObject);
    localStringBuilder.append(")");
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.ViewTransition
 * JD-Core Version:    0.7.0.1
 */