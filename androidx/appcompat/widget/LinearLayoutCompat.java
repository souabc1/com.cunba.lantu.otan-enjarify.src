package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.widget.LinearLayout.LayoutParams;
import androidx.appcompat.R.styleable;
import androidx.core.view.GravityCompat;
import androidx.core.view.ViewCompat;

public class LinearLayoutCompat
  extends ViewGroup
{
  private static final String ACCESSIBILITY_CLASS_NAME = "androidx.appcompat.widget.LinearLayoutCompat";
  public static final int HORIZONTAL = 0;
  private static final int INDEX_BOTTOM = 2;
  private static final int INDEX_CENTER_VERTICAL = 0;
  private static final int INDEX_FILL = 3;
  private static final int INDEX_TOP = 1;
  public static final int SHOW_DIVIDER_BEGINNING = 1;
  public static final int SHOW_DIVIDER_END = 4;
  public static final int SHOW_DIVIDER_MIDDLE = 2;
  public static final int SHOW_DIVIDER_NONE = 0;
  public static final int VERTICAL = 1;
  private static final int VERTICAL_GRAVITY_COUNT = 4;
  private boolean mBaselineAligned;
  private int mBaselineAlignedChildIndex;
  private int mBaselineChildTop;
  private Drawable mDivider;
  private int mDividerHeight;
  private int mDividerPadding;
  private int mDividerWidth;
  private int mGravity;
  private int[] mMaxAscent;
  private int[] mMaxDescent;
  private int mOrientation;
  private int mShowDividers;
  private int mTotalLength;
  private boolean mUseLargestChild;
  private float mWeightSum;
  
  public LinearLayoutCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public LinearLayoutCompat(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    boolean bool1 = true;
    this.mBaselineAligned = bool1;
    int i = -1;
    this.mBaselineAlignedChildIndex = i;
    this.mBaselineChildTop = 0;
    int j = 8388659;
    this.mGravity = j;
    Object localObject = R.styleable.LinearLayoutCompat;
    localObject = TintTypedArray.OooOOOO(paramContext, paramAttributeSet, (int[])localObject, paramInt, 0);
    int[] arrayOfInt = R.styleable.LinearLayoutCompat;
    TypedArray localTypedArray = ((TintTypedArray)localObject).getWrappedTypeArray();
    ViewCompat.o00ooo(this, paramContext, arrayOfInt, paramAttributeSet, localTypedArray, paramInt, 0);
    int k = R.styleable.LinearLayoutCompat_android_orientation;
    k = ((TintTypedArray)localObject).OooO0oo(k, i);
    if (k >= 0) {
      setOrientation(k);
    }
    k = R.styleable.LinearLayoutCompat_android_gravity;
    k = ((TintTypedArray)localObject).OooO0oo(k, i);
    if (k >= 0) {
      setGravity(k);
    }
    k = R.styleable.LinearLayoutCompat_android_baselineAligned;
    boolean bool2 = ((TintTypedArray)localObject).OooO00o(k, bool1);
    if (!bool2) {
      setBaselineAligned(bool2);
    }
    int m = R.styleable.LinearLayoutCompat_android_weightSum;
    float f = ((TintTypedArray)localObject).OooO0o(m, -1.0F);
    this.mWeightSum = f;
    m = R.styleable.LinearLayoutCompat_android_baselineAlignedChildIndex;
    m = ((TintTypedArray)localObject).OooO0oo(m, i);
    this.mBaselineAlignedChildIndex = m;
    m = R.styleable.LinearLayoutCompat_measureWithLargestChild;
    boolean bool3 = ((TintTypedArray)localObject).OooO00o(m, false);
    this.mUseLargestChild = bool3;
    int n = R.styleable.LinearLayoutCompat_divider;
    paramContext = ((TintTypedArray)localObject).getDrawable(n);
    setDividerDrawable(paramContext);
    n = R.styleable.LinearLayoutCompat_showDividers;
    n = ((TintTypedArray)localObject).OooO0oo(n, 0);
    this.mShowDividers = n;
    n = R.styleable.LinearLayoutCompat_dividerPadding;
    n = ((TintTypedArray)localObject).OooO0o0(n, 0);
    this.mDividerPadding = n;
    ((TintTypedArray)localObject).OooOOOo();
  }
  
  public final void OooO0Oo(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
    int j = 0;
    while (j < paramInt1)
    {
      View localView = getVirtualChildAt(j);
      int k = localView.getVisibility();
      int m = 8;
      if (k != m)
      {
        Object localObject1 = localView.getLayoutParams();
        Object localObject2 = localObject1;
        localObject2 = (LinearLayoutCompat.LayoutParams)localObject1;
        k = ((LinearLayout.LayoutParams)localObject2).height;
        m = -1;
        if (k == m)
        {
          int n = ((LinearLayout.LayoutParams)localObject2).width;
          k = localView.getMeasuredWidth();
          ((LinearLayout.LayoutParams)localObject2).width = k;
          localObject1 = this;
          m = paramInt2;
          measureChildWithMargins(localView, paramInt2, 0, i, 0);
          ((LinearLayout.LayoutParams)localObject2).width = n;
        }
      }
      j += 1;
    }
  }
  
  public final void OooO0o(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt3 += paramInt1;
    paramInt4 += paramInt2;
    paramView.layout(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void OooO0o0(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
    int j = 0;
    while (j < paramInt1)
    {
      View localView = getVirtualChildAt(j);
      int k = localView.getVisibility();
      int m = 8;
      if (k != m)
      {
        Object localObject1 = localView.getLayoutParams();
        Object localObject2 = localObject1;
        localObject2 = (LinearLayoutCompat.LayoutParams)localObject1;
        k = ((LinearLayout.LayoutParams)localObject2).width;
        m = -1;
        if (k == m)
        {
          int n = ((LinearLayout.LayoutParams)localObject2).height;
          k = localView.getMeasuredHeight();
          ((LinearLayout.LayoutParams)localObject2).height = k;
          localObject1 = this;
          m = i;
          measureChildWithMargins(localView, i, 0, paramInt2, 0);
          ((LinearLayout.LayoutParams)localObject2).height = n;
        }
      }
      j += 1;
    }
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof LinearLayoutCompat.LayoutParams;
  }
  
  public void drawDividersHorizontal(Canvas paramCanvas)
  {
    int i = getVirtualChildCount();
    boolean bool1 = ViewUtils.OooO0O0(this);
    int k = 0;
    LinearLayoutCompat.LayoutParams localLayoutParams1 = null;
    while (k < i)
    {
      View localView1 = getVirtualChildAt(k);
      if (localView1 != null)
      {
        int m = localView1.getVisibility();
        int i1 = 8;
        if (m != i1)
        {
          boolean bool3 = hasDividerBeforeChildAt(k);
          if (bool3)
          {
            LinearLayoutCompat.LayoutParams localLayoutParams2 = (LinearLayoutCompat.LayoutParams)localView1.getLayoutParams();
            int i2;
            int n;
            if (bool1)
            {
              i2 = localView1.getRight();
              n = localLayoutParams2.rightMargin;
              i2 += n;
            }
            else
            {
              i2 = localView1.getLeft();
              n = localLayoutParams2.leftMargin;
              i2 -= n;
              n = this.mDividerWidth;
              i2 -= n;
            }
            drawVerticalDivider(paramCanvas, i2);
          }
        }
      }
      k += 1;
    }
    boolean bool2 = hasDividerBeforeChildAt(i);
    if (bool2)
    {
      i += -1;
      View localView2 = getVirtualChildAt(i);
      if (localView2 == null)
      {
        if (bool1)
        {
          i = getPaddingLeft();
          break label265;
        }
        i = getWidth();
        j = getPaddingRight();
      }
      else
      {
        localLayoutParams1 = (LinearLayoutCompat.LayoutParams)localView2.getLayoutParams();
        if (j == 0) {
          break label249;
        }
        i = localView2.getLeft();
        j = localLayoutParams1.leftMargin;
      }
      i -= j;
      int j = this.mDividerWidth;
      i -= j;
      break label265;
      label249:
      i = localView2.getRight();
      j = localLayoutParams1.rightMargin;
      i += j;
      label265:
      drawVerticalDivider(paramCanvas, i);
    }
  }
  
  public void drawDividersVertical(Canvas paramCanvas)
  {
    int i = getVirtualChildCount();
    int j = 0;
    LinearLayoutCompat.LayoutParams localLayoutParams1 = null;
    while (j < i)
    {
      View localView1 = getVirtualChildAt(j);
      if (localView1 != null)
      {
        int m = localView1.getVisibility();
        int i1 = 8;
        if (m != i1)
        {
          boolean bool2 = hasDividerBeforeChildAt(j);
          if (bool2)
          {
            LinearLayoutCompat.LayoutParams localLayoutParams2 = (LinearLayoutCompat.LayoutParams)localView1.getLayoutParams();
            int i2 = localView1.getTop();
            int n = localLayoutParams2.topMargin;
            i2 -= n;
            n = this.mDividerHeight;
            i2 -= n;
            drawHorizontalDivider(paramCanvas, i2);
          }
        }
      }
      j += 1;
    }
    boolean bool1 = hasDividerBeforeChildAt(i);
    if (bool1)
    {
      i += -1;
      View localView2 = getVirtualChildAt(i);
      int k;
      if (localView2 == null)
      {
        i = getHeight();
        k = getPaddingBottom();
        i -= k;
        k = this.mDividerHeight;
        i -= k;
      }
      else
      {
        localLayoutParams1 = (LinearLayoutCompat.LayoutParams)localView2.getLayoutParams();
        i = localView2.getBottom();
        k = localLayoutParams1.bottomMargin;
        i += k;
      }
      drawHorizontalDivider(paramCanvas, i);
    }
  }
  
  public void drawHorizontalDivider(Canvas paramCanvas, int paramInt)
  {
    Drawable localDrawable = this.mDivider;
    int i = getPaddingLeft();
    int j = this.mDividerPadding;
    i += j;
    j = getWidth();
    int k = getPaddingRight();
    j -= k;
    k = this.mDividerPadding;
    j -= k;
    k = this.mDividerHeight + paramInt;
    localDrawable.setBounds(i, paramInt, j, k);
    this.mDivider.draw(paramCanvas);
  }
  
  public void drawVerticalDivider(Canvas paramCanvas, int paramInt)
  {
    Drawable localDrawable = this.mDivider;
    int i = getPaddingTop();
    int j = this.mDividerPadding;
    i += j;
    j = this.mDividerWidth + paramInt;
    int k = getHeight();
    int m = getPaddingBottom();
    k -= m;
    m = this.mDividerPadding;
    k -= m;
    localDrawable.setBounds(paramInt, i, j, k);
    this.mDivider.draw(paramCanvas);
  }
  
  public LinearLayoutCompat.LayoutParams generateDefaultLayoutParams()
  {
    int i = this.mOrientation;
    int j = -2;
    LinearLayoutCompat.LayoutParams localLayoutParams;
    if (i == 0)
    {
      localLayoutParams = new androidx/appcompat/widget/LinearLayoutCompat$LayoutParams;
      localLayoutParams.<init>(j, j);
      return localLayoutParams;
    }
    int k = 1;
    if (i == k)
    {
      localLayoutParams = new androidx/appcompat/widget/LinearLayoutCompat$LayoutParams;
      localLayoutParams.<init>(-1, j);
      return localLayoutParams;
    }
    return null;
  }
  
  public LinearLayoutCompat.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    LinearLayoutCompat.LayoutParams localLayoutParams = new androidx/appcompat/widget/LinearLayoutCompat$LayoutParams;
    Context localContext = getContext();
    localLayoutParams.<init>(localContext, paramAttributeSet);
    return localLayoutParams;
  }
  
  public LinearLayoutCompat.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    LinearLayoutCompat.LayoutParams localLayoutParams = new androidx/appcompat/widget/LinearLayoutCompat$LayoutParams;
    localLayoutParams.<init>(paramLayoutParams);
    return localLayoutParams;
  }
  
  public int getBaseline()
  {
    int i = this.mBaselineAlignedChildIndex;
    if (i < 0) {
      return super.getBaseline();
    }
    i = getChildCount();
    int j = this.mBaselineAlignedChildIndex;
    if (i > j)
    {
      localObject = getChildAt(j);
      j = ((View)localObject).getBaseline();
      int k = -1;
      if (j == k)
      {
        i = this.mBaselineAlignedChildIndex;
        if (i == 0) {
          return k;
        }
        localObject = new java/lang/RuntimeException;
        ((RuntimeException)localObject).<init>("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        throw ((Throwable)localObject);
      }
      k = this.mBaselineChildTop;
      int m = this.mOrientation;
      int n = 1;
      if (m == n)
      {
        m = this.mGravity & 0x70;
        n = 48;
        if (m != n)
        {
          n = 16;
          if (m != n)
          {
            n = 80;
            if (m == n)
            {
              k = getBottom();
              m = getTop();
              k -= m;
              m = getPaddingBottom();
              k -= m;
              m = this.mTotalLength;
              k -= m;
            }
          }
          else
          {
            m = getBottom();
            n = getTop();
            m -= n;
            n = getPaddingTop();
            m -= n;
            n = getPaddingBottom();
            m -= n;
            n = this.mTotalLength;
            m = (m - n) / 2;
            k += m;
          }
        }
      }
      i = ((LinearLayoutCompat.LayoutParams)((View)localObject).getLayoutParams()).topMargin;
      return k + i + j;
    }
    Object localObject = new java/lang/RuntimeException;
    ((RuntimeException)localObject).<init>("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
    throw ((Throwable)localObject);
  }
  
  public int getBaselineAlignedChildIndex()
  {
    return this.mBaselineAlignedChildIndex;
  }
  
  public int getChildrenSkipCount(View paramView, int paramInt)
  {
    return 0;
  }
  
  public Drawable getDividerDrawable()
  {
    return this.mDivider;
  }
  
  public int getDividerPadding()
  {
    return this.mDividerPadding;
  }
  
  public int getDividerWidth()
  {
    return this.mDividerWidth;
  }
  
  public int getGravity()
  {
    return this.mGravity;
  }
  
  public int getLocationOffset(View paramView)
  {
    return 0;
  }
  
  public int getNextLocationOffset(View paramView)
  {
    return 0;
  }
  
  public int getOrientation()
  {
    return this.mOrientation;
  }
  
  public int getShowDividers()
  {
    return this.mShowDividers;
  }
  
  public View getVirtualChildAt(int paramInt)
  {
    return getChildAt(paramInt);
  }
  
  public int getVirtualChildCount()
  {
    return getChildCount();
  }
  
  public float getWeightSum()
  {
    return this.mWeightSum;
  }
  
  public boolean hasDividerBeforeChildAt(int paramInt)
  {
    boolean bool = false;
    int i = 1;
    if (paramInt == 0)
    {
      paramInt = this.mShowDividers & i;
      if (paramInt != 0) {
        bool = i;
      }
      return bool;
    }
    int j = getChildCount();
    if (paramInt == j)
    {
      paramInt = this.mShowDividers & 0x4;
      if (paramInt != 0) {
        bool = i;
      }
      return bool;
    }
    j = this.mShowDividers & 0x2;
    if (j != 0)
    {
      paramInt -= i;
      while (paramInt >= 0)
      {
        View localView = getChildAt(paramInt);
        j = localView.getVisibility();
        int k = 8;
        if (j != k)
        {
          bool = i;
          break;
        }
        paramInt += -1;
      }
    }
    return bool;
  }
  
  public boolean isBaselineAligned()
  {
    return this.mBaselineAligned;
  }
  
  public boolean isMeasureWithLargestChildEnabled()
  {
    return this.mUseLargestChild;
  }
  
  public void layoutHorizontal(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    LinearLayoutCompat localLinearLayoutCompat = this;
    boolean bool1 = ViewUtils.OooO0O0(this);
    int j = getPaddingTop();
    int k = paramInt4 - paramInt2;
    int m = getPaddingBottom();
    int n = k - m;
    k -= j;
    m = getPaddingBottom();
    int i1 = k - m;
    int i2 = getVirtualChildCount();
    k = this.mGravity;
    m = 0x800007 & k;
    int i4 = k & 0x70;
    boolean bool3 = this.mBaselineAligned;
    int[] arrayOfInt1 = this.mMaxAscent;
    int[] arrayOfInt2 = this.mMaxDescent;
    k = ViewCompat.OooOoOO(this);
    k = GravityCompat.OooO0O0(m, k);
    int i5 = 2;
    int i6 = 1;
    float f1 = 1.4E-45F;
    if (k != i6)
    {
      m = 5;
      if (k != m)
      {
        k = getPaddingLeft();
      }
      else
      {
        k = getPaddingLeft() + paramInt3 - paramInt1;
        m = this.mTotalLength;
        k -= m;
      }
    }
    else
    {
      k = getPaddingLeft();
      m = paramInt3 - paramInt1;
      i7 = this.mTotalLength;
      m = (m - i7) / i5;
      k += m;
    }
    m = 0;
    int i;
    int i8;
    int i9;
    if (bool1)
    {
      i = i2 + -1;
      i8 = i;
      i9 = -1;
    }
    else
    {
      i8 = 0;
      i9 = i6;
    }
    int i7 = 0;
    while (i7 < i2)
    {
      i = i9 * i7;
      m = i8 + i;
      Object localObject1 = localLinearLayoutCompat.getVirtualChildAt(m);
      int i10;
      float f2;
      int i11;
      int i12;
      int i13;
      if (localObject1 == null)
      {
        i = localLinearLayoutCompat.measureNullChild(m);
        k += i;
        i10 = i6;
        f2 = f1;
        i11 = j;
        i12 = i2;
        i13 = i4;
      }
      else
      {
        i6 = ((View)localObject1).getVisibility();
        i5 = 8;
        int i14;
        if (i6 != i5)
        {
          i5 = ((View)localObject1).getMeasuredWidth();
          i6 = ((View)localObject1).getMeasuredHeight();
          ViewGroup.LayoutParams localLayoutParams = ((View)localObject1).getLayoutParams();
          Object localObject2 = localLayoutParams;
          localObject2 = (LinearLayoutCompat.LayoutParams)localLayoutParams;
          i14 = i7;
          if (bool3)
          {
            i7 = ((LinearLayout.LayoutParams)localObject2).height;
            i12 = i2;
            i2 = -1;
            if (i7 != i2)
            {
              i2 = ((View)localObject1).getBaseline();
              break label415;
            }
          }
          else
          {
            i12 = i2;
          }
          i2 = -1;
          label415:
          i7 = ((LinearLayout.LayoutParams)localObject2).gravity;
          if (i7 < 0) {
            i7 = i4;
          }
          i7 &= 0x70;
          i13 = i4;
          i4 = 16;
          if (i7 != i4)
          {
            i4 = 48;
            if (i7 != i4)
            {
              i4 = 80;
              if (i7 != i4)
              {
                i7 = j;
                i4 = -1;
              }
              else
              {
                i7 = n - i6;
                i4 = ((LinearLayout.LayoutParams)localObject2).bottomMargin;
                i7 -= i4;
                i4 = -1;
                if (i2 != i4)
                {
                  i10 = ((View)localObject1).getMeasuredHeight() - i2;
                  i2 = 2;
                  i11 = arrayOfInt2[i2] - i10;
                  i7 -= i11;
                }
              }
            }
            else
            {
              i4 = -1;
              i7 = ((LinearLayout.LayoutParams)localObject2).topMargin + j;
              if (i2 != i4)
              {
                i10 = 1;
                f2 = 1.4E-45F;
                i11 = arrayOfInt1[i10] - i2;
                i7 += i11;
                break label656;
              }
            }
            i10 = 1;
            f2 = 1.4E-45F;
          }
          else
          {
            i4 = -1;
            i10 = 1;
            f2 = 1.4E-45F;
            i7 = (i1 - i6) / 2 + j;
            i2 = ((LinearLayout.LayoutParams)localObject2).topMargin;
            i7 += i2;
            i2 = ((LinearLayout.LayoutParams)localObject2).bottomMargin;
            i7 -= i2;
          }
          label656:
          boolean bool2 = localLinearLayoutCompat.hasDividerBeforeChildAt(m);
          if (bool2)
          {
            i3 = localLinearLayoutCompat.mDividerWidth;
            k += i3;
          }
          i3 = ((LinearLayout.LayoutParams)localObject2).leftMargin + k;
          k = localLinearLayoutCompat.getLocationOffset((View)localObject1);
          i11 = i3 + k;
          Object localObject3 = localObject1;
          localObject1 = this;
          i4 = m;
          m = i11;
          i11 = j;
          OooO0o(localObject3, m, i7, i5, i6);
          i = ((LinearLayout.LayoutParams)localObject2).rightMargin;
          i5 += i;
          localObject1 = localObject3;
          k = localLinearLayoutCompat.getNextLocationOffset(localObject3);
          i5 += k;
          i3 += i5;
          i = localLinearLayoutCompat.getChildrenSkipCount(localObject3, i4);
          i7 = i14 + i;
          k = i3;
        }
        else
        {
          i14 = i7;
          i11 = j;
          i12 = i3;
          i13 = i4;
          i10 = 1;
          f2 = 1.4E-45F;
        }
      }
      i7 += 1;
      int i3 = i12;
      i4 = i13;
      i6 = i10;
      f1 = f2;
      j = i11;
      i5 = 2;
    }
  }
  
  public void layoutVertical(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    LinearLayoutCompat localLinearLayoutCompat = this;
    int i = getPaddingLeft();
    int j = paramInt3 - paramInt1;
    int k = getPaddingRight();
    int n = j - k;
    j -= i;
    k = getPaddingRight();
    int i1 = j - k;
    int i2 = getVirtualChildCount();
    j = this.mGravity;
    k = j & 0x70;
    int i3 = 8388615;
    int i4 = j & i3;
    j = 16;
    if (k != j)
    {
      j = 80;
      if (k != j)
      {
        j = getPaddingTop();
      }
      else
      {
        j = getPaddingTop() + paramInt4 - paramInt2;
        k = this.mTotalLength;
        j -= k;
      }
    }
    else
    {
      j = getPaddingTop();
      k = paramInt4 - paramInt2;
      i3 = this.mTotalLength;
      k = (k - i3) / 2;
      j += k;
    }
    k = 0;
    Object localObject1 = null;
    int i5 = 0;
    while (i5 < i2)
    {
      View localView = localLinearLayoutCompat.getVirtualChildAt(i5);
      int i6 = 1;
      if (localView == null)
      {
        k = localLinearLayoutCompat.measureNullChild(i5);
        j += k;
      }
      else
      {
        k = localView.getVisibility();
        i3 = 8;
        if (k != i3)
        {
          int i7 = localView.getMeasuredWidth();
          int i8 = localView.getMeasuredHeight();
          localObject1 = localView.getLayoutParams();
          Object localObject2 = localObject1;
          localObject2 = (LinearLayoutCompat.LayoutParams)localObject1;
          k = ((LinearLayout.LayoutParams)localObject2).gravity;
          if (k < 0) {
            k = i4;
          }
          i3 = ViewCompat.OooOoOO(this);
          k = GravityCompat.OooO0O0(k, i3) & 0x7;
          if (k != i6)
          {
            i3 = 5;
            if (k != i3)
            {
              k = ((LinearLayout.LayoutParams)localObject2).leftMargin + i;
              break label386;
            }
            k = n - i7;
          }
          else
          {
            k = (i1 - i7) / 2 + i;
            i3 = ((LinearLayout.LayoutParams)localObject2).leftMargin;
            k += i3;
          }
          i3 = ((LinearLayout.LayoutParams)localObject2).rightMargin;
          k -= i3;
          label386:
          i3 = k;
          boolean bool = localLinearLayoutCompat.hasDividerBeforeChildAt(i5);
          if (bool)
          {
            m = localLinearLayoutCompat.mDividerHeight;
            j += m;
          }
          m = ((LinearLayout.LayoutParams)localObject2).topMargin;
          int i9 = j + m;
          j = localLinearLayoutCompat.getLocationOffset(localView);
          int i10 = i9 + j;
          localObject1 = localView;
          OooO0o(localView, i3, i10, i7, i8);
          j = ((LinearLayout.LayoutParams)localObject2).bottomMargin;
          i8 += j;
          j = localLinearLayoutCompat.getNextLocationOffset(localView);
          i8 += j;
          i9 += i8;
          j = localLinearLayoutCompat.getChildrenSkipCount(localView, i5);
          i5 += j;
          j = i9;
          m = 1;
          break label535;
        }
      }
      int m = i6;
      label535:
      i5 += m;
    }
  }
  
  public void measureChildBeforeLayout(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    measureChildWithMargins(paramView, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public void measureHorizontal(int paramInt1, int paramInt2)
  {
    LinearLayoutCompat localLinearLayoutCompat = this;
    int i = paramInt1;
    int j = paramInt2;
    int k = 0;
    Object localObject1 = null;
    this.mTotalLength = 0;
    int m = getVirtualChildCount();
    int n = View.MeasureSpec.getMode(paramInt1);
    int i1 = View.MeasureSpec.getMode(paramInt2);
    Object localObject2 = this.mMaxAscent;
    int i2 = 4;
    if (localObject2 != null)
    {
      localObject2 = this.mMaxDescent;
      if (localObject2 != null) {}
    }
    else
    {
      localObject2 = new int[i2];
      localLinearLayoutCompat.mMaxAscent = ((int[])localObject2);
      localObject2 = new int[i2];
      localLinearLayoutCompat.mMaxDescent = ((int[])localObject2);
    }
    int[] arrayOfInt = localLinearLayoutCompat.mMaxAscent;
    Object localObject3 = localLinearLayoutCompat.mMaxDescent;
    int i3 = 3;
    int i4 = -1;
    float f1 = 0.0F / 0.0F;
    arrayOfInt[i3] = i4;
    int i8 = 2;
    arrayOfInt[i8] = i4;
    int i9 = 1;
    float f2 = 1.4E-45F;
    arrayOfInt[i9] = i4;
    arrayOfInt[0] = i4;
    localObject3[i3] = i4;
    localObject3[i8] = i4;
    localObject3[i9] = i4;
    localObject3[0] = i4;
    int i10 = localLinearLayoutCompat.mBaselineAligned;
    int i13 = localLinearLayoutCompat.mUseLargestChild;
    int i16 = 1073741824;
    float f3 = 2.0F;
    int i17;
    if (n == i16) {
      i17 = i9;
    } else {
      i17 = 0;
    }
    int i18 = 0;
    Object localObject4 = null;
    float f4 = 0.0F;
    i2 = 0;
    View localView1 = null;
    int i19 = 0;
    int i20 = 0;
    int i21 = 0;
    float f5 = 0.0F;
    int i23 = 0;
    int i24 = 0;
    int i25 = 0;
    int i26 = i9;
    int i27 = 0;
    localObject2 = null;
    float f6 = 0.0F;
    Object localObject5;
    Object localObject7;
    label709:
    int i37;
    for (;;)
    {
      localObject5 = localObject3;
      i4 = 8;
      f1 = 1.121039E-044F;
      if (i18 >= m) {
        break;
      }
      localObject3 = localLinearLayoutCompat.getVirtualChildAt(i18);
      if (localObject3 == null)
      {
        i4 = localLinearLayoutCompat.mTotalLength;
        i30 = localLinearLayoutCompat.measureNullChild(i18);
        i4 += i30;
        localLinearLayoutCompat.mTotalLength = i4;
      }
      for (;;)
      {
        i33 = i13;
        i34 = i10;
        i35 = i16;
        i16 = i18;
        i18 = i35;
        f4 = f3;
        break label1354;
        k = ((View)localObject3).getVisibility();
        if (k != i4) {
          break;
        }
        i4 = localLinearLayoutCompat.getChildrenSkipCount((View)localObject3, i18);
        i18 += i4;
      }
      boolean bool1 = localLinearLayoutCompat.hasDividerBeforeChildAt(i18);
      if (bool1)
      {
        i5 = localLinearLayoutCompat.mTotalLength;
        k = localLinearLayoutCompat.mDividerWidth;
        i5 += k;
        localLinearLayoutCompat.mTotalLength = i5;
      }
      localObject6 = ((View)localObject3).getLayoutParams();
      localObject1 = localObject6;
      localObject1 = (LinearLayoutCompat.LayoutParams)localObject6;
      f1 = ((LinearLayout.LayoutParams)localObject1).weight;
      float f7 = f6 + f1;
      if (n == i16)
      {
        i27 = ((LinearLayout.LayoutParams)localObject1).width;
        if (i27 == 0)
        {
          boolean bool7 = f1 < 0.0F;
          if (bool7)
          {
            i28 = localLinearLayoutCompat.mTotalLength;
            if (i17 != 0)
            {
              i5 = ((LinearLayout.LayoutParams)localObject1).leftMargin;
              i16 = ((LinearLayout.LayoutParams)localObject1).rightMargin;
              i5 += i16;
              i28 += i5;
            }
            else
            {
              i16 = ((LinearLayout.LayoutParams)localObject1).leftMargin + i28;
              i5 = ((LinearLayout.LayoutParams)localObject1).rightMargin;
              i16 += i5;
              i28 = Math.max(i28, i16);
            }
            localLinearLayoutCompat.mTotalLength = i28;
            if (i10 != 0)
            {
              i28 = 0;
              f6 = 0.0F;
              localObject2 = null;
              i16 = View.MeasureSpec.makeMeasureSpec(0, 0);
              ((View)localObject3).measure(i16, i16);
              i36 = i18;
              i33 = i13;
              i34 = i10;
              localObject7 = localObject3;
              break label990;
            }
            i36 = i18;
            i33 = i13;
            i34 = i10;
            localObject7 = localObject3;
            i23 = i9;
            i18 = 1073741824;
            f4 = 2.0F;
            break label998;
          }
        }
      }
      int i28 = ((LinearLayout.LayoutParams)localObject1).width;
      if (i28 == 0)
      {
        bool8 = f1 < 0.0F;
        if (bool8)
        {
          i5 = -2;
          f1 = 0.0F / 0.0F;
          ((LinearLayout.LayoutParams)localObject1).width = i5;
          i16 = 0;
          f3 = 0.0F;
          localView2 = null;
          break label709;
        }
      }
      int i5 = -2;
      f1 = 0.0F / 0.0F;
      i16 = -1 << -1;
      f3 = -0.0F;
      boolean bool8 = f7 < 0.0F;
      if (!bool8)
      {
        i29 = localLinearLayoutCompat.mTotalLength;
        i37 = i29;
      }
      else
      {
        i37 = 0;
        localObject8 = null;
      }
      localObject2 = this;
      int i36 = i18;
      localObject4 = localObject3;
      int i38 = i16;
      i16 = i18;
      i33 = i13;
      i14 = paramInt1;
      i34 = i10;
      i10 = i37;
      i37 = i5;
      i5 = paramInt2;
      j = -1 << -1;
      Object localObject8 = localObject3;
      i30 = 0;
      localObject3 = null;
      measureChildBeforeLayout(localObject4, i18, paramInt1, i10, paramInt2, 0);
      i29 = i38;
      f6 = f3;
      if (i38 != j) {
        ((LinearLayout.LayoutParams)localObject1).width = i38;
      }
      i29 = localObject8.getMeasuredWidth();
      if (i17 != 0)
      {
        i18 = localLinearLayoutCompat.mTotalLength;
        i16 = ((LinearLayout.LayoutParams)localObject1).leftMargin + i29;
        i14 = ((LinearLayout.LayoutParams)localObject1).rightMargin;
        i16 += i14;
        localObject7 = localObject8;
        i11 = localLinearLayoutCompat.getNextLocationOffset(localObject8);
        i16 += i11;
        i18 += i16;
      }
      else
      {
        localObject7 = localObject8;
        i18 = localLinearLayoutCompat.mTotalLength;
        i16 = i18 + i29;
        i11 = ((LinearLayout.LayoutParams)localObject1).leftMargin;
        i16 += i11;
        i11 = ((LinearLayout.LayoutParams)localObject1).rightMargin;
        i16 += i11;
        i11 = localLinearLayoutCompat.getNextLocationOffset(localObject8);
        i16 += i11;
        i18 = Math.max(i18, i16);
      }
      localLinearLayoutCompat.mTotalLength = i18;
      if (i33 != 0) {
        i2 = Math.max(i29, i2);
      }
      label990:
      i18 = 1073741824;
      f4 = 2.0F;
      label998:
      if (i1 != i18)
      {
        i29 = ((LinearLayout.LayoutParams)localObject1).height;
        i16 = -1;
        f3 = 0.0F / 0.0F;
        if (i29 == i16)
        {
          i29 = i9;
          f6 = f2;
          i25 = i9;
          break label1051;
        }
      }
      i29 = 0;
      f6 = 0.0F;
      localObject2 = null;
      label1051:
      i16 = ((LinearLayout.LayoutParams)localObject1).topMargin;
      i11 = ((LinearLayout.LayoutParams)localObject1).bottomMargin;
      i16 += i11;
      i11 = ((View)localObject7).getMeasuredHeight() + i16;
      i5 = ((View)localObject7).getMeasuredState();
      i30 = i24;
      i24 = View.combineMeasuredStates(i24, i5);
      if (i34 != 0)
      {
        i5 = ((View)localObject7).getBaseline();
        i30 = -1;
        if (i5 != i30)
        {
          i30 = ((LinearLayout.LayoutParams)localObject1).gravity;
          if (i30 < 0) {
            i30 = localLinearLayoutCompat.mGravity;
          }
          i30 = ((i30 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
          j = Math.max(arrayOfInt[i30], i5);
          arrayOfInt[i30] = j;
          j = localObject5[i30];
          i5 = i11 - i5;
          i5 = Math.max(j, i5);
          localObject5[i30] = i5;
        }
      }
      i5 = i19;
      i19 = Math.max(i19, i11);
      if (i26 != 0)
      {
        i5 = ((LinearLayout.LayoutParams)localObject1).height;
        i30 = -1;
        if (i5 == i30)
        {
          i26 = i9;
          break label1250;
        }
      }
      i26 = 0;
      label1250:
      f1 = ((LinearLayout.LayoutParams)localObject1).weight;
      boolean bool2 = f1 < 0.0F;
      if (bool2)
      {
        if (i29 == 0) {
          i16 = i11;
        }
        k = i21;
        i21 = Math.max(i21, i16);
      }
      else
      {
        k = i21;
        if (i29 == 0) {
          i16 = i11;
        }
        i11 = i20;
        i20 = Math.max(i20, i16);
        i21 = k;
      }
      k = i36;
      i29 = localLinearLayoutCompat.getChildrenSkipCount((View)localObject7, i36) + i36;
      i16 = i29;
      f6 = f7;
      label1354:
      i16 += 1;
      j = paramInt2;
      localObject3 = localObject5;
      i14 = i33;
      i11 = i34;
      i6 = -1;
      f1 = 0.0F / 0.0F;
      k = 0;
      localObject1 = null;
      int i35 = i16;
      i16 = i18;
      f3 = f4;
      i18 = i35;
    }
    i18 = i16;
    f4 = f3;
    int i33 = i14;
    int i34 = i11;
    i16 = i19;
    int i11 = i20;
    k = i21;
    int i30 = i24;
    j = -1 << -1;
    int i14 = localLinearLayoutCompat.mTotalLength;
    if (i14 > 0)
    {
      boolean bool5 = localLinearLayoutCompat.hasDividerBeforeChildAt(m);
      if (bool5)
      {
        i15 = localLinearLayoutCompat.mTotalLength;
        i18 = localLinearLayoutCompat.mDividerWidth;
        i15 += i18;
        localLinearLayoutCompat.mTotalLength = i15;
      }
    }
    i18 = arrayOfInt[i9];
    int i15 = -1;
    float f8 = 0.0F / 0.0F;
    if (i18 == i15)
    {
      i19 = 0;
      i6 = arrayOfInt[0];
      if (i6 == i15)
      {
        i6 = arrayOfInt[i8];
        if (i6 == i15)
        {
          i6 = arrayOfInt[i3];
          if (i6 == i15)
          {
            i18 = i16;
            i21 = i30;
            break label1701;
          }
        }
      }
    }
    i15 = arrayOfInt[i3];
    j = arrayOfInt[0];
    int i6 = arrayOfInt[i8];
    i18 = Math.max(i18, i6);
    i18 = Math.max(j, i18);
    i18 = Math.max(i15, i18);
    i15 = localObject5[i3];
    f1 = 0.0F;
    Object localObject6 = null;
    j = localObject5[0];
    i6 = localObject5[i9];
    i21 = i30;
    i30 = localObject5[i8];
    i6 = Math.max(i6, i30);
    i6 = Math.max(j, i6);
    i15 = Math.max(i15, i6);
    i18 += i15;
    i18 = Math.max(i16, i18);
    label1701:
    if (i33 != 0)
    {
      i16 = -1 << -1;
      f3 = -0.0F;
      if ((n == i16) || (n == 0))
      {
        localLinearLayoutCompat.mTotalLength = 0;
        i16 = 0;
        f3 = 0.0F;
        localView2 = null;
        while (i16 < m)
        {
          localObject7 = localLinearLayoutCompat.getVirtualChildAt(i16);
          if (localObject7 == null)
          {
            i15 = localLinearLayoutCompat.mTotalLength;
            i6 = localLinearLayoutCompat.measureNullChild(i16);
            i15 += i6;
            localLinearLayoutCompat.mTotalLength = i15;
          }
          else
          {
            i6 = ((View)localObject7).getVisibility();
            i30 = 8;
            if (i6 != i30) {
              break label1833;
            }
            i15 = localLinearLayoutCompat.getChildrenSkipCount((View)localObject7, i16);
            i16 += i15;
          }
          for (;;)
          {
            i19 = i18;
            break label1978;
            label1833:
            localObject6 = (LinearLayoutCompat.LayoutParams)((View)localObject7).getLayoutParams();
            i30 = localLinearLayoutCompat.mTotalLength;
            if (i17 == 0) {
              break;
            }
            j = ((LinearLayout.LayoutParams)localObject6).leftMargin + i2;
            i6 = ((LinearLayout.LayoutParams)localObject6).rightMargin;
            j += i6;
            i15 = localLinearLayoutCompat.getNextLocationOffset((View)localObject7);
            j += i15;
            i30 += j;
            localLinearLayoutCompat.mTotalLength = i30;
          }
          j = i30 + i2;
          i19 = i18;
          i18 = ((LinearLayout.LayoutParams)localObject6).leftMargin;
          j += i18;
          i18 = ((LinearLayout.LayoutParams)localObject6).rightMargin;
          j += i18;
          i18 = localLinearLayoutCompat.getNextLocationOffset((View)localObject7);
          j += i18;
          i18 = Math.max(i30, j);
          localLinearLayoutCompat.mTotalLength = i18;
          label1978:
          i16 += 1;
          i18 = i19;
        }
      }
    }
    i19 = i18;
    i18 = localLinearLayoutCompat.mTotalLength;
    i16 = getPaddingLeft();
    i15 = getPaddingRight();
    i16 += i15;
    i18 += i16;
    localLinearLayoutCompat.mTotalLength = i18;
    i16 = getSuggestedMinimumWidth();
    i18 = Math.max(i18, i16);
    View localView2 = null;
    i18 = View.resolveSizeAndState(i18, i, 0);
    f3 = 2.350989E-038F;
    i16 = 0xFFFFFF & i18;
    i15 = localLinearLayoutCompat.mTotalLength;
    i16 -= i15;
    if (i23 == 0) {
      if (i16 != 0)
      {
        boolean bool3 = f6 < 0.0F;
        if (bool3) {}
      }
      else
      {
        i29 = Math.max(i11, k);
        if (i33 != 0)
        {
          i16 = 1073741824;
          f3 = 2.0F;
          if (n != i16)
          {
            k = 0;
            localObject1 = null;
            while (k < m)
            {
              localView2 = localLinearLayoutCompat.getVirtualChildAt(k);
              if (localView2 != null)
              {
                i11 = localView2.getVisibility();
                i7 = 8;
                f1 = 1.121039E-044F;
                if (i11 != i7)
                {
                  LinearLayoutCompat.LayoutParams localLayoutParams = (LinearLayoutCompat.LayoutParams)localView2.getLayoutParams();
                  f9 = localLayoutParams.weight;
                  boolean bool4 = f9 < 0.0F;
                  if (bool4)
                  {
                    i12 = 1073741824;
                    f9 = 2.0F;
                    i7 = View.MeasureSpec.makeMeasureSpec(i2, i12);
                    i30 = View.MeasureSpec.makeMeasureSpec(localView2.getMeasuredHeight(), i12);
                    localView2.measure(i7, i30);
                  }
                }
              }
              k += 1;
            }
          }
        }
        i16 = paramInt2;
        i24 = m;
        i15 = i19;
        break label3465;
      }
    }
    f1 = localLinearLayoutCompat.mWeightSum;
    int i31 = f1 < 0.0F;
    if (i31 > 0) {
      f6 = f1;
    }
    int i7 = -1;
    f1 = 0.0F / 0.0F;
    arrayOfInt[i3] = i7;
    arrayOfInt[i8] = i7;
    arrayOfInt[i9] = i7;
    localObject3 = null;
    arrayOfInt[0] = i7;
    localObject5[i3] = i7;
    localObject5[i8] = i7;
    localObject5[i9] = i7;
    localObject5[0] = i7;
    localLinearLayoutCompat.mTotalLength = 0;
    i31 = i12;
    int i12 = i7;
    float f9 = f1;
    j = i21;
    k = 0;
    localObject1 = null;
    label2643:
    label2649:
    label2931:
    int i32;
    while (k < m)
    {
      localView1 = localLinearLayoutCompat.getVirtualChildAt(k);
      if (localView1 != null)
      {
        i7 = localView1.getVisibility();
        i15 = 8;
        f8 = 1.121039E-044F;
        if (i7 != i15)
        {
          localObject6 = (LinearLayoutCompat.LayoutParams)localView1.getLayoutParams();
          f8 = ((LinearLayout.LayoutParams)localObject6).weight;
          boolean bool6 = f8 < 0.0F;
          float f10;
          if (bool6)
          {
            f10 = i16 * f8 / f6;
            i = (int)f10;
            f6 -= f8;
            i16 -= i;
            i15 = getPaddingTop();
            i22 = getPaddingBottom();
            i15 += i22;
            f5 = f6;
            i29 = ((LinearLayout.LayoutParams)localObject6).topMargin;
            i15 += i29;
            i29 = ((LinearLayout.LayoutParams)localObject6).bottomMargin;
            i15 += i29;
            i29 = ((LinearLayout.LayoutParams)localObject6).height;
            i23 = i16;
            i24 = m;
            m = -1;
            i16 = paramInt2;
            i29 = ViewGroup.getChildMeasureSpec(paramInt2, i15, i29);
            i15 = ((LinearLayout.LayoutParams)localObject6).width;
            if (i15 == 0)
            {
              i15 = 1073741824;
              f8 = 2.0F;
              if (n == i15)
              {
                if (i <= 0) {
                  break label2643;
                }
                break label2649;
              }
            }
            else
            {
              i15 = 1073741824;
              f8 = 2.0F;
            }
            i37 = localView1.getMeasuredWidth();
            i = i37 + i;
            if (i < 0)
            {
              i = 0;
              f10 = 0.0F;
            }
            i = View.MeasureSpec.makeMeasureSpec(i, i15);
            localView1.measure(i, i29);
            i29 = localView1.getMeasuredState();
            f8 = -1.701412E+038F;
            i29 &= 0xFF000000;
            j = View.combineMeasuredStates(j, i29);
            f6 = f5;
            i15 = i23;
          }
          else
          {
            i15 = i16;
            i24 = m;
            m = -1;
            i16 = paramInt2;
          }
          i = localLinearLayoutCompat.mTotalLength;
          if (i17 != 0)
          {
            i22 = localView1.getMeasuredWidth();
            m = ((LinearLayout.LayoutParams)localObject6).leftMargin;
            i22 += m;
            m = ((LinearLayout.LayoutParams)localObject6).rightMargin;
            i22 += m;
            m = localLinearLayoutCompat.getNextLocationOffset(localView1);
            i22 += m;
            i += i22;
            localLinearLayoutCompat.mTotalLength = i;
            f5 = f6;
          }
          else
          {
            m = localView1.getMeasuredWidth() + i;
            f5 = f6;
            i29 = ((LinearLayout.LayoutParams)localObject6).leftMargin;
            m += i29;
            i29 = ((LinearLayout.LayoutParams)localObject6).rightMargin;
            m += i29;
            i29 = localLinearLayoutCompat.getNextLocationOffset(localView1);
            m += i29;
            i29 = Math.max(i, m);
            localLinearLayoutCompat.mTotalLength = i29;
          }
          i29 = 1073741824;
          f6 = 2.0F;
          if (i1 != i29)
          {
            i29 = ((LinearLayout.LayoutParams)localObject6).height;
            i = -1;
            f10 = 0.0F / 0.0F;
            if (i29 == i)
            {
              i29 = i9;
              f6 = f2;
              break label2931;
            }
          }
          i29 = 0;
          f6 = 0.0F;
          localObject2 = null;
          i = ((LinearLayout.LayoutParams)localObject6).topMargin;
          m = ((LinearLayout.LayoutParams)localObject6).bottomMargin;
          i += m;
          m = localView1.getMeasuredHeight() + i;
          i12 = Math.max(i12, m);
          if (i29 == 0) {
            i = m;
          }
          i29 = Math.max(i31, i);
          if (i26 != 0)
          {
            i32 = ((LinearLayout.LayoutParams)localObject6).height;
            i = -1;
            f10 = 0.0F / 0.0F;
            if (i32 == i)
            {
              i32 = i9;
              break label3040;
            }
          }
          else
          {
            i = -1;
            f10 = 0.0F / 0.0F;
          }
          i32 = 0;
          localObject3 = null;
          label3040:
          if (i34 != 0)
          {
            i2 = localView1.getBaseline();
            if (i2 != i)
            {
              i7 = ((LinearLayout.LayoutParams)localObject6).gravity;
              if (i7 < 0) {
                i7 = localLinearLayoutCompat.mGravity;
              }
              i7 &= 0x70;
              f10 = 5.605194E-045F;
              i7 = (i7 >> 4 & 0xFFFFFFFE) >> 1;
              i = Math.max(arrayOfInt[i7], i2);
              arrayOfInt[i7] = i;
              i = localObject5[i7];
              m -= i2;
              i = Math.max(i, m);
              localObject5[i7] = i;
            }
          }
          i26 = i32;
          i32 = i29;
          f6 = f5;
          break label3175;
        }
      }
      i15 = i16;
      i24 = m;
      i16 = paramInt2;
      label3175:
      k += 1;
      i = paramInt1;
      i16 = i15;
      m = i24;
      i7 = -1;
      f1 = 0.0F / 0.0F;
    }
    i16 = paramInt2;
    i24 = m;
    int i29 = localLinearLayoutCompat.mTotalLength;
    i15 = getPaddingLeft();
    i7 = getPaddingRight();
    i15 += i7;
    i29 += i15;
    localLinearLayoutCompat.mTotalLength = i29;
    i29 = arrayOfInt[i9];
    i15 = -1;
    f8 = 0.0F / 0.0F;
    if (i29 == i15)
    {
      i7 = 0;
      f1 = 0.0F;
      localObject6 = null;
      i = arrayOfInt[0];
      if (i == i15)
      {
        i7 = arrayOfInt[i8];
        if (i7 == i15)
        {
          i7 = arrayOfInt[i3];
          if (i7 == i15)
          {
            i29 = i12;
            break label3453;
          }
        }
      }
    }
    i15 = arrayOfInt[i3];
    f1 = 0.0F;
    localObject6 = null;
    i = arrayOfInt[0];
    k = arrayOfInt[i8];
    i29 = Math.max(i29, k);
    i29 = Math.max(i, i29);
    i29 = Math.max(i15, i29);
    i15 = localObject5[i3];
    i7 = localObject5[0];
    i = localObject5[i9];
    k = localObject5[i8];
    i = Math.max(i, k);
    i7 = Math.max(i7, i);
    i15 = Math.max(i15, i7);
    i29 += i15;
    i29 = Math.max(i12, i29);
    label3453:
    i15 = i29;
    i29 = i32;
    int i22 = j;
    label3465:
    if (i26 == 0)
    {
      i12 = 1073741824;
      f9 = 2.0F;
      if (i1 != i12) {}
    }
    else
    {
      i29 = i15;
    }
    i15 = getPaddingTop();
    i12 = getPaddingBottom();
    i15 += i12;
    i29 += i15;
    i15 = getSuggestedMinimumHeight();
    i29 = Math.max(i29, i15);
    f8 = -1.701412E+038F;
    i15 = i22 & 0xFF000000;
    i18 |= i15;
    i15 = i22 << 16;
    i29 = View.resolveSizeAndState(i29, i16, i15);
    localLinearLayoutCompat.setMeasuredDimension(i18, i29);
    if (i25 != 0)
    {
      i29 = paramInt1;
      i18 = i24;
      localLinearLayoutCompat.OooO0Oo(i24, paramInt1);
    }
  }
  
  public int measureNullChild(int paramInt)
  {
    return 0;
  }
  
  public void measureVertical(int paramInt1, int paramInt2)
  {
    LinearLayoutCompat localLinearLayoutCompat = this;
    int i = paramInt1;
    int k = paramInt2;
    int n = 0;
    float f1 = 0.0F;
    Object localObject1 = null;
    this.mTotalLength = 0;
    int i1 = getVirtualChildCount();
    int i5 = View.MeasureSpec.getMode(paramInt1);
    int i6 = View.MeasureSpec.getMode(paramInt2);
    int i7 = this.mBaselineAlignedChildIndex;
    boolean bool4 = this.mUseLargestChild;
    int i9 = 1;
    float f2 = 1.4E-45F;
    int i10 = 0;
    Object localObject2 = null;
    float f3 = 0.0F;
    int i13 = 0;
    float f4 = 0.0F;
    int i14 = 0;
    Object localObject3 = null;
    int i16 = 0;
    View localView1 = null;
    int i17 = 0;
    int i18 = 0;
    View localView2 = null;
    boolean bool8 = false;
    float f5 = 0.0F;
    int i20 = 0;
    int i21 = i9;
    int i22 = 0;
    Object localObject4 = null;
    float f6 = 0.0F;
    label506:
    int i31;
    for (;;)
    {
      n = 8;
      f1 = 1.121039E-044F;
      int i26 = i16;
      if (i18 >= i1) {
        break;
      }
      localView1 = localLinearLayoutCompat.getVirtualChildAt(i18);
      if (localView1 == null)
      {
        i16 = localLinearLayoutCompat.mTotalLength;
        n = localLinearLayoutCompat.measureNullChild(i18);
        i16 += n;
        localLinearLayoutCompat.mTotalLength = i16;
        i27 = i1;
        i28 = i6;
        i16 = i26;
      }
      else
      {
        i28 = i10;
        i10 = localView1.getVisibility();
        if (i10 == n)
        {
          i10 = localLinearLayoutCompat.getChildrenSkipCount(localView1, i18);
          i18 += i10;
          i27 = i1;
          i10 = i28;
          i28 = i6;
        }
        else
        {
          boolean bool5 = localLinearLayoutCompat.hasDividerBeforeChildAt(i18);
          if (bool5)
          {
            i11 = localLinearLayoutCompat.mTotalLength;
            n = localLinearLayoutCompat.mDividerHeight;
            i11 += n;
            localLinearLayoutCompat.mTotalLength = i11;
          }
          localObject2 = localView1.getLayoutParams();
          localObject1 = localObject2;
          localObject1 = (LinearLayoutCompat.LayoutParams)localObject2;
          f3 = ((LinearLayout.LayoutParams)localObject1).weight;
          float f7 = f6 + f3;
          i22 = 1073741824;
          f6 = 2.0F;
          if (i6 == i22)
          {
            i22 = ((LinearLayout.LayoutParams)localObject1).height;
            if (i22 == 0)
            {
              boolean bool9 = f3 < 0.0F;
              if (bool9)
              {
                i23 = localLinearLayoutCompat.mTotalLength;
                i11 = ((LinearLayout.LayoutParams)localObject1).topMargin + i23;
                i27 = i13;
                i13 = ((LinearLayout.LayoutParams)localObject1).bottomMargin;
                i11 += i13;
                i23 = Math.max(i23, i11);
                localLinearLayoutCompat.mTotalLength = i23;
                i23 = i14;
                localObject3 = localView1;
                i29 = i17;
                bool8 = i9;
                f5 = f2;
                i = i28;
                i30 = i27;
                i27 = i1;
                i28 = i6;
                i6 = i26;
                i1 = i18;
                break label755;
              }
            }
          }
          i27 = i13;
          int i23 = ((LinearLayout.LayoutParams)localObject1).height;
          if (i23 == 0)
          {
            boolean bool10 = f3 < 0.0F;
            if (bool10)
            {
              int i24 = -2;
              f6 = 0.0F / 0.0F;
              ((LinearLayout.LayoutParams)localObject1).height = i24;
              i13 = 0;
              f4 = 0.0F;
              break label506;
            }
          }
          i13 = -1 << -1;
          f4 = -0.0F;
          boolean bool11 = f7 < 0.0F;
          if (!bool11)
          {
            i25 = localLinearLayoutCompat.mTotalLength;
            i31 = i25;
          }
          else
          {
            i31 = 0;
          }
          int i32 = 1073741824;
          localObject4 = this;
          i = i28;
          localObject2 = localView1;
          int i33 = i13;
          int i30 = i27;
          i13 = i18;
          k = i14;
          i14 = paramInt1;
          i27 = i1;
          i28 = i6;
          i6 = i26;
          i1 = i32;
          View localView3 = localView1;
          i16 = 0;
          localView1 = null;
          int i29 = i17;
          i17 = paramInt2;
          i1 = i18;
          i18 = i31;
          measureChildBeforeLayout((View)localObject2, i13, paramInt1, 0, paramInt2, i31);
          i25 = i33;
          f6 = f4;
          int i11 = -1 << -1;
          f3 = -0.0F;
          if (i33 != i11) {
            ((LinearLayout.LayoutParams)localObject1).height = i33;
          }
          i25 = localView3.getMeasuredHeight();
          i11 = localLinearLayoutCompat.mTotalLength;
          i13 = i11 + i25;
          i14 = ((LinearLayout.LayoutParams)localObject1).topMargin;
          i13 += i14;
          i14 = ((LinearLayout.LayoutParams)localObject1).bottomMargin;
          i13 += i14;
          localObject3 = localView3;
          i16 = localLinearLayoutCompat.getNextLocationOffset(localView3);
          i13 += i16;
          i11 = Math.max(i11, i13);
          localLinearLayoutCompat.mTotalLength = i11;
          if (bool4) {
            i25 = Math.max(i25, k);
          } else {
            i25 = k;
          }
          label755:
          if (i7 >= 0)
          {
            i18 = i1 + 1;
            if (i7 == i18)
            {
              i11 = localLinearLayoutCompat.mTotalLength;
              localLinearLayoutCompat.mBaselineChildTop = i11;
            }
          }
          if (i1 < i7)
          {
            f3 = ((LinearLayout.LayoutParams)localObject1).weight;
            boolean bool6 = f3 < 0.0F;
            if (bool6)
            {
              localObject4 = new java/lang/RuntimeException;
              ((RuntimeException)localObject4).<init>("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
              throw ((Throwable)localObject4);
            }
          }
          i12 = 1073741824;
          f3 = 2.0F;
          if (i5 != i12)
          {
            i12 = ((LinearLayout.LayoutParams)localObject1).width;
            i13 = -1;
            f4 = 0.0F / 0.0F;
            if (i12 == i13)
            {
              i12 = i9;
              f3 = f2;
              i20 = i9;
              break label890;
            }
          }
          i12 = 0;
          f3 = 0.0F;
          localObject2 = null;
          label890:
          i13 = ((LinearLayout.LayoutParams)localObject1).leftMargin;
          i16 = ((LinearLayout.LayoutParams)localObject1).rightMargin;
          i13 += i16;
          i16 = ((View)localObject3).getMeasuredWidth() + i13;
          i17 = i30;
          i17 = Math.max(i30, i16);
          i18 = ((View)localObject3).getMeasuredState();
          i18 = View.combineMeasuredStates(i, i18);
          if (i21 != 0)
          {
            i = ((LinearLayout.LayoutParams)localObject1).width;
            k = -1;
            f8 = 0.0F / 0.0F;
            if (i == k)
            {
              i21 = i9;
              break label987;
            }
          }
          i21 = 0;
          label987:
          f9 = ((LinearLayout.LayoutParams)localObject1).weight;
          boolean bool1 = f9 < 0.0F;
          if (bool1)
          {
            if (i12 == 0) {
              i13 = i16;
            }
            i16 = Math.max(i6, i13);
            i12 = i29;
          }
          else
          {
            if (i12 == 0) {
              i13 = i16;
            }
            i12 = i29;
            i12 = Math.max(i29, i13);
            i16 = i6;
          }
          i13 = localLinearLayoutCompat.getChildrenSkipCount((View)localObject3, i1) + i1;
          i14 = i25;
          f6 = f7;
          int i34 = i17;
          i17 = i12;
          i12 = i18;
          i18 = i13;
          i13 = i34;
        }
      }
      i18 += 1;
      j = paramInt1;
      k = paramInt2;
      i6 = i28;
      i1 = i27;
    }
    int j = i12;
    k = i14;
    int i12 = i17;
    int i27 = i1;
    int i28 = i6;
    i6 = i16;
    i17 = i13;
    i13 = localLinearLayoutCompat.mTotalLength;
    if (i13 > 0)
    {
      i13 = i1;
      boolean bool7 = localLinearLayoutCompat.hasDividerBeforeChildAt(i1);
      if (bool7)
      {
        i15 = localLinearLayoutCompat.mTotalLength;
        i16 = localLinearLayoutCompat.mDividerHeight;
        i15 += i16;
        localLinearLayoutCompat.mTotalLength = i15;
      }
    }
    else
    {
      i13 = i1;
    }
    int i15 = i28;
    int i35;
    if (bool4)
    {
      i16 = -1 << -1;
      if ((i28 == i16) || (i28 == 0))
      {
        localLinearLayoutCompat.mTotalLength = 0;
        i16 = 0;
        localView1 = null;
        while (i16 < i13)
        {
          localView2 = localLinearLayoutCompat.getVirtualChildAt(i16);
          if (localView2 == null)
          {
            i18 = localLinearLayoutCompat.mTotalLength;
            i1 = localLinearLayoutCompat.measureNullChild(i16);
            i18 += i1;
          }
          for (;;)
          {
            localLinearLayoutCompat.mTotalLength = i18;
            break;
            i1 = localView2.getVisibility();
            if (i1 == n)
            {
              i18 = localLinearLayoutCompat.getChildrenSkipCount(localView2, i16);
              i16 += i18;
              break;
            }
            LinearLayoutCompat.LayoutParams localLayoutParams1 = (LinearLayoutCompat.LayoutParams)localView2.getLayoutParams();
            i7 = localLinearLayoutCompat.mTotalLength;
            i35 = i7 + k;
            n = localLayoutParams1.topMargin;
            i35 += n;
            n = localLayoutParams1.bottomMargin;
            i35 += n;
            i18 = localLinearLayoutCompat.getNextLocationOffset(localView2);
            i18 = i35 + i18;
            i18 = Math.max(i7, i18);
          }
          i16 += 1;
          n = 8;
          f1 = 1.121039E-044F;
        }
      }
    }
    i16 = localLinearLayoutCompat.mTotalLength;
    i18 = getPaddingTop();
    n = getPaddingBottom();
    i18 += n;
    i16 += i18;
    localLinearLayoutCompat.mTotalLength = i16;
    i18 = getSuggestedMinimumHeight();
    i16 = Math.max(i16, i18);
    i18 = paramInt2;
    n = k;
    LinearLayoutCompat.LayoutParams localLayoutParams2 = null;
    i16 = View.resolveSizeAndState(i16, paramInt2, 0);
    float f8 = 2.350989E-038F;
    k = 0xFFFFFF & i16;
    i1 = localLinearLayoutCompat.mTotalLength;
    k -= i1;
    if (!bool8) {
      if (k != 0)
      {
        boolean bool3 = f6 < 0.0F;
        if (bool3) {}
      }
      else
      {
        i25 = Math.max(i12, i6);
        if (bool4)
        {
          i12 = 1073741824;
          f3 = 2.0F;
          if (i15 != i12)
          {
            i12 = 0;
            f3 = 0.0F;
            localObject2 = null;
            while (i12 < i13)
            {
              localObject3 = localLinearLayoutCompat.getVirtualChildAt(i12);
              if (localObject3 != null)
              {
                k = ((View)localObject3).getVisibility();
                i2 = 8;
                if (k != i2)
                {
                  localLayoutParams2 = (LinearLayoutCompat.LayoutParams)((View)localObject3).getLayoutParams();
                  f8 = localLayoutParams2.weight;
                  boolean bool2 = f8 < 0.0F;
                  if (bool2)
                  {
                    m = ((View)localObject3).getMeasuredWidth();
                    i2 = 1073741824;
                    m = View.MeasureSpec.makeMeasureSpec(m, i2);
                    i6 = View.MeasureSpec.makeMeasureSpec(n, i2);
                    ((View)localObject3).measure(m, i6);
                  }
                }
              }
              i12 += 1;
            }
          }
        }
        int i2 = paramInt1;
        i12 = j;
        break label2410;
      }
    }
    f1 = localLinearLayoutCompat.mWeightSum;
    int i3 = f1 < 0.0F;
    if (i3 > 0) {
      f6 = f1;
    }
    n = 0;
    f1 = 0.0F;
    localObject1 = null;
    localLinearLayoutCompat.mTotalLength = 0;
    i3 = m;
    int m = i12;
    i12 = j;
    j = 0;
    float f9 = 0.0F;
    while (j < i13)
    {
      View localView4 = localLinearLayoutCompat.getVirtualChildAt(j);
      i7 = localView4.getVisibility();
      int i8 = 8;
      float f10 = 1.121039E-044F;
      if (i7 == i8)
      {
        i35 = i3;
        i4 = paramInt1;
      }
      else
      {
        LinearLayoutCompat.LayoutParams localLayoutParams3 = (LinearLayoutCompat.LayoutParams)localView4.getLayoutParams();
        f1 = localLayoutParams3.weight;
        bool8 = f1 < 0.0F;
        if (bool8)
        {
          f10 = i4 * f1 / f6;
          i8 = (int)f10;
          f6 -= f1;
          i4 -= i8;
          n = getPaddingLeft();
          int i19 = getPaddingRight();
          n += i19;
          f5 = f6;
          i25 = localLayoutParams3.leftMargin;
          n += i25;
          i25 = localLayoutParams3.rightMargin;
          n += i25;
          i25 = localLayoutParams3.width;
          i35 = i4;
          i4 = paramInt1;
          i25 = ViewGroup.getChildMeasureSpec(paramInt1, n, i25);
          n = localLayoutParams3.height;
          if (n == 0)
          {
            n = 1073741824;
            f1 = 2.0F;
            if (i15 == n)
            {
              if (i8 <= 0) {
                break label2014;
              }
              break label2020;
            }
          }
          else
          {
            n = 1073741824;
            f1 = 2.0F;
          }
          i31 = localView4.getMeasuredHeight();
          i8 = i31 + i8;
          if (i8 < 0)
          {
            label2014:
            i8 = 0;
            f10 = 0.0F;
          }
          label2020:
          i8 = View.MeasureSpec.makeMeasureSpec(i8, n);
          localView4.measure(i25, i8);
          i25 = localView4.getMeasuredState() & 0xFFFFFF00;
          i12 = View.combineMeasuredStates(i12, i25);
          f6 = f5;
        }
        else
        {
          n = i4;
          i4 = paramInt1;
          i35 = n;
        }
        n = localLayoutParams3.leftMargin;
        i8 = localLayoutParams3.rightMargin;
        n += i8;
        i8 = localView4.getMeasuredWidth() + n;
        i17 = Math.max(i17, i8);
        f5 = f6;
        i25 = 1073741824;
        f6 = 2.0F;
        if (i5 != i25)
        {
          i25 = localLayoutParams3.width;
          i31 = i12;
          i12 = -1;
          f3 = 0.0F / 0.0F;
          if (i25 == i12)
          {
            i25 = i9;
            f6 = f2;
            break label2193;
          }
        }
        else
        {
          i31 = i12;
          i12 = -1;
          f3 = 0.0F / 0.0F;
        }
        i25 = 0;
        f6 = 0.0F;
        localObject4 = null;
        label2193:
        if (i25 == 0) {
          n = i8;
        }
        i25 = Math.max(m, n);
        if (i21 != 0)
        {
          m = localLayoutParams3.width;
          if (m == i12)
          {
            m = i9;
            f8 = f2;
            break label2253;
          }
        }
        m = 0;
        f8 = 0.0F;
        localLayoutParams2 = null;
        label2253:
        n = localLinearLayoutCompat.mTotalLength;
        i8 = localView4.getMeasuredHeight() + n;
        i12 = localLayoutParams3.topMargin;
        i8 += i12;
        i12 = localLayoutParams3.bottomMargin;
        i8 += i12;
        i12 = localLinearLayoutCompat.getNextLocationOffset(localView4);
        i8 += i12;
        i12 = Math.max(n, i8);
        localLinearLayoutCompat.mTotalLength = i12;
        i21 = m;
        i12 = i31;
        m = i25;
        f6 = f5;
      }
      j += 1;
      i4 = i35;
      n = 0;
      f1 = 0.0F;
      localObject1 = null;
    }
    int i4 = paramInt1;
    int i25 = localLinearLayoutCompat.mTotalLength;
    i15 = getPaddingTop();
    j = getPaddingBottom();
    i15 += j;
    i25 += i15;
    localLinearLayoutCompat.mTotalLength = i25;
    i25 = m;
    label2410:
    if (i21 == 0)
    {
      i15 = 1073741824;
      if (i5 != i15) {}
    }
    else
    {
      i25 = i17;
    }
    i15 = getPaddingLeft();
    i17 = getPaddingRight();
    i15 += i17;
    i25 += i15;
    i15 = getSuggestedMinimumWidth();
    i25 = View.resolveSizeAndState(Math.max(i25, i15), i4, i12);
    localLinearLayoutCompat.setMeasuredDimension(i25, i16);
    if (i20 != 0) {
      localLinearLayoutCompat.OooO0o0(i13, i18);
    }
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    Drawable localDrawable = this.mDivider;
    if (localDrawable == null) {
      return;
    }
    int i = this.mOrientation;
    int j = 1;
    if (i == j) {
      drawDividersVertical(paramCanvas);
    } else {
      drawDividersHorizontal(paramCanvas);
    }
  }
  
  public void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
  }
  
  public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramBoolean = this.mOrientation;
    boolean bool = true;
    if (paramBoolean == bool) {
      layoutVertical(paramInt1, paramInt2, paramInt3, paramInt4);
    } else {
      layoutHorizontal(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i = this.mOrientation;
    int j = 1;
    if (i == j) {
      measureVertical(paramInt1, paramInt2);
    } else {
      measureHorizontal(paramInt1, paramInt2);
    }
  }
  
  public void setBaselineAligned(boolean paramBoolean)
  {
    this.mBaselineAligned = paramBoolean;
  }
  
  public void setBaselineAlignedChildIndex(int paramInt)
  {
    if (paramInt >= 0)
    {
      int i = getChildCount();
      if (paramInt < i)
      {
        this.mBaselineAlignedChildIndex = paramInt;
        return;
      }
    }
    IllegalArgumentException localIllegalArgumentException = new java/lang/IllegalArgumentException;
    Object localObject = new java/lang/StringBuilder;
    ((StringBuilder)localObject).<init>();
    ((StringBuilder)localObject).append("base aligned child index out of range (0, ");
    int j = getChildCount();
    ((StringBuilder)localObject).append(j);
    ((StringBuilder)localObject).append(")");
    localObject = ((StringBuilder)localObject).toString();
    localIllegalArgumentException.<init>((String)localObject);
    throw localIllegalArgumentException;
  }
  
  public void setDividerDrawable(Drawable paramDrawable)
  {
    Drawable localDrawable = this.mDivider;
    if (paramDrawable == localDrawable) {
      return;
    }
    this.mDivider = paramDrawable;
    boolean bool = false;
    localDrawable = null;
    if (paramDrawable != null)
    {
      int i = paramDrawable.getIntrinsicWidth();
      this.mDividerWidth = i;
      i = paramDrawable.getIntrinsicHeight();
      this.mDividerHeight = i;
    }
    else
    {
      this.mDividerWidth = 0;
      this.mDividerHeight = 0;
    }
    if (paramDrawable == null) {
      bool = true;
    }
    setWillNotDraw(bool);
    requestLayout();
  }
  
  public void setDividerPadding(int paramInt)
  {
    this.mDividerPadding = paramInt;
  }
  
  public void setGravity(int paramInt)
  {
    int i = this.mGravity;
    if (i != paramInt)
    {
      i = 0x800007 & paramInt;
      if (i == 0)
      {
        i = 8388611;
        paramInt |= i;
      }
      i = paramInt & 0x70;
      if (i == 0) {
        paramInt |= 0x30;
      }
      this.mGravity = paramInt;
      requestLayout();
    }
  }
  
  public void setHorizontalGravity(int paramInt)
  {
    int i = 8388615;
    paramInt &= i;
    int j = this.mGravity;
    i &= j;
    if (i != paramInt)
    {
      i = 0xFF7FFFF8 & j;
      paramInt |= i;
      this.mGravity = paramInt;
      requestLayout();
    }
  }
  
  public void setMeasureWithLargestChildEnabled(boolean paramBoolean)
  {
    this.mUseLargestChild = paramBoolean;
  }
  
  public void setOrientation(int paramInt)
  {
    int i = this.mOrientation;
    if (i != paramInt)
    {
      this.mOrientation = paramInt;
      requestLayout();
    }
  }
  
  public void setShowDividers(int paramInt)
  {
    int i = this.mShowDividers;
    if (paramInt != i) {
      requestLayout();
    }
    this.mShowDividers = paramInt;
  }
  
  public void setVerticalGravity(int paramInt)
  {
    paramInt &= 0x70;
    int i = this.mGravity;
    int j = i & 0x70;
    if (j != paramInt)
    {
      i &= 0xFFFFFF8F;
      paramInt |= i;
      this.mGravity = paramInt;
      requestLayout();
    }
  }
  
  public void setWeightSum(float paramFloat)
  {
    paramFloat = Math.max(0.0F, paramFloat);
    this.mWeightSum = paramFloat;
  }
  
  public boolean shouldDelayChildPressedState()
  {
    return false;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.LinearLayoutCompat
 * JD-Core Version:    0.7.0.1
 */