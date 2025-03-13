package com.google.android.material.button;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableWrapper;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.view.View;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.attr;
import com.google.android.material.R.styleable;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.ripple.RippleDrawableCompat;
import com.google.android.material.ripple.RippleUtils;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.Shapeable;

class MaterialButtonHelper
{
  private static final boolean IS_LOLLIPOP = false;
  private static final boolean IS_MIN_LOLLIPOP = true;
  private boolean backgroundOverwritten = false;
  private ColorStateList backgroundTint;
  private PorterDuff.Mode backgroundTintMode;
  private boolean checkable;
  private int cornerRadius;
  private boolean cornerRadiusSet = false;
  private int elevation;
  private int insetBottom;
  private int insetLeft;
  private int insetRight;
  private int insetTop;
  private Drawable maskDrawable;
  private final MaterialButton materialButton;
  private ColorStateList rippleColor;
  private LayerDrawable rippleDrawable;
  private ShapeAppearanceModel shapeAppearanceModel;
  private boolean shouldDrawSurfaceColorStroke = false;
  private ColorStateList strokeColor;
  private int strokeWidth;
  private boolean toggleCheckedStateOnClick = true;
  
  public MaterialButtonHelper(MaterialButton paramMaterialButton, ShapeAppearanceModel paramShapeAppearanceModel)
  {
    this.materialButton = paramMaterialButton;
    this.shapeAppearanceModel = paramShapeAppearanceModel;
  }
  
  private Drawable createBackground()
  {
    Object localObject1 = new com/google/android/material/shape/MaterialShapeDrawable;
    Object localObject2 = this.shapeAppearanceModel;
    ((MaterialShapeDrawable)localObject1).<init>((ShapeAppearanceModel)localObject2);
    localObject2 = this.materialButton.getContext();
    ((MaterialShapeDrawable)localObject1).initializeElevationOverlay((Context)localObject2);
    localObject2 = this.backgroundTint;
    DrawableCompat.OooOOOO((Drawable)localObject1, (ColorStateList)localObject2);
    localObject2 = this.backgroundTintMode;
    if (localObject2 != null) {
      DrawableCompat.OooOOOo((Drawable)localObject1, (PorterDuff.Mode)localObject2);
    }
    int i = this.strokeWidth;
    float f1 = i;
    Object localObject3 = this.strokeColor;
    ((MaterialShapeDrawable)localObject1).setStroke(f1, (ColorStateList)localObject3);
    localObject2 = new com/google/android/material/shape/MaterialShapeDrawable;
    localObject3 = this.shapeAppearanceModel;
    ((MaterialShapeDrawable)localObject2).<init>((ShapeAppearanceModel)localObject3);
    localObject3 = null;
    ((MaterialShapeDrawable)localObject2).setTint(0);
    int j = this.strokeWidth;
    float f2 = j;
    boolean bool2 = this.shouldDrawSurfaceColorStroke;
    Object localObject4;
    if (bool2)
    {
      localObject4 = this.materialButton;
      m = R.attr.colorSurface;
      k = MaterialColors.getColor((View)localObject4, m);
    }
    else
    {
      k = 0;
      localObject4 = null;
    }
    ((MaterialShapeDrawable)localObject2).setStroke(f2, k);
    boolean bool1 = IS_MIN_LOLLIPOP;
    int k = 2;
    int m = 1;
    if (bool1)
    {
      localObject5 = new com/google/android/material/shape/MaterialShapeDrawable;
      localObject6 = this.shapeAppearanceModel;
      ((MaterialShapeDrawable)localObject5).<init>((ShapeAppearanceModel)localObject6);
      this.maskDrawable = ((Drawable)localObject5);
      DrawableCompat.OooOOO((Drawable)localObject5, -1);
      localObject5 = new android/graphics/drawable/RippleDrawable;
      localObject6 = RippleUtils.sanitizeRippleDrawableColor(this.rippleColor);
      LayerDrawable localLayerDrawable = new android/graphics/drawable/LayerDrawable;
      localObject4 = new Drawable[k];
      localObject4[0] = localObject2;
      localObject4[m] = localObject1;
      localLayerDrawable.<init>((Drawable[])localObject4);
      localObject1 = wrapDrawableWithInset(localLayerDrawable);
      localObject2 = this.maskDrawable;
      ((RippleDrawable)localObject5).<init>((ColorStateList)localObject6, (Drawable)localObject1, (Drawable)localObject2);
      this.rippleDrawable = ((LayerDrawable)localObject5);
      return localObject5;
    }
    Object localObject5 = new com/google/android/material/ripple/RippleDrawableCompat;
    Object localObject6 = this.shapeAppearanceModel;
    ((RippleDrawableCompat)localObject5).<init>((ShapeAppearanceModel)localObject6);
    this.maskDrawable = ((Drawable)localObject5);
    localObject6 = RippleUtils.sanitizeRippleDrawableColor(this.rippleColor);
    DrawableCompat.OooOOOO((Drawable)localObject5, (ColorStateList)localObject6);
    localObject5 = new android/graphics/drawable/LayerDrawable;
    localObject6 = new Drawable[3];
    localObject6[0] = localObject2;
    localObject6[m] = localObject1;
    localObject1 = this.maskDrawable;
    localObject6[k] = localObject1;
    ((LayerDrawable)localObject5).<init>((Drawable[])localObject6);
    this.rippleDrawable = ((LayerDrawable)localObject5);
    return wrapDrawableWithInset((Drawable)localObject5);
  }
  
