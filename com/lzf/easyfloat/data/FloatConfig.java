package com.lzf.easyfloat.data;

import android.view.View;
import com.lzf.easyfloat.enums.ShowPattern;
import com.lzf.easyfloat.enums.SidePattern;
import com.lzf.easyfloat.interfaces.FloatCallbacks;
import com.lzf.easyfloat.interfaces.OnDisplayHeight;
import com.lzf.easyfloat.interfaces.OnFloatAnimator;
import com.lzf.easyfloat.interfaces.OnFloatCallbacks;
import com.lzf.easyfloat.interfaces.OnInvokeView;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import m54207b69;

public final class FloatConfig
{
  private int bottomBorder;
  private OnFloatCallbacks callbacks;
  private OnDisplayHeight displayHeight;
  private boolean dragEnable;
  private boolean filterSelf;
  private final Set filterSet;
  private OnFloatAnimator floatAnimator;
  private FloatCallbacks floatCallbacks;
  private String floatTag;
  private int gravity;
  private boolean hasEditText;
  private boolean heightMatch;
  private boolean immersionStatusBar;
  private OnInvokeView invokeView;
  private boolean isAnim;
  private boolean isDrag;
  private boolean isShow;
  private int layoutChangedGravity;
  private Integer layoutId;
  private View layoutView;
  private int leftBorder;
  private Pair locationPair;
  private boolean needShow;
  private Pair offsetPair;
  private int rightBorder;
  private ShowPattern showPattern;
  private SidePattern sidePattern;
  private int topBorder;
  private boolean widthMatch;
  
  public FloatConfig()
  {
    this(null, null, null, false, false, false, false, false, false, null, null, false, false, 0, null, null, 0, 0, 0, 0, null, null, null, null, null, null, false, false, 0, -1 >>> 3, null);
  }
  
  public FloatConfig(Integer paramInteger, View paramView, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, SidePattern paramSidePattern, ShowPattern paramShowPattern, boolean paramBoolean7, boolean paramBoolean8, int paramInt1, Pair paramPair1, Pair paramPair2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, OnInvokeView paramOnInvokeView, OnFloatCallbacks paramOnFloatCallbacks, FloatCallbacks paramFloatCallbacks, OnFloatAnimator paramOnFloatAnimator, OnDisplayHeight paramOnDisplayHeight, Set paramSet, boolean paramBoolean9, boolean paramBoolean10, int paramInt6)
  {
    localObject = paramInteger;
    this.layoutId = paramInteger;
    localObject = paramView;
    this.layoutView = paramView;
    localObject = paramString;
    this.floatTag = paramString;
    this.dragEnable = paramBoolean1;
    this.isDrag = paramBoolean2;
    this.isAnim = paramBoolean3;
    this.isShow = paramBoolean4;
    this.hasEditText = paramBoolean5;
    this.immersionStatusBar = paramBoolean6;
    this.sidePattern = paramSidePattern;
    this.showPattern = paramShowPattern;
    this.widthMatch = paramBoolean7;
    this.heightMatch = paramBoolean8;
    this.gravity = paramInt1;
    this.offsetPair = paramPair1;
    this.locationPair = paramPair2;
    this.leftBorder = paramInt2;
    this.topBorder = paramInt3;
    this.rightBorder = paramInt4;
    this.bottomBorder = paramInt5;
    this.invokeView = paramOnInvokeView;
    this.callbacks = paramOnFloatCallbacks;
    this.floatCallbacks = paramFloatCallbacks;
    this.floatAnimator = paramOnFloatAnimator;
    this.displayHeight = paramOnDisplayHeight;
    this.filterSet = paramSet;
    this.filterSelf = paramBoolean9;
    this.needShow = paramBoolean10;
    this.layoutChangedGravity = paramInt6;
  }
  
  public final Integer component1()
  {
    return this.layoutId;
  }
  
  public final SidePattern component10()
  {
    return this.sidePattern;
  }
  
  public final ShowPattern component11()
  {
    return this.showPattern;
  }
  
  public final boolean component12()
  {
    return this.widthMatch;
  }
  
  public final boolean component13()
  {
    return this.heightMatch;
  }
  
