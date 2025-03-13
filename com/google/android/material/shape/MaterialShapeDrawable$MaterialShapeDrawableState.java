package com.google.android.material.shape;

import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import com.google.android.material.elevation.ElevationOverlayProvider;

public class MaterialShapeDrawable$MaterialShapeDrawableState
  extends Drawable.ConstantState
{
  int alpha;
  ColorFilter colorFilter;
  float elevation;
  ElevationOverlayProvider elevationOverlayProvider;
  ColorStateList fillColor = null;
  float interpolation;
  Rect padding;
  Paint.Style paintStyle;
  float parentAbsoluteElevation;
  float scale;
  int shadowCompatMode;
  int shadowCompatOffset;
  int shadowCompatRadius;
  int shadowCompatRotation;
  ShapeAppearanceModel shapeAppearanceModel;
  ColorStateList strokeColor = null;
  ColorStateList strokeTintList = null;
  float strokeWidth;
  ColorStateList tintList = null;
  PorterDuff.Mode tintMode;
  float translationZ;
  boolean useTintColorForShadow;
  
  public MaterialShapeDrawable$MaterialShapeDrawableState(MaterialShapeDrawableState paramMaterialShapeDrawableState)
  {
    PorterDuff.Mode localMode = PorterDuff.Mode.SRC_IN;
    this.tintMode = localMode;
    this.padding = null;
    float f = 1.0F;
    this.scale = f;
    this.interpolation = f;
    this.alpha = 255;
    this.parentAbsoluteElevation = 0.0F;
    this.elevation = 0.0F;
    this.translationZ = 0.0F;
    this.shadowCompatMode = 0;
    this.shadowCompatRadius = 0;
    this.shadowCompatOffset = 0;
    this.shadowCompatRotation = 0;
    this.useTintColorForShadow = false;
    Object localObject = Paint.Style.FILL_AND_STROKE;
    this.paintStyle = ((Paint.Style)localObject);
    localObject = paramMaterialShapeDrawableState.shapeAppearanceModel;
    this.shapeAppearanceModel = ((ShapeAppearanceModel)localObject);
    localObject = paramMaterialShapeDrawableState.elevationOverlayProvider;
    this.elevationOverlayProvider = ((ElevationOverlayProvider)localObject);
    f = paramMaterialShapeDrawableState.strokeWidth;
    this.strokeWidth = f;
    localObject = paramMaterialShapeDrawableState.colorFilter;
    this.colorFilter = ((ColorFilter)localObject);
    localObject = paramMaterialShapeDrawableState.fillColor;
    this.fillColor = ((ColorStateList)localObject);
    localObject = paramMaterialShapeDrawableState.strokeColor;
    this.strokeColor = ((ColorStateList)localObject);
    localObject = paramMaterialShapeDrawableState.tintMode;
    this.tintMode = ((PorterDuff.Mode)localObject);
    localObject = paramMaterialShapeDrawableState.tintList;
    this.tintList = ((ColorStateList)localObject);
    int i = paramMaterialShapeDrawableState.alpha;
    this.alpha = i;
    f = paramMaterialShapeDrawableState.scale;
    this.scale = f;
    i = paramMaterialShapeDrawableState.shadowCompatOffset;
    this.shadowCompatOffset = i;
    i = paramMaterialShapeDrawableState.shadowCompatMode;
    this.shadowCompatMode = i;
    boolean bool = paramMaterialShapeDrawableState.useTintColorForShadow;
    this.useTintColorForShadow = bool;
    f = paramMaterialShapeDrawableState.interpolation;
    this.interpolation = f;
    f = paramMaterialShapeDrawableState.parentAbsoluteElevation;
    this.parentAbsoluteElevation = f;
    f = paramMaterialShapeDrawableState.elevation;
    this.elevation = f;
    f = paramMaterialShapeDrawableState.translationZ;
    this.translationZ = f;
    int j = paramMaterialShapeDrawableState.shadowCompatRadius;
    this.shadowCompatRadius = j;
    j = paramMaterialShapeDrawableState.shadowCompatRotation;
    this.shadowCompatRotation = j;
    localObject = paramMaterialShapeDrawableState.strokeTintList;
    this.strokeTintList = ((ColorStateList)localObject);
    localObject = paramMaterialShapeDrawableState.paintStyle;
    this.paintStyle = ((Paint.Style)localObject);
    localObject = paramMaterialShapeDrawableState.padding;
    if (localObject != null)
    {
      localObject = new android/graphics/Rect;
      paramMaterialShapeDrawableState = paramMaterialShapeDrawableState.padding;
      ((Rect)localObject).<init>(paramMaterialShapeDrawableState);
      this.padding = ((Rect)localObject);
    }
  }
  
  public MaterialShapeDrawable$MaterialShapeDrawableState(ShapeAppearanceModel paramShapeAppearanceModel, ElevationOverlayProvider paramElevationOverlayProvider)
  {
    PorterDuff.Mode localMode = PorterDuff.Mode.SRC_IN;
    this.tintMode = localMode;
    this.padding = null;
    float f = 1.0F;
    this.scale = f;
    this.interpolation = f;
    this.alpha = 255;
    this.parentAbsoluteElevation = 0.0F;
    this.elevation = 0.0F;
    this.translationZ = 0.0F;
    this.shadowCompatMode = 0;
    this.shadowCompatRadius = 0;
    this.shadowCompatOffset = 0;
    this.shadowCompatRotation = 0;
    this.useTintColorForShadow = false;
    Paint.Style localStyle = Paint.Style.FILL_AND_STROKE;
    this.paintStyle = localStyle;
    this.shapeAppearanceModel = paramShapeAppearanceModel;
    this.elevationOverlayProvider = paramElevationOverlayProvider;
  }
  
  public int getChangingConfigurations()
  {
    return 0;
  }
  
  public Drawable newDrawable()
  {
    MaterialShapeDrawable localMaterialShapeDrawable = new com/google/android/material/shape/MaterialShapeDrawable;
    localMaterialShapeDrawable.<init>(this);
    MaterialShapeDrawable.access$302(localMaterialShapeDrawable, true);
    return localMaterialShapeDrawable;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.shape.MaterialShapeDrawable.MaterialShapeDrawableState
 * JD-Core Version:    0.7.0.1
 */