  private MaterialShapeDrawable getMaterialShapeDrawable(boolean paramBoolean)
  {
    LayerDrawable localLayerDrawable = this.rippleDrawable;
    if (localLayerDrawable != null)
    {
      int i = localLayerDrawable.getNumberOfLayers();
      if (i > 0)
      {
        boolean bool = IS_MIN_LOLLIPOP;
        if (bool) {}
        for (localLayerDrawable = (LayerDrawable)((InsetDrawable)this.rippleDrawable.getDrawable(0)).getDrawable();; localLayerDrawable = this.rippleDrawable)
        {
          paramBoolean ^= true;
          return (MaterialShapeDrawable)localLayerDrawable.getDrawable(paramBoolean);
        }
      }
    }
    return null;
  }
  
  private MaterialShapeDrawable getSurfaceColorStrokeDrawable()
  {
    return getMaterialShapeDrawable(true);
  }
  
  private void setVerticalInsets(int paramInt1, int paramInt2)
  {
    MaterialButton localMaterialButton1 = this.materialButton;
    int i = ViewCompat.Oooo000(localMaterialButton1);
    MaterialButton localMaterialButton2 = this.materialButton;
    int j = localMaterialButton2.getPaddingTop();
    MaterialButton localMaterialButton3 = this.materialButton;
    int k = ViewCompat.OooOooo(localMaterialButton3);
    MaterialButton localMaterialButton4 = this.materialButton;
    int m = localMaterialButton4.getPaddingBottom();
    int n = this.insetTop;
    int i1 = this.insetBottom;
    this.insetBottom = paramInt2;
    this.insetTop = paramInt1;
    boolean bool = this.backgroundOverwritten;
    if (!bool) {
      updateBackground();
    }
    MaterialButton localMaterialButton5 = this.materialButton;
    j = j + paramInt1 - n;
    m = m + paramInt2 - i1;
    ViewCompat.o00000O(localMaterialButton5, i, j, k, m);
  }
  
  private void updateBackground()
  {
    Object localObject1 = this.materialButton;
    Object localObject2 = createBackground();
    ((MaterialButton)localObject1).setInternalBackground((Drawable)localObject2);
    localObject1 = getMaterialShapeDrawable();
    if (localObject1 != null)
    {
      int i = this.elevation;
      float f = i;
      ((MaterialShapeDrawable)localObject1).setElevation(f);
      localObject2 = this.materialButton.getDrawableState();
      ((Drawable)localObject1).setState((int[])localObject2);
    }
  }
  
  private void updateButtonShape(ShapeAppearanceModel paramShapeAppearanceModel)
  {
    boolean bool = IS_LOLLIPOP;
    if (bool)
    {
      bool = this.backgroundOverwritten;
      if (!bool)
      {
        paramShapeAppearanceModel = this.materialButton;
        int j = ViewCompat.Oooo000(paramShapeAppearanceModel);
        localObject = this.materialButton;
        int i = ((View)localObject).getPaddingTop();
        MaterialButton localMaterialButton1 = this.materialButton;
        int k = ViewCompat.OooOooo(localMaterialButton1);
        MaterialButton localMaterialButton2 = this.materialButton;
        int m = localMaterialButton2.getPaddingBottom();
        updateBackground();
        MaterialButton localMaterialButton3 = this.materialButton;
        ViewCompat.o00000O(localMaterialButton3, j, i, k, m);
        return;
      }
    }
    Object localObject = getMaterialShapeDrawable();
    if (localObject != null)
    {
      localObject = getMaterialShapeDrawable();
      ((MaterialShapeDrawable)localObject).setShapeAppearanceModel(paramShapeAppearanceModel);
    }
    localObject = getSurfaceColorStrokeDrawable();
    if (localObject != null)
    {
      localObject = getSurfaceColorStrokeDrawable();
      ((MaterialShapeDrawable)localObject).setShapeAppearanceModel(paramShapeAppearanceModel);
    }
    localObject = getMaskDrawable();
    if (localObject != null)
    {
      localObject = getMaskDrawable();
      ((Shapeable)localObject).setShapeAppearanceModel(paramShapeAppearanceModel);
    }
  }
  
