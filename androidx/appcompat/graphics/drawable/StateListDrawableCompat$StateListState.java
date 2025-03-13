package androidx.appcompat.graphics.drawable;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.StateSet;

class StateListDrawableCompat$StateListState
  extends DrawableContainerCompat.DrawableContainerState
{
  public int[][] Oooo0O0;
  
  public StateListDrawableCompat$StateListState(StateListState paramStateListState, StateListDrawableCompat paramStateListDrawableCompat, Resources paramResources)
  {
    super(paramStateListState, paramStateListDrawableCompat, paramResources);
    if (paramStateListState != null)
    {
      paramStateListState = paramStateListState.Oooo0O0;
      this.Oooo0O0 = paramStateListState;
    }
    else
    {
      int i = getCapacity();
      paramStateListState = new int[i][];
      this.Oooo0O0 = paramStateListState;
    }
  }
  
  public void OooO0o(int paramInt1, int paramInt2)
  {
    super.OooO0o(paramInt1, paramInt2);
    int[][] arrayOfInt = new int[paramInt2][];
    System.arraycopy(this.Oooo0O0, 0, arrayOfInt, 0, paramInt1);
    this.Oooo0O0 = arrayOfInt;
  }
  
  public void OooO0oo()
  {
    int[][] arrayOfInt = this.Oooo0O0;
    int i = arrayOfInt.length;
    int[][] arrayOfInt1 = new int[i][];
    int j = arrayOfInt.length + -1;
    while (j >= 0)
    {
      int[] arrayOfInt2 = this.Oooo0O0[j];
      if (arrayOfInt2 != null) {
        arrayOfInt2 = (int[])arrayOfInt2.clone();
      } else {
        arrayOfInt2 = null;
      }
      arrayOfInt1[j] = arrayOfInt2;
      j += -1;
    }
    this.Oooo0O0 = arrayOfInt1;
  }
  
  public int OooOO0o(int[] paramArrayOfInt, Drawable paramDrawable)
  {
    int i = OooO00o(paramDrawable);
    this.Oooo0O0[i] = paramArrayOfInt;
    return i;
  }
  
  public int OooOOO0(int[] paramArrayOfInt)
  {
    int[][] arrayOfInt = this.Oooo0O0;
    int i = getChildCount();
    int j = 0;
    while (j < i)
    {
      int[] arrayOfInt1 = arrayOfInt[j];
      boolean bool = StateSet.stateSetMatches(arrayOfInt1, paramArrayOfInt);
      if (bool) {
        return j;
      }
      j += 1;
    }
    return -1;
  }
  
  public Drawable newDrawable()
  {
    StateListDrawableCompat localStateListDrawableCompat = new androidx/appcompat/graphics/drawable/StateListDrawableCompat;
    localStateListDrawableCompat.<init>(this, null);
    return localStateListDrawableCompat;
  }
  
  public Drawable newDrawable(Resources paramResources)
  {
    StateListDrawableCompat localStateListDrawableCompat = new androidx/appcompat/graphics/drawable/StateListDrawableCompat;
    localStateListDrawableCompat.<init>(this, paramResources);
    return localStateListDrawableCompat;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.graphics.drawable.StateListDrawableCompat.StateListState
 * JD-Core Version:    0.7.0.1
 */