  public final int component14()
  {
    return this.gravity;
  }
  
  public final Pair component15()
  {
    return this.offsetPair;
  }
  
  public final Pair component16()
  {
    return this.locationPair;
  }
  
  public final int component17()
  {
    return this.leftBorder;
  }
  
  public final int component18()
  {
    return this.topBorder;
  }
  
  public final int component19()
  {
    return this.rightBorder;
  }
  
  public final View component2()
  {
    return this.layoutView;
  }
  
  public final int component20()
  {
    return this.bottomBorder;
  }
  
  public final OnInvokeView component21()
  {
    return this.invokeView;
  }
  
  public final OnFloatCallbacks component22()
  {
    return this.callbacks;
  }
  
  public final FloatCallbacks component23()
  {
    return this.floatCallbacks;
  }
  
  public final OnFloatAnimator component24()
  {
    return this.floatAnimator;
  }
  
  public final OnDisplayHeight component25()
  {
    return this.displayHeight;
  }
  
  public final Set component26()
  {
    return this.filterSet;
  }
  
  public final boolean component27$easyfloat_release()
  {
    return this.filterSelf;
  }
  
  public final boolean component28$easyfloat_release()
  {
    return this.needShow;
  }
  
  public final int component29()
  {
    return this.layoutChangedGravity;
  }
  
  public final String component3()
  {
    return this.floatTag;
  }
  
  public final boolean component4()
  {
    return this.dragEnable;
  }
  
  public final boolean component5()
  {
    return this.isDrag;
  }
  
  public final boolean component6()
  {
    return this.isAnim;
  }
  
  public final boolean component7()
  {
    return this.isShow;
  }
  
  public final boolean component8()
  {
    return this.hasEditText;
  }
  
  public final boolean component9()
  {
    return this.immersionStatusBar;
  }
  
