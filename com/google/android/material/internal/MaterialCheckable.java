package com.google.android.material.internal;

import android.widget.Checkable;

public abstract interface MaterialCheckable
  extends Checkable
{
  public abstract int getId();
  
  public abstract void setInternalOnCheckedChangeListener(MaterialCheckable.OnCheckedChangeListener paramOnCheckedChangeListener);
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.internal.MaterialCheckable
 * JD-Core Version:    0.7.0.1
 */