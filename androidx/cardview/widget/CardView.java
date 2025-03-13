package androidx.cardview.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;
import androidx.cardview.R.color;
import androidx.cardview.R.style;
import androidx.cardview.R.styleable;

public class CardView
  extends FrameLayout
{
  private static final int[] COLOR_BACKGROUND_ATTR = { 16842801 };
  private static final CardViewImpl IMPL;
  private final CardViewDelegate mCardViewDelegate;
  private boolean mCompatPadding;
  final Rect mContentPadding;
  private boolean mPreventCornerOverlap;
  final Rect mShadowBounds;
  int mUserSetMinHeight;
  int mUserSetMinWidth;
  
  static
  {
    CardViewApi21Impl localCardViewApi21Impl = new androidx/cardview/widget/CardViewApi21Impl;
    localCardViewApi21Impl.<init>();
    IMPL = localCardViewApi21Impl;
    localCardViewApi21Impl.OooOO0();
  }
  
  public CardView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.mContentPadding = localRect;
    Object localObject1 = new android/graphics/Rect;
    ((Rect)localObject1).<init>();
    this.mShadowBounds = ((Rect)localObject1);
    CardView.1 local1 = new androidx/cardview/widget/CardView$1;
    local1.<init>(this);
    this.mCardViewDelegate = local1;
    localObject1 = R.styleable.CardView;
    int i = R.style.CardView;
    paramAttributeSet = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject1, paramInt, i);
    paramInt = R.styleable.CardView_cardBackgroundColor;
    paramInt = paramAttributeSet.hasValue(paramInt);
    localObject1 = null;
    if (paramInt != 0) {
      paramInt = R.styleable.CardView_cardBackgroundColor;
    }
    Object localObject3;
    for (Object localObject2 = paramAttributeSet.getColorStateList(paramInt);; localObject2 = ColorStateList.valueOf(paramInt))
    {
      localObject3 = localObject2;
      break;
      localObject2 = getContext();
      arrayOfInt = COLOR_BACKGROUND_ATTR;
      localObject2 = ((Context)localObject2).obtainStyledAttributes(arrayOfInt);
      i = ((TypedArray)localObject2).getColor(0, 0);
      ((TypedArray)localObject2).recycle();
      localObject2 = new float[3];
      Color.colorToHSV(i, (float[])localObject2);
      f1 = localObject2[2];
      i = 1056964608;
      f2 = 0.5F;
      paramInt = f1 < f2;
      if (paramInt > 0)
      {
        localObject2 = getResources();
        i = R.color.cardview_light_background;
      }
      else
      {
        localObject2 = getResources();
        i = R.color.cardview_dark_background;
      }
      paramInt = ((Resources)localObject2).getColor(i);
    }
    paramInt = R.styleable.CardView_cardCornerRadius;
    float f2 = 0.0F;
    int[] arrayOfInt = null;
    float f3 = paramAttributeSet.getDimension(paramInt, 0.0F);
    paramInt = R.styleable.CardView_cardElevation;
    float f4 = paramAttributeSet.getDimension(paramInt, 0.0F);
    paramInt = R.styleable.CardView_cardMaxElevation;
    float f1 = paramAttributeSet.getDimension(paramInt, 0.0F);
    i = R.styleable.CardView_cardUseCompatPadding;
    boolean bool1 = paramAttributeSet.getBoolean(i, false);
    this.mCompatPadding = bool1;
    int j = R.styleable.CardView_cardPreventCornerOverlap;
    boolean bool2 = paramAttributeSet.getBoolean(j, true);
    this.mPreventCornerOverlap = bool2;
    int k = R.styleable.CardView_contentPadding;
    k = paramAttributeSet.getDimensionPixelSize(k, 0);
    int m = R.styleable.CardView_contentPaddingLeft;
    m = paramAttributeSet.getDimensionPixelSize(m, k);
    localRect.left = m;
    m = R.styleable.CardView_contentPaddingTop;
    m = paramAttributeSet.getDimensionPixelSize(m, k);
    localRect.top = m;
    m = R.styleable.CardView_contentPaddingRight;
    m = paramAttributeSet.getDimensionPixelSize(m, k);
    localRect.right = m;
    m = R.styleable.CardView_contentPaddingBottom;
    k = paramAttributeSet.getDimensionPixelSize(m, k);
    localRect.bottom = k;
    boolean bool3 = f4 < f1;
    float f5;
    if (bool3) {
      f5 = f4;
    } else {
      f5 = f1;
    }
    paramInt = R.styleable.CardView_android_minWidth;
    paramInt = paramAttributeSet.getDimensionPixelSize(paramInt, 0);
    this.mUserSetMinWidth = paramInt;
    paramInt = R.styleable.CardView_android_minHeight;
    paramInt = paramAttributeSet.getDimensionPixelSize(paramInt, 0);
    this.mUserSetMinHeight = paramInt;
    paramAttributeSet.recycle();
    IMPL.OooO00o(local1, paramContext, localObject3, f3, f4, f5);
  }
  
  public ColorStateList getCardBackgroundColor()
  {
    CardViewImpl localCardViewImpl = IMPL;
    CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
    return localCardViewImpl.OooO0oo(localCardViewDelegate);
  }
  
  public float getCardElevation()
  {
    CardViewImpl localCardViewImpl = IMPL;
    CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
    return localCardViewImpl.OooO0OO(localCardViewDelegate);
  }
  
  public int getContentPaddingBottom()
  {
    return this.mContentPadding.bottom;
  }
  
  public int getContentPaddingLeft()
  {
    return this.mContentPadding.left;
  }
  
  public int getContentPaddingRight()
  {
    return this.mContentPadding.right;
  }
  
  public int getContentPaddingTop()
  {
    return this.mContentPadding.top;
  }
  
  public float getMaxCardElevation()
  {
    CardViewImpl localCardViewImpl = IMPL;
    CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
    return localCardViewImpl.OooO0oO(localCardViewDelegate);
  }
  
  public boolean getPreventCornerOverlap()
  {
    return this.mPreventCornerOverlap;
  }
  
  public float getRadius()
  {
    CardViewImpl localCardViewImpl = IMPL;
    CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
    return localCardViewImpl.OooO0Oo(localCardViewDelegate);
  }
  
  public boolean getUseCompatPadding()
  {
    return this.mCompatPadding;
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    CardViewImpl localCardViewImpl = IMPL;
    boolean bool = localCardViewImpl instanceof CardViewApi21Impl;
    if (!bool)
    {
      int i = View.MeasureSpec.getMode(paramInt1);
      int j = 1073741824;
      int k = -1 << -1;
      if ((i == k) || (i == j))
      {
        CardViewDelegate localCardViewDelegate1 = this.mCardViewDelegate;
        float f1 = localCardViewImpl.OooOO0o(localCardViewDelegate1);
        double d1 = Math.ceil(f1);
        int m = (int)d1;
        paramInt1 = View.MeasureSpec.getSize(paramInt1);
        paramInt1 = View.MeasureSpec.makeMeasureSpec(Math.max(m, paramInt1), i);
      }
      i = View.MeasureSpec.getMode(paramInt2);
      if ((i == k) || (i == j))
      {
        CardViewDelegate localCardViewDelegate2 = this.mCardViewDelegate;
        float f2 = localCardViewImpl.OooOO0O(localCardViewDelegate2);
        double d2 = Math.ceil(f2);
        int n = (int)d2;
        paramInt2 = View.MeasureSpec.getSize(paramInt2);
        paramInt2 = View.MeasureSpec.makeMeasureSpec(Math.max(n, paramInt2), i);
      }
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setCardBackgroundColor(int paramInt)
  {
    CardViewImpl localCardViewImpl = IMPL;
    CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
    ColorStateList localColorStateList = ColorStateList.valueOf(paramInt);
    localCardViewImpl.OooOOO(localCardViewDelegate, localColorStateList);
  }
  
  public void setCardBackgroundColor(ColorStateList paramColorStateList)
  {
    CardViewImpl localCardViewImpl = IMPL;
    CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
    localCardViewImpl.OooOOO(localCardViewDelegate, paramColorStateList);
  }
  
  public void setCardElevation(float paramFloat)
  {
    CardViewImpl localCardViewImpl = IMPL;
    CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
    localCardViewImpl.OooO0o(localCardViewDelegate, paramFloat);
  }
  
  public void setContentPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.mContentPadding.set(paramInt1, paramInt2, paramInt3, paramInt4);
    CardViewImpl localCardViewImpl = IMPL;
    CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
    localCardViewImpl.OooO(localCardViewDelegate);
  }
  
  public void setMaxCardElevation(float paramFloat)
  {
    CardViewImpl localCardViewImpl = IMPL;
    CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
    localCardViewImpl.OooOOOO(localCardViewDelegate, paramFloat);
  }
  
  public void setMinimumHeight(int paramInt)
  {
    this.mUserSetMinHeight = paramInt;
    super.setMinimumHeight(paramInt);
  }
  
  public void setMinimumWidth(int paramInt)
  {
    this.mUserSetMinWidth = paramInt;
    super.setMinimumWidth(paramInt);
  }
  
  public void setPadding(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPaddingRelative(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
  
  public void setPreventCornerOverlap(boolean paramBoolean)
  {
    boolean bool = this.mPreventCornerOverlap;
    if (paramBoolean != bool)
    {
      this.mPreventCornerOverlap = paramBoolean;
      CardViewImpl localCardViewImpl = IMPL;
      CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
      localCardViewImpl.OooOOO0(localCardViewDelegate);
    }
  }
  
  public void setRadius(float paramFloat)
  {
    CardViewImpl localCardViewImpl = IMPL;
    CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
    localCardViewImpl.OooO0O0(localCardViewDelegate, paramFloat);
  }
  
  public void setUseCompatPadding(boolean paramBoolean)
  {
    boolean bool = this.mCompatPadding;
    if (bool != paramBoolean)
    {
      this.mCompatPadding = paramBoolean;
      CardViewImpl localCardViewImpl = IMPL;
      CardViewDelegate localCardViewDelegate = this.mCardViewDelegate;
      localCardViewImpl.OooO0o0(localCardViewDelegate);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.cardview.widget.CardView
 * JD-Core Version:    0.7.0.1
 */