  public final FloatConfig copy(Integer paramInteger, View paramView, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4, boolean paramBoolean5, boolean paramBoolean6, SidePattern paramSidePattern, ShowPattern paramShowPattern, boolean paramBoolean7, boolean paramBoolean8, int paramInt1, Pair paramPair1, Pair paramPair2, int paramInt2, int paramInt3, int paramInt4, int paramInt5, OnInvokeView paramOnInvokeView, OnFloatCallbacks paramOnFloatCallbacks, FloatCallbacks paramFloatCallbacks, OnFloatAnimator paramOnFloatAnimator, OnDisplayHeight paramOnDisplayHeight, Set paramSet, boolean paramBoolean9, boolean paramBoolean10, int paramInt6)
  {
    Object localObject = m54207b69.F54207b69_11("u6456054566A5C48495B4D62");
    Intrinsics.OooO0o(paramSidePattern, (String)localObject);
    localObject = m54207b69.F54207b69_11("gE362E2C3519293738284035");
    Intrinsics.OooO0o(paramShowPattern, (String)localObject);
    localObject = m54207b69.F54207b69_11("Lz151D1E0C231330221B11");
    Intrinsics.OooO0o(paramPair1, (String)localObject);
    localObject = m54207b69.F54207b69_11("x|101421200C1A191934261F19");
    Intrinsics.OooO0o(paramPair2, (String)localObject);
    localObject = m54207b69.F54207b69_11("@)4D415C5C494D56685449584C69");
    Intrinsics.OooO0o(paramOnDisplayHeight, (String)localObject);
    localObject = m54207b69.F54207b69_11("NY3F3137304030104335");
    Intrinsics.OooO0o(paramSet, (String)localObject);
    FloatConfig localFloatConfig = new com/lzf/easyfloat/data/FloatConfig;
    localObject = localFloatConfig;
    localFloatConfig.<init>(paramInteger, paramView, paramString, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4, paramBoolean5, paramBoolean6, paramSidePattern, paramShowPattern, paramBoolean7, paramBoolean8, paramInt1, paramPair1, paramPair2, paramInt2, paramInt3, paramInt4, paramInt5, paramOnInvokeView, paramOnFloatCallbacks, paramFloatCallbacks, paramOnFloatAnimator, paramOnDisplayHeight, paramSet, paramBoolean9, paramBoolean10, paramInt6);
    return localFloatConfig;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    boolean bool2 = paramObject instanceof FloatConfig;
    if (!bool2) {
      return false;
    }
    paramObject = (FloatConfig)paramObject;
    Object localObject1 = this.layoutId;
    Object localObject2 = paramObject.layoutId;
    bool2 = Intrinsics.OooO00o(localObject1, localObject2);
    if (!bool2) {
      return false;
    }
    localObject1 = this.layoutView;
    localObject2 = paramObject.layoutView;
    bool2 = Intrinsics.OooO00o(localObject1, localObject2);
    if (!bool2) {
      return false;
    }
    localObject1 = this.floatTag;
    localObject2 = paramObject.floatTag;
    bool2 = Intrinsics.OooO00o(localObject1, localObject2);
    if (!bool2) {
      return false;
    }
    bool2 = this.dragEnable;
    boolean bool5 = paramObject.dragEnable;
    if (bool2 != bool5) {
      return false;
    }
    bool2 = this.isDrag;
    bool5 = paramObject.isDrag;
    if (bool2 != bool5) {
      return false;
    }
    bool2 = this.isAnim;
    bool5 = paramObject.isAnim;
    if (bool2 != bool5) {
      return false;
    }
    bool2 = this.isShow;
    bool5 = paramObject.isShow;
    if (bool2 != bool5) {
      return false;
    }
    bool2 = this.hasEditText;
    bool5 = paramObject.hasEditText;
    if (bool2 != bool5) {
      return false;
    }
    bool2 = this.immersionStatusBar;
    bool5 = paramObject.immersionStatusBar;
    if (bool2 != bool5) {
      return false;
    }
    localObject1 = this.sidePattern;
    localObject2 = paramObject.sidePattern;
    if (localObject1 != localObject2) {
      return false;
    }
    localObject1 = this.showPattern;
    localObject2 = paramObject.showPattern;
    if (localObject1 != localObject2) {
      return false;
    }
    bool2 = this.widthMatch;
    bool5 = paramObject.widthMatch;
    if (bool2 != bool5) {
      return false;
    }
    bool2 = this.heightMatch;
    bool5 = paramObject.heightMatch;
    if (bool2 != bool5) {
      return false;
    }
    int i = this.gravity;
    int m = paramObject.gravity;
    if (i != m) {
      return false;
    }
    localObject1 = this.offsetPair;
    localObject2 = paramObject.offsetPair;
    boolean bool3 = Intrinsics.OooO00o(localObject1, localObject2);
    if (!bool3) {
      return false;
    }
    localObject1 = this.locationPair;
    localObject2 = paramObject.locationPair;
    bool3 = Intrinsics.OooO00o(localObject1, localObject2);
    if (!bool3) {
      return false;
    }
    int j = this.leftBorder;
    m = paramObject.leftBorder;
    if (j != m) {
      return false;
    }
    j = this.topBorder;
    m = paramObject.topBorder;
    if (j != m) {
      return false;
    }
    j = this.rightBorder;
    m = paramObject.rightBorder;
    if (j != m) {
      return false;
    }
    j = this.bottomBorder;
    m = paramObject.bottomBorder;
    if (j != m) {
      return false;
    }
    localObject1 = this.invokeView;
    localObject2 = paramObject.invokeView;
    boolean bool4 = Intrinsics.OooO00o(localObject1, localObject2);
    if (!bool4) {
      return false;
    }
    localObject1 = this.callbacks;
    localObject2 = paramObject.callbacks;
    bool4 = Intrinsics.OooO00o(localObject1, localObject2);
    if (!bool4) {
      return false;
    }
    localObject1 = this.floatCallbacks;
    localObject2 = paramObject.floatCallbacks;
    bool4 = Intrinsics.OooO00o(localObject1, localObject2);
    if (!bool4) {
      return false;
    }
    localObject1 = this.floatAnimator;
    localObject2 = paramObject.floatAnimator;
    bool4 = Intrinsics.OooO00o(localObject1, localObject2);
    if (!bool4) {
      return false;
    }
    localObject1 = this.displayHeight;
    localObject2 = paramObject.displayHeight;
    bool4 = Intrinsics.OooO00o(localObject1, localObject2);
    if (!bool4) {
      return false;
    }
    localObject1 = this.filterSet;
    localObject2 = paramObject.filterSet;
    bool4 = Intrinsics.OooO00o(localObject1, localObject2);
    if (!bool4) {
      return false;
    }
    bool4 = this.filterSelf;
    boolean bool6 = paramObject.filterSelf;
    if (bool4 != bool6) {
      return false;
    }
    bool4 = this.needShow;
    bool6 = paramObject.needShow;
    if (bool4 != bool6) {
      return false;
    }
    int k = this.layoutChangedGravity;
    int n = paramObject.layoutChangedGravity;
    if (k != n) {
      return false;
    }
    return bool1;
  }
  
