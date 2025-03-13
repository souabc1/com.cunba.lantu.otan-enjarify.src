package androidx.customview.widget;

import android.graphics.Rect;
import java.util.Comparator;

class FocusStrategy$SequentialComparator
  implements Comparator
{
  public final Rect o00OoOoo;
  public final boolean o00Ooo0;
  public final Rect o00Ooo00;
  public final FocusStrategy.BoundsAdapter o00Ooo0O;
  
  public FocusStrategy$SequentialComparator(boolean paramBoolean, FocusStrategy.BoundsAdapter paramBoundsAdapter)
  {
    Rect localRect = new android/graphics/Rect;
    localRect.<init>();
    this.o00OoOoo = localRect;
    localRect = new android/graphics/Rect;
    localRect.<init>();
    this.o00Ooo00 = localRect;
    this.o00Ooo0 = paramBoolean;
    this.o00Ooo0O = paramBoundsAdapter;
  }
  
  public int compare(Object paramObject1, Object paramObject2)
  {
    Rect localRect1 = this.o00OoOoo;
    Rect localRect2 = this.o00Ooo00;
    FocusStrategy.BoundsAdapter localBoundsAdapter = this.o00Ooo0O;
    localBoundsAdapter.OooO00o(paramObject1, localRect1);
    paramObject1 = this.o00Ooo0O;
    paramObject1.OooO00o(paramObject2, localRect2);
    int i = localRect1.top;
    int n = localRect2.top;
    int i2 = -1;
    if (i < n) {
      return i2;
    }
    int i3 = 1;
    if (i > n) {
      return i3;
    }
    i = localRect1.left;
    n = localRect2.left;
    int j;
    if (i < n)
    {
      j = this.o00Ooo0;
      if (j != 0) {
        i2 = i3;
      }
      return i2;
    }
    if (j > n)
    {
      j = this.o00Ooo0;
      if (j == 0) {
        i2 = i3;
      }
      return i2;
    }
    int k = localRect1.bottom;
    int i1 = localRect2.bottom;
    if (k < i1) {
      return i2;
    }
    if (k > i1) {
      return i3;
    }
    k = localRect1.right;
    i1 = localRect2.right;
    int m;
    if (k < i1)
    {
      m = this.o00Ooo0;
      if (m != 0) {
        i2 = i3;
      }
      return i2;
    }
    if (m > i1)
    {
      m = this.o00Ooo0;
      if (m == 0) {
        i2 = i3;
      }
      return i2;
    }
    return 0;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.customview.widget.FocusStrategy.SequentialComparator
 * JD-Core Version:    0.7.0.1
 */