package com.google.android.material.animation;

import android.graphics.drawable.Drawable;
import android.util.Property;
import java.util.WeakHashMap;

public class DrawableAlphaProperty
  extends Property
{
  public static final Property DRAWABLE_ALPHA_COMPAT;
  private final WeakHashMap alphaCache;
  
  static
  {
    DrawableAlphaProperty localDrawableAlphaProperty = new com/google/android/material/animation/DrawableAlphaProperty;
    localDrawableAlphaProperty.<init>();
    DRAWABLE_ALPHA_COMPAT = localDrawableAlphaProperty;
  }
  
  private DrawableAlphaProperty()
  {
    super(Integer.class, str);
    WeakHashMap localWeakHashMap = new java/util/WeakHashMap;
    localWeakHashMap.<init>();
    this.alphaCache = localWeakHashMap;
  }
  
  public Integer get(Drawable paramDrawable)
  {
    return Integer.valueOf(paramDrawable.getAlpha());
  }
  
  public void set(Drawable paramDrawable, Integer paramInteger)
  {
    int i = paramInteger.intValue();
    paramDrawable.setAlpha(i);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.animation.DrawableAlphaProperty
 * JD-Core Version:    0.7.0.1
 */