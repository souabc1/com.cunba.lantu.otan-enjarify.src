package com.google.android.material.tabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.widget.TintTypedArray;
import com.google.android.material.R.styleable;

public class TabItem
  extends View
{
  public final int customLayout;
  public final Drawable icon;
  public final CharSequence text;
  
  public TabItem(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public TabItem(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int[] arrayOfInt = R.styleable.TabItem;
    paramContext = TintTypedArray.OooOOO(paramContext, paramAttributeSet, arrayOfInt);
    int i = R.styleable.TabItem_android_text;
    paramAttributeSet = paramContext.getText(i);
    this.text = paramAttributeSet;
    i = R.styleable.TabItem_android_icon;
    paramAttributeSet = paramContext.getDrawable(i);
    this.icon = paramAttributeSet;
    i = R.styleable.TabItem_android_layout;
    i = paramContext.OooOO0O(i, 0);
    this.customLayout = i;
    paramContext.OooOOOo();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.tabs.TabItem
 * JD-Core Version:    0.7.0.1
 */