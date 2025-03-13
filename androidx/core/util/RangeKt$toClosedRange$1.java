package androidx.core.util;

import android.util.Range;
import kotlin.ranges.ClosedRange;
import kotlin.ranges.ClosedRange.DefaultImpls;

public final class RangeKt$toClosedRange$1
  implements ClosedRange
{
  public Comparable getEndInclusive()
  {
    return this.o00OoOoo.getUpper();
  }
  
  public Comparable getStart()
  {
    return this.o00OoOoo.getLower();
  }
  
  public boolean isEmpty()
  {
    return ClosedRange.DefaultImpls.OooO00o(this);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.util.RangeKt.toClosedRange.1
 * JD-Core Version:    0.7.0.1
 */