  public final int getBottomBorder()
  {
    return this.bottomBorder;
  }
  
  public final OnFloatCallbacks getCallbacks()
  {
    return this.callbacks;
  }
  
  public final OnDisplayHeight getDisplayHeight()
  {
    return this.displayHeight;
  }
  
  public final boolean getDragEnable()
  {
    return this.dragEnable;
  }
  
  public final boolean getFilterSelf$easyfloat_release()
  {
    return this.filterSelf;
  }
  
  public final Set getFilterSet()
  {
    return this.filterSet;
  }
  
  public final OnFloatAnimator getFloatAnimator()
  {
    return this.floatAnimator;
  }
  
  public final FloatCallbacks getFloatCallbacks()
  {
    return this.floatCallbacks;
  }
  
  public final String getFloatTag()
  {
    return this.floatTag;
  }
  
  public final int getGravity()
  {
    return this.gravity;
  }
  
  public final boolean getHasEditText()
  {
    return this.hasEditText;
  }
  
  public final boolean getHeightMatch()
  {
    return this.heightMatch;
  }
  
  public final boolean getImmersionStatusBar()
  {
    return this.immersionStatusBar;
  }
  
  public final OnInvokeView getInvokeView()
  {
    return this.invokeView;
  }
  
  public final int getLayoutChangedGravity()
  {
    return this.layoutChangedGravity;
  }
  
  public final Integer getLayoutId()
  {
    return this.layoutId;
  }
  
  public final View getLayoutView()
  {
    return this.layoutView;
  }
  
  public final int getLeftBorder()
  {
    return this.leftBorder;
  }
  
  public final Pair getLocationPair()
  {
    return this.locationPair;
  }
  
  public final boolean getNeedShow$easyfloat_release()
  {
    return this.needShow;
  }
  
  public final Pair getOffsetPair()
  {
    return this.offsetPair;
  }
  
  public final int getRightBorder()
  {
    return this.rightBorder;
  }
  
  public final ShowPattern getShowPattern()
  {
    return this.showPattern;
  }
  
  public final SidePattern getSidePattern()
  {
    return this.sidePattern;
  }
  
  public final int getTopBorder()
  {
    return this.topBorder;
  }
  
  public final boolean getWidthMatch()
  {
    return this.widthMatch;
  }
  
