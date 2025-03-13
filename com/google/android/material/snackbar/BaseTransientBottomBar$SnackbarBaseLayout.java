package com.google.android.material.snackbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.styleable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearanceModel.Builder;

public class BaseTransientBottomBar$SnackbarBaseLayout
  extends FrameLayout
{
  private static final View.OnTouchListener consumeAllTouchListener;
  private final float actionTextColorAlpha;
  private boolean addingToTargetParent;
  private int animationMode;
  private final float backgroundOverlayColorAlpha;
  private ColorStateList backgroundTint;
  private PorterDuff.Mode backgroundTintMode;
  private BaseTransientBottomBar baseTransientBottomBar;
  private final int maxInlineActionWidth;
  private final int maxWidth;
  private Rect originalMargins;
  ShapeAppearanceModel shapeAppearanceModel;
  
  static
  {
    BaseTransientBottomBar.SnackbarBaseLayout.1 local1 = new com/google/android/material/snackbar/BaseTransientBottomBar$SnackbarBaseLayout$1;
    local1.<init>();
    consumeAllTouchListener = local1;
  }
  
  public BaseTransientBottomBar$SnackbarBaseLayout(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public BaseTransientBottomBar$SnackbarBaseLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    paramContext = getContext();
    Object localObject = R.styleable.SnackbarLayout;
    localObject = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject);
    int i = R.styleable.SnackbarLayout_elevation;
    boolean bool1 = ((TypedArray)localObject).hasValue(i);
    if (bool1)
    {
      j = R.styleable.SnackbarLayout_elevation;
      j = ((TypedArray)localObject).getDimensionPixelSize(j, 0);
      float f2 = j;
      ViewCompat.oo0o0Oo(this, f2);
    }
    int j = R.styleable.SnackbarLayout_animationMode;
    j = ((TypedArray)localObject).getInt(j, 0);
    this.animationMode = j;
    j = R.styleable.SnackbarLayout_shapeAppearance;
    boolean bool2 = ((TypedArray)localObject).hasValue(j);
    if (!bool2)
    {
      int k = R.styleable.SnackbarLayout_shapeAppearanceOverlay;
      boolean bool3 = ((TypedArray)localObject).hasValue(k);
      if (!bool3) {}
    }
    else
    {
      paramAttributeSet = ShapeAppearanceModel.builder(paramContext, paramAttributeSet, 0, 0).build();
      this.shapeAppearanceModel = paramAttributeSet;
    }
    int m = R.styleable.SnackbarLayout_backgroundOverlayColorAlpha;
    f1 = 1.0F;
    float f3 = ((TypedArray)localObject).getFloat(m, f1);
    this.backgroundOverlayColorAlpha = f3;
    m = R.styleable.SnackbarLayout_backgroundTint;
    paramContext = MaterialResources.getColorStateList(paramContext, (TypedArray)localObject, m);
    setBackgroundTintList(paramContext);
    int n = R.styleable.SnackbarLayout_backgroundTintMode;
    m = -1;
    f3 = 0.0F / 0.0F;
    n = ((TypedArray)localObject).getInt(n, m);
    PorterDuff.Mode localMode = PorterDuff.Mode.SRC_IN;
    paramContext = ViewUtils.parseTintMode(n, localMode);
    setBackgroundTintMode(paramContext);
    n = R.styleable.SnackbarLayout_actionTextColorAlpha;
    float f4 = ((TypedArray)localObject).getFloat(n, f1);
    this.actionTextColorAlpha = f4;
    n = R.styleable.SnackbarLayout_android_maxWidth;
    n = ((TypedArray)localObject).getDimensionPixelSize(n, m);
    this.maxWidth = n;
    n = R.styleable.SnackbarLayout_maxActionInlineWidth;
    n = ((TypedArray)localObject).getDimensionPixelSize(n, m);
    this.maxInlineActionWidth = n;
    ((TypedArray)localObject).recycle();
    paramContext = consumeAllTouchListener;
    setOnTouchListener(paramContext);
    n = 1;
    f4 = 1.4E-45F;
    setFocusable(n);
    paramContext = getBackground();
    if (paramContext == null)
    {
      paramContext = createThemedBackground();
      ViewCompat.o0ooOoO(this, paramContext);
    }
  }
  
  private Drawable createThemedBackground()
  {
    int i = R.attr.colorSurface;
    int j = R.attr.colorOnSurface;
    float f = getBackgroundOverlayColorAlpha();
    i = MaterialColors.layer(this, i, j, f);
    Object localObject1 = this.shapeAppearanceModel;
    if (localObject1 != null)
    {
      localObject2 = BaseTransientBottomBar.access$1900(i, (ShapeAppearanceModel)localObject1);
    }
    else
    {
      localObject1 = getResources();
      localObject2 = BaseTransientBottomBar.access$2000(i, (Resources)localObject1);
    }
    localObject1 = this.backgroundTint;
    Object localObject2 = DrawableCompat.OooOOo((Drawable)localObject2);
    if (localObject1 != null)
    {
      localObject1 = this.backgroundTint;
      DrawableCompat.OooOOOO((Drawable)localObject2, (ColorStateList)localObject1);
    }
    return localObject2;
  }
  
  private void setBaseTransientBottomBar(BaseTransientBottomBar paramBaseTransientBottomBar)
  {
    this.baseTransientBottomBar = paramBaseTransientBottomBar;
  }
  
  private void updateOriginalMargins(ViewGroup.MarginLayoutParams paramMarginLayoutParams)
  {
    Rect localRect = new android/graphics/Rect;
    int i = paramMarginLayoutParams.leftMargin;
    int j = paramMarginLayoutParams.topMargin;
    int k = paramMarginLayoutParams.rightMargin;
    int m = paramMarginLayoutParams.bottomMargin;
    localRect.<init>(i, j, k, m);
    this.originalMargins = localRect;
  }
  
  public void addToTargetParent(ViewGroup paramViewGroup)
  {
    this.addingToTargetParent = true;
    paramViewGroup.addView(this);
    this.addingToTargetParent = false;
  }
  
  public float getActionTextColorAlpha()
  {
    return this.actionTextColorAlpha;
  }
  
  public int getAnimationMode()
  {
    return this.animationMode;
  }
  
  public float getBackgroundOverlayColorAlpha()
  {
    return this.backgroundOverlayColorAlpha;
  }
  
  public int getMaxInlineActionWidth()
  {
    return this.maxInlineActionWidth;
  }
  
  public int getMaxWidth()
  {
    return this.maxWidth;
  }
  
  public void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    BaseTransientBottomBar localBaseTransientBottomBar = this.baseTransientBottomBar;
    if (localBaseTransientBottomBar != null) {
      localBaseTransientBottomBar.onAttachedToWindow();
    }
    ViewCompat.o00o0O(this);
  }
  
  public void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    BaseTransientBottomBar localBaseTransientBottomBar = this.baseTransientBottomBar;
    if (localBaseTransientBottomBar != null) {
      localBaseTransientBottomBar.onDetachedFromWindow();
    }
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    BaseTransientBottomBar localBaseTransientBottomBar = this.baseTransientBottomBar;
    if (localBaseTransientBottomBar != null) {
      localBaseTransientBottomBar.onLayoutChange();
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    paramInt1 = this.maxWidth;
    if (paramInt1 > 0)
    {
      paramInt1 = getMeasuredWidth();
      int i = this.maxWidth;
      if (paramInt1 > i)
      {
        paramInt1 = View.MeasureSpec.makeMeasureSpec(i, 1073741824);
        super.onMeasure(paramInt1, paramInt2);
      }
    }
  }
  
  public void setAnimationMode(int paramInt)
  {
    this.animationMode = paramInt;
  }
  
  public void setBackground(Drawable paramDrawable)
  {
    setBackgroundDrawable(paramDrawable);
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      Object localObject = this.backgroundTint;
      if (localObject != null)
      {
        paramDrawable = DrawableCompat.OooOOo(paramDrawable.mutate());
        localObject = this.backgroundTint;
        DrawableCompat.OooOOOO(paramDrawable, (ColorStateList)localObject);
        localObject = this.backgroundTintMode;
        DrawableCompat.OooOOOo(paramDrawable, (PorterDuff.Mode)localObject);
      }
    }
    super.setBackgroundDrawable(paramDrawable);
  }
  
  public void setBackgroundTintList(ColorStateList paramColorStateList)
  {
    this.backgroundTint = paramColorStateList;
    Drawable localDrawable = getBackground();
    if (localDrawable != null)
    {
      localDrawable = DrawableCompat.OooOOo(getBackground().mutate());
      DrawableCompat.OooOOOO(localDrawable, paramColorStateList);
      paramColorStateList = this.backgroundTintMode;
      DrawableCompat.OooOOOo(localDrawable, paramColorStateList);
      paramColorStateList = getBackground();
      if (localDrawable != paramColorStateList) {
        super.setBackgroundDrawable(localDrawable);
      }
    }
  }
  
  public void setBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    this.backgroundTintMode = paramMode;
    Drawable localDrawable = getBackground();
    if (localDrawable != null)
    {
      localDrawable = DrawableCompat.OooOOo(getBackground().mutate());
      DrawableCompat.OooOOOo(localDrawable, paramMode);
      paramMode = getBackground();
      if (localDrawable != paramMode) {
        super.setBackgroundDrawable(localDrawable);
      }
    }
  }
  
  public void setLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    super.setLayoutParams(paramLayoutParams);
    boolean bool = this.addingToTargetParent;
    if (!bool)
    {
      bool = paramLayoutParams instanceof ViewGroup.MarginLayoutParams;
      if (bool)
      {
        paramLayoutParams = (ViewGroup.MarginLayoutParams)paramLayoutParams;
        updateOriginalMargins(paramLayoutParams);
        paramLayoutParams = this.baseTransientBottomBar;
        if (paramLayoutParams != null) {
          BaseTransientBottomBar.access$900(paramLayoutParams);
        }
      }
    }
  }
  
  public void setOnClickListener(View.OnClickListener paramOnClickListener)
  {
    View.OnTouchListener localOnTouchListener;
    if (paramOnClickListener != null) {
      localOnTouchListener = null;
    } else {
      localOnTouchListener = consumeAllTouchListener;
    }
    setOnTouchListener(localOnTouchListener);
    super.setOnClickListener(paramOnClickListener);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.snackbar.BaseTransientBottomBar.SnackbarBaseLayout
 * JD-Core Version:    0.7.0.1
 */