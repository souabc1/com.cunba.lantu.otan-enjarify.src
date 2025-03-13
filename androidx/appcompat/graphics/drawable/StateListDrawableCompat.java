package androidx.appcompat.graphics.drawable;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;

public class StateListDrawableCompat
  extends DrawableContainerCompat
{
  public boolean o00o000;
  public StateListDrawableCompat.StateListState o00o0000;
  
  public StateListDrawableCompat()
  {
    this(null, null);
  }
  
  public StateListDrawableCompat(StateListDrawableCompat.StateListState paramStateListState)
  {
    if (paramStateListState != null) {
      setConstantState(paramStateListState);
    }
  }
  
  public StateListDrawableCompat(StateListDrawableCompat.StateListState paramStateListState, Resources paramResources)
  {
    StateListDrawableCompat.StateListState localStateListState = new androidx/appcompat/graphics/drawable/StateListDrawableCompat$StateListState;
    localStateListState.<init>(paramStateListState, this, paramResources);
    setConstantState(localStateListState);
    paramStateListState = getState();
    onStateChange(paramStateListState);
  }
  
  public int[] OooO(AttributeSet paramAttributeSet)
  {
    int i = paramAttributeSet.getAttributeCount();
    int[] arrayOfInt = new int[i];
    int j = 0;
    int k = 0;
    while (j < i)
    {
      int m = paramAttributeSet.getAttributeNameResource(j);
      if (m != 0)
      {
        int n = 16842960;
        if (m != n)
        {
          n = 16843161;
          if (m != n)
          {
            n = k + 1;
            boolean bool = paramAttributeSet.getAttributeBooleanValue(j, false);
            if (!bool) {
              m = -m;
            }
            arrayOfInt[k] = m;
            k = n;
          }
        }
      }
      j += 1;
    }
    return StateSet.trimStateSet(arrayOfInt, k);
  }
  
  public StateListDrawableCompat.StateListState OooO0oo()
  {
    StateListDrawableCompat.StateListState localStateListState1 = new androidx/appcompat/graphics/drawable/StateListDrawableCompat$StateListState;
    StateListDrawableCompat.StateListState localStateListState2 = this.o00o0000;
    localStateListState1.<init>(localStateListState2, this, null);
    return localStateListState1;
  }
  
  public void applyTheme(Resources.Theme paramTheme)
  {
    super.applyTheme(paramTheme);
    paramTheme = getState();
    onStateChange(paramTheme);
  }
  
  public int getStateCount()
  {
    return this.o00o0000.getChildCount();
  }
  
  public Drawable getStateDrawable(int paramInt)
  {
    return this.o00o0000.getChild(paramInt);
  }
  
  public StateListDrawableCompat.StateListState getStateListState()
  {
    return this.o00o0000;
  }
  
  public int[] getStateSet(int paramInt)
  {
    return this.o00o0000.Oooo0O0[paramInt];
  }
  
  public boolean isStateful()
  {
    return true;
  }
  
  public Drawable mutate()
  {
    boolean bool = this.o00o000;
    if (!bool)
    {
      Object localObject = super.mutate();
      if (localObject == this)
      {
        localObject = this.o00o0000;
        ((StateListDrawableCompat.StateListState)localObject).OooO0oo();
        bool = true;
        this.o00o000 = bool;
      }
    }
    return this;
  }
  
  public boolean onStateChange(int[] paramArrayOfInt)
  {
    boolean bool1 = super.onStateChange(paramArrayOfInt);
    Object localObject = this.o00o0000;
    int i = ((StateListDrawableCompat.StateListState)localObject).OooOOO0(paramArrayOfInt);
    if (i < 0)
    {
      paramArrayOfInt = this.o00o0000;
      localObject = StateSet.WILD_CARD;
      i = paramArrayOfInt.OooOOO0((int[])localObject);
    }
    boolean bool2 = OooO0o(i);
    if ((!bool2) && (!bool1))
    {
      bool2 = false;
      paramArrayOfInt = null;
    }
    else
    {
      bool2 = true;
    }
    return bool2;
  }
  
  public void setConstantState(DrawableContainerCompat.DrawableContainerState paramDrawableContainerState)
  {
    super.setConstantState(paramDrawableContainerState);
    boolean bool = paramDrawableContainerState instanceof StateListDrawableCompat.StateListState;
    if (bool)
    {
      paramDrawableContainerState = (StateListDrawableCompat.StateListState)paramDrawableContainerState;
      this.o00o0000 = paramDrawableContainerState;
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.graphics.drawable.StateListDrawableCompat
 * JD-Core Version:    0.7.0.1
 */