  public int hashCode()
  {
    Integer localInteger = this.layoutId;
    int i = 0;
    Set localSet = null;
    if (localInteger == null)
    {
      m = 0;
      localInteger = null;
    }
    else
    {
      m = localInteger.hashCode();
    }
    m *= 31;
    Object localObject = this.layoutView;
    int i1;
    if (localObject == null)
    {
      i1 = 0;
      localObject = null;
    }
    else
    {
      i1 = localObject.hashCode();
    }
    int m = (m + i1) * 31;
    localObject = this.floatTag;
    int i2;
    if (localObject == null)
    {
      i2 = 0;
      localObject = null;
    }
    else
    {
      i2 = ((String)localObject).hashCode();
    }
    m = (m + i2) * 31;
    int i3 = this.dragEnable;
    int i23 = 1;
    if (i3 != 0) {
      i3 = i23;
    }
    m = (m + i3) * 31;
    int i4 = this.isDrag;
    if (i4 != 0) {
      i4 = i23;
    }
    m = (m + i4) * 31;
    int i5 = this.isAnim;
    if (i5 != 0) {
      i5 = i23;
    }
    m = (m + i5) * 31;
    int i6 = this.isShow;
    if (i6 != 0) {
      i6 = i23;
    }
    m = (m + i6) * 31;
    int i7 = this.hasEditText;
    if (i7 != 0) {
      i7 = i23;
    }
    m = (m + i7) * 31;
    int i8 = this.immersionStatusBar;
    if (i8 != 0) {
      i8 = i23;
    }
    m = (m + i8) * 31;
    int i9 = this.sidePattern.hashCode();
    m = (m + i9) * 31;
    localObject = this.showPattern;
    int i10 = localObject.hashCode();
    m = (m + i10) * 31;
    int i11 = this.widthMatch;
    if (i11 != 0) {
      i11 = i23;
    }
    m = (m + i11) * 31;
    int i12 = this.heightMatch;
    if (i12 != 0) {
      i12 = i23;
    }
    m = (m + i12) * 31;
    int i13 = Integer.hashCode(this.gravity);
    m = (m + i13) * 31;
    int i14 = this.offsetPair.hashCode();
    m = (m + i14) * 31;
    int i15 = this.locationPair.hashCode();
    m = (m + i15) * 31;
    int i16 = Integer.hashCode(this.leftBorder);
    m = (m + i16) * 31;
    int i17 = Integer.hashCode(this.topBorder);
    m = (m + i17) * 31;
    int i18 = Integer.hashCode(this.rightBorder);
    m = (m + i18) * 31;
    int i19 = Integer.hashCode(this.bottomBorder);
    m = (m + i19) * 31;
    localObject = this.invokeView;
    int i20;
    if (localObject == null)
    {
      i20 = 0;
      localObject = null;
    }
    else
    {
      i20 = localObject.hashCode();
    }
    m = (m + i20) * 31;
    localObject = this.callbacks;
    int i21;
    if (localObject == null)
    {
      i21 = 0;
      localObject = null;
    }
    else
    {
      i21 = localObject.hashCode();
    }
    m = (m + i21) * 31;
    localObject = this.floatCallbacks;
    int i22;
    if (localObject == null)
    {
      i22 = 0;
      localObject = null;
    }
    else
    {
      i22 = localObject.hashCode();
    }
    m = (m + i22) * 31;
    localObject = this.floatAnimator;
    if (localObject != null) {
      i = localObject.hashCode();
    }
    m = (m + i) * 31;
    i = this.displayHeight.hashCode();
    m = (m + i) * 31;
    localSet = this.filterSet;
    i = localSet.hashCode();
    m = (m + i) * 31;
    int j = this.filterSelf;
    if (j != 0) {
      j = i23;
    }
    int n = (m + j) * 31;
    j = this.needShow;
    if (j == 0) {
      i23 = j;
    }
    n = (n + i23) * 31;
    int k = Integer.hashCode(this.layoutChangedGravity);
    return n + k;
  }
  
  public final boolean isAnim()
  {
    return this.isAnim;
  }
  
  public final boolean isDrag()
  {
    return this.isDrag;
  }
  
  public final boolean isShow()
  {
    return this.isShow;
  }
  
  public final void setAnim(boolean paramBoolean)
  {
    this.isAnim = paramBoolean;
  }
  
  public final void setBottomBorder(int paramInt)
  {
    this.bottomBorder = paramInt;
  }
  
  public final void setCallbacks(OnFloatCallbacks paramOnFloatCallbacks)
  {
    this.callbacks = paramOnFloatCallbacks;
  }
  
  public final void setDisplayHeight(OnDisplayHeight paramOnDisplayHeight)
  {
    String str = m54207b69.F54207b69_11(",y450B1E10584B4D");
    Intrinsics.OooO0o(paramOnDisplayHeight, str);
    this.displayHeight = paramOnDisplayHeight;
  }
  
  public final void setDrag(boolean paramBoolean)
  {
    this.isDrag = paramBoolean;
  }
  
  public final void setDragEnable(boolean paramBoolean)
  {
    this.dragEnable = paramBoolean;
  }
  
