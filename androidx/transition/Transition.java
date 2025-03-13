package androidx.transition;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.TimeInterpolator;
import android.graphics.Rect;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ListView;
import androidx.collection.ArrayMap;
import androidx.collection.LongSparseArray;
import androidx.collection.SimpleArrayMap;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public abstract class Transition
  implements Cloneable
{
  static final boolean DBG = false;
  private static final int[] DEFAULT_MATCH_ORDER;
  private static final String LOG_TAG = "Transition";
  private static final int MATCH_FIRST = 1;
  public static final int MATCH_ID = 3;
  private static final String MATCH_ID_STR = "id";
  public static final int MATCH_INSTANCE = 1;
  private static final String MATCH_INSTANCE_STR = "instance";
  public static final int MATCH_ITEM_ID = 4;
  private static final String MATCH_ITEM_ID_STR = "itemId";
  private static final int MATCH_LAST = 4;
  public static final int MATCH_NAME = 2;
  private static final String MATCH_NAME_STR = "name";
  private static final PathMotion STRAIGHT_PATH_MOTION;
  private static ThreadLocal sRunningAnimators;
  private ArrayList mAnimators;
  boolean mCanRemoveViews;
  ArrayList mCurrentAnimators;
  long mDuration;
  private TransitionValuesMaps mEndValues;
  private ArrayList mEndValuesList;
  private boolean mEnded;
  private Transition.EpicenterCallback mEpicenterCallback;
  private TimeInterpolator mInterpolator;
  private ArrayList mListeners;
  private int[] mMatchOrder;
  private String mName;
  private ArrayMap mNameOverrides;
  private int mNumInstances;
  TransitionSet mParent;
  private PathMotion mPathMotion;
  private boolean mPaused;
  TransitionPropagation mPropagation;
  private long mStartDelay;
  private TransitionValuesMaps mStartValues;
  private ArrayList mStartValuesList;
  private ArrayList mTargetChildExcludes;
  private ArrayList mTargetExcludes;
  private ArrayList mTargetIdChildExcludes;
  private ArrayList mTargetIdExcludes;
  ArrayList mTargetIds;
  private ArrayList mTargetNameExcludes;
  private ArrayList mTargetNames;
  private ArrayList mTargetTypeChildExcludes;
  private ArrayList mTargetTypeExcludes;
  private ArrayList mTargetTypes;
  ArrayList mTargets;
  
  static
  {
    int[] tmp3_1 = new int[4];
    int[] tmp4_3 = tmp3_1;
    int[] tmp4_3 = tmp3_1;
    tmp4_3[0] = 2;
    tmp4_3[1] = 1;
    tmp4_3[2] = 3;
    int[] tmp14_4 = tmp4_3;
    tmp14_4[3] = 4;
    DEFAULT_MATCH_ORDER = tmp14_4;
    Object localObject = new androidx/transition/Transition$1;
    ((Transition.1)localObject).<init>();
    STRAIGHT_PATH_MOTION = (PathMotion)localObject;
    localObject = new java/lang/ThreadLocal;
    ((ThreadLocal)localObject).<init>();
    sRunningAnimators = (ThreadLocal)localObject;
  }
  
  public Transition()
  {
    Object localObject1 = getClass().getName();
    this.mName = ((String)localObject1);
    long l = -1;
    this.mStartDelay = l;
    this.mDuration = l;
    this.mInterpolator = null;
    Object localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    this.mTargetIds = ((ArrayList)localObject2);
    localObject2 = new java/util/ArrayList;
    ((ArrayList)localObject2).<init>();
    this.mTargets = ((ArrayList)localObject2);
    this.mTargetNames = null;
    this.mTargetTypes = null;
    this.mTargetIdExcludes = null;
    this.mTargetExcludes = null;
    this.mTargetTypeExcludes = null;
    this.mTargetNameExcludes = null;
    this.mTargetIdChildExcludes = null;
    this.mTargetChildExcludes = null;
    this.mTargetTypeChildExcludes = null;
    localObject2 = new androidx/transition/TransitionValuesMaps;
    ((TransitionValuesMaps)localObject2).<init>();
    this.mStartValues = ((TransitionValuesMaps)localObject2);
    localObject2 = new androidx/transition/TransitionValuesMaps;
    ((TransitionValuesMaps)localObject2).<init>();
    this.mEndValues = ((TransitionValuesMaps)localObject2);
    this.mParent = null;
    localObject2 = DEFAULT_MATCH_ORDER;
    this.mMatchOrder = ((int[])localObject2);
    this.mCanRemoveViews = false;
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    this.mCurrentAnimators = localArrayList;
    this.mNumInstances = 0;
    this.mPaused = false;
    this.mEnded = false;
    this.mListeners = null;
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.mAnimators = ((ArrayList)localObject1);
    localObject1 = STRAIGHT_PATH_MOTION;
    this.mPathMotion = ((PathMotion)localObject1);
  }
  
  public static void OooO0O0(TransitionValuesMaps paramTransitionValuesMaps, View paramView, TransitionValues paramTransitionValues)
  {
    paramTransitionValuesMaps.OooO00o.put(paramView, paramTransitionValues);
    int i = paramView.getId();
    Object localObject;
    if (i >= 0)
    {
      localObject = paramTransitionValuesMaps.OooO0O0;
      int k = ((SparseArray)localObject).indexOfKey(i);
      if (k >= 0)
      {
        localObject = paramTransitionValuesMaps.OooO0O0;
        ((SparseArray)localObject).put(i, null);
      }
      else
      {
        localObject = paramTransitionValuesMaps.OooO0O0;
        ((SparseArray)localObject).put(i, paramView);
      }
    }
    paramTransitionValues = ViewCompat.Oooo0O0(paramView);
    boolean bool2;
    if (paramTransitionValues != null)
    {
      localObject = paramTransitionValuesMaps.OooO0Oo;
      bool2 = ((SimpleArrayMap)localObject).containsKey(paramTransitionValues);
      if (bool2)
      {
        localObject = paramTransitionValuesMaps.OooO0Oo;
        ((SimpleArrayMap)localObject).put(paramTransitionValues, null);
      }
      else
      {
        localObject = paramTransitionValuesMaps.OooO0Oo;
        ((SimpleArrayMap)localObject).put(paramTransitionValues, paramView);
      }
    }
    paramTransitionValues = paramView.getParent();
    boolean bool1 = paramTransitionValues instanceof ListView;
    if (bool1)
    {
      paramTransitionValues = (ListView)paramView.getParent();
      localObject = paramTransitionValues.getAdapter();
      bool2 = ((Adapter)localObject).hasStableIds();
      if (bool2)
      {
        int m = paramTransitionValues.getPositionForView(paramView);
        long l = paramTransitionValues.getItemIdAtPosition(m);
        paramTransitionValues = paramTransitionValuesMaps.OooO0OO;
        int j = paramTransitionValues.OooOO0(l);
        if (j >= 0)
        {
          paramView = (View)paramTransitionValuesMaps.OooO0OO.OooO0oo(l);
          if (paramView != null)
          {
            j = 0;
            paramTransitionValues = null;
            ViewCompat.o000OOo(paramView, false);
            paramTransitionValuesMaps = paramTransitionValuesMaps.OooO0OO;
            paramTransitionValuesMaps.OooOO0o(l, null);
          }
        }
        else
        {
          j = 1;
          ViewCompat.o000OOo(paramView, j);
          paramTransitionValuesMaps = paramTransitionValuesMaps.OooO0OO;
          paramTransitionValuesMaps.OooOO0o(l, paramView);
        }
      }
    }
  }
  
  public static boolean OooO0OO(int[] paramArrayOfInt, int paramInt)
  {
    int i = paramArrayOfInt[paramInt];
    int j = 0;
    while (j < paramInt)
    {
      int k = paramArrayOfInt[j];
      if (k == i) {
        return true;
      }
      j += 1;
    }
    return false;
  }
  
  public static ArrayList OooO0oo(ArrayList paramArrayList, Object paramObject, boolean paramBoolean)
  {
    if (paramObject != null) {
      if (paramBoolean) {
        paramArrayList = Transition.ArrayListManager.OooO00o(paramArrayList, paramObject);
      } else {
        paramArrayList = Transition.ArrayListManager.OooO0O0(paramArrayList, paramObject);
      }
    }
    return paramArrayList;
  }
  
  public static boolean OooOO0O(TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2, String paramString)
  {
    paramTransitionValues1 = paramTransitionValues1.OooO00o.get(paramString);
    paramTransitionValues2 = paramTransitionValues2.OooO00o.get(paramString);
    boolean bool1;
    if ((paramTransitionValues1 == null) && (paramTransitionValues2 == null))
    {
      bool1 = false;
      paramTransitionValues1 = null;
    }
    else
    {
      boolean bool2 = true;
      if ((paramTransitionValues1 != null) && (paramTransitionValues2 != null)) {
        bool1 = paramTransitionValues1.equals(paramTransitionValues2) ^ bool2;
      } else {
        bool1 = bool2;
      }
    }
    return bool1;
  }
  
  private static ArrayMap getRunningAnimators()
  {
    ArrayMap localArrayMap = (ArrayMap)sRunningAnimators.get();
    if (localArrayMap == null)
    {
      localArrayMap = new androidx/collection/ArrayMap;
      localArrayMap.<init>();
      ThreadLocal localThreadLocal = sRunningAnimators;
      localThreadLocal.set(localArrayMap);
    }
    return localArrayMap;
  }
  
  private static boolean isValidMatch(int paramInt)
  {
    int i = 1;
    if (paramInt >= i)
    {
      int j = 4;
      if (paramInt <= j) {}
    }
    else
    {
      i = 0;
    }
    return i;
  }
  
  public final ArrayList OooO(ArrayList paramArrayList, Class paramClass, boolean paramBoolean)
  {
    if (paramClass != null) {
      if (paramBoolean) {
        paramArrayList = Transition.ArrayListManager.OooO00o(paramArrayList, paramClass);
      } else {
        paramArrayList = Transition.ArrayListManager.OooO0O0(paramArrayList, paramClass);
      }
    }
    return paramArrayList;
  }
  
  public final void OooO00o(ArrayMap paramArrayMap1, ArrayMap paramArrayMap2)
  {
    int i = 0;
    int j = 0;
    Object localObject1 = null;
    for (;;)
    {
      int k = paramArrayMap1.size();
      if (j >= k) {
        break;
      }
      Object localObject2 = (TransitionValues)paramArrayMap1.OooOOO0(j);
      Object localObject3 = ((TransitionValues)localObject2).OooO0O0;
      boolean bool2 = isValidTarget((View)localObject3);
      if (bool2)
      {
        localObject3 = this.mStartValuesList;
        ((ArrayList)localObject3).add(localObject2);
        localObject2 = this.mEndValuesList;
        ((ArrayList)localObject2).add(null);
      }
      j += 1;
    }
    for (;;)
    {
      int m = paramArrayMap2.size();
      if (i >= m) {
        break;
      }
      paramArrayMap1 = (TransitionValues)paramArrayMap2.OooOOO0(i);
      localObject1 = paramArrayMap1.OooO0O0;
      boolean bool1 = isValidTarget((View)localObject1);
      if (bool1)
      {
        localObject1 = this.mEndValuesList;
        ((ArrayList)localObject1).add(paramArrayMap1);
        paramArrayMap1 = this.mStartValuesList;
        paramArrayMap1.add(null);
      }
      i += 1;
    }
  }
  
  public final void OooO0Oo(View paramView, boolean paramBoolean)
  {
    if (paramView == null) {
      return;
    }
    int i = paramView.getId();
    Object localObject1 = this.mTargetIdExcludes;
    boolean bool2;
    if (localObject1 != null)
    {
      localInteger = Integer.valueOf(i);
      bool2 = ((ArrayList)localObject1).contains(localInteger);
      if (bool2) {
        return;
      }
    }
    localObject1 = this.mTargetExcludes;
    if (localObject1 != null)
    {
      bool2 = ((ArrayList)localObject1).contains(paramView);
      if (bool2) {
        return;
      }
    }
    localObject1 = this.mTargetTypeExcludes;
    int i1 = 0;
    Integer localInteger = null;
    Object localObject2;
    if (localObject1 != null)
    {
      int k = ((ArrayList)localObject1).size();
      int i3 = 0;
      localObject2 = null;
      while (i3 < k)
      {
        Class localClass = (Class)this.mTargetTypeExcludes.get(i3);
        boolean bool4 = localClass.isInstance(paramView);
        if (bool4) {
          return;
        }
        i3 += 1;
      }
    }
    localObject1 = paramView.getParent();
    int m = localObject1 instanceof ViewGroup;
    if (m != 0)
    {
      localObject1 = new androidx/transition/TransitionValues;
      ((TransitionValues)localObject1).<init>(paramView);
      if (paramBoolean) {
        captureStartValues((TransitionValues)localObject1);
      } else {
        captureEndValues((TransitionValues)localObject1);
      }
      localObject2 = ((TransitionValues)localObject1).OooO0OO;
      ((ArrayList)localObject2).add(this);
      capturePropagationValues((TransitionValues)localObject1);
      if (paramBoolean) {
        localObject2 = this.mStartValues;
      } else {
        localObject2 = this.mEndValues;
      }
      OooO0O0((TransitionValuesMaps)localObject2, paramView, (TransitionValues)localObject1);
    }
    m = paramView instanceof ViewGroup;
    if (m != 0)
    {
      localObject1 = this.mTargetIdChildExcludes;
      boolean bool1;
      if (localObject1 != null)
      {
        localObject3 = Integer.valueOf(i);
        bool1 = ((ArrayList)localObject1).contains(localObject3);
        if (bool1) {
          return;
        }
      }
      Object localObject3 = this.mTargetChildExcludes;
      if (localObject3 != null)
      {
        bool1 = ((ArrayList)localObject3).contains(paramView);
        if (bool1) {
          return;
        }
      }
      localObject3 = this.mTargetTypeChildExcludes;
      int j;
      if (localObject3 != null)
      {
        j = ((ArrayList)localObject3).size();
        m = 0;
        localObject1 = null;
        while (m < j)
        {
          localObject2 = (Class)this.mTargetTypeChildExcludes.get(m);
          boolean bool3 = ((Class)localObject2).isInstance(paramView);
          if (bool3) {
            return;
          }
          int n;
          m += 1;
        }
      }
      paramView = (ViewGroup)paramView;
      for (;;)
      {
        j = paramView.getChildCount();
        if (i1 >= j) {
          break;
        }
        localObject3 = paramView.getChildAt(i1);
        OooO0Oo((View)localObject3, paramBoolean);
        int i2;
        i1 += 1;
      }
    }
  }
  
  public final ArrayList OooO0o(ArrayList paramArrayList, int paramInt, boolean paramBoolean)
  {
    if (paramInt > 0)
    {
      Integer localInteger = Integer.valueOf(paramInt);
      if (paramBoolean) {
        paramArrayList = Transition.ArrayListManager.OooO00o(paramArrayList, localInteger);
      } else {
        paramArrayList = Transition.ArrayListManager.OooO0O0(paramArrayList, localInteger);
      }
    }
    return paramArrayList;
  }
  
  public final ArrayList OooOO0(ArrayList paramArrayList, View paramView, boolean paramBoolean)
  {
    if (paramView != null) {
      if (paramBoolean) {
        paramArrayList = Transition.ArrayListManager.OooO00o(paramArrayList, paramView);
      } else {
        paramArrayList = Transition.ArrayListManager.OooO0O0(paramArrayList, paramView);
      }
    }
    return paramArrayList;
  }
  
  public final void OooOO0o(ArrayMap paramArrayMap1, ArrayMap paramArrayMap2, SparseArray paramSparseArray1, SparseArray paramSparseArray2)
  {
    int i = paramSparseArray1.size();
    int j = 0;
    while (j < i)
    {
      View localView1 = (View)paramSparseArray1.valueAt(j);
      if (localView1 != null)
      {
        boolean bool1 = isValidTarget(localView1);
        if (bool1)
        {
          int k = paramSparseArray1.keyAt(j);
          View localView2 = (View)paramSparseArray2.get(k);
          if (localView2 != null)
          {
            boolean bool2 = isValidTarget(localView2);
            if (bool2)
            {
              Object localObject = (TransitionValues)paramArrayMap1.get(localView1);
              TransitionValues localTransitionValues = (TransitionValues)paramArrayMap2.get(localView2);
              if ((localObject != null) && (localTransitionValues != null))
              {
                ArrayList localArrayList = this.mStartValuesList;
                localArrayList.add(localObject);
                localObject = this.mEndValuesList;
                ((ArrayList)localObject).add(localTransitionValues);
                paramArrayMap1.remove(localView1);
                paramArrayMap2.remove(localView2);
              }
            }
          }
        }
      }
      j += 1;
    }
  }
  
  public final void OooOOO(ArrayMap paramArrayMap1, ArrayMap paramArrayMap2, LongSparseArray paramLongSparseArray1, LongSparseArray paramLongSparseArray2)
  {
    int i = paramLongSparseArray1.OooOOOO();
    int j = 0;
    while (j < i)
    {
      View localView1 = (View)paramLongSparseArray1.OooOOOo(j);
      if (localView1 != null)
      {
        boolean bool1 = isValidTarget(localView1);
        if (bool1)
        {
          long l = paramLongSparseArray1.OooOO0O(j);
          View localView2 = (View)paramLongSparseArray2.OooO0oo(l);
          if (localView2 != null)
          {
            boolean bool2 = isValidTarget(localView2);
            if (bool2)
            {
              Object localObject = (TransitionValues)paramArrayMap1.get(localView1);
              TransitionValues localTransitionValues = (TransitionValues)paramArrayMap2.get(localView2);
              if ((localObject != null) && (localTransitionValues != null))
              {
                ArrayList localArrayList = this.mStartValuesList;
                localArrayList.add(localObject);
                localObject = this.mEndValuesList;
                ((ArrayList)localObject).add(localTransitionValues);
                paramArrayMap1.remove(localView1);
                paramArrayMap2.remove(localView2);
              }
            }
          }
        }
      }
      j += 1;
    }
  }
  
  public final void OooOOO0(ArrayMap paramArrayMap1, ArrayMap paramArrayMap2)
  {
    int i = paramArrayMap1.size() + -1;
    while (i >= 0)
    {
      Object localObject1 = (View)paramArrayMap1.OooO(i);
      if (localObject1 != null)
      {
        boolean bool = isValidTarget((View)localObject1);
        if (bool)
        {
          localObject1 = (TransitionValues)paramArrayMap2.remove(localObject1);
          if (localObject1 != null)
          {
            Object localObject2 = ((TransitionValues)localObject1).OooO0O0;
            bool = isValidTarget((View)localObject2);
            if (bool)
            {
              localObject2 = (TransitionValues)paramArrayMap1.OooOO0O(i);
              ArrayList localArrayList = this.mStartValuesList;
              localArrayList.add(localObject2);
              localObject2 = this.mEndValuesList;
              ((ArrayList)localObject2).add(localObject1);
            }
          }
        }
      }
      i += -1;
    }
  }
  
  public final void OooOOOO(ArrayMap paramArrayMap1, ArrayMap paramArrayMap2, ArrayMap paramArrayMap3, ArrayMap paramArrayMap4)
  {
    int i = paramArrayMap3.size();
    int j = 0;
    while (j < i)
    {
      View localView = (View)paramArrayMap3.OooOOO0(j);
      if (localView != null)
      {
        boolean bool1 = isValidTarget(localView);
        if (bool1)
        {
          Object localObject1 = paramArrayMap3.OooO(j);
          localObject1 = (View)paramArrayMap4.get(localObject1);
          if (localObject1 != null)
          {
            boolean bool2 = isValidTarget((View)localObject1);
            if (bool2)
            {
              Object localObject2 = (TransitionValues)paramArrayMap1.get(localView);
              TransitionValues localTransitionValues = (TransitionValues)paramArrayMap2.get(localObject1);
              if ((localObject2 != null) && (localTransitionValues != null))
              {
                ArrayList localArrayList = this.mStartValuesList;
                localArrayList.add(localObject2);
                localObject2 = this.mEndValuesList;
                ((ArrayList)localObject2).add(localTransitionValues);
                paramArrayMap1.remove(localView);
                paramArrayMap2.remove(localObject1);
              }
            }
          }
        }
      }
      j += 1;
    }
  }
  
  public final void OooOOOo(TransitionValuesMaps paramTransitionValuesMaps1, TransitionValuesMaps paramTransitionValuesMaps2)
  {
    ArrayMap localArrayMap1 = new androidx/collection/ArrayMap;
    ArrayMap localArrayMap2 = paramTransitionValuesMaps1.OooO00o;
    localArrayMap1.<init>(localArrayMap2);
    localArrayMap2 = new androidx/collection/ArrayMap;
    ArrayMap localArrayMap3 = paramTransitionValuesMaps2.OooO00o;
    localArrayMap2.<init>(localArrayMap3);
    int i = 0;
    localArrayMap3 = null;
    for (;;)
    {
      Object localObject1 = this.mMatchOrder;
      int j = localObject1.length;
      if (i >= j) {
        break;
      }
      int k = localObject1[i];
      j = 1;
      if (k != j)
      {
        j = 2;
        Object localObject2;
        if (k != j)
        {
          j = 3;
          if (k != j)
          {
            j = 4;
            if (k == j)
            {
              localObject1 = paramTransitionValuesMaps1.OooO0OO;
              localObject2 = paramTransitionValuesMaps2.OooO0OO;
              OooOOO(localArrayMap1, localArrayMap2, (LongSparseArray)localObject1, (LongSparseArray)localObject2);
            }
          }
          else
          {
            localObject1 = paramTransitionValuesMaps1.OooO0O0;
            localObject2 = paramTransitionValuesMaps2.OooO0O0;
            OooOO0o(localArrayMap1, localArrayMap2, (SparseArray)localObject1, (SparseArray)localObject2);
          }
        }
        else
        {
          localObject1 = paramTransitionValuesMaps1.OooO0Oo;
          localObject2 = paramTransitionValuesMaps2.OooO0Oo;
          OooOOOO(localArrayMap1, localArrayMap2, (ArrayMap)localObject1, (ArrayMap)localObject2);
        }
      }
      else
      {
        OooOOO0(localArrayMap1, localArrayMap2);
      }
      i += 1;
    }
    OooO00o(localArrayMap1, localArrayMap2);
  }
  
  public final void OooOOo0(Animator paramAnimator, ArrayMap paramArrayMap)
  {
    if (paramAnimator != null)
    {
      Transition.2 local2 = new androidx/transition/Transition$2;
      local2.<init>(this, paramArrayMap);
      paramAnimator.addListener(local2);
      animate(paramAnimator);
    }
  }
  
  public Transition addListener(Transition.TransitionListener paramTransitionListener)
  {
    ArrayList localArrayList = this.mListeners;
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      this.mListeners = localArrayList;
    }
    this.mListeners.add(paramTransitionListener);
    return this;
  }
  
  public Transition addTarget(int paramInt)
  {
    if (paramInt != 0)
    {
      ArrayList localArrayList = this.mTargetIds;
      Integer localInteger = Integer.valueOf(paramInt);
      localArrayList.add(localInteger);
    }
    return this;
  }
  
  public Transition addTarget(View paramView)
  {
    this.mTargets.add(paramView);
    return this;
  }
  
  public Transition addTarget(Class paramClass)
  {
    ArrayList localArrayList = this.mTargetTypes;
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      this.mTargetTypes = localArrayList;
    }
    this.mTargetTypes.add(paramClass);
    return this;
  }
  
  public Transition addTarget(String paramString)
  {
    ArrayList localArrayList = this.mTargetNames;
    if (localArrayList == null)
    {
      localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      this.mTargetNames = localArrayList;
    }
    this.mTargetNames.add(paramString);
    return this;
  }
  
  public void animate(Animator paramAnimator)
  {
    if (paramAnimator == null)
    {
      end();
    }
    else
    {
      long l1 = getDuration();
      long l2 = 0L;
      boolean bool = l1 < l2;
      if (!bool)
      {
        l1 = getDuration();
        paramAnimator.setDuration(l1);
      }
      l1 = getStartDelay();
      bool = l1 < l2;
      if (!bool)
      {
        l1 = getStartDelay();
        l2 = paramAnimator.getStartDelay();
        l1 += l2;
        paramAnimator.setStartDelay(l1);
      }
      Object localObject = getInterpolator();
      if (localObject != null)
      {
        localObject = getInterpolator();
        paramAnimator.setInterpolator((TimeInterpolator)localObject);
      }
      localObject = new androidx/transition/Transition$3;
      ((Transition.3)localObject).<init>(this);
      paramAnimator.addListener((Animator.AnimatorListener)localObject);
      paramAnimator.start();
    }
  }
  
  public void cancel()
  {
    ArrayList localArrayList = this.mCurrentAnimators;
    int i = localArrayList.size() + -1;
    while (i >= 0)
    {
      Animator localAnimator = (Animator)this.mCurrentAnimators.get(i);
      localAnimator.cancel();
      i += -1;
    }
    localArrayList = this.mListeners;
    if (localArrayList != null)
    {
      i = localArrayList.size();
      if (i > 0)
      {
        localArrayList = (ArrayList)this.mListeners.clone();
        int j = localArrayList.size();
        int k = 0;
        while (k < j)
        {
          Transition.TransitionListener localTransitionListener = (Transition.TransitionListener)localArrayList.get(k);
          localTransitionListener.onTransitionCancel(this);
          k += 1;
        }
      }
    }
  }
  
  public abstract void captureEndValues(TransitionValues paramTransitionValues);
  
  public void capturePropagationValues(TransitionValues paramTransitionValues)
  {
    Object localObject1 = this.mPropagation;
    if (localObject1 != null)
    {
      localObject1 = paramTransitionValues.OooO00o;
      boolean bool1 = ((Map)localObject1).isEmpty();
      if (!bool1)
      {
        localObject1 = this.mPropagation.getPropagationProperties();
        if (localObject1 == null) {
          return;
        }
        int i = 0;
        int j = 0;
        for (;;)
        {
          int k = localObject1.length;
          if (j >= k) {
            break;
          }
          Map localMap = paramTransitionValues.OooO00o;
          Object localObject2 = localObject1[j];
          boolean bool2 = localMap.containsKey(localObject2);
          if (!bool2) {
            break label98;
          }
          j += 1;
        }
        i = 1;
        label98:
        if (i == 0)
        {
          localObject1 = this.mPropagation;
          ((TransitionPropagation)localObject1).OooO00o(paramTransitionValues);
        }
      }
    }
  }
  
  public abstract void captureStartValues(TransitionValues paramTransitionValues);
  
  public void captureValues(ViewGroup paramViewGroup, boolean paramBoolean)
  {
    clearValues(paramBoolean);
    Object localObject1 = this.mTargetIds;
    int i = ((ArrayList)localObject1).size();
    int m = 0;
    if (i <= 0)
    {
      localObject1 = this.mTargets;
      i = ((ArrayList)localObject1).size();
      if (i <= 0) {}
    }
    else
    {
      localObject1 = this.mTargetNames;
      if (localObject1 != null)
      {
        j = ((ArrayList)localObject1).isEmpty();
        if (j == 0) {}
      }
      else
      {
        localObject1 = this.mTargetTypes;
        if (localObject1 == null) {
          break label92;
        }
        j = ((ArrayList)localObject1).isEmpty();
        if (j != 0) {
          break label92;
        }
      }
    }
    OooO0Oo(paramViewGroup, paramBoolean);
    break label357;
    label92:
    int j = 0;
    localObject1 = null;
    Object localObject2;
    Object localObject3;
    int k;
    for (;;)
    {
      localObject2 = this.mTargetIds;
      int n = ((ArrayList)localObject2).size();
      if (j >= n) {
        break;
      }
      int i1 = ((Integer)this.mTargetIds.get(j)).intValue();
      localObject2 = paramViewGroup.findViewById(i1);
      if (localObject2 != null)
      {
        localObject3 = new androidx/transition/TransitionValues;
        ((TransitionValues)localObject3).<init>((View)localObject2);
        if (paramBoolean) {
          captureStartValues((TransitionValues)localObject3);
        } else {
          captureEndValues((TransitionValues)localObject3);
        }
        Object localObject4 = ((TransitionValues)localObject3).OooO0OO;
        ((ArrayList)localObject4).add(this);
        capturePropagationValues((TransitionValues)localObject3);
        if (paramBoolean) {
          localObject4 = this.mStartValues;
        } else {
          localObject4 = this.mEndValues;
        }
        OooO0O0((TransitionValuesMaps)localObject4, (View)localObject2, (TransitionValues)localObject3);
      }
      j += 1;
    }
    int i2 = 0;
    paramViewGroup = null;
    for (;;)
    {
      localObject1 = this.mTargets;
      k = ((ArrayList)localObject1).size();
      if (i2 >= k) {
        break;
      }
      localObject1 = (View)this.mTargets.get(i2);
      localObject2 = new androidx/transition/TransitionValues;
      ((TransitionValues)localObject2).<init>((View)localObject1);
      if (paramBoolean) {
        captureStartValues((TransitionValues)localObject2);
      } else {
        captureEndValues((TransitionValues)localObject2);
      }
      localObject3 = ((TransitionValues)localObject2).OooO0OO;
      ((ArrayList)localObject3).add(this);
      capturePropagationValues((TransitionValues)localObject2);
      if (paramBoolean) {
        localObject3 = this.mStartValues;
      } else {
        localObject3 = this.mEndValues;
      }
      OooO0O0((TransitionValuesMaps)localObject3, (View)localObject1, (TransitionValues)localObject2);
      i2 += 1;
    }
    label357:
    if (!paramBoolean)
    {
      paramViewGroup = this.mNameOverrides;
      if (paramViewGroup != null)
      {
        i2 = paramViewGroup.size();
        ArrayList localArrayList = new java/util/ArrayList;
        localArrayList.<init>(i2);
        k = 0;
        localObject1 = null;
        while (k < i2)
        {
          localObject2 = (String)this.mNameOverrides.OooO(k);
          localObject3 = this.mStartValues.OooO0Oo;
          localObject2 = ((SimpleArrayMap)localObject3).remove(localObject2);
          localArrayList.add(localObject2);
          k += 1;
        }
        while (m < i2)
        {
          localObject1 = (View)localArrayList.get(m);
          if (localObject1 != null)
          {
            localObject2 = (String)this.mNameOverrides.OooOOO0(m);
            localObject3 = this.mStartValues.OooO0Oo;
            ((SimpleArrayMap)localObject3).put(localObject2, localObject1);
          }
          m += 1;
        }
      }
    }
  }
  
  public void clearValues(boolean paramBoolean)
  {
    TransitionValuesMaps localTransitionValuesMaps;
    if (paramBoolean)
    {
      this.mStartValues.OooO00o.clear();
      this.mStartValues.OooO0O0.clear();
      localTransitionValuesMaps = this.mStartValues;
    }
    else
    {
      this.mEndValues.OooO00o.clear();
      this.mEndValues.OooO0O0.clear();
      localTransitionValuesMaps = this.mEndValues;
    }
    localTransitionValuesMaps.OooO0OO.OooO0O0();
  }
  
  public Transition clone()
  {
    try
    {
      Object localObject1 = super.clone();
      localObject1 = (Transition)localObject1;
      Object localObject2 = new java/util/ArrayList;
      ((ArrayList)localObject2).<init>();
      ((Transition)localObject1).mAnimators = ((ArrayList)localObject2);
      localObject2 = new androidx/transition/TransitionValuesMaps;
      ((TransitionValuesMaps)localObject2).<init>();
      ((Transition)localObject1).mStartValues = ((TransitionValuesMaps)localObject2);
      localObject2 = new androidx/transition/TransitionValuesMaps;
      ((TransitionValuesMaps)localObject2).<init>();
      ((Transition)localObject1).mEndValues = ((TransitionValuesMaps)localObject2);
      ((Transition)localObject1).mStartValuesList = null;
      ((Transition)localObject1).mEndValuesList = null;
      return localObject1;
    }
    catch (CloneNotSupportedException localCloneNotSupportedException) {}
    return null;
  }
  
  public Animator createAnimator(ViewGroup paramViewGroup, TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    return null;
  }
  
  public void createAnimators(ViewGroup paramViewGroup, TransitionValuesMaps paramTransitionValuesMaps1, TransitionValuesMaps paramTransitionValuesMaps2, ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    Transition localTransition = this;
    ViewGroup localViewGroup = paramViewGroup;
    ArrayMap localArrayMap = getRunningAnimators();
    SparseIntArray localSparseIntArray = new android/util/SparseIntArray;
    localSparseIntArray.<init>();
    int i = paramArrayList1.size();
    long l1 = 9223372036854775807L;
    int k = 0;
    Object localObject2;
    Object localObject4;
    int i2;
    int i4;
    Object localObject8;
    while (k < i)
    {
      Object localObject1 = paramArrayList1;
      localObject2 = (TransitionValues)paramArrayList1.get(k);
      Object localObject3 = paramArrayList2;
      localObject4 = (TransitionValues)paramArrayList2.get(k);
      Object localObject5;
      int m;
      if (localObject2 != null)
      {
        localObject5 = ((TransitionValues)localObject2).OooO0OO;
        m = ((ArrayList)localObject5).contains(localTransition);
        if (m == 0)
        {
          i1 = 0;
          localObject2 = null;
        }
      }
      if (localObject4 != null)
      {
        localObject5 = ((TransitionValues)localObject4).OooO0OO;
        m = ((ArrayList)localObject5).contains(localTransition);
        if (m == 0)
        {
          i2 = 0;
          localObject4 = null;
        }
      }
      if ((localObject2 == null) && (localObject4 == null)) {}
      int i3;
      do
      {
        do
        {
          i3 = i;
          break;
          if ((localObject2 != null) && (localObject4 != null))
          {
            m = localTransition.isTransitionRequired((TransitionValues)localObject2, (TransitionValues)localObject4);
            if (m == 0)
            {
              m = 0;
              localObject5 = null;
              continue;
            }
          }
          m = 1;
        } while (m == 0);
        localObject5 = localTransition.createAnimator(localViewGroup, (TransitionValues)localObject2, (TransitionValues)localObject4);
      } while (localObject5 == null);
      Object localObject6;
      Object localObject7;
      Object localObject9;
      Object localObject10;
      int i7;
      int n;
      if (localObject4 != null)
      {
        localObject6 = ((TransitionValues)localObject4).OooO0O0;
        localObject7 = getTransitionProperties();
        if (localObject7 != null)
        {
          i4 = localObject7.length;
          if (i4 > 0)
          {
            localObject8 = new androidx/transition/TransitionValues;
            ((TransitionValues)localObject8).<init>((View)localObject6);
            localObject9 = localObject5;
            i3 = i;
            localObject10 = paramTransitionValuesMaps2;
            localObject5 = (TransitionValues)paramTransitionValuesMaps2.OooO00o.get(localObject6);
            if (localObject5 != null)
            {
              i = 0;
              localObject10 = null;
              for (;;)
              {
                int i5 = localObject7.length;
                if (i >= i5) {
                  break;
                }
                localObject1 = ((TransitionValues)localObject8).OooO00o;
                localObject3 = localObject7[i];
                Object localObject11 = localObject7;
                localObject7 = ((TransitionValues)localObject5).OooO00o.get(localObject3);
                ((Map)localObject1).put(localObject3, localObject7);
                i += 1;
                localObject3 = paramArrayList2;
                localObject7 = localObject11;
              }
            }
            int i6 = localArrayMap.size();
            m = 0;
            localObject5 = null;
            while (m < i6)
            {
              localObject10 = (Animator)localArrayMap.OooO(m);
              localObject10 = (Transition.AnimationInfo)localArrayMap.get(localObject10);
              localObject1 = ((Transition.AnimationInfo)localObject10).OooO0OO;
              if (localObject1 != null)
              {
                localObject1 = ((Transition.AnimationInfo)localObject10).OooO00o;
                if (localObject1 == localObject6)
                {
                  localObject1 = ((Transition.AnimationInfo)localObject10).OooO0O0;
                  localObject3 = getName();
                  boolean bool = ((String)localObject1).equals(localObject3);
                  if (bool)
                  {
                    localObject10 = ((Transition.AnimationInfo)localObject10).OooO0OO;
                    j = ((TransitionValues)localObject10).equals(localObject8);
                    if (j != 0)
                    {
                      i7 = 0;
                      localObject7 = null;
                      break label535;
                    }
                  }
                }
              }
              m += 1;
            }
            localObject7 = localObject9;
            break label535;
          }
        }
        localObject9 = localObject5;
        i3 = j;
        localObject7 = localObject5;
        i4 = 0;
        localObject8 = null;
        label535:
        localObject10 = localObject7;
        localObject5 = localObject8;
      }
      else
      {
        localObject9 = localObject5;
        i3 = j;
        localObject7 = ((TransitionValues)localObject2).OooO0O0;
        localObject6 = localObject7;
        localObject10 = localObject5;
        n = 0;
        localObject5 = null;
      }
      if (localObject10 != null)
      {
        localObject7 = localTransition.mPropagation;
        if (localObject7 != null)
        {
          long l2 = ((TransitionPropagation)localObject7).OooO0O0(localViewGroup, localTransition, (TransitionValues)localObject2, (TransitionValues)localObject4);
          localObject7 = localTransition.mAnimators;
          i7 = ((ArrayList)localObject7).size();
          i4 = (int)l2;
          localSparseIntArray.put(i7, i4);
          l1 = Math.min(l2, l1);
        }
        localObject8 = new androidx/transition/Transition$AnimationInfo;
        localObject2 = getName();
        localObject7 = ViewUtils.OooO0Oo(paramViewGroup);
        Object localObject12 = localObject8;
        localObject4 = this;
        ((Transition.AnimationInfo)localObject8).<init>((View)localObject6, (String)localObject2, this, (WindowIdImpl)localObject7, (TransitionValues)localObject5);
        localArrayMap.put(localObject10, localObject8);
        localObject12 = localTransition.mAnimators;
        ((ArrayList)localObject12).add(localObject10);
      }
      k += 1;
      int j = i3;
    }
    int i1 = localSparseIntArray.size();
    if (i1 != 0)
    {
      i4 = 0;
      localObject8 = null;
      for (;;)
      {
        i1 = localSparseIntArray.size();
        if (i4 >= i1) {
          break;
        }
        i1 = localSparseIntArray.keyAt(i4);
        localObject4 = localTransition.mAnimators;
        localObject2 = (Animator)((ArrayList)localObject4).get(i1);
        i2 = localSparseIntArray.valueAt(i4);
        long l3 = i2 - l1;
        long l4 = ((Animator)localObject2).getStartDelay();
        l3 += l4;
        ((Animator)localObject2).setStartDelay(l3);
        i4 += 1;
      }
    }
  }
  
  public void end()
  {
    int i = this.mNumInstances;
    int j = 1;
    i -= j;
    this.mNumInstances = i;
    if (i == 0)
    {
      ArrayList localArrayList = this.mListeners;
      int k;
      if (localArrayList != null)
      {
        i = localArrayList.size();
        if (i > 0)
        {
          localArrayList = (ArrayList)this.mListeners.clone();
          k = localArrayList.size();
          int m = 0;
          while (m < k)
          {
            Transition.TransitionListener localTransitionListener = (Transition.TransitionListener)localArrayList.get(m);
            localTransitionListener.onTransitionEnd(this);
            m += 1;
          }
        }
      }
      i = 0;
      localArrayList = null;
      Object localObject;
      for (;;)
      {
        localObject = this.mStartValues.OooO0OO;
        k = ((LongSparseArray)localObject).OooOOOO();
        if (i >= k) {
          break;
        }
        localObject = (View)this.mStartValues.OooO0OO.OooOOOo(i);
        if (localObject != null) {
          ViewCompat.o000OOo((View)localObject, false);
        }
        i += 1;
      }
      i = 0;
      localArrayList = null;
      for (;;)
      {
        localObject = this.mEndValues.OooO0OO;
        k = ((LongSparseArray)localObject).OooOOOO();
        if (i >= k) {
          break;
        }
        localObject = (View)this.mEndValues.OooO0OO.OooOOOo(i);
        if (localObject != null) {
          ViewCompat.o000OOo((View)localObject, false);
        }
        i += 1;
      }
      this.mEnded = j;
    }
  }
  
  public Transition excludeChildren(int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList1 = this.mTargetIdChildExcludes;
    ArrayList localArrayList2 = OooO0o(localArrayList1, paramInt, paramBoolean);
    this.mTargetIdChildExcludes = localArrayList2;
    return this;
  }
  
  public Transition excludeChildren(View paramView, boolean paramBoolean)
  {
    ArrayList localArrayList = this.mTargetChildExcludes;
    paramView = OooOO0(localArrayList, paramView, paramBoolean);
    this.mTargetChildExcludes = paramView;
    return this;
  }
  
  public Transition excludeChildren(Class paramClass, boolean paramBoolean)
  {
    ArrayList localArrayList = this.mTargetTypeChildExcludes;
    paramClass = OooO(localArrayList, paramClass, paramBoolean);
    this.mTargetTypeChildExcludes = paramClass;
    return this;
  }
  
  public Transition excludeTarget(int paramInt, boolean paramBoolean)
  {
    ArrayList localArrayList1 = this.mTargetIdExcludes;
    ArrayList localArrayList2 = OooO0o(localArrayList1, paramInt, paramBoolean);
    this.mTargetIdExcludes = localArrayList2;
    return this;
  }
  
  public Transition excludeTarget(View paramView, boolean paramBoolean)
  {
    ArrayList localArrayList = this.mTargetExcludes;
    paramView = OooOO0(localArrayList, paramView, paramBoolean);
    this.mTargetExcludes = paramView;
    return this;
  }
  
  public Transition excludeTarget(Class paramClass, boolean paramBoolean)
  {
    ArrayList localArrayList = this.mTargetTypeExcludes;
    paramClass = OooO(localArrayList, paramClass, paramBoolean);
    this.mTargetTypeExcludes = paramClass;
    return this;
  }
  
  public Transition excludeTarget(String paramString, boolean paramBoolean)
  {
    paramString = OooO0oo(this.mTargetNameExcludes, paramString, paramBoolean);
    this.mTargetNameExcludes = paramString;
    return this;
  }
  
  public void forceToEnd(ViewGroup paramViewGroup)
  {
    Object localObject = getRunningAnimators();
    int i = ((SimpleArrayMap)localObject).size();
    if ((paramViewGroup != null) && (i != 0))
    {
      paramViewGroup = ViewUtils.OooO0Oo(paramViewGroup);
      ArrayMap localArrayMap = new androidx/collection/ArrayMap;
      localArrayMap.<init>((SimpleArrayMap)localObject);
      ((SimpleArrayMap)localObject).clear();
      i += -1;
      while (i >= 0)
      {
        localObject = (Transition.AnimationInfo)localArrayMap.OooOOO0(i);
        View localView = ((Transition.AnimationInfo)localObject).OooO00o;
        if ((localView != null) && (paramViewGroup != null))
        {
          localObject = ((Transition.AnimationInfo)localObject).OooO0Oo;
          boolean bool = paramViewGroup.equals(localObject);
          if (bool)
          {
            localObject = (Animator)localArrayMap.OooO(i);
            ((Animator)localObject).end();
          }
        }
        i += -1;
      }
    }
  }
  
  public long getDuration()
  {
    return this.mDuration;
  }
  
  public Rect getEpicenter()
  {
    Transition.EpicenterCallback localEpicenterCallback = this.mEpicenterCallback;
    if (localEpicenterCallback == null) {
      return null;
    }
    return localEpicenterCallback.OooO00o(this);
  }
  
  public Transition.EpicenterCallback getEpicenterCallback()
  {
    return this.mEpicenterCallback;
  }
  
  public TimeInterpolator getInterpolator()
  {
    return this.mInterpolator;
  }
  
  public TransitionValues getMatchedTransitionValues(View paramView, boolean paramBoolean)
  {
    Object localObject1 = this.mParent;
    if (localObject1 != null) {
      return ((Transition)localObject1).getMatchedTransitionValues(paramView, paramBoolean);
    }
    if (paramBoolean) {
      localObject1 = this.mStartValuesList;
    } else {
      localObject1 = this.mEndValuesList;
    }
    Object localObject2 = null;
    if (localObject1 == null) {
      return null;
    }
    int i = ((ArrayList)localObject1).size();
    int j = 0;
    while (j < i)
    {
      Object localObject3 = (TransitionValues)((ArrayList)localObject1).get(j);
      if (localObject3 == null) {
        return null;
      }
      localObject3 = ((TransitionValues)localObject3).OooO0O0;
      if (localObject3 == paramView) {
        break label104;
      }
      j += 1;
    }
    j = -1;
    label104:
    if (j >= 0)
    {
      if (paramBoolean) {
        paramView = this.mEndValuesList;
      } else {
        paramView = this.mStartValuesList;
      }
      paramView = paramView.get(j);
      localObject2 = paramView;
      localObject2 = (TransitionValues)paramView;
    }
    return localObject2;
  }
  
  public String getName()
  {
    return this.mName;
  }
  
  public PathMotion getPathMotion()
  {
    return this.mPathMotion;
  }
  
  public TransitionPropagation getPropagation()
  {
    return this.mPropagation;
  }
  
  public long getStartDelay()
  {
    return this.mStartDelay;
  }
  
  public List getTargetIds()
  {
    return this.mTargetIds;
  }
  
  public List getTargetNames()
  {
    return this.mTargetNames;
  }
  
  public List getTargetTypes()
  {
    return this.mTargetTypes;
  }
  
  public List getTargets()
  {
    return this.mTargets;
  }
  
  public String[] getTransitionProperties()
  {
    return null;
  }
  
  public TransitionValues getTransitionValues(View paramView, boolean paramBoolean)
  {
    TransitionSet localTransitionSet = this.mParent;
    if (localTransitionSet != null) {
      return localTransitionSet.getTransitionValues(paramView, paramBoolean);
    }
    TransitionValuesMaps localTransitionValuesMaps;
    if (paramBoolean) {
      localTransitionValuesMaps = this.mStartValues;
    } else {
      localTransitionValuesMaps = this.mEndValues;
    }
    return (TransitionValues)localTransitionValuesMaps.OooO00o.get(paramView);
  }
  
  public boolean isTransitionRequired(TransitionValues paramTransitionValues1, TransitionValues paramTransitionValues2)
  {
    boolean bool1 = false;
    if ((paramTransitionValues1 != null) && (paramTransitionValues2 != null))
    {
      Object localObject = getTransitionProperties();
      boolean bool2 = true;
      if (localObject != null)
      {
        int i = localObject.length;
        int j = 0;
        for (;;)
        {
          if (j >= i) {
            return bool1;
          }
          String str1 = localObject[j];
          boolean bool4 = OooOO0O(paramTransitionValues1, paramTransitionValues2, str1);
          if (bool4) {
            break;
          }
          j += 1;
        }
      }
      localObject = paramTransitionValues1.OooO00o.keySet().iterator();
      boolean bool3;
      do
      {
        bool3 = ((Iterator)localObject).hasNext();
        if (!bool3) {
          break;
        }
        String str2 = (String)((Iterator)localObject).next();
        bool3 = OooOO0O(paramTransitionValues1, paramTransitionValues2, str2);
      } while (!bool3);
      bool1 = bool2;
    }
    return bool1;
  }
  
  public boolean isValidTarget(View paramView)
  {
    int i = paramView.getId();
    Object localObject1 = this.mTargetIdExcludes;
    Object localObject2;
    boolean bool1;
    if (localObject1 != null)
    {
      localObject2 = Integer.valueOf(i);
      bool1 = ((ArrayList)localObject1).contains(localObject2);
      if (bool1) {
        return false;
      }
    }
    localObject1 = this.mTargetExcludes;
    if (localObject1 != null)
    {
      bool1 = ((ArrayList)localObject1).contains(paramView);
      if (bool1) {
        return false;
      }
    }
    localObject1 = this.mTargetTypeExcludes;
    if (localObject1 != null)
    {
      int m = ((ArrayList)localObject1).size();
      i2 = 0;
      localObject2 = null;
      while (i2 < m)
      {
        Class localClass = (Class)this.mTargetTypeExcludes.get(i2);
        boolean bool5 = localClass.isInstance(paramView);
        if (bool5) {
          return false;
        }
        i2 += 1;
      }
    }
    localObject1 = this.mTargetNameExcludes;
    if (localObject1 != null)
    {
      localObject1 = ViewCompat.Oooo0O0(paramView);
      if (localObject1 != null)
      {
        localObject1 = this.mTargetNameExcludes;
        localObject2 = ViewCompat.Oooo0O0(paramView);
        boolean bool2 = ((ArrayList)localObject1).contains(localObject2);
        if (bool2) {
          return false;
        }
      }
    }
    localObject1 = this.mTargetIds;
    int n = ((ArrayList)localObject1).size();
    int i2 = 1;
    if (n == 0)
    {
      localObject1 = this.mTargets;
      n = ((ArrayList)localObject1).size();
      if (n == 0)
      {
        localObject1 = this.mTargetTypes;
        boolean bool3;
        if (localObject1 != null)
        {
          bool3 = ((ArrayList)localObject1).isEmpty();
          if (!bool3) {}
        }
        else
        {
          localObject1 = this.mTargetNames;
          if (localObject1 != null)
          {
            bool3 = ((ArrayList)localObject1).isEmpty();
            if (!bool3) {}
          }
          else
          {
            return i2;
          }
        }
      }
    }
    localObject1 = this.mTargetIds;
    Object localObject3 = Integer.valueOf(i);
    int j = ((ArrayList)localObject1).contains(localObject3);
    if (j == 0)
    {
      localObject3 = this.mTargets;
      j = ((ArrayList)localObject3).contains(paramView);
      if (j == 0)
      {
        localObject3 = this.mTargetNames;
        if (localObject3 != null)
        {
          localObject1 = ViewCompat.Oooo0O0(paramView);
          j = ((ArrayList)localObject3).contains(localObject1);
          if (j != 0) {
            return i2;
          }
        }
        localObject3 = this.mTargetTypes;
        if (localObject3 != null)
        {
          j = 0;
          localObject3 = null;
          for (;;)
          {
            localObject1 = this.mTargetTypes;
            int i1 = ((ArrayList)localObject1).size();
            if (j >= i1) {
              break;
            }
            localObject1 = (Class)this.mTargetTypes.get(j);
            boolean bool4 = ((Class)localObject1).isInstance(paramView);
            if (bool4) {
              return i2;
            }
            int k;
            j += 1;
          }
        }
        return false;
      }
    }
    return i2;
  }
  
  public void pause(View paramView)
  {
    boolean bool = this.mEnded;
    if (!bool)
    {
      paramView = this.mCurrentAnimators;
      int i = paramView.size();
      int j = 1;
      i -= j;
      while (i >= 0)
      {
        Animator localAnimator = (Animator)this.mCurrentAnimators.get(i);
        AnimatorUtils.OooO0O0(localAnimator);
        i += -1;
      }
      paramView = this.mListeners;
      if (paramView != null)
      {
        i = paramView.size();
        if (i > 0)
        {
          paramView = (ArrayList)this.mListeners.clone();
          int k = paramView.size();
          int m = 0;
          while (m < k)
          {
            Transition.TransitionListener localTransitionListener = (Transition.TransitionListener)paramView.get(m);
            localTransitionListener.onTransitionPause(this);
            m += 1;
          }
        }
      }
      this.mPaused = j;
    }
  }
  
  public void playTransition(ViewGroup paramViewGroup)
  {
    Object localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.mStartValuesList = ((ArrayList)localObject1);
    localObject1 = new java/util/ArrayList;
    ((ArrayList)localObject1).<init>();
    this.mEndValuesList = ((ArrayList)localObject1);
    localObject1 = this.mStartValues;
    TransitionValuesMaps localTransitionValuesMaps = this.mEndValues;
    OooOOOo((TransitionValuesMaps)localObject1, localTransitionValuesMaps);
    localObject1 = getRunningAnimators();
    int i = ((SimpleArrayMap)localObject1).size();
    WindowIdImpl localWindowIdImpl = ViewUtils.OooO0Oo(paramViewGroup);
    int j = 1;
    i -= j;
    while (i >= 0)
    {
      localObject2 = (Animator)((SimpleArrayMap)localObject1).OooO(i);
      if (localObject2 != null)
      {
        localObject3 = (Transition.AnimationInfo)((SimpleArrayMap)localObject1).get(localObject2);
        if (localObject3 != null)
        {
          localObject4 = ((Transition.AnimationInfo)localObject3).OooO00o;
          if (localObject4 != null)
          {
            localObject4 = ((Transition.AnimationInfo)localObject3).OooO0Oo;
            boolean bool1 = localWindowIdImpl.equals(localObject4);
            if (bool1)
            {
              localObject4 = ((Transition.AnimationInfo)localObject3).OooO0OO;
              localObject5 = ((Transition.AnimationInfo)localObject3).OooO00o;
              localObject6 = getTransitionValues((View)localObject5, j);
              localObject7 = getMatchedTransitionValues((View)localObject5, j);
              if ((localObject6 == null) && (localObject7 == null))
              {
                localObject5 = this.mEndValues.OooO00o.get(localObject5);
                localObject7 = localObject5;
                localObject7 = (TransitionValues)localObject5;
              }
              if ((localObject6 != null) || (localObject7 != null))
              {
                localObject3 = ((Transition.AnimationInfo)localObject3).OooO0o0;
                bool2 = ((Transition)localObject3).isTransitionRequired((TransitionValues)localObject4, (TransitionValues)localObject7);
                if (bool2)
                {
                  bool2 = j;
                  break label253;
                }
              }
              boolean bool2 = false;
              localObject3 = null;
              label253:
              if (bool2)
              {
                bool2 = ((Animator)localObject2).isRunning();
                if (!bool2)
                {
                  bool2 = ((Animator)localObject2).isStarted();
                  if (!bool2)
                  {
                    ((SimpleArrayMap)localObject1).remove(localObject2);
                    break label300;
                  }
                }
                ((Animator)localObject2).cancel();
              }
            }
          }
        }
      }
      label300:
      i += -1;
    }
    Object localObject4 = this.mStartValues;
    Object localObject5 = this.mEndValues;
    Object localObject6 = this.mStartValuesList;
    Object localObject7 = this.mEndValuesList;
    Object localObject2 = this;
    Object localObject3 = paramViewGroup;
    createAnimators(paramViewGroup, (TransitionValuesMaps)localObject4, (TransitionValuesMaps)localObject5, (ArrayList)localObject6, (ArrayList)localObject7);
    runAnimators();
  }
  
  public Transition removeListener(Transition.TransitionListener paramTransitionListener)
  {
    ArrayList localArrayList = this.mListeners;
    if (localArrayList == null) {
      return this;
    }
    localArrayList.remove(paramTransitionListener);
    paramTransitionListener = this.mListeners;
    int i = paramTransitionListener.size();
    if (i == 0)
    {
      i = 0;
      paramTransitionListener = null;
      this.mListeners = null;
    }
    return this;
  }
  
  public Transition removeTarget(int paramInt)
  {
    if (paramInt != 0)
    {
      ArrayList localArrayList = this.mTargetIds;
      Integer localInteger = Integer.valueOf(paramInt);
      localArrayList.remove(localInteger);
    }
    return this;
  }
  
  public Transition removeTarget(View paramView)
  {
    this.mTargets.remove(paramView);
    return this;
  }
  
  public Transition removeTarget(Class paramClass)
  {
    ArrayList localArrayList = this.mTargetTypes;
    if (localArrayList != null) {
      localArrayList.remove(paramClass);
    }
    return this;
  }
  
  public Transition removeTarget(String paramString)
  {
    ArrayList localArrayList = this.mTargetNames;
    if (localArrayList != null) {
      localArrayList.remove(paramString);
    }
    return this;
  }
  
  public void resume(View paramView)
  {
    boolean bool = this.mPaused;
    if (bool)
    {
      bool = this.mEnded;
      if (!bool)
      {
        paramView = this.mCurrentAnimators;
        int i = paramView.size() + -1;
        while (i >= 0)
        {
          Animator localAnimator = (Animator)this.mCurrentAnimators.get(i);
          AnimatorUtils.OooO0OO(localAnimator);
          i += -1;
        }
        paramView = this.mListeners;
        if (paramView != null)
        {
          i = paramView.size();
          if (i > 0)
          {
            paramView = (ArrayList)this.mListeners.clone();
            int j = paramView.size();
            int k = 0;
            while (k < j)
            {
              Transition.TransitionListener localTransitionListener = (Transition.TransitionListener)paramView.get(k);
              localTransitionListener.onTransitionResume(this);
              k += 1;
            }
          }
        }
      }
      this.mPaused = false;
    }
  }
  
  public void runAnimators()
  {
    start();
    ArrayMap localArrayMap = getRunningAnimators();
    Iterator localIterator = this.mAnimators.iterator();
    for (;;)
    {
      boolean bool1 = localIterator.hasNext();
      if (!bool1) {
        break;
      }
      Animator localAnimator = (Animator)localIterator.next();
      boolean bool2 = localArrayMap.containsKey(localAnimator);
      if (bool2)
      {
        start();
        OooOOo0(localAnimator, localArrayMap);
      }
    }
    this.mAnimators.clear();
    end();
  }
  
  public void setCanRemoveViews(boolean paramBoolean)
  {
    this.mCanRemoveViews = paramBoolean;
  }
  
  public Transition setDuration(long paramLong)
  {
    this.mDuration = paramLong;
    return this;
  }
  
  public void setEpicenterCallback(Transition.EpicenterCallback paramEpicenterCallback)
  {
    this.mEpicenterCallback = paramEpicenterCallback;
  }
  
  public Transition setInterpolator(TimeInterpolator paramTimeInterpolator)
  {
    this.mInterpolator = paramTimeInterpolator;
    return this;
  }
  
  public void setMatchOrder(int... paramVarArgs)
  {
    if (paramVarArgs != null)
    {
      int i = paramVarArgs.length;
      if (i != 0)
      {
        i = 0;
        for (;;)
        {
          int j = paramVarArgs.length;
          if (i >= j) {
            break label78;
          }
          boolean bool = isValidMatch(paramVarArgs[i]);
          if (!bool) {
            break label65;
          }
          bool = OooO0OO(paramVarArgs, i);
          if (bool) {
            break;
          }
          i += 1;
        }
        paramVarArgs = new java/lang/IllegalArgumentException;
        paramVarArgs.<init>("matches contains a duplicate value");
        throw paramVarArgs;
        label65:
        paramVarArgs = new java/lang/IllegalArgumentException;
        paramVarArgs.<init>("matches contains invalid value");
        throw paramVarArgs;
        label78:
        paramVarArgs = (int[])paramVarArgs.clone();
        this.mMatchOrder = paramVarArgs;
        return;
      }
    }
    paramVarArgs = DEFAULT_MATCH_ORDER;
    this.mMatchOrder = paramVarArgs;
  }
  
  public void setPathMotion(PathMotion paramPathMotion)
  {
    if (paramPathMotion == null) {
      paramPathMotion = STRAIGHT_PATH_MOTION;
    }
    this.mPathMotion = paramPathMotion;
  }
  
  public void setPropagation(TransitionPropagation paramTransitionPropagation)
  {
    this.mPropagation = paramTransitionPropagation;
  }
  
  public Transition setStartDelay(long paramLong)
  {
    this.mStartDelay = paramLong;
    return this;
  }
  
  public void start()
  {
    int i = this.mNumInstances;
    if (i == 0)
    {
      ArrayList localArrayList = this.mListeners;
      if (localArrayList != null)
      {
        i = localArrayList.size();
        if (i > 0)
        {
          localArrayList = (ArrayList)this.mListeners.clone();
          int j = localArrayList.size();
          int k = 0;
          while (k < j)
          {
            Transition.TransitionListener localTransitionListener = (Transition.TransitionListener)localArrayList.get(k);
            localTransitionListener.onTransitionStart(this);
            k += 1;
          }
        }
      }
      this.mEnded = false;
    }
    i = this.mNumInstances + 1;
    this.mNumInstances = i;
  }
  
  public String toString()
  {
    return toString("");
  }
  
  public String toString(String paramString)
  {
    Object localObject1 = new java/lang/StringBuilder;
    ((StringBuilder)localObject1).<init>();
    ((StringBuilder)localObject1).append(paramString);
    paramString = getClass().getSimpleName();
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append("@");
    int i = hashCode();
    paramString = Integer.toHexString(i);
    ((StringBuilder)localObject1).append(paramString);
    ((StringBuilder)localObject1).append(": ");
    paramString = ((StringBuilder)localObject1).toString();
    long l1 = this.mDuration;
    long l2 = -1;
    boolean bool = l1 < l2;
    String str = ") ";
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append(paramString);
      ((StringBuilder)localObject1).append("dur(");
      l3 = this.mDuration;
      ((StringBuilder)localObject1).append(l3);
      ((StringBuilder)localObject1).append(str);
      paramString = ((StringBuilder)localObject1).toString();
    }
    long l3 = this.mStartDelay;
    bool = l3 < l2;
    if (bool)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append(paramString);
      ((StringBuilder)localObject1).append("dly(");
      l2 = this.mStartDelay;
      ((StringBuilder)localObject1).append(l2);
      ((StringBuilder)localObject1).append(str);
      paramString = ((StringBuilder)localObject1).toString();
    }
    localObject1 = this.mInterpolator;
    if (localObject1 != null)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append(paramString);
      ((StringBuilder)localObject1).append("interp(");
      paramString = this.mInterpolator;
      ((StringBuilder)localObject1).append(paramString);
      ((StringBuilder)localObject1).append(str);
      paramString = ((StringBuilder)localObject1).toString();
    }
    localObject1 = this.mTargetIds;
    int j = ((ArrayList)localObject1).size();
    if (j <= 0)
    {
      localObject1 = this.mTargets;
      j = ((ArrayList)localObject1).size();
      if (j <= 0) {}
    }
    else
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append(paramString);
      ((StringBuilder)localObject1).append("tgts(");
      paramString = ((StringBuilder)localObject1).toString();
      localObject1 = this.mTargetIds;
      j = ((ArrayList)localObject1).size();
      str = ", ";
      int k = 0;
      if (j > 0)
      {
        j = 0;
        localObject1 = null;
        for (;;)
        {
          Object localObject2 = this.mTargetIds;
          int m = ((ArrayList)localObject2).size();
          if (j >= m) {
            break;
          }
          if (j > 0)
          {
            localObject2 = new java/lang/StringBuilder;
            ((StringBuilder)localObject2).<init>();
            ((StringBuilder)localObject2).append(paramString);
            ((StringBuilder)localObject2).append(str);
            paramString = ((StringBuilder)localObject2).toString();
          }
          localObject2 = new java/lang/StringBuilder;
          ((StringBuilder)localObject2).<init>();
          ((StringBuilder)localObject2).append(paramString);
          paramString = this.mTargetIds.get(j);
          ((StringBuilder)localObject2).append(paramString);
          paramString = ((StringBuilder)localObject2).toString();
          j += 1;
        }
      }
      localObject1 = this.mTargets;
      j = ((ArrayList)localObject1).size();
      if (j > 0) {
        for (;;)
        {
          localObject1 = this.mTargets;
          j = ((ArrayList)localObject1).size();
          if (k >= j) {
            break;
          }
          if (k > 0)
          {
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            ((StringBuilder)localObject1).append(paramString);
            ((StringBuilder)localObject1).append(str);
            paramString = ((StringBuilder)localObject1).toString();
          }
          localObject1 = new java/lang/StringBuilder;
          ((StringBuilder)localObject1).<init>();
          ((StringBuilder)localObject1).append(paramString);
          paramString = this.mTargets.get(k);
          ((StringBuilder)localObject1).append(paramString);
          paramString = ((StringBuilder)localObject1).toString();
          k += 1;
        }
      }
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append(paramString);
      ((StringBuilder)localObject1).append(")");
      paramString = ((StringBuilder)localObject1).toString();
    }
    return paramString;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.transition.Transition
 * JD-Core Version:    0.7.0.1
 */