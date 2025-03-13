package com.google.android.material.animation;

import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.R.id;
import m54207b69;

public class ChildrenAlphaProperty
  extends Property
{
  public static final Property CHILDREN_ALPHA;
  
  static
  {
    ChildrenAlphaProperty localChildrenAlphaProperty = new com/google/android/material/animation/ChildrenAlphaProperty;
    String str = m54207b69.F54207b69_11("o*49434549525D554B734F644D57");
    localChildrenAlphaProperty.<init>(str);
    CHILDREN_ALPHA = localChildrenAlphaProperty;
  }
  
  private ChildrenAlphaProperty(String paramString)
  {
    super(Float.class, paramString);
  }
  
  public Float get(ViewGroup paramViewGroup)
  {
    int i = R.id.mtrl_internal_children_alpha_tag;
    paramViewGroup = (Float)paramViewGroup.getTag(i);
    if (paramViewGroup != null) {
      return paramViewGroup;
    }
    return Float.valueOf(1.0F);
  }
  
  public void set(ViewGroup paramViewGroup, Float paramFloat)
  {
    float f = paramFloat.floatValue();
    int i = R.id.mtrl_internal_children_alpha_tag;
    Float localFloat = Float.valueOf(f);
    paramViewGroup.setTag(i, localFloat);
    i = paramViewGroup.getChildCount();
    int j = 0;
    localFloat = null;
    while (j < i)
    {
      View localView = paramViewGroup.getChildAt(j);
      localView.setAlpha(f);
      j += 1;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.animation.ChildrenAlphaProperty
 * JD-Core Version:    0.7.0.1
 */