  public final void setFilterSelf$easyfloat_release(boolean paramBoolean)
  {
    this.filterSelf = paramBoolean;
  }
  
  public final void setFloatAnimator(OnFloatAnimator paramOnFloatAnimator)
  {
    this.floatAnimator = paramOnFloatAnimator;
  }
  
  public final void setFloatCallbacks(FloatCallbacks paramFloatCallbacks)
  {
    this.floatCallbacks = paramFloatCallbacks;
  }
  
  public final void setFloatTag(String paramString)
  {
    this.floatTag = paramString;
  }
  
  public final void setGravity(int paramInt)
  {
    this.gravity = paramInt;
  }
  
  public final void setHasEditText(boolean paramBoolean)
  {
    this.hasEditText = paramBoolean;
  }
  
  public final void setHeightMatch(boolean paramBoolean)
  {
    this.heightMatch = paramBoolean;
  }
  
  public final void setImmersionStatusBar(boolean paramBoolean)
  {
    this.immersionStatusBar = paramBoolean;
  }
  
  public final void setInvokeView(OnInvokeView paramOnInvokeView)
  {
    this.invokeView = paramOnInvokeView;
  }
  
  public final void setLayoutChangedGravity(int paramInt)
  {
    this.layoutChangedGravity = paramInt;
  }
  
  public final void setLayoutId(Integer paramInteger)
  {
    this.layoutId = paramInteger;
  }
  
  public final void setLayoutView(View paramView)
  {
    this.layoutView = paramView;
  }
  
  public final void setLeftBorder(int paramInt)
  {
    this.leftBorder = paramInt;
  }
  
  public final void setLocationPair(Pair paramPair)
  {
    String str = m54207b69.F54207b69_11(",y450B1E10584B4D");
    Intrinsics.OooO0o(paramPair, str);
    this.locationPair = paramPair;
  }
  
  public final void setNeedShow$easyfloat_release(boolean paramBoolean)
  {
    this.needShow = paramBoolean;
  }
  
  public final void setOffsetPair(Pair paramPair)
  {
    String str = m54207b69.F54207b69_11(",y450B1E10584B4D");
    Intrinsics.OooO0o(paramPair, str);
    this.offsetPair = paramPair;
  }
  
  public final void setRightBorder(int paramInt)
  {
    this.rightBorder = paramInt;
  }
  
  public final void setShow(boolean paramBoolean)
  {
    this.isShow = paramBoolean;
  }
  
  public final void setShowPattern(ShowPattern paramShowPattern)
  {
    String str = m54207b69.F54207b69_11(",y450B1E10584B4D");
    Intrinsics.OooO0o(paramShowPattern, str);
    this.showPattern = paramShowPattern;
  }
  
  public final void setSidePattern(SidePattern paramSidePattern)
  {
    String str = m54207b69.F54207b69_11(",y450B1E10584B4D");
    Intrinsics.OooO0o(paramSidePattern, str);
    this.sidePattern = paramSidePattern;
  }
  
  public final void setTopBorder(int paramInt)
  {
    this.topBorder = paramInt;
  }
  
