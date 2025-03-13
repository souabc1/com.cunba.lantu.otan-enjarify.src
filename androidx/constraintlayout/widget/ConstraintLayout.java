package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import androidx.constraintlayout.core.Metrics;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintAnchor.Type;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidget.DimensionBehaviour;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.constraintlayout.core.widgets.WidgetContainer;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure.Measurer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public class ConstraintLayout
  extends ViewGroup
{
  private static final boolean DEBUG = false;
  private static final boolean DEBUG_DRAW_CONSTRAINTS = false;
  public static final int DESIGN_INFO_ID = 0;
  private static final boolean MEASURE = false;
  private static final boolean OPTIMIZE_HEIGHT_CHANGE = false;
  private static final String TAG = "ConstraintLayout";
  private static final boolean USE_CONSTRAINTS_HELPER = true;
  public static final String VERSION = "ConstraintLayout-2.1.4";
  private static SharedValues sSharedValues;
  SparseArray mChildrenByIds;
  private ArrayList mConstraintHelpers;
  protected ConstraintLayoutStates mConstraintLayoutSpec;
  private ConstraintSet mConstraintSet;
  private int mConstraintSetId;
  private ConstraintsChangedListener mConstraintsChangedListener;
  private HashMap mDesignIds;
  protected boolean mDirtyHierarchy;
  private int mLastMeasureHeight;
  int mLastMeasureHeightMode;
  int mLastMeasureHeightSize;
  private int mLastMeasureWidth;
  int mLastMeasureWidthMode;
  int mLastMeasureWidthSize;
  protected ConstraintWidgetContainer mLayoutWidget;
  private int mMaxHeight;
  private int mMaxWidth;
  ConstraintLayout.Measurer mMeasurer;
  private Metrics mMetrics;
  private int mMinHeight;
  private int mMinWidth;
  private int mOnMeasureHeightMeasureSpec;
  private int mOnMeasureWidthMeasureSpec;
  private int mOptimizationLevel;
  private SparseArray mTempMapIdToWidget;
  
  public ConstraintLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = new android/util/SparseArray;
    paramContext.<init>();
    this.mChildrenByIds = paramContext;
    paramContext = new java/util/ArrayList;
    paramContext.<init>(4);
    this.mConstraintHelpers = paramContext;
    paramContext = new androidx/constraintlayout/core/widgets/ConstraintWidgetContainer;
    paramContext.<init>();
    this.mLayoutWidget = paramContext;
    this.mMinWidth = 0;
    this.mMinHeight = 0;
    int i = -1 >>> 1;
    this.mMaxWidth = i;
    this.mMaxHeight = i;
    this.mDirtyHierarchy = true;
    this.mOptimizationLevel = 257;
    this.mConstraintSet = null;
    this.mConstraintLayoutSpec = null;
    i = -1;
    this.mConstraintSetId = i;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.mDesignIds = localHashMap;
    this.mLastMeasureWidth = i;
    this.mLastMeasureHeight = i;
    this.mLastMeasureWidthSize = i;
    this.mLastMeasureHeightSize = i;
    this.mLastMeasureWidthMode = 0;
    this.mLastMeasureHeightMode = 0;
    Object localObject = new android/util/SparseArray;
    ((SparseArray)localObject).<init>();
    this.mTempMapIdToWidget = ((SparseArray)localObject);
    localObject = new androidx/constraintlayout/widget/ConstraintLayout$Measurer;
    ((ConstraintLayout.Measurer)localObject).<init>(this, this);
    this.mMeasurer = ((ConstraintLayout.Measurer)localObject);
    this.mOnMeasureWidthMeasureSpec = 0;
    this.mOnMeasureHeightMeasureSpec = 0;
    OooO00o(paramAttributeSet, 0, 0);
  }
  
  public ConstraintLayout(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = new android/util/SparseArray;
    paramContext.<init>();
    this.mChildrenByIds = paramContext;
    paramContext = new java/util/ArrayList;
    paramContext.<init>(4);
    this.mConstraintHelpers = paramContext;
    paramContext = new androidx/constraintlayout/core/widgets/ConstraintWidgetContainer;
    paramContext.<init>();
    this.mLayoutWidget = paramContext;
    this.mMinWidth = 0;
    this.mMinHeight = 0;
    int i = -1 >>> 1;
    this.mMaxWidth = i;
    this.mMaxHeight = i;
    this.mDirtyHierarchy = true;
    this.mOptimizationLevel = 257;
    this.mConstraintSet = null;
    this.mConstraintLayoutSpec = null;
    i = -1;
    this.mConstraintSetId = i;
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.mDesignIds = localHashMap;
    this.mLastMeasureWidth = i;
    this.mLastMeasureHeight = i;
    this.mLastMeasureWidthSize = i;
    this.mLastMeasureHeightSize = i;
    this.mLastMeasureWidthMode = 0;
    this.mLastMeasureHeightMode = 0;
    Object localObject = new android/util/SparseArray;
    ((SparseArray)localObject).<init>();
    this.mTempMapIdToWidget = ((SparseArray)localObject);
    localObject = new androidx/constraintlayout/widget/ConstraintLayout$Measurer;
    ((ConstraintLayout.Measurer)localObject).<init>(this, this);
    this.mMeasurer = ((ConstraintLayout.Measurer)localObject);
    this.mOnMeasureWidthMeasureSpec = 0;
    this.mOnMeasureHeightMeasureSpec = 0;
    OooO00o(paramAttributeSet, paramInt, 0);
  }
  
  private int getPaddingWidth()
  {
    int i = getPaddingLeft();
    i = Math.max(0, i);
    int j = getPaddingRight();
    j = Math.max(0, j);
    i += j;
    j = getPaddingStart();
    j = Math.max(0, j);
    int k = getPaddingEnd();
    int m = Math.max(0, k);
    j += m;
    if (j > 0) {
      i = j;
    }
    return i;
  }
  
  public static SharedValues getSharedValues()
  {
    SharedValues localSharedValues = sSharedValues;
    if (localSharedValues == null)
    {
      localSharedValues = new androidx/constraintlayout/widget/SharedValues;
      localSharedValues.<init>();
      sSharedValues = localSharedValues;
    }
    return sSharedValues;
  }
  
  private final ConstraintWidget getTargetWidget(int paramInt)
  {
    if (paramInt == 0) {
      return this.mLayoutWidget;
    }
    View localView = (View)this.mChildrenByIds.get(paramInt);
    Object localObject;
    if (localView == null)
    {
      localView = findViewById(paramInt);
      if ((localView != null) && (localView != this))
      {
        localObject = localView.getParent();
        if (localObject == this) {
          onViewAdded(localView);
        }
      }
    }
    if (localView == this) {
      return this.mLayoutWidget;
    }
    if (localView == null)
    {
      paramInt = 0;
      localObject = null;
    }
    else
    {
      localObject = ((ConstraintLayout.LayoutParams)localView.getLayoutParams()).o0ooOOo;
    }
    return localObject;
  }
  
  public final void OooO00o(AttributeSet paramAttributeSet, int paramInt1, int paramInt2)
  {
    this.mLayoutWidget.setCompanionWidget(this);
    Object localObject1 = this.mLayoutWidget;
    Object localObject2 = this.mMeasurer;
    ((ConstraintWidgetContainer)localObject1).setMeasurer((BasicMeasure.Measurer)localObject2);
    localObject1 = this.mChildrenByIds;
    int i = getId();
    ((SparseArray)localObject1).put(i, this);
    localObject1 = null;
    this.mConstraintSet = null;
    if (paramAttributeSet != null)
    {
      localObject2 = getContext();
      int[] arrayOfInt = R.styleable.ConstraintLayout_Layout;
      paramAttributeSet = ((Context)localObject2).obtainStyledAttributes(paramAttributeSet, arrayOfInt, paramInt1, paramInt2);
      paramInt1 = paramAttributeSet.getIndexCount();
      paramInt2 = 0;
      i = 0;
      localObject2 = null;
      while (i < paramInt1)
      {
        int j = paramAttributeSet.getIndex(i);
        int k = R.styleable.ConstraintLayout_Layout_android_minWidth;
        if (j == k)
        {
          k = this.mMinWidth;
          j = paramAttributeSet.getDimensionPixelOffset(j, k);
          this.mMinWidth = j;
        }
        else
        {
          k = R.styleable.ConstraintLayout_Layout_android_minHeight;
          if (j == k)
          {
            k = this.mMinHeight;
            j = paramAttributeSet.getDimensionPixelOffset(j, k);
            this.mMinHeight = j;
          }
          else
          {
            k = R.styleable.ConstraintLayout_Layout_android_maxWidth;
            if (j == k)
            {
              k = this.mMaxWidth;
              j = paramAttributeSet.getDimensionPixelOffset(j, k);
              this.mMaxWidth = j;
            }
            else
            {
              k = R.styleable.ConstraintLayout_Layout_android_maxHeight;
              if (j == k)
              {
                k = this.mMaxHeight;
                j = paramAttributeSet.getDimensionPixelOffset(j, k);
                this.mMaxHeight = j;
              }
              else
              {
                k = R.styleable.ConstraintLayout_Layout_layout_optimizationLevel;
                if (j == k)
                {
                  k = this.mOptimizationLevel;
                  j = paramAttributeSet.getInt(j, k);
                  this.mOptimizationLevel = j;
                }
                else
                {
                  k = R.styleable.ConstraintLayout_Layout_layoutDescription;
                  if (j == k)
                  {
                    j = paramAttributeSet.getResourceId(j, 0);
                    if (j != 0) {
                      try
                      {
                        parseLayoutDescription(j);
                      }
                      catch (Resources.NotFoundException localNotFoundException1)
                      {
                        this.mConstraintLayoutSpec = null;
                      }
                    }
                  }
                  else
                  {
                    k = R.styleable.ConstraintLayout_Layout_constraintSet;
                    if (j == k)
                    {
                      j = paramAttributeSet.getResourceId(j, 0);
                      try
                      {
                        ConstraintSet localConstraintSet = new androidx/constraintlayout/widget/ConstraintSet;
                        localConstraintSet.<init>();
                        this.mConstraintSet = localConstraintSet;
                        Context localContext = getContext();
                        localConstraintSet.OooOo0(localContext, j);
                      }
                      catch (Resources.NotFoundException localNotFoundException2)
                      {
                        this.mConstraintSet = null;
                      }
                      this.mConstraintSetId = j;
                    }
                  }
                }
              }
            }
          }
        }
        i += 1;
      }
      paramAttributeSet.recycle();
    }
    paramAttributeSet = this.mLayoutWidget;
    paramInt1 = this.mOptimizationLevel;
    paramAttributeSet.setOptimizationLevel(paramInt1);
  }
  
  public final void OooO0O0()
  {
    this.mDirtyHierarchy = true;
    int i = -1;
    this.mLastMeasureWidth = i;
    this.mLastMeasureHeight = i;
    this.mLastMeasureWidthSize = i;
    this.mLastMeasureHeightSize = i;
    this.mLastMeasureWidthMode = 0;
    this.mLastMeasureHeightMode = 0;
  }
  
  public final void OooO0OO()
  {
    int i = isInEditMode();
    int j = getChildCount();
    Object localObject1 = null;
    int k = 0;
    Object localObject2 = null;
    Object localObject3;
    while (k < j)
    {
      localObject3 = getChildAt(k);
      localObject3 = getViewWidget((View)localObject3);
      if (localObject3 != null) {
        ((ConstraintWidget)localObject3).OooOooO();
      }
      k += 1;
    }
    k = -1;
    int m;
    Object localObject4;
    if (i != 0)
    {
      m = 0;
      localObject3 = null;
      while (m < j)
      {
        localObject4 = getChildAt(m);
        try
        {
          localObject5 = getResources();
          int i1 = ((View)localObject4).getId();
          localObject5 = ((Resources)localObject5).getResourceName(i1);
          i1 = ((View)localObject4).getId();
          localObject6 = Integer.valueOf(i1);
          setDesignInformation(0, localObject5, localObject6);
          i1 = 47;
          i1 = ((String)localObject5).indexOf(i1);
          if (i1 != k)
          {
            i1 += 1;
            localObject5 = ((String)localObject5).substring(i1);
          }
          i2 = ((View)localObject4).getId();
          localObject4 = getTargetWidget(i2);
          ((ConstraintWidget)localObject4).setDebugName((String)localObject5);
        }
        catch (Resources.NotFoundException localNotFoundException)
        {
          Object localObject5;
          Object localObject6;
          int i2;
          label191:
          boolean bool;
          int n;
          int i4;
          break label191;
        }
        m += 1;
      }
    }
    else
    {
      m = this.mConstraintSetId;
      if (m != k)
      {
        k = 0;
        localObject2 = null;
        while (k < j)
        {
          localObject3 = getChildAt(k);
          i2 = ((View)localObject3).getId();
          int i3 = this.mConstraintSetId;
          if (i2 == i3)
          {
            bool = localObject3 instanceof Constraints;
            if (bool)
            {
              localObject3 = ((Constraints)localObject3).getConstraintSet();
              this.mConstraintSet = ((ConstraintSet)localObject3);
            }
          }
          k += 1;
        }
      }
      localObject2 = this.mConstraintSet;
      if (localObject2 != null)
      {
        m = 1;
        ((ConstraintSet)localObject2).OooOO0O(this, m);
      }
      this.mLayoutWidget.OoooO();
      localObject2 = this.mConstraintHelpers;
      k = ((ArrayList)localObject2).size();
      if (k > 0)
      {
        n = 0;
        localObject3 = null;
        while (n < k)
        {
          localObject4 = (ConstraintHelper)this.mConstraintHelpers.get(n);
          ((ConstraintHelper)localObject4).OooOo0O(this);
          n += 1;
        }
      }
      k = 0;
      localObject2 = null;
      while (k < j)
      {
        localObject3 = getChildAt(k);
        bool = localObject3 instanceof Placeholder;
        if (bool)
        {
          localObject3 = (Placeholder)localObject3;
          ((Placeholder)localObject3).OooO0O0(this);
        }
        k += 1;
      }
      this.mTempMapIdToWidget.clear();
      localObject2 = this.mTempMapIdToWidget;
      localObject3 = this.mLayoutWidget;
      ((SparseArray)localObject2).put(0, localObject3);
      localObject2 = this.mTempMapIdToWidget;
      n = getId();
      localObject4 = this.mLayoutWidget;
      ((SparseArray)localObject2).put(n, localObject4);
      k = 0;
      localObject2 = null;
      while (k < j)
      {
        localObject3 = getChildAt(k);
        localObject4 = getViewWidget((View)localObject3);
        localObject5 = this.mTempMapIdToWidget;
        n = ((View)localObject3).getId();
        ((SparseArray)localObject5).put(n, localObject4);
        k += 1;
      }
      i4 = 0;
      while (i4 < j)
      {
        localObject3 = getChildAt(i4);
        localObject4 = getViewWidget((View)localObject3);
        if (localObject4 != null)
        {
          localObject1 = ((View)localObject3).getLayoutParams();
          localObject5 = localObject1;
          localObject5 = (ConstraintLayout.LayoutParams)localObject1;
          this.mLayoutWidget.OooO0O0((ConstraintWidget)localObject4);
          localObject6 = this.mTempMapIdToWidget;
          localObject1 = this;
          k = i;
          applyConstraintsFromLayoutParams(i, (View)localObject3, (ConstraintWidget)localObject4, (ConstraintLayout.LayoutParams)localObject5, (SparseArray)localObject6);
        }
        i4 += 1;
      }
      return;
    }
  }
  
  public final void OooO0Oo(ConstraintWidget paramConstraintWidget, ConstraintLayout.LayoutParams paramLayoutParams, SparseArray paramSparseArray, int paramInt, ConstraintAnchor.Type paramType)
  {
    Object localObject = (View)this.mChildrenByIds.get(paramInt);
    paramSparseArray = (ConstraintWidget)paramSparseArray.get(paramInt);
    if ((paramSparseArray != null) && (localObject != null))
    {
      ViewGroup.LayoutParams localLayoutParams = ((View)localObject).getLayoutParams();
      paramInt = localLayoutParams instanceof ConstraintLayout.LayoutParams;
      if (paramInt != 0)
      {
        paramInt = 1;
        paramLayoutParams.Oooooo0 = paramInt;
        ConstraintAnchor.Type localType = ConstraintAnchor.Type.o00OooO0;
        if (paramType == localType)
        {
          localObject = (ConstraintLayout.LayoutParams)((View)localObject).getLayoutParams();
          ((ConstraintLayout.LayoutParams)localObject).Oooooo0 = paramInt;
          localObject = ((ConstraintLayout.LayoutParams)localObject).o0ooOOo;
          ((ConstraintWidget)localObject).setHasBaseline(paramInt);
        }
        localObject = paramConstraintWidget.OooOOo0(localType);
        paramSparseArray = paramSparseArray.OooOOo0(paramType);
        int i = paramLayoutParams.OooOooO;
        int j = paramLayoutParams.OooOoo;
        ((ConstraintAnchor)localObject).OooO0O0(paramSparseArray, i, j, paramInt);
        paramConstraintWidget.setHasBaseline(paramInt);
        paramLayoutParams = ConstraintAnchor.Type.o00Ooo0;
        paramConstraintWidget.OooOOo0(paramLayoutParams).OooO0oo();
        paramLayoutParams = ConstraintAnchor.Type.o00Ooo0o;
        paramConstraintWidget = paramConstraintWidget.OooOOo0(paramLayoutParams);
        paramConstraintWidget.OooO0oo();
      }
    }
  }
  
  public final boolean OooO0o0()
  {
    int i = getChildCount();
    boolean bool1 = false;
    int j = 0;
    while (j < i)
    {
      View localView = getChildAt(j);
      boolean bool2 = localView.isLayoutRequested();
      if (bool2)
      {
        bool1 = true;
        break;
      }
      j += 1;
    }
    if (bool1) {
      OooO0OO();
    }
    return bool1;
  }
  
  public void applyConstraintsFromLayoutParams(boolean paramBoolean, View paramView, ConstraintWidget paramConstraintWidget, ConstraintLayout.LayoutParams paramLayoutParams, SparseArray paramSparseArray)
  {
    Object localObject1 = paramView;
    ConstraintWidget localConstraintWidget = paramConstraintWidget;
    ConstraintLayout.LayoutParams localLayoutParams = paramLayoutParams;
    SparseArray localSparseArray = paramSparseArray;
    paramLayoutParams.OooO00o();
    paramLayoutParams.o0ooOoO = false;
    int i = paramView.getVisibility();
    paramConstraintWidget.setVisibility(i);
    boolean bool1 = paramLayoutParams.Ooooooo;
    float f1;
    if (bool1)
    {
      paramConstraintWidget.setInPlaceholder(true);
      int j = 8;
      f1 = 1.121039E-044F;
      paramConstraintWidget.setVisibility(j);
    }
    localConstraintWidget.setCompanionWidget(localObject1);
    boolean bool2 = localObject1 instanceof ConstraintHelper;
    Object localObject2;
    if (bool2)
    {
      localObject1 = (ConstraintHelper)localObject1;
      localObject2 = this.mLayoutWidget;
      bool2 = ((ConstraintWidgetContainer)localObject2).isRtl();
      ((ConstraintHelper)localObject1).OooOOo0(localConstraintWidget, bool2);
    }
    boolean bool4 = localLayoutParams.Oooooo;
    int i6 = -1;
    int k;
    int i7;
    float f2;
    if (bool4)
    {
      localObject1 = localConstraintWidget;
      localObject1 = (androidx.constraintlayout.core.widgets.Guideline)localConstraintWidget;
      k = localLayoutParams.o00oO0o;
      i7 = localLayoutParams.o00oO0O;
      f2 = localLayoutParams.o0ooOO0;
      float f3 = -1.0F;
      boolean bool10 = f2 < f3;
      if (bool10) {
        ((androidx.constraintlayout.core.widgets.Guideline)localObject1).setGuidePercent(f2);
      } else if (k != i6) {
        ((androidx.constraintlayout.core.widgets.Guideline)localObject1).setGuideBegin(k);
      } else if (i7 != i6) {
        ((androidx.constraintlayout.core.widgets.Guideline)localObject1).setGuideEnd(i7);
      }
    }
    else
    {
      int n = localLayoutParams.ooOO;
      k = localLayoutParams.o00O0O;
      int i9 = localLayoutParams.o00Oo0;
      int i10 = localLayoutParams.o00Ooo;
      int i11 = localLayoutParams.o00o0O;
      int i12 = localLayoutParams.o00ooo;
      float f4 = localLayoutParams.oo000o;
      i7 = localLayoutParams.OooOOOo;
      if (i7 != i6)
      {
        localObject1 = (ConstraintWidget)localSparseArray.get(i7);
        if (localObject1 != null)
        {
          f1 = localLayoutParams.OooOOo;
          i7 = localLayoutParams.OooOOo0;
          localConstraintWidget.OooOOO0((ConstraintWidget)localObject1, f1, i7);
        }
      }
      else
      {
        Object localObject3;
        Object localObject4;
        if (n != i6)
        {
          localObject1 = localSparseArray.get(n);
          localObject3 = localObject1;
          localObject3 = (ConstraintWidget)localObject1;
          if (localObject3 == null) {
            break label457;
          }
          localObject4 = ConstraintAnchor.Type.o00Ooo00;
          i8 = localLayoutParams.leftMargin;
          localObject1 = paramConstraintWidget;
          localObject2 = localObject4;
        }
        else
        {
          if (k == i6) {
            break label457;
          }
          localObject1 = localSparseArray.get(k);
          localObject3 = localObject1;
          localObject3 = (ConstraintWidget)localObject1;
          if (localObject3 == null) {
            break label457;
          }
          localObject2 = ConstraintAnchor.Type.o00Ooo00;
          localObject4 = ConstraintAnchor.Type.o00Ooo0O;
          i8 = localLayoutParams.leftMargin;
          localObject1 = paramConstraintWidget;
        }
        ((ConstraintWidget)localObject1).OooOoO((ConstraintAnchor.Type)localObject2, (ConstraintWidget)localObject3, (ConstraintAnchor.Type)localObject4, i8, i11);
        label457:
        if (i9 != i6)
        {
          localObject1 = localSparseArray.get(i9);
          localObject3 = localObject1;
          localObject3 = (ConstraintWidget)localObject1;
          if (localObject3 == null) {
            break label582;
          }
          localObject2 = ConstraintAnchor.Type.o00Ooo0O;
          localObject4 = ConstraintAnchor.Type.o00Ooo00;
          i8 = localLayoutParams.rightMargin;
          localObject1 = paramConstraintWidget;
        }
        else
        {
          if (i10 == i6) {
            break label582;
          }
          localObject1 = localSparseArray.get(i10);
          localObject3 = localObject1;
          localObject3 = (ConstraintWidget)localObject1;
          if (localObject3 == null) {
            break label582;
          }
          localObject4 = ConstraintAnchor.Type.o00Ooo0O;
          i8 = localLayoutParams.rightMargin;
          localObject1 = paramConstraintWidget;
          localObject2 = localObject4;
        }
        i11 = i12;
        ((ConstraintWidget)localObject1).OooOoO((ConstraintAnchor.Type)localObject2, (ConstraintWidget)localObject3, (ConstraintAnchor.Type)localObject4, i8, i12);
        label582:
        n = localLayoutParams.OooO;
        if (n != i6)
        {
          localObject1 = localSparseArray.get(n);
          localObject3 = localObject1;
          localObject3 = (ConstraintWidget)localObject1;
          if (localObject3 == null) {
            break label731;
          }
          localObject4 = ConstraintAnchor.Type.o00Ooo0;
          i8 = localLayoutParams.topMargin;
          i11 = localLayoutParams.OooOo;
          localObject1 = paramConstraintWidget;
          localObject2 = localObject4;
        }
        else
        {
          n = localLayoutParams.OooOO0;
          if (n == i6) {
            break label731;
          }
          localObject1 = localSparseArray.get(n);
          localObject3 = localObject1;
          localObject3 = (ConstraintWidget)localObject1;
          if (localObject3 == null) {
            break label731;
          }
          localObject2 = ConstraintAnchor.Type.o00Ooo0;
          localObject4 = ConstraintAnchor.Type.o00Ooo0o;
          i8 = localLayoutParams.topMargin;
          i11 = localLayoutParams.OooOo;
          localObject1 = paramConstraintWidget;
        }
        ((ConstraintWidget)localObject1).OooOoO((ConstraintAnchor.Type)localObject2, (ConstraintWidget)localObject3, (ConstraintAnchor.Type)localObject4, i8, i11);
        label731:
        n = localLayoutParams.OooOO0O;
        if (n != i6)
        {
          localObject1 = localSparseArray.get(n);
          localObject3 = localObject1;
          localObject3 = (ConstraintWidget)localObject1;
          if (localObject3 == null) {
            break label880;
          }
          localObject2 = ConstraintAnchor.Type.o00Ooo0o;
          localObject4 = ConstraintAnchor.Type.o00Ooo0;
          i8 = localLayoutParams.bottomMargin;
          i11 = localLayoutParams.OooOoO;
          localObject1 = paramConstraintWidget;
        }
        else
        {
          n = localLayoutParams.OooOO0o;
          if (n == i6) {
            break label880;
          }
          localObject1 = localSparseArray.get(n);
          localObject3 = localObject1;
          localObject3 = (ConstraintWidget)localObject1;
          if (localObject3 == null) {
            break label880;
          }
          localObject4 = ConstraintAnchor.Type.o00Ooo0o;
          i8 = localLayoutParams.bottomMargin;
          i11 = localLayoutParams.OooOoO;
          localObject1 = paramConstraintWidget;
          localObject2 = localObject4;
        }
        ((ConstraintWidget)localObject1).OooOoO((ConstraintAnchor.Type)localObject2, (ConstraintWidget)localObject3, (ConstraintAnchor.Type)localObject4, i8, i11);
        label880:
        int i8 = localLayoutParams.OooOOO0;
        ConstraintAnchor.Type localType;
        if (i8 != i6) {
          localType = ConstraintAnchor.Type.o00OooO0;
        }
        for (;;)
        {
          localObject1 = this;
          localObject2 = paramConstraintWidget;
          localObject3 = paramLayoutParams;
          localObject4 = paramSparseArray;
          OooO0Oo(paramConstraintWidget, paramLayoutParams, paramSparseArray, i8, localType);
          break;
          i8 = localLayoutParams.OooOOO;
          if (i8 != i6)
          {
            localType = ConstraintAnchor.Type.o00Ooo0;
          }
          else
          {
            i8 = localLayoutParams.OooOOOO;
            if (i8 == i6) {
              break;
            }
            localType = ConstraintAnchor.Type.o00Ooo0o;
          }
        }
        n = 0;
        f5 = 0.0F;
        localObject1 = null;
        boolean bool3 = f4 < 0.0F;
        if (!bool3) {
          localConstraintWidget.setHorizontalBiasPercent(f4);
        }
        f1 = localLayoutParams.Oooo00o;
        boolean bool5 = f1 < 0.0F;
        if (!bool5) {
          localConstraintWidget.setVerticalBiasPercent(f1);
        }
      }
      if (paramBoolean)
      {
        int i1 = localLayoutParams.OoooOOo;
        if (i1 == i6)
        {
          m = localLayoutParams.OoooOo0;
          if (m == i6) {}
        }
        else
        {
          m = localLayoutParams.OoooOo0;
          localConstraintWidget.setOrigin(i1, m);
        }
      }
      boolean bool6 = localLayoutParams.OooooOO;
      int m = -2;
      f1 = 0.0F / 0.0F;
      if (!bool6)
      {
        int i2 = localLayoutParams.width;
        if (i2 == i6)
        {
          boolean bool7 = localLayoutParams.OoooOoo;
          if (bool7) {
            localObject1 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
          } else {
            localObject1 = ConstraintWidget.DimensionBehaviour.o00Ooo0O;
          }
          localConstraintWidget.setHorizontalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject1);
          localObject1 = ConstraintAnchor.Type.o00Ooo00;
          localObject1 = localConstraintWidget.OooOOo0((ConstraintAnchor.Type)localObject1);
          i7 = localLayoutParams.leftMargin;
          ((ConstraintAnchor)localObject1).OooO0oO = i7;
          localObject1 = ConstraintAnchor.Type.o00Ooo0O;
          localObject1 = localConstraintWidget.OooOOo0((ConstraintAnchor.Type)localObject1);
          i7 = localLayoutParams.rightMargin;
          ((ConstraintAnchor)localObject1).OooO0oO = i7;
        }
        else
        {
          localObject1 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
          localConstraintWidget.setHorizontalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject1);
          localConstraintWidget.setWidth(0);
        }
      }
      else
      {
        localObject1 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
        localConstraintWidget.setHorizontalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject1);
        int i3 = localLayoutParams.width;
        localConstraintWidget.setWidth(i3);
        i3 = localLayoutParams.width;
        if (i3 == m)
        {
          localObject1 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
          localConstraintWidget.setHorizontalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject1);
        }
      }
      boolean bool8 = localLayoutParams.OooooOo;
      if (!bool8)
      {
        int i4 = localLayoutParams.height;
        if (i4 == i6)
        {
          boolean bool9 = localLayoutParams.Ooooo00;
          if (bool9) {
            localObject1 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
          } else {
            localObject1 = ConstraintWidget.DimensionBehaviour.o00Ooo0O;
          }
          localConstraintWidget.setVerticalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject1);
          localObject1 = ConstraintAnchor.Type.o00Ooo0;
          localObject1 = localConstraintWidget.OooOOo0((ConstraintAnchor.Type)localObject1);
          m = localLayoutParams.topMargin;
          ((ConstraintAnchor)localObject1).OooO0oO = m;
          localObject1 = ConstraintAnchor.Type.o00Ooo0o;
          localObject1 = localConstraintWidget.OooOOo0((ConstraintAnchor.Type)localObject1);
          m = localLayoutParams.bottomMargin;
          ((ConstraintAnchor)localObject1).OooO0oO = m;
        }
        else
        {
          localObject1 = ConstraintWidget.DimensionBehaviour.o00Ooo0;
          localConstraintWidget.setVerticalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject1);
          localConstraintWidget.setHeight(0);
        }
      }
      else
      {
        localObject1 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
        localConstraintWidget.setVerticalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject1);
        i5 = localLayoutParams.height;
        localConstraintWidget.setHeight(i5);
        i5 = localLayoutParams.height;
        if (i5 == m)
        {
          localObject1 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
          localConstraintWidget.setVerticalDimensionBehaviour((ConstraintWidget.DimensionBehaviour)localObject1);
        }
      }
      localObject1 = localLayoutParams.Oooo0;
      localConstraintWidget.setDimensionRatio((String)localObject1);
      float f5 = localLayoutParams.Oooo0o0;
      localConstraintWidget.setHorizontalWeight(f5);
      f5 = localLayoutParams.Oooo0o;
      localConstraintWidget.setVerticalWeight(f5);
      int i5 = localLayoutParams.Oooo0oO;
      localConstraintWidget.setHorizontalChainStyle(i5);
      i5 = localLayoutParams.Oooo0oo;
      localConstraintWidget.setVerticalChainStyle(i5);
      i5 = localLayoutParams.OooooO0;
      localConstraintWidget.setWrapBehaviorInParent(i5);
      i5 = localLayoutParams.Oooo;
      m = localLayoutParams.OoooO0;
      i7 = localLayoutParams.OoooO;
      f2 = localLayoutParams.o000oOoO;
      localConstraintWidget.Oooo0o(i5, m, i7, f2);
      i5 = localLayoutParams.OoooO00;
      m = localLayoutParams.OoooO0O;
      i7 = localLayoutParams.OoooOO0;
      f2 = localLayoutParams.OoooOOO;
      localConstraintWidget.Oooo0oO(i5, m, i7, f2);
    }
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof ConstraintLayout.LayoutParams;
  }
  
  public void dispatchDraw(Canvas paramCanvas)
  {
    ConstraintLayout localConstraintLayout = this;
    ArrayList localArrayList = this.mConstraintHelpers;
    int k;
    float f1;
    if (localArrayList != null)
    {
      int i = localArrayList.size();
      if (i > 0)
      {
        k = 0;
        f1 = 0.0F;
        while (k < i)
        {
          ConstraintHelper localConstraintHelper = (ConstraintHelper)localConstraintLayout.mConstraintHelpers.get(k);
          localConstraintHelper.OooOo00(localConstraintLayout);
          k += 1;
        }
      }
    }
    super.dispatchDraw(paramCanvas);
    boolean bool1 = isInEditMode();
    if (bool1)
    {
      int j = getWidth();
      float f2 = j;
      k = getHeight();
      f1 = k;
      int m = getChildCount();
      int n = 0;
      while (n < m)
      {
        Object localObject = localConstraintLayout.getChildAt(n);
        int i1 = ((View)localObject).getVisibility();
        int i3 = 8;
        float f3 = 1.121039E-044F;
        if (i1 != i3)
        {
          localObject = ((View)localObject).getTag();
          if (localObject != null)
          {
            boolean bool2 = localObject instanceof String;
            if (bool2)
            {
              localObject = (String)localObject;
              String str1 = ",";
              localObject = ((String)localObject).split(str1);
              int i2 = localObject.length;
              i3 = 4;
              f3 = 5.605194E-045F;
              if (i2 == i3)
              {
                str1 = localObject[0];
                i2 = Integer.parseInt(str1);
                i3 = Integer.parseInt(localObject[1]);
                String str2 = localObject[2];
                int i4 = Integer.parseInt(str2);
                localObject = localObject[3];
                int i5 = Integer.parseInt((String)localObject);
                float f4 = i2;
                float f5 = 1080.0F;
                i2 = (int)(f4 / f5 * f2);
                f3 = i3;
                float f6 = 1920.0F;
                i3 = (int)(f3 / f6 * f1);
                i4 = (int)(i4 / f5 * f2);
                i5 = (int)(i5 / f6 * f1);
                Paint localPaint = new android/graphics/Paint;
                localPaint.<init>();
                int i6 = -65536;
                f5 = 0.0F / 0.0F;
                localPaint.setColor(i6);
                float f7 = i2;
                float f8 = i3;
                i2 += i4;
                f4 = i2;
                f6 = f7;
                float f9 = f8;
                float f10 = f8;
                f8 = f4;
                float f11 = f7;
                f7 = f9;
                paramCanvas.drawLine(f6, f9, f4, f9, localPaint);
                float f12 = i3 + i5;
                f6 = f4;
                f7 = f12;
                paramCanvas.drawLine(f4, f9, f4, f12, localPaint);
                f9 = f12;
                f8 = f11;
                paramCanvas.drawLine(f4, f12, f11, f12, localPaint);
                f6 = f11;
                f7 = f10;
                paramCanvas.drawLine(f11, f12, f11, f10, localPaint);
                i3 = -16711936;
                f3 = -1.714652E+038F;
                localPaint.setColor(i3);
                f9 = f10;
                f8 = f4;
                f7 = f12;
                paramCanvas.drawLine(f11, f10, f4, f12, localPaint);
                f9 = f12;
                f7 = f10;
                paramCanvas.drawLine(f11, f12, f4, f10, localPaint);
              }
            }
          }
        }
        n += 1;
      }
    }
  }
  
  public void fillMetrics(Metrics paramMetrics)
  {
    this.mMetrics = paramMetrics;
    this.mLayoutWidget.Oooooo(paramMetrics);
  }
  
  public void forceLayout()
  {
    OooO0O0();
    super.forceLayout();
  }
  
  public ConstraintLayout.LayoutParams generateDefaultLayoutParams()
  {
    ConstraintLayout.LayoutParams localLayoutParams = new androidx/constraintlayout/widget/ConstraintLayout$LayoutParams;
    int i = -2;
    localLayoutParams.<init>(i, i);
    return localLayoutParams;
  }
  
  public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    ConstraintLayout.LayoutParams localLayoutParams = new androidx/constraintlayout/widget/ConstraintLayout$LayoutParams;
    localLayoutParams.<init>(paramLayoutParams);
    return localLayoutParams;
  }
  
  public ConstraintLayout.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    ConstraintLayout.LayoutParams localLayoutParams = new androidx/constraintlayout/widget/ConstraintLayout$LayoutParams;
    Context localContext = getContext();
    localLayoutParams.<init>(localContext, paramAttributeSet);
    return localLayoutParams;
  }
  
  public Object getDesignInformation(int paramInt, Object paramObject)
  {
    if (paramInt == 0)
    {
      paramInt = paramObject instanceof String;
      if (paramInt != 0)
      {
        paramObject = (String)paramObject;
        HashMap localHashMap = this.mDesignIds;
        if (localHashMap != null)
        {
          paramInt = localHashMap.containsKey(paramObject);
          if (paramInt != 0) {
            return this.mDesignIds.get(paramObject);
          }
        }
      }
    }
    return null;
  }
  
  public int getMaxHeight()
  {
    return this.mMaxHeight;
  }
  
  public int getMaxWidth()
  {
    return this.mMaxWidth;
  }
  
  public int getMinHeight()
  {
    return this.mMinHeight;
  }
  
  public int getMinWidth()
  {
    return this.mMinWidth;
  }
  
  public int getOptimizationLevel()
  {
    return this.mLayoutWidget.getOptimizationLevel();
  }
  
  public String getSceneString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject1 = this.mLayoutWidget.OooOOOO;
    int i = -1;
    if (localObject1 == null)
    {
      int j = getId();
      if (j != i)
      {
        localObject1 = getContext().getResources().getResourceEntryName(j);
        localObject2 = this.mLayoutWidget;
        ((ConstraintWidget)localObject2).OooOOOO = ((String)localObject1);
      }
      else
      {
        localObject1 = this.mLayoutWidget;
        localObject2 = "parent";
        ((ConstraintWidget)localObject1).OooOOOO = ((String)localObject2);
      }
    }
    localObject1 = this.mLayoutWidget.getDebugName();
    Object localObject2 = " setDebugName ";
    Object localObject3;
    if (localObject1 == null)
    {
      localObject1 = this.mLayoutWidget;
      localObject3 = ((ConstraintWidget)localObject1).OooOOOO;
      ((ConstraintWidget)localObject1).setDebugName((String)localObject3);
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      ((StringBuilder)localObject1).append((String)localObject2);
      localObject3 = this.mLayoutWidget.getDebugName();
      ((StringBuilder)localObject1).append((String)localObject3);
    }
    localObject1 = this.mLayoutWidget.getChildren().iterator();
    for (;;)
    {
      boolean bool = ((Iterator)localObject1).hasNext();
      if (!bool) {
        break;
      }
      localObject3 = (ConstraintWidget)((Iterator)localObject1).next();
      Object localObject4 = (View)((ConstraintWidget)localObject3).getCompanionWidget();
      if (localObject4 != null)
      {
        Object localObject5 = ((ConstraintWidget)localObject3).OooOOOO;
        if (localObject5 == null)
        {
          int k = ((View)localObject4).getId();
          if (k != i)
          {
            localObject5 = getContext().getResources();
            localObject4 = ((Resources)localObject5).getResourceEntryName(k);
            ((ConstraintWidget)localObject3).OooOOOO = ((String)localObject4);
          }
        }
        localObject4 = ((ConstraintWidget)localObject3).getDebugName();
        if (localObject4 == null)
        {
          localObject4 = ((ConstraintWidget)localObject3).OooOOOO;
          ((ConstraintWidget)localObject3).setDebugName((String)localObject4);
          localObject4 = new java/lang/StringBuilder;
          ((StringBuilder)localObject4).<init>();
          ((StringBuilder)localObject4).append((String)localObject2);
          localObject3 = ((ConstraintWidget)localObject3).getDebugName();
          ((StringBuilder)localObject4).append((String)localObject3);
        }
      }
    }
    this.mLayoutWidget.OooOOo(localStringBuilder);
    return localStringBuilder.toString();
  }
  
  public View getViewById(int paramInt)
  {
    return (View)this.mChildrenByIds.get(paramInt);
  }
  
  public final ConstraintWidget getViewWidget(View paramView)
  {
    if (paramView == this) {
      return this.mLayoutWidget;
    }
    if (paramView != null)
    {
      ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
      boolean bool = localLayoutParams instanceof ConstraintLayout.LayoutParams;
      if (bool) {}
      do
      {
        return ((ConstraintLayout.LayoutParams)paramView.getLayoutParams()).o0ooOOo;
        localLayoutParams = paramView.getLayoutParams();
        localLayoutParams = generateLayoutParams(localLayoutParams);
        paramView.setLayoutParams(localLayoutParams);
        localLayoutParams = paramView.getLayoutParams();
        bool = localLayoutParams instanceof ConstraintLayout.LayoutParams;
      } while (bool);
    }
    return null;
  }
  
  public boolean isRtl()
  {
    ApplicationInfo localApplicationInfo = getContext().getApplicationInfo();
    int i = localApplicationInfo.flags & 0x400000;
    boolean bool = false;
    int j = 1;
    if (i != 0)
    {
      i = j;
    }
    else
    {
      i = 0;
      localApplicationInfo = null;
    }
    if (i != 0)
    {
      i = getLayoutDirection();
      if (j == i) {
        bool = j;
      }
    }
    return bool;
  }
  
  public void loadLayoutDescription(int paramInt)
  {
    if (paramInt != 0) {
      try
      {
        ConstraintLayoutStates localConstraintLayoutStates = new androidx/constraintlayout/widget/ConstraintLayoutStates;
        Context localContext = getContext();
        localConstraintLayoutStates.<init>(localContext, this, paramInt);
        this.mConstraintLayoutSpec = localConstraintLayoutStates;
      }
      catch (Resources.NotFoundException localNotFoundException) {}
    } else {
      this.mConstraintLayoutSpec = null;
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramBoolean = getChildCount();
    paramInt1 = isInEditMode();
    paramInt2 = 0;
    paramInt3 = 0;
    while (paramInt3 < paramBoolean)
    {
      View localView = getChildAt(paramInt3);
      ConstraintLayout.LayoutParams localLayoutParams = (ConstraintLayout.LayoutParams)localView.getLayoutParams();
      ConstraintWidget localConstraintWidget = localLayoutParams.o0ooOOo;
      int i = localView.getVisibility();
      int k = 8;
      if (i == k)
      {
        boolean bool1 = localLayoutParams.Oooooo;
        if (!bool1)
        {
          bool1 = localLayoutParams.OoooooO;
          if (!bool1)
          {
            bool1 = localLayoutParams.o0OoOo0;
            if ((!bool1) && (paramInt1 == 0)) {
              break label215;
            }
          }
        }
      }
      boolean bool2 = localLayoutParams.Ooooooo;
      if (!bool2)
      {
        int m = localConstraintWidget.getX();
        int j = localConstraintWidget.getY();
        k = localConstraintWidget.getWidth() + m;
        int n = localConstraintWidget.getHeight() + j;
        localView.layout(m, j, k, n);
        boolean bool3 = localView instanceof Placeholder;
        if (bool3)
        {
          localView = ((Placeholder)localView).getContent();
          if (localView != null)
          {
            localView.setVisibility(0);
            localView.layout(m, j, k, n);
          }
        }
      }
      label215:
      paramInt3 += 1;
    }
    ArrayList localArrayList = this.mConstraintHelpers;
    paramBoolean = localArrayList.size();
    if (paramBoolean) {
      while (paramInt2 < paramBoolean)
      {
        ConstraintHelper localConstraintHelper = (ConstraintHelper)this.mConstraintHelpers.get(paramInt2);
        localConstraintHelper.OooOOo(this);
        paramInt2 += 1;
      }
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = this.mOnMeasureWidthMeasureSpec;
    if (i == paramInt1) {
      i = this.mOnMeasureHeightMeasureSpec;
    }
    boolean bool1 = this.mDirtyHierarchy;
    int k = 0;
    if (!bool1)
    {
      int j = getChildCount();
      int m = 0;
      while (m < j)
      {
        View localView = getChildAt(m);
        boolean bool4 = localView.isLayoutRequested();
        if (bool4)
        {
          j = 1;
          this.mDirtyHierarchy = j;
          break;
        }
        m += 1;
      }
    }
    boolean bool2 = this.mDirtyHierarchy;
    this.mOnMeasureWidthMeasureSpec = paramInt1;
    this.mOnMeasureHeightMeasureSpec = paramInt2;
    ConstraintWidgetContainer localConstraintWidgetContainer = this.mLayoutWidget;
    boolean bool3 = isRtl();
    localConstraintWidgetContainer.setRtl(bool3);
    bool2 = this.mDirtyHierarchy;
    if (bool2)
    {
      this.mDirtyHierarchy = false;
      bool2 = OooO0o0();
      if (bool2)
      {
        localConstraintWidgetContainer = this.mLayoutWidget;
        localConstraintWidgetContainer.o00ooo();
      }
    }
    localConstraintWidgetContainer = this.mLayoutWidget;
    k = this.mOptimizationLevel;
    resolveSystem(localConstraintWidgetContainer, k, paramInt1, paramInt2);
    int i2 = this.mLayoutWidget.getWidth();
    int i3 = this.mLayoutWidget.getHeight();
    boolean bool5 = this.mLayoutWidget.isWidthMeasuredTooSmall();
    boolean bool6 = this.mLayoutWidget.isHeightMeasuredTooSmall();
    int n = paramInt1;
    int i1 = paramInt2;
    resolveMeasuredDimension(paramInt1, paramInt2, i2, i3, bool5, bool6);
  }
  
  public void onViewAdded(View paramView)
  {
    super.onViewAdded(paramView);
    Object localObject1 = getViewWidget(paramView);
    boolean bool1 = paramView instanceof Guideline;
    boolean bool2 = true;
    Object localObject2;
    if (bool1)
    {
      boolean bool3 = localObject1 instanceof androidx.constraintlayout.core.widgets.Guideline;
      if (!bool3)
      {
        localObject1 = (ConstraintLayout.LayoutParams)paramView.getLayoutParams();
        localObject2 = new androidx/constraintlayout/core/widgets/Guideline;
        ((androidx.constraintlayout.core.widgets.Guideline)localObject2).<init>();
        ((ConstraintLayout.LayoutParams)localObject1).o0ooOOo = ((ConstraintWidget)localObject2);
        ((ConstraintLayout.LayoutParams)localObject1).Oooooo = bool2;
        int j = ((ConstraintLayout.LayoutParams)localObject1).OoooOoO;
        ((androidx.constraintlayout.core.widgets.Guideline)localObject2).setOrientation(j);
      }
    }
    boolean bool4 = paramView instanceof ConstraintHelper;
    if (bool4)
    {
      localObject1 = paramView;
      localObject1 = (ConstraintHelper)paramView;
      ((ConstraintHelper)localObject1).OooOo0o();
      ((ConstraintLayout.LayoutParams)((View)paramView).getLayoutParams()).OoooooO = bool2;
      localObject2 = this.mConstraintHelpers;
      bool1 = ((ArrayList)localObject2).contains(localObject1);
      if (!bool1)
      {
        localObject2 = this.mConstraintHelpers;
        ((ArrayList)localObject2).add(localObject1);
      }
    }
    localObject1 = this.mChildrenByIds;
    int i = ((View)paramView).getId();
    ((SparseArray)localObject1).put(i, paramView);
    this.mDirtyHierarchy = bool2;
  }
  
  public void onViewRemoved(View paramView)
  {
    super.onViewRemoved(paramView);
    Object localObject = this.mChildrenByIds;
    int i = paramView.getId();
    ((SparseArray)localObject).remove(i);
    localObject = getViewWidget(paramView);
    this.mLayoutWidget.OoooO0O((ConstraintWidget)localObject);
    this.mConstraintHelpers.remove(paramView);
    this.mDirtyHierarchy = true;
  }
  
  public void parseLayoutDescription(int paramInt)
  {
    ConstraintLayoutStates localConstraintLayoutStates = new androidx/constraintlayout/widget/ConstraintLayoutStates;
    Context localContext = getContext();
    localConstraintLayoutStates.<init>(localContext, this, paramInt);
    this.mConstraintLayoutSpec = localConstraintLayoutStates;
  }
  
  public void requestLayout()
  {
    OooO0O0();
    super.requestLayout();
  }
  
  public void resolveMeasuredDimension(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2)
  {
    ConstraintLayout.Measurer localMeasurer = this.mMeasurer;
    int i = localMeasurer.OooO0o0;
    int j = localMeasurer.OooO0Oo;
    paramInt3 += j;
    paramInt4 += i;
    j = 0;
    localMeasurer = null;
    paramInt1 = View.resolveSizeAndState(paramInt3, paramInt1, 0);
    paramInt2 = View.resolveSizeAndState(paramInt4, paramInt2, 0);
    paramInt3 = 16777215;
    paramInt1 &= paramInt3;
    paramInt2 &= paramInt3;
    paramInt1 = Math.min(this.mMaxWidth, paramInt1);
    paramInt2 = Math.min(this.mMaxHeight, paramInt2);
    paramInt3 = 16777216;
    if (paramBoolean1) {
      paramInt1 |= paramInt3;
    }
    if (paramBoolean2) {
      paramInt2 |= paramInt3;
    }
    setMeasuredDimension(paramInt1, paramInt2);
    this.mLastMeasureWidth = paramInt1;
    this.mLastMeasureHeight = paramInt2;
  }
  
  public void resolveSystem(ConstraintWidgetContainer paramConstraintWidgetContainer, int paramInt1, int paramInt2, int paramInt3)
  {
    ConstraintLayout localConstraintLayout = this;
    int i = View.MeasureSpec.getMode(paramInt2);
    int j = View.MeasureSpec.getSize(paramInt2);
    int k = View.MeasureSpec.getMode(paramInt3);
    int m = View.MeasureSpec.getSize(paramInt3);
    int n = getPaddingTop();
    int i1 = 0;
    int i2 = Math.max(0, n);
    n = getPaddingBottom();
    int i3 = Math.max(0, n);
    n = i2 + i3;
    int i4 = getPaddingWidth();
    ConstraintLayout.Measurer localMeasurer = this.mMeasurer;
    int i5 = paramInt2;
    int i6 = paramInt3;
    int i7 = i2;
    localMeasurer.OooO0OO(paramInt2, paramInt3, i2, i3, i4, n);
    int i8 = getPaddingStart();
    i8 = Math.max(0, i8);
    int i9 = getPaddingEnd();
    i9 = Math.max(0, i9);
    if ((i8 <= 0) && (i9 <= 0))
    {
      i8 = getPaddingLeft();
      i1 = Math.max(0, i8);
      i7 = i1;
    }
    else
    {
      bool = isRtl();
      if (bool) {
        i7 = i9;
      } else {
        i7 = i8;
      }
    }
    int i10 = j - i4;
    int i11 = m - n;
    n = i;
    boolean bool = i10;
    i4 = k;
    i8 = i11;
    setSelfDimensionBehaviour(paramConstraintWidgetContainer, i, i10, k, i11);
    i5 = localConstraintLayout.mLastMeasureWidth;
    i6 = localConstraintLayout.mLastMeasureHeight;
    i3 = i2;
    paramConstraintWidgetContainer.ooOO(paramInt1, i, i10, k, i11, i5, i6, i7, i2);
  }
  
  public void setConstraintSet(ConstraintSet paramConstraintSet)
  {
    this.mConstraintSet = paramConstraintSet;
  }
  
  public void setDesignInformation(int paramInt, Object paramObject1, Object paramObject2)
  {
    if (paramInt == 0)
    {
      paramInt = paramObject1 instanceof String;
      if (paramInt != 0)
      {
        paramInt = paramObject2 instanceof Integer;
        if (paramInt != 0)
        {
          Object localObject = this.mDesignIds;
          if (localObject == null)
          {
            localObject = new java/util/HashMap;
            ((HashMap)localObject).<init>();
            this.mDesignIds = ((HashMap)localObject);
          }
          paramObject1 = (String)paramObject1;
          localObject = "/";
          paramInt = paramObject1.indexOf((String)localObject);
          int i = -1;
          if (paramInt != i)
          {
            paramInt += 1;
            paramObject1 = paramObject1.substring(paramInt);
          }
          paramInt = ((Integer)paramObject2).intValue();
          paramObject2 = this.mDesignIds;
          localObject = Integer.valueOf(paramInt);
          paramObject2.put(paramObject1, localObject);
        }
      }
    }
  }
  
  public void setId(int paramInt)
  {
    SparseArray localSparseArray1 = this.mChildrenByIds;
    int i = getId();
    localSparseArray1.remove(i);
    super.setId(paramInt);
    SparseArray localSparseArray2 = this.mChildrenByIds;
    int j = getId();
    localSparseArray2.put(j, this);
  }
  
  public void setMaxHeight(int paramInt)
  {
    int i = this.mMaxHeight;
    if (paramInt == i) {
      return;
    }
    this.mMaxHeight = paramInt;
    requestLayout();
  }
  
  public void setMaxWidth(int paramInt)
  {
    int i = this.mMaxWidth;
    if (paramInt == i) {
      return;
    }
    this.mMaxWidth = paramInt;
    requestLayout();
  }
  
  public void setMinHeight(int paramInt)
  {
    int i = this.mMinHeight;
    if (paramInt == i) {
      return;
    }
    this.mMinHeight = paramInt;
    requestLayout();
  }
  
  public void setMinWidth(int paramInt)
  {
    int i = this.mMinWidth;
    if (paramInt == i) {
      return;
    }
    this.mMinWidth = paramInt;
    requestLayout();
  }
  
  public void setOnConstraintsChanged(ConstraintsChangedListener paramConstraintsChangedListener)
  {
    this.mConstraintsChangedListener = paramConstraintsChangedListener;
    ConstraintLayoutStates localConstraintLayoutStates = this.mConstraintLayoutSpec;
    if (localConstraintLayoutStates != null) {
      localConstraintLayoutStates.setOnConstraintsChanged(paramConstraintsChangedListener);
    }
  }
  
  public void setOptimizationLevel(int paramInt)
  {
    this.mOptimizationLevel = paramInt;
    this.mLayoutWidget.setOptimizationLevel(paramInt);
  }
  
  public void setSelfDimensionBehaviour(ConstraintWidgetContainer paramConstraintWidgetContainer, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ConstraintLayout.Measurer localMeasurer = this.mMeasurer;
    int i = localMeasurer.OooO0o0;
    int j = localMeasurer.OooO0Oo;
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.o00OoOoo;
    int k = getChildCount();
    int m = 1073741824;
    int n = -1 << -1;
    ConstraintWidget.DimensionBehaviour localDimensionBehaviour2;
    if (paramInt1 != n)
    {
      if (paramInt1 != 0) {
        if (paramInt1 != m) {
          localDimensionBehaviour2 = localDimensionBehaviour1;
        }
      }
      do
      {
        paramInt2 = 0;
        break;
        paramInt1 = this.mMaxWidth - j;
        paramInt2 = Math.min(paramInt1, paramInt2);
        localDimensionBehaviour2 = localDimensionBehaviour1;
        break;
        localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
      } while (k != 0);
    }
    else
    {
      localDimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
      if (k != 0) {
        break label121;
      }
    }
    paramInt2 = this.mMinWidth;
    paramInt2 = Math.max(0, paramInt2);
    label121:
    if (paramInt3 != n)
    {
      if (paramInt3 != 0) {
        if (paramInt3 == m) {}
      }
      do
      {
        paramInt4 = 0;
        break;
        paramInt3 = this.mMaxHeight - i;
        paramInt4 = Math.min(paramInt3, paramInt4);
        break;
        localDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
      } while (k != 0);
    }
    else
    {
      localDimensionBehaviour1 = ConstraintWidget.DimensionBehaviour.o00Ooo00;
      if (k != 0) {
        break label204;
      }
    }
    paramInt3 = this.mMinHeight;
    paramInt4 = Math.max(0, paramInt3);
    label204:
    paramInt3 = paramConstraintWidgetContainer.getWidth();
    if (paramInt2 == paramInt3)
    {
      paramInt3 = paramConstraintWidgetContainer.getHeight();
      if (paramInt4 == paramInt3) {}
    }
    else
    {
      paramConstraintWidgetContainer.o0OoOo0();
    }
    paramConstraintWidgetContainer.setX(0);
    paramConstraintWidgetContainer.setY(0);
    paramInt3 = this.mMaxWidth - j;
    paramConstraintWidgetContainer.setMaxWidth(paramInt3);
    paramInt3 = this.mMaxHeight - i;
    paramConstraintWidgetContainer.setMaxHeight(paramInt3);
    paramConstraintWidgetContainer.setMinWidth(0);
    paramConstraintWidgetContainer.setMinHeight(0);
    paramConstraintWidgetContainer.setHorizontalDimensionBehaviour(localDimensionBehaviour2);
    paramConstraintWidgetContainer.setWidth(paramInt2);
    paramConstraintWidgetContainer.setVerticalDimensionBehaviour(localDimensionBehaviour1);
    paramConstraintWidgetContainer.setHeight(paramInt4);
    paramInt1 = this.mMinWidth - j;
    paramConstraintWidgetContainer.setMinWidth(paramInt1);
    paramInt1 = this.mMinHeight - i;
    paramConstraintWidgetContainer.setMinHeight(paramInt1);
  }
  
  public void setState(int paramInt1, int paramInt2, int paramInt3)
  {
    ConstraintLayoutStates localConstraintLayoutStates = this.mConstraintLayoutSpec;
    if (localConstraintLayoutStates != null)
    {
      float f1 = paramInt2;
      float f2 = paramInt3;
      localConstraintLayoutStates.OooO0OO(paramInt1, f1, f2);
    }
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.widget.ConstraintLayout
 * JD-Core Version:    0.7.0.1
 */