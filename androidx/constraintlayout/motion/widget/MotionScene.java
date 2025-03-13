package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R.id;
import androidx.constraintlayout.widget.R.styleable;
import androidx.constraintlayout.widget.StateSet;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class MotionScene
{
  public HashMap OooO;
  public final MotionLayout OooO00o;
  public StateSet OooO0O0 = null;
  public MotionScene.Transition OooO0OO = null;
  public boolean OooO0Oo = false;
  public MotionScene.Transition OooO0o;
  public ArrayList OooO0o0;
  public ArrayList OooO0oO;
  public SparseArray OooO0oo;
  public SparseIntArray OooOO0;
  public boolean OooOO0O;
  public int OooOO0o;
  public MotionEvent OooOOO;
  public int OooOOO0;
  public boolean OooOOOO;
  public boolean OooOOOo;
  public boolean OooOOo;
  public MotionLayout.MotionTracker OooOOo0;
  public final ViewTransitionController OooOOoo;
  public float OooOo0;
  public float OooOo00;
  
  public MotionScene(Context paramContext, MotionLayout paramMotionLayout, int paramInt)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.OooO0o0 = localArrayList;
    this.OooO0o = null;
    Object localObject = new java/util/ArrayList;
    ((ArrayList)localObject).<init>();
    this.OooO0oO = ((ArrayList)localObject);
    localObject = new android/util/SparseArray;
    ((SparseArray)localObject).<init>();
    this.OooO0oo = ((SparseArray)localObject);
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    this.OooO = ((HashMap)localObject);
    localObject = new android/util/SparseIntArray;
    ((SparseIntArray)localObject).<init>();
    this.OooOO0 = ((SparseIntArray)localObject);
    this.OooOO0O = false;
    this.OooOO0o = 400;
    this.OooOOO0 = 0;
    this.OooOOOO = false;
    this.OooOOOo = false;
    this.OooO00o = paramMotionLayout;
    localObject = new androidx/constraintlayout/motion/widget/ViewTransitionController;
    ((ViewTransitionController)localObject).<init>(paramMotionLayout);
    this.OooOOoo = ((ViewTransitionController)localObject);
    OooOOOo(paramContext, paramInt);
    paramContext = this.OooO0oo;
    int i = R.id.motion_base;
    ConstraintSet localConstraintSet = new androidx/constraintlayout/widget/ConstraintSet;
    localConstraintSet.<init>();
    paramContext.put(i, localConstraintSet);
    paramContext = this.OooO;
    paramMotionLayout = Integer.valueOf(R.id.motion_base);
    paramContext.put("motion_base", paramMotionLayout);
  }
  
  public static String OooOoo(String paramString)
  {
    if (paramString == null) {
      return "";
    }
    int i = paramString.indexOf('/');
    if (i < 0) {
      return paramString;
    }
    i += 1;
    return paramString.substring(i);
  }
  
  private int getRealID(int paramInt)
  {
    StateSet localStateSet = this.OooO0O0;
    if (localStateSet != null)
    {
      int i = -1;
      int j = localStateSet.OooO0OO(paramInt, i, i);
      if (j != i) {
        return j;
      }
    }
    return paramInt;
  }
  
  private boolean isProcessingTouch()
  {
    MotionLayout.MotionTracker localMotionTracker = this.OooOOo0;
    boolean bool;
    if (localMotionTracker != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localMotionTracker = null;
    }
    return bool;
  }
  
  public MotionScene.Transition OooO(int paramInt, float paramFloat1, float paramFloat2, MotionEvent paramMotionEvent)
  {
    MotionScene localMotionScene = this;
    int i = paramInt;
    float f1 = paramFloat1;
    float f2 = paramFloat2;
    int j = -1;
    if (paramInt != j)
    {
      Object localObject1 = getTransitionsWithState(paramInt);
      RectF localRectF = new android/graphics/RectF;
      localRectF.<init>();
      localObject1 = ((List)localObject1).iterator();
      float f3 = 0.0F;
      Object localObject2 = null;
      for (;;)
      {
        boolean bool1 = ((Iterator)localObject1).hasNext();
        if (!bool1) {
          break;
        }
        MotionScene.Transition localTransition = (MotionScene.Transition)((Iterator)localObject1).next();
        boolean bool2 = MotionScene.Transition.OooOOo0(localTransition);
        if (!bool2)
        {
          Object localObject3 = MotionScene.Transition.OooOO0o(localTransition);
          if (localObject3 != null)
          {
            localObject3 = MotionScene.Transition.OooOO0o(localTransition);
            boolean bool3 = localMotionScene.OooOOo;
            ((TouchResponse)localObject3).setRTL(bool3);
            localObject3 = MotionScene.Transition.OooOO0o(localTransition);
            Object localObject4 = localMotionScene.OooO00o;
            localObject3 = ((TouchResponse)localObject3).OooO0o((ViewGroup)localObject4, localRectF);
            float f4;
            float f5;
            if ((localObject3 != null) && (paramMotionEvent != null))
            {
              f4 = paramMotionEvent.getX();
              f5 = paramMotionEvent.getY();
              bool2 = ((RectF)localObject3).contains(f4, f5);
              if (!bool2) {}
            }
            else
            {
              localObject3 = MotionScene.Transition.OooOO0o(localTransition);
              localObject4 = localMotionScene.OooO00o;
              localObject3 = ((TouchResponse)localObject3).OooO0Oo((ViewGroup)localObject4, localRectF);
              if ((localObject3 != null) && (paramMotionEvent != null))
              {
                f4 = paramMotionEvent.getX();
                f5 = paramMotionEvent.getY();
                bool2 = ((RectF)localObject3).contains(f4, f5);
                if (!bool2) {}
              }
              else
              {
                localObject3 = MotionScene.Transition.OooOO0o(localTransition);
                float f6 = ((TouchResponse)localObject3).OooO00o(f1, f2);
                localObject4 = MotionScene.Transition.OooOO0o(localTransition);
                bool3 = ((TouchResponse)localObject4).OooOO0o;
                if ((bool3) && (paramMotionEvent != null))
                {
                  f6 = paramMotionEvent.getX();
                  localObject4 = MotionScene.Transition.OooOO0o(localTransition);
                  f4 = ((TouchResponse)localObject4).OooO;
                  f6 -= f4;
                  f4 = paramMotionEvent.getY();
                  TouchResponse localTouchResponse = MotionScene.Transition.OooOO0o(localTransition);
                  f5 = localTouchResponse.OooOO0;
                  f4 -= f5;
                  f5 = f1 + f6;
                  float f7 = f2 + f4;
                  double d1 = f7;
                  double d2 = f5;
                  double d3 = Math.atan2(d1, d2);
                  double d4 = f6;
                  double d5 = f4;
                  d5 = Math.atan2(d4, d5);
                  d3 -= d5;
                  f6 = (float)d3;
                  k = 1092616192;
                  f4 = 10.0F;
                  f6 *= f4;
                }
                int k = MotionScene.Transition.OooO00o(localTransition);
                if (k == i)
                {
                  k = -1082130432;
                  f4 = -1.0F;
                }
                else
                {
                  k = 1066192077;
                  f4 = 1.1F;
                }
                f6 *= f4;
                boolean bool4 = f6 < f3;
                if (bool4)
                {
                  localObject2 = localTransition;
                  f3 = f6;
                }
              }
            }
          }
        }
      }
      return localObject2;
    }
    return this.OooO0OO;
  }
  
  public void OooO0o(MotionLayout paramMotionLayout, int paramInt)
  {
    Iterator localIterator = this.OooO0o0.iterator();
    boolean bool1;
    int i;
    do
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (MotionScene.Transition)localIterator.next();
      localObject2 = MotionScene.Transition.OooOOOo((MotionScene.Transition)localObject1);
      i = ((ArrayList)localObject2).size();
    } while (i <= 0);
    Object localObject1 = MotionScene.Transition.OooOOOo((MotionScene.Transition)localObject1).iterator();
    for (;;)
    {
      boolean bool2 = ((Iterator)localObject1).hasNext();
      if (!bool2) {
        break;
      }
      localObject2 = (MotionScene.Transition.TransitionOnClick)((Iterator)localObject1).next();
      ((MotionScene.Transition.TransitionOnClick)localObject2).OooO0OO(paramMotionLayout);
    }
    localIterator = this.OooO0oO.iterator();
    int j;
    do
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (MotionScene.Transition)localIterator.next();
      localObject2 = MotionScene.Transition.OooOOOo((MotionScene.Transition)localObject1);
      j = ((ArrayList)localObject2).size();
    } while (j <= 0);
    localObject1 = MotionScene.Transition.OooOOOo((MotionScene.Transition)localObject1).iterator();
    for (;;)
    {
      boolean bool3 = ((Iterator)localObject1).hasNext();
      if (!bool3) {
        break;
      }
      localObject2 = (MotionScene.Transition.TransitionOnClick)((Iterator)localObject1).next();
      ((MotionScene.Transition.TransitionOnClick)localObject2).OooO0OO(paramMotionLayout);
    }
    localIterator = this.OooO0o0.iterator();
    int k;
    do
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (MotionScene.Transition)localIterator.next();
      localObject2 = MotionScene.Transition.OooOOOo((MotionScene.Transition)localObject1);
      k = ((ArrayList)localObject2).size();
    } while (k <= 0);
    Object localObject2 = MotionScene.Transition.OooOOOo((MotionScene.Transition)localObject1).iterator();
    boolean bool4;
    MotionScene.Transition.TransitionOnClick localTransitionOnClick;
    for (;;)
    {
      bool4 = ((Iterator)localObject2).hasNext();
      if (!bool4) {
        break;
      }
      localTransitionOnClick = (MotionScene.Transition.TransitionOnClick)((Iterator)localObject2).next();
      localTransitionOnClick.OooO00o(paramMotionLayout, paramInt, (MotionScene.Transition)localObject1);
    }
    localIterator = this.OooO0oO.iterator();
    do
    {
      bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      localObject1 = (MotionScene.Transition)localIterator.next();
      localObject2 = MotionScene.Transition.OooOOOo((MotionScene.Transition)localObject1);
      k = ((ArrayList)localObject2).size();
    } while (k <= 0);
    localObject2 = MotionScene.Transition.OooOOOo((MotionScene.Transition)localObject1).iterator();
    for (;;)
    {
      bool4 = ((Iterator)localObject2).hasNext();
      if (!bool4) {
        break;
      }
      localTransitionOnClick = (MotionScene.Transition.TransitionOnClick)((Iterator)localObject2).next();
      localTransitionOnClick.OooO00o(paramMotionLayout, paramInt, (MotionScene.Transition)localObject1);
    }
  }
  
  public boolean OooO0oO(int paramInt, MotionController paramMotionController)
  {
    return this.OooOOoo.OooO0Oo(paramInt, paramMotionController);
  }
  
  public boolean OooO0oo(MotionLayout paramMotionLayout, int paramInt)
  {
    boolean bool1 = isProcessingTouch();
    if (bool1) {
      return false;
    }
    bool1 = this.OooO0Oo;
    if (bool1) {
      return false;
    }
    Object localObject = this.OooO0o0.iterator();
    MotionScene.Transition localTransition1;
    int m;
    int k;
    int n;
    float f;
    do
    {
      do
      {
        boolean bool3;
        do
        {
          int j;
          do
          {
            boolean bool2 = ((Iterator)localObject).hasNext();
            if (!bool2) {
              break;
            }
            localTransition1 = (MotionScene.Transition)((Iterator)localObject).next();
            j = MotionScene.Transition.OooOOo(localTransition1);
          } while (j == 0);
          MotionScene.Transition localTransition2 = this.OooO0OO;
          m = 2;
          if (localTransition2 != localTransition1) {
            break;
          }
          bool3 = localTransition2.isTransitionFlag(m);
        } while (bool3);
        k = MotionScene.Transition.OooO0OO(localTransition1);
        n = 1;
        if (paramInt == k)
        {
          k = MotionScene.Transition.OooOOo(localTransition1);
          int i1 = 4;
          if (k != i1)
          {
            k = MotionScene.Transition.OooOOo(localTransition1);
            if (k != m) {}
          }
          else
          {
            localTransitionState = MotionLayout.TransitionState.o00Ooo0O;
            paramMotionLayout.setState(localTransitionState);
            paramMotionLayout.setTransition(localTransition1);
            i = MotionScene.Transition.OooOOo(localTransition1);
            if (i == i1)
            {
              paramMotionLayout.OoooOoO();
              localTransitionState = MotionLayout.TransitionState.o00Ooo00;
              paramMotionLayout.setState(localTransitionState);
              localTransitionState = MotionLayout.TransitionState.o00Ooo0;
              paramMotionLayout.setState(localTransitionState);
            }
            else
            {
              i = 1065353216;
              f = 1.0F;
              paramMotionLayout.setProgress(f);
              paramMotionLayout.Oooo0(n);
              localObject = MotionLayout.TransitionState.o00Ooo00;
              paramMotionLayout.setState((MotionLayout.TransitionState)localObject);
              localObject = MotionLayout.TransitionState.o00Ooo0;
              paramMotionLayout.setState((MotionLayout.TransitionState)localObject);
              paramMotionLayout.setState(localTransitionState);
              paramMotionLayout.OoooO0O();
            }
            return n;
          }
        }
        k = MotionScene.Transition.OooO00o(localTransition1);
      } while (paramInt != k);
      k = MotionScene.Transition.OooOOo(localTransition1);
      m = 3;
      if (k == m) {
        break;
      }
      k = MotionScene.Transition.OooOOo(localTransition1);
    } while (k != n);
    MotionLayout.TransitionState localTransitionState = MotionLayout.TransitionState.o00Ooo0O;
    paramMotionLayout.setState(localTransitionState);
    paramMotionLayout.setTransition(localTransition1);
    int i = MotionScene.Transition.OooOOo(localTransition1);
    if (i == m)
    {
      paramMotionLayout.Ooooo00();
      localTransitionState = MotionLayout.TransitionState.o00Ooo00;
      paramMotionLayout.setState(localTransitionState);
      localTransitionState = MotionLayout.TransitionState.o00Ooo0;
      paramMotionLayout.setState(localTransitionState);
    }
    else
    {
      i = 0;
      f = 0.0F;
      paramMotionLayout.setProgress(0.0F);
      paramMotionLayout.Oooo0(n);
      localObject = MotionLayout.TransitionState.o00Ooo00;
      paramMotionLayout.setState((MotionLayout.TransitionState)localObject);
      localObject = MotionLayout.TransitionState.o00Ooo0;
      paramMotionLayout.setState((MotionLayout.TransitionState)localObject);
      paramMotionLayout.setState(localTransitionState);
      paramMotionLayout.OoooO0O();
    }
    return n;
    return false;
  }
  
  public int OooOO0()
  {
    MotionScene.Transition localTransition = this.OooO0OO;
    int i;
    if (localTransition != null) {
      i = MotionScene.Transition.OooOO0O(localTransition);
    } else {
      i = -1;
    }
    return i;
  }
  
  public ConstraintSet OooOO0O(int paramInt1, int paramInt2, int paramInt3)
  {
    boolean bool = this.OooOO0O;
    if (bool)
    {
      localObject1 = System.out;
      Object localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("id ");
      ((StringBuilder)localObject2).append(paramInt1);
      localObject2 = ((StringBuilder)localObject2).toString();
      ((PrintStream)localObject1).println((String)localObject2);
      localObject1 = System.out;
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      ((StringBuilder)localObject2).append("size ");
      SparseArray localSparseArray = this.OooO0oo;
      int i = localSparseArray.size();
      ((StringBuilder)localObject2).append(i);
      localObject2 = ((StringBuilder)localObject2).toString();
      ((PrintStream)localObject1).println((String)localObject2);
    }
    Object localObject1 = this.OooO0O0;
    if (localObject1 != null)
    {
      paramInt2 = ((StateSet)localObject1).OooO0OO(paramInt1, paramInt2, paramInt3);
      paramInt3 = -1;
      if (paramInt2 != paramInt3) {
        paramInt1 = paramInt2;
      }
    }
    Object localObject3 = this.OooO0oo.get(paramInt1);
    if (localObject3 == null)
    {
      localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      ((StringBuilder)localObject3).append("Warning could not find ConstraintSet id/");
      Context localContext = this.OooO00o.getContext();
      localObject4 = Debug.OooO00o(localContext, paramInt1);
      ((StringBuilder)localObject3).append((String)localObject4);
      ((StringBuilder)localObject3).append(" In MotionScene");
      localObject4 = this.OooO0oo;
      localObject3 = null;
      paramInt2 = ((SparseArray)localObject4).keyAt(0);
    }
    for (Object localObject4 = ((SparseArray)localObject4).get(paramInt2);; localObject4 = ((SparseArray)localObject3).get(paramInt1))
    {
      return (ConstraintSet)localObject4;
      localObject3 = this.OooO0oo;
    }
  }
  
  public final int OooOO0o(Context paramContext, String paramString)
  {
    Object localObject1 = "/";
    boolean bool1 = paramString.contains((CharSequence)localObject1);
    int k = 1;
    int m = -1;
    int n;
    if (bool1)
    {
      int i = paramString.indexOf('/') + k;
      localObject1 = paramString.substring(i);
      Object localObject2 = paramContext.getResources();
      String str = "id";
      paramContext = paramContext.getPackageName();
      n = ((Resources)localObject2).getIdentifier((String)localObject1, str, paramContext);
      boolean bool2 = this.OooOO0O;
      if (bool2)
      {
        localObject1 = System.out;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        str = "id getMap res = ";
        ((StringBuilder)localObject2).append(str);
        ((StringBuilder)localObject2).append(n);
        localObject2 = ((StringBuilder)localObject2).toString();
        ((PrintStream)localObject1).println((String)localObject2);
      }
    }
    else
    {
      n = m;
    }
    if (n == m)
    {
      int j = paramString.length();
      if (j > k)
      {
        paramContext = paramString.substring(k);
        n = Integer.parseInt(paramContext);
      }
    }
    return n;
  }
  
  public float OooOOO(float paramFloat1, float paramFloat2)
  {
    Object localObject = this.OooO0OO;
    if (localObject != null)
    {
      localObject = MotionScene.Transition.OooOO0o((MotionScene.Transition)localObject);
      if (localObject != null) {
        return MotionScene.Transition.OooOO0o(this.OooO0OO).OooO0o0(paramFloat1, paramFloat2);
      }
    }
    return 0.0F;
  }
  
  public void OooOOO0(MotionController paramMotionController)
  {
    Object localObject = this.OooO0OO;
    boolean bool;
    KeyFrames localKeyFrames;
    if (localObject == null)
    {
      localObject = this.OooO0o;
      if (localObject != null)
      {
        localObject = MotionScene.Transition.OooO0o((MotionScene.Transition)localObject).iterator();
        for (;;)
        {
          bool = ((Iterator)localObject).hasNext();
          if (!bool) {
            break;
          }
          localKeyFrames = (KeyFrames)((Iterator)localObject).next();
          localKeyFrames.OooO0O0(paramMotionController);
        }
      }
      return;
    }
    localObject = MotionScene.Transition.OooO0o((MotionScene.Transition)localObject).iterator();
    for (;;)
    {
      bool = ((Iterator)localObject).hasNext();
      if (!bool) {
        break;
      }
      localKeyFrames = (KeyFrames)((Iterator)localObject).next();
      localKeyFrames.OooO0O0(paramMotionController);
    }
  }
  
  public final boolean OooOOOO(int paramInt)
  {
    SparseIntArray localSparseIntArray1 = this.OooOO0;
    int i = localSparseIntArray1.get(paramInt);
    SparseIntArray localSparseIntArray2 = this.OooOO0;
    int k;
    for (int j = localSparseIntArray2.size(); i > 0; j = k)
    {
      boolean bool = true;
      if (i == paramInt) {
        return bool;
      }
      k = j + -1;
      if (j < 0) {
        return bool;
      }
      localSparseIntArray2 = this.OooOO0;
      i = localSparseIntArray2.get(i);
    }
    return false;
  }
  
  public final void OooOOOo(Context paramContext, int paramInt)
  {
    XmlResourceParser localXmlResourceParser = paramContext.getResources().getXml(paramInt);
    try
    {
      int i = localXmlResourceParser.getEventType();
      MotionScene.Transition localTransition = null;
      for (;;)
      {
        int k = 1;
        if (i == k) {
          break;
        }
        if (i != 0)
        {
          int m = 2;
          if (i == m)
          {
            Object localObject1 = localXmlResourceParser.getName();
            boolean bool3 = this.OooOO0O;
            Object localObject2;
            if (bool3)
            {
              localObject2 = System.out;
              Object localObject3 = new java/lang/StringBuilder;
              ((StringBuilder)localObject3).<init>();
              String str = "parsing = ";
              ((StringBuilder)localObject3).append(str);
              ((StringBuilder)localObject3).append((String)localObject1);
              localObject3 = ((StringBuilder)localObject3).toString();
              ((PrintStream)localObject2).println((String)localObject3);
            }
            int n = ((String)localObject1).hashCode();
            int i1 = -1;
            Object localObject4;
            boolean bool1;
            Object localObject5;
            switch (n)
            {
            default: 
              break;
            case 1942574248: 
              localObject4 = "include";
              bool1 = ((String)localObject1).equals(localObject4);
              if (bool1) {
                k = 6;
              }
              break;
            case 1382829617: 
              localObject4 = "StateSet";
              bool1 = ((String)localObject1).equals(localObject4);
              if (bool1) {
                k = 4;
              }
              break;
            case 793277014: 
              localObject4 = "MotionScene";
              bool1 = ((String)localObject1).equals(localObject4);
              if (bool1)
              {
                k = 0;
                localObject4 = null;
              }
              break;
            case 327855227: 
              localObject4 = "OnSwipe";
              bool1 = ((String)localObject1).equals(localObject4);
              if (bool1) {
                k = m;
              }
              break;
            case 312750793: 
              localObject4 = "OnClick";
              bool1 = ((String)localObject1).equals(localObject4);
              if (bool1) {
                k = 3;
              }
              break;
            case 269306229: 
              localObject5 = "Transition";
              bool1 = ((String)localObject1).equals(localObject5);
              if (!bool1) {
                break;
              }
              break;
            case 61998586: 
              localObject4 = "ViewTransition";
              bool1 = ((String)localObject1).equals(localObject4);
              if (bool1) {
                k = 9;
              }
              break;
            case -687739768: 
              localObject4 = "Include";
              bool1 = ((String)localObject1).equals(localObject4);
              if (bool1) {
                k = 7;
              }
              break;
            case -1239391468: 
              localObject4 = "KeyFrameSet";
              bool1 = ((String)localObject1).equals(localObject4);
              if (bool1) {
                k = 8;
              }
              break;
            case -1349929691: 
              localObject4 = "ConstraintSet";
              bool1 = ((String)localObject1).equals(localObject4);
              if (bool1) {
                k = 5;
              }
              break;
            }
            k = i1;
            switch (k)
            {
            default: 
              break;
            case 9: 
              localObject1 = new androidx/constraintlayout/motion/widget/ViewTransition;
              ((ViewTransition)localObject1).<init>(paramContext, localXmlResourceParser);
              localObject4 = this.OooOOoo;
              ((ViewTransitionController)localObject4).OooO00o((ViewTransition)localObject1);
              break;
            case 8: 
              localObject1 = new androidx/constraintlayout/motion/widget/KeyFrames;
              ((KeyFrames)localObject1).<init>(paramContext, localXmlResourceParser);
              if (localTransition == null) {
                break;
              }
              localObject4 = MotionScene.Transition.OooO0o(localTransition);
              ((ArrayList)localObject4).add(localObject1);
              break;
            case 6: 
            case 7: 
              OooOo0(paramContext, localXmlResourceParser);
              break;
            case 5: 
              OooOOoo(paramContext, localXmlResourceParser);
              break;
            case 4: 
              localObject1 = new androidx/constraintlayout/widget/StateSet;
              ((StateSet)localObject1).<init>(paramContext, localXmlResourceParser);
              this.OooO0O0 = ((StateSet)localObject1);
              break;
            case 3: 
              if (localTransition == null) {
                break;
              }
              localTransition.OooOo0(paramContext, localXmlResourceParser);
              break;
            case 2: 
              if (localTransition == null)
              {
                localObject1 = paramContext.getResources();
                localObject1 = ((Resources)localObject1).getResourceEntryName(paramInt);
                k = localXmlResourceParser.getLineNumber();
                localObject5 = new java/lang/StringBuilder;
                ((StringBuilder)localObject5).<init>();
                localObject2 = " OnSwipe (";
                ((StringBuilder)localObject5).append((String)localObject2);
                ((StringBuilder)localObject5).append((String)localObject1);
                localObject1 = ".xml:";
                ((StringBuilder)localObject5).append((String)localObject1);
                ((StringBuilder)localObject5).append(k);
                localObject1 = ")";
                ((StringBuilder)localObject5).append((String)localObject1);
              }
              if (localTransition == null) {
                break;
              }
              localObject1 = new androidx/constraintlayout/motion/widget/TouchResponse;
              localObject4 = this.OooO00o;
              ((TouchResponse)localObject1).<init>(paramContext, (MotionLayout)localObject4, localXmlResourceParser);
              MotionScene.Transition.OooOOO(localTransition, (TouchResponse)localObject1);
              break;
            case 1: 
              localObject1 = this.OooO0o0;
              localTransition = new androidx/constraintlayout/motion/widget/MotionScene$Transition;
              localTransition.<init>(this, paramContext, localXmlResourceParser);
              ((ArrayList)localObject1).add(localTransition);
              localObject1 = this.OooO0OO;
              if (localObject1 == null)
              {
                bool1 = MotionScene.Transition.OooO0o0(localTransition);
                if (!bool1)
                {
                  this.OooO0OO = localTransition;
                  localObject1 = MotionScene.Transition.OooOO0o(localTransition);
                  if (localObject1 != null)
                  {
                    localObject1 = this.OooO0OO;
                    localObject1 = MotionScene.Transition.OooOO0o((MotionScene.Transition)localObject1);
                    boolean bool2 = this.OooOOo;
                    ((TouchResponse)localObject1).setRTL(bool2);
                  }
                }
              }
              bool1 = MotionScene.Transition.OooO0o0(localTransition);
              if (!bool1) {
                break;
              }
              j = MotionScene.Transition.OooO00o(localTransition);
              if (j == i1)
              {
                this.OooO0o = localTransition;
              }
              else
              {
                localObject1 = this.OooO0oO;
                ((ArrayList)localObject1).add(localTransition);
              }
              localObject1 = this.OooO0o0;
              ((ArrayList)localObject1).remove(localTransition);
              break;
            case 0: 
              OooOo0O(paramContext, localXmlResourceParser);
              break;
            }
          }
        }
        else
        {
          localXmlResourceParser.getName();
        }
        int j = localXmlResourceParser.next();
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
  
  public String OooOOo(int paramInt)
  {
    Iterator localIterator = this.OooO.entrySet().iterator();
    Map.Entry localEntry;
    int i;
    do
    {
      Integer localInteger;
      do
      {
        boolean bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localEntry = (Map.Entry)localIterator.next();
        localInteger = (Integer)localEntry.getValue();
      } while (localInteger == null);
      i = localInteger.intValue();
    } while (i != paramInt);
    return (String)localEntry.getKey();
    return null;
  }
  
  public int OooOOo0(String paramString)
  {
    HashMap localHashMap = this.OooO;
    paramString = (Integer)localHashMap.get(paramString);
    if (paramString == null) {
      return 0;
    }
    return paramString.intValue();
  }
  
  public final int OooOOoo(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    ConstraintSet localConstraintSet = new androidx/constraintlayout/widget/ConstraintSet;
    localConstraintSet.<init>();
    int i = 0;
    MotionLayout localMotionLayout = null;
    localConstraintSet.setForceId(false);
    int j = paramXmlPullParser.getAttributeCount();
    int k = -1;
    int m = 0;
    int n = k;
    int i1 = k;
    int i2;
    for (;;)
    {
      i2 = 1;
      if (m >= j) {
        break;
      }
      String str1 = paramXmlPullParser.getAttributeName(m);
      Object localObject1 = paramXmlPullParser.getAttributeValue(m);
      boolean bool1 = this.OooOO0O;
      Object localObject2;
      if (bool1)
      {
        localObject2 = System.out;
        Object localObject3 = new java/lang/StringBuilder;
        ((StringBuilder)localObject3).<init>();
        String str2 = "id string = ";
        ((StringBuilder)localObject3).append(str2);
        ((StringBuilder)localObject3).append((String)localObject1);
        localObject3 = ((StringBuilder)localObject3).toString();
        ((PrintStream)localObject2).println((String)localObject3);
      }
      str1.hashCode();
      int i3 = str1.hashCode();
      int i4 = 2;
      switch (i3)
      {
      }
      do
      {
        do
        {
          do
          {
            int i5 = k;
            break;
            localObject2 = "id";
            bool2 = str1.equals(localObject2);
          } while (!bool2);
          bool2 = i4;
          break;
          localObject2 = "constraintRotate";
          bool2 = str1.equals(localObject2);
        } while (!bool2);
        bool2 = i2;
        break;
        localObject2 = "deriveConstraintsFrom";
        bool2 = str1.equals(localObject2);
      } while (!bool2);
      boolean bool2 = false;
      str1 = null;
      switch (bool2)
      {
      default: 
        break;
      case 2: 
        n = OooOO0o(paramContext, (String)localObject1);
        Object localObject4 = this.OooO;
        str1 = OooOoo((String)localObject1);
        localObject1 = Integer.valueOf(n);
        ((HashMap)localObject4).put(str1, localObject1);
        localObject4 = Debug.OooO00o(paramContext, n);
        localConstraintSet.OooO0O0 = ((String)localObject4);
        break;
      case 1: 
        int i7;
        try
        {
          i6 = Integer.parseInt((String)localObject1);
          localConstraintSet.OooO0Oo = i6;
        }
        catch (NumberFormatException localNumberFormatException)
        {
          ((String)localObject1).hashCode();
          int i6 = ((String)localObject1).hashCode();
          i3 = 4;
          i7 = 3;
          switch (i6)
          {
          }
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    i6 = k;
                    break;
                    str1 = "x_right";
                    bool3 = ((String)localObject1).equals(str1);
                  } while (!bool3);
                  bool3 = i3;
                  break;
                  str1 = "right";
                  bool3 = ((String)localObject1).equals(str1);
                } while (!bool3);
                bool3 = i7;
                break;
                str1 = "none";
                bool3 = ((String)localObject1).equals(str1);
              } while (!bool3);
              bool3 = i4;
              break;
              str1 = "left";
              bool3 = ((String)localObject1).equals(str1);
            } while (!bool3);
            bool3 = i2;
            break;
            str1 = "x_left";
            bool3 = ((String)localObject1).equals(str1);
          } while (!bool3);
          boolean bool3 = false;
          str1 = null;
          switch (bool3)
          {
          }
        }
        localConstraintSet.OooO0Oo = i7;
        break;
        localConstraintSet.OooO0Oo = i2;
        break;
        localConstraintSet.OooO0Oo = 0;
        break;
        localConstraintSet.OooO0Oo = i4;
        break;
        localConstraintSet.OooO0Oo = i3;
        break;
      case 0: 
        i1 = OooOO0o(paramContext, (String)localObject1);
      }
      m += 1;
    }
    if (n != k)
    {
      localMotionLayout = this.OooO00o;
      i = localMotionLayout.o00o00oO;
      if (i != 0) {
        localConstraintSet.setValidateOnParse(i2);
      }
      localConstraintSet.OooOo0O(paramContext, paramXmlPullParser);
      if (i1 != k)
      {
        paramContext = this.OooOO0;
        paramContext.put(n, i1);
      }
      paramContext = this.OooO0oo;
      paramContext.put(n, localConstraintSet);
    }
    return n;
  }
  
  public void OooOo(float paramFloat1, float paramFloat2)
  {
    Object localObject = this.OooO0OO;
    if (localObject != null)
    {
      localObject = MotionScene.Transition.OooOO0o((MotionScene.Transition)localObject);
      if (localObject != null)
      {
        localObject = MotionScene.Transition.OooOO0o(this.OooO0OO);
        ((TouchResponse)localObject).OooOO0(paramFloat1, paramFloat2);
      }
    }
  }
  
  public final void OooOo0(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    paramXmlPullParser = Xml.asAttributeSet(paramXmlPullParser);
    int[] arrayOfInt = R.styleable.include;
    paramXmlPullParser = paramContext.obtainStyledAttributes(paramXmlPullParser, arrayOfInt);
    int i = paramXmlPullParser.getIndexCount();
    int j = 0;
    while (j < i)
    {
      int k = paramXmlPullParser.getIndex(j);
      int m = R.styleable.include_constraintSet;
      if (k == m)
      {
        m = -1;
        k = paramXmlPullParser.getResourceId(k, m);
        OooOo00(paramContext, k);
      }
      j += 1;
    }
    paramXmlPullParser.recycle();
  }
  
  public final int OooOo00(Context paramContext, int paramInt)
  {
    Object localObject = paramContext.getResources();
    XmlResourceParser localXmlResourceParser = ((Resources)localObject).getXml(paramInt);
    try
    {
      int j;
      for (int i = localXmlResourceParser.getEventType();; j = localXmlResourceParser.next())
      {
        int k = 1;
        if (i == k) {
          break;
        }
        String str = localXmlResourceParser.getName();
        int m = 2;
        if (m == i)
        {
          localObject = "ConstraintSet";
          boolean bool = ((String)localObject).equals(str);
          if (bool) {
            return OooOOoo(paramContext, localXmlResourceParser);
          }
        }
      }
      return -1;
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
  
  public final void OooOo0O(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    paramXmlPullParser = Xml.asAttributeSet(paramXmlPullParser);
    int[] arrayOfInt = R.styleable.MotionScene;
    paramContext = paramContext.obtainStyledAttributes(paramXmlPullParser, arrayOfInt);
    int i = paramContext.getIndexCount();
    arrayOfInt = null;
    int j = 0;
    while (j < i)
    {
      int k = paramContext.getIndex(j);
      int m = R.styleable.MotionScene_defaultDuration;
      if (k == m)
      {
        m = this.OooOO0o;
        k = paramContext.getInt(k, m);
        this.OooOO0o = k;
        m = 8;
        if (k < m) {
          this.OooOO0o = m;
        }
      }
      else
      {
        m = R.styleable.MotionScene_layoutDuringTransition;
        if (k == m)
        {
          k = paramContext.getInteger(k, 0);
          this.OooOOO0 = k;
        }
      }
      j += 1;
    }
    paramContext.recycle();
  }
  
  public void OooOo0o(float paramFloat1, float paramFloat2)
  {
    Object localObject = this.OooO0OO;
    if (localObject != null)
    {
      localObject = MotionScene.Transition.OooOO0o((MotionScene.Transition)localObject);
      if (localObject != null)
      {
        localObject = MotionScene.Transition.OooOO0o(this.OooO0OO);
        ((TouchResponse)localObject).OooO(paramFloat1, paramFloat2);
      }
    }
  }
  
  public final void OooOoO(int paramInt, MotionLayout paramMotionLayout)
  {
    ConstraintSet localConstraintSet = (ConstraintSet)this.OooO0oo.get(paramInt);
    Object localObject1 = localConstraintSet.OooO0O0;
    localConstraintSet.OooO0OO = ((String)localObject1);
    localObject1 = this.OooOO0;
    paramInt = ((SparseIntArray)localObject1).get(paramInt);
    Object localObject2;
    if (paramInt > 0)
    {
      OooOoO(paramInt, paramMotionLayout);
      paramMotionLayout = (ConstraintSet)this.OooO0oo.get(paramInt);
      if (paramMotionLayout == null)
      {
        paramMotionLayout = new java/lang/StringBuilder;
        paramMotionLayout.<init>();
        paramMotionLayout.append("ERROR! invalid deriveConstraintsFrom: @id/");
        localObject2 = Debug.OooO00o(this.OooO00o.getContext(), paramInt);
        paramMotionLayout.append((String)localObject2);
        return;
      }
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = localConstraintSet.OooO0OO;
      ((StringBuilder)localObject2).append((String)localObject1);
      ((StringBuilder)localObject2).append("/");
      localObject1 = paramMotionLayout.OooO0OO;
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = ((StringBuilder)localObject2).toString();
      localConstraintSet.OooO0OO = ((String)localObject2);
      localConstraintSet.OooOooO(paramMotionLayout);
    }
    else
    {
      localObject2 = new java/lang/StringBuilder;
      ((StringBuilder)localObject2).<init>();
      localObject1 = localConstraintSet.OooO0OO;
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject1 = "  layout";
      ((StringBuilder)localObject2).append((String)localObject1);
      localObject2 = ((StringBuilder)localObject2).toString();
      localConstraintSet.OooO0OO = ((String)localObject2);
      localConstraintSet.OooOoo(paramMotionLayout);
    }
    localConstraintSet.OooO0oo(localConstraintSet);
  }
  
  public void OooOoO0(MotionEvent paramMotionEvent, int paramInt, MotionLayout paramMotionLayout)
  {
    Object localObject1 = new android/graphics/RectF;
    ((RectF)localObject1).<init>();
    MotionLayout.MotionTracker localMotionTracker = this.OooOOo0;
    if (localMotionTracker == null)
    {
      localMotionTracker = this.OooO00o.OoooO0();
      this.OooOOo0 = localMotionTracker;
    }
    this.OooOOo0.OooO00o(paramMotionEvent);
    localMotionTracker = null;
    int i = -1;
    int j = 1;
    float f1 = 1.4E-45F;
    label200:
    Object localObject2;
    if (paramInt != i)
    {
      int k = paramMotionEvent.getAction();
      boolean bool2 = false;
      float f2 = 0.0F;
      if (k != 0)
      {
        int m = 2;
        float f3 = 2.802597E-045F;
        if (k == m)
        {
          boolean bool1 = this.OooOOOO;
          if (!bool1)
          {
            float f4 = paramMotionEvent.getRawY();
            f3 = this.OooOo0;
            f4 -= f3;
            f3 = paramMotionEvent.getRawX();
            float f5 = this.OooOo00;
            f3 -= f5;
            double d1 = f3;
            double d2 = 0.0D;
            boolean bool3 = d1 < d2;
            MotionEvent localMotionEvent;
            if (!bool3)
            {
              d1 = f4;
              bool3 = d1 < d2;
              if (!bool3) {}
            }
            else
            {
              localMotionEvent = this.OooOOO;
              if (localMotionEvent != null) {
                break label200;
              }
            }
            return;
            localObject2 = OooO(paramInt, f3, f4, localMotionEvent);
            if (localObject2 != null)
            {
              paramMotionLayout.setTransition((MotionScene.Transition)localObject2);
              localObject2 = MotionScene.Transition.OooOO0o(this.OooO0OO);
              Object localObject3 = this.OooO00o;
              localObject1 = ((TouchResponse)localObject2).OooO0o((ViewGroup)localObject3, (RectF)localObject1);
              if (localObject1 != null)
              {
                localObject2 = this.OooOOO;
                f4 = ((MotionEvent)localObject2).getX();
                localObject3 = this.OooOOO;
                f3 = ((MotionEvent)localObject3).getY();
                bool4 = ((RectF)localObject1).contains(f4, f3);
                if (!bool4)
                {
                  bool2 = j;
                  f2 = f1;
                }
              }
              this.OooOOOo = bool2;
              localObject1 = MotionScene.Transition.OooOO0o(this.OooO0OO);
              f4 = this.OooOo00;
              f2 = this.OooOo0;
              ((TouchResponse)localObject1).OooOO0o(f4, f2);
            }
          }
        }
      }
      else
      {
        f6 = paramMotionEvent.getRawX();
        this.OooOo00 = f6;
        f6 = paramMotionEvent.getRawY();
        this.OooOo0 = f6;
        this.OooOOO = paramMotionEvent;
        this.OooOOOO = false;
        paramMotionEvent = MotionScene.Transition.OooOO0o(this.OooO0OO);
        if (paramMotionEvent != null)
        {
          paramMotionEvent = MotionScene.Transition.OooOO0o(this.OooO0OO);
          Object localObject4 = this.OooO00o;
          paramMotionEvent = paramMotionEvent.OooO0Oo((ViewGroup)localObject4, (RectF)localObject1);
          boolean bool5;
          if (paramMotionEvent != null)
          {
            localObject4 = this.OooOOO;
            f6 = ((MotionEvent)localObject4).getX();
            paramMotionLayout = this.OooOOO;
            f7 = paramMotionLayout.getY();
            bool5 = paramMotionEvent.contains(f6, f7);
            if (!bool5)
            {
              this.OooOOO = null;
              this.OooOOOO = j;
              return;
            }
          }
          paramMotionEvent = MotionScene.Transition.OooOO0o(this.OooO0OO);
          localObject4 = this.OooO00o;
          paramMotionEvent = paramMotionEvent.OooO0o((ViewGroup)localObject4, (RectF)localObject1);
          if (paramMotionEvent != null)
          {
            localObject4 = this.OooOOO;
            f6 = ((MotionEvent)localObject4).getX();
            paramMotionLayout = this.OooOOO;
            f7 = paramMotionLayout.getY();
            bool5 = paramMotionEvent.contains(f6, f7);
            if (!bool5)
            {
              this.OooOOOo = j;
              break label548;
            }
          }
          this.OooOOOo = false;
          label548:
          paramMotionEvent = MotionScene.Transition.OooOO0o(this.OooO0OO);
          f6 = this.OooOo00;
          float f7 = this.OooOo0;
          paramMotionEvent.OooOO0O(f6, f7);
        }
        return;
      }
    }
    boolean bool4 = this.OooOOOO;
    if (bool4) {
      return;
    }
    localObject1 = this.OooO0OO;
    if (localObject1 != null)
    {
      localObject1 = MotionScene.Transition.OooOO0o((MotionScene.Transition)localObject1);
      if (localObject1 != null)
      {
        bool4 = this.OooOOOo;
        if (!bool4)
        {
          localObject1 = MotionScene.Transition.OooOO0o(this.OooO0OO);
          localObject2 = this.OooOOo0;
          ((TouchResponse)localObject1).OooO0oO(paramMotionEvent, (MotionLayout.MotionTracker)localObject2, paramInt, this);
        }
      }
    }
    float f6 = paramMotionEvent.getRawX();
    this.OooOo00 = f6;
    f6 = paramMotionEvent.getRawY();
    this.OooOo0 = f6;
    int n = paramMotionEvent.getAction();
    if (n == j)
    {
      paramMotionEvent = this.OooOOo0;
      if (paramMotionEvent != null)
      {
        paramMotionEvent.recycle();
        this.OooOOo0 = null;
        n = paramMotionLayout.o00OooO0;
        if (n != i) {
          OooO0oo(paramMotionLayout, n);
        }
      }
    }
  }
  
  public void OooOoOO(MotionLayout paramMotionLayout)
  {
    int i = 0;
    for (;;)
    {
      SparseArray localSparseArray = this.OooO0oo;
      int j = localSparseArray.size();
      if (i >= j) {
        break;
      }
      localSparseArray = this.OooO0oo;
      j = localSparseArray.keyAt(i);
      boolean bool = OooOOOO(j);
      if (bool) {
        return;
      }
      OooOoO(j, paramMotionLayout);
      i += 1;
    }
  }
  
  public void OooOoo0()
  {
    Object localObject = this.OooO0OO;
    if (localObject != null)
    {
      localObject = MotionScene.Transition.OooOO0o((MotionScene.Transition)localObject);
      if (localObject != null)
      {
        localObject = MotionScene.Transition.OooOO0o(this.OooO0OO);
        ((TouchResponse)localObject).OooOOO0();
      }
    }
  }
  
  public boolean OooOooO()
  {
    Object localObject = this.OooO0o0.iterator();
    boolean bool2;
    TouchResponse localTouchResponse;
    do
    {
      boolean bool1 = ((Iterator)localObject).hasNext();
      bool2 = true;
      if (!bool1) {
        break;
      }
      localTouchResponse = MotionScene.Transition.OooOO0o((MotionScene.Transition)((Iterator)localObject).next());
    } while (localTouchResponse == null);
    return bool2;
    localObject = this.OooO0OO;
    if (localObject != null)
    {
      localObject = MotionScene.Transition.OooOO0o((MotionScene.Transition)localObject);
      if (localObject != null) {}
    }
    else
    {
      bool2 = false;
    }
    return bool2;
  }
  
  public void OooOooo(int paramInt, View... paramVarArgs)
  {
    this.OooOOoo.OooO(paramInt, paramVarArgs);
  }
  
  public int getAutoCompleteMode()
  {
    Object localObject = this.OooO0OO;
    if (localObject != null)
    {
      localObject = MotionScene.Transition.OooOO0o((MotionScene.Transition)localObject);
      if (localObject != null) {
        return MotionScene.Transition.OooOO0o(this.OooO0OO).getAutoCompleteMode();
      }
    }
    return 0;
  }
  
  public ConstraintSet getConstraintSet(int paramInt)
  {
    int i = -1;
    return OooOO0O(paramInt, i, i);
  }
  
  public int[] getConstraintSetIds()
  {
    SparseArray localSparseArray1 = this.OooO0oo;
    int i = localSparseArray1.size();
    int[] arrayOfInt = new int[i];
    int j = 0;
    while (j < i)
    {
      SparseArray localSparseArray2 = this.OooO0oo;
      int k = localSparseArray2.keyAt(j);
      arrayOfInt[j] = k;
      j += 1;
    }
    return arrayOfInt;
  }
  
  public ArrayList getDefinedTransitions()
  {
    return this.OooO0o0;
  }
  
  public int getDuration()
  {
    MotionScene.Transition localTransition = this.OooO0OO;
    if (localTransition != null) {
      return MotionScene.Transition.OooOO0(localTransition);
    }
    return this.OooOO0o;
  }
  
  public int getEndId()
  {
    MotionScene.Transition localTransition = this.OooO0OO;
    if (localTransition == null) {
      return -1;
    }
    return MotionScene.Transition.OooO00o(localTransition);
  }
  
  public Interpolator getInterpolator()
  {
    Object localObject = this.OooO0OO;
    int i = MotionScene.Transition.OooO0oO((MotionScene.Transition)localObject);
    int j = -2;
    if (i != j)
    {
      j = -1;
      if (i != j)
      {
        if (i != 0)
        {
          j = 1;
          if (i != j)
          {
            j = 2;
            if (i != j)
            {
              j = 4;
              if (i != j)
              {
                j = 5;
                if (i != j)
                {
                  j = 6;
                  if (i != j) {
                    return null;
                  }
                  localObject = new android/view/animation/AnticipateInterpolator;
                  ((AnticipateInterpolator)localObject).<init>();
                  return localObject;
                }
                localObject = new android/view/animation/OvershootInterpolator;
                ((OvershootInterpolator)localObject).<init>();
                return localObject;
              }
              localObject = new android/view/animation/BounceInterpolator;
              ((BounceInterpolator)localObject).<init>();
              return localObject;
            }
            localObject = new android/view/animation/DecelerateInterpolator;
            ((DecelerateInterpolator)localObject).<init>();
            return localObject;
          }
          localObject = new android/view/animation/AccelerateInterpolator;
          ((AccelerateInterpolator)localObject).<init>();
          return localObject;
        }
        localObject = new android/view/animation/AccelerateDecelerateInterpolator;
        ((AccelerateDecelerateInterpolator)localObject).<init>();
        return localObject;
      }
      localObject = Easing.OooO0OO(MotionScene.Transition.OooO0oo(this.OooO0OO));
      MotionScene.1 local1 = new androidx/constraintlayout/motion/widget/MotionScene$1;
      local1.<init>(this, (Easing)localObject);
      return local1;
    }
    localObject = this.OooO00o.getContext();
    j = MotionScene.Transition.OooO(this.OooO0OO);
    return AnimationUtils.loadInterpolator((Context)localObject, j);
  }
  
  public float getMaxAcceleration()
  {
    Object localObject = this.OooO0OO;
    if (localObject != null)
    {
      localObject = MotionScene.Transition.OooOO0o((MotionScene.Transition)localObject);
      if (localObject != null) {
        return MotionScene.Transition.OooOO0o(this.OooO0OO).getMaxAcceleration();
      }
    }
    return 0.0F;
  }
  
  public float getMaxVelocity()
  {
    Object localObject = this.OooO0OO;
    if (localObject != null)
    {
      localObject = MotionScene.Transition.OooOO0o((MotionScene.Transition)localObject);
      if (localObject != null) {
        return MotionScene.Transition.OooOO0o(this.OooO0OO).getMaxVelocity();
      }
    }
    return 0.0F;
  }
  
  public boolean getMoveWhenScrollAtTop()
  {
    Object localObject = this.OooO0OO;
    if (localObject != null)
    {
      localObject = MotionScene.Transition.OooOO0o((MotionScene.Transition)localObject);
      if (localObject != null) {
        return MotionScene.Transition.OooOO0o(this.OooO0OO).getMoveWhenScrollAtTop();
      }
    }
    return false;
  }
  
  public int getSpringBoundary()
  {
    Object localObject = this.OooO0OO;
    if (localObject != null)
    {
      localObject = MotionScene.Transition.OooOO0o((MotionScene.Transition)localObject);
      if (localObject != null) {
        return MotionScene.Transition.OooOO0o(this.OooO0OO).getSpringBoundary();
      }
    }
    return 0;
  }
  
  public float getSpringDamping()
  {
    Object localObject = this.OooO0OO;
    if (localObject != null)
    {
      localObject = MotionScene.Transition.OooOO0o((MotionScene.Transition)localObject);
      if (localObject != null) {
        return MotionScene.Transition.OooOO0o(this.OooO0OO).getSpringDamping();
      }
    }
    return 0.0F;
  }
  
  public float getSpringMass()
  {
    Object localObject = this.OooO0OO;
    if (localObject != null)
    {
      localObject = MotionScene.Transition.OooOO0o((MotionScene.Transition)localObject);
      if (localObject != null) {
        return MotionScene.Transition.OooOO0o(this.OooO0OO).getSpringMass();
      }
    }
    return 0.0F;
  }
  
  public float getSpringStiffiness()
  {
    Object localObject = this.OooO0OO;
    if (localObject != null)
    {
      localObject = MotionScene.Transition.OooOO0o((MotionScene.Transition)localObject);
      if (localObject != null) {
        return MotionScene.Transition.OooOO0o(this.OooO0OO).getSpringStiffness();
      }
    }
    return 0.0F;
  }
  
  public float getSpringStopThreshold()
  {
    Object localObject = this.OooO0OO;
    if (localObject != null)
    {
      localObject = MotionScene.Transition.OooOO0o((MotionScene.Transition)localObject);
      if (localObject != null) {
        return MotionScene.Transition.OooOO0o(this.OooO0OO).getSpringStopThreshold();
      }
    }
    return 0.0F;
  }
  
  public float getStaggered()
  {
    MotionScene.Transition localTransition = this.OooO0OO;
    if (localTransition != null) {
      return MotionScene.Transition.OooOOO0(localTransition);
    }
    return 0.0F;
  }
  
  public int getStartId()
  {
    MotionScene.Transition localTransition = this.OooO0OO;
    if (localTransition == null) {
      return -1;
    }
    return MotionScene.Transition.OooO0OO(localTransition);
  }
  
  public MotionScene.Transition getTransitionById(int paramInt)
  {
    Iterator localIterator = this.OooO0o0.iterator();
    MotionScene.Transition localTransition;
    int i;
    do
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      localTransition = (MotionScene.Transition)localIterator.next();
      i = MotionScene.Transition.OooOOOO(localTransition);
    } while (i != paramInt);
    return localTransition;
    return null;
  }
  
  public int getTransitionDirection(int paramInt)
  {
    Iterator localIterator = this.OooO0o0.iterator();
    int i;
    do
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      MotionScene.Transition localTransition = (MotionScene.Transition)localIterator.next();
      i = MotionScene.Transition.OooO0OO(localTransition);
    } while (i != paramInt);
    return 0;
    return 1;
  }
  
  public List getTransitionsWithState(int paramInt)
  {
    paramInt = getRealID(paramInt);
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    Iterator localIterator = this.OooO0o0.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      MotionScene.Transition localTransition = (MotionScene.Transition)localIterator.next();
      int i = MotionScene.Transition.OooO0OO(localTransition);
      if (i != paramInt)
      {
        i = MotionScene.Transition.OooO00o(localTransition);
        if (i != paramInt) {}
      }
      else
      {
        localArrayList.add(localTransition);
      }
    }
    return localArrayList;
  }
  
  public boolean isViewTransitionEnabled(int paramInt)
  {
    return this.OooOOoo.isViewTransitionEnabled(paramInt);
  }
  
  public void setConstraintSet(int paramInt, ConstraintSet paramConstraintSet)
  {
    this.OooO0oo.put(paramInt, paramConstraintSet);
  }
  
  public void setDuration(int paramInt)
  {
    MotionScene.Transition localTransition = this.OooO0OO;
    if (localTransition != null) {
      localTransition.setDuration(paramInt);
    } else {
      this.OooOO0o = paramInt;
    }
  }
  
  public void setRtl(boolean paramBoolean)
  {
    this.OooOOo = paramBoolean;
    Object localObject = this.OooO0OO;
    if (localObject != null)
    {
      localObject = MotionScene.Transition.OooOO0o((MotionScene.Transition)localObject);
      if (localObject != null)
      {
        localObject = MotionScene.Transition.OooOO0o(this.OooO0OO);
        boolean bool = this.OooOOo;
        ((TouchResponse)localObject).setRTL(bool);
      }
    }
  }
  
  public void setTransition(int paramInt1, int paramInt2)
  {
    StateSet localStateSet1 = this.OooO0O0;
    int i = -1;
    int j;
    if (localStateSet1 != null)
    {
      j = localStateSet1.OooO0OO(paramInt1, i, i);
      if (j == i) {
        j = paramInt1;
      }
      StateSet localStateSet2 = this.OooO0O0;
      k = localStateSet2.OooO0OO(paramInt2, i, i);
      if (k != i) {
        break label70;
      }
    }
    else
    {
      j = paramInt1;
    }
    int k = paramInt2;
    label70:
    Object localObject1 = this.OooO0OO;
    if (localObject1 != null)
    {
      int m = MotionScene.Transition.OooO00o((MotionScene.Transition)localObject1);
      if (m == paramInt2)
      {
        localObject1 = this.OooO0OO;
        m = MotionScene.Transition.OooO0OO((MotionScene.Transition)localObject1);
        if (m == paramInt1) {
          return;
        }
      }
    }
    localObject1 = this.OooO0o0.iterator();
    boolean bool;
    MotionScene.Transition localTransition1;
    int n;
    do
    {
      do
      {
        bool = ((Iterator)localObject1).hasNext();
        if (!bool) {
          break label247;
        }
        localTransition1 = (MotionScene.Transition)((Iterator)localObject1).next();
        n = MotionScene.Transition.OooO00o(localTransition1);
        if (n == k)
        {
          n = MotionScene.Transition.OooO0OO(localTransition1);
          if (n == j) {
            break;
          }
        }
        n = MotionScene.Transition.OooO00o(localTransition1);
      } while (n != paramInt2);
      n = MotionScene.Transition.OooO0OO(localTransition1);
    } while (n != paramInt1);
    this.OooO0OO = localTransition1;
    if (localTransition1 != null)
    {
      localObject2 = MotionScene.Transition.OooOO0o(localTransition1);
      if (localObject2 != null)
      {
        localObject2 = MotionScene.Transition.OooOO0o(this.OooO0OO);
        paramInt2 = this.OooOOo;
        ((TouchResponse)localObject2).setRTL(paramInt2);
      }
    }
    return;
    label247:
    Object localObject2 = this.OooO0o;
    localObject1 = this.OooO0oO.iterator();
    for (;;)
    {
      bool = ((Iterator)localObject1).hasNext();
      if (!bool) {
        break;
      }
      localTransition1 = (MotionScene.Transition)((Iterator)localObject1).next();
      n = MotionScene.Transition.OooO00o(localTransition1);
      if (n == paramInt2) {
        localObject2 = localTransition1;
      }
    }
    MotionScene.Transition localTransition2 = new androidx/constraintlayout/motion/widget/MotionScene$Transition;
    localTransition2.<init>(this, (MotionScene.Transition)localObject2);
    MotionScene.Transition.OooO0Oo(localTransition2, j);
    MotionScene.Transition.OooO0O0(localTransition2, k);
    if (j != i)
    {
      localObject2 = this.OooO0o0;
      ((ArrayList)localObject2).add(localTransition2);
    }
    this.OooO0OO = localTransition2;
  }
  
  public void setTransition(MotionScene.Transition paramTransition)
  {
    this.OooO0OO = paramTransition;
    if (paramTransition != null)
    {
      paramTransition = MotionScene.Transition.OooOO0o(paramTransition);
      if (paramTransition != null)
      {
        paramTransition = MotionScene.Transition.OooOO0o(this.OooO0OO);
        boolean bool = this.OooOOo;
        paramTransition.setRTL(bool);
      }
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.MotionScene
 * JD-Core Version:    0.7.0.1
 */