  private void updateStroke()
  {
    MaterialShapeDrawable localMaterialShapeDrawable1 = getMaterialShapeDrawable();
    MaterialShapeDrawable localMaterialShapeDrawable2 = getSurfaceColorStrokeDrawable();
    if (localMaterialShapeDrawable1 != null)
    {
      int i = this.strokeWidth;
      float f1 = i;
      ColorStateList localColorStateList = this.strokeColor;
      localMaterialShapeDrawable1.setStroke(f1, localColorStateList);
      if (localMaterialShapeDrawable2 != null)
      {
        int k = this.strokeWidth;
        float f2 = k;
        boolean bool = this.shouldDrawSurfaceColorStroke;
        MaterialButton localMaterialButton;
        int j;
        if (bool)
        {
          localMaterialButton = this.materialButton;
          int m = R.attr.colorSurface;
          j = MaterialColors.getColor(localMaterialButton, m);
        }
        else
        {
          j = 0;
          f1 = 0.0F;
          localMaterialButton = null;
        }
        localMaterialShapeDrawable2.setStroke(f2, j);
      }
    }
  }
  
  private InsetDrawable wrapDrawableWithInset(Drawable paramDrawable)
  {
    InsetDrawable localInsetDrawable = new android/graphics/drawable/InsetDrawable;
    int i = this.insetLeft;
    int j = this.insetTop;
    int k = this.insetRight;
    int m = this.insetBottom;
    localInsetDrawable.<init>(paramDrawable, i, j, k, m);
    return localInsetDrawable;
  }
  
  public int getCornerRadius()
  {
    return this.cornerRadius;
  }
  
  public int getInsetBottom()
  {
    return this.insetBottom;
  }
  
  public int getInsetTop()
  {
    return this.insetTop;
  }
  
  public Shapeable getMaskDrawable()
  {
    Object localObject = this.rippleDrawable;
    if (localObject != null)
    {
      int i = ((LayerDrawable)localObject).getNumberOfLayers();
      int j = 1;
      if (i > j)
      {
        localObject = this.rippleDrawable;
        i = ((LayerDrawable)localObject).getNumberOfLayers();
        int k = 2;
        if (i > k) {}
        for (localObject = this.rippleDrawable.getDrawable(k);; localObject = this.rippleDrawable.getDrawable(j)) {
          return (Shapeable)localObject;
        }
      }
    }
    return null;
  }
  
  public MaterialShapeDrawable getMaterialShapeDrawable()
  {
    return getMaterialShapeDrawable(false);
  }
  
  public ColorStateList getRippleColor()
  {
    return this.rippleColor;
  }
  
  public ShapeAppearanceModel getShapeAppearanceModel()
  {
    return this.shapeAppearanceModel;
  }
  
  public ColorStateList getStrokeColor()
  {
    return this.strokeColor;
  }
  
  public int getStrokeWidth()
  {
    return this.strokeWidth;
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    return this.backgroundTint;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    return this.backgroundTintMode;
  }
  
  public boolean isBackgroundOverwritten()
  {
    return this.backgroundOverwritten;
  }
  
  public boolean isCheckable()
  {
    return this.checkable;
  }
  
  public boolean isToggleCheckedStateOnClick()
  {
    return this.toggleCheckedStateOnClick;
  }
  
