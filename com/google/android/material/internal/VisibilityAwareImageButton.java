package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;

public class VisibilityAwareImageButton
  extends ImageButton
{
  private int userSetVisibility;
  
  public VisibilityAwareImageButton(Context paramContext)
  {
    this(paramContext, null);
  }
  
  public VisibilityAwareImageButton(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
  }
  
  public VisibilityAwareImageButton(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    int i = getVisibility();
    this.userSetVisibility = i;
  }
  
  public final int getUserSetVisibility()
  {
    return this.userSetVisibility;
  }
  
  public final void internalSetVisibility(int paramInt, boolean paramBoolean)
  {
    super.setVisibility(paramInt);
    if (paramBoolean) {
      this.userSetVisibility = paramInt;
    }
  }
  
  public void setVisibility(int paramInt)
  {
    internalSetVisibility(paramInt, true);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.VisibilityAwareImageButton
 * JD-Core Version:    0.7.0.1
 */