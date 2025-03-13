package com.google.android.material.divider;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import androidx.core.content.ContextCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R.dimen;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;

public class MaterialDivider
  extends View
{
  private static final int DEF_STYLE_RES = R.style.Widget_MaterialComponents_MaterialDivider;
  private int color;
  private final MaterialShapeDrawable dividerDrawable;
  private int insetEnd;
  private int insetStart;
  private int thickness;
  
  public MaterialDivider(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public MaterialDivider(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, i);
  }
  
  public MaterialDivider(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    paramContext = getContext();
    Object localObject = new com/google/android/material/shape/MaterialShapeDrawable;
    ((MaterialShapeDrawable)localObject).<init>();
    this.dividerDrawable = ((MaterialShapeDrawable)localObject);
    int[] arrayOfInt1 = R.styleable.MaterialDivider;
    int[] arrayOfInt2 = new int[0];
    localObject = paramContext;
    paramAttributeSet = ThemeEnforcement.obtainStyledAttributes(paramContext, paramAttributeSet, arrayOfInt1, paramInt, i, arrayOfInt2);
    paramInt = R.styleable.MaterialDivider_dividerThickness;
    localObject = getResources();
    int j = R.dimen.material_divider_thickness;
    int k = ((Resources)localObject).getDimensionPixelSize(j);
    paramInt = paramAttributeSet.getDimensionPixelSize(paramInt, k);
    this.thickness = paramInt;
    paramInt = R.styleable.MaterialDivider_dividerInsetStart;
    paramInt = paramAttributeSet.getDimensionPixelOffset(paramInt, 0);
    this.insetStart = paramInt;
    paramInt = R.styleable.MaterialDivider_dividerInsetEnd;
    paramInt = paramAttributeSet.getDimensionPixelOffset(paramInt, 0);
    this.insetEnd = paramInt;
    paramInt = R.styleable.MaterialDivider_dividerColor;
    int m = MaterialResources.getColorStateList(paramContext, paramAttributeSet, paramInt).getDefaultColor();
    setDividerColor(m);
    paramAttributeSet.recycle();
  }
  
  public int getDividerColor()
  {
    return this.color;
  }
  
  public int getDividerInsetEnd()
  {
    return this.insetEnd;
  }
  
  public int getDividerInsetStart()
  {
    return this.insetStart;
  }
  
  public int getDividerThickness()
  {
    return this.thickness;
  }
  
  public void onDraw(Canvas paramCanvas)
  {
    super.onDraw(paramCanvas);
    int i = ViewCompat.OooOoOO(this);
    int j = 1;
    if (i != j) {
      j = 0;
    }
    if (j != 0) {
      i = this.insetEnd;
    } else {
      i = this.insetStart;
    }
    int k;
    if (j != 0)
    {
      j = getWidth();
      k = this.insetStart;
    }
    else
    {
      j = getWidth();
      k = this.insetEnd;
    }
    j -= k;
    MaterialShapeDrawable localMaterialShapeDrawable = this.dividerDrawable;
    int m = getBottom();
    int n = getTop();
    m -= n;
    localMaterialShapeDrawable.setBounds(i, 0, j, m);
    this.dividerDrawable.draw(paramCanvas);
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    paramInt1 = View.MeasureSpec.getMode(paramInt2);
    paramInt2 = getMeasuredHeight();
    int i = -1 << -1;
    if ((paramInt1 == i) || (paramInt1 == 0))
    {
      paramInt1 = this.thickness;
      if ((paramInt1 > 0) && (paramInt2 != paramInt1)) {
        paramInt2 = paramInt1;
      }
      paramInt1 = getMeasuredWidth();
      setMeasuredDimension(paramInt1, paramInt2);
    }
  }
  
  public void setDividerColor(int paramInt)
  {
    int i = this.color;
    if (i != paramInt)
    {
      this.color = paramInt;
      MaterialShapeDrawable localMaterialShapeDrawable = this.dividerDrawable;
      ColorStateList localColorStateList = ColorStateList.valueOf(paramInt);
      localMaterialShapeDrawable.setFillColor(localColorStateList);
      invalidate();
    }
  }
  
  public void setDividerColorResource(int paramInt)
  {
    paramInt = ContextCompat.OooO0OO(getContext(), paramInt);
    setDividerColor(paramInt);
  }
  
  public void setDividerInsetEnd(int paramInt)
  {
    this.insetEnd = paramInt;
  }
  
  public void setDividerInsetEndResource(int paramInt)
  {
    paramInt = getContext().getResources().getDimensionPixelOffset(paramInt);
    setDividerInsetEnd(paramInt);
  }
  
  public void setDividerInsetStart(int paramInt)
  {
    this.insetStart = paramInt;
  }
  
  public void setDividerInsetStartResource(int paramInt)
  {
    paramInt = getContext().getResources().getDimensionPixelOffset(paramInt);
    setDividerInsetStart(paramInt);
  }
  
  public void setDividerThickness(int paramInt)
  {
    int i = this.thickness;
    if (i != paramInt)
    {
      this.thickness = paramInt;
      requestLayout();
    }
  }
  
  public void setDividerThicknessResource(int paramInt)
  {
    paramInt = getContext().getResources().getDimensionPixelSize(paramInt);
    setDividerThickness(paramInt);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.divider.MaterialDivider
 * JD-Core Version:    0.7.0.1
 */