  public void loadFromAttributes(TypedArray paramTypedArray)
  {
    int i = R.styleable.MaterialButton_android_insetLeft;
    int n = 0;
    MaterialButton localMaterialButton1 = null;
    i = paramTypedArray.getDimensionPixelOffset(i, 0);
    this.insetLeft = i;
    i = R.styleable.MaterialButton_android_insetRight;
    i = paramTypedArray.getDimensionPixelOffset(i, 0);
    this.insetRight = i;
    i = R.styleable.MaterialButton_android_insetTop;
    i = paramTypedArray.getDimensionPixelOffset(i, 0);
    this.insetTop = i;
    i = R.styleable.MaterialButton_android_insetBottom;
    i = paramTypedArray.getDimensionPixelOffset(i, 0);
    this.insetBottom = i;
    i = R.styleable.MaterialButton_cornerRadius;
    boolean bool1 = paramTypedArray.hasValue(i);
    boolean bool4 = true;
    int i2 = -1;
    if (bool1)
    {
      j = R.styleable.MaterialButton_cornerRadius;
      j = paramTypedArray.getDimensionPixelSize(j, i2);
      this.cornerRadius = j;
      ShapeAppearanceModel localShapeAppearanceModel = this.shapeAppearanceModel;
      float f = j;
      localObject1 = localShapeAppearanceModel.withCornerSize(f);
      setShapeAppearanceModel((ShapeAppearanceModel)localObject1);
      this.cornerRadiusSet = bool4;
    }
    int j = R.styleable.MaterialButton_strokeWidth;
    j = paramTypedArray.getDimensionPixelSize(j, 0);
    this.strokeWidth = j;
    j = R.styleable.MaterialButton_backgroundTintMode;
    j = paramTypedArray.getInt(j, i2);
    Object localObject2 = PorterDuff.Mode.SRC_IN;
    Object localObject1 = ViewUtils.parseTintMode(j, (PorterDuff.Mode)localObject2);
    this.backgroundTintMode = ((PorterDuff.Mode)localObject1);
    localObject1 = this.materialButton.getContext();
    i2 = R.styleable.MaterialButton_backgroundTint;
    localObject1 = MaterialResources.getColorStateList((Context)localObject1, paramTypedArray, i2);
    this.backgroundTint = ((ColorStateList)localObject1);
    localObject1 = this.materialButton.getContext();
    i2 = R.styleable.MaterialButton_strokeColor;
    localObject1 = MaterialResources.getColorStateList((Context)localObject1, paramTypedArray, i2);
    this.strokeColor = ((ColorStateList)localObject1);
    localObject1 = this.materialButton.getContext();
    i2 = R.styleable.MaterialButton_rippleColor;
    localObject1 = MaterialResources.getColorStateList((Context)localObject1, paramTypedArray, i2);
    this.rippleColor = ((ColorStateList)localObject1);
    j = R.styleable.MaterialButton_android_checkable;
    boolean bool2 = paramTypedArray.getBoolean(j, false);
    this.checkable = bool2;
    int k = R.styleable.MaterialButton_elevation;
    k = paramTypedArray.getDimensionPixelSize(k, 0);
    this.elevation = k;
    k = R.styleable.MaterialButton_toggleCheckedStateOnClick;
    boolean bool3 = paramTypedArray.getBoolean(k, bool4);
    this.toggleCheckedStateOnClick = bool3;
    localObject1 = this.materialButton;
    int m = ViewCompat.Oooo000((View)localObject1);
    localMaterialButton1 = this.materialButton;
    n = localMaterialButton1.getPaddingTop();
    MaterialButton localMaterialButton2 = this.materialButton;
    int i1 = ViewCompat.OooOooo(localMaterialButton2);
    localObject2 = this.materialButton;
    i2 = ((View)localObject2).getPaddingBottom();
    int i3 = R.styleable.MaterialButton_android_background;
    boolean bool5 = paramTypedArray.hasValue(i3);
    if (bool5) {
      setBackgroundOverwritten();
    } else {
      updateBackground();
    }
    paramTypedArray = this.materialButton;
    i3 = this.insetLeft;
    m += i3;
    i3 = this.insetTop;
    n += i3;
    i3 = this.insetRight;
    i1 += i3;
    i3 = this.insetBottom;
    i2 += i3;
    ViewCompat.o00000O(paramTypedArray, m, n, i1, i2);
  }
  
  public void setBackgroundColor(int paramInt)
  {
    MaterialShapeDrawable localMaterialShapeDrawable = getMaterialShapeDrawable();
    if (localMaterialShapeDrawable != null)
    {
      localMaterialShapeDrawable = getMaterialShapeDrawable();
      localMaterialShapeDrawable.setTint(paramInt);
    }
  }
  
  public void setBackgroundOverwritten()
  {
    this.backgroundOverwritten = true;
    MaterialButton localMaterialButton = this.materialButton;
    Object localObject = this.backgroundTint;
    localMaterialButton.setSupportBackgroundTintList((ColorStateList)localObject);
    localMaterialButton = this.materialButton;
    localObject = this.backgroundTintMode;
    localMaterialButton.setSupportBackgroundTintMode((PorterDuff.Mode)localObject);
  }
  
  public void setCheckable(boolean paramBoolean)
  {
    this.checkable = paramBoolean;
  }
  
