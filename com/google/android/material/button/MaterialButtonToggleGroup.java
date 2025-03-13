package com.google.android.material.button;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.ToggleButton;
import androidx.core.view.AccessibilityDelegateCompat;
import androidx.core.view.MarginLayoutParamsCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat.CollectionInfoCompat;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearanceModel.Builder;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import m54207b69;

public class MaterialButtonToggleGroup
  extends LinearLayout
{
  private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_MaterialButtonToggleGroup;
  private static final String LOG_TAG = "MButtonToggleGroup";
  private Set checkedIds;
  private Integer[] childOrder;
  private final Comparator childOrderComparator;
  private final int defaultCheckId;
  private final LinkedHashSet onButtonCheckedListeners;
  private final List originalCornerData;
  private final MaterialButtonToggleGroup.PressedStateTracker pressedStateTracker;
  private boolean selectionRequired;
  private boolean singleSelection;
  private boolean skipCheckedStateTracker;
  
  public MaterialButtonToggleGroup(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MaterialButtonToggleGroup(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public MaterialButtonToggleGroup(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = new java/util/ArrayList;
    paramContext.<init>();
    this.originalCornerData = paramContext;
    paramContext = new com/google/android/material/button/MaterialButtonToggleGroup$PressedStateTracker;
    paramContext.<init>(this, null);
    this.pressedStateTracker = paramContext;
    paramContext = new java/util/LinkedHashSet;
    paramContext.<init>();
    this.onButtonCheckedListeners = paramContext;
    paramContext = new com/google/android/material/button/MaterialButtonToggleGroup$1;
    paramContext.<init>(this);
    this.childOrderComparator = paramContext;
    this.skipCheckedStateTracker = false;
    Object localObject = new java/util/HashSet;
    ((HashSet)localObject).<init>();
    this.checkedIds = ((Set)localObject);
    localObject = getContext();
    int[] arrayOfInt1 = R.styleable.MaterialButtonToggleGroup;
    int[] arrayOfInt2 = new int[0];
    paramAttributeSet = ThemeEnforcement.obtainStyledAttributes((Context)localObject, paramAttributeSet, arrayOfInt1, paramInt, i, arrayOfInt2);
    paramInt = R.styleable.MaterialButtonToggleGroup_singleSelection;
    paramInt = paramAttributeSet.getBoolean(paramInt, false);
    setSingleSelection(paramInt);
    paramInt = R.styleable.MaterialButtonToggleGroup_checkedButton;
    paramInt = paramAttributeSet.getResourceId(paramInt, -1);
    this.defaultCheckId = paramInt;
    paramInt = R.styleable.MaterialButtonToggleGroup_selectionRequired;
    int j = paramAttributeSet.getBoolean(paramInt, false);
    this.selectionRequired = j;
    j = 1;
    setChildrenDrawingOrderEnabled(j);
    paramInt = R.styleable.MaterialButtonToggleGroup_android_enabled;
    paramInt = paramAttributeSet.getBoolean(paramInt, j);
    setEnabled(paramInt);
    paramAttributeSet.recycle();
    ViewCompat.o000000(this, j);
  }
  
  private void adjustChildMarginsAndUpdateLayout()
  {
    int i = getFirstVisibleChildIndex();
    int j = -1;
    if (i == j) {
      return;
    }
    j = i + 1;
    for (;;)
    {
      int k = getChildCount();
      if (j >= k) {
        break;
      }
      MaterialButton localMaterialButton1 = getChildButton(j);
      int m = j + -1;
      MaterialButton localMaterialButton2 = getChildButton(m);
      int n = localMaterialButton1.getStrokeWidth();
      m = localMaterialButton2.getStrokeWidth();
      m = Math.min(n, m);
      LinearLayout.LayoutParams localLayoutParams = buildLayoutParams(localMaterialButton1);
      int i1 = getOrientation();
      if (i1 == 0)
      {
        MarginLayoutParamsCompat.OooO0OO(localLayoutParams, 0);
        m = -m;
        MarginLayoutParamsCompat.OooO0Oo(localLayoutParams, m);
        localLayoutParams.topMargin = 0;
      }
      else
      {
        localLayoutParams.bottomMargin = 0;
        m = -m;
        localLayoutParams.topMargin = m;
        MarginLayoutParamsCompat.OooO0Oo(localLayoutParams, 0);
      }
      localMaterialButton1.setLayoutParams(localLayoutParams);
      j += 1;
    }
    resetChildMargins(i);
  }
  
  private LinearLayout.LayoutParams buildLayoutParams(View paramView)
  {
    paramView = paramView.getLayoutParams();
    boolean bool = paramView instanceof LinearLayout.LayoutParams;
    if (bool) {
      return (LinearLayout.LayoutParams)paramView;
    }
    LinearLayout.LayoutParams localLayoutParams = new android/widget/LinearLayout$LayoutParams;
    int i = paramView.width;
    int j = paramView.height;
    localLayoutParams.<init>(i, j);
    return localLayoutParams;
  }
  
  private void checkInternal(int paramInt, boolean paramBoolean)
  {
    int i = -1;
    Object localObject1;
    if (paramInt == i)
    {
      localObject1 = new java/lang/StringBuilder;
      ((StringBuilder)localObject1).<init>();
      localObject2 = m54207b69.F54207b69_11("L;794F5152585A217987245C532762625E2B5E6C6A66741732");
      ((StringBuilder)localObject1).append((String)localObject2);
      ((StringBuilder)localObject1).append(paramInt);
      return;
    }
    Object localObject2 = new java/util/HashSet;
    Object localObject3 = this.checkedIds;
    ((HashSet)localObject2).<init>((Collection)localObject3);
    boolean bool;
    Integer localInteger;
    if (paramBoolean)
    {
      localObject3 = Integer.valueOf(paramInt);
      bool = ((Set)localObject2).contains(localObject3);
      if (!bool)
      {
        paramBoolean = this.singleSelection;
        if (paramBoolean)
        {
          paramBoolean = ((Set)localObject2).isEmpty();
          if (!paramBoolean) {
            ((Set)localObject2).clear();
          }
        }
        localInteger = Integer.valueOf(paramInt);
        ((Set)localObject2).add(localInteger);
        break label197;
      }
    }
    if (!paramBoolean)
    {
      localObject1 = Integer.valueOf(paramInt);
      paramBoolean = ((Set)localObject2).contains(localObject1);
      if (paramBoolean)
      {
        paramBoolean = this.selectionRequired;
        if (paramBoolean)
        {
          paramBoolean = ((Set)localObject2).size();
          bool = true;
          if (paramBoolean <= bool) {}
        }
        else
        {
          localInteger = Integer.valueOf(paramInt);
          ((Set)localObject2).remove(localInteger);
        }
        label197:
        updateCheckedIds((Set)localObject2);
      }
    }
  }
  
  private void dispatchOnButtonChecked(int paramInt, boolean paramBoolean)
  {
    Iterator localIterator = this.onButtonCheckedListeners.iterator();
    for (;;)
    {
      boolean bool = localIterator.hasNext();
      if (!bool) {
        break;
      }
      MaterialButtonToggleGroup.OnButtonCheckedListener localOnButtonCheckedListener = (MaterialButtonToggleGroup.OnButtonCheckedListener)localIterator.next();
      localOnButtonCheckedListener.onButtonChecked(this, paramInt, paramBoolean);
    }
  }
  
  private MaterialButton getChildButton(int paramInt)
  {
    return (MaterialButton)getChildAt(paramInt);
  }
  
  private int getFirstVisibleChildIndex()
  {
    int i = getChildCount();
    int j = 0;
    while (j < i)
    {
      boolean bool = isChildVisible(j);
      if (bool) {
        return j;
      }
      j += 1;
    }
    return -1;
  }
  
  private int getIndexWithinVisibleButtons(View paramView)
  {
    int i = paramView instanceof MaterialButton;
    int k = -1;
    if (i == 0) {
      return k;
    }
    i = 0;
    int m = 0;
    for (;;)
    {
      int n = getChildCount();
      if (i >= n) {
        break;
      }
      View localView = getChildAt(i);
      if (localView == paramView) {
        return m;
      }
      localView = getChildAt(i);
      boolean bool = localView instanceof MaterialButton;
      if (bool)
      {
        bool = isChildVisible(i);
        if (bool) {
          m += 1;
        }
      }
      int j;
      i += 1;
    }
    return k;
  }
  
  private int getLastVisibleChildIndex()
  {
    int i = getChildCount() + -1;
    while (i >= 0)
    {
      boolean bool = isChildVisible(i);
      if (bool) {
        return i;
      }
      i += -1;
    }
    return -1;
  }
  
  private MaterialButtonToggleGroup.CornerData getNewCornerData(int paramInt1, int paramInt2, int paramInt3)
  {
    MaterialButtonToggleGroup.CornerData localCornerData1 = (MaterialButtonToggleGroup.CornerData)this.originalCornerData.get(paramInt1);
    if (paramInt2 == paramInt3) {
      return localCornerData1;
    }
    int i = getOrientation();
    if (i == 0) {
      i = 1;
    } else {
      i = 0;
    }
    MaterialButtonToggleGroup.CornerData localCornerData2;
    if (paramInt1 == paramInt2)
    {
      if (i != 0) {
        localCornerData2 = MaterialButtonToggleGroup.CornerData.start(localCornerData1, this);
      } else {
        localCornerData2 = MaterialButtonToggleGroup.CornerData.top(localCornerData1);
      }
      return localCornerData2;
    }
    if (paramInt1 == paramInt3)
    {
      if (i != 0) {
        localCornerData2 = MaterialButtonToggleGroup.CornerData.end(localCornerData1, this);
      } else {
        localCornerData2 = MaterialButtonToggleGroup.CornerData.bottom(localCornerData1);
      }
      return localCornerData2;
    }
    return null;
  }
  
  private int getVisibleButtonCount()
  {
    int i = 0;
    int j = 0;
    for (;;)
    {
      int k = getChildCount();
      if (i >= k) {
        break;
      }
      View localView = getChildAt(i);
      boolean bool = localView instanceof MaterialButton;
      if (bool)
      {
        bool = isChildVisible(i);
        if (bool) {
          j += 1;
        }
      }
      i += 1;
    }
    return j;
  }
  
  private boolean isChildVisible(int paramInt)
  {
    View localView = getChildAt(paramInt);
    paramInt = localView.getVisibility();
    int i = 8;
    if (paramInt != i)
    {
      paramInt = 1;
    }
    else
    {
      paramInt = 0;
      localView = null;
    }
    return paramInt;
  }
  
  private void resetChildMargins(int paramInt)
  {
    int i = getChildCount();
    if (i != 0)
    {
      i = -1;
      if (paramInt != i)
      {
        LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)getChildButton(paramInt).getLayoutParams();
        i = getOrientation();
        int j = 1;
        if (i == j)
        {
          localLayoutParams.topMargin = 0;
          localLayoutParams.bottomMargin = 0;
          return;
        }
        MarginLayoutParamsCompat.OooO0OO(localLayoutParams, 0);
        MarginLayoutParamsCompat.OooO0Oo(localLayoutParams, 0);
        localLayoutParams.leftMargin = 0;
        localLayoutParams.rightMargin = 0;
      }
    }
  }
  
  private void setCheckedStateForView(int paramInt, boolean paramBoolean)
  {
    View localView = findViewById(paramInt);
    boolean bool = localView instanceof MaterialButton;
    if (bool)
    {
      bool = true;
      this.skipCheckedStateTracker = bool;
      ((MaterialButton)localView).setChecked(paramBoolean);
      paramInt = 0;
      localView = null;
      this.skipCheckedStateTracker = false;
    }
  }
  
  private void setGeneratedIdIfNeeded(MaterialButton paramMaterialButton)
  {
    int i = paramMaterialButton.getId();
    int j = -1;
    if (i == j)
    {
      i = ViewCompat.OooOO0();
      paramMaterialButton.setId(i);
    }
  }
  
  private void setupButtonChild(MaterialButton paramMaterialButton)
  {
    int i = 1;
    paramMaterialButton.setMaxLines(i);
    Object localObject = TextUtils.TruncateAt.END;
    paramMaterialButton.setEllipsize((TextUtils.TruncateAt)localObject);
    paramMaterialButton.setCheckable(i);
    localObject = this.pressedStateTracker;
    paramMaterialButton.setOnPressedChangeListenerInternal((MaterialButton.OnPressedChangeListener)localObject);
    paramMaterialButton.setShouldDrawSurfaceColorStroke(i);
  }
  
  private static void updateBuilderWithCornerData(ShapeAppearanceModel.Builder paramBuilder, MaterialButtonToggleGroup.CornerData paramCornerData)
  {
    if (paramCornerData == null)
    {
      paramBuilder.setAllCornerSizes(0.0F);
      return;
    }
    CornerSize localCornerSize = paramCornerData.topLeft;
    paramBuilder = paramBuilder.setTopLeftCornerSize(localCornerSize);
    localCornerSize = paramCornerData.bottomLeft;
    paramBuilder = paramBuilder.setBottomLeftCornerSize(localCornerSize);
    localCornerSize = paramCornerData.topRight;
    paramBuilder = paramBuilder.setTopRightCornerSize(localCornerSize);
    paramCornerData = paramCornerData.bottomRight;
    paramBuilder.setBottomRightCornerSize(paramCornerData);
  }
  
  private void updateCheckedIds(Set paramSet)
  {
    Set localSet = this.checkedIds;
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>(paramSet);
    this.checkedIds = localHashSet;
    int i = 0;
    localHashSet = null;
    for (;;)
    {
      int j = getChildCount();
      if (i >= j) {
        break;
      }
      MaterialButton localMaterialButton = getChildButton(i);
      j = localMaterialButton.getId();
      Integer localInteger1 = Integer.valueOf(j);
      boolean bool1 = paramSet.contains(localInteger1);
      setCheckedStateForView(j, bool1);
      localInteger1 = Integer.valueOf(j);
      bool1 = localSet.contains(localInteger1);
      Integer localInteger2 = Integer.valueOf(j);
      boolean bool2 = paramSet.contains(localInteger2);
      if (bool1 != bool2)
      {
        localInteger1 = Integer.valueOf(j);
        bool1 = paramSet.contains(localInteger1);
        dispatchOnButtonChecked(j, bool1);
      }
      i += 1;
    }
    invalidate();
  }
  
  private void updateChildOrder()
  {
    Object localObject1 = new java/util/TreeMap;
    Object localObject2 = this.childOrderComparator;
    ((TreeMap)localObject1).<init>((Comparator)localObject2);
    int i = getChildCount();
    int j = 0;
    while (j < i)
    {
      MaterialButton localMaterialButton = getChildButton(j);
      Integer localInteger = Integer.valueOf(j);
      ((Map)localObject1).put(localMaterialButton, localInteger);
      j += 1;
    }
    localObject1 = ((SortedMap)localObject1).values();
    localObject2 = new Integer[0];
    localObject1 = (Integer[])((Collection)localObject1).toArray((Object[])localObject2);
    this.childOrder = ((Integer[])localObject1);
  }
  
  private void updateChildrenA11yClassName()
  {
    int i = 0;
    for (;;)
    {
      int j = getChildCount();
      if (i >= j) {
        break;
      }
      boolean bool = this.singleSelection;
      if (bool) {
        localObject = RadioButton.class;
      } else {
        localObject = ToggleButton.class;
      }
      Object localObject = ((Class)localObject).getName();
      MaterialButton localMaterialButton = getChildButton(i);
      localMaterialButton.setA11yClassName((String)localObject);
      i += 1;
    }
  }
  
  public void addOnButtonCheckedListener(MaterialButtonToggleGroup.OnButtonCheckedListener paramOnButtonCheckedListener)
  {
    this.onButtonCheckedListeners.add(paramOnButtonCheckedListener);
  }
  
  public void addView(View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool1 = paramView instanceof MaterialButton;
    if (!bool1) {
      return;
    }
    super.addView((View)paramView, paramInt, paramLayoutParams);
    paramView = (MaterialButton)paramView;
    setGeneratedIdIfNeeded(paramView);
    setupButtonChild(paramView);
    paramInt = paramView.getId();
    boolean bool2 = paramView.isChecked();
    checkInternal(paramInt, bool2);
    Object localObject = paramView.getShapeAppearanceModel();
    paramLayoutParams = this.originalCornerData;
    MaterialButtonToggleGroup.CornerData localCornerData = new com/google/android/material/button/MaterialButtonToggleGroup$CornerData;
    CornerSize localCornerSize1 = ((ShapeAppearanceModel)localObject).getTopLeftCornerSize();
    CornerSize localCornerSize2 = ((ShapeAppearanceModel)localObject).getBottomLeftCornerSize();
    CornerSize localCornerSize3 = ((ShapeAppearanceModel)localObject).getTopRightCornerSize();
    localObject = ((ShapeAppearanceModel)localObject).getBottomRightCornerSize();
    localCornerData.<init>(localCornerSize1, localCornerSize2, localCornerSize3, (CornerSize)localObject);
    paramLayoutParams.add(localCornerData);
    paramInt = isEnabled();
    paramView.setEnabled(paramInt);
    localObject = new com/google/android/material/button/MaterialButtonToggleGroup$2;
    ((MaterialButtonToggleGroup.2)localObject).<init>(this);
    ViewCompat.o00oO0o(paramView, (AccessibilityDelegateCompat)localObject);
  }
  
  public void check(int paramInt)
  {
    checkInternal(paramInt, true);
  }
  
  public void clearChecked()
  {
    HashSet localHashSet = new java/util/HashSet;
    localHashSet.<init>();
    updateCheckedIds(localHashSet);
  }
  
  public void clearOnButtonCheckedListeners()
  {
    this.onButtonCheckedListeners.clear();
  }
  
  public void dispatchDraw(Canvas paramCanvas)
  {
    updateChildOrder();
    super.dispatchDraw(paramCanvas);
  }
  
  public int getCheckedButtonId()
  {
    boolean bool = this.singleSelection;
    if (bool)
    {
      Object localObject = this.checkedIds;
      bool = ((Set)localObject).isEmpty();
      if (!bool)
      {
        localObject = (Integer)this.checkedIds.iterator().next();
        return ((Integer)localObject).intValue();
      }
    }
    int i = -1;
    return i;
  }
  
  public List getCheckedButtonIds()
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = 0;
    for (;;)
    {
      int j = getChildCount();
      if (i >= j) {
        break;
      }
      Object localObject = getChildButton(i);
      j = ((View)localObject).getId();
      Set localSet = this.checkedIds;
      Integer localInteger = Integer.valueOf(j);
      boolean bool = localSet.contains(localInteger);
      if (bool)
      {
        localObject = Integer.valueOf(j);
        localArrayList.add(localObject);
      }
      i += 1;
    }
    return localArrayList;
  }
  
  public int getChildDrawingOrder(int paramInt1, int paramInt2)
  {
    Integer[] arrayOfInteger = this.childOrder;
    if (arrayOfInteger != null)
    {
      int i = arrayOfInteger.length;
      if (paramInt2 < i) {
        return arrayOfInteger[paramInt2].intValue();
      }
    }
    return paramInt2;
  }
  
  public boolean isSelectionRequired()
  {
    return this.selectionRequired;
  }
  
  public boolean isSingleSelection()
  {
    return this.singleSelection;
  }
  
  public void onButtonCheckedStateChanged(MaterialButton paramMaterialButton, boolean paramBoolean)
  {
    boolean bool = this.skipCheckedStateTracker;
    if (bool) {
      return;
    }
    int i = paramMaterialButton.getId();
    checkInternal(i, paramBoolean);
  }
  
  public void onFinishInflate()
  {
    super.onFinishInflate();
    int i = this.defaultCheckId;
    int j = -1;
    if (i != j)
    {
      Set localSet = Collections.singleton(Integer.valueOf(i));
      updateCheckedIds(localSet);
    }
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo = AccessibilityNodeInfoCompat.OooOo00(paramAccessibilityNodeInfo);
    int i = getVisibleButtonCount();
    boolean bool = isSingleSelection();
    int k = 1;
    int j;
    if (bool) {
      bool = k;
    } else {
      j = 2;
    }
    AccessibilityNodeInfoCompat.CollectionInfoCompat localCollectionInfoCompat = AccessibilityNodeInfoCompat.CollectionInfoCompat.OooO0O0(k, i, false, j);
    paramAccessibilityNodeInfo.setCollectionInfo(localCollectionInfoCompat);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    updateChildShapes();
    adjustChildMarginsAndUpdateLayout();
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void onViewRemoved(View paramView)
  {
    super.onViewRemoved(paramView);
    boolean bool = paramView instanceof MaterialButton;
    Object localObject;
    if (bool)
    {
      localObject = paramView;
      localObject = (MaterialButton)paramView;
      ((MaterialButton)localObject).setOnPressedChangeListenerInternal(null);
    }
    int i = indexOfChild((View)paramView);
    if (i >= 0)
    {
      localObject = this.originalCornerData;
      ((List)localObject).remove(i);
    }
    updateChildShapes();
    adjustChildMarginsAndUpdateLayout();
  }
  
  public void removeOnButtonCheckedListener(MaterialButtonToggleGroup.OnButtonCheckedListener paramOnButtonCheckedListener)
  {
    this.onButtonCheckedListeners.remove(paramOnButtonCheckedListener);
  }
  
  public void setEnabled(boolean paramBoolean)
  {
    super.setEnabled(paramBoolean);
    int i = 0;
    for (;;)
    {
      int j = getChildCount();
      if (i >= j) {
        break;
      }
      MaterialButton localMaterialButton = getChildButton(i);
      localMaterialButton.setEnabled(paramBoolean);
      i += 1;
    }
  }
  
  public void setSelectionRequired(boolean paramBoolean)
  {
    this.selectionRequired = paramBoolean;
  }
  
  public void setSingleSelection(int paramInt)
  {
    paramInt = getResources().getBoolean(paramInt);
    setSingleSelection(paramInt);
  }
  
  public void setSingleSelection(boolean paramBoolean)
  {
    boolean bool = this.singleSelection;
    if (bool != paramBoolean)
    {
      this.singleSelection = paramBoolean;
      clearChecked();
    }
    updateChildrenA11yClassName();
  }
  
  public void uncheck(int paramInt)
  {
    checkInternal(paramInt, false);
  }
  
  public void updateChildShapes()
  {
    int i = getChildCount();
    int j = getFirstVisibleChildIndex();
    int k = getLastVisibleChildIndex();
    int m = 0;
    while (m < i)
    {
      MaterialButton localMaterialButton = getChildButton(m);
      int n = localMaterialButton.getVisibility();
      int i1 = 8;
      if (n != i1)
      {
        Object localObject = localMaterialButton.getShapeAppearanceModel().toBuilder();
        MaterialButtonToggleGroup.CornerData localCornerData = getNewCornerData(m, j, k);
        updateBuilderWithCornerData((ShapeAppearanceModel.Builder)localObject, localCornerData);
        localObject = ((ShapeAppearanceModel.Builder)localObject).build();
        localMaterialButton.setShapeAppearanceModel((ShapeAppearanceModel)localObject);
      }
      m += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.button.MaterialButtonToggleGroup
 * JD-Core Version:    0.7.0.1
 */