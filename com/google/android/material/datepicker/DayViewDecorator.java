package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;

public abstract class DayViewDecorator
  implements Parcelable
{
  public ColorStateList getBackgroundColor(Context paramContext, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    return null;
  }
  
  public Drawable getCompoundDrawableBottom(Context paramContext, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    return null;
  }
  
  public Drawable getCompoundDrawableLeft(Context paramContext, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    return null;
  }
  
  public Drawable getCompoundDrawableRight(Context paramContext, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    return null;
  }
  
  public Drawable getCompoundDrawableTop(Context paramContext, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2)
  {
    return null;
  }
  
  public CharSequence getContentDescription(Context paramContext, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, CharSequence paramCharSequence)
  {
    return paramCharSequence;
  }
  
  public void initialize(Context paramContext) {}
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.datepicker.DayViewDecorator
 * JD-Core Version:    0.7.0.1
 */