  public void setCornerRadius(int paramInt)
  {
    boolean bool = this.cornerRadiusSet;
    int i;
    if (bool)
    {
      i = this.cornerRadius;
      if (i == paramInt) {}
    }
    else
    {
      this.cornerRadius = paramInt;
      i = 1;
      this.cornerRadiusSet = i;
      ShapeAppearanceModel localShapeAppearanceModel1 = this.shapeAppearanceModel;
      float f = paramInt;
      ShapeAppearanceModel localShapeAppearanceModel2 = localShapeAppearanceModel1.withCornerSize(f);
      setShapeAppearanceModel(localShapeAppearanceModel2);
    }
  }
  
  public void setInsetBottom(int paramInt)
  {
    int i = this.insetTop;
    setVerticalInsets(i, paramInt);
  }
  
  public void setInsetTop(int paramInt)
  {
    int i = this.insetBottom;
    setVerticalInsets(paramInt, i);
  }
  
  public void setRippleColor(ColorStateList paramColorStateList)
  {
    Object localObject = this.rippleColor;
    if (localObject != paramColorStateList)
    {
      this.rippleColor = paramColorStateList;
      boolean bool1 = IS_MIN_LOLLIPOP;
      if (bool1)
      {
        Drawable localDrawable = this.materialButton.getBackground();
        boolean bool2 = localDrawable instanceof RippleDrawable;
        if (bool2)
        {
          localObject = (RippleDrawable)this.materialButton.getBackground();
          paramColorStateList = RippleUtils.sanitizeRippleDrawableColor(paramColorStateList);
          ((RippleDrawable)localObject).setColor(paramColorStateList);
          return;
        }
      }
      if (!bool1)
      {
        localObject = this.materialButton.getBackground();
        bool1 = localObject instanceof RippleDrawableCompat;
        if (bool1)
        {
          localObject = (RippleDrawableCompat)this.materialButton.getBackground();
          paramColorStateList = RippleUtils.sanitizeRippleDrawableColor(paramColorStateList);
          ((RippleDrawableCompat)localObject).setTintList(paramColorStateList);
        }
      }
    }
  }
  
  public void setShapeAppearanceModel(ShapeAppearanceModel paramShapeAppearanceModel)
  {
    this.shapeAppearanceModel = paramShapeAppearanceModel;
    updateButtonShape(paramShapeAppearanceModel);
  }
  
  public void setShouldDrawSurfaceColorStroke(boolean paramBoolean)
  {
    this.shouldDrawSurfaceColorStroke = paramBoolean;
    updateStroke();
  }
  
  public void setStrokeColor(ColorStateList paramColorStateList)
  {
    ColorStateList localColorStateList = this.strokeColor;
    if (localColorStateList != paramColorStateList)
    {
      this.strokeColor = paramColorStateList;
      updateStroke();
    }
  }
  
  public void setStrokeWidth(int paramInt)
  {
    int i = this.strokeWidth;
    if (i != paramInt)
    {
      this.strokeWidth = paramInt;
      updateStroke();
    }
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    ColorStateList localColorStateList = this.backgroundTint;
    if (localColorStateList != paramColorStateList)
    {
      this.backgroundTint = paramColorStateList;
      paramColorStateList = getMaterialShapeDrawable();
      if (paramColorStateList != null)
      {
        paramColorStateList = getMaterialShapeDrawable();
        localColorStateList = this.backgroundTint;
        DrawableCompat.OooOOOO(paramColorStateList, localColorStateList);
      }
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    PorterDuff.Mode localMode = this.backgroundTintMode;
    if (localMode != paramMode)
    {
      this.backgroundTintMode = paramMode;
      paramMode = getMaterialShapeDrawable();
      if (paramMode != null)
      {
        paramMode = this.backgroundTintMode;
        if (paramMode != null)
        {
          paramMode = getMaterialShapeDrawable();
          localMode = this.backgroundTintMode;
          DrawableCompat.OooOOOo(paramMode, localMode);
        }
      }
    }
  }
  
  public void setToggleCheckedStateOnClick(boolean paramBoolean)
  {
    this.toggleCheckedStateOnClick = paramBoolean;
  }
  
  public void updateMaskBounds(int paramInt1, int paramInt2)
  {
    Drawable localDrawable = this.maskDrawable;
    if (localDrawable != null)
    {
      int i = this.insetLeft;
      int j = this.insetTop;
      int k = this.insetRight;
      paramInt2 -= k;
      k = this.insetBottom;
      paramInt1 -= k;
      localDrawable.setBounds(i, j, paramInt2, paramInt1);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.button.MaterialButtonHelper
 * JD-Core Version:    0.7.0.1
 */