  public final void setWidthMatch(boolean paramBoolean)
  {
    this.widthMatch = paramBoolean;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    Object localObject = m54207b69.F54207b69_11("?O092422313F112628312F32722F3B442F4A4C183E86");
    localStringBuilder.append((String)localObject);
    localObject = this.layoutId;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("BF6A672C2A432E393918382D3C87");
    localStringBuilder.append((String)localObject);
    localObject = this.layoutView;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("=+070C4F4A484F6586525520");
    localStringBuilder.append((String)localObject);
    localObject = this.floatTag;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("H9151A5F4E5C63825E60645F6710");
    localStringBuilder.append((String)localObject);
    boolean bool1 = this.dragEnable;
    localStringBuilder.append(bool1);
    localObject = m54207b69.F54207b69_11("EU79763E29152C3A3970");
    localStringBuilder.append((String)localObject);
    bool1 = this.isDrag;
    localStringBuilder.append(bool1);
    localObject = m54207b69.F54207b69_11("k:161B554C7F59595E0F");
    localStringBuilder.append((String)localObject);
    bool1 = this.isAnim;
    localStringBuilder.append(bool1);
    localObject = m54207b69.F54207b69_11("0h4449031E3F050D265D");
    localStringBuilder.append((String)localObject);
    bool1 = this.isShow;
    localStringBuilder.append(bool1);
    localObject = m54207b69.F54207b69_11("sz565B141E0D44241A1637290D1A54");
    localStringBuilder.append((String)localObject);
    bool1 = this.hasEditText;
    localStringBuilder.append(bool1);
    localObject = m54207b69.F54207b69_11("xc4F440C11120B17171215173B230F25252032142472");
    localStringBuilder.append((String)localObject);
    bool1 = this.immersionStatusBar;
    localStringBuilder.append(bool1);
    localObject = m54207b69.F54207b69_11("=z565B0B1622243022161729132054");
    localStringBuilder.append((String)localObject);
    localObject = this.sidePattern;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("Ac4F44120E101939091F20101C196B");
    localStringBuilder.append((String)localObject);
    localObject = this.showPattern;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("kO63703A292F402D09364436327E");
    localStringBuilder.append((String)localObject);
    bool1 = this.widthMatch;
    localStringBuilder.append(bool1);
    localObject = m54207b69.F54207b69_11("7e49460F0310071318300D1B111965");
    localStringBuilder.append((String)localObject);
    bool1 = this.heightMatch;
    localStringBuilder.append(bool1);
    localObject = m54207b69.F54207b69_11("@a4D420816041C0E1C2065");
    localStringBuilder.append((String)localObject);
    int i = this.gravity;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("];171C5660614D645673635C5412");
    localStringBuilder.append((String)localObject);
    localObject = this.offsetPair;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("`01C115E6257564A6067676A5C654F1B");
    localStringBuilder.append((String)localObject);
    localObject = this.locationPair;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("FE69662B2327360D313F2A2A4284");
    localStringBuilder.append((String)localObject);
    i = this.leftBorder;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("l=111E4B55518458566161590B");
    localStringBuilder.append((String)localObject);
    i = this.topBorder;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("HN626F3E2A2D2B4013294534364880");
    localStringBuilder.append((String)localObject);
    i = this.rightBorder;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("V'0B08474B57584E516D515F4E4E6228");
    localStringBuilder.append((String)localObject);
    i = this.bottomBorder;
    localStringBuilder.append(i);
    localObject = m54207b69.F54207b69_11("S>121F59534C565B62706065540F");
    localStringBuilder.append((String)localObject);
    localObject = this.invokeView;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("g_73803E4137384345443D366D");
    localStringBuilder.append((String)localObject);
    localObject = this.callbacks;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("Yk474C0F0A080F252F1210111416150E2766");
    localStringBuilder.append((String)localObject);
    localObject = this.floatCallbacks;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("s71B18535E5C5B497D616764614F655319");
    localStringBuilder.append((String)localObject);
    localObject = this.floatAnimator;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("'N626F2C2A414328363F0F353235334882");
    localStringBuilder.append((String)localObject);
    localObject = this.displayHeight;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("Aj464B0E060A23151F41182862");
    localStringBuilder.append((String)localObject);
    localObject = this.filterSet;
    localStringBuilder.append(localObject);
    localObject = m54207b69.F54207b69_11("KY757A41333932423212453F4A70");
    localStringBuilder.append((String)localObject);
    boolean bool2 = this.filterSelf;
    localStringBuilder.append(bool2);
    localObject = m54207b69.F54207b69_11("Us5F541F191A1C2622240D58");
    localStringBuilder.append((String)localObject);
    bool2 = this.needShow;
    localStringBuilder.append(bool2);
    localObject = m54207b69.F54207b69_11("U.020F44525B466161754F594B555858786C606A5A6E6C29");
    localStringBuilder.append((String)localObject);
    int j = this.layoutChangedGravity;
    localStringBuilder.append(j);
    localStringBuilder.append(')');
    return localStringBuilder.toString();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.lzf.easyfloat.data.FloatConfig
 * JD-Core Version:    0.7.0.1
 */