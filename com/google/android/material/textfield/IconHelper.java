package com.google.android.material.textfield;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Arrays;

class IconHelper
{
  public static void applyIconTint(TextInputLayout paramTextInputLayout, CheckableImageButton paramCheckableImageButton, ColorStateList paramColorStateList, PorterDuff.Mode paramMode)
  {
    Drawable localDrawable = paramCheckableImageButton.getDrawable();
    if (localDrawable != null)
    {
      localDrawable = DrawableCompat.OooOOo(localDrawable).mutate();
      if (paramColorStateList != null)
      {
        boolean bool = paramColorStateList.isStateful();
        if (bool)
        {
          paramTextInputLayout = mergeIconState(paramTextInputLayout, paramCheckableImageButton);
          int i = paramColorStateList.getDefaultColor();
          int j = paramColorStateList.getColorForState(paramTextInputLayout, i);
          paramTextInputLayout = ColorStateList.valueOf(j);
          DrawableCompat.OooOOOO(localDrawable, paramTextInputLayout);
          break label78;
        }
      }
      DrawableCompat.OooOOOO(localDrawable, paramColorStateList);
      label78:
      if (paramMode != null) {
        DrawableCompat.OooOOOo(localDrawable, paramMode);
      }
    }
    paramTextInputLayout = paramCheckableImageButton.getDrawable();
    if (paramTextInputLayout != localDrawable) {
      paramCheckableImageButton.setImageDrawable(localDrawable);
    }
  }
  
  public static ImageView.ScaleType convertScaleType(int paramInt)
  {
    if (paramInt != 0)
    {
      int i = 1;
      if (paramInt != i)
      {
        i = 2;
        if (paramInt != i)
        {
          i = 3;
          if (paramInt != i)
          {
            i = 5;
            if (paramInt != i)
            {
              i = 6;
              if (paramInt != i) {
                return ImageView.ScaleType.CENTER;
              }
              return ImageView.ScaleType.CENTER_INSIDE;
            }
            return ImageView.ScaleType.CENTER_CROP;
          }
          return ImageView.ScaleType.FIT_END;
        }
        return ImageView.ScaleType.FIT_CENTER;
      }
      return ImageView.ScaleType.FIT_START;
    }
    return ImageView.ScaleType.FIT_XY;
  }
  
  private static int[] mergeIconState(TextInputLayout paramTextInputLayout, CheckableImageButton paramCheckableImageButton)
  {
    paramTextInputLayout = paramTextInputLayout.getDrawableState();
    paramCheckableImageButton = paramCheckableImageButton.getDrawableState();
    int i = paramTextInputLayout.length;
    int j = paramTextInputLayout.length;
    int k = paramCheckableImageButton.length;
    j += k;
    paramTextInputLayout = Arrays.copyOf(paramTextInputLayout, j);
    k = paramCheckableImageButton.length;
    System.arraycopy(paramCheckableImageButton, 0, paramTextInputLayout, i, k);
    return paramTextInputLayout;
  }
  
  public static void refreshIconDrawableState(TextInputLayout paramTextInputLayout, CheckableImageButton paramCheckableImageButton, ColorStateList paramColorStateList)
  {
    Drawable localDrawable1 = paramCheckableImageButton.getDrawable();
    Drawable localDrawable2 = paramCheckableImageButton.getDrawable();
    if ((localDrawable2 != null) && (paramColorStateList != null))
    {
      boolean bool = paramColorStateList.isStateful();
      if (bool)
      {
        paramTextInputLayout = mergeIconState(paramTextInputLayout, paramCheckableImageButton);
        int i = paramColorStateList.getDefaultColor();
        int j = paramColorStateList.getColorForState(paramTextInputLayout, i);
        paramColorStateList = DrawableCompat.OooOOo(localDrawable1).mutate();
        paramTextInputLayout = ColorStateList.valueOf(j);
        DrawableCompat.OooOOOO(paramColorStateList, paramTextInputLayout);
        paramCheckableImageButton.setImageDrawable(paramColorStateList);
      }
    }
  }
  
  public static void setCompatRippleBackgroundIfNeeded(CheckableImageButton paramCheckableImageButton) {}
  
  private static void setIconClickable(CheckableImageButton paramCheckableImageButton, View.OnLongClickListener paramOnLongClickListener)
  {
    boolean bool1 = ViewCompat.OoooO0(paramCheckableImageButton);
    boolean bool2 = false;
    int i = 1;
    int j;
    if (paramOnLongClickListener != null)
    {
      j = i;
    }
    else
    {
      j = 0;
      paramOnLongClickListener = null;
    }
    if ((bool1) || (j != 0)) {
      bool2 = i;
    }
    paramCheckableImageButton.setFocusable(bool2);
    paramCheckableImageButton.setClickable(bool1);
    paramCheckableImageButton.setPressable(bool1);
    paramCheckableImageButton.setLongClickable(j);
    if (!bool2) {
      i = 2;
    }
    ViewCompat.o000000(paramCheckableImageButton, i);
  }
  
  public static void setIconMinSize(CheckableImageButton paramCheckableImageButton, int paramInt)
  {
    paramCheckableImageButton.setMinimumWidth(paramInt);
    paramCheckableImageButton.setMinimumHeight(paramInt);
  }
  
  public static void setIconOnClickListener(CheckableImageButton paramCheckableImageButton, View.OnClickListener paramOnClickListener, View.OnLongClickListener paramOnLongClickListener)
  {
    paramCheckableImageButton.setOnClickListener(paramOnClickListener);
    setIconClickable(paramCheckableImageButton, paramOnLongClickListener);
  }
  
  public static void setIconOnLongClickListener(CheckableImageButton paramCheckableImageButton, View.OnLongClickListener paramOnLongClickListener)
  {
    paramCheckableImageButton.setOnLongClickListener(paramOnLongClickListener);
    setIconClickable(paramCheckableImageButton, paramOnLongClickListener);
  }
  
  public static void setIconScaleType(CheckableImageButton paramCheckableImageButton, ImageView.ScaleType paramScaleType)
  {
    paramCheckableImageButton.setScaleType(paramScaleType);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.textfield.IconHelper
 * JD-Core Version:    0.7.0.1
 */