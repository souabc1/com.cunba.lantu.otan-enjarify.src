package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.widget.TextView;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.styleable;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearanceModel.Builder;
import m54207b69;

final class CalendarItemStyle
{
  private final ColorStateList backgroundColor;
  private final Rect insets;
  private final ShapeAppearanceModel itemShape;
  private final ColorStateList strokeColor;
  private final int strokeWidth;
  private final ColorStateList textColor;
  
  private CalendarItemStyle(ColorStateList paramColorStateList1, ColorStateList paramColorStateList2, ColorStateList paramColorStateList3, int paramInt, ShapeAppearanceModel paramShapeAppearanceModel, Rect paramRect)
  {
    Preconditions.OooO0o0(paramRect.left);
    Preconditions.OooO0o0(paramRect.top);
    Preconditions.OooO0o0(paramRect.right);
    Preconditions.OooO0o0(paramRect.bottom);
    this.insets = paramRect;
    this.textColor = paramColorStateList2;
    this.backgroundColor = paramColorStateList1;
    this.strokeColor = paramColorStateList3;
    this.strokeWidth = paramInt;
    this.itemShape = paramShapeAppearanceModel;
  }
  
  public static CalendarItemStyle create(Context paramContext, int paramInt)
  {
    int i = 0;
    boolean bool;
    if (paramInt != 0)
    {
      bool = true;
    }
    else
    {
      bool = false;
      arrayOfInt = null;
    }
    String str = m54207b69.F54207b69_11("W87B5A58595B511E6252666357692567278B6A66706A716F618965777087695F737D39717470753E804074766C808A988C7BA28E4B8B934E3F");
    Preconditions.OooO0O0(bool, str);
    int[] arrayOfInt = R.styleable.MaterialCalendarItem;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramInt, arrayOfInt);
    int j = R.styleable.MaterialCalendarItem_android_insetLeft;
    j = localTypedArray.getDimensionPixelOffset(j, 0);
    int k = R.styleable.MaterialCalendarItem_android_insetTop;
    k = localTypedArray.getDimensionPixelOffset(k, 0);
    int m = R.styleable.MaterialCalendarItem_android_insetRight;
    m = localTypedArray.getDimensionPixelOffset(m, 0);
    int n = R.styleable.MaterialCalendarItem_android_insetBottom;
    n = localTypedArray.getDimensionPixelOffset(n, 0);
    Rect localRect = new android/graphics/Rect;
    localRect.<init>(j, k, m, n);
    j = R.styleable.MaterialCalendarItem_itemFillColor;
    ColorStateList localColorStateList1 = MaterialResources.getColorStateList(paramContext, localTypedArray, j);
    j = R.styleable.MaterialCalendarItem_itemTextColor;
    ColorStateList localColorStateList2 = MaterialResources.getColorStateList(paramContext, localTypedArray, j);
    j = R.styleable.MaterialCalendarItem_itemStrokeColor;
    ColorStateList localColorStateList3 = MaterialResources.getColorStateList(paramContext, localTypedArray, j);
    j = R.styleable.MaterialCalendarItem_itemStrokeWidth;
    int i1 = localTypedArray.getDimensionPixelSize(j, 0);
    j = R.styleable.MaterialCalendarItem_itemShapeAppearance;
    j = localTypedArray.getResourceId(j, 0);
    k = R.styleable.MaterialCalendarItem_itemShapeAppearanceOverlay;
    i = localTypedArray.getResourceId(k, 0);
    ShapeAppearanceModel localShapeAppearanceModel = ShapeAppearanceModel.builder(paramContext, j, i).build();
    localTypedArray.recycle();
    paramContext = new com/google/android/material/datepicker/CalendarItemStyle;
    paramContext.<init>(localColorStateList1, localColorStateList2, localColorStateList3, i1, localShapeAppearanceModel, localRect);
    return paramContext;
  }
  
  public int getBottomInset()
  {
    return this.insets.bottom;
  }
  
  public int getLeftInset()
  {
    return this.insets.left;
  }
  
  public int getRightInset()
  {
    return this.insets.right;
  }
  
  public int getTopInset()
  {
    return this.insets.top;
  }
  
  public void styleItem(TextView paramTextView)
  {
    styleItem(paramTextView, null);
  }
  
  public void styleItem(TextView paramTextView, ColorStateList paramColorStateList)
  {
    Object localObject1 = new com/google/android/material/shape/MaterialShapeDrawable;
    ((MaterialShapeDrawable)localObject1).<init>();
    MaterialShapeDrawable localMaterialShapeDrawable = new com/google/android/material/shape/MaterialShapeDrawable;
    localMaterialShapeDrawable.<init>();
    Object localObject2 = this.itemShape;
    ((MaterialShapeDrawable)localObject1).setShapeAppearanceModel((ShapeAppearanceModel)localObject2);
    localObject2 = this.itemShape;
    localMaterialShapeDrawable.setShapeAppearanceModel((ShapeAppearanceModel)localObject2);
    if (paramColorStateList == null) {
      paramColorStateList = this.backgroundColor;
    }
    ((MaterialShapeDrawable)localObject1).setFillColor(paramColorStateList);
    float f = this.strokeWidth;
    localObject2 = this.strokeColor;
    ((MaterialShapeDrawable)localObject1).setStroke(f, (ColorStateList)localObject2);
    paramColorStateList = this.textColor;
    paramTextView.setTextColor(paramColorStateList);
    RippleDrawable localRippleDrawable = new android/graphics/drawable/RippleDrawable;
    paramColorStateList = this.textColor.withAlpha(30);
    localRippleDrawable.<init>(paramColorStateList, (Drawable)localObject1, localMaterialShapeDrawable);
    paramColorStateList = new android/graphics/drawable/InsetDrawable;
    localObject1 = this.insets;
    int i = ((Rect)localObject1).left;
    int j = ((Rect)localObject1).top;
    int k = ((Rect)localObject1).right;
    int m = ((Rect)localObject1).bottom;
    localObject2 = paramColorStateList;
    paramColorStateList.<init>(localRippleDrawable, i, j, k, m);
    ViewCompat.o0ooOoO(paramTextView, paramColorStateList);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.CalendarItemStyle
 * JD-Core Version:    0.7.0.1
 */