package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.MenuItemImpl;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ToolbarUtils
{
  private static final Comparator VIEW_TOP_COMPARATOR;
  
  static
  {
    ToolbarUtils.1 local1 = new com/google/android/material/internal/ToolbarUtils$1;
    local1.<init>();
    VIEW_TOP_COMPARATOR = local1;
  }
  
  public static ActionMenuItemView getActionMenuItemView(Toolbar paramToolbar, int paramInt)
  {
    paramToolbar = getActionMenuView(paramToolbar);
    if (paramToolbar != null)
    {
      int i = 0;
      for (;;)
      {
        int j = paramToolbar.getChildCount();
        if (i >= j) {
          break;
        }
        Object localObject = paramToolbar.getChildAt(i);
        boolean bool = localObject instanceof ActionMenuItemView;
        if (bool)
        {
          localObject = (ActionMenuItemView)localObject;
          MenuItemImpl localMenuItemImpl = ((ActionMenuItemView)localObject).getItemData();
          int k = localMenuItemImpl.getItemId();
          if (k == paramInt) {
            return localObject;
          }
        }
        i += 1;
      }
    }
    return null;
  }
  
  public static ActionMenuView getActionMenuView(Toolbar paramToolbar)
  {
    int i = 0;
    for (;;)
    {
      int j = paramToolbar.getChildCount();
      if (i >= j) {
        break;
      }
      View localView = paramToolbar.getChildAt(i);
      boolean bool = localView instanceof ActionMenuView;
      if (bool) {
        return (ActionMenuView)localView;
      }
      i += 1;
    }
    return null;
  }
  
  private static ImageView getImageView(Toolbar paramToolbar, Drawable paramDrawable)
  {
    if (paramDrawable == null) {
      return null;
    }
    int i = 0;
    for (;;)
    {
      int j = paramToolbar.getChildCount();
      if (i >= j) {
        break;
      }
      Object localObject1 = paramToolbar.getChildAt(i);
      boolean bool = localObject1 instanceof ImageView;
      if (bool)
      {
        localObject1 = (ImageView)localObject1;
        Object localObject2 = ((ImageView)localObject1).getDrawable();
        if (localObject2 != null)
        {
          Drawable.ConstantState localConstantState = ((Drawable)localObject2).getConstantState();
          if (localConstantState != null)
          {
            localObject2 = ((Drawable)localObject2).getConstantState();
            localConstantState = paramDrawable.getConstantState();
            bool = localObject2.equals(localConstantState);
            if (bool) {
              return localObject1;
            }
          }
        }
      }
      i += 1;
    }
    return null;
  }
  
  public static ImageView getLogoImageView(Toolbar paramToolbar)
  {
    Drawable localDrawable = paramToolbar.getLogo();
    return getImageView(paramToolbar, localDrawable);
  }
  
  public static ImageButton getNavigationIconButton(Toolbar paramToolbar)
  {
    Drawable localDrawable1 = paramToolbar.getNavigationIcon();
    if (localDrawable1 == null) {
      return null;
    }
    int i = 0;
    for (;;)
    {
      int j = paramToolbar.getChildCount();
      if (i >= j) {
        break;
      }
      Object localObject = paramToolbar.getChildAt(i);
      boolean bool = localObject instanceof ImageButton;
      if (bool)
      {
        localObject = (ImageButton)localObject;
        Drawable localDrawable2 = ((ImageView)localObject).getDrawable();
        if (localDrawable2 == localDrawable1) {
          return localObject;
        }
      }
      i += 1;
    }
    return null;
  }
  
  public static View getSecondaryActionMenuItemView(Toolbar paramToolbar)
  {
    paramToolbar = getActionMenuView(paramToolbar);
    if (paramToolbar != null)
    {
      int i = paramToolbar.getChildCount();
      int j = 1;
      if (i > j) {
        return paramToolbar.getChildAt(0);
      }
    }
    return null;
  }
  
  public static TextView getSubtitleTextView(Toolbar paramToolbar)
  {
    Object localObject = paramToolbar.getSubtitle();
    paramToolbar = getTextViewsWithText(paramToolbar, (CharSequence)localObject);
    boolean bool = paramToolbar.isEmpty();
    if (bool)
    {
      paramToolbar = null;
    }
    else
    {
      localObject = VIEW_TOP_COMPARATOR;
      paramToolbar = (TextView)Collections.max(paramToolbar, (Comparator)localObject);
    }
    return paramToolbar;
  }
  
  private static List getTextViewsWithText(Toolbar paramToolbar, CharSequence paramCharSequence)
  {
    ArrayList localArrayList = new java/util/ArrayList;
    localArrayList.<init>();
    int i = 0;
    for (;;)
    {
      int j = paramToolbar.getChildCount();
      if (i >= j) {
        break;
      }
      Object localObject = paramToolbar.getChildAt(i);
      boolean bool = localObject instanceof TextView;
      if (bool)
      {
        localObject = (TextView)localObject;
        CharSequence localCharSequence = ((TextView)localObject).getText();
        bool = TextUtils.equals(localCharSequence, paramCharSequence);
        if (bool) {
          localArrayList.add(localObject);
        }
      }
      i += 1;
    }
    return localArrayList;
  }
  
  public static TextView getTitleTextView(Toolbar paramToolbar)
  {
    Object localObject = paramToolbar.getTitle();
    paramToolbar = getTextViewsWithText(paramToolbar, (CharSequence)localObject);
    boolean bool = paramToolbar.isEmpty();
    if (bool)
    {
      paramToolbar = null;
    }
    else
    {
      localObject = VIEW_TOP_COMPARATOR;
      paramToolbar = (TextView)Collections.min(paramToolbar, (Comparator)localObject);
    }
    return paramToolbar;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.ToolbarUtils
 * JD-Core Version:    